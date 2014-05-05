package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower136;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower135;
import java.util.Iterator;
import java.util.List;

final class Openflower162 implements Openflower136 {

   public final int a(Element var1) {
      List var2;
      (var2 = var1.a(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         Element var3;
         if((var3 = (Element)var5.next()).a == 12) {
            ((Openflower135)var3).setDescriptor(Descriptor.UNKNOWN);
         } else {
            ConstantElement var4;
            if(var3.a == 3 && (var4 = (ConstantElement)var3).i().r == 2) {
               var4.a((new ConstantElement(var4.k(), var4.l())).i());
            }
         }
      }

      return 0;
   }
}
