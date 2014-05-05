package de.fernflower.main;

import de.fernflower.main.util.IntPair;

final class Openflower79 {

   public String a = "";
   public IntPair b;


   public Openflower79(String var1, IntPair var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof Openflower79)) {
         return false;
      } else {
         Openflower79 var2 = (Openflower79)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b);
      }
   }

   public final int hashCode() {
      return this.a.hashCode() + this.b.hashCode();
   }
}
