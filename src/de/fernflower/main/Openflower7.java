package de.fernflower.main;

import de.fernflower.main.Openflower3;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.Util;

public abstract class Openflower7 {

   protected DualArrayList a = new DualArrayList();
   private int c = 0;
   protected Openflower3 b = new Openflower3();


   public Openflower7 a() {
      return null;
   }

   public final void b() {
      this.a.clear();
      this.c = 0;
      this.b = new Openflower3();
   }

   public final void a(Opcode var1, int var2) {
      this.a.a((Object)var1, (Object)Integer.valueOf(var2));
   }

   public final void a(Opcode var1) {
      this.a.a(0, var1, Integer.valueOf(-1));
   }

   public void a(int var1) {
      this.a.remove(var1);
   }

   public final Opcode b(int var1) {
      return (Opcode)this.a.get(var1);
   }

   public final Opcode c() {
      return (Opcode)this.a.a();
   }

   public final int c(int var1) {
      return ((Integer)this.a.a(var1)).intValue();
   }

   public final int d(int var1) {
      Integer var2 = new Integer(var1);
      return this.a.d(var2)?this.a.c(var2):-1;
   }

   public final int e(int var1) {
      Integer var2 = new Integer(((Integer)this.a.a(this.c)).intValue() + var1);
      return this.a.d(var2)?this.a.c(var2):-1;
   }

   public final int d() {
      return this.a.size();
   }

   public final boolean e() {
      return this.a.isEmpty();
   }

   public final void f() {
      this.c += -1;
   }

   public String toString() {
      return this.f(0);
   }

   public final String f(int var1) {
      StringBuffer var3 = new StringBuffer();

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         var3.append(Util.getIndent(0));
         var3.append(((Integer)this.a.a(var2)).intValue());
         var3.append(": ");
         var3.append(((Opcode)this.a.get(var2)).toString());
         var3.append("\r\n");
      }

      return var3.toString();
   }

   public final int g() {
      return this.c;
   }

   public final void g(int var1) {
      this.c = var1;
   }

   public final Openflower3 h() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public Object clone() {
      return this.a();
   }
}
