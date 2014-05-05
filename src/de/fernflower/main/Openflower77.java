package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.Openflower136;
import de.fernflower.main.Openflower79;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class Openflower77 implements Openflower136 {

   // $FF: synthetic field
   private final HashMap a;
   // $FF: synthetic field
   private final ClassNode b;
   // $FF: synthetic field
   private final HashMap c;
   // $FF: synthetic field
   private final MethodDecompileResult d;


   Openflower77(HashMap var1, ClassNode var2, HashMap var3, MethodDecompileResult var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final int a(Element var1) {
      List var2;
      (var2 = var1.a(true)).add(var1);
      Iterator var11 = var2.iterator();

      while(var11.hasNext()) {
         Openflower131 var10;
         if((var1 = (Element)var11.next()).a == 10 && (var10 = ((Openflower133)var1).g()) != null && this.a.containsKey(var10.i())) {
            String var3 = var10.i();
            ClassNode var4;
            if((var4 = this.b.getChild(var3)).a != 1) {
               List var5 = (List)((HashMap)this.a.get(var3)).get(var10.q());
               if(!this.c.containsKey(var3)) {
                  this.c.put(var3, new HashMap());
               }

               ArrayList var6 = new ArrayList();

               for(int var7 = 0; var7 < var5.size(); ++var7) {
                  Element var8 = (Element)var10.g().get(var7);
                  Openflower79 var9 = null;
                  if(var8.a == 12 && var5.get(var7) != null) {
                     IntPair var14 = new IntPair((Openflower135)var8);
                     var9 = new Openflower79(((Openflower79)var5.get(var7)).a, var14);
                  }

                  var6.add(var9);
               }

               Object var12;
               if((var12 = (List)((HashMap)this.c.get(var3)).get(var10.q())) == null) {
                  var12 = var6;
               } else {
                  for(int var13 = 0; var13 < ((List)var12).size(); ++var13) {
                     if(!Util.safeEquals(((List)var12).get(var13), var6.get(var13))) {
                        ((List)var12).set(var13, (Object)null);
                     }
                  }
               }

               ((HashMap)this.c.get(var3)).put(var10.q(), var12);
               var4.f = Util.concat(this.d.method.getName(), this.d.method.getDesc());
            }
         }
      }

      return 0;
   }
}
