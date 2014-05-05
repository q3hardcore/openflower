package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower74;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower61 {

   public static void a(Openflower74 var0) {
      MethodDecompileResult var1;
      Openflower74 var13;
      if((var1 = var0.getResult("<clinit>", "()V")) != null && var1.result != null) {
         var13 = var0;
         Openflower152 var3 = var1.result;
         ClassInfo var4 = var0.getClassInfo();
         Openflower154_SomeSorter var5;
         if((var5 = a((Openflower154_SomeSorter)var3)) != null) {
            while(!var5.E().isEmpty()) {
               Element var6 = (Element)var5.E().get(0);
               boolean var7 = false;
               Openflower124 var8;
               Openflower128 var9;
               if(var6.a == 2 && (var8 = (Openflower124)var6).g().a == 5 && (var9 = (Openflower128)var8.g()).j() && var9.g().equals(var4.name)) {
                  String var24 = Util.concat(var9.k(), var9.h());
                  if(!var13.e().d(var24)) {
                     var13.e().a((Object)var8.h(), (Object)var24);
                     var5.E().remove(0);
                     var7 = true;
                  }
               }

               if(!var7) {
                  break;
               }
            }
         }
      }

      var13 = var0;
      ClassInfo var14 = var0.getClassInfo();
      boolean var15 = ((ClassNode)Configuration.getClassProcessor().getInnerMap().get(var14.name)).a == 2;
      ArrayList var16 = new ArrayList();
      ArrayList var17 = new ArrayList();
      Iterator var20 = var0.getResults().iterator();

      label127:
      while(true) {
         Element var26;
         if(!var20.hasNext()) {
            if(!var16.isEmpty()) {
               while(true) {
                  String var18 = null;
                  Element var23 = null;

                  for(int var21 = 0; var21 < var16.size(); ++var21) {
                     List var25;
                     if((var25 = (List)var16.get(var21)).size() < (var15?1:2)) {
                        break label127;
                     }

                     var26 = (Element)var25.get(var15?0:1);
                     boolean var10 = false;
                     Openflower124 var28;
                     if(var26.a == 2 && (var28 = (Openflower124)var26).g().a == 5) {
                        Openflower128 var11;
                        String var12 = Util.concat((var11 = (Openflower128)var28.g()).k(), var11.h());
                        if(!var11.j() && var11.g().equals(var14.name) && var13.getClassInfo().getFields().d(var12) && a(var28.h(), (MethodDecompileResult)var17.get(var21))) {
                           if(var18 == null) {
                              var18 = var12;
                              var23 = var28.h();
                           } else if(!var18.equals(var12) || !var23.equals(var28.h())) {
                              break label127;
                           }

                           var10 = true;
                        }
                     }

                     if(!var10) {
                        break label127;
                     }
                  }

                  if(var13.f().d(var18)) {
                     break label127;
                  }

                  var13.f().a((Object)var23, (Object)var18);
                  Iterator var27 = var16.iterator();

                  while(var27.hasNext()) {
                     ((List)var27.next()).remove(var15?0:1);
                  }
               }
            }
            break;
         }

         MethodDecompileResult var19 = (MethodDecompileResult)var20.next();
         if("<init>".equals(var19.method.getName()) && var19.result != null) {
            Openflower154_SomeSorter var22;
            if((var22 = a((Openflower154_SomeSorter)var19.result)) == null || var22.E().isEmpty()) {
               break;
            }

            var16.add(var22.E());
            var17.add(var19);
            var26 = (Element)var22.E().get(0);
            if(!var15 && (var26.a != 8 || !a((Openflower131)var26, var19, var13, false))) {
               break;
            }
         }
      }

      b(var0);
      if(Configuration.getBoolean("hes")) {
         c(var0);
      }

   }

   private static void b(Openflower74 var0) {
      Iterator var2 = var0.getResults().iterator();

      while(var2.hasNext()) {
         MethodDecompileResult var1 = (MethodDecompileResult)var2.next();
         if("<init>".equals(var1.method.getName()) && var1.result != null) {
            Openflower154_SomeSorter var3;
            if((var3 = a((Openflower154_SomeSorter)var1.result)) == null) {
               return;
            }

            int var4 = 0;

            List var8;
            for(Iterator var6 = (var8 = var3.E()).iterator(); var6.hasNext(); ++var4) {
               Element var5 = (Element)var6.next();
               byte var7 = 0;
               if(var5.a == 2) {
                  Openflower124 var9;
                  FieldInfo var10;
                  Openflower128 var11;
                  if((var9 = (Openflower124)var5).g().a == 5 && var9.h().a == 12 && (var11 = (Openflower128)var9.g()).g().equals(var0.getClassInfo().name) && (var10 = var0.getClassInfo().getField(var11.k(), var11.h())) != null && (var10.access_flags & 16) != 0) {
                     var7 = 1;
                  }
               } else if(var4 > 0 && var5.a == 8 && a((Openflower131)var5, var1, var0, true)) {
                  var8.add(0, (Element)var8.remove(var4));
                  var7 = 2;
               }

               if(var7 != 1) {
                  break;
               }
            }
         }
      }

   }

   private static void c(Openflower74 var0) {
      Iterator var2 = var0.getResults().iterator();

      while(true) {
         MethodDecompileResult var1;
         do {
            do {
               if(!var2.hasNext()) {
                  return;
               }

               var1 = (MethodDecompileResult)var2.next();
            } while(!"<init>".equals(var1.method.getName()));
         } while(var1.result == null);

         Openflower154_SomeSorter var3;
         if((var3 = a((Openflower154_SomeSorter)var1.result)) == null || var3.E().isEmpty()) {
            return;
         }

         Element var4;
         Openflower131 var5;
         if((var4 = (Element)var3.E().get(0)).a == 8 && a(var5 = (Openflower131)var4, var1, var0, false) && var5.g().isEmpty()) {
            var3.E().remove(0);
         }
      }
   }

   private static boolean a(Element var0, MethodDecompileResult var1) {
      List var2;
      (var2 = var0.a(true)).add(var0);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         switch((var0 = (Element)var5.next()).a) {
         case 5:
            return false;
         case 12:
            IntPair var3 = new IntPair((Openflower135)var0);
            String var4;
            if(!var1.varProcessor.b().contains(var3) && !(var4 = var1.varProcessor.getName(var3)).equals("this") && !var4.endsWith(".this")) {
               return false;
            }
         }
      }

      return true;
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.E() != null) {
         return var0;
      } else if(var0.needsLabel()) {
         return null;
      } else {
         switch(var0.c) {
         case 2:
         case 6:
         case 10:
         case 13:
         case 15:
            return a(var0.s());
         default:
            return null;
         }
      }
   }

   private static boolean a(Openflower131 var0, MethodDecompileResult var1, Openflower74 var2, boolean var3) {
      if(var0.j() == 2 && var0.l().a == 12) {
         Openflower135 var4 = (Openflower135)var0.l();
         IntPair var5 = new IntPair(var4);
         if((String)var1.varProcessor.getTypes().get(var5) != null && (var3 || !var2.getClassInfo().name.equals(var0.i()))) {
            return true;
         }
      }

      return false;
   }
}
