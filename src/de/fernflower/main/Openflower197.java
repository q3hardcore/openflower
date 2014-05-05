package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.MethodSignatureHolder;
import java.util.ArrayList;
import java.util.List;

public final class Openflower197 {

   private List a = new ArrayList();
   private LIFOQueue b = new LIFOQueue();


   public final void a(int var1, Descriptor var2) {
      if(var1 >= this.a.size()) {
         for(int var3 = this.a.size(); var3 <= var1; ++var3) {
            this.a.add(new Descriptor(14));
         }
      }

      this.a.set(var1, var2);
   }

   public final Descriptor a(int var1) {
      if(var1 < this.a.size()) {
         return (Descriptor)this.a.get(var1);
      } else if(var1 < 0) {
         throw new IndexOutOfBoundsException();
      } else {
         return new Descriptor(14);
      }
   }

   public final Openflower197 a() {
      Openflower197 var1;
      (var1 = new Openflower197()).a = new ArrayList(this.a);
      var1.b = this.b.c();
      return var1;
   }

   public static Openflower197 a(MethodInfo var0) {
      Openflower197 var1 = new Openflower197();
      MethodSignatureHolder var2 = MethodSignatureHolder.create(var0.getDesc());
      int var3 = 0;
      if((var0.getAccess() & 8) == 0) {
         ++var3;
         var1.a(0, new Descriptor(8, 0, (String)null));
      }

      for(int var5 = 0; var5 < var2.params.length; ++var5) {
         Descriptor var4 = var2.params[var5];
         var1.a(var3++, var4);
         if(var4.varSize == 2) {
            var1.a(var3++, new Descriptor(12));
         }
      }

      return var1;
   }

   public final List b() {
      return this.a;
   }

   public final void a(List var1) {
      this.a = var1;
   }

   public final LIFOQueue c() {
      return this.b;
   }
}
