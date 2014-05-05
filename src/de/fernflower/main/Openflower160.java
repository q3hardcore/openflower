package de.fernflower.main;

import de.fernflower.main.util.IntPair;
import java.util.Comparator;

final class Openflower160 implements Comparator {

   // $FF: synthetic method
   // $FF: bridge method
   public final int compare(Object var1, Object var2) {
      IntPair var10000 = (IntPair)var1;
      IntPair var4 = (IntPair)var2;
      IntPair var3 = var10000;
      return var10000.val1 > var4.val1?1:(var3.val1 == var4.val1?0:-1);
   }
}
