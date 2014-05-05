package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower119;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower154_SomeSorter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class Openflower120 {

   public static boolean a(Openflower154_SomeSorter var0) {
      HashMap var1 = new HashMap();
      Iterator var3 = var0.t().iterator();

      Openflower154_SomeSorter var2;
      while(var3.hasNext()) {
         if(!(var2 = (Openflower154_SomeSorter)var3.next()).c(2).isEmpty()) {
            return false;
         }

         var1.put(var2.id, new Openflower119(var2.id));
      }

      var3 = var0.t().iterator();

      Openflower119 var5;
      Iterator var6;
      Openflower119 var9;
      while(var3.hasNext()) {
         var2 = (Openflower154_SomeSorter)var3.next();
         var5 = (Openflower119)var1.get(var2.id);
         var6 = var2.getDataAsList(1, 1).iterator();

         while(var6.hasNext()) {
            Openflower154_SomeSorter var4 = (Openflower154_SomeSorter)var6.next();
            var9 = (Openflower119)var1.get(var4.id);
            var5.c.add(var9);
            var9.b.add(var5);
         }
      }

      while(true) {
         byte var7 = 0;
         Openflower119 var8 = null;
         Iterator var10 = var1.values().iterator();

         while(true) {
            if(var10.hasNext()) {
               if((var5 = (Openflower119)var10.next()).c.contains(var5)) {
                  var7 = 1;
               } else if(var5.b.size() == 1) {
                  var7 = 2;
               }

               if(var7 == 0) {
                  continue;
               }

               var8 = var5;
            }

            if(var8 == null) {
               if(var1.size() > 1) {
                  return true;
               }

               return false;
            }

            if(var7 == 1) {
               var8.c.remove(var8);
               var8.b.remove(var8);
               break;
            }

            (var5 = (Openflower119)var8.b.iterator().next()).c.addAll(var8.c);
            var5.c.remove(var8);
            var6 = var8.c.iterator();

            while(var6.hasNext()) {
               (var9 = (Openflower119)var6.next()).b.remove(var8);
               var9.b.add(var5);
            }

            var1.remove(var8.a);
            break;
         }
      }
   }

   public static boolean b(Openflower154_SomeSorter var0) {
      Openflower154_SomeSorter var2 = null;
      int var3 = Integer.MAX_VALUE;
      int var4 = Integer.MAX_VALUE;
      Iterator var5 = var0.t().iterator();

      Openflower154_SomeSorter var1;
      while(var5.hasNext()) {
         Set var6;
         int var7;
         if((var6 = (var1 = (Openflower154_SomeSorter)var5.next()).getDataAsSet(1, 0)).size() > 1 && (var7 = var1.getDataAsSet(1, 1).size()) <= var4) {
            int var12 = c(var1) * (var6.size() - 1);
            if(var7 < var4 || var12 < var3) {
               var2 = var1;
               var3 = var12;
               var4 = var7;
            }
         }
      }

      var1 = var2;
      if(var2 == null) {
         return false;
      } else {
         Openflower105 var9 = (Openflower105)var2.d(1).iterator().next();
         Openflower154_SomeSorter var10;
         d(var10 = a(var1, (Openflower154_SomeSorter)null, new HashMap()));
         var10.i(var0);
         var0.t().a((Object)var10, (Object)var10.id);
         Iterator var11 = var1.d(1073741824).iterator();

         Openflower105 var8;
         while(var11.hasNext()) {
            if((var8 = (Openflower105)var11.next()).b() == var9.b() || var8.b == var9.b()) {
               var1.e(var8);
               var8.b().a(1, var8, var10);
               var10.d(var8);
            }
         }

         var11 = var1.c(1073741824).iterator();

         while(var11.hasNext()) {
            var8 = (Openflower105)var11.next();
            var10.f(new Openflower105(var8.a(), var10, var8.c(), var8.b));
         }

         return true;
      }
   }

   private static int c(Openflower154_SomeSorter var0) {
      int var1 = 0;
      if(var0.c == 8) {
         var1 = ((Openflower146)var0).e().e().d();
      } else {
         for(Iterator var2 = var0.t().iterator(); var2.hasNext(); var1 += c(var0)) {
            var0 = (Openflower154_SomeSorter)var2.next();
         }
      }

      return var1;
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1, HashMap var2) {
      if(var1 == null) {
         var1 = var0.a();
         var2.put(var0, var1);
      }

      Iterator var4 = var0.t().iterator();

      Openflower154_SomeSorter var5;
      while(var4.hasNext()) {
         Openflower154_SomeSorter var3;
         var5 = (var3 = (Openflower154_SomeSorter)var4.next()).a();
         var1.t().a((Object)var5, (Object)var5.id);
         var2.put(var3, var5);
      }

      int var7;
      Openflower154_SomeSorter var8;
      for(var7 = 0; var7 < var0.t().size(); ++var7) {
         var8 = (Openflower154_SomeSorter)var0.t().get(var7);
         var5 = (Openflower154_SomeSorter)var1.t().get(var7);
         Iterator var6 = var8.c(1073741824).iterator();

         while(var6.hasNext()) {
            Openflower105 var9 = (Openflower105)var6.next();
            var9 = new Openflower105(var9.a(), var5, var2.containsKey(var9.c())?(Openflower154_SomeSorter)var2.get(var9.c()):var9.c(), var2.containsKey(var9.b)?(Openflower154_SomeSorter)var2.get(var9.b):var9.b);
            var5.f(var9);
         }
      }

      for(var7 = 0; var7 < var0.t().size(); ++var7) {
         var8 = (Openflower154_SomeSorter)var0.t().get(var7);
         var5 = (Openflower154_SomeSorter)var1.t().get(var7);
         a(var8, var5, var2);
      }

      return var1;
   }

   private static void d(Openflower154_SomeSorter var0) {
      var0.b();
      var0.G();
      Iterator var2 = var0.t().iterator();

      while(var2.hasNext()) {
         Openflower154_SomeSorter var1;
         (var1 = (Openflower154_SomeSorter)var2.next()).i(var0);
         d(var1);
      }

   }
}
