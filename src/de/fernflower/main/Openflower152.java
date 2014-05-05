package de.fernflower.main;

import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower89;

public final class Openflower152 extends Openflower154_SomeSorter {

   private Openflower154_SomeSorter a;


   public Openflower152(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      this.c = 13;
      this.child = var1;
      this.a = var2;
      this.e.a((Object)this.child, (Object)this.child.id);
      this.child.i(this);
   }

   public final String getString(int var1) {
      return Openflower89.a(this.h, var1) + this.child.getString(var1);
   }

   public final Openflower154_SomeSorter e() {
      return this.a;
   }
}
