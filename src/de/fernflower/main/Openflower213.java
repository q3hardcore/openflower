package de.fernflower.main;

import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower214;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;

public final class Openflower213 implements Iterator {

   private DualArrayList a;
   private int[] b;
   private int[] c;
   private int d;
   private int e;
   private int f;


   private Openflower213(Openflower212 var1) {
      this.e = -1;
      this.f = -1;
      this.a = Openflower214.a(var1.d());
      this.b = Openflower212.d(var1);
      this.c = Openflower212.e(var1);
      this.d = this.a.size();
   }

   private int a(int var1) {
      ++var1;
      int var2 = var1 >>> 5;
      var1 &= 31;

      while(var2 < this.b.length) {
         int var3;
         if((var3 = this.b[var2]) != 0) {
            for(var3 >>>= var1; var1 < 32; ++var1) {
               if((var3 & 1) != 0) {
                  return (var2 << 5) + var1;
               }

               var3 >>>= 1;
            }
         }

         var1 = 0;
         if((var2 = this.c[var2]) == 0) {
            break;
         }
      }

      return -1;
   }

   public final boolean hasNext() {
      this.f = this.a(this.e);
      return this.f >= 0;
   }

   public final Object next() {
      if(this.f >= 0) {
         this.e = this.f;
      } else {
         this.e = this.a(this.e);
         if(this.e == -1) {
            this.e = this.d;
         }
      }

      this.f = -1;
      return this.e < this.d?this.a.a(this.e):null;
   }

   public final void remove() {
      int[] var1 = (int[])this.a.get(this.e);
      this.b[var1[0]] &= ~var1[1];
   }

   // $FF: synthetic method
   Openflower213(Openflower212 var1, Openflower213 var2) {
      this(var1);
   }
}
