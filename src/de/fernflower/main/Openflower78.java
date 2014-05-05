package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower136;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.HashMap;
import java.util.Iterator;

final class Openflower78 implements Openflower136 {

   // $FF: synthetic field
   private final ClassNode a;
   // $FF: synthetic field
   private final HashMap b;
   // $FF: synthetic field
   private final MethodDecompileResult c;
   // $FF: synthetic field
   private final HashMap d;


   Openflower78(ClassNode var1, HashMap var2, MethodDecompileResult var3, HashMap var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final int a(Element var1) {
      Openflower124 var2;
      Openflower128 var3;
      if(var1.a == 2 && (var2 = (Openflower124)var1).g().a == 5 && (var3 = (Openflower128)var2.g()).g().equals(this.a.classInfo.name) && this.b.containsKey(Util.concat(var3.k(), var3.h()))) {
         return 2;
      } else {
         Openflower131 var4;
         if(this.a.a == 2 && "<init>".equals(this.c.method.getName()) && var1.a == 8 && (var4 = (Openflower131)var1).j() == 2) {
            this.a.g = var4;
            return 2;
         } else {
            this.b(var1);
            return 0;
         }
      }
   }

   private Element b(Element var1) {
      if(var1.a == 12) {
         int var2 = ((Openflower135)var1).getIndex();
         if(this.d.containsKey(Integer.valueOf(var2))) {
            IntPair var3 = (IntPair)this.d.get(Integer.valueOf(var2));
            this.c.varProcessor.b().add(var3);
            return new Openflower135(var3.val1, this.c.varProcessor.a(var3), this.c.varProcessor);
         }
      } else if(var1.a == 5) {
         Openflower128 var6;
         String var8 = Util.concat((var6 = (Openflower128)var1).k(), var6.h());
         if(var6.g().equals(this.a.classInfo.name) && this.b.containsKey(var8)) {
            IntPair var10 = (IntPair)this.b.get(var8);
            this.c.varProcessor.b().add(var10);
            return new Openflower135(var10.val1, this.c.varProcessor.a(var10), this.c.varProcessor);
         }
      }

      boolean var7 = true;

      while(var7) {
         var7 = false;
         Iterator var4 = var1.b().iterator();

         while(var4.hasNext()) {
            Element var9 = (Element)var4.next();
            Element var5;
            if((var5 = this.b(var9)) != null) {
               var1.a(var9, var5);
               var7 = true;
               break;
            }
         }
      }

      return null;
   }
}
