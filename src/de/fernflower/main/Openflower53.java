package de.fernflower.main;

import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower136;
import de.fernflower.main.Openflower54;
import de.fernflower.main.Openflower74;
import de.fernflower.main.codeprinter.elements.Element;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class Openflower53 implements Openflower136 {

   // $FF: synthetic field
   private Openflower54 a;
   // $FF: synthetic field
   private final HashMap b;
   // $FF: synthetic field
   private final HashSet c;


   Openflower53(Openflower54 var1, HashMap var2, HashSet var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      //super();
   }

   public final int a(Element var1) {
      Iterator var3 = this.b.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var2 = (Entry)var3.next();
         if(Openflower54.a(this.a, var1, (Openflower74)var2.getKey(), (MethodDecompileResult)var2.getValue())) {
            this.c.add((Openflower74)var2.getKey());
         }
      }

      return 0;
   }
}
