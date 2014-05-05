package de.fernflower.main;

import de.fernflower.main.Openflower212;
import java.util.Map.Entry;

final class Openflower217 implements Entry {

   private Integer a;
   private Openflower212 b;


   Openflower217(int var1, Openflower212 var2) {
      this.a = Integer.valueOf(var1);
      this.b = var2;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object getValue() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object getKey() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final Object setValue(Object var1) {
      return null;
   }
}
