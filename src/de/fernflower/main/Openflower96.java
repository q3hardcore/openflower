package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower155_SwitchPrinter;
import de.fernflower.main.Openflower156;
import de.fernflower.main.Openflower95;
import de.fernflower.main.Openflower98;
import de.fernflower.main.codeprinter.elements.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower96 {

   public static void a(Openflower152 var0) {
      e(var0);
      d(var0);
      c(var0);
      a(var0, new HashSet());
      a((Openflower154_SomeSorter)var0);
   }

   public static void b(Openflower152 var0) {
      f(var0);
      g(var0);
      h(var0);
      Iterator var1 = var0.e().r().iterator();

      while(var1.hasNext()) {
         Openflower105 var3;
         List var2 = (var3 = (Openflower105)var1.next()).b().E();
         if(var3.a() == 32 || var2 != null && !var2.isEmpty() && ((Element)var2.get(var2.size() - 1)).a == 4) {
            var3.c = false;
         }
      }

   }

   private static void c(Openflower154_SomeSorter var0) {
      Iterator var2 = var0.q().iterator();

      while(var2.hasNext()) {
         Openflower105 var1;
         switch((var1 = (Openflower105)var2.next()).a()) {
         case 4:
            Openflower154_SomeSorter var3;
            if((var3 = var1.c()).c != 14) {
               Openflower154_SomeSorter var4 = var3.B();
               ArrayList var5 = new ArrayList();
               if(var4.c == 15) {
                  var5.addAll(((Openflower153)var4).t());
               } else if(var4.c == 6) {
                  var5.addAll(((Openflower155_SwitchPrinter)var4).h());
               }

               for(int var6 = 0; var6 < var5.size(); ++var6) {
                  if(var5.get(var6) == var3) {
                     ((Openflower154_SomeSorter)var5.get(var6 - 1)).c(var1);
                     break;
                  }
               }
            }
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            if(var1.c() != var1.b) {
               var1.c().c(var1);
            }
         }
      }

      var2 = var0.t().iterator();

      while(var2.hasNext()) {
         c((Openflower154_SomeSorter)var2.next());
      }

   }

   private static void d(Openflower154_SomeSorter var0) {
      Iterator var2 = var0.t().iterator();

      Openflower105 var1;
      while(var2.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var2.next();
         var1 = null;
         d(var10000);
      }

      if(!var0.A()) {
         var2 = var0.c(12).iterator();

         while(var2.hasNext()) {
            var1 = (Openflower105)var2.next();
            var0.g(var1);
         }
      }

   }

   public static void a(Openflower154_SomeSorter var0, HashSet var1) {
      boolean var2;
      if(!(var2 = var0.c != 5)) {
         Openflower149_LoopPrinter var4;
         var2 = (var4 = (Openflower149_LoopPrinter)var0).k() == 0 || var4.k() == 2 || var4.k() == 3 && var4.i() == null;
      }

      if(var2) {
         var1.addAll(var0.d(8));
      }

      Iterator var3;
      if(var2 && var0.c == 5) {
         var3 = var1.iterator();

         while(var3.hasNext()) {
            Openflower105 var5 = (Openflower105)var3.next();
            if(var0.g(var5.b())) {
               var5.c().e(var5);
               var5.b().a(1, var5, var0);
               var0.d(var5);
               var0.c(var5);
            }
         }
      }

      var3 = var0.t().iterator();

      while(var3.hasNext()) {
         Openflower154_SomeSorter var6;
         if((var6 = (Openflower154_SomeSorter)var3.next()) == var0.s()) {
            a(var6, var1);
         } else {
            a(var6, new HashSet());
         }
      }

   }

   public static void a(Openflower154_SomeSorter var0) {
      Iterator var2 = (new ArrayList(var0.C())).iterator();

      while(var2.hasNext()) {
         Openflower105 var1;
         if((var1 = (Openflower105)var2.next()).a() == 4) {
            Iterator var4 = var0.t().iterator();

            while(var4.hasNext()) {
               Openflower154_SomeSorter var3;
               if((var3 = (Openflower154_SomeSorter)var4.next()).g(var1.b()) && Openflower98.a(var3, var1.c())) {
                  var3.c(var1);
               }
            }
         }
      }

      var2 = var0.t().iterator();

      while(var2.hasNext()) {
         a((Openflower154_SomeSorter)var2.next());
      }

   }

   private static void e(Openflower154_SomeSorter var0) {
      Iterator var2 = var0.t().iterator();

      Openflower105 var1;
      while(var2.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var2.next();
         var1 = null;
         e(var10000);
      }

      for(var2 = var0.q().iterator(); var2.hasNext(); var1.c = true) {
         (var1 = (Openflower105)var2.next()).d = true;
      }

   }

   private static HashMap f(Openflower154_SomeSorter var0) {
      HashMap var1 = new HashMap();
      if(var0.E() != null) {
         return var1;
      } else {
         switch(var0.c) {
         case 2:
            Openflower151 var8;
            if((var8 = (Openflower151)var0).f() == null) {
               a(var8.s(), var1, (Openflower154_SomeSorter)null);
            } else {
               if(var8.f() != null) {
                  var1 = f(var8.f());
                  a(var8.f(), var1, (Openflower154_SomeSorter)null);
               }

               HashMap var15 = null;
               if(var8.e() != null) {
                  var15 = f(var8.e());
                  a(var8.e(), var15, (Openflower154_SomeSorter)null);
               }

               if(var15 != null) {
                  Iterator var9 = var15.entrySet().iterator();

                  while(var9.hasNext()) {
                     Entry var17 = (Entry)var9.next();
                     if(var1.containsKey(var17.getKey())) {
                        ((List)var1.get(var17.getKey())).addAll((Collection)var17.getValue());
                     } else {
                        var1.put((Openflower154_SomeSorter)var17.getKey(), (List)var17.getValue());
                     }
                  }
               }
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 11:
         case 14:
         default:
            break;
         case 5:
            var1 = f(var0.s());
            a(var0.s(), var1, var0);
            break;
         case 6:
            Openflower155_SwitchPrinter var7 = (Openflower155_SwitchPrinter)var0;

            Openflower154_SomeSorter var12;
            int var14;
            for(var14 = 0; var14 < var7.h().size() - 1; ++var14) {
               var12 = (Openflower154_SomeSorter)var7.h().get(var14);
               if((var0 = (Openflower154_SomeSorter)var7.h().get(var14 + 1)).E() != null && var0.E().isEmpty()) {
                  var0 = ((Openflower105)var0.q().get(0)).c();
               }

               a(var12, f(var12), var0);
            }

            if((var14 = var7.h().size() - 1) >= 0) {
               if((var12 = (Openflower154_SomeSorter)var7.h().get(var14)).E() != null && var12.E().isEmpty()) {
                  Openflower105 var5 = (Openflower105)var12.q().get(0);
                  var1.put(var5.c(), new ArrayList((Collection)Arrays.asList(new Openflower105[]{var5})));
               } else {
                  var1 = f(var12);
                  a(var12, var1, (Openflower154_SomeSorter)null);
               }
            }
            break;
         case 7:
         case 12:
            Iterator var11 = var0.t().iterator();

            while(var11.hasNext()) {
               Openflower154_SomeSorter var2;
               HashMap var13 = f(var2 = (Openflower154_SomeSorter)var11.next());
               a(var2, var13, (Openflower154_SomeSorter)null);
               if((var0.c == 7 || var2 == var0.s()) && var13 != null) {
                  Iterator var16 = var13.entrySet().iterator();

                  while(var16.hasNext()) {
                     Entry var6 = (Entry)var16.next();
                     if(var1.containsKey(var6.getKey())) {
                        ((List)var1.get(var6.getKey())).addAll((Collection)var6.getValue());
                     } else {
                        var1.put((Openflower154_SomeSorter)var6.getKey(), (List)var6.getValue());
                     }
                  }
               }
            }

            return var1;
         case 10:
            Openflower156 var10;
            a((var10 = (Openflower156)var0).s(), f(var0.s()), var10.f());
            var1 = f(var10.f());
            a(var10.f(), var1, (Openflower154_SomeSorter)null);
            break;
         case 13:
            var1 = f(var0.s());
            a(var0.s(), var1, ((Openflower152)var0).e());
            break;
         case 15:
            int var3;
            Openflower154_SomeSorter var4;
            for(var3 = 0; var3 < var0.t().size() - 1; ++var3) {
               Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var0.t().get(var3);
               var4 = null;
               a(var10000, f(var10000), (Openflower154_SomeSorter)var0.t().get(var3 + 1));
            }

            var1 = f(var4 = (Openflower154_SomeSorter)var0.t().get(var3));
            a(var4, var1, (Openflower154_SomeSorter)null);
         }

         return var1;
      }
   }

   private static void a(Openflower154_SomeSorter var0, HashMap var1, Openflower154_SomeSorter var2) {
      Openflower105 var3 = null;
      List var4;
      if(!(var4 = var0.q()).isEmpty()) {
         if((var3 = (Openflower105)var4.get(0)).c() == var2) {
            var3.d = false;
            var3 = null;
         } else {
            var2 = var3.c();
         }
      }

      if(var0.c == 5 && ((Openflower149_LoopPrinter)var0).k() == 0) {
         var2 = null;
      }

      if(var2 == null) {
         if(var1.size() == 1 && (var4 = (List)var1.values().iterator().next()).size() > 1 && ((Openflower154_SomeSorter)var1.keySet().iterator().next()).c != 14) {
            Openflower105 var5 = (Openflower105)var4.get(0);
            Openflower154_SomeSorter var6;
            if(!(var6 = var0.B()).g(var5.b)) {
               var6 = var5.b;
            }

            Openflower105 var8 = new Openflower105(var5.a(), var0, var5.c(), var6);
            var0.f(var8);

            for(Iterator var7 = var4.iterator(); var7.hasNext(); ((Openflower105)var7.next()).d = false) {
               ;
            }

            var1.put(var8.c(), new ArrayList((Collection)Arrays.asList(new Openflower105[]{var8})));
         }
      } else {
         boolean var10 = false;
         Iterator var16 = var1.entrySet().iterator();

         while(var16.hasNext()) {
            Entry var11;
            if((var11 = (Entry)var16.next()).getKey() == var2) {
               for(Iterator var12 = ((List)var11.getValue()).iterator(); var12.hasNext(); ((Openflower105)var12.next()).d = false) {
                  ;
               }

               var10 = true;
               break;
            }
         }

         if(var0.q().isEmpty() && !var10) {
            List var14 = null;
            Iterator var9 = var1.entrySet().iterator();

            while(var9.hasNext()) {
               Entry var15;
               if(((Openflower154_SomeSorter)(var15 = (Entry)var9.next()).getKey()).c != 14 && (var14 == null || ((List)var15.getValue()).size() > var14.size())) {
                  var14 = (List)var15.getValue();
               }
            }

            if(var14 != null && var14.size() > 1) {
               Openflower105 var17 = (Openflower105)var14.get(0);
               if(!(var2 = var0.B()).g(var17.b)) {
                  var2 = var17.b;
               }

               Openflower105 var13 = new Openflower105(var17.a(), var0, var17.c(), var2);
               var0.f(var13);

               for(var9 = var14.iterator(); var9.hasNext(); ((Openflower105)var9.next()).d = false) {
                  ;
               }
            }
         }

         var1.clear();
      }

      if(var3 != null) {
         var1.put(var3.c(), new ArrayList((Collection)Arrays.asList(new Openflower105[]{var3})));
      }

   }

   private static void g(Openflower154_SomeSorter var0) {
      Openflower155_SwitchPrinter var1;
      int var2;
      Openflower154_SomeSorter var3;
      if(var0.c == 6 && (var2 = (var1 = (Openflower155_SwitchPrinter)var0).h().size() - 1) >= 0 && (var3 = (Openflower154_SomeSorter)var1.h().get(var2)).E() != null && var3.E().isEmpty() && !((Openflower105)var3.q().get(0)).d) {
         List var5;
         (var5 = (List)var1.g().get(var2)).remove(var1.i());
         if(var5.isEmpty()) {
            var1.h().remove(var2);
            var1.g().remove(var2);
         }
      }

      Iterator var4 = var0.t().iterator();

      while(var4.hasNext()) {
         g((Openflower154_SomeSorter)var4.next());
      }

   }

   private static HashSet[] h(Openflower154_SomeSorter var0) {
      HashSet var1 = new HashSet();
      HashSet var2 = new HashSet();
      if(var0.E() == null) {
         Iterator var4 = var0.t().iterator();

         while(var4.hasNext()) {
            Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var4.next();
            Object var3 = null;
            HashSet[] var5 = h(var10000);
            var1.addAll(var5[0]);
            var2.addAll(var5[1]);
         }

         boolean var6 = var0.c == 5 || var0.c == 6;
         Iterator var8 = var0.C().iterator();

         while(var8.hasNext()) {
            Openflower105 var7;
            if((var7 = (Openflower105)var8.next()).d && var6 && (var7.a() == 4 && var1.contains(var7.b()) || var7.a() == 8 && var2.contains(var7.b()))) {
               var7.c = false;
            }
         }

         switch(var0.c) {
         case 5:
            var2.clear();
         case 6:
            var1.clear();
         }
      }

      var1.add(var0);
      var2.add(var0);
      return new HashSet[]{var1, var2};
   }

   public static void b(Openflower154_SomeSorter var0) {
      if(var0.c == 5) {
         List var10000 = var0.d(8);
         Iterator var1 = null;
         var1 = var10000.iterator();

         label47:
         while(var1.hasNext()) {
            Openflower105 var2;
            if((var2 = (Openflower105)var1.next()).d) {
               Openflower105 var3 = var2;
               Openflower154_SomeSorter var4 = var2.b;

               while(true) {
                  boolean var5 = false;
                  Iterator var7 = var4.t().iterator();

                  while(true) {
                     if(var7.hasNext()) {
                        Openflower154_SomeSorter var6;
                        if(!(var6 = (Openflower154_SomeSorter)var7.next()).g(var3.b()) || !Openflower98.a(var6, var3.c())) {
                           continue;
                        }

                        var4 = var6;
                        var5 = true;
                     }

                     if(!var5) {
                        if(var4 != var2.b && !Openflower95.a(var2.b(), var4)) {
                           var2.b().a(1, var2, 4);
                           var2.c = false;
                           var4.c(var2);
                        }
                        continue label47;
                     }
                     break;
                  }
               }
            }
         }
      }

      Iterator var8 = var0.t().iterator();

      while(var8.hasNext()) {
         b((Openflower154_SomeSorter)var8.next());
      }

   }
}
