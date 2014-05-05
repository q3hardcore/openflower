package de.fernflower.main.classreader.opcodes;

import de.fernflower.main.Openflower7;
import de.fernflower.main.classreader.opcodes.Opcode;

public class Openflower8 extends Opcode {

   public int values;


   public final void a(Openflower7 var1) {
      this.values = var1.e(this.getValue(0));
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Opcode b() {
      Openflower8 var1;
      (var1 = (Openflower8)super.b()).values = this.values;
      return var1;
   }
}
