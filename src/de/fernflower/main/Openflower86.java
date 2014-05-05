package de.fernflower.main;

import java.util.Comparator;
import java.util.HashMap;

final class Openflower86 implements Comparator {

   // $FF: synthetic field
   private final HashMap a;


   Openflower86(HashMap var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public final int compare(Object var1, Object var2) {
      Integer var10001 = (Integer)var1;
      Integer var4 = (Integer)var2;
      Integer var3 = var10001;
      return ((Integer)this.a.get(var3)).compareTo((Integer)this.a.get(var4));
   }
}
