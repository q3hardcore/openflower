package de.fernflower.main;

import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower89;
import de.fernflower.main.Openflower9;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IDManager;

public final class Openflower146 extends Openflower154_SomeSorter {

   private Openflower11 a;


   public Openflower146(Openflower11 var1) {
      this.c = 8;
      this.a = var1;
      this.id = Integer.valueOf(var1.a);
      IDManager var2 = Configuration.getIDManager();
      if(this.id.intValue() >= var2.get0()) {
         var2.set(0, this.id.intValue() + 1);
      }

      Opcode var3;
      if((var3 = var1.c()) != null) {
         if(var3.b == 2 && var3.opcode != 167) {
            this.j = 0;
         } else if(var3.b == 3) {
            this.j = 1;
         }
      }

      this.o();
   }

   public final String getString(int var1) {
      return Openflower89.a(this.h, var1) + Openflower89.a(this.g, var1);
   }

   public final Openflower154_SomeSorter a() {
      Openflower11 var1 = new Openflower11(Configuration.getIDManager().getNext(0));
      Openflower9 var2 = new Openflower9();

      for(int var3 = 0; var3 < this.a.e().d(); ++var3) {
         var2.a(this.a.e().b(var3).b(), -1);
      }

      var1.a((Openflower7)var2);
      return new Openflower146(var1);
   }

   public final Openflower11 e() {
      return this.a;
   }
}
