package de.fernflower.main;

import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.util.LIFOQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower106 {

   private LIFOQueue a;
   private int b;
   private HashSet c;
   private HashMap d;
   private HashMap e;
   private List f;
   private HashSet g;


   public Openflower106() {}

   public Openflower106(Openflower154_SomeSorter var1) {
      this.a(var1);
   }

   private List a(Openflower154_SomeSorter var1) {
      this.f = new ArrayList();
      this.g = new HashSet();
      this.b(var1.s());
      Iterator var3 = var1.t().iterator();

      Openflower154_SomeSorter var2;
      while(var3.hasNext()) {
         var2 = (Openflower154_SomeSorter)var3.next();
         if(!this.g.contains(var2) && var2.d(1073741824).isEmpty()) {
            this.b(var2);
         }
      }

      var3 = var1.t().iterator();

      while(var3.hasNext()) {
         var2 = (Openflower154_SomeSorter)var3.next();
         if(!this.g.contains(var2)) {
            this.b(var2);
         }
      }

      return this.f;
   }

   public static boolean a(List var0) {
      HashSet var1 = new HashSet();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         Openflower154_SomeSorter var2 = (Openflower154_SomeSorter)var3.next();
         var1.addAll(var2.getDataAsList(1, 1));
      }

      var1.removeAll(var0);
      return var1.size() == 0;
   }

   public static List b(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         if(a(var0 = (List)var2.next())) {
            var1.add((Openflower154_SomeSorter)var0.get(0));
         }
      }

      return var1;
   }

   private void b(Openflower154_SomeSorter var1) {
      this.a = new LIFOQueue();
      this.b = 0;
      this.c = new HashSet();
      this.d = new HashMap();
      this.e = new HashMap();
      this.c(var1);
      this.g.addAll(this.c);
      this.g.add(var1);
   }

   private void c(Openflower154_SomeSorter var1) {
      this.a.push(var1);
      this.d.put(var1, Integer.valueOf(this.b));
      this.e.put(var1, Integer.valueOf(this.b));
      ++this.b;
      List var2;
      (var2 = var1.getDataAsList(1, 1)).removeAll(this.g);

      Openflower154_SomeSorter var4;
      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var4 = (Openflower154_SomeSorter)var2.get(var3);
         int var6;
         if(this.c.contains(var4)) {
            var6 = ((Integer)this.d.get(var4)).intValue();
         } else {
            this.c.add(var4);
            this.c(var4);
            var6 = ((Integer)this.e.get(var4)).intValue();
         }

         this.e.put(var1, Integer.valueOf(Math.min(((Integer)this.e.get(var1)).intValue(), var6)));
      }

      if(((Integer)this.e.get(var1)).intValue() == ((Integer)this.d.get(var1)).intValue()) {
         ArrayList var5 = new ArrayList();

         do {
            var4 = (Openflower154_SomeSorter)this.a.pop();
            var5.add(var4);
         } while(var4 != var1);

         this.f.add(var5);
      }

   }

   public final List a() {
      return this.f;
   }
}
