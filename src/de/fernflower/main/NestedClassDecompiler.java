package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower74;
import de.fernflower.main.Openflower77;
import de.fernflower.main.Openflower78;
import de.fernflower.main.Openflower79;
import de.fernflower.main.classreader.attributes.EnclosingMethod;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LocalVarNamer;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public final class NestedClassDecompiler {

   public final void a(ClassNode var1, ClassNode var2) {
      if(!var2.subClasses.isEmpty()) {
         ClassNode var4 = var2;
         NestedClassDecompiler var3 = this;
         HashMap var5 = new HashMap();
         int var6 = 0;
         Iterator var8 = var2.subClasses.iterator();

         while(var8.hasNext()) {
            ClassNode var7;
            if(((var7 = (ClassNode)var8.next()).access_flags & 8) == 0 && (var7.access_flags & 512) == 0) {
               var6 |= var7.a;
               HashMap var9;
               if((var9 = var3.a(var7.e)).isEmpty()) {
                  Configuration.getLogger().writeMessage("Nested class " + var7.classInfo.name + " has no constructor!", 3);
               } else {
                  var5.put(var7.classInfo.name, var9);
               }
            }
         }

         HashMap var19 = new HashMap();
         ClassNode var17;
         Iterator var22;
         if(var6 != 1) {
            var22 = var2.e.getResults().iterator();

            while(var22.hasNext()) {
               MethodDecompileResult var21;
               if((var21 = (MethodDecompileResult)var22.next()).result != null) {
                  Openflower137 var10000 = var21.a();
                  var17 = null;
                  var10000.a(new Openflower77(var5, var4, var19, var21));
               }
            }
         }

         var22 = var5.entrySet().iterator();

         while(var22.hasNext()) {
            Entry var20 = (Entry)var22.next();
            var17 = var4.getChild((String)var20.getKey());
            ArrayList var12 = null;
            Iterator var10;
            if(var19.containsKey(var20.getKey())) {
               var10 = ((HashMap)var19.get(var20.getKey())).values().iterator();

               while(var10.hasNext()) {
                  List var15 = (List)var10.next();
                  if(var12 == null) {
                     var12 = new ArrayList(var15);
                  } else {
                     a(var12, var15, false);
                  }
               }
            }

            ArrayList var16 = null;
            Iterator var11 = ((HashMap)var20.getValue()).values().iterator();

            while(var11.hasNext()) {
               List var26 = (List)var11.next();
               if(var16 == null) {
                  var16 = new ArrayList(var26);
               } else {
                  a(var16, var26, false);
               }
            }

            if(var12 == null) {
               var12 = new ArrayList(var16);
               boolean var27 = false;

               for(int var24 = 0; var24 < var12.size(); ++var24) {
                  if(var12.get(var24) != null) {
                     if(var27) {
                        var12.set(var24, (Object)null);
                     }

                     var27 = true;
                  }
               }
            }

            a(var12, var16, true);

            for(int var25 = 0; var25 < var12.size(); ++var25) {
               Openflower79 var28;
               if((var28 = (Openflower79)var12.get(var25)) != null && var28.a.length() > 0) {
                  var17.h.put(var28.a, var28.b);
               }
            }

            var11 = ((HashMap)var20.getValue()).entrySet().iterator();

            while(var11.hasNext()) {
               Entry var29;
               a((List)(var29 = (Entry)var11.next()).getValue(), var12, false);
               MethodDecompileResult var18;
               (var18 = var17.e.getResult("<init>", (String)var29.getKey())).e = new ArrayList();
               var10 = ((List)var29.getValue()).iterator();

               while(var10.hasNext()) {
                  Openflower79 var23 = (Openflower79)var10.next();
                  var18.e.add(var23 == null?null:var23.b);
               }
            }
         }

         this.b(var1, var2);
         Iterator var13 = var2.subClasses.iterator();

         ClassNode var14;
         while(var13.hasNext()) {
            if(((var14 = (ClassNode)var13.next()).a == 4 || var14.a == 1) && var14.name == null) {
               Configuration.getLogger().writeMessage("Nameless local or member class " + var14.classInfo.name + "!", 3);
               var14.name = "NamelessClass" + var14.hashCode();
            }
         }

         var13 = var2.subClasses.iterator();

         while(var13.hasNext()) {
            if((var14 = (ClassNode)var13.next()).a != 1 || (var14.access_flags & 8) == 0) {
               this.d(var2, var14);
               if(var14.a == 4) {
                  this.a((MethodDecompileResult)var2.e.getResults().b(var14.f), var14);
               }
            }
         }

         var13 = var2.subClasses.iterator();

         while(var13.hasNext()) {
            var14 = (ClassNode)var13.next();
            this.a(var1, var14);
         }

      }
   }

   private void b(ClassNode var1, ClassNode var2) {
      Iterator var3 = (new ArrayList(var2.subClasses)).iterator();

      while(var3.hasNext()) {
         ClassNode var6;
         if(((var6 = (ClassNode)var3.next()).a == 4 || var6.a == 2) && var6.f == null) {
            Set var4 = var6.l;
            EnclosingMethod var5;
            if(var6.l.size() == 1 && (var5 = (EnclosingMethod)var6.classInfo.getAttributes().b("EnclosingMethod")) != null && var5.c() != null && var2.classInfo.name.equals(var5.a()) && var2.classInfo.getMethod(var5.c(), var5.b()) != null) {
               var6.f = Util.concat(var5.c(), var5.b());
            } else {
               var2.subClasses.remove(var6);
               var6.classNode = null;
               var4.remove(var2.classInfo.name);
               boolean var7;
               if(var7 = !var4.isEmpty()) {
                  var7 = c(var1, var6);
               }

               if(!var7) {
                  if(var6.a == 2) {
                     Configuration.getLogger().writeMessage("Unreferenced anonymous class " + var6.classInfo.name + "!", 3);
                  } else if(var6.a == 4) {
                     Configuration.getLogger().writeMessage("Unreferenced local class " + var6.classInfo.name + "!", 3);
                  }
               }
            }
         }
      }

   }

   private static boolean c(ClassNode var0, ClassNode var1) {
      Set var2 = var1.l;
      LinkedList var3;
      (var3 = new LinkedList()).add(var0);

      while(!var3.isEmpty()) {
         var0 = (ClassNode)var3.removeFirst();
         if(var2.contains(var0.classInfo.name)) {
            var0.subClasses.add(var1);
            var1.classNode = var0;
            return true;
         }

         var3.addAll(var0.subClasses);
      }

      return false;
   }

   private void d(ClassNode var1, ClassNode var2) {
      MethodDecompileResult var16 = (MethodDecompileResult)var1.e.getResults().b(var2.f);
      Iterator var4 = var2.e.getResults().iterator();

      while(var4.hasNext()) {
         MethodDecompileResult var3;
         if((var3 = (MethodDecompileResult)var4.next()).result != null) {
            HashMap var5 = new HashMap();
            HashMap var6 = new HashMap();
            HashMap var7 = new HashMap();
            IntPair var11;
            if(var3.e != null) {
               int var8 = 0;
               int var9 = 1;
               MethodSignatureHolder var10 = MethodSignatureHolder.create(var3.method.getDesc());

               for(Iterator var12 = var3.e.iterator(); var12.hasNext(); var9 += var10.params[var8++].varSize) {
                  if((var11 = (IntPair)var12.next()) != null) {
                     IntPair var13 = new IntPair(var3.idManager.getNext(2), 0);
                     var7.put(Integer.valueOf(var9), var13);
                     String var14 = null;
                     Descriptor var15 = null;
                     if(var2.a != 1) {
                        var14 = var16.varProcessor.getName(var11);
                        var15 = var16.varProcessor.a(var11);
                        var16.varProcessor.d(var11);
                     }

                     if(var11.val1 == -1 || "this".equals(var14)) {
                        if(var1.name == null) {
                           var14 = "<VAR_NAMELESS_ENCLOSURE>";
                        } else {
                           var14 = var1.name + ".this";
                        }

                        var3.varProcessor.getTypes().put(var13, var1.classInfo.name);
                     }

                     var5.put(var13, var14);
                     var6.put(var13, var15);
                  }
               }
            }

            HashMap var17 = new HashMap();
            Iterator var20 = var2.h.entrySet().iterator();

            while(var20.hasNext()) {
               Entry var19 = (Entry)var20.next();
               var11 = new IntPair(var3.idManager.getNext(2), 0);
               var17.put((String)var19.getKey(), var11);
               FieldInfo var22 = (FieldInfo)var2.classInfo.getFields().b((String)var19.getKey());
               var2.e.d().add(Util.concat(var22.getName(), var22.getDesc()));
               String var25 = null;
               Descriptor var27 = null;
               if(var2.a != 1) {
                  var25 = var16.varProcessor.getName((IntPair)var19.getValue());
                  var27 = var16.varProcessor.a((IntPair)var19.getValue());
                  var16.varProcessor.d((IntPair)var19.getValue());
               }

               if(((IntPair)var19.getValue()).val1 == -1 || "this".equals(var25)) {
                  if(var1.name == null) {
                     var25 = "<VAR_NAMELESS_ENCLOSURE>";
                  } else {
                     var25 = var1.name + ".this";
                  }

                  var3.varProcessor.getTypes().put(var11, var1.classInfo.name);
               }

               var5.put(var11, var25);
               var6.put(var11, var27);
               var2.i.put((String)var19.getKey(), var25);
            }

            HashSet var18;
            (var18 = new HashSet(var5.values())).removeAll(var3.g);
            var3.varProcessor.loadNames(new LocalVarNamer(var18));
            var3.g.addAll(var18);
            Iterator var24 = var5.entrySet().iterator();

            while(var24.hasNext()) {
               Entry var21;
               IntPair var23 = (IntPair)(var21 = (Entry)var24.next()).getKey();
               Descriptor var26 = (Descriptor)var6.get(var23);
               var3.varProcessor.setName(var23, (String)var21.getValue());
               if(var26 != null) {
                  var3.varProcessor.a(var23, var26);
               }
            }

            var3.a().a(new Openflower78(var2, var17, var3, var7));
         }
      }

   }

   private HashMap a(Openflower74 var1) {
      HashMap var12 = new HashMap();
      ClassInfo var2;
      Iterator var4 = (var2 = var1.getClassInfo()).getMethods().iterator();

      while(var4.hasNext()) {
         MethodInfo var3 = (MethodInfo)var4.next();
         if("<init>".equals(var3.getName())) {
            MethodSignatureHolder var5 = MethodSignatureHolder.create(var3.getDesc());
            MethodDecompileResult var6;
            Openflower137 var7;
            if((var7 = (var6 = var1.getResult("<init>", var3.getDesc())).a()) != null) {
               ArrayList var8 = new ArrayList();
               int var9 = 1;

               for(int var10 = 0; var10 < var5.params.length; ++var10) {
                  String var11 = a(var2, var6, var7, var9);
                  var8.add(var11 == null?null:new Openflower79(var11, new IntPair(-1, 0)));
                  var9 += var5.params[var10].varSize;
               }

               var12.put(var3.getDesc(), var8);
            }
         }
      }

      return var12;
   }

   private static String a(ClassInfo var0, MethodDecompileResult var1, Openflower137 var2, int var3) {
      String var4 = "";
      if(var1.varProcessor.c(new IntPair(var3, 0)) == 1) {
         return null;
      } else {
         boolean var7 = Configuration.getBoolean("nns");
         Openflower138 var8;
         if((var8 = var2.b).g.isEmpty()) {
            Iterator var5 = var8.e.iterator();

            while(var5.hasNext()) {
               Element var9;
               Openflower124 var10;
               if((var9 = (Element)var5.next()).a == 2 && (var10 = (Openflower124)var9).h().a == 12 && ((Openflower135)var10.h()).getIndex() == var3 && var10.g().a == 5) {
                  Openflower128 var11 = (Openflower128)var10.g();
                  FieldInfo var6;
                  if((var6 = var0.getField(var11.k(), var11.h())) != null && var0.name.equals(var11.g()) && (var6.access_flags & 16) != 0 && ((var6.access_flags & 4096) != 0 || var6.a().d("Synthetic") || var7 && (var6.access_flags & 2) != 0)) {
                     var4 = Util.concat(var11.k(), var11.h());
                     break;
                  }
               }
            }
         }

         return var4;
      }
   }

   private static void a(List var0, List var1, boolean var2) {
      int var3;
      Openflower79 var4;
      Openflower79 var5;
      boolean var6;
      for(var3 = 1; var0.size() > var3 && var1.size() > var3; ++var3) {
         var4 = (Openflower79)var0.get(var0.size() - var3);
         var5 = (Openflower79)var1.get(var1.size() - var3);
         var6 = false;
         if(var4 != null && var5 != null) {
            var6 = true;
            if(var4.a.length() == 0) {
               var4.a = var5.a;
            } else if(var5.a.length() == 0) {
               if(var2) {
                  var5.a = var4.a;
               }
            } else {
               var6 = var4.a.equals(var5.a);
            }
         } else {
            var6 = var4 == var5;
         }

         if(!var6) {
            var0.set(var0.size() - var3, (Object)null);
            if(var2) {
               var1.set(var1.size() - var3, (Object)null);
            }
         } else if(var4 != null) {
            if(var4.b.val1 == -1) {
               var4.b = var5.b;
            } else {
               var5.b = var4.b;
            }
         }
      }

      int var7;
      for(var7 = 1; var7 <= var0.size() - var3; ++var7) {
         var0.set(var7, (Object)null);
      }

      if(var2) {
         for(var7 = 1; var7 <= var1.size() - var3; ++var7) {
            var1.set(var7, (Object)null);
         }
      }

      if(var0.isEmpty()) {
         if(!var1.isEmpty() && var2) {
            var1.set(0, (Object)null);
            return;
         }
      } else {
         if(var1.isEmpty()) {
            var0.set(0, (Object)null);
            return;
         }

         var4 = (Openflower79)var0.get(0);
         var5 = (Openflower79)var1.get(0);
         var6 = false;
         if(var4 != null && var5 != null) {
            var6 = true;
            if(var4.a.length() == 0) {
               var4.a = var5.a;
            } else if(var5.a.length() == 0) {
               if(var2) {
                  var5.a = var4.a;
               }
            } else {
               var6 = var4.a.equals(var5.a);
            }
         } else {
            var6 = var4 == var5;
         }

         if(!var6) {
            var0.set(0, (Object)null);
            if(var2) {
               var1.set(0, (Object)null);
               return;
            }
         } else {
            if(var4.b.val1 == -1) {
               var4.b = var5.b;
               return;
            }

            var5.b = var4.b;
         }
      }

   }

   private void a(MethodDecompileResult var1, ClassNode var2) {
      Openflower152 var3 = var1.result;
      HashSet var4 = new HashSet();
      Descriptor var7 = new Descriptor(var2.classInfo.name, true);
      Openflower154_SomeSorter var5;
      if((var5 = this.a(var3, var7, var4)) == null) {
         var5 = var3.s();
      }

      List var6;
      Openflower154_SomeSorter var8;
      if((var8 = a(var5, var4)) == null) {
         var6 = var5.D();
      } else if(var8.E() == null) {
         var6 = var8.D();
      } else {
         var6 = var8.E();
      }

      int var9 = 0;

      for(Iterator var10 = var6.iterator(); var10.hasNext() && !a((Element)var10.next(), var7); ++var9) {
         ;
      }

      Openflower135 var11;
      (var11 = new Openflower135(var1.idManager.getNext(2), var7, var1.varProcessor)).setDeclaration();
      var11.m();
      var6.add(var9, var11);
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0, HashSet var1) {
      LinkedList var2;
      (var2 = new LinkedList()).add(var0);

      while(!var2.isEmpty()) {
         var0 = (Openflower154_SomeSorter)var2.remove(0);
         if(var2.isEmpty() || var1.contains(var0)) {
            if(var0.needsLabel() && !var2.isEmpty()) {
               return var0;
            }

            if(var0.E() != null) {
               return var0;
            }

            var2.clear();
            switch(var0.c) {
            case 2:
            case 6:
            case 10:
            case 13:
               var2.add(var0.s());
               break;
            case 15:
               var2.addAll(0, var0.t());
               break;
            default:
               return var0;
            }
         }
      }

      return null;
   }

   private Openflower154_SomeSorter a(Openflower154_SomeSorter var1, Descriptor var2, HashSet var3) {
      Object var4 = new ArrayList();
      Openflower154_SomeSorter var5 = null;
      if(var1.E() == null) {
         int var6 = 0;
         Iterator var8 = var1.d().iterator();

         while(var8.hasNext()) {
            Object var7;
            if((var7 = var8.next()) instanceof Openflower154_SomeSorter) {
               Openflower154_SomeSorter var11 = (Openflower154_SomeSorter)var7;
               Openflower154_SomeSorter var9;
               if((var9 = this.a(var11, var2, var3)) != null) {
                  if(var6 == 1) {
                     var5 = var1;
                     break;
                  }

                  var5 = var9;
                  ++var6;
               }

               if(var11.c == 5) {
                  Openflower149_LoopPrinter var13 = (Openflower149_LoopPrinter)var11;
                  ((List)var4).addAll(var13.e());
                  ((List)var4).addAll(var13.f());
               }
            } else if(var7 instanceof Element) {
               ((List)var4).add((Element)var7);
            }
         }
      } else {
         var4 = var1.E();
      }

      if(var5 != var1) {
         Iterator var12 = ((List)var4).iterator();

         while(var12.hasNext()) {
            Element var10;
            if((var10 = (Element)var12.next()) != null && a(var10, var2)) {
               var5 = var1;
               break;
            }
         }
      }

      if(var5 != null) {
         var3.add(var1);
      }

      return var5;
   }

   private static boolean a(Element var0, Descriptor var1) {
      List var2;
      (var2 = var0.a(true)).add(var0);
      String var5 = var1.stringValue;
      Iterator var3 = var2.iterator();

      boolean var4;
      do {
         if(!var3.hasNext()) {
            return false;
         }

         Element var6 = (Element)var3.next();
         var4 = false;
         Descriptor var8;
         switch(var6.a) {
         case 3:
            ConstantElement var9 = (ConstantElement)var6;
            var4 = Descriptor.CLASS.equals((Object)var9.i()) && var5.equals(var9.j()) || var1.equals((Object)var9.i());
         case 4:
         case 6:
         case 7:
         case 9:
         case 11:
         default:
            break;
         case 5:
            var4 = var5.equals(((Openflower128)var6).g());
            break;
         case 8:
            var4 = var5.equals(((Openflower131)var6).i());
            break;
         case 10:
            var4 = (var8 = var6.getDescriptor()).type == 8 && var5.equals(var8.stringValue);
            break;
         case 12:
            Openflower135 var7;
            if((var7 = (Openflower135)var6).isDeclaration()) {
               var8 = var7.createDesriptor();
               if(var1.equals((Object)var8) || var8.arrayDepth > 0 && var1.stringValue.equals(var8.stringValue)) {
                  var4 = true;
               }
            }
         }
      } while(!var4);

      return true;
   }
}
