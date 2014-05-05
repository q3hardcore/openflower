package de.fernflower.main;

import de.fernflower.main.Openflower7;
import de.fernflower.main.util.DualArrayList;

public final class Openflower9 extends Openflower7 {

   public Openflower9() {}

   private Openflower9(DualArrayList var1) {
      this.a = var1;
   }

   public final void a(int var1) {
      this.a.remove(var1);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Openflower7 a() {
      Openflower9 var1;
      (var1 = new Openflower9(this.a.b())).g(this.g());
      return var1;
   }
}
