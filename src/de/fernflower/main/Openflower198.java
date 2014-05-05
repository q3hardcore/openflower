package de.fernflower.main;

import de.fernflower.main.Descriptor;

public final class Openflower198 {

   public static final Openflower198 a = a("Ljava/lang/Integer;");
   public static final Openflower198 b = a("Ljava/lang/Long;");
   public static final Openflower198 c = a("Ljava/lang/Float;");
   public static final Openflower198 d = a("Ljava/lang/Double;");
   public Descriptor e;
   public String f;


   public static Openflower198 a(String var0) {
      Openflower198 var1;
      (var1 = new Openflower198()).e = new Descriptor(var0);
      var1.f = var0;
      return var1;
   }

   public final String a() {
      return this.e.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower198) {
         Openflower198 var2 = (Openflower198)var1;
         return this.e.equals((Object)var2.e);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.e.hashCode();
   }
}
