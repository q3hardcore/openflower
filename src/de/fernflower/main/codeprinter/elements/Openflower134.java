package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower158;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower134 extends Element {

   private Element c;
   private List d = new ArrayList();


   public Openflower134(Element var1) {
      this.a = 11;
      this.c = var1;
   }

   public final Element copy() {
      Openflower134 var1 = new Openflower134(this.c.copy());
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.d.iterator();

      while(var3.hasNext()) {
         List var4 = (List)var3.next();
         var2.add(new ArrayList(var4));
      }

      var1.d = var2;
      return var1;
   }

   public final Openflower158 e() {
      Openflower158 var1;
      (var1 = new Openflower158()).b(this.c, Descriptor.BYTE_NO_SIGN);
      var1.a(this.c, Descriptor.INT);
      Descriptor var2 = this.c.getDescriptor();
      Iterator var4 = this.d.iterator();

      while(var4.hasNext()) {
         List var10000 = (List)var4.next();
         ConstantElement var3 = null;
         Iterator var5 = var10000.iterator();

         while(var5.hasNext()) {
            Descriptor var6;
            if((var3 = (ConstantElement)var5.next()) != null && !(var6 = var3.getDescriptor()).equals((Object)var2)) {
               var2 = Descriptor.b(var6, var2);
               var1.b(this.c, var2);
            }
         }
      }

      return var1;
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.c);
      return var1;
   }

   public final String toString(int var1) {
      return "switch(" + this.c.toString(var1) + ")";
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower134) {
         Openflower134 var2 = (Openflower134)var1;
         return Util.safeEquals((Object)this.c, (Object)var2.c);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.c) {
         this.c = var2;
      }

   }

   public final void a(List var1) {
      this.d = var1;
   }
}
