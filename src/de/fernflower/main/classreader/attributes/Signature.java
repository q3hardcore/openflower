package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Attribute;

public final class Signature extends Attribute {

   private String c;


   public final void read(ConstPool var1) {
      this.name = "Signature";
      this.c = (String)var1.a((this.data[0] & 255) << 8 | this.data[1] & 255).a;
   }

   public final String a() {
      return this.c;
   }
}
