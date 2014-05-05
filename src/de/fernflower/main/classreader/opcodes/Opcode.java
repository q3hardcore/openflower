package de.fernflower.main.classreader.opcodes;

import de.fernflower.main.Openflower0;
import de.fernflower.main.Openflower7;
import de.fernflower.main.classreader.opcodes.OpcodeFactory;

public class Opcode implements Openflower0 {

   public int opcode;
   public int b = 1;
   public boolean isWide = false;
   private int[] values = null;


   public final int getNumValues() {
      return this.values == null?0:this.values.length;
   }

   public final int getValue(int var1) {
      return this.values[var1];
   }

   public Opcode b() {
      return OpcodeFactory.createOpcode(this.opcode, this.isWide, this.b, this.values == null?null:(int[])this.values.clone());
   }

   public String toString() {
      String var1 = this.isWide?"@wide ":"";
      var1 = var1 + "@" + OpcodeFactory.getName(this.opcode);
      int var2 = this.getNumValues();

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4;
         if((var4 = this.values[var3]) < 0) {
            var1 = var1 + " -" + Integer.toHexString(-var4);
         } else {
            var1 = var1 + " " + Integer.toHexString(var4);
         }
      }

      return var1;
   }

   public void a(Openflower7 var1) {}

   public final int[] getValues() {
      return this.values;
   }

   public final void setValues(int[] var1) {
      this.values = var1;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public Object clone() {
      return this.b();
   }
}
