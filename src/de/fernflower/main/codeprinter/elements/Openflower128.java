package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower194;
import de.fernflower.main.Openflower198;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower128 extends Element {

   private String c;
   private String d;
   private boolean e;
   private Element f;
   private Openflower198 g;
   private String h;


   public Openflower128(Openflower194 var1, Element var2) {
      this.a = 5;
      this.f = var2;
      if(var2 == null) {
         this.e = true;
      }

      this.d = var1.a;
      this.c = var1.b;
      this.h = var1.c;
      this.g = Openflower198.a(var1.c);
   }

   public Openflower128(String var1, String var2, boolean var3, Element var4, Openflower198 var5) {
      this.a = 5;
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
      this.h = var5.f;
   }

   public final Descriptor getDescriptor() {
      return this.g.e;
   }

   public final int d_() {
      return this.f == null?1:this.f.d_() & 1;
   }

   public final List b() {
      ArrayList var1 = new ArrayList();
      if(this.f != null) {
         var1.add(this.f);
      }

      return var1;
   }

   public final Element copy() {
      return new Openflower128(this.c, this.d, this.e, this.f == null?null:this.f.copy(), this.g);
   }

   public final String toString(int var1) {
      StringBuffer var2 = new StringBuffer();
      if(this.e) {
         ClassNode var3;
         if((var3 = (ClassNode)Configuration.getObject("CURRENT_CLASSNODE")) == null || !this.d.equals(var3.classInfo.name)) {
            var2.append(Configuration.getImportManager().getRelativeName(Openflower89.getSourceName(this.d), true));
            var2.append(".");
         }
      } else {
         String var6 = null;
         String var8;
         if(this.f != null && this.f.a == 12) {
            Openflower135 var4 = (Openflower135)this.f;
            IntPair var5 = new IntPair(var4);
            MethodDecompileResult var7;
            if((var7 = (MethodDecompileResult)Configuration.getObject("CURRENT_METHOD_WRAPPER")) != null && (var8 = (String)var7.varProcessor.getTypes().get(var5)) != null && !this.d.equals(var8)) {
               var6 = var8;
            }
         }

         if(var6 != null) {
            ClassInfo var11 = ((ClassNode)Configuration.getObject("CURRENT_CLASSNODE")).classInfo;
            if(!var6.equals(var11.name)) {
               var2.append(Configuration.getImportManager().getRelativeName(Openflower89.getSourceName(var6), true));
               var2.append(".");
            }

            var2.append("super");
         } else {
            StringBuilder var9 = new StringBuilder();
            boolean var10 = Openflower89.a(this.f, new Descriptor(8, 0, this.d), var9, var1, true);
            var8 = var9.toString();
            if(var10 || this.f.c_() > this.c_()) {
               var8 = "(" + var8 + ")";
            }

            var2.append(var8);
         }

         var2.append(".");
      }

      var2.append(this.c);
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower128) {
         Openflower128 var2 = (Openflower128)var1;
         return Util.safeEquals((Object)this.c, (Object)var2.c) && Util.safeEquals((Object)this.d, (Object)var2.d) && this.e == var2.e && Util.safeEquals((Object)this.f, (Object)var2.f) && Util.safeEquals((Object)this.h, (Object)var2.h);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.f) {
         this.f = var2;
      }

   }

   public final String g() {
      return this.d;
   }

   public final String h() {
      return this.h;
   }

   public final Element i() {
      return this.f;
   }

   public final boolean j() {
      return this.e;
   }

   public final String k() {
      return this.c;
   }
}
