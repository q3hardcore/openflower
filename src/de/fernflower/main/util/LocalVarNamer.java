package de.fernflower.main.util;

import java.util.HashSet;

public final class LocalVarNamer {

   private HashSet usedNames = new HashSet();


   public LocalVarNamer() {}

   public LocalVarNamer(HashSet var1) {
      this.usedNames.addAll(var1);
   }

   public final void setUsed(String var1) {
      this.usedNames.add(var1);
   }

   public final String getName(int var1) {
      return this.getName("var" + var1);
   }

   public final String getName(String var1) {
      while(this.usedNames.contains(var1)) {
         var1 = var1 + "x";
      }

      this.usedNames.add(var1);
      return var1;
   }
}
