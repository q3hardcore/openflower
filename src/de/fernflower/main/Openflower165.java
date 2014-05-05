package de.fernflower.main;

import de.fernflower.main.Openflower166;

public final class Openflower165 {

   private int c;
   public Openflower166 a;
   public Openflower166 b;
   private int d;


   public Openflower165(int var1, Openflower166 var2, Openflower166 var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
      this.d = var2.hashCode() ^ var3.hashCode() + var1;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower165) {
         Openflower165 var2 = (Openflower165)var1;
         return this.c == var2.c && this.a == var2.a && this.b == var2.b;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.d;
   }
}
