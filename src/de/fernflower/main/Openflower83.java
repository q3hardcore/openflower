package de.fernflower.main;

import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import java.util.LinkedList;

public final class Openflower83 {

   public static void a(Openflower152 var0) {
      LinkedList var1;
      (var1 = new LinkedList()).add(var0);

      while(!var1.isEmpty()) {
         Openflower154_SomeSorter var2;
         (var2 = (Openflower154_SomeSorter)var1.removeFirst()).l();
         var1.addAll(var2.t());
      }

   }
}
