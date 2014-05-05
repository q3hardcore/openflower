package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower89;
import de.fernflower.main.classreader.attributes.Exceptions;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower126 extends Element {

   private int c;
   private Element d;
   private Descriptor e;


   public Openflower126(int var1, Element var2, Descriptor var3) {
      this.a = 4;
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public final Element copy() {
      return new Openflower126(this.c, this.d == null?null:this.d.copy(), this.e);
   }

   public final Openflower158 e() {
      Openflower158 var1 = new Openflower158();
      if(this.c == 0 && this.e.type != 10) {
         var1.b(this.d, Descriptor.getFamily(this.e.r));
         var1.a(this.d, this.e);
      }

      return var1;
   }

   public final List b() {
      ArrayList var1 = new ArrayList();
      if(this.d != null) {
         var1.add(this.d);
      }

      return var1;
   }

   public final String toString(int var1) {
      if(this.c == 0) {
         StringBuilder var8 = new StringBuilder();
         if(this.e.type != 10) {
            var8.append(" ");
            Openflower89.a(this.d, this.e, var8, var1, false);
         }

         return "return" + var8.toString();
      } else {
         MethodDecompileResult var2 = (MethodDecompileResult)Configuration.getObject("CURRENT_METHOD_WRAPPER");
         ClassNode var3 = (ClassNode)Configuration.getObject("CURRENT_CLASSNODE");
         Exceptions var7;
         if(var2 != null && var3 != null && (var7 = (Exceptions)var2.method.getAttributes().b("Exceptions")) != null) {
            String var4 = null;

            for(int var5 = 0; var5 < var7.a().size(); ++var5) {
               String var6 = var7.a(var5, var3.classInfo.getConstPool());
               if("java/lang/Throwable".equals(var6)) {
                  var4 = var6;
                  break;
               }

               if("java/lang/Exception".equals(var6)) {
                  var4 = var6;
               }
            }

            if(var4 != null) {
               Descriptor var9 = new Descriptor(var4, true);
               StringBuilder var10 = new StringBuilder();
               Openflower89.a(this.d, var9, var10, var1, false);
               return "throw " + var10.toString();
            }
         }

         return "throw " + this.d.toString(var1);
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower126) {
         Openflower126 var2 = (Openflower126)var1;
         return this.c == var2.c && Util.safeEquals((Object)this.d, (Object)var2.d);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.d) {
         this.d = var2;
      }

   }

   public final int f() {
      return this.c;
   }

   public final Element g() {
      return this.d;
   }

   public final Descriptor h() {
      return this.e;
   }
}
