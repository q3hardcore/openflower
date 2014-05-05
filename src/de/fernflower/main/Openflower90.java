package de.fernflower.main;

import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.LIFOQueue;

public final class Openflower90 extends LIFOQueue {

   public Openflower90() {}

   private Openflower90(LIFOQueue var1) {
      super(var1);
      this.size = var1.getSize();
   }

   public final Element a(Element var1) {
      super.push(var1);
      return var1;
   }

   public final Element a() {
      return (Element)this.remove(--this.size);
   }

   public final Openflower90 b() {
      return new Openflower90(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final LIFOQueue c() {
      return this.b();
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object pop() {
      return this.a();
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object push(Object var1) {
      Element var2;
      super.push(var2 = (Element)var1);
      return var2;
   }
}
