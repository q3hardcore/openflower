package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower106;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower155_SwitchPrinter;
import de.fernflower.main.Openflower7;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Openflower154_SomeSorter {

   public int c;
   public Integer id = Integer.valueOf(Configuration.getIDManager().getNext(0));
   private Map a = new HashMap();
   private Map b = new HashMap();
   private Map k = new HashMap();
   private Map l = new HashMap();
   protected DualArrayList e = new DualArrayList();
   private Openflower154_SomeSorter m;
   protected Openflower154_SomeSorter child;
   protected List g;
   private HashSet n = new HashSet();
   protected List h = new ArrayList();
   private boolean o = false;
   protected Openflower154_SomeSorter i;
   protected int j = 2;
   private boolean p;
   private boolean q;
   private HashSet r = new HashSet();


   public final void l() {
      this.i = null;
      this.r = null;
      this.o = false;
      this.p = false;
      this.q = false;
      Map[] var4;
      int var3 = (var4 = new Map[]{this.a, this.b}).length;

      Map var1;
      int var2;
      List var5;
      for(var2 = 0; var2 < var3; ++var2) {
         (var1 = var4[var2]).remove(Integer.valueOf(2));
         if((var5 = (List)var1.get(Integer.valueOf(1073741824))) != null) {
            var1.put(Integer.valueOf(Integer.MIN_VALUE), new ArrayList(var5));
         } else {
            var1.remove(Integer.valueOf(Integer.MIN_VALUE));
         }
      }

      var3 = (var4 = new Map[]{this.k, this.l}).length;

      for(var2 = 0; var2 < var3; ++var2) {
         (var1 = var4[var2]).remove(Integer.valueOf(2));
         if((var5 = (List)var1.get(Integer.valueOf(1073741824))) != null) {
            var1.put(Integer.valueOf(Integer.MIN_VALUE), new ArrayList(var5));
         } else {
            var1.remove(Integer.valueOf(Integer.MIN_VALUE));
         }
      }

   }

   public final void d(Openflower154_SomeSorter var1) {
      Openflower105 var5 = null;
      Openflower154_SomeSorter var2 = var1.child;
      Openflower154_SomeSorter var3 = null;
      var3 = var1.i;
      DualArrayList var4 = var1.e;
      Iterator var6;
      if(var3 != null) {
         var6 = var3.c(1073741824, 0).iterator();

         while(var6.hasNext()) {
            var5 = (Openflower105)var6.next();
            if(var1.g(var5.b())) {
               var5.b().a(1, var5, 4);
               var1.c(var5);
            }
         }
      }

      var6 = var2.c(Integer.MIN_VALUE, 0).iterator();

      while(var6.hasNext()) {
         if((var5 = (Openflower105)var6.next()).a() != 2 && var1.g(var5.b())) {
            var5.b().a(1, var5, 8);
            var1.c(var5);
         }

         var2.e(var5);
         var5.b().a(1, var5, var1);
         var1.a(0, var5);
      }

      if(var4.d(this.child.id)) {
         this.child = var1;
      }

      HashSet var10 = new HashSet(var2.getDataAsList(2, 1));
      Iterator var7 = var4.iterator();

      Openflower154_SomeSorter var11;
      while(var7.hasNext()) {
         var11 = (Openflower154_SomeSorter)var7.next();
         var10.retainAll(var11.getDataAsList(2, 1));
      }

      if(!var10.isEmpty()) {
         var7 = var2.c(2, 1).iterator();

         while(var7.hasNext()) {
            Openflower105 var12;
            var2 = (var12 = (Openflower105)var7.next()).c();
            if(var10.contains(var2) && !var4.d(var2.id)) {
               var1.f(new Openflower105(var1, var2, var12.d()));
            }
         }

         var7 = var4.iterator();

         while(var7.hasNext()) {
            Iterator var8 = (var11 = (Openflower154_SomeSorter)var7.next()).c(2, 1).iterator();

            while(var8.hasNext()) {
               Openflower105 var9 = (Openflower105)var8.next();
               if(var10.contains(var9.c())) {
                  var11.g(var9);
               }
            }
         }
      }

      if(var3 != null && !var1.getDataAsList(2, 1).contains(var3)) {
         var1.f(new Openflower105(1, var1, var3));
      }

      var7 = var4.iterator();

      while(var7.hasNext()) {
         var11 = (Openflower154_SomeSorter)var7.next();
         this.e.a(var11.id);
      }

      this.e.a((Object)var1, (Object)var1.id);
      var1.m();
      var1.m = this;
      var1.n();
      var1.o();
      if(var1.c == 6) {
         ((Openflower155_SwitchPrinter)var1).e();
      }

   }

   public final void m() {
      for(Iterator var1 = this.e.iterator(); var1.hasNext(); ((Openflower154_SomeSorter)var1.next()).m = this) {
         ;
      }

   }

   public final void c(Openflower105 var1) {
      if(var1.b != null) {
         var1.b.n.remove(var1);
      }

      var1.b = this;
      this.n.add(var1);
   }

   private void b(int var1, Openflower105 var2, int var3) {
      Map var4 = var1 == 0?this.b:this.a;
      Map var6 = var1 == 0?this.l:this.k;
      Object var5;
      if((var5 = (List)var4.get(Integer.valueOf(var3))) == null) {
         var4.put(Integer.valueOf(var3), var5 = new ArrayList());
      }

      ((List)var5).add(var2);
      Object var7;
      if((var7 = (List)var6.get(Integer.valueOf(var3))) == null) {
         var6.put(Integer.valueOf(var3), var7 = new ArrayList());
      }

      ((List)var7).add(var1 == 0?var2.b():var2.c());
   }

   private void a(int var1, Openflower105 var2) {
      int var3;
      int[] var7;
      if((var3 = var2.a()) == 2) {
         var7 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var7 = new int[]{Integer.MIN_VALUE, 1073741824, var3};
      }

      int[] var6 = var7;
      int var5 = var7.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         var3 = var6[var4];
         this.b(var1, var2, var3);
      }

   }

   private void c(int var1, Openflower105 var2, int var3) {
      Map var4 = var1 == 0?this.b:this.a;
      Map var5 = var1 == 0?this.l:this.k;
      List var6;
      int var7;
      if((var6 = (List)var4.get(Integer.valueOf(var3))) != null && (var7 = var6.indexOf(var2)) >= 0) {
         var6.remove(var7);
         ((List)var5.get(Integer.valueOf(var3))).remove(var7);
      }

   }

   private void b(int var1, Openflower105 var2) {
      int var3;
      int[] var7;
      if((var3 = var2.a()) == 2) {
         var7 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var7 = new int[]{Integer.MIN_VALUE, 1073741824, var3};
      }

      int[] var6 = var7;
      int var5 = var7.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         var3 = var6[var4];
         this.c(var1, var2, var3);
      }

   }

   public final void d(Openflower105 var1) {
      this.a(0, var1);
   }

   public final void e(Openflower105 var1) {
      if(var1 != null) {
         this.b(0, var1);
      }
   }

   public final void f(Openflower105 var1) {
      this.a(1, var1);
      if(var1.b != null) {
         var1.b.n.add(var1);
      }

      var1.c().a(0, var1);
   }

   public final void g(Openflower105 var1) {
      if(var1 != null) {
         this.b(1, var1);
         if(var1.b != null) {
            var1.b.n.remove(var1);
         }

         if(var1.c() != null) {
            var1.c().e(var1);
         }

      }
   }

   public final void e(Openflower154_SomeSorter var1) {
      if(var1 != null) {
         Openflower105 var2 = null;
         Iterator var3 = this.c(Integer.MIN_VALUE, 1).iterator();

         while(var3.hasNext()) {
            if((var2 = (Openflower105)var3.next()).c() == var1) {
               this.g(var2);
            }
         }

      }
   }

   public final HashSet n() {
      this.r.clear();
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         Openflower154_SomeSorter var1 = (Openflower154_SomeSorter)var2.next();
         this.r.addAll(var1.n());
         if(var1 != this.child) {
            this.r.remove(var1.y());
         }
      }

      var2 = this.c(8, 1).iterator();

      while(var2.hasNext()) {
         Openflower105 var3 = (Openflower105)var2.next();
         this.r.add(var3.c().y());
      }

      if(this.c == 5) {
         this.r.remove(this.child.y());
      }

      return this.r;
   }

   public final void o() {
      Iterator var2 = this.e.iterator();

      Openflower154_SomeSorter var1;
      while(var2.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var2.next();
         var1 = null;
         var10000.o();
      }

      switch(this.c) {
      case 0:
      case 10:
      case 13:
         return;
      case 2:
      case 15:
         this.q = false;

         for(var2 = this.e.iterator(); var2.hasNext(); this.q |= var1.q) {
            var1 = (Openflower154_SomeSorter)var2.next();
         }

         return;
      case 8:
         Openflower146 var5 = (Openflower146)this;
         var1 = null;
         Openflower7 var4;
         if((var4 = var5.e().e()) != null && var4.d() > 0) {
            for(int var3 = 0; var3 < var4.d(); ++var3) {
               if(var4.b(var3).opcode == 195) {
                  this.q = true;
                  break;
               }
            }

            this.p = var4.c().opcode == 194;
            return;
         }
         break;
      default:
         this.q = false;

         for(var2 = this.e.iterator(); var2.hasNext(); this.q |= var1.q) {
            var1 = (Openflower154_SomeSorter)var2.next();
         }
      }

   }

   public final List p() {
      Openflower154_SomeSorter var1 = this.child;
      ArrayList var2 = new ArrayList();
      a(var1, (List)var2);
      return var2;
   }

   public final List a(List var1) {
      ArrayList var2 = new ArrayList();
      HashSet var3;
      if(var1 == null) {
         Openflower106 var10000 = new Openflower106(this);
         var3 = null;
         var1 = Openflower106.b(var10000.a());
      }

      var3 = new HashSet();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)var4.next();
         this.a(var5, var2, var3);
      }

      if(var2.size() != this.e.size()) {
         Configuration.getLogger().writeMessage("computing post reverse post order failed!", 4);
         throw new RuntimeException("parsing failure!");
      } else {
         return var2;
      }
   }

   public final boolean f(Openflower154_SomeSorter var1) {
      return this == var1 || this.g(var1);
   }

   public final boolean g(Openflower154_SomeSorter var1) {
      if(this.e.contains(var1)) {
         return true;
      } else {
         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            if(((Openflower154_SomeSorter)this.e.get(var2)).g(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public String getString(int var1) {
      throw new RuntimeException("not implemented");
   }

   public List d() {
      return new ArrayList(this.e);
   }

   public void e_() {}

   public void a(Element var1, Element var2) {}

   public Openflower154_SomeSorter a() {
      throw new RuntimeException("not implemented");
   }

   public void b() {
      if(!this.e.isEmpty()) {
         this.child = (Openflower154_SomeSorter)this.e.get(0);
      }

   }

   public void a(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      Openflower105 var3 = null;
      Iterator var4 = var1.c(Integer.MIN_VALUE, 0).iterator();

      while(var4.hasNext()) {
         var3 = (Openflower105)var4.next();
         var1.e(var3);
         var3.b().a(1, var3, var2);
         var2.a(0, var3);
      }

      var4 = var1.c(Integer.MIN_VALUE, 1).iterator();

      while(var4.hasNext()) {
         var3 = (Openflower105)var4.next();
         var1.g(var3);
         var3.a(var2);
         var2.f(var3);
      }

      int var6 = this.e.c(var1.id);
      this.e.a(var1.id);
      this.e.a(var6, var2, var2.id);
      var3 = null;
      var2.m = this;
      var2.i = var1.i;
      if(this.child == var1) {
         this.child = var2;
      }

      ArrayList var7;
      for(var6 = (var7 = new ArrayList(var1.n)).size() - 1; var6 >= 0; --var6) {
         Openflower105 var5;
         if((var5 = (Openflower105)var7.get(var6)).b() != var2) {
            var2.c(var5);
         } else if(this != var5.c() && !this.g(var5.c())) {
            this.c(var5);
         } else {
            var5.b = null;
         }
      }

      var1.n.clear();
   }

   private static void a(Openflower154_SomeSorter var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (Openflower154_SomeSorter)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);
         List var6 = null;
         var6 = var0.c(Integer.MIN_VALUE, 1);

         while(true) {
            if(var5 < var6.size()) {
               Openflower105 var7;
               Openflower154_SomeSorter var8 = (var7 = (Openflower105)var6.get(var5)).c();
               if(var4.contains(var8) || var7.a() != 1 && var7.a() != 2) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var8);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var6.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   private void a(Openflower154_SomeSorter var1, List var2, HashSet var3) {
      if(!var3.contains(var1)) {
         var3.add(var1);
         Iterator var5 = var1.c(3, 0).iterator();

         while(var5.hasNext()) {
            Openflower105 var10000 = (Openflower105)var5.next();
            Openflower154_SomeSorter var4 = null;
            var4 = var10000.b();
            if(!var3.contains(var4)) {
               this.a(var4, var2, var3);
            }
         }

         var2.add(0, var1);
      }
   }

   public final void a(int var1, Openflower105 var2, Openflower154_SomeSorter var3) {
      Map var10 = this.a;
      Map var9 = this.k;
      int var4;
      int[] var11;
      if((var4 = var2.a()) == 2) {
         var11 = new int[]{Integer.MIN_VALUE, 2};
      } else {
         var11 = new int[]{Integer.MIN_VALUE, 1073741824, var4};
      }

      int[] var7 = var11;
      int var6 = var11.length;

      for(int var5 = 0; var5 < var6; ++var5) {
         var4 = var7[var5];
         List var8;
         int var12;
         if((var8 = (List)var10.get(Integer.valueOf(var4))) != null && (var12 = var8.indexOf(var2)) >= 0) {
            ((List)var9.get(Integer.valueOf(var4))).set(var12, var3);
         }
      }

      var2.b(var3);
   }

   public final void a(int var1, Openflower105 var2, int var3) {
      int var4;
      if((var4 = var2.a()) != var3) {
         if(var4 != 2 && var3 != 2) {
            this.c(var1, var2, var4);
            this.b(var1, var2, var3);
            if(var1 == 1) {
               var2.c().a(0, var2, var3);
            }

            var2.a(var3);
         } else {
            throw new RuntimeException("Invalid edge type!");
         }
      }
   }

   private List c(int var1, int var2) {
      Map var7 = var2 == 0?this.b:this.a;
      ArrayList var9;
      if((var1 & var1 - 1) == 0) {
         List var8;
         var9 = (var8 = (List)var7.get(Integer.valueOf(var1))) == null?new ArrayList():new ArrayList(var8);
      } else {
         var9 = new ArrayList();
         int[] var6 = Openflower105.a;
         int var5 = Openflower105.a.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            int var3 = var6[var4];
            List var10;
            if((var1 & var3) != 0 && (var10 = (List)var7.get(Integer.valueOf(var3))) != null) {
               var9.addAll(var10);
            }
         }
      }

      return var9;
   }

   public final List getDataAsList(int var1, int var2) {
      Map var7 = var2 == 0?this.l:this.k;
      ArrayList var9;
      if((var1 & var1 - 1) == 0) {
         List var8;
         var9 = (var8 = (List)var7.get(Integer.valueOf(var1))) == null?new ArrayList():new ArrayList(var8);
      } else {
         var9 = new ArrayList();
         int[] var6 = Openflower105.a;
         int var5 = Openflower105.a.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            int var3 = var6[var4];
            List var10;
            if((var1 & var3) != 0 && (var10 = (List)var7.get(Integer.valueOf(var3))) != null) {
               var9.addAll(var10);
            }
         }
      }

      return var9;
   }

   public final Set getDataAsSet(int var1, int var2) {
      return new HashSet(this.getDataAsList(var1, var2));
   }

   public final List c(int var1) {
      return this.c(var1, 1);
   }

   public final List d(int var1) {
      return this.c(var1, 0);
   }

   public final List q() {
      return this.c(Integer.MIN_VALUE, 1);
   }

   public final List r() {
      return this.c(Integer.MIN_VALUE, 0);
   }

   public final Openflower154_SomeSorter s() {
      return this.child;
   }

   public final void h(Openflower154_SomeSorter var1) {
      this.child = var1;
   }

   public final DualArrayList t() {
      return this.e;
   }

   public final int u() {
      return this.j;
   }

   public final HashSet v() {
      return this.r;
   }

   public final boolean w() {
      return this.q;
   }

   public final boolean x() {
      return this.p;
   }

   public final Openflower146 y() {
      return this.c == 8?(Openflower146)this:this.child.y();
   }

   public final boolean needsLabel() {
      Iterator var1 = this.n.iterator();

      Openflower105 var2;
      do {
         if(!var1.hasNext()) {
            return false;
         }
      } while(!(var2 = (Openflower105)var1.next()).c || !var2.d);

      return true;
   }

   public final boolean A() {
      return this.c == 8 || this.c == 2 && ((Openflower151)this).b == 0 || this.c == 5 && ((Openflower149_LoopPrinter)this).k() != 0;
   }

   public final Openflower154_SomeSorter B() {
      return this.m;
   }

   public final void i(Openflower154_SomeSorter var1) {
      this.m = var1;
   }

   public final HashSet C() {
      return this.n;
   }

   public final List D() {
      return this.h;
   }

   public final List E() {
      return this.g;
   }

   public final void b(List var1) {
      this.g = var1;
   }

   public final boolean F() {
      return this.o;
   }

   public final void G() {
      this.o = true;
   }
}
