package de.fernflower.main.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class DualArrayList extends ArrayList {

   private HashMap indexes = new HashMap();
   private ArrayList second = new ArrayList();


   public final boolean add(Object var1) {
      this.second.add((Object)null);
      super.add(var1);
      return true;
   }

   public final boolean remove(Object var1) {
      throw new RuntimeException("not implemented!");
   }

   public final boolean addAll(Collection var1) {
      for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
         this.second.add((Object)null);
      }

      return super.addAll(var1);
   }

   public final void a(Collection var1, Collection var2) {
      int var3 = super.size();
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         Object var4 = (Object)var5.next();
         this.indexes.put(var4, Integer.valueOf(var3++));
      }

      super.addAll(var1);
      this.second.addAll(var2);
   }

   public final void a(Object var1, Object var2) {
      this.indexes.put(var2, Integer.valueOf(super.size()));
      super.add(var1);
      this.second.add(var2);
   }

   public final Object b(Object var1, Object var2) {
      Integer var3;
      if((var3 = (Integer)this.indexes.get(var2)) == null) {
         this.a(var1, var2);
         return null;
      } else {
         return super.set(var3.intValue(), var1);
      }
   }

   public final void add(int var1, Object var2) {
      this.a(var1, 1);
      this.second.add(var1, (Object)null);
      super.add(var1, var2);
   }

   public final void a(int var1, Object var2, Object var3) {
      this.a(var1, 1);
      this.indexes.put(var3, new Integer(var1));
      super.add(var1, var2);
      this.second.add(var1, var3);
   }

   public final void a(Object var1) {
      int var2 = ((Integer)this.indexes.get(var1)).intValue();
      this.a(var2 + 1, -1);
      super.remove(var2);
      this.second.remove(var2);
      this.indexes.remove(var1);
   }

   public final Object remove(int var1) {
      this.a(var1 + 1, -1);
      Object var2;
      if((var2 = this.second.get(var1)) != null) {
         this.indexes.remove(var2);
      }

      this.second.remove(var1);
      return super.remove(var1);
   }

   public final Object b(Object var1) {
      Integer var2;
      return (var2 = (Integer)this.indexes.get(var1)) == null?null:super.get(var2.intValue());
   }

   public final int c(Object var1) {
      return ((Integer)this.indexes.get(var1)).intValue();
   }

   public final Object a() {
      return super.get(super.size() - 1);
   }

   public final boolean d(Object var1) {
      return this.indexes.containsKey(var1);
   }

   public final void clear() {
      this.indexes.clear();
      this.second.clear();
      super.clear();
   }

   public final DualArrayList b() {
      DualArrayList var1;
      (var1 = new DualArrayList()).addAll(new ArrayList(this));
      var1.indexes = new HashMap(this.indexes);
      var1.second = new ArrayList(this.second);
      return var1;
   }

   public final Object a(int var1) {
      return this.second.get(var1);
   }

   public final ArrayList c() {
      return this.second;
   }

   private void a(int var1, int var2) {
      for(int var3 = this.second.size() - 1; var3 >= var1; --var3) {
         Object var4;
         if((var4 = this.second.get(var3)) != null) {
            this.indexes.put(var4, new Integer(var3 + var2));
         }
      }

   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object clone() {
      return this.b();
   }
}
