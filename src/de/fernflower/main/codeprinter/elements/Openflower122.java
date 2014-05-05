package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower122 extends Element {

   private Element c;
   private Element d;
   private Descriptor e;


   public Openflower122(Element var1, Element var2, Descriptor var3) {
      this.a = 1;
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public final Element copy() {
      return new Openflower122(this.c.copy(), this.d.copy(), this.e);
   }

   public final Descriptor getDescriptor() {
      Descriptor var1;
      if((var1 = this.c.getDescriptor().copy()).equals((Object)Descriptor.NULL)) {
         var1 = this.e.copy();
      } else {
         var1.popArray();
      }

      return var1;
   }

   public final int d_() {
      return this.c.d_() & this.d.d_() & 1;
   }

   public final Openflower158 e() {
      Openflower158 var1;
      (var1 = new Openflower158()).b(this.d, Descriptor.BYTE_NO_SIGN);
      var1.a(this.d, Descriptor.INT);
      return var1;
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.c);
      var1.add(this.d);
      return var1;
   }

   public final String toString(int var1) {
      String var2 = this.c.toString(var1);
      if(this.c.c_() > this.c_()) {
         var2 = "(" + var2 + ")";
      }

      Descriptor var10000 = this.c.getDescriptor();
      Descriptor var3 = null;
      if(var10000.arrayDepth == 0) {
         (var3 = Descriptor.OBJECT.copy()).arrayDepth = 1;
         var2 = "((" + Openflower89.b(var3) + ")" + var2 + ")";
      }

      return var2 + "[" + this.d.toString(var1) + "]";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower122) {
         Openflower122 var2 = (Openflower122)var1;
         return Util.safeEquals((Object)this.c, (Object)var2.c) && Util.safeEquals((Object)this.d, (Object)var2.d);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.c) {
         this.c = var2;
      }

      if(var1 == this.d) {
         this.d = var2;
      }

   }

   public final Element f() {
      return this.c;
   }

   public final Element g() {
      return this.d;
   }
}
