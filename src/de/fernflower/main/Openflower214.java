package de.fernflower.main;

import de.fernflower.main.Openflower212;
import de.fernflower.main.util.DualArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class Openflower214 {

   private DualArrayList a = new DualArrayList();
   private int b;
   private int c;


   public Openflower214(Collection var1) {
      int var2 = -1;
      int var3 = -1;
      int var4 = 0;

      for(Iterator var5 = var1.iterator(); var5.hasNext(); ++var4) {
         Object var6 = (Object)var5.next();
         var2 = var4 / 32;
         if(var4 % 32 == 0) {
            var3 = 1;
         } else {
            var3 <<= 1;
         }

         this.a.b(new int[]{var2, var3}, var6);
      }

      this.b = var2;
      this.c = var3;
   }

   public final Openflower212 a() {
      return new Openflower212(this, (Openflower212)null);
   }

   public final int b() {
      return this.b;
   }

   // $FF: synthetic method
   static DualArrayList a(Openflower214 var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static int[] a(Openflower214 var0, Object var1) {
      if(var0.c != -1 && var0.c != Integer.MIN_VALUE) {
         var0.c <<= 1;
      } else {
         var0.c = 1;
         ++var0.b;
      }

      int[] var2 = new int[]{var0.b, var0.c};
      var0.a.b(var2, var1);
      return var2;
   }
}
