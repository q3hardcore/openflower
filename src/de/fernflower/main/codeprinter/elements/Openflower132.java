package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower132 extends Element {

   private int c;
   private Element d;


   public Openflower132(int var1, Element var2) {
      this.a = 9;
      this.c = var1;
      this.d = var2;
   }

   public final Element copy() {
      return new Openflower132(this.c, this.d.copy());
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.d);
      return var1;
   }

   public final String toString(int var1) {
      return this.c == 0?"synchronized(" + this.d.toString(var1) + ")":"";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower132) {
         Openflower132 var2 = (Openflower132)var1;
         return this.c == var2.c && Util.safeEquals((Object)this.d, (Object)var2.d);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.d) {
         this.d = var2;
      }

   }

   public final int g() {
      return this.c;
   }

   public final Element h() {
      return this.d;
   }
}
