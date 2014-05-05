package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Openflower194;
import de.fernflower.main.classreader.attributes.Attribute;

public final class EnclosingMethod extends Attribute {

   private String c;
   private String d;
   private String e;


   public final void read(ConstPool var1) {
      this.name = "EnclosingMethod";
      int var2 = (this.data[0] & 255) << 8 | this.data[1] & 255;
      int var3 = (this.data[2] & 255) << 8 | this.data[3] & 255;
      this.c = (String)var1.a(var2).a;
      if(var3 != 0) {
         Openflower194 var4 = var1.b(var3);
         this.d = var4.b;
         this.e = var4.c;
      }

   }

   public final String a() {
      return this.c;
   }

   public final String b() {
      return this.e;
   }

   public final String c() {
      return this.d;
   }
}
