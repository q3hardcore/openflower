package de.fernflower.main;

import de.fernflower.main.ClassDecompiler;
import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.DecompileDispatcher;
import de.fernflower.main.Descriptor;
import de.fernflower.main.ImportManager;
import de.fernflower.main.NestedClassDecompiler;
import de.fernflower.main.Openflower74;
import de.fernflower.main.Openflower81;
import de.fernflower.main.classreader.attributes.InnerClasses;
import de.fernflower.main.extern.IIdentifierRenamer;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IDManager;
import de.fernflower.main.util.Util;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public final class DecompileClassOuter {

   private HashMap map = new HashMap();


   public DecompileClassOuter(DecompileDispatcher var1) {
      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      boolean var6 = Configuration.getBoolean("din");
      Iterator var8 = var1.getClasses().values().iterator();

      String var14;
      ClassInfo var22;
      while(var8.hasNext()) {
         ClassInfo var7;
         if((var7 = (ClassInfo)var8.next()).isNotLibrary() && !this.map.containsKey(var7.name)) {
            InnerClasses var9;
            if(var6 && (var9 = (InnerClasses)var7.getAttributes().b("InnerClasses")) != null) {
               for(int var10 = 0; var10 < var9.getIndexes().size(); ++var10) {
                  int[] var11 = (int[])var9.getIndexes().get(var10);
                  String[] var12 = (String[])var9.getNames().get(var10);
                  Object[] var13 = new Object[4];
                  var14 = var12[0];
                  var13[2] = Integer.valueOf(var11[1] == 0?(var11[2] == 0?2:4):1);
                  String var15 = var12[2];
                  IIdentifierRenamer var17;
                  String var16;
                  if((var16 = (String)var5.get(var14)) != null) {
                     var15 = var16;
                  } else if(var15 != null && Configuration.getBoolean("ren") && (var17 = Configuration.g().a()).toBeRenamed(1, var15, (String)null, (String)null)) {
                     var15 = var17.getNextClassname(var14, var15);
                     var5.put(var14, var15);
                  }

                  var13[1] = var15;
                  var13[3] = Integer.valueOf(var11[3]);
                  var17 = null;
                  String var30;
                  if(var11[1] != 0) {
                     var30 = var12[1];
                  } else {
                     var30 = var7.name;
                  }

                  if(!var14.equals(var30) && (var22 = (ClassInfo)var1.getClasses().get(var30)) != null && var22.isNotLibrary()) {
                     Object[] var18;
                     if((var18 = (Object[])var2.get(var14)) == null) {
                        var2.put(var14, var13);
                     } else if(!Util.safeEquals(var18, var13)) {
                        Configuration.getLogger().writeMessage("Inconsistent inner class entries for " + var14 + "!", 3);
                     }

                     HashSet var25;
                     if((var25 = (HashSet)var3.get(var30)) == null) {
                        var3.put(var30, var25 = new HashSet());
                     }

                     var25.add(var14);
                     if((var25 = (HashSet)var4.get(var14)) == null) {
                        var4.put(var14, var25 = new HashSet());
                     }

                     var25.add(var30);
                  }
               }
            }

            ClassNode var20;
            (var20 = new ClassNode(var7)).access_flags = var7.access_flags;
            this.map.put(var7.name, var20);
         }
      }

      if(var6) {
         var8 = this.map.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var19 = (Entry)var8.next();
            if(!var2.containsKey(var19.getKey())) {
               HashSet var21 = new HashSet();
               LinkedList var23;
               (var23 = new LinkedList()).add((String)var19.getKey());
               var21.add((String)var19.getKey());

               while(!var23.isEmpty()) {
                  String var26 = (String)var23.removeFirst();
                  ClassNode var24 = (ClassNode)this.map.get(var26);
                  HashSet var27;
                  if((var27 = (HashSet)var3.get(var26)) != null) {
                     Iterator var28 = var27.iterator();

                     while(var28.hasNext()) {
                        var14 = (String)var28.next();
                        if(!var21.contains(var14)) {
                           var21.add(var14);
                           ClassNode var29;
                           if((var29 = (ClassNode)this.map.get(var14)) == null) {
                              Configuration.getLogger().writeMessage("Nested class " + var14 + " missing!", 3);
                           } else {
                              Object[] var31 = (Object[])var2.get(var14);
                              var29.a = ((Integer)var31[2]).intValue();
                              var29.name = (String)var31[1];
                              var29.access_flags = ((Integer)var31[3]).intValue();
                              if(var29.a == 2) {
                                 var22 = var29.classInfo;
                                 var29.access_flags &= -9;
                                 int[] var32;
                                 if((var32 = var22.getInterfaceIndexes()).length > 0) {
                                    if(var32.length > 1) {
                                       throw new RuntimeException("Inconsistent anonymous class definition: " + var22.name);
                                    }

                                    var29.desc = new Descriptor(var22.getInterface(0), true);
                                 } else {
                                    var29.desc = new Descriptor((String)var22.super_class_cp_info.a, true);
                                 }
                              } else if(var29.a == 4) {
                                 var29.access_flags &= 1040;
                              }

                              var24.subClasses.add(var29);
                              var29.classNode = var24;
                              var29.l.addAll((Collection)var4.get(var14));
                              var23.add(var14);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public final void decompileClass(ClassInfo var1, BufferedWriter var2) throws java.io.IOException {
      ClassNode var3;
      if((var3 = (ClassNode)this.map.get(var1.name)).a == 0) {
         try {
            Configuration.setImportManager(new ImportManager(var3));
            Configuration.setIDManager(new IDManager());
            this.a(var3, Configuration.getImportManager());
            this.a(var3);
            NestedClassDecompiler var10000 = new NestedClassDecompiler();
            ClassDecompiler var4 = null;
            var10000.a(var3, var3);
            (new Openflower81()).a(var3);
            var4 = new ClassDecompiler();
            StringWriter var5 = new StringWriter();
            var4.decompile(var3, new BufferedWriter(var5), 0);
            if(Configuration.getBoolean("occ")) {
               var2.write("// Decompiled by:       Fernflower v0.8.6");
               var2.newLine();
               var2.write("// Date:                " + (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")).format(new Date()));
               var2.newLine();
               var2.write("// Copyright:           2008-2010, Stiver");
               var2.newLine();
               var2.write("// Home page:           http://www.reversed-java.com");
               var2.newLine();
               var2.newLine();
            }

            int var9;
            if((var9 = var1.name.lastIndexOf("/")) >= 0) {
               String var8 = var1.name.substring(0, var9).replaceAll("/", ".");
               var2.write("package " + var8 + ";");
               var2.newLine();
               var2.newLine();
            }

            Configuration.put("CURRENT_CLASSNODE", var3);
            Configuration.getImportManager().addImports(var2);
            var2.newLine();
            var2.write(var5.toString());
            var2.flush();
         } finally {
            this.b(var3);
         }

      }
   }

   private void a(ClassNode var1) {
      Openflower74 var2;
      (var2 = new Openflower74(var1.classInfo)).process();
      var1.e = var2;
      Iterator var3 = var1.subClasses.iterator();

      while(var3.hasNext()) {
         var1 = (ClassNode)var3.next();
         this.a(var1);
      }

   }

   private void a(ClassNode var1, ImportManager var2) {
      if(var1.name != null && var1.name.length() > 0) {
         var2.getRelativeName(var1.a == 0?var1.classInfo.name:var1.name, false);
      }

      Iterator var3 = var1.subClasses.iterator();

      while(var3.hasNext()) {
         var1 = (ClassNode)var3.next();
         this.a(var1, var2);
      }

   }

   private void b(ClassNode var1) {
      var1.e = null;
      var1.classInfo.resetConstPool();
      Iterator var2 = var1.subClasses.iterator();

      while(var2.hasNext()) {
         var1 = (ClassNode)var2.next();
         this.b(var1);
      }

   }

   public final HashMap getInnerMap() {
      return this.map;
   }
}
