package de.fernflower.main;

import de.fernflower.main.Openflower210;
import de.fernflower.main.Openflower211;
import de.fernflower.main.util.DualArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Openflower209 implements Iterable {

   private Openflower211 a;
   private DualArrayList b;
   private int[] c;


   private Openflower209(Openflower211 var1) {
      this.a = var1;
      this.b = Openflower211.a(var1);
      this.c = new int[Openflower211.b(var1)];
   }

   public final Openflower209 a() {
      Openflower209 var1 = new Openflower209(this.a);
      int var2;
      int[] var3 = new int[var2 = this.c.length];
      System.arraycopy(this.c, 0, var3, 0, var2);
      var1.c = var3;
      return var1;
   }

   public final void b() {
      int[] var1;
      for(int var2 = (var1 = (int[])this.b.get(this.b.size() - 1))[0] - 1; var2 >= 0; --var2) {
         this.c[var2] = -1;
      }

      this.c[var1[0]] = var1[1] | var1[1] - 1;
   }

   public final void a(Object var1) {
      int[] var2 = (int[])this.b.b(var1);
      this.c[var2[0]] |= var2[1];
   }

   public final void a(Collection var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Object var3 = (Object)var2.next();
         this.a(var3);
      }

   }

   public final void b(Object var1) {
      int[] var2 = (int[])this.b.b(var1);
      this.c[var2[0]] &= ~var2[1];
   }

   public final boolean c(Object var1) {
      int[] var2 = (int[])this.b.b(var1);
      return (this.c[var2[0]] & var2[1]) != 0;
   }

   public final boolean a(Openflower209 var1) {
      int[] var4 = var1.c;

      int[] var3;
      for(int var2 = (var3 = this.c).length - 1; var2 >= 0; --var2) {
         if((var4[var2] & ~var3[var2]) != 0) {
            return false;
         }
      }

      return true;
   }

   public final void b(Openflower209 var1) {
      int[] var4 = var1.c;

      int[] var3;
      for(int var2 = (var3 = this.c).length - 1; var2 >= 0; --var2) {
         var3[var2] |= var4[var2];
      }

   }

   public final void c(Openflower209 var1) {
      int[] var4 = var1.c;

      int[] var3;
      for(int var2 = (var3 = this.c).length - 1; var2 >= 0; --var2) {
         var3[var2] &= var4[var2];
      }

   }

   public final void d(Openflower209 var1) {
      int[] var4 = var1.c;

      int[] var3;
      for(int var2 = (var3 = this.c).length - 1; var2 >= 0; --var2) {
         var3[var2] &= ~var4[var2];
      }

   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof Openflower209)) {
         return false;
      } else {
         int[] var4 = ((Openflower209)var1).c;

         int[] var3;
         for(int var2 = (var3 = this.c).length - 1; var2 >= 0; --var2) {
            if(var3[var2] != var4[var2]) {
               return false;
            }
         }

         return true;
      }
   }

   public final boolean c() {
      int[] var2;
      for(int var1 = (var2 = this.c).length - 1; var1 >= 0; --var1) {
         if(var2[var1] != 0) {
            return false;
         }
      }

      return true;
   }

   public final Iterator iterator() {
      return new Openflower210(this, (Openflower210)null);
   }

   public final Set d() {
      return (Set)this.b((Collection)(new HashSet()));
   }

   private Collection b(Collection var1) {
      int[] var2 = this.c;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4;
         if((var4 = var2[var3]) != 0) {
            int var5 = var3 << 5;

            for(int var6 = 31; var6 >= 0; --var6) {
               if((var4 & 1) != 0) {
                  var1.add(this.b.a(var5));
               }

               ++var5;
               var4 >>>= 1;
            }
         }
      }

      return var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("{");
      int[] var2 = this.c;
      boolean var3 = true;

      for(int var4 = this.b.size() - 1; var4 >= 0; --var4) {
         int[] var5 = (int[])this.b.get(var4);
         if((var2[var5[0]] & var5[1]) != 0) {
            if(var3) {
               var3 = false;
            } else {
               var1.append(",");
            }

            var1.append(this.b.a(var4));
         }
      }

      var1.append("}");
      return var1.toString();
   }

   public final Openflower211 e() {
      return this.a;
   }

   // $FF: synthetic method
   static int[] e(Openflower209 var0) {
      return var0.c;
   }

   // $FF: synthetic method
   Openflower209(Openflower211 var1, Openflower209 var2) {
      this(var1);
   }
}
