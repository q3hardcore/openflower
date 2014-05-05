package de.fernflower.main;

import de.fernflower.main.Openflower116;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower9;
import de.fernflower.main.classreader.opcodes.Opcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower11 implements Openflower116 {

   public int a = 0;
   public int b = 0;
   private Openflower7 c = new Openflower9();
   private List d = new ArrayList();
   private List e = new ArrayList();
   private List f = new ArrayList();
   private List g = new ArrayList();
   private List h = new ArrayList();


   public Openflower11() {}

   public Openflower11(int var1) {
      this.a = var1;
   }

   public final Object clone() {
      Openflower11 var1;
      (var1 = new Openflower11()).a = this.a;
      var1.c = this.c.a();
      var1.f = new ArrayList(this.f);
      return var1;
   }

   public final Opcode b() {
      return this.c.b(0);
   }

   public final Opcode c() {
      return this.c.e()?null:this.c.c();
   }

   public final void a(Openflower11 var1) {
      this.d.add(var1);
   }

   public final void b(Openflower11 var1) {
      while(this.d.remove(var1)) {
         ;
      }

   }

   public final void c(Openflower11 var1) {
      this.e.add(var1);
      var1.a(this);
   }

   public final void d(Openflower11 var1) {
      while(this.e.remove(var1)) {
         ;
      }

      var1.b(this);
   }

   public final void a(Openflower11 var1, Openflower11 var2) {
      int var3;
      for(var3 = 0; var3 < this.e.size(); ++var3) {
         if(((Openflower11)this.e.get(var3)).a == var1.a) {
            this.e.set(var3, var2);
            var1.b(this);
            var2.a(this);
         }
      }

      for(var3 = 0; var3 < this.h.size(); ++var3) {
         if(((Openflower11)this.h.get(var3)).a == var1.a) {
            this.h.set(var3, var2);
            var1.i(this);
            var2.h(this);
         }
      }

   }

   private void h(Openflower11 var1) {
      this.g.add(var1);
   }

   private void i(Openflower11 var1) {
      while(this.g.remove(var1)) {
         ;
      }

   }

   public final void e(Openflower11 var1) {
      if(!this.h.contains(var1)) {
         this.h.add(var1);
         var1.h(this);
      }

   }

   public final void f(Openflower11 var1) {
      while(this.h.remove(var1)) {
         ;
      }

      var1.i(this);
   }

   public final String toString() {
      Openflower11 var10000 = this;
      boolean var1 = false;
      //this = var10000;
      return this.a + ":\r\n" + this.c.f(0);
   }

   public final boolean g(Openflower11 var1) {
      Iterator var2 = this.e.iterator();

      while(var2.hasNext()) {
         if(((Openflower11)var2.next()).a == var1.a) {
            return true;
         }
      }

      return false;
   }

   public final void a(List var1) {
      this.f = var1;
   }

   public final List a() {
      ArrayList var1;
      (var1 = new ArrayList(this.d)).addAll(this.g);
      return var1;
   }

   public final List d() {
      return this.d;
   }

   public final Openflower7 e() {
      return this.c;
   }

   public final void a(Openflower7 var1) {
      this.c = var1;
   }

   public final List f() {
      return this.e;
   }

   public final List g() {
      return this.h;
   }

   public final List h() {
      return this.g;
   }
}
