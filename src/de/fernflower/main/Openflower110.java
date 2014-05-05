package de.fernflower.main;

import de.fernflower.main.Openflower112;
import de.fernflower.main.Openflower113;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower209;
import java.util.HashMap;
import java.util.Iterator;

final class Openflower110 implements Openflower112 {

   // $FF: synthetic field
   private Openflower113 a;


   Openflower110(Openflower113 var1) {
      this.a = var1;
      //super();
   }

   public final boolean a(Openflower154_SomeSorter var1, HashMap var2) {
      Integer var4 = var1.id;
      Iterator var3 = ((Openflower209)var2.get(var4)).d().iterator();

      while(var3.hasNext()) {
         Integer var5 = (Integer)var3.next();
         ((Openflower209)Openflower113.c(this.a).get(var5)).a((Object)var4);
      }

      return false;
   }
}
