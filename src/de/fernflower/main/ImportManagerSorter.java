package de.fernflower.main;

import java.util.Comparator;
import java.util.Map.Entry;

final class ImportManagerSorter implements Comparator {

   // $FF: synthetic method
   // $FF: bridge method
   public final int compare(Object var1, Object var2) {
      Entry var10000 = (Entry)var1;
      Entry var4 = (Entry)var2;
      Entry var3 = var10000;
      int var5;
      if((var5 = ((String)var10000.getValue()).compareTo((String)var4.getValue())) == 0) {
         var5 = ((String)var3.getKey()).compareTo((String)var4.getKey());
      }

      return var5;
   }
}
