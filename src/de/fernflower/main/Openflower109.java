package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower112;
import de.fernflower.main.Openflower113;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower209;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class Openflower109 implements Openflower112 {

   // $FF: synthetic field
   private Openflower113 a;


   Openflower109(Openflower113 var1) {
      this.a = var1;
      //super();
   }

   public final boolean a(Openflower154_SomeSorter var1, HashMap var2) {
      Integer var3 = var1.id;
      Openflower209 var4 = (Openflower209)var2.get(var3);
      ArrayList var5 = new ArrayList();

      Iterator var6;
      Openflower209 var7;
      for(var6 = var1.d(1).iterator(); var6.hasNext(); var5.add(var7)) {
         Openflower105 var11 = (Openflower105)var6.next();
         if((var7 = (Openflower209)var2.get(var11.b().id)) == null) {
            var7 = (Openflower209)Openflower113.a(this.a).get(var11.b().id);
         }
      }

      var6 = var4.d().iterator();

      while(var6.hasNext()) {
         Integer var12 = (Integer)var6.next();
         var7 = var4.a();
         Openflower209 var13 = Openflower113.b(this.a).a();
         boolean var8 = false;
         Iterator var10 = var5.iterator();

         while(var10.hasNext()) {
            Openflower209 var9;
            if((var9 = (Openflower209)var10.next()).c((Object)var12)) {
               if(!var8) {
                  var13.b(var9);
                  var8 = true;
               } else {
                  var13.c(var9);
               }
            }
         }

         if(var3.intValue() != var12.intValue()) {
            var13.a((Object)var3);
         } else {
            var13.b((Object)var3);
         }

         var7.d(var13);
         ((Openflower209)Openflower113.c(this.a).get(var12)).d(var7);
      }

      return false;
   }
}
