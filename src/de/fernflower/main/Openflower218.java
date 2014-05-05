package de.fernflower.main;

import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower217;
import java.util.ArrayList;
import java.util.List;

public final class Openflower218 {

   private int a;
   private Openflower212[][] b;
   private int[][] c;


   public Openflower218() {
      this(true);
   }

   private Openflower218(boolean var1) {
      this.b = new Openflower212[3][];
      this.c = new int[3][];
      if(var1) {
         for(int var2 = 2; var2 >= 0; --var2) {
            this.b[var2] = new Openflower212[0];
            this.c[var2] = new int[0];
         }
      }

   }

   public Openflower218(Openflower218 var1) {
      this.b = new Openflower212[3][];
      this.c = new int[3][];

      for(int var2 = 2; var2 >= 0; --var2) {
         Openflower212[] var3 = var1.b[var2];
         int[] var4 = var1.c[var2];
         int var5;
         Openflower212[] var6 = new Openflower212[var5 = var3.length];
         int[] var7 = new int[var5];
         System.arraycopy(var3, 0, var6, 0, var5);
         System.arraycopy(var4, 0, var7, 0, var5);
         this.b[var2] = var6;
         this.c[var2] = var7;
         this.a = var1.a;
      }

   }

   public final Openflower218 a() {
      Openflower218 var1;
      (var1 = new Openflower218(false)).a = this.a;
      Openflower212[][] var2 = var1.b;
      int[][] var3 = var1.c;

      for(int var4 = 2; var4 >= 0; --var4) {
         Openflower212[] var5;
         int var6;
         if((var6 = (var5 = this.b[var4]).length) > 0) {
            int[] var7 = this.c[var4];
            Openflower212[] var8 = new Openflower212[var6];
            int[] var9 = new int[var6];
            System.arraycopy(var7, 0, var9, 0, var6);
            var2[var4] = var8;
            var3[var4] = var9;
            var6 = 0;

            do {
               Openflower212 var10;
               if((var10 = var5[var6]) != null) {
                  var8[var6] = var10.a();
               }
            } while((var6 = var7[var6]) != 0);
         } else {
            var2[var4] = new Openflower212[0];
            var3[var4] = new int[0];
         }
      }

      return var1;
   }

   public final int b() {
      return this.a;
   }

   public final boolean c() {
      return this.a == 0;
   }

   public final void a(int var1, Openflower212 var2) {
      Openflower218 var10000 = this;
      boolean var6 = false;
      //this = var10000;
      byte var3 = 0;
      if((var1 = var1) < 0) {
         var3 = 2;
         var1 = -var1;
      } else if(var1 >= 10000) {
         var3 = 1;
         var1 -= 10000;
      }

      Openflower212[] var4 = this.b[var3];
      if(var1 >= var4.length) {
         var4 = this.a(var3, var1 + 1, false);
      }

      Openflower212 var5 = var4[var1];
      var4[var1] = var2;
      int[] var7 = this.c[var3];
      if(var5 == null && var2 != null) {
         ++this.a;
         a(var7, var1, var7[var1], var1);
      } else {
         if(var5 != null && var2 == null) {
            --this.a;
            a(var7, var1, var1, var7[var1]);
         }

      }
   }

   public final void d() {
      Openflower212[] var1 = this.b[2];
      int[] var2 = this.c[2];

      for(int var3 = var1.length - 1; var3 >= 0; --var3) {
         if(var1[var3] != null) {
            var1[var3] = null;
            --this.a;
         }

         var2[var3] = 0;
      }

   }

   private static void a(int[] var0, int var1, int var2, int var3) {
      --var1;

      while(var1 >= 0 && var0[var1] == var2) {
         var0[var1] = var3;
         --var1;
      }

   }

   public final boolean a(int var1) {
      return this.b(var1) != null;
   }

   public final Openflower212 b(int var1) {
      byte var2 = 0;
      if(var1 < 0) {
         var2 = 2;
         var1 = -var1;
      } else if(var1 >= 10000) {
         var2 = 1;
         var1 -= 10000;
      }

      Openflower212[] var3 = this.b[var2];
      return var1 < var3.length?var3[var1]:null;
   }

   public final void a(Openflower218 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         Openflower212[] var3;
         if((var3 = this.b[var2]).length != 0) {
            Openflower212[] var4 = var1.b[var2];
            int[] var5 = this.c[var2];
            int var6 = 0;

            do {
               Openflower212 var7;
               if((var7 = var3[var6]) != null) {
                  if(var6 >= var4.length) {
                     break;
                  }

                  Openflower212 var8;
                  if((var8 = var4[var6]) != null) {
                     var7.c(var8);
                     if(var7.c()) {
                        var3[var6] = null;
                        --this.a;
                        a(var5, var6, var6, var5[var6]);
                     }
                  }
               }
            } while((var6 = var5[var6]) != 0);
         }
      }

   }

   public final void b(Openflower218 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         Openflower212[] var3;
         if((var3 = this.b[var2]).length != 0) {
            Openflower212[] var4 = var1.b[var2];
            int[] var5 = this.c[var2];
            int var6 = 0;

            do {
               Openflower212 var7;
               if((var7 = var3[var6]) != null) {
                  Openflower212 var8 = null;
                  if(var6 < var4.length) {
                     var8 = var4[var6];
                  }

                  if(var8 != null) {
                     var7.b(var8);
                  }

                  if(var8 == null || var7.c()) {
                     var3[var6] = null;
                     --this.a;
                     a(var5, var6, var6, var5[var6]);
                  }
               }
            } while((var6 = var5[var6]) != 0);
         }
      }

   }

   public final void c(Openflower218 var1) {
      for(int var2 = 2; var2 >= 0; --var2) {
         Openflower212[] var3;
         if((var3 = var1.b[var2]).length != 0) {
            Openflower212[] var4 = this.b[var2];
            int[] var5 = this.c[var2];
            int[] var6 = var1.c[var2];
            int var7 = 0;

            do {
               if(var7 >= var4.length) {
                  var4 = this.a(var2, var3.length, true);
                  var5 = this.c[var2];
               }

               Openflower212 var8;
               if((var8 = var3[var7]) != null) {
                  Openflower212 var9;
                  if((var9 = var4[var7]) == null) {
                     var4[var7] = var8.a();
                     ++this.a;
                     a(var5, var7, var5[var7], var7);
                  } else {
                     var9.a(var8);
                  }
               }
            } while((var7 = var6[var7]) != 0);
         }
      }

   }

   public final List e() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 2; var2 >= 0; --var2) {
         int var3 = 0;
         Openflower212[] var7;
         int var6 = (var7 = this.b[var2]).length;

         for(int var5 = 0; var5 < var6; ++var5) {
            Openflower212 var4;
            if((var4 = var7[var5]) != null) {
               int var8 = var2 == 0?var3:(var2 == 1?var3 + 10000:-var3);
               var1.add(new Openflower217(var8, var4));
            }

            ++var3;
         }
      }

      return var1;
   }

   private Openflower212[] a(int var1, int var2, boolean var3) {
      Openflower212[] var4 = this.b[var1];
      int[] var5 = this.c[var1];
      int var6 = var2;
      if(!var3) {
         var6 = 2 * var4.length / 3 + 1;
         if(var2 > var6) {
            var6 = var2;
         }
      }

      Openflower212[] var7 = new Openflower212[var6];
      System.arraycopy(var4, 0, var7, 0, var4.length);
      int[] var8 = new int[var6];
      System.arraycopy(var5, 0, var8, 0, var5.length);
      this.b[var1] = var7;
      this.c[var1] = var8;
      return var7;
   }
}
