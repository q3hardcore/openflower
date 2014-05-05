package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower101;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower198;
import de.fernflower.main.Openflower74;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower123_assert;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Openflower52 {

   private static final Descriptor ASSERTION_ERROR = new Descriptor(8, 0, "java/lang/AssertionError");


   public static void a(Openflower74 var0) {
      Openflower74 var1 = var0;
      boolean var2 = Configuration.getBoolean("nns");
      Iterator var4 = var0.getClassInfo().getFields().iterator();

      FieldInfo var3;
      FieldInfo var10000;
      while(true) {
         if(!var4.hasNext()) {
            var10000 = null;
            break;
         }

         String var5 = Util.concat((var3 = (FieldInfo)var4.next()).getName(), var3.getDesc());
         if(var1.e().d(var5)) {
            int var6 = var3.access_flags;
            boolean var7 = (var3.access_flags & 4096) != 0 || var3.a().d("Synthetic");
            if((var6 & 8) != 0 && (var6 & 16) != 0 && (var7 || var2)) {
               Openflower198 var15 = Openflower198.a(var3.getDesc());
               Element var12;
               Openflower131 var13;
               Openflower129 var14;
               if(Descriptor.BOOLEAN.equals((Object)var15.e) && (var12 = (Element)var1.e().b(var5)).a == 6 && (var14 = (Openflower129)var12).i() == 12 && ((Element)var14.j().get(0)).a == 8 && (var13 = (Openflower131)var14.j().get(0)).l() != null && var13.l().a == 3 && "desiredAssertionStatus".equals(var13.o()) && "java/lang/Class".equals(var13.i()) && var13.g().isEmpty()) {
                  ConstantElement var16 = (ConstantElement)var13.l();
                  if(Descriptor.CLASS.equals((Object)var16.i()) && var1.getClassInfo().name.equals(var16.j())) {
                     var10000 = var3;
                     break;
                  }
               }
            }
         }
      }

      FieldInfo var8 = var10000;
      if(var10000 != null) {
         String var9 = Util.concat(var8.getName(), var8.getDesc());
         var2 = false;
         var4 = var0.getResults().iterator();

         while(var4.hasNext()) {
            MethodDecompileResult var10 = (MethodDecompileResult)var4.next();
            var3 = null;
            Openflower152 var11;
            if((var11 = var10.result) != null) {
               var2 |= a((Openflower154_SomeSorter)var11, var0.getClassInfo().name, var9);
            }
         }

         if(var2) {
            var0.d().add(var9);
         }
      }

   }

   private static boolean a(Openflower154_SomeSorter var0, String var1, String var2) {
      boolean var3 = false;

      Openflower154_SomeSorter var4;
      for(Iterator var5 = var0.t().iterator(); var5.hasNext(); var3 |= a(var4, var1, var2)) {
         var4 = (Openflower154_SomeSorter)var5.next();
      }

      boolean var15 = true;

      while(var15) {
         var15 = false;
         Iterator var6 = var0.t().iterator();

         while(true) {
            if(var6.hasNext()) {
               Openflower154_SomeSorter var16;
               if((var16 = (Openflower154_SomeSorter)var6.next()).c != 2) {
                  continue;
               }

               Openflower151 var7 = (Openflower151)var16;
               Openflower154_SomeSorter var10000 = var7.f();
               Openflower154_SomeSorter var10 = null;
               var10 = var10000;
               Openflower131 var14;
               if(var10000 != null && var10.E() != null && var10.E().size() == 1) {
                  label75: {
                     Openflower126 var22;
                     Element var25;
                     if((var25 = (Element)var10.E().get(0)).a == 4 && (var22 = (Openflower126)var25).f() == 1 && var22.g().a == 10) {
                        Openflower133 var24 = (Openflower133)var22.g();
                        if(ASSERTION_ERROR.equals((Object)var24.i()) && var24.g() != null) {
                           var14 = var24.g();
                           break label75;
                        }
                     }

                     var14 = null;
                  }
               } else {
                  var14 = null;
               }

               Openflower131 var27 = var14;
               boolean var13;
               if(var14 == null) {
                  var13 = false;
               } else {
                  Object[] var8;
                  if(!((Boolean)(var8 = a(var7.i().d().copy(), var1, var2))[1]).booleanValue()) {
                     var13 = false;
                  } else {
                     ArrayList var9 = new ArrayList();
                     Openflower129 var11 = null;
                     Element var12 = null;
                     if(var8[0] != null) {
                        var12 = Openflower101.a((Element)(var11 = new Openflower129(12, Arrays.asList(new Element[]{(Element)var8[0]}))));
                     }

                     var9.add(var12 == null?var11:var12);
                     if(!var27.g().isEmpty()) {
                        var9.add((Element)var27.g().get(0));
                     }

                     Openflower123_assert var18 = new Openflower123_assert(var9);
                     Openflower154_SomeSorter var19;
                     (var19 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(Arrays.asList(new Element[]{var18}));
                     Openflower154_SomeSorter var17 = var7.s();
                     if(var7.b == Openflower151.a || var17.E() != null && !var17.E().isEmpty()) {
                        var17.g(var7.j());
                        var17.g(var7.k());
                        ArrayList var28 = new ArrayList();
                        if(var17.E() != null && !var17.E().isEmpty()) {
                           var28.add(var17);
                        }

                        var28.add(var19);
                        if(var7.b == Openflower151.a) {
                           var28.add(var7.e());
                        }

                        Openflower153 var20;
                        (var20 = new Openflower153(var28)).m();

                        for(int var21 = 0; var21 < var20.t().size() - 1; ++var21) {
                           ((Openflower154_SomeSorter)var20.t().get(var21)).f(new Openflower105(1, (Openflower154_SomeSorter)var20.t().get(var21), (Openflower154_SomeSorter)var20.t().get(var21 + 1)));
                        }

                        if(var7.b == Openflower151.a) {
                           var10000 = var7.e();
                           var9 = null;
                           Openflower105 var23;
                           List var26;
                           if(!(var26 = var10000.q()).isEmpty() && (var23 = (Openflower105)var26.get(0)).b == var7) {
                              var20.c(var23);
                           }
                        }

                        var19 = var20;
                     }

                     ((Openflower154_SomeSorter)var19).D().addAll(var7.D());
                     var0.a((Openflower154_SomeSorter)var7, (Openflower154_SomeSorter)var19);
                     var13 = true;
                  }
               }

               if(!var13) {
                  continue;
               }

               var15 = true;
            }

            var3 |= var15;
            break;
         }
      }

      return var3;
   }

   private static Object[] a(Element var0, String var1, String var2) {
      if(var0.a == 6) {
         Openflower129 var3;
         if((var3 = (Openflower129)var0).i() == 48) {
            int var4;
            Element var5;
            for(var4 = 0; var4 < 2; ++var4) {
               Element var10000 = (Element)var3.j().get(var4);
               var5 = null;
               if(b(var10000, var1, var2)) {
                  return new Object[]{var3.j().get(1 - var4), Boolean.valueOf(true)};
               }
            }

            for(var4 = 0; var4 < 2; ++var4) {
               Object[] var6;
               if(((Boolean)(var6 = a(var5 = (Element)var3.j().get(var4), var1, var2))[1]).booleanValue()) {
                  if(var5 != var6[0]) {
                     var3.j().set(var4, (Element)var6[0]);
                  }

                  return new Object[]{var3, Boolean.valueOf(true)};
               }
            }
         } else if(b(var3, var1, var2)) {
            return new Object[]{null, Boolean.valueOf(true)};
         }
      }

      return new Object[]{var0, Boolean.valueOf(false)};
   }

   private static boolean b(Element var0, String var1, String var2) {
      Openflower129 var3;
      if(var0.a == 6 && (var3 = (Openflower129)var0).i() == 12 && ((Element)var3.j().get(0)).a == 5) {
         Openflower128 var4 = (Openflower128)var3.j().get(0);
         if(var1.equals(var4.g()) && var2.equals(Util.concat(var4.k(), var4.h()))) {
            return true;
         }
      }

      return false;
   }
}
