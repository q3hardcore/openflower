package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower112;
import de.fernflower.main.Openflower113;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower209;
import de.fernflower.main.util.Util;
import java.util.HashMap;
import java.util.Iterator;

final class Openflower111 implements Openflower112 {

   // $FF: synthetic field
   private Openflower113 a;
   // $FF: synthetic field
   private final int b;


   Openflower111(Openflower113 var1, int var2) {
      this.a = var1;
      this.b = var2;
      //super();
   }

   public final boolean a(Openflower154_SomeSorter var1, HashMap var2) {
      Iterator var4 = var1.q().iterator();

      Openflower105 var3;
      Openflower209 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }
      } while(((var3 = (Openflower105)var4.next()).a() & this.b) == 0 || !var2.containsKey(var3.c().id) || Util.safeEquals((Object)(var5 = (Openflower209)var2.get(var1.id)), Openflower113.a(this.a).get(var1.id)));

      Openflower113.a(this.a).put(var1.id, var5);
      return true;
   }
}
