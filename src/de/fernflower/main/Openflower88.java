package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower98;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.util.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower88 {

   public static boolean a(Openflower152 var0) {
      int var1;
      if((var1 = b((Openflower154_SomeSorter)var0)) > 0) {
         a((Openflower154_SomeSorter)var0);
         Openflower102.a((Openflower154_SomeSorter)var0);
      }

      return var1 > 0;
   }

   private static void a(Openflower154_SomeSorter var0) {
      boolean var1;
      do {
         var1 = false;

         for(int var2 = 0; var2 < var0.t().size(); ++var2) {
            Openflower154_SomeSorter var3;
            a(var3 = (Openflower154_SomeSorter)var0.t().get(var2));
            if(var3.c == 15 && var3.t().size() > 1) {
               Openflower154_SomeSorter var4 = (Openflower154_SomeSorter)var3.t().a();
               var3 = (Openflower154_SomeSorter)var3.t().get(var3.t().size() - 2);
               if((var4.E() == null || !var4.E().isEmpty()) && !var3.A()) {
                  Set var5;
                  (var5 = var4.getDataAsSet(1073741824, 0)).remove(var3);
                  if(var5.isEmpty()) {
                     var4.b(new ArrayList());
                     var1 = true;
                     break;
                  }
               }
            }
         }
      } while(var1);

   }

   private static int b(Openflower154_SomeSorter var0) {
      byte var1 = 0;
      Openflower154_SomeSorter var2 = null;
      Openflower105 var4;
      Openflower105 var6;
      Openflower146 var11;
      if(var0.E() == null) {
         int var3;
         do {
            var3 = 0;
            Iterator var5 = var0.t().iterator();

            while(var5.hasNext()) {
               Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var5.next();
               var4 = null;
               if((var3 = b(var10000)) > 0) {
                  var1 = 1;
                  break;
               }
            }
         } while(var3 != 0);

         switch(var0.c) {
         case 2:
            Openflower151 var8;
            if((var8 = (Openflower151)var0).f() == null && (var2 = a(var4 = var8.j())) != null) {
               (var11 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(Openflower85.b(var2.E()));
               var8.s().g(var4);
               var6 = new Openflower105(1, var8.s(), var11);
               var8.s().f(var6);
               var8.b(var6);
               var8.c(var11);
               var8.t().a((Object)var11, (Object)var11.id);
               var11.i(var8);
               var4 = (Openflower105)var2.q().get(0);
               var6 = new Openflower105(4, var11, var4.c());
               var11.f(var6);
               var4.b.c(var6);
               var1 = 1;
            }
         }
      }

      if(var0.q().size() == 1 && ((Openflower105)var0.q().get(0)).a() == 4 && var0.C().isEmpty()) {
         Openflower154_SomeSorter var9 = var0.B();
         if((var0 != var9.s() || var9.c != 2 && var9.c != 6) && (var2 = a(var4 = (Openflower105)var0.q().get(0))) != null) {
            var0.g(var4);
            (var11 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)))).b(Openflower85.b(var2.E()));
            var6 = (Openflower105)var2.q().get(0);
            var4 = new Openflower105(4, var11, var6.c());
            var11.f(var4);
            var6.b.c(var4);
            Openflower153 var7;
            (var7 = new Openflower153(Arrays.asList(new Openflower154_SomeSorter[]{var0, var11}))).m();
            var9.a(var0, (Openflower154_SomeSorter)var7);
            Iterator var12 = var7.d(8).iterator();

            Openflower105 var10;
            while(var12.hasNext()) {
               var10 = (Openflower105)var12.next();
               var7.e(var10);
               var10.b().a(1, var10, var0);
               var0.d(var10);
               var0.c(var10);
            }

            var0.f(new Openflower105(1, var0, var11));
            var12 = var2.r().iterator();

            while(var12.hasNext()) {
               if(!(var10 = (Openflower105)var12.next()).d && var0.g(var10.b()) && Openflower98.a(var10.b().B(), var11)) {
                  var2.e(var10);
                  var10.b().a(1, var10, var11);
                  var11.d(var10);
                  if(!var0.g(var10.b)) {
                     var0.c(var10);
                  }
               }
            }

            var1 = 2;
         }
      }

      return var1;
   }

   private static Openflower154_SomeSorter a(Openflower105 var0) {
      Openflower154_SomeSorter var1 = var0.c();
      if(var0.a() == 4 && var1.c == 8 && var0.d) {
         if(!var0.c) {
            Openflower154_SomeSorter var10000 = (var0 = var0).c();
            Openflower105 var2 = null;
            Iterator var3 = var10000.r().iterator();

            boolean var6;
            while(true) {
               if(!var3.hasNext()) {
                  var6 = true;
                  break;
               }

               if((var2 = (Openflower105)var3.next()) != var0) {
                  if(var2.a() != 1) {
                     var6 = false;
                     break;
                  }

                  Openflower154_SomeSorter var5;
                  if((var5 = var2.b()).c == 8 || var5.c == 2 && ((Openflower151)var5).b == 0 || var5.c == 5 && ((Openflower149_LoopPrinter)var5).k() != 0) {
                     var6 = false;
                     break;
                  }
               }
            }

            if(!var6) {
               return null;
            }
         }

         List var4;
         if((var4 = var1.E()).size() == 1 && ((Element)var4.get(0)).a == 4) {
            return var1;
         }
      }

      return null;
   }

   public static boolean b(Openflower152 var0) {
      boolean var1 = false;
      Iterator var2 = var0.e().r().iterator();

      while(var2.hasNext()) {
         Openflower105 var4;
         Openflower154_SomeSorter var5;
         if(!(var4 = (Openflower105)var2.next()).d && (var5 = var4.b()).E() != null && !var5.E().isEmpty()) {
            List var6;
            List var10000 = var6 = var5.E();
            Element var3;
            Openflower126 var7;
            if((var3 = (Element)var10000.get(var10000.size() - 1)).a == 4 && (var7 = (Openflower126)var3).f() == 0 && var7.g() == null) {
               var6.remove(var6.size() - 1);
               var1 = true;
            }
         }
      }

      return var1;
   }
}
