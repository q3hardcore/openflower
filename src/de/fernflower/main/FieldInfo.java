package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.util.DualArrayList;

public final class FieldInfo {

   public int access_flags;
   public int name_index;
   public int descriptor_index;
   private String name;
   private String desc;
   private DualArrayList f;


   public final void setSignature(ConstPool var1, int var2) {
      String[] var3 = var1.a(2, var2, this.name_index, this.descriptor_index);
      this.name = var3[0];
      this.desc = var3[1];
   }

   public final DualArrayList a() {
      return this.f;
   }

   public final void a(DualArrayList var1) {
      this.f = var1;
   }

   public final String getDesc() {
      return this.desc;
   }

   public final String getName() {
      return this.name;
   }
}
