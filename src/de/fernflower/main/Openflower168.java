package de.fernflower.main;

import de.fernflower.main.Openflower115;
import de.fernflower.main.Openflower169;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class Openflower168 implements Openflower115 {

   // $FF: synthetic field
   private Openflower169 a;
   // $FF: synthetic field
   private final HashSet b;


   Openflower168(Openflower169 var1, HashSet var2) {
      this.a = var1;
      this.b = var2;
      //super();
   }

   public final List a() {
      return Openflower169.a(this.a, (Collection)this.b);
   }

   public final Set b() {
      return new HashSet(this.b);
   }
}
