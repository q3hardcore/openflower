package de.fernflower.main;

import de.fernflower.main.Openflower107;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.util.DualArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class Openflower108 {

   private Openflower154_SomeSorter a;
   private Map b = new HashMap();
   private Map c = new HashMap();
   private Map d = new HashMap();
   private Map e = new HashMap();
   private Openflower107 f;


   public Openflower108(Openflower154_SomeSorter var1) {
      this.a = var1;
   }

   public final void a() {
      this.f = new Openflower107(this.a);
      this.f.a();
      Openflower108 var1 = this;

      DualArrayList var2;
      List var3;
      for(int var4 = (var3 = (List)(var2 = this.f.b()).c()).size() - 1; var4 >= 0; --var4) {
         Integer var5 = (Integer)var3.get(var4);
         Integer var6 = (Integer)var2.get(var4);
         Object var7;
         if((var7 = (Set)var1.b.get(var6)) == null) {
            var1.b.put(var6, var7 = new HashSet());
         }

         ((Set)var7).add(var5);
      }

      Integer var8 = var1.a.s().id;
      ((Set)var1.b.get(var8)).remove(var8);
      this.c();
      this.b(this.a.s().id);
      this.b.clear();
      this.c.clear();
   }

   public final boolean a(Integer var1, Integer var2) {
      Map var10000 = (Map)this.e.get(var1);
      Entry var3 = null;
      Iterator var4 = var10000.entrySet().iterator();

      Integer var5;
      do {
         do {
            if(!var4.hasNext()) {
               return true;
            }

            var3 = (Entry)var4.next();
         } while(var1.equals(this.d.get(var3.getKey())));
      } while((var5 = (Integer)var3.getValue()).intValue() != -1 && var5.equals(var2));

      return false;
   }

   private void c() {
      Iterator var2 = this.a.t().iterator();

      while(var2.hasNext()) {
         Openflower154_SomeSorter var1;
         List var3;
         if(!(var3 = (var1 = (Openflower154_SomeSorter)var2.next()).getDataAsList(2, 0)).isEmpty()) {
            HashSet var4 = new HashSet();
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               Openflower154_SomeSorter var6 = (Openflower154_SomeSorter)var5.next();
               var4.add(var6.id);
            }

            this.c.put(var1.id, var4);
         }
      }

      this.d = this.a(this.a.s().id);
   }

   private Map a(Integer var1) {
      HashMap var2 = new HashMap();
      Set var3;
      Iterator var4;
      if((var3 = (Set)this.b.get(var1)) != null) {
         var4 = var3.iterator();

         while(var4.hasNext()) {
            Integer var7 = (Integer)var4.next();
            Map var8;
            Iterator var6 = (var8 = this.a(var7)).keySet().iterator();

            while(var6.hasNext()) {
               Integer var5 = (Integer)var6.next();
               var2.put(var5, var2.containsKey(var5)?var1:(Integer)var8.get(var5));
            }
         }
      }

      var4 = this.c.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var9;
         if(((Set)(var9 = (Entry)var4.next()).getValue()).contains(var1)) {
            var2.put((Integer)var9.getKey(), var1);
         }
      }

      return var2;
   }

   private void b(Integer var1) {
      HashMap var2 = new HashMap();
      Set var3;
      if((var3 = (Set)this.b.get(var1)) != null) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Integer var10 = (Integer)var4.next();
            this.b(var10);
            Map var5 = (Map)this.e.get(var10);
            Iterator var7 = this.c.entrySet().iterator();

            while(var7.hasNext()) {
               Entry var6;
               Integer var8 = (Integer)(var6 = (Entry)var7.next()).getKey();
               Set var11;
               if((var11 = (Set)var6.getValue()).contains(var1)) {
                  Integer var9 = null;
                  if((var9 = !var11.contains(var10)?var10:(var2.containsKey(var8)?new Integer(-1):(Integer)var5.get(var8))) != null) {
                     var2.put(var8, var9);
                  }
               }
            }
         }
      }

      this.e.put(var1, var2);
   }

   public final Openflower107 b() {
      return this.f;
   }
}
