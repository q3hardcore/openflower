package de.fernflower.main;

import de.fernflower.main.Openflower209;
import de.fernflower.main.Openflower211;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;

public final class Openflower210 implements Iterator {

   private DualArrayList a;
   private int[] b;
   private int c;
   private int d;
   private int e;


   private Openflower210(Openflower209 var1) {
      this.d = -1;
      this.e = -1;
      this.a = Openflower211.a(var1.e());
      this.b = Openflower209.e(var1);
      this.c = this.a.size();
   }

   private int a(int var1) {
      ++var1;
      int var2 = var1;
      int var3 = var1 / 32;

      for(var1 %= 32; var3 < this.b.length; ++var3) {
         int var4;
         if((var4 = this.b[var3]) != 0) {
            for(var4 >>>= var1; var1 < 32; ++var2) {
               if((var4 & 1) != 0) {
                  return var2;
               }

               var4 >>>= 1;
               ++var1;
            }
         } else {
            var2 += 32 - var1;
         }

         var1 = 0;
      }

      return -1;
   }

   public final boolean hasNext() {
      this.e = this.a(this.d);
      return this.e >= 0;
   }

   public final Object next() {
      if(this.e >= 0) {
         this.d = this.e;
      } else {
         this.d = this.a(this.d);
         if(this.d == -1) {
            this.d = this.c;
         }
      }

      this.e = -1;
      return this.d < this.c?this.a.a(this.d):null;
   }

   public final void remove() {
      int[] var1 = (int[])this.a.get(this.d);
      this.b[var1[0]] &= ~var1[1];
   }

   // $FF: synthetic method
   Openflower210(Openflower209 var1, Openflower210 var2) {
      this(var1);
   }
}
