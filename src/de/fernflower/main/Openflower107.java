package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower107 {

   private Openflower154_SomeSorter a;
   private DualArrayList b = new DualArrayList();


   public Openflower107(Openflower154_SomeSorter var1) {
      this.a = var1;
   }

   public final void a() {
      Openflower107 var5;
      Iterator var8 = (var5 = this/* = this*/).a.p().iterator();

      while(var8.hasNext()) {
         Openflower154_SomeSorter var6 = (Openflower154_SomeSorter)var8.next();
         var5.b.a((Object)null, (Object)var6.id);
      }

      this.b.b(this.a.s().id, this.a.s().id);
      List var1 = this.b.c().subList(1, this.b.c().size());

      boolean var2;
      do {
         var2 = false;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            Integer var3 = (Integer)var4.next();
            Openflower154_SomeSorter var11 = (Openflower154_SomeSorter)this.a.t().b(var3);
            Integer var14 = null;
            Iterator var7 = var11.r().iterator();

            Integer var12;
            while(var7.hasNext()) {
               Openflower105 var13 = (Openflower105)var7.next();
               if(this.b.b(var13.b().id) != null) {
                  Integer var10000 = var14;
                  DualArrayList var15 = this.b;
                  var14 = var13.b().id;
                  var12 = var10000;
                  if(var10000 == null) {
                     var10000 = var14;
                  } else if(var14 == null) {
                     var10000 = var12;
                  } else {
                     int var9 = var15.c(var12);
                     int var10 = var15.c(var14);

                     while(var9 != var10) {
                        if(var9 > var10) {
                           var12 = (Integer)var15.b(var12);
                           var9 = var15.c(var12);
                        } else {
                           var14 = (Integer)var15.b(var14);
                           var10 = var15.c(var14);
                        }
                     }

                     var10000 = var12;
                  }

                  var14 = var10000;
               }
            }

            var12 = (Integer)this.b.b(var14, var3);
            if(!var14.equals(var12)) {
               var2 = true;
            }
         }
      } while(var2);

   }

   public final DualArrayList b() {
      return this.b;
   }

   public final boolean a(Integer var1, Integer var2) {
      while(!var1.equals(var2)) {
         Integer var3;
         if((var3 = (Integer)this.b.b(var1)).equals(var1)) {
            return false;
         }

         var1 = var3;
      }

      return true;
   }
}
