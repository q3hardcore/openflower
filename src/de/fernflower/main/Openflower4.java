package de.fernflower.main;

import de.fernflower.main.ExceptionEntry;
import de.fernflower.main.Openflower3;
import de.fernflower.main.Openflower7;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;

public final class Openflower4 extends Openflower7 {

   public Openflower4(DualArrayList var1, Openflower3 var2) {
      this.a = var1;
      this.b = var2;

      ExceptionEntry var3;
      for(Iterator var4 = var2.a().iterator(); var4.hasNext(); var3.handler_instr = this.d(var3.handler)) {
         (var3 = (ExceptionEntry)var4.next()).from_instr = this.d(var3.from);
         var3.to_instr = this.d(var3.to);
      }

   }
}
