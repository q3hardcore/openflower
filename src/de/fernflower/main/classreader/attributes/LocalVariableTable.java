package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Attribute;
import java.util.HashMap;

public final class LocalVariableTable extends Attribute {

   private HashMap c = new HashMap();


   public final void read(ConstPool var1) {
      this.name = "LocalVariableTable";
      int var2 = (this.data[0] & 255) << 8 | this.data[1] & 255;
      int var3 = 6;

      for(int var4 = 0; var4 < var2; var3 += 10) {
         int var5 = (this.data[var3] & 255) << 8 | this.data[var3 + 1] & 255;
         int var6 = (this.data[var3 + 4] & 255) << 8 | this.data[var3 + 5] & 255;
         this.c.put(Integer.valueOf(var6), (String)var1.a(var5).a);
         ++var4;
      }

   }

   public final void a(LocalVariableTable var1) {
      this.c.putAll(var1.c);
   }

   public final HashMap a() {
      return this.c;
   }
}
