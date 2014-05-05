package de.fernflower.main;

import de.fernflower.main.Openflower213;
import de.fernflower.main.Openflower214;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;

public final class Openflower212 implements Iterable {

   private Openflower214 a;
   private DualArrayList id;
   private int[] c;
   private int[] d;


   private Openflower212(Openflower214 var1) {
      this.a = var1;
      this.id = Openflower214.a(var1);
      int var2 = var1.b() + 1;
      this.c = new int[var2];
      this.d = new int[var2];
   }

   private Openflower212(Openflower214 var1, int[] var2, int[] var3) {
      this.a = var1;
      this.id = Openflower214.a(var1);
      this.c = var2;
      this.d = var3;
   }

   public final Openflower212 a() {
      int var1;
      int[] var2 = new int[var1 = this.c.length];
      int[] var3 = new int[var1];
      System.arraycopy(this.c, 0, var2, 0, var1);
      System.arraycopy(this.d, 0, var3, 0, var1);
      return new Openflower212(this.a, var2, var3);
   }

   private int[] a(int var1) {
      int var2;
      if((var2 = this.c.length) == 0) {
         var2 = 1;
      }

      while(var2 <= var1) {
         var2 <<= 1;
      }

      int[] var3 = new int[var2];
      System.arraycopy(this.c, 0, var3, 0, this.c.length);
      this.c = var3;
      int[] var4 = new int[var2];
      System.arraycopy(this.d, 0, var4, 0, this.d.length);
      this.d = var4;
      return var3;
   }

   public final void a(Object var1) {
      int[] var2;
      if((var2 = (int[])this.id.b(var1)) == null) {
         var2 = Openflower214.a(this.a, var1);
      }

      int var3;
      if((var3 = var2[0]) >= this.c.length) {
         this.a(var3);
      }

      this.c[var3] |= var2[1];
      a(this.d, var3, this.d[var3], var3);
   }

   public final void b(Object var1) {
      int[] var2;
      if((var2 = (int[])this.id.b(var1)) == null) {
         var2 = Openflower214.a(this.a, var1);
      }

      int var3;
      if((var3 = var2[0]) < this.c.length) {
         this.c[var3] &= ~var2[1];
         if(this.c[var3] == 0) {
            a(this.d, var3, var3, this.d[var3]);
         }
      }

   }

   public final boolean c(Object var1) {
      int[] var2;
      if((var2 = (int[])this.id.b(var1)) == null) {
         var2 = Openflower214.a(this.a, var1);
      }

      return var2[0] < this.c.length && (this.c[var2[0]] & var2[1]) != 0;
   }

   private static void a(int[] var0, int var1, int var2, int var3) {
      --var1;

      while(var1 >= 0 && var0[var1] == var2) {
         var0[var1] = var3;
         --var1;
      }

   }

   public final void a(Openflower212 var1) {
      Object var3 = null;
      int[] var2 = var1.c;
      int[] var7 = var1.d;
      int[] var8 = this.c;
      int var4 = this.c.length;
      int var5 = 0;

      do {
         if(var5 >= var4) {
            var8 = this.a(var2.length - 1);
         }

         boolean var6 = var8[var5] == 0;
         var8[var5] |= var2[var5];
         if(var6) {
            a(this.d, var5, this.d[var5], var5);
         }
      } while((var5 = var7[var5]) != 0);

   }

   public final void b(Openflower212 var1) {
      int[] var5 = var1.c;
      int[] var2 = this.c;

      int var3;
      int var4;
      for(var4 = (var3 = Math.min(var5.length, var2.length)) - 1; var4 >= 0; --var4) {
         var2[var4] &= var5[var4];
      }

      for(var4 = var2.length - 1; var4 >= var3; --var4) {
         var2[var4] = 0;
      }

      int var6 = 0;

      for(int var7 = this.c.length - 1; var7 >= 0; --var7) {
         this.d[var7] = var6;
         if(this.c[var7] != 0) {
            var6 = var7;
         }
      }

   }

   public final void c(Openflower212 var1) {
      int[] var5 = var1.c;
      int[] var2 = this.c;
      int var3 = var5.length;
      int var4 = 0;

      while(var4 < var3) {
         var2[var4] &= ~var5[var4];
         if(var2[var4] == 0) {
            a(this.d, var4, var4, this.d[var4]);
         }

         if((var4 = this.d[var4]) == 0) {
            break;
         }
      }

   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof Openflower212)) {
         return false;
      } else {
         int[] var4 = ((Openflower212)var1).c;
         int[] var2 = this.c;
         if(this.c.length > var4.length) {
            var2 = var4;
            var4 = this.c;
         }

         int var3;
         for(var3 = var2.length - 1; var3 >= 0; --var3) {
            if(var2[var3] != var4[var3]) {
               return false;
            }
         }

         for(var3 = var4.length - 1; var3 >= var2.length; --var3) {
            if(var4[var3] != 0) {
               return false;
            }
         }

         return true;
      }
   }

   public final int b() {
      boolean var1 = false;

      int[] var4;
      for(int var2 = (var4 = this.c).length - 1; var2 >= 0; --var2) {
         int var3;
         if((var3 = var4[var2]) != 0) {
            if(var1) {
               return 2;
            }

            if((var3 & var3 - 1) != 0) {
               return 2;
            }

            var1 = true;
         }
      }

      if(var1) {
         return 1;
      } else {
         return 0;
      }
   }

   public final boolean c() {
      return this.c.length == 0 || this.d[0] == 0 && this.c[0] == 0;
   }

   public final Iterator iterator() {
      return new Openflower213(this, (Openflower213)null);
   }

   public final Openflower214 d() {
      return this.a;
   }

   // $FF: synthetic method
   static int[] d(Openflower212 var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static int[] e(Openflower212 var0) {
      return var0.d;
   }

   // $FF: synthetic method
   Openflower212(Openflower214 var1, Openflower212 var2) {
      this(var1);
   }
}
