package de.fernflower.main.util;

import de.fernflower.main.codeprinter.elements.Openflower135;

public final class IntPair {

   public int val1;
   public int val2;
   private int hash = -1;


   public IntPair(int var1, int var2) {
      this.val1 = var1;
      this.val2 = var2;
   }

   public IntPair(Integer var1, Integer var2) {
      this.val1 = var1.intValue();
      this.val2 = var2.intValue();
   }

   public IntPair(Openflower135 var1) {
      this.val1 = var1.getIndex();
      this.val2 = var1.getIndex2();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof IntPair) {
         IntPair var2 = (IntPair)var1;
         return this.val1 == var2.val1 && this.val2 == var2.val2;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      if(this.hash == -1) {
         this.hash = this.val1 * 3 + this.val2;
      }

      return this.hash;
   }

   public final String toString() {
      return "(" + this.val1 + "," + this.val2 + ")";
   }
}
