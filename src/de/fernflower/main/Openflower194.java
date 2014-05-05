package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Openflower195;

public final class Openflower194 extends Openflower195 {

   private int f;
   private int g;
   public String a;
   public String b;
   public String c;


   public Openflower194(int var1, String var2, String var3, String var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.a();
   }

   public Openflower194(int var1, int var2, int var3) {
      this.d = var1;
      this.f = var2;
      this.g = var3;
   }

   public final void a(ConstPool var1) {
      if(this.d == 12) {
         this.b = (String)var1.a(this.f).a;
         this.c = (String)var1.a(this.g).a;
      } else {
         this.a = (String)var1.a(this.f).a;
         Openflower194 var2 = var1.b(this.g);
         this.b = var2.b;
         this.c = var2.c;
      }

      this.a();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower194) {
         Openflower194 var2 = (Openflower194)var1;
         return this.d == var2.d && this.b.equals(var2.b) && this.c.equals(var2.c)?(this.d == 12?this.a.equals(var2.a):true):false;
      } else {
         return false;
      }
   }

   private void a() {
      if(this.d != 10 && this.d != 11) {
         if(this.d == 9 && !"D".equals(this.c)) {
            "J".equals(this.c);
         }

      } else {
         String var1 = null;
         String[] var4;
         var1 = (var4 = this.c.split("[()]"))[1];
         int var2 = 0;

         for(int var3 = var1.length(); var2 < var3; ++var2) {
            if(var1.charAt(var2) == 76) {
               var2 = var1.indexOf(";", var2);
            }
         }

         "V".equals(var4[2]);
         if(!"D".equals(var4[2])) {
            "J".equals(var4[2]);
         }

      }
   }
}
