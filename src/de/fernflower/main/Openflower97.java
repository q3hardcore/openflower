package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public final class Openflower97 {

   public static boolean a(Openflower154_SomeSorter var0) {
      boolean var1;
      if(var1 = b(var0) != 0) {
         Openflower102.a(var0);
      }

      return var1;
   }

   private static int b(Openflower154_SomeSorter var0) {
      boolean var1 = false;

      while(true) {
         boolean var2 = false;
         Iterator var4 = var0.t().iterator();

         while(true) {
            Iterator var3;
            if(var4.hasNext()) {
               Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var4.next();
               var3 = null;
               int var9 = b(var10000);
               var1 |= var9 != 0;
               if(var9 != 2) {
                  continue;
               }

               var2 = true;
            }

            if(!var2) {
               if(var0.c == 5) {
                  Openflower149_LoopPrinter var7;
                  boolean var10;
                  if((var7 = (Openflower149_LoopPrinter)var0).k() != 0) {
                     var10 = false;
                  } else {
                     var3 = var7.C().iterator();

                     while(true) {
                        if(!var3.hasNext()) {
                           Openflower154_SomeSorter var11;
                           for(var11 = var7.s(); var11.c == 15; var11 = (Openflower154_SomeSorter)var11.t().a()) {
                              ;
                           }

                           Openflower154_SomeSorter var5;
                           Openflower151 var12;
                           label79: {
                              if(var11.c == 2 && (var12 = (Openflower151)var11).b == 0 && var12.f() != null) {
                                 var5 = var12.f();
                                 Openflower105 var6;
                                 if((var6 = (Openflower105)var12.q().get(0)).a() == 8 && var6.b == var7) {
                                    Set var13;
                                    (var13 = var7.getDataAsSet(8, 0)).remove(var11);
                                    if(var13.isEmpty() && a(var7, var5, var5)) {
                                       a(var7, var12);
                                       var10 = true;
                                       break label79;
                                    }
                                 }
                              }

                              var10 = false;
                           }

                           if(!var10) {
                              label124: {
                                 for(var11 = var7.s(); var11.c == 15; var11 = var11.s()) {
                                    ;
                                 }

                                 if(var11.c == 2 && (var12 = (Openflower151)var11).s().E().isEmpty() && var12.b == 0 && var12.f() != null) {
                                    var5 = var12.f();
                                    if(a(var7, var5, var5)) {
                                       a(var7, var12);
                                       break label124;
                                    }
                                 }

                                 var10 = false;
                                 break;
                              }
                           }

                           var10 = true;
                           break;
                        }

                        Openflower105 var8;
                        if((var8 = (Openflower105)var3.next()).a() != 8 && var8.c().c != 14) {
                           var10 = false;
                           break;
                        }
                     }
                  }

                  if(var10) {
                     return 2;
                  }
               }

               if(var1) {
                  return 1;
               }

               return 0;
            }
            break;
         }
      }
   }

   private static boolean a(Openflower149_LoopPrinter var0, Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      Iterator var4 = var2.q().iterator();

      while(var4.hasNext()) {
         Openflower105 var3 = (Openflower105)var4.next();
         if(var0.f(var3.c()) && !var1.f(var3.c())) {
            return false;
         }
      }

      var4 = var2.t().iterator();

      while(var4.hasNext()) {
         Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)var4.next();
         if(!a(var0, var1, var5)) {
            return false;
         }
      }

      return true;
   }

   private static void a(Openflower149_LoopPrinter var0, Openflower151 var1) {
      Openflower154_SomeSorter var2 = var1.f();
      Openflower105 var3 = var1.j();
      var1.c((Openflower154_SomeSorter)null);
      var3.b().a(1, var3, 4);
      var3.b = var0;
      var1.t().a(var2.id);
      var0.c(var3);
      Openflower153 var5 = new Openflower153(Arrays.asList(new Openflower154_SomeSorter[]{var0, var2}));
      var0.B().a((Openflower154_SomeSorter)var0, (Openflower154_SomeSorter)var5);
      var5.m();
      var0.f(new Openflower105(1, var0, var2));
      Iterator var4 = (new ArrayList(var5.C())).iterator();

      Openflower105 var6;
      while(var4.hasNext()) {
         if((var6 = (Openflower105)var4.next()).a() == 8 || var6 == var3) {
            var0.c(var6);
         }
      }

      var4 = var5.d(8).iterator();

      while(var4.hasNext()) {
         var6 = (Openflower105)var4.next();
         if(var0.g(var6.b())) {
            var5.e(var6);
            var6.b().a(1, var6, var0);
            var0.d(var6);
         }
      }

   }
}
