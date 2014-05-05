package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Openflower130 extends Element {

   private static final int[] c = new int[]{42, 43, 44, 45, 46, 47, 42, 43, 42, 43, 44, 45, 46, 47, 42, 43, 48, 49, 12, -1};
   private Element d;


   public Openflower130(int var1, LIFOQueue var2) {
      this.a = 7;
      if(var1 <= 5) {
         var2.push(new ConstantElement(0, true));
      } else if(var1 <= 7) {
         var2.push(new ConstantElement(Descriptor.NULL, (Object)null));
      }

      if(var1 == 19) {
         this.d = (Element)var2.pop();
      } else {
         this.d = new Openflower129(c[var1], var2);
      }
   }

   private Openflower130(Element var1) {
      this.a = 7;
      this.d = var1;
   }

   public final Element copy() {
      return new Openflower130(this.d.copy());
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.d);
      return var1;
   }

   public final String toString(int var1) {
      StringBuffer var2;
      (var2 = new StringBuffer("if(")).append(this.d.toString(var1));
      var2.append(")");
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower130) {
         Openflower130 var2 = (Openflower130)var1;
         return Util.safeEquals((Object)this.d, (Object)var2.d);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.d) {
         this.d = var2;
      }

   }

   public final Openflower130 b_() {
      this.d = new Openflower129(12, Arrays.asList(new Element[]{this.d}));
      return this;
   }

   public final Element d() {
      return this.d;
   }

   public final void a(Element var1) {
      this.d = var1;
   }
}
