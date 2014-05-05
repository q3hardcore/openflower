package de.fernflower.main.util;


public final class IDManager {

   private int[] indexes = new int[]{1, 1, 1};


   public final void set(int var1, int var2) {
      this.indexes[var1] = var2;
   }

   public final int get0() {
      return this.indexes[0];
   }

   public final int getNext(int var1) {
      return this.indexes[var1]++;
   }
}
