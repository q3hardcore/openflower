package de.fernflower.main.classreader.opcodes;

import de.fernflower.main.Openflower7;
import de.fernflower.main.classreader.opcodes.Opcode;

public class Openflower10 extends Opcode {

   private int[] d;
   private int[] f;
   private int g;


   public final void a(Openflower7 var1) {
      int var2 = this.opcode == 170?3:2;
      int var3 = this.getValues().length - var2;
      this.g = var1.e(this.getValue(0));
      int var4 = 0;
      if(this.opcode == 171) {
         var3 /= 2;
      } else {
         var4 = this.getValue(1);
      }

      this.d = new int[var3];
      this.f = new int[var3];
      int var5 = 0;

      for(int var6 = 0; var5 < var3; ++var6) {
         if(this.opcode == 171) {
            this.f[var5] = this.getValue(var2 + var6);
            ++var6;
         } else {
            this.f[var5] = var4 + var6;
         }

         this.d[var5] = var1.e(this.getValue(var2 + var6));
         ++var5;
      }

   }

   public final int[] d() {
      return this.d;
   }

   public final int e() {
      return this.g;
   }

   public final int[] f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Opcode b() {
      Openflower10 var1;
      (var1 = (Openflower10)super.b()).g = this.g;
      var1.d = (int[])this.d.clone();
      var1.f = (int[])this.f.clone();
      return var1;
   }
}
