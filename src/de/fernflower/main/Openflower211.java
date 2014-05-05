package de.fernflower.main;

import de.fernflower.main.Openflower209;
import de.fernflower.main.util.DualArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class Openflower211 {

   private DualArrayList a = new DualArrayList();
   private int b;


   public Openflower211(Collection var1) {
      this.b = var1.size() / 32 + 1;
      int var2 = 0;
      int var3 = 1;

      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 <<= 1) {
         Object var6 = (Object)var4.next();
         int var5 = var2 / 32;
         if(var2 % 32 == 0) {
            var3 = 1;
         }

         this.a.b(new int[]{var5, var3}, var6);
         ++var2;
      }

   }

   public final Openflower209 a() {
      return new Openflower209(this, (Openflower209)null);
   }

   // $FF: synthetic method
   static DualArrayList a(Openflower211 var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static int b(Openflower211 var0) {
      return var0.b;
   }
}
