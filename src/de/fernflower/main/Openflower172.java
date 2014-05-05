package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower136;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class Openflower172 implements Openflower136 {

   // $FF: synthetic field
   private final HashMap a;
   // $FF: synthetic field
   private final HashMap b;


   Openflower172(HashMap var1, HashMap var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int a(Element var1) {
      List var2;
      (var2 = var1.a(true)).add(var1);
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         if((var1 = (Element)var5.next()).a == 12) {
            Openflower135 var3 = (Openflower135)var1;
            Integer var4;
            if((var4 = (Integer)this.a.get(new IntPair(var3))) != null) {
               var3.setIndex(var4.intValue());
               var3.setIndex2(0);
            }
         } else {
            Descriptor var6;
            if(var1.a == 3 && (var6 = (Descriptor)this.b.get(new IntPair(var1.b, -1))) != null && var6.equals((Object)Descriptor.CHAR)) {
               ((ConstantElement)var1).a(var6);
            }
         }
      }

      return 0;
   }
}
