package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower107;
import de.fernflower.main.Openflower108;
import de.fernflower.main.Openflower109;
import de.fernflower.main.Openflower110;
import de.fernflower.main.Openflower111;
import de.fernflower.main.Openflower112;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower209;
import de.fernflower.main.Openflower211;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower113 {

   private List a;
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();
   private Openflower154_SomeSorter d;
   private Openflower211 e;


   public final HashMap a(Openflower154_SomeSorter var1) {
      this.d = var1;
      HashSet var2 = new HashSet();
      Iterator var4 = var1.t().iterator();

      while(var4.hasNext()) {
         Openflower154_SomeSorter var3 = (Openflower154_SomeSorter)var4.next();
         var2.add(var3.id);
      }

      this.e = new Openflower211(var2);
      this.a = var1.p();
      this.b();
      this.a();
      Openflower108 var7;
      (var7 = new Openflower108(var1)).a();
      this.b(var7);
      this.a(var7);
      HashMap var8 = new HashMap();
      Iterator var6 = this.c.entrySet().iterator();

      while(var6.hasNext()) {
         Entry var5 = (Entry)var6.next();
         var8.put((Integer)var5.getKey(), ((Openflower209)var5.getValue()).d());
      }

      return var8;
   }

   private void a(Openflower108 var1) {
      Openflower107 var13 = var1.b();
      Iterator var3 = (new HashSet((Collection)this.c.keySet())).iterator();

      while(var3.hasNext()) {
         Integer var2 = (Integer)var3.next();
         Openflower209 var4 = (Openflower209)this.c.get(var2);
         LinkedList var5 = new LinkedList();
         LinkedList var6 = new LinkedList();
         var5.add((Openflower154_SomeSorter)this.d.t().b(var2));
         var6.add(this.e.a());
         HashSet var7 = new HashSet();

         while(!var5.isEmpty()) {
            Openflower154_SomeSorter var8 = (Openflower154_SomeSorter)var5.removeFirst();
            Openflower209 var9 = (Openflower209)var6.removeFirst();
            if(var4.c((Object)var8.id)) {
               var9.a((Object)var8.id);
            }

            if(!var9.a(var4)) {
               var7.add(var8);
               int var10 = 0;
               Iterator var11 = var4.iterator();

               while(var11.hasNext()) {
                  Integer var12 = (Integer)var11.next();
                  if(!var9.c((Object)var12)) {
                     if(var10 == 0) {
                        var10 = var13.a(var8.id, var2)?2:1;
                     }

                     if(var10 == 1) {
                        var11.remove();
                     }
                  }
               }

               Iterator var15 = var8.c(1).iterator();

               while(var15.hasNext()) {
                  Openflower105 var14 = (Openflower105)var15.next();
                  if(!var7.contains(var14.c())) {
                     var5.add(var14.c());
                     var6.add(var9.a());
                  }
               }
            }
         }

         if(var4.c()) {
            this.c.remove(var2);
         }
      }

   }

   private void b(Openflower108 var1) {
      Iterator var3 = (new HashSet((Collection)this.c.keySet())).iterator();

      while(var3.hasNext()) {
         Integer var2 = (Integer)var3.next();
         Openflower209 var4;
         Iterator var5 = (var4 = (Openflower209)this.c.get(var2)).iterator();

         while(var5.hasNext()) {
            if(!var1.a(var2, (Integer)var5.next())) {
               var5.remove();
            }
         }

         if(var4.c()) {
            this.c.remove(var2);
         }
      }

   }

   private void a() {
      this.b = new HashMap();
      this.a(1);
      this.a(new Openflower109(this), 1);
      Openflower209 var1 = this.e.a();
      boolean var2 = false;
      Iterator var4 = this.d.t().iterator();

      while(var4.hasNext()) {
         Openflower154_SomeSorter var3;
         if((var3 = (Openflower154_SomeSorter)var4.next()).d(1073741824).isEmpty() && !var3.d(2).isEmpty()) {
            var1.a((Object)var3.id);
            var2 = true;
         }
      }

      if(var2) {
         var4 = this.c.values().iterator();

         while(var4.hasNext()) {
            ((Openflower209)var4.next()).d(var1);
         }
      }

   }

   private void b() {
      this.a(3);
      Iterator var2 = this.d.t().iterator();

      while(var2.hasNext()) {
         Openflower154_SomeSorter var1 = (Openflower154_SomeSorter)var2.next();
         this.c.put(var1.id, this.e.a());
      }

      this.a(new Openflower110(this), 3);
   }

   private void a(int var1) {
      this.a(new Openflower111(this, var1), var1);
   }

   private void a(Openflower112 var1, int var2) {
      boolean var3;
      do {
         var3 = false;
         HashMap var4 = new HashMap();
         Iterator var6 = this.a.iterator();

         while(var6.hasNext()) {
            Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)var6.next();
            Openflower209 var7;
            (var7 = this.e.a()).a((Object)var5.id);
            Iterator var9 = var5.r().iterator();

            Openflower105 var8;
            Openflower154_SomeSorter var13;
            while(var9.hasNext()) {
               if(((var8 = (Openflower105)var9.next()).a() & var2) != 0) {
                  var13 = var8.b();
                  Openflower209 var10;
                  if((var10 = (Openflower209)var4.get(var13.id)) == null) {
                     var10 = (Openflower209)this.b.get(var13.id);
                  }

                  if(var10 != null) {
                     var7.b(var10);
                  }
               }
            }

            var4.put(var5.id, var7);
            var3 |= var1.a(var5, var4);
            var9 = var5.r().iterator();

            while(var9.hasNext()) {
               if(((var8 = (Openflower105)var9.next()).a() & var2) != 0) {
                  var13 = var8.b();
                  if(var4.containsKey(var13.id)) {
                     boolean var14 = true;
                     Iterator var12 = var13.q().iterator();

                     while(true) {
                        if(var12.hasNext()) {
                           Openflower105 var11;
                           if(((var11 = (Openflower105)var12.next()).a() & var2) == 0 || var4.containsKey(var11.c().id)) {
                              continue;
                           }

                           var14 = false;
                        }

                        if(var14) {
                           var4.put(var13.id, (Object)null);
                        }
                        break;
                     }
                  }
               }
            }
         }
      } while(var3);

   }

   // $FF: synthetic method
   static HashMap a(Openflower113 var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static Openflower211 b(Openflower113 var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static HashMap c(Openflower113 var0) {
      return var0.c;
   }
}
