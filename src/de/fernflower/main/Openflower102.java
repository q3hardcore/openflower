package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.util.Configuration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower102 {

   public static void a(Openflower154_SomeSorter var0) {
      c(var0);
   }

   private static void c(Openflower154_SomeSorter var0) {
      boolean var2;
      Iterator var10;
      if(((Openflower154_SomeSorter)var0).c == 15) {
         ArrayList var1;
         (var1 = new ArrayList()).addAll(((Openflower154_SomeSorter)var0).t());
         var2 = false;

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            Openflower154_SomeSorter var4;
            if((var4 = (Openflower154_SomeSorter)var1.get(var3)).c == 15) {
               a((Openflower153)var4);
               if(var3 == var1.size() - 1 || a(var4, (Openflower154_SomeSorter)var1.get(var3 + 1))) {
                  Openflower154_SomeSorter var9 = var4.s();
                  Iterator var6 = var4.r().iterator();

                  while(var6.hasNext()) {
                     Openflower105 var5 = (Openflower105)var6.next();
                     var4.e(var5);
                     var5.b().a(1, var5, var9);
                     var9.d(var5);
                  }

                  Openflower154_SomeSorter var14;
                  Openflower105 var15;
                  if((var14 = (Openflower154_SomeSorter)var4.t().a()).q().isEmpty() && var3 < var1.size() - 1) {
                     var14.f(new Openflower105(1, var14, (Openflower154_SomeSorter)var1.get(var3 + 1)));
                  } else {
                     var10 = var14.q().iterator();

                     while(var10.hasNext()) {
                        var15 = (Openflower105)var10.next();
                        if(var3 == var1.size() - 1) {
                           if(var15.b == var4) {
                              ((Openflower154_SomeSorter)var0).c(var15);
                           }
                        } else {
                           var15.b().a(1, var15, 1);
                           var15.b.C().remove(var15);
                           var15.b = null;
                        }
                     }
                  }

                  var10 = var4.q().iterator();

                  while(var10.hasNext()) {
                     var15 = (Openflower105)var10.next();
                     var4.g(var15);
                  }

                  var10 = (new HashSet(var4.C())).iterator();

                  while(var10.hasNext()) {
                     if((var15 = (Openflower105)var10.next()).b() != var14) {
                        var14.c(var15);
                     }
                  }

                  var1.remove(var3);
                  var1.addAll(var3, var4.t());
                  --var3;
                  var2 = true;
               }
            }
         }

         if(var2) {
            Openflower153 var12;
            (var12 = new Openflower153(var1)).m();
            ((Openflower154_SomeSorter)var0).B().a((Openflower154_SomeSorter)var0, (Openflower154_SomeSorter)var12);
            var0 = var12;
         }
      }

      Openflower154_SomeSorter var7;
      if(((Openflower154_SomeSorter)var0).c == 15) {
         a((Openflower153)var0);
         if(((Openflower154_SomeSorter)var0).t().size() == 1) {
            if(!(var2 = (var7 = ((Openflower154_SomeSorter)var0).s()).q().isEmpty())) {
               Openflower105 var13 = (Openflower105)var7.q().get(0);
               if(!(var2 = ((Openflower154_SomeSorter)var0).q().isEmpty())) {
                  Openflower105 var11 = (Openflower105)((Openflower154_SomeSorter)var0).q().get(0);
                  if(var2 = var13.c() == var11.c()) {
                     var7.g(var13);
                  }
               }
            }

            if(var2) {
               ((Openflower154_SomeSorter)var0).B().a((Openflower154_SomeSorter)var0, var7);
               var0 = var7;
            }
         }
      }

      while(true) {
         var10 = ((Openflower154_SomeSorter)var0).t().iterator();

         do {
            if(!var10.hasNext()) {
               for(int var8 = 0; var8 < ((Openflower154_SomeSorter)var0).t().size(); ++var8) {
                  c((Openflower154_SomeSorter)((Openflower154_SomeSorter)var0).t().get(var8));
               }

               return;
            }
         } while(!(var7 = (Openflower154_SomeSorter)var10.next()).t().isEmpty() && var7.E() == null || var7.c == 8);

         b(var7);
      }
   }

   private static boolean a(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      List var2;
      if(!(var2 = (var0 = (Openflower154_SomeSorter)var0.t().a()).q()).isEmpty() && ((Openflower105)var2.get(0)).c() != var1) {
         return false;
      } else {
         Iterator var4 = var1.d(4).iterator();

         Openflower105 var3;
         do {
            if(!var4.hasNext()) {
               return true;
            }

            var3 = (Openflower105)var4.next();
         } while(var0 == var3.b() || var0.g(var3.b()));

         return false;
      }
   }

   private static void a(Openflower153 var0) {
      if(var0.t().size() > 1) {
         Openflower153 var1 = var0;

         Openflower154_SomeSorter var2;
         boolean var4;
         do {
            var2 = null;
            Openflower154_SomeSorter var3 = null;
            var4 = false;

            for(int var5 = var1.t().size() - 1; var5 >= 0; --var5) {
               var2 = var3;
               var3 = (Openflower154_SomeSorter)var1.t().get(var5);
               if(var2 != null && var3.E() != null && !var3.E().isEmpty()) {
                  if(var2.E() != null) {
                     var2.E().addAll(0, var3.E());
                     var3.E().clear();
                     var4 = true;
                  } else if((var2 = d(var2)) != null) {
                     var2.E().addAll(0, var3.E());
                     var3.E().clear();
                     var4 = true;
                  }
               }
            }
         } while(var4);

         while(true) {
            boolean var6 = false;
            Iterator var8 = var0.t().iterator();

            while(true) {
               if(var8.hasNext()) {
                  if((var2 = (Openflower154_SomeSorter)var8.next()).E() == null || !var2.E().isEmpty()) {
                     continue;
                  }

                  Openflower105 var7;
                  Openflower105 var9;
                  Iterator var10;
                  if(var2.q().isEmpty()) {
                     List var10000 = var2.d(4);
                     var9 = null;
                     if(var10000.isEmpty()) {
                        var10 = var2.r().iterator();

                        while(var10.hasNext()) {
                           (var7 = (Openflower105)var10.next()).b().g(var7);
                        }

                        var6 = true;
                     }
                  } else if((var9 = (Openflower105)var2.q().get(0)).a() != 32) {
                     var2.g(var9);
                     var10 = var2.r().iterator();

                     while(var10.hasNext()) {
                        var7 = (Openflower105)var10.next();
                        if(var9.a() != 1) {
                           var7.b().a(1, var7, var9.a());
                        }

                        var2.e(var7);
                        var7.b().a(1, var7, var9.c());
                        var9.c().d(var7);
                        if(var9.b != null) {
                           var9.b.c(var7);
                        }
                     }

                     var6 = true;
                  }

                  if(!var6) {
                     continue;
                  }

                  var0.t().a(var2.id);
               }

               if(!var6) {
                  var0.h((Openflower154_SomeSorter)var0.t().get(0));
                  return;
               }
               break;
            }
         }
      }
   }

   private static Openflower154_SomeSorter d(Openflower154_SomeSorter var0) {
      if(var0.E() != null) {
         return var0;
      } else {
         switch(var0.c) {
         case 2:
         case 6:
         case 10:
         case 15:
            return d(var0.s());
         default:
            return null;
         }
      }
   }

   public static void b(Openflower154_SomeSorter var0) {
      a(var0, false);
      Openflower146 var1 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)));
      if(var0.E() == null) {
         var1.b(new ArrayList());
      } else {
         var1.b(Openflower85.b(var0.E()));
      }

      var0.B().a(var0, (Openflower154_SomeSorter)var1);
   }

   public static void a(Openflower154_SomeSorter var0, boolean var1) {
      Iterator var3 = var0.t().iterator();

      Openflower105 var2;
      while(var3.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var3.next();
         var2 = null;
         a(var10000, true);
      }

      var0.t().clear();
      if(var1) {
         var3 = var0.q().iterator();

         while(var3.hasNext()) {
            var2 = (Openflower105)var3.next();
            var0.g(var2);
         }
      }

   }
}
