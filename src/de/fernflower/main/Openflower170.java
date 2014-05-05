package de.fernflower.main;

import de.fernflower.main.Openflower136;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class Openflower170 implements Openflower136 {

   // $FF: synthetic field
   private final HashMap a;


   Openflower170(HashMap var1) {
      this.a = var1;
   }

   public final int a(Element var1) {
      List var2;
      (var2 = var1.a(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         if((var1 = (Element)var5.next()).a == 12) {
            Openflower135 var4 = (Openflower135)var1;
            Integer var3;
            if((var3 = (Integer)this.a.get(new IntPair(var4))) != null) {
               var4.setIndex2(var3.intValue());
            }
         }
      }

      return 0;
   }
}
