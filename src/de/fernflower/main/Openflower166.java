package de.fernflower.main;

import de.fernflower.main.Openflower116;
import de.fernflower.main.Openflower165;
import de.fernflower.main.Openflower218;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower166 implements Openflower116 {

   public int a;
   public int b;
   public Set c = new HashSet();
   public Set d = new HashSet();
   public int e;
   public Openflower218 f = new Openflower218();


   public Openflower166(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final List a() {
      ArrayList var1 = new ArrayList(this.d.size());
      Iterator var2 = this.d.iterator();

      while(var2.hasNext()) {
         Openflower165 var3 = (Openflower165)var2.next();
         var1.add(var3.a);
      }

      return var1;
   }

   public final void a(Openflower165 var1) {
      this.c.remove(var1);
   }

   public final void b(Openflower165 var1) {
      this.d.remove(var1);
   }

   public final void c(Openflower165 var1) {
      this.c.add(var1);
   }

   public final void d(Openflower165 var1) {
      this.d.add(var1);
   }

   public final String toString() {
      return "(" + this.a + "_" + this.b + ")";
   }
}
