package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Openflower195;

public final class Openflower196 extends Openflower195 {

   private int c;
   public Object a;
   public boolean b;


   public Openflower196(int var1, Object var2) {
      this.d = var1;
      this.a = var2;
      this.a();
   }

   public Openflower196(int var1, int var2) {
      this.d = var1;
      this.c = var2;
   }

   public final void a(ConstPool var1) {
      if(this.d == 7 || this.d == 8) {
         this.a = (String)var1.a(this.c).a;
         this.a();
      }

   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower196) {
         Openflower196 var2 = (Openflower196)var1;
         return this.d == var2.d && this.b == var2.b && this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   private void a() {
      if(this.d == 7) {
         String var1 = null;
         var1 = (String)this.a;
         this.b = var1.length() > 0 && var1.charAt(0) == 91;
      }

   }
}
