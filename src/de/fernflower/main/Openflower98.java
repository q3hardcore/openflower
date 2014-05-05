package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower155_SwitchPrinter;
import de.fernflower.main.Openflower96;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower130;
import de.fernflower.main.util.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower98 {

   public static void a(Openflower154_SomeSorter var0) {
      while(b(var0)) {
         ;
      }

      Openflower102.a(var0);
   }

   private static boolean b(Openflower154_SomeSorter var0) {
      boolean var1 = false;
      Iterator var3 = var0.t().iterator();

      while(var3.hasNext()) {
         Openflower154_SomeSorter var2;
         if((var2 = (Openflower154_SomeSorter)var3.next()).E() == null) {
            var1 |= b(var2);
         }
      }

      if(var0.c == 5) {
         boolean var10000 = var1;
         Openflower149_LoopPrinter var7;
         int var8;
         switch(var8 = (var7 = (Openflower149_LoopPrinter)var0).k()) {
         case 0:
            Openflower149_LoopPrinter var9 = var7;

            Openflower154_SomeSorter var10;
            for(var10 = var7.s(); var10.c == 15; var10 = var10.s()) {
               ;
            }

            boolean var10001;
            label79: {
               Openflower151 var4;
               if(var10.c == 2 && (var4 = (Openflower151)var10).s().E().isEmpty() && var4.b == 0) {
                  Openflower105 var5;
                  Openflower146 var11;
                  if(var4.f() == null) {
                     var5 = var4.j();
                     if(a((Openflower154_SomeSorter)var7, var5.c())) {
                        var7.b(2);
                        Openflower130 var6;
                        (var6 = (Openflower130)var4.i().copy()).b_();
                        var7.a(var6.d());
                        var4.s().g(var5);
                        var4.g((Openflower105)var4.q().get(0));
                        if(var7.q().isEmpty()) {
                           var5.a(var7);
                           if(var5.b == var7) {
                              var5.b = var7.B();
                           }

                           var7.f(var5);
                        }

                        if(var4 == var7.s()) {
                           (var11 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(new ArrayList());
                           var7.a(var4, var11);
                        } else {
                           (var10 = var4.B()).t().a(var4.id);
                           var10.h((Openflower154_SomeSorter)var10.t().get(0));
                        }

                        var10001 = true;
                        break label79;
                     }
                  } else {
                     var5 = (Openflower105)var4.q().get(0);
                     if(a((Openflower154_SomeSorter)var7, var5.c())) {
                        var7.b(2);
                        var7.a(((Openflower130)var4.i().copy()).d());
                        Openflower105 var14 = var4.j();
                        var4.s().g(var14);
                        var4.g(var5);
                        if(var7.q().isEmpty()) {
                           var5.a(var7);
                           if(var5.b == var7) {
                              var5.b = var7.B();
                           }

                           var7.f(var5);
                        }

                        if(var4.f() == null) {
                           (var11 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(new ArrayList());
                           var14.a(var11);
                           var11.f(var14);
                           var7.a(var4, var11);
                        } else {
                           var10.B().a(var10, var4.f());
                           Iterator var12 = var5.c().d(4).iterator();

                           while(var12.hasNext()) {
                              Openflower105 var13 = (Openflower105)var12.next();
                              if(var9.g(var13.b)) {
                                 var9.c(var13);
                              }
                           }

                           Openflower96.a((Openflower154_SomeSorter)var9);
                        }

                        var10001 = true;
                        break label79;
                     }
                  }
               }

               var10001 = false;
            }

            if(var10001) {
               b(var7);
            } else {
               a(var7);
            }
         case 1:
         default:
            break;
         case 2:
            b(var7);
         }

         var1 = var10000 | var7.k() != var8;
      }

      return var1;
   }

   private static boolean a(Openflower149_LoopPrinter var0) {
      Openflower154_SomeSorter var1;
      for(var1 = var0.s(); var1.c == 15; var1 = (Openflower154_SomeSorter)var1.t().a()) {
         ;
      }

      Openflower151 var2;
      if(var1.c == 2 && (var2 = (Openflower151)var1).b == 0 && var2.f() == null) {
         Openflower105 var3 = var2.j();
         Openflower105 var4 = (Openflower105)var2.q().get(0);
         if(var3.a() == 4 && var4.a() == 8 && var4.b == var0 && a((Openflower154_SomeSorter)var0, var3.c()) || var3.a() == 8 && var4.a() == 4 && var3.b == var0 && a((Openflower154_SomeSorter)var0, var4.c())) {
            Set var5;
            (var5 = var0.getDataAsSet(8, 0)).remove(var1);
            if(!var5.isEmpty()) {
               return false;
            }

            var0.b(1);
            Openflower130 var6 = (Openflower130)var2.i().copy();
            if(var3.a() == 4) {
               var6.b_();
            }

            var0.a(var6.d());
            var2.s().g(var3);
            var2.g(var4);
            Openflower105 var7;
            if(var2.s().E().isEmpty()) {
               a(var0, var2);
            } else {
               var2.b(var2.s().E());
               var7 = new Openflower105(8, var2, var0);
               var2.f(var7);
               var0.c(var7);
            }

            if(var0.q().isEmpty()) {
               (var7 = var4.a() == 8?var3:var4).a(var0);
               if(var7.b == var0) {
                  var7.b = var0.B();
               }

               var0.f(var7);
            }

            return true;
         }
      }

      return false;
   }

   public static boolean a(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      Set var2;
      if((var2 = var0.getDataAsSet(1073741824, 1)).isEmpty()) {
         Openflower154_SomeSorter var5;
         if((var5 = var0.B()) == null) {
            return false;
         } else {
            switch(var5.c) {
            case 5:
               if(var1 == var5) {
                  return true;
               }

               return false;
            case 13:
               if(var1.c == 14) {
                  return true;
               }

               return false;
            case 6:
               Openflower155_SwitchPrinter var3 = (Openflower155_SwitchPrinter)var5;

               for(int var4 = 0; var4 < var3.h().size() - 1; ++var4) {
                  if((Openflower154_SomeSorter)var3.h().get(var4) == var0) {
                     if((var0 = (Openflower154_SomeSorter)var3.h().get(var4 + 1)).E() != null && var0.E().isEmpty()) {
                        var0 = ((Openflower105)var0.q().get(0)).c();
                     }

                     if(var1 == var0) {
                        return true;
                     }

                     return false;
                  }
               }
            default:
               return a(var5, var1);
            }
         }
      } else {
         return var2.contains(var1);
      }
   }

   private static boolean b(Openflower149_LoopPrinter var0) {
      Element var1 = null;
      Openflower154_SomeSorter var2 = null;
      Openflower154_SomeSorter var3 = null;
      if((var2 = c(var0.s())) != null && !var2.E().isEmpty()) {
         List var4;
         List var10000 = var4 = var2.E();
         var1 = (Element)var10000.get(var10000.size() - 1);
         boolean var5 = false;
         if(var4.size() == 1 && var2.r().size() > 1) {
            var5 = true;
         }

         boolean var9 = var5 || var1.a == 2 || var1.a == 6;
         boolean var7 = false;
         if(!var9) {
            return false;
         } else {
            boolean var10 = false;

            Openflower154_SomeSorter var6;
            for(Object var8 = var0; (var6 = ((Openflower154_SomeSorter)var8).B()) != null && var6.c == 15; var8 = var6) {
               if(var8 != var6.s()) {
                  if((var3 = c((Openflower154_SomeSorter)((Openflower154_SomeSorter)var8).getDataAsList(1, 0).get(0))) != null && !var3.E().isEmpty() && ((Element)var3.E().get(var3.E().size() - 1)).a == 2) {
                     var10 = true;
                  }
                  break;
               }
            }

            if(var10 || var5) {
               Set var12;
               (var12 = var0.getDataAsSet(8, 0)).remove(var2);
               if(!var12.isEmpty()) {
                  return false;
               }

               var0.b(3);
               if(var10) {
                  var0.c((Element)var3.E().remove(var3.E().size() - 1));
               }

               var0.b((Element)var2.E().remove(var2.E().size() - 1));
            }

            if(var2.E().isEmpty()) {
               List var11;
               if(!(var11 = var2.q()).isEmpty()) {
                  var2.g((Openflower105)var11.get(0));
               }

               a(var0, var2);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void a(Openflower149_LoopPrinter var0, Openflower154_SomeSorter var1) {
      if(var1 == var0.s()) {
         Openflower146 var4;
         (var4 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(new ArrayList());
         var0.a(var1, var4);
      } else {
         Iterator var3 = var1.r().iterator();

         while(var3.hasNext()) {
            Openflower105 var2;
            (var2 = (Openflower105)var3.next()).b().a(1, var2, 8);
            var1.e(var2);
            var2.b().a(1, var2, var0);
            var0.d(var2);
            var0.c(var2);
         }

         var1.B().t().a(var1.id);
      }
   }

   private static Openflower154_SomeSorter c(Openflower154_SomeSorter var0) {
      if(var0.E() != null) {
         return var0;
      } else {
         switch(var0.c) {
         case 15:
            for(int var1 = var0.t().size() - 1; var1 >= 0; --var1) {
               Openflower154_SomeSorter var2;
               if((var2 = c((Openflower154_SomeSorter)var0.t().get(var1))) == null || !var2.E().isEmpty()) {
                  return var2;
               }
            }
         default:
            return null;
         }
      }
   }
}
