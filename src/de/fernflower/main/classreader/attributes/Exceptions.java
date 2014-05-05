package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Attribute;
import java.util.ArrayList;
import java.util.List;

public final class Exceptions extends Attribute {

   private List c = new ArrayList();


   public final void read(ConstPool var1) {
      this.name = "Exceptions";
      int var4 = 2 + (((this.data[0] & 255) << 8 | this.data[1] & 255) << 1);

      for(int var2 = 2; var2 < var4; var2 += 2) {
         int var3 = (this.data[var2] & 255) << 8 | this.data[var2 + 1] & 255;
         this.c.add(Integer.valueOf(var3));
      }

   }

   public final String a(int var1, ConstPool var2) {
      return (String)var2.a(((Integer)this.c.get(var1)).intValue()).a;
   }

   public final List a() {
      return this.c;
   }
}
