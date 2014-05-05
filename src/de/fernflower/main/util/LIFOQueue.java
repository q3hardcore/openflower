package de.fernflower.main.util;

import java.util.ArrayList;

public class LIFOQueue extends ArrayList {

   protected int size = 0;


   public LIFOQueue() {}

   public LIFOQueue(ArrayList var1) {
      super(var1);
   }

   public LIFOQueue c() {
      LIFOQueue var1;
      (var1 = new LIFOQueue(this)).size = this.size;
      return var1;
   }

   public Object push(Object var1) {
      this.add(var1);
      ++this.size;
      return var1;
   }

   public Object pop() {
      --this.size;
      Object var1 = this.get(this.size);
      this.remove(this.size);
      return var1;
   }

   public final Object pop(int var1) {
      Object var2;
      for(var2 = null; var1 > 0; --var1) {
         var2 = this.pop();
      }

      return var2;
   }

   public final void trimMultiple(int var1) {
      while(var1 > 0) {
         --this.size;
         this.remove(this.size);
         --var1;
      }

   }

   public final int getSize() {
      return this.size;
   }

   public Object get(int var1) {
      return super.get(var1);
   }

   public Object set(int var1, Object var2) {
      return super.set(var1, var2);
   }

   public final Object getOffset(int var1) {
      return this.get(this.size + var1);
   }

   public final void putOffset(int var1, Object var2) {
      this.add(this.size + var1, var2);
      ++this.size;
   }

   public void clear() {
      super.clear();
      this.size = 0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public Object clone() {
      return this.c();
   }
}
