package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower124 extends Element {

   private static final String[] operators = new String[]{" += ", " -= ", " *= ", " /= ", " &= ", " |= ", " ^= ", " %= ", " <<= ", " >>= ", " >>>= "};
   private Element d;
   private Element e;
   private int f = -1;


   public Openflower124(Element var1, Element var2) {
      this.a = 2;
      this.d = var1;
      this.e = var2;
   }

   public final Descriptor getDescriptor() {
      return this.e.getDescriptor();
   }

   public final Openflower158 e() {
      Openflower158 var1 = new Openflower158();
      Descriptor var2 = this.d.getDescriptor();
      Descriptor var3 = this.e.getDescriptor();
      if(var2.r > var3.r) {
         var1.b(this.e, Descriptor.getFamily(var2.r));
      } else if(var2.r < var3.r) {
         var1.b(this.d, var3);
      } else {
         var1.b(this.d, Descriptor.b(var2, var3));
      }

      return var1;
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).add(this.d);
      var1.add(this.e);
      return var1;
   }

   public final Element copy() {
      return new Openflower124(this.d.copy(), this.e.copy());
   }

   public final int c_() {
      return 13;
   }

   public final String toString(int var1) {
      Descriptor var2 = this.d.getDescriptor();
      Descriptor var3 = this.e.getDescriptor();
      String var4 = this.e.toString(var1);
      if(this.f == -1 && !var2.equals(var3) && (var3.equals((Object)Descriptor.OBJECT) || var2.type != 8)) {
         if(this.e.c_() >= Openflower129.g()) {
            var4 = "(" + var4 + ")";
         }

         var4 = "(" + Openflower89.b(var2) + ")" + var4;
      }

      StringBuilder var7 = new StringBuilder();
      boolean var8 = false;
      Openflower128 var5;
      ClassNode var6;
      FieldInfo var9;
      if(this.d.a == 5 && (var5 = (Openflower128)this.d).j() && (var6 = (ClassNode)Configuration.getObject("CURRENT_CLASSNODE")) != null && (var9 = var6.classInfo.getField(var5.k(), var5.h())) != null && (var9.access_flags & 16) != 0) {
         var8 = true;
      }

      if(var8) {
         var7.append(((Openflower128)this.d).k());
      } else {
         var7.append(this.d.toString(var1));
      }

      var7.append((this.f == -1?" = ":operators[this.f]) + var4);
      return var7.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower124) {
         Openflower124 var2 = (Openflower124)var1;
         return Util.safeEquals((Object)this.d, (Object)var2.d) && Util.safeEquals((Object)this.e, (Object)var2.e) && this.f == var2.f;
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.d) {
         this.d = var2;
      }

      if(var1 == this.e) {
         this.e = var2;
      }

   }

   public final Element g() {
      return this.d;
   }

   public final Element h() {
      return this.e;
   }

   public final void a(Element var1) {
      this.e = var1;
   }

   public final int i() {
      return this.f;
   }

   public final void b(int var1) {
      this.f = var1;
   }
}
