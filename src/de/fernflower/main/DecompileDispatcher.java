package de.fernflower.main;

import de.fernflower.main.BytecodeReaderHelper;
import de.fernflower.main.ClassInfo;
import de.fernflower.main.DecompileFactory;
import de.fernflower.main.Openflower178;
import de.fernflower.main.Openflower206;
import de.fernflower.main.extern.IDecompilatSaver;
import de.fernflower.main.util.Configuration;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class DecompileDispatcher {

   private BytecodeReaderHelper a;
   private HashMap classes = new HashMap();
   private HashMap c = new HashMap();
   private Openflower178 d;
   private IDecompilatSaver saver;
   private DecompileFactory f;


   public DecompileDispatcher(IDecompilatSaver var1, DecompileFactory var2, BytecodeReaderHelper var3) {
      this.saver = var1;
      this.f = var2;
      this.a = var3;
      this.d = new Openflower178(0, (String)null, "", true, var1, var2);
      this.c.put("", this.d);
   }

   public final ClassInfo getClass(String var1) {
      return (ClassInfo)this.classes.get(var1);
   }

   public final void a() throws IOException {
      Iterator var2 = this.c.values().iterator();

      while(var2.hasNext()) {
         Openflower178 var1;
         Iterator var4 = (var1 = (Openflower178)var2.next()).getClasses().iterator();

         ClassInfo var3;
         while(var4.hasNext()) {
            var3 = (ClassInfo)var4.next();
            this.classes.remove(var3.name);
         }

         var1.loadClasses(this.a);
         var4 = var1.getClasses().iterator();

         while(var4.hasNext()) {
            var3 = (ClassInfo)var4.next();
            this.classes.put(var3.name, var3);
         }
      }

   }

   public final void b() {
      Iterator var1 = this.c.values().iterator();

      while(var1.hasNext()) {
         Openflower178 var2;
         if((var2 = (Openflower178)var1.next()).b()) {
            var2.a();
         }
      }

   }

   public final void processFile(File var1, boolean var2) {
      this.processFile("", var1, var2);
   }

   private void processFile(String var1, File var2, boolean var3) {
      if(var2.isDirectory()) {
         File[] var10 = var2.listFiles();
         var1 = var1 + "/" + (var1.length() == 0?"":var2.getName());

         for(int var12 = var10.length - 1; var12 >= 0; --var12) {
            this.processFile(var1, var10[var12], var3);
         }

      } else {
         String var4 = var2.getName();
         boolean var5 = false;

         try {
            if(var4.endsWith(".jar")) {
               this.processArchive(var1, var2, 1, var3);
               var5 = true;
            } else if(var4.endsWith(".zip")) {
               this.processArchive(var1, var2, 2, var3);
               var5 = true;
            }
         } catch (IOException var8) {
            Configuration.getLogger().writeMessage("Archive file or some parts of its content invalid: " + (var1.length() > 0?var1 + "/":"") + var4, 4);
         }

         if(!var5) {
            Openflower178 var11;
            if((var11 = (Openflower178)this.c.get(var1)) == null) {
               var11 = new Openflower178(0, (String)null, var1, var3, this.saver, this.f);
               this.c.put(var1, var11);
            }

            boolean var6 = false;
            if(var4.endsWith(".class")) {
               try {
                  ClassInfo var9 = new ClassInfo(this.a.getStream(var2.getAbsolutePath(), (String)null), var3, this.a);
                  this.classes.put(var9.name, var9);
                  var11.a(var9, var4);
                  this.a.a(var9.name, new Openflower206(var2.getAbsolutePath(), (String)null));
                  var6 = true;
               } catch (IOException var7) {
                  Configuration.getLogger().writeMessage("Invalid class file: " + (var1.length() > 0?var1 + "/":"") + var4, 4);
               }
            }

            if(!var6) {
               var11.a(var2.getAbsolutePath(), var4);
            }
         }

      }
   }

   private void processArchive(String var1, File var2, int var3, boolean var4) throws IOException {
      Object var5;
      if(var3 == 1) {
         var5 = new JarFile(var2);
      } else {
         var5 = new ZipFile(var2);
      }

      Enumeration var6 = ((ZipFile)var5).entries();

      while(var6.hasMoreElements()) {
         ZipEntry var7 = (ZipEntry)var6.nextElement();
         Openflower178 var8;
         if((var8 = (Openflower178)this.c.get(var1 + "/" + var2.getName())) == null) {
            var8 = new Openflower178(var3, var1, var2.getName(), var4, this.saver, this.f);
            if(var3 == 1) {
               var8.setManifest(((JarFile)var5).getManifest());
            }

            this.c.put(var1 + "/" + var2.getName(), var8);
         }

         String var9 = var7.getName();
         if(!var7.isDirectory()) {
            if(var9.endsWith(".class")) {
               ClassInfo var10 = new ClassInfo(((ZipFile)var5).getInputStream(var7), var4, this.a);
               this.classes.put(var10.name, var10);
               var8.a(var10, var9);
               if(this.a != null) {
                  this.a.a(var10.name, new Openflower206(var2.getAbsolutePath(), var9));
               }
            } else {
               var8.a(var2.getAbsolutePath(), var9);
            }
         } else if(var7.isDirectory()) {
            var8.a(var9);
         }
      }

   }

   public final HashMap getClasses() {
      return this.classes;
   }
}
