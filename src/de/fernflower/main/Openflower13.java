package de.fernflower.main;

import de.fernflower.main.Openflower11;
import java.util.ArrayList;
import java.util.List;

public final class Openflower13 {

   private List a = new ArrayList();
   private Openflower11 b;
   private String c;


   public Openflower13(List var1, Openflower11 var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean a() {
      return this.a.contains(this.b);
   }

   public final String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("exceptionType: " + this.c + "\n");
      var1.append("handler: " + this.b.a + "\n");
      var1.append("range: ");

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         var1.append(((Openflower11)this.a.get(var2)).a + " ");
      }

      var1.append("\n");
      return var1.toString();
   }

   public final Openflower11 b() {
      return this.b;
   }

   public final void a(Openflower11 var1) {
      this.b = var1;
   }

   public final List c() {
      return this.a;
   }

   public final String d() {
      return this.c;
   }
}
