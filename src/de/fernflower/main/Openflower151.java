package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower130;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower151 extends Openflower154_SomeSorter {

   public static int a = 1;
   public int b;
   private Openflower154_SomeSorter k;
   private Openflower154_SomeSorter l;
   private Openflower105 m;
   private Openflower105 n;
   private boolean o;
   private boolean p;
   private List q;


   private Openflower151() {
      this.o = false;
      this.q = new ArrayList();
      this.c = 2;
      this.q.add((Object)null);
   }

   private Openflower151(Openflower154_SomeSorter var1, int var2, Openflower154_SomeSorter var3) {
      this();
      this.child = var1;
      this.e.a((Object)var1, (Object)var1.id);
      List var4 = var1.c(1073741824);
      Openflower105 var7;
      switch(var2) {
      case 0:
         this.k = null;
         this.l = null;
         break;
      case 1:
         this.k = null;
         this.l = null;
         if((var7 = (Openflower105)var4.get(1)).a() != 1) {
            this.i = ((Openflower105)var4.get(0)).c();
         } else {
            this.i = var7.c();
            this.o = true;
         }
         break;
      case 2:
         this.l = ((Openflower105)var4.get(0)).c();
         this.k = ((Openflower105)var4.get(1)).c();
         List var5 = this.k.c(1);
         List var6 = this.l.c(1);
         if(this.k.d(1).size() <= 1 && var5.size() <= 1) {
            if(this.l.d(1).size() <= 1 && var6.size() <= 1) {
               if(var5.size() == 0) {
                  this.i = this.l;
               } else if(var6.size() == 0) {
                  this.i = this.k;
               }
            } else {
               this.i = this.l;
            }
         } else {
            this.i = this.k;
         }

         if(this.k == this.i) {
            if(this.l != this.i) {
               this.k = this.l;
               this.o = true;
            } else {
               this.k = null;
            }

            this.l = null;
         } else if(this.l == this.i) {
            this.l = null;
         } else {
            this.i = var3;
         }

         if(this.l == null) {
            var2 = 1;
         }
      }

      this.m = (Openflower105)var4.get(this.o?0:1);
      this.n = var2 == 2?(Openflower105)var4.get(this.o?1:0):null;
      this.b = var2 == 2?a:0;
      if(this.b == 0) {
         if(var2 == 0) {
            var7 = (Openflower105)var4.get(0);
            var1.g(var7);
            var7.a(this);
            this.f(var7);
         } else if(var2 == 1) {
            var7 = (Openflower105)var4.get(this.o?1:0);
            var1.g(var7);
         }
      }

      if(this.k != null) {
         this.e.a((Object)this.k, (Object)this.k.id);
      }

      if(this.l != null) {
         this.e.a((Object)this.l, (Object)this.l.id);
      }

      if(this.i == var1) {
         this.i = this;
      }

   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.c == 8 && var0.u() == 0) {
         int var1 = var0.c(1).size();
         Openflower154_SomeSorter var2 = null;
         boolean var3;
         if(!(var3 = var1 < 2)) {
            ArrayList var4 = new ArrayList();
            if(Openflower85.a(var0, var4)) {
               var2 = (Openflower154_SomeSorter)var4.remove(0);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var5.next();
                  Object var6 = null;
                  if(var10000.x()) {
                     return null;
                  }
               }

               var3 = Openflower85.a((List)var4);
            }
         }

         if(var3) {
            return new Openflower151(var0, var1, var2);
         }
      }

      return null;
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(Openflower89.a(this.h, var1));
      var3.append(this.child.getString(var1));
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      var3.append(var2 + ((Element)this.q.get(0)).toString(var1) + " {\r\n");
      if(this.k == null) {
         var3.append(Util.getIndent(var1 + 1));
         if(this.m.d) {
            if(this.m.a() == 4) {
               var3.append("break");
            } else {
               var3.append("continue");
            }

            if(this.m.c) {
               var3.append(" label" + this.m.b.id);
            }
         }

         var3.append(";\r\n");
      } else {
         var3.append(Openflower89.printLoopBody(this.k, var1 + 1, true));
      }

      boolean var4 = false;
      if(this.l != null) {
         String var5;
         if(this.l.c == 2 && this.l.h.isEmpty() && this.l.s().E().isEmpty() && !this.l.needsLabel() && (this.l.c(1073741824).isEmpty() || !((Openflower105)this.l.c(1073741824).get(0)).d)) {
            var5 = Openflower89.printLoopBody(this.l, var1, false).substring(var2.length());
            var3.append(var2 + "} else ");
            var3.append(var5);
            var4 = true;
         } else if((var5 = Openflower89.printLoopBody(this.l, var1 + 1, false)).length() > 0) {
            var3.append(var2 + "} else {\r\n");
            var3.append(var5);
         }
      }

      if(!var4) {
         var3.append(var2 + "}\r\n");
      }

      return var3.toString();
   }

   public final void e_() {
      Openflower130 var1 = (Openflower130)this.child.E().remove(this.child.E().size() - 1);
      if(this.o) {
         (var1 = (Openflower130)var1.copy()).b_();
      }

      this.q.set(0, var1);
   }

   public final List d() {
      ArrayList var1;
      (var1 = new ArrayList(this.e)).add(1, this.q.get(0));
      return var1;
   }

   public final void a(Element var1, Element var2) {
      if(this.q.get(0) == var1) {
         this.q.set(0, var2);
      }

   }

   public final void a(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      super.a(var1, var2);
      if(this.k == var1) {
         this.k = var2;
      }

      if(this.l == var1) {
         this.l = var2;
      }

      List var3 = this.child.c(1073741824);
      if(this.b == 0) {
         this.m = (Openflower105)var3.get(0);
         this.n = null;
      } else {
         Openflower105 var5 = (Openflower105)var3.get(0);
         Openflower105 var4 = (Openflower105)var3.get(1);
         if(var5.c() == this.k) {
            this.m = var5;
            this.n = var4;
         } else {
            this.m = var4;
            this.n = var5;
         }
      }
   }

   public final Openflower154_SomeSorter a() {
      Openflower151 var1;
      (var1 = new Openflower151()).b = this.b;
      var1.o = this.o;
      var1.p = this.p;
      return var1;
   }

   public final void b() {
      this.child = (Openflower154_SomeSorter)this.e.get(0);
      List var1 = this.child.c(1073741824);
      this.m = (Openflower105)var1.get(this.b != 0 && !this.o?1:0);
      if(this.e.size() > 1) {
         this.k = (Openflower154_SomeSorter)this.e.get(1);
      }

      if(this.b == a) {
         this.n = (Openflower105)var1.get(this.o?1:0);
         this.l = (Openflower154_SomeSorter)this.e.get(2);
      }

   }

   public final Openflower154_SomeSorter e() {
      return this.l;
   }

   public final void b(Openflower154_SomeSorter var1) {
      this.l = var1;
   }

   public final Openflower154_SomeSorter f() {
      return this.k;
   }

   public final void c(Openflower154_SomeSorter var1) {
      this.k = var1;
   }

   public final boolean g() {
      return this.o;
   }

   public final void a(boolean var1) {
      this.o = var1;
   }

   public final List h() {
      return this.q;
   }

   public final Openflower130 i() {
      return (Openflower130)this.q.get(0);
   }

   public final void a(Openflower105 var1) {
      this.n = var1;
   }

   public final void b(Openflower105 var1) {
      this.m = var1;
   }

   public final Openflower105 j() {
      return this.m;
   }

   public final Openflower105 k() {
      return this.n;
   }
}
