package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.codeprinter.elements.Element;
import java.util.List;

public final class Openflower123_assert extends Element {

   private List c;


   public Openflower123_assert(List var1) {
      this.a = 14;
      this.c = var1;
   }

   public final String toString(int var1) {
      StringBuilder var2;
      (var2 = new StringBuilder()).append("assert ");
      if(this.c.get(0) == null) {
         var2.append("false");
      } else {
         var2.append(((Element)this.c.get(0)).toString(var1));
      }

      if(this.c.size() > 1) {
         var2.append(" : ");
         var2.append(((Element)this.c.get(1)).toString(var1));
      }

      return var2.toString();
   }
}
