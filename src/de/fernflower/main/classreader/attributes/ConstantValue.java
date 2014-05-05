package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Attribute;

public final class ConstantValue extends Attribute {

   private int c;


   public final void read(ConstPool var1) {
      this.name = "ConstantValue";
      this.c = (this.data[0] & 255) << 8 | this.data[1] & 255;
   }

   public final int a() {
      return this.c;
   }
}
