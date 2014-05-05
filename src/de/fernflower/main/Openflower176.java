package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.DecompileDispatcher;
import de.fernflower.main.DefaultIdentifierRenamer;
import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower174;
import de.fernflower.main.Openflower177;
import de.fernflower.main.Openflower198;
import de.fernflower.main.extern.IFernflowerLogger;
import de.fernflower.main.extern.IIdentifierRenamer;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.MethodSignatureHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Openflower176 {

   private DecompileDispatcher a;
   private IIdentifierRenamer b;
   private Openflower177 c;
   private List d = new ArrayList();
   private List e = new ArrayList();
   private Map f = new HashMap();
   private Map g = new HashMap();
   private List h;
   private List i;


   public final void a(DecompileDispatcher var1) {
      try {
         this.a = var1;
         String var2;
         if((var2 = (String)Configuration.getObject("urc")) != null) {
            IFernflowerLogger var3;
            (var3 = Configuration.getLogger()).writeMessage("User supplied renamer class " + var2 + " found. Loading...", 2, 0);

            try {
               this.b = (IIdentifierRenamer)Openflower176.class.getClassLoader().loadClass(var2).newInstance();
               var3.writeMessage("Class " + var2 + " successfully loaded.", 2, 0);
            } catch (Exception var5) {
               var3.writeMessage("Class " + var2 + " couldn\'t be loaded.", 3, 0);
               if(var3.getShowStacktrace()) {
                  var5.printStackTrace();
               }
            }
         }

         if(this.b == null) {
            this.b = new DefaultIdentifierRenamer();
         }

         this.c = new Openflower177(this.b);
         this.e();
         this.h = a(this.d);
         this.i = a(this.e);
         this.d();
         this.a();
         this.c();
         this.b();
         Configuration.a(this.c);
         var1.a();
      } catch (IOException var6) {
         throw new RuntimeException("Renaming failed!");
      }
   }

   private void a() {
      ArrayList var1;
      (var1 = new ArrayList(this.i)).addAll(this.h);
      HashMap var2 = new HashMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Openflower174 var10000 = (Openflower174)var3.next();
         var1 = null;
         ClassInfo var8 = var10000.a();
         HashSet var4 = new HashSet();
         if(var8.super_class_cp_info != null) {
            Set var5 = null;
            if((var5 = (Set)var2.get((String)var8.super_class_cp_info.a)) != null) {
               var4.addAll(var5);
            }
         }

         String[] var7;
         int var6 = (var7 = var8.getInterfaceNames()).length;

         for(int var9 = 0; var9 < var6; ++var9) {
            String var12 = var7[var9];
            var4.addAll(this.a(var12, var2));
         }

         if(var4.size() > 1) {
            HashSet var11;
            (var11 = new HashSet(var4)).retainAll((Collection)this.g.keySet());
            if(!var11.isEmpty()) {
               var4.addAll((Collection)this.g.get(var11.iterator().next()));
            }

            Iterator var13 = var4.iterator();

            while(var13.hasNext()) {
               String var10 = (String)var13.next();
               this.g.put(var10, var4);
            }
         }
      }

   }

   private Set a(String var1, HashMap var2) {
      Object var3;
      if((var3 = (Set)var2.get(var1)) == null) {
         var3 = new HashSet();
         ClassInfo var4;
         if((var4 = this.a.getClass(var1)) != null) {
            String[] var8;
            int var7 = (var8 = var4.getInterfaceNames()).length;

            for(int var6 = 0; var6 < var7; ++var6) {
               String var5 = var8[var6];
               ((Set)var3).addAll(this.a(var5, var2));
            }

            if(var4.isNotLibrary()) {
               ((Set)var3).add(var1);
            }
         }

         var2.put(var1, var3);
      }

      return (Set)var3;
   }

   private Set a(Openflower174 var1, Map var2, Set var3) {
      ClassInfo var4 = var1.a();
      HashSet var5 = new HashSet((Collection)Arrays.asList(var4.getInterfaceNames()));
      HashSet var6 = new HashSet(var5);
      var5.addAll(var3);
      Iterator var8 = var1.b().iterator();

      while(var8.hasNext()) {
         var1 = (Openflower174)var8.next();
         var6.addAll(this.a(var1, var2, (Set)var5));
      }

      HashSet var7;
      (var7 = new HashSet(var5)).addAll(var6);
      var2.put(var4.name, var7);
      return var6;
   }

   private void b() {
      HashMap var1 = new HashMap();
      HashMap var2 = new HashMap();
      Iterator var4 = this.h.iterator();

      while(var4.hasNext()) {
         Openflower174 var3;
         ClassInfo var5 = (var3 = (Openflower174)var4.next()).a();
         Set var6;
         if((var6 = (Set)var2.get(var5.name)) == null) {
            this.a(var3, var2 = new HashMap(), (Set)(new HashSet()));
            var6 = (Set)var2.get(var5.name);
         }

         HashMap var7 = new HashMap();
         HashMap var8 = new HashMap();
         if(var5.super_class_cp_info != null) {
            Map var9 = null;
            if((var9 = (Map)var1.get((String)var5.super_class_cp_info.a)) != null) {
               var7.putAll(var9);
               var8.putAll(var9);
            }
         }

         Iterator var11 = var6.iterator();

         while(var11.hasNext()) {
            String var13 = (String)var11.next();
            Map var10;
            if((var10 = (Map)this.f.get(var13)) != null) {
               var8.putAll(var10);
            } else {
               ClassInfo var12;
               if((var12 = this.a.getClass(var13)) != null) {
                  var8.putAll(this.a(var12));
               }
            }
         }

         this.a(var5, var7, (Map)var8);
         if(!var3.b().isEmpty()) {
            var1.put(var5.name, var7);
         }
      }

   }

   private Map a(ClassInfo var1) {
      HashMap var2 = new HashMap();
      String[] var6;
      int var5 = (var6 = var1.getInterfaceNames()).length;

      for(int var4 = 0; var4 < var5; ++var4) {
         String var3 = var6[var4];
         Map var7;
         if((var7 = (Map)this.f.get(var3)) != null) {
            var2.putAll(var7);
         } else {
            ClassInfo var8;
            if((var8 = this.a.getClass(var3)) != null) {
               var2.putAll(this.a(var8));
            }
         }
      }

      this.a(var1, var2, (Map)var2);
      return var2;
   }

   private void c() {
      HashMap var1 = new HashMap();
      Iterator var3 = this.i.iterator();

      while(var3.hasNext()) {
         Openflower174 var10000 = (Openflower174)var3.next();
         ClassInfo var2 = null;
         var2 = var10000.a();
         HashMap var4 = new HashMap();
         String[] var8;
         int var7 = (var8 = var2.getInterfaceNames()).length;

         for(int var6 = 0; var6 < var7; ++var6) {
            String var5 = var8[var6];
            Map var9;
            if((var9 = (Map)var1.get(var5)) != null) {
               var4.putAll(var9);
            }
         }

         Set var10;
         if((var10 = (Set)this.g.get(var2.name)) != null) {
            Iterator var12 = var10.iterator();

            while(var12.hasNext()) {
               String var11 = (String)var12.next();
               Map var13;
               if((var13 = (Map)var1.get(var11)) != null) {
                  var4.putAll(var13);
               }
            }
         }

         this.a(var2, var4, (Map)var4);
         var1.put(var2.name, var4);
      }

      this.f = var1;
   }

   private void d() {
      ArrayList var1;
      (var1 = new ArrayList(this.i)).addAll(this.h);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ClassInfo var7;
         if((var7 = ((Openflower174)var2.next()).a()).isNotLibrary()) {
            String var3 = var7.name;
            String var4 = null;
            var4 = DefaultIdentifierRenamer.a(var3);
            if(this.b.toBeRenamed(1, var4, (String)null, (String)null)) {
               do {
                  var4 = DefaultIdentifierRenamer.a(var3, this.b.getNextClassname(var3, DefaultIdentifierRenamer.a(var3)));
               } while(this.a.getClasses().containsKey(var4));

               this.c.b(var3, var4);
            }

            if(var7.super_class_cp_info != null) {
               this.c.a(var3, (String)var7.super_class_cp_info.a);
            }

            String[] var6;
            int var5 = (var6 = var7.getInterfaceNames()).length;

            for(int var9 = 0; var9 < var5; ++var9) {
               String var8 = var6[var9];
               this.c.a(var3, var8);
            }
         }
      }

   }

   private void a(ClassInfo var1, Map var2, Map var3) {
      String var4 = var1.name;
      String var5;
      if((var5 = this.c.a(1, var4, (String)null, (String)null)) == null) {
         var5 = var4;
      }

      HashSet var6 = new HashSet();
      Iterator var8 = var1.getMethods().iterator();

      while(var8.hasNext()) {
         MethodInfo var7 = (MethodInfo)var8.next();
         var6.add(var7.getName());
      }

      DualArrayList var14 = var1.getMethods();

      for(int var15 = 0; var15 < var14.size(); ++var15) {
         MethodInfo var9 = (MethodInfo)var14.get(var15);
         String var10 = (String)var14.a(var15);
         int var11;
         boolean var12 = ((var11 = var9.getAccess()) & 2) != 0;
         String var13 = var9.getName();
         if(var1.isNotLibrary() && (var11 & 256) == 0) {
            if(this.b.toBeRenamed(3, var4, var13, var9.getDesc())) {
               if(!var12 && var3.containsKey(var10)) {
                  var13 = (String)var3.get(var10);
               } else {
                  do {
                     var13 = this.b.getNextMethodname(var4, var13, var9.getDesc());
                  } while(var6.contains(var13));

                  if(!var12) {
                     var2.put(var10, var13);
                  }
               }

               this.c.b(var4 + " " + var9.getName() + " " + var9.getDesc(), var5 + " " + var13 + " " + this.a(false, var9.getDesc()));
            }
         } else if(!var12) {
            var2.put(var10, var13);
         }
      }

      if(var1.isNotLibrary()) {
         HashSet var17 = new HashSet();
         Iterator var19 = var1.getFields().iterator();

         FieldInfo var16;
         while(var19.hasNext()) {
            var16 = (FieldInfo)var19.next();
            var17.add(var16.getName());
         }

         var19 = var1.getFields().iterator();

         while(var19.hasNext()) {
            var16 = (FieldInfo)var19.next();
            if(this.b.toBeRenamed(2, var4, var16.getName(), var16.getDesc())) {
               String var18;
               do {
                  var18 = this.b.getNextFieldname(var4, var16.getName(), var16.getDesc());
               } while(var17.contains(var18));

               this.c.b(var4 + " " + var16.getName() + " " + var16.getDesc(), var5 + " " + var18 + " " + this.a(true, var16.getDesc()));
            }
         }

      }
   }

   private String a(boolean var1, String var2) {
      boolean var3 = false;
      Descriptor var4;
      if(var1) {
         String var5;
         Openflower198 var9;
         if((var4 = (var9 = Openflower198.a(var2)).e).type == 8 && (var5 = this.c.a(1, var4.stringValue, (String)null, (String)null)) != null) {
            var4.stringValue = var5;
            var3 = true;
         }

         if(var3) {
            return var9.a();
         }
      } else {
         Descriptor[] var7;
         MethodSignatureHolder var10;
         int var6 = (var7 = (var10 = MethodSignatureHolder.create(var2)).params).length;

         for(int var12 = 0; var12 < var6; ++var12) {
            String var8;
            if((var4 = var7[var12]).type == 8 && (var8 = this.c.a(1, var4.stringValue, (String)null, (String)null)) != null) {
               var4.stringValue = var8;
               var3 = true;
            }
         }

         String var11;
         if(var10.ret.type == 8 && (var11 = this.c.a(1, var10.ret.stringValue, (String)null, (String)null)) != null) {
            var10.ret.stringValue = var11;
            var3 = true;
         }

         if(var3) {
            return var10.toString();
         }
      }

      return var2;
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      Iterator var5 = var0.iterator();

      Openflower174 var8;
      while(var5.hasNext()) {
         var8 = (Openflower174)var5.next();
         var2.add(var8);
         var3.add(Integer.valueOf(0));
      }

      while(!var2.isEmpty()) {
         var8 = (Openflower174)var2.getLast();
         int var9 = ((Integer)var3.removeLast()).intValue();
         var4.add(var8);
         List var6 = var8.b();

         while(true) {
            if(var9 < var6.size()) {
               Openflower174 var7 = (Openflower174)var6.get(var9);
               if(var4.contains(var7)) {
                  ++var9;
                  continue;
               }

               var3.add(Integer.valueOf(var9 + 1));
               var2.add(var7);
               var3.add(Integer.valueOf(0));
            }

            if(var9 == var6.size()) {
               var1.add(0, var8);
               var2.removeLast();
            }
            break;
         }
      }

      return var1;
   }

   private void e() {
      HashMap var1 = new HashMap();
      HashMap var2 = this.a.getClasses();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      Iterator var6 = var2.values().iterator();

      while(var6.hasNext()) {
         ClassInfo var5;
         if((var5 = (ClassInfo)var6.next()).isNotLibrary()) {
            LinkedList var7 = new LinkedList();
            LinkedList var8 = new LinkedList();
            var7.add(var5);
            var8.add((Object)null);

            while(!var7.isEmpty()) {
               var5 = (ClassInfo)var7.removeFirst();
               Openflower174 var9 = (Openflower174)var8.removeFirst();
               Openflower174 var10;
               boolean var11;
               if(var11 = (var10 = (Openflower174)var1.get(var5.name)) == null) {
                  var1.put(var5.name, var10 = new Openflower174(var5));
               }

               if(var9 != null) {
                  var10.a(var9);
               }

               if(!var11) {
                  break;
               }

               boolean var16 = (var5.access_flags & 512) != 0;
               var11 = false;
               if(var16) {
                  String[] var14;
                  int var13 = (var14 = var5.getInterfaceNames()).length;

                  for(int var12 = 0; var12 < var13; ++var12) {
                     String var15 = var14[var12];
                     if((var5 = (ClassInfo)var2.get(var15)) != null) {
                        var7.add(var5);
                        var8.add(var10);
                        var11 = true;
                     }
                  }
               } else if(var5.super_class_cp_info != null && (var5 = (ClassInfo)var2.get((String)var5.super_class_cp_info.a)) != null) {
                  var7.add(var5);
                  var8.add(var10);
                  var11 = true;
               }

               if(!var11) {
                  (var16?var4:var3).add(var10);
               }
            }
         }
      }

      this.d = var3;
      this.e = var4;
   }
}
