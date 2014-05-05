package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower155_SwitchPrinter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower95 {

   public static boolean a(Openflower152 var0) {
      boolean var1;
      if(var1 = a((Openflower154_SomeSorter)var0)) {
         Openflower102.a((Openflower154_SomeSorter)var0);
      }

      return var1;
   }

   private static boolean a(Openflower154_SomeSorter var0) {
      boolean var1 = false;

      Openflower154_SomeSorter var2;
      for(Iterator var3 = var0.t().iterator(); var3.hasNext(); var1 |= a(var2)) {
         var2 = (Openflower154_SomeSorter)var3.next();
      }

      if(var0.c == 15) {
         Openflower153 var12 = (Openflower153)var0;

         for(int var13 = 1; var13 < var12.t().size(); ++var13) {
            Openflower154_SomeSorter var5;
            Openflower153 var11;
            Openflower154_SomeSorter var10000;
            boolean var14;
            Openflower105 var15;
            label100: {
               var11 = var12;
               var5 = (Openflower154_SomeSorter)var12.t().get(var13);
               var10000 = (Openflower154_SomeSorter)var12.t().get(var13 - 1);
               List var6 = null;
               if(!var10000.A() && (var6 = var5.d(4)).size() == 1) {
                  Openflower105 var7;
                  Openflower154_SomeSorter var9 = (var15 = var7 = (Openflower105)var6.get(0)).b();
                  Openflower154_SomeSorter var17 = var15.c();

                  while(true) {
                     Openflower154_SomeSorter var10;
                     if((var10 = var9.B()).g(var17)) {
                        var14 = true;
                        break;
                     }

                     if(var10.c != 7 && var10.c != 12) {
                        if(var10.c == 10 && var10.t().get(1) == var9) {
                           var14 = false;
                           break;
                        }
                     } else if(var10.s() == var9) {
                        var14 = false;
                        break;
                     }

                     var9 = var10;
                  }

                  if(var14) {
                     if(var7.d) {
                        var14 = true;
                        break label100;
                     }

                     int var8 = var13;

                     while(true) {
                        if(var8 >= var11.t().size()) {
                           var14 = true;
                           break label100;
                        }

                        if(!b((Openflower154_SomeSorter)var11.t().get(var8), var11)) {
                           break;
                        }

                        ++var8;
                     }
                  }
               }

               var14 = false;
            }

            if(var14) {
               int var4 = var13;
               var11 = var12;
               var5 = (Openflower154_SomeSorter)var12.t().get(var13);
               var10000 = (Openflower154_SomeSorter)var12.t().get(var13 - 1);
               var10000.g((Openflower105)var10000.q().get(0));
               Openflower154_SomeSorter var16;
               Openflower154_SomeSorter var19 = (var16 = (var15 = (Openflower105)var5.d(4).get(0)).b()).B();
               var16.g(var15);
               ArrayList var18 = new ArrayList();

               for(int var21 = var12.t().size() - 1; var21 >= var4; --var21) {
                  var18.add(0, (Openflower154_SomeSorter)var11.t().remove(var21));
               }

               if(var19.c == 2 && ((Openflower151)var19).b == 0 && var16 == var19.s()) {
                  Openflower151 var24 = (Openflower151)var19;
                  Openflower153 var20;
                  (var20 = new Openflower153(var18)).m();
                  Openflower105 var25 = new Openflower105(1, var16, var20);
                  var16.f(var25);
                  var24.b(var25);
                  var24.c(var20);
                  var24.t().a((Object)var20, (Object)var20.id);
                  var20.i(var24);
               } else {
                  var18.add(0, var16);
                  Openflower153 var22;
                  (var22 = new Openflower153(var18)).m();
                  var19.a(var16, (Openflower154_SomeSorter)var22);
                  Iterator var23 = var22.d(8).iterator();

                  while(var23.hasNext()) {
                     var15 = (Openflower105)var23.next();
                     var22.e(var15);
                     var15.b().a(1, var15, var16);
                     var16.d(var15);
                     var16.c(var15);
                  }

                  if(var19.c == 6) {
                     ((Openflower155_SwitchPrinter)var19).e();
                  }

                  var16.f(new Openflower105(1, var16, var5));
               }

               return true;
            }
         }
      }

      return var1;
   }

   private static boolean b(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      Iterator var3 = var0.q().iterator();

      while(var3.hasNext()) {
         Openflower105 var2;
         if((var2 = (Openflower105)var3.next()).a() != 1 && var2.c().c != 14 && !var1.g(var2.c())) {
            return false;
         }
      }

      var3 = var0.t().iterator();

      while(var3.hasNext()) {
         if(!b((Openflower154_SomeSorter)var3.next(), var1)) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      return var1.c != 5 && var1.c != 6?true:((var0 = var0.B()) == var1?false:var0.c == 5 || var0.c == 6 || a(var0, var1));
   }
}
