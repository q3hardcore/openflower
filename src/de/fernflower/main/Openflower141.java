package de.fernflower.main;


public final class Openflower141 {

   public String a;
   public String b;
   public String c;


   private Openflower141(String var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower141) {
         Openflower141 var2 = (Openflower141)var1;
         return (this.a + ":" + this.b + ":" + this.c).equals(var2.a + ":" + var2.b + ":" + var2.c);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return (this.a + ":" + this.b + ":" + this.c).hashCode();
   }

   // $FF: synthetic method
   Openflower141(String var1, String var2, String var3, Openflower141 var4) {
      this(var1, var2, var3);
   }
}
