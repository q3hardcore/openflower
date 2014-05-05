package de.fernflower.main.decompiler;

import de.fernflower.main.DecompileFactory;
import de.fernflower.main.extern.IBytecodeProvider;
import de.fernflower.main.extern.IDecompilatSaver;
import de.fernflower.main.extern.IFernflowerLogger;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.StreamLogger;
import de.fernflower.main.util.Util;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ConsoleDecompiler implements IBytecodeProvider, IDecompilatSaver {

   private File output;
   private DecompileFactory b;
   private HashMap c;
   private HashMap d;


   public ConsoleDecompiler() {
      this((HashMap)null);
   }

   public ConsoleDecompiler(HashMap var1) {
      this(new StreamLogger(3, System.out), var1);
   }

   protected ConsoleDecompiler(IFernflowerLogger var1, HashMap var2) {
      this.c = new HashMap();
      this.d = new HashMap();
      this.b = new DecompileFactory(this, this, var2);
      Configuration.setLogger(var1);
   }

   public static void main(String[] var0) {
      try {
         if(var0 != null && var0.length > 1) {
            HashMap var1 = new HashMap();
            ArrayList var2 = new ArrayList();
            ArrayList var3 = new ArrayList();
            boolean var4 = true;

            String var6;
            for(int var5 = 0; var5 < var0.length - 1; ++var5) {
               var6 = var0[var5];
               if(var4 && var6.startsWith("-") && var6.length() > 5 && var6.charAt(4) == 61) {
                  String var7 = var6.substring(5);
                  if("TRUE".equalsIgnoreCase(var7)) {
                     var7 = "1";
                  } else if("FALSE".equalsIgnoreCase(var7)) {
                     var7 = "0";
                  }

                  var1.put(var6.substring(1, 4), var7);
               } else {
                  var4 = false;
                  if(var6.startsWith("-e=")) {
                     var3.add(var6.substring(3));
                  } else {
                     var2.add(var6);
                  }
               }
            }

            if(var2.isEmpty()) {
               printUsage();
            } else {
               ConsoleDecompiler var9 = new ConsoleDecompiler(new StreamLogger(2, System.out), var1);
               Iterator var10 = var2.iterator();

               while(var10.hasNext()) {
                  var6 = (String)var10.next();
                  var9.addSpace(new File(var6), true);
               }

               var10 = var3.iterator();

               while(var10.hasNext()) {
                  var6 = (String)var10.next();
                  var9.addSpace(new File(var6), false);
               }

               var9.decompileContext(new File(var0[var0.length - 1]));
            }
         } else {
            printUsage();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   private static void printUsage() {
      System.out.println("Usage: java ConsoleDecompiler ( -<option>=<value>)* (<source>)+ <destination>");
      System.out.println("Example: java ConsoleDecompiler -dgs=true c:\\mysource\\ c:\\my.jar d:\\decompiled\\");
   }

   public void addSpace(File var1, boolean var2) {
      this.b.getDispatcher().processFile(var1, var2);
   }

   public void decompileContext(File var1) {
      this.output = var1;
      this.b.a();
   }

   public InputStream getBytecodeStream(String var1, String var2) {
      try {
         File var5 = new File(var1);
         if(var2 == null) {
            return new FileInputStream(var5);
         }

         ZipFile var6;
         Enumeration var7 = (var6 = new ZipFile(var5)).entries();

         while(var7.hasMoreElements()) {
            ZipEntry var3;
            if((var3 = (ZipEntry)var7.nextElement()).getName().equals(var2)) {
               return var6.getInputStream(var3);
            }
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      return null;
   }

   private String outputPath(String var1) {
      return (new File(this.output, var1)).getAbsolutePath();
   }

   private boolean a(String var1, String var2) {
      HashSet var3;
      if((var3 = (HashSet)this.d.get(var1)) == null) {
         this.d.put(var1, var3 = new HashSet());
      }

      return var3.add(var2);
   }

   public void copyEntry(String var1, String var2, String var3, String var4) {
      try {
         String var5 = (new File(this.outputPath(var2), var3)).getAbsolutePath();
         if(!this.a(var5, var4)) {
            Configuration.getLogger().writeMessage("Zip entry already exists: " + var2 + "," + var3 + "," + var4, 3);
         } else {
            ZipFile var8;
            Enumeration var9 = (var8 = new ZipFile(new File(var1))).entries();

            while(var9.hasMoreElements()) {
               ZipEntry var10;
               if((var10 = (ZipEntry)var9.nextElement()).getName().equals(var4)) {
                  InputStream var11 = var8.getInputStream(var10);
                  ZipOutputStream var6;
                  (var6 = (ZipOutputStream)this.c.get(var5)).putNextEntry(new ZipEntry(var4));
                  Util.copyStream(var11, var6);
                  var11.close();
               }
            }

         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public void copyFile(String var1, String var2, String var3) {
      try {
         Util.copyFile(new File(var1), new File(this.outputPath(var2), var3));
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void saveFile(String var1, String var2, String var3) {
      try {
         BufferedWriter var5;
         (var5 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(this.outputPath(var1), var2)), "UTF8"))).write(var3);
         var5.flush();
         var5.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void createArchive(String var1, String var2, Manifest var3) {
      try {
         File var5;
         (var5 = new File(this.outputPath(var1), var2)).createNewFile();
         Object var6;
         if(var3 != null) {
            var6 = new JarOutputStream(new FileOutputStream(var5), var3);
         } else {
            var6 = new ZipOutputStream(new FileOutputStream(var5));
         }

         this.c.put(var5.getAbsolutePath(), var6);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void saveClassEntry(String var1, String var2, String var3, String var4, String var5) {
      this.saveEntry(var1, var2, var4, var5);
   }

   public void saveClassFile(String var1, String var2, String var3, String var4) {
      this.saveFile(var1, var3, var4);
   }

   public void saveEntry(String var1, String var2, String var3, String var4) {
      try {
         String var5 = (new File(this.outputPath(var1), var2)).getAbsolutePath();
         if(!this.a(var5, var3)) {
            Configuration.getLogger().writeMessage("Zip entry already exists: " + var1 + "," + var2 + "," + var3, 3);
            return;
         }

         ZipOutputStream var7;
         (var7 = (ZipOutputStream)this.c.get(var5)).putNextEntry(new ZipEntry(var3));
         if(var4 != null) {
            BufferedWriter var8;
            (var8 = new BufferedWriter(new OutputStreamWriter(var7, "UTF8"))).write(var4);
            var8.flush();
            return;
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public void saveFolder(String var1) {
      (new File(this.outputPath(var1))).mkdirs();
   }

   public void closeArchive(String var1, String var2) {
      try {
         var1 = (new File(this.outputPath(var1), var2)).getAbsolutePath();
         this.d.remove(var1);
         ZipOutputStream var4;
         (var4 = (ZipOutputStream)this.c.remove(var1)).flush();
         var4.close();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }
}
