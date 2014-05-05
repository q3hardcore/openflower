package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower198;
import de.fernflower.main.Openflower74;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.Iterator;

public final class EnumDecompiler {

   public static void a(Openflower74 var0) {
      ClassInfo var1;
      Iterator var3 = (var1 = var0.getClassInfo()).getMethods().iterator();

      String var6;
      while(var3.hasNext()) {
         MethodInfo var2;
         String var4 = (var2 = (MethodInfo)var3.next()).getName();
         byte var5 = 0;
         if("values".equals(var4)) {
            var5 = 1;
         } else if("valueOf".equals(var4)) {
            var5 = 2;
         }

         if(var5 > 0) {
            String[] var10000 = var2.getDesc().split("[()]");
            var6 = null;
            var6 = var10000[1];
            if(var5 == 1 && var6.length() == 0 || var5 == 2 && "Ljava/lang/String;".equals(var6)) {
               var0.d().add(Util.concat(var4, var2.getDesc()));
            }
         }
      }

      var3 = var0.getResults().iterator();

      while(true) {
         IntPair var8;
         MethodDecompileResult var10;
         do {
            if(!var3.hasNext()) {
               var3 = var1.getFields().iterator();

               while(var3.hasNext()) {
                  FieldInfo var13;
                  Element var18;
                  Openflower133 var24;
                  if(((var13 = (FieldInfo)var3.next()).access_flags & 16384) != 0 && (var18 = (Element)var0.e().b(Util.concat(var13.getName(), var13.getDesc()))) != null && var18.a == 10 && (var24 = (Openflower133)var18).l()) {
                     ClassNode var9 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var24.i().stringValue);
                     var6 = null;
                     Openflower74 var14;
                     ClassInfo var22;
                     Iterator var21 = (var22 = (var14 = var9.e).getClassInfo()).getFields().iterator();

                     while(var21.hasNext()) {
                        FieldInfo var23;
                        if(((var23 = (FieldInfo)var21.next()).access_flags & 4096) != 0) {
                           Openflower198 var12 = Openflower198.a(var23.getDesc());
                           var8 = null;
                           Descriptor var25;
                           if((var25 = var12.e).type == 8 && var25.arrayDepth == 1 && var22.name.equals(var25.stringValue)) {
                              var14.d().add(Util.concat(var23.getName(), var23.getDesc()));
                           }
                        }
                     }
                  }
               }

               return;
            }

            var10 = (MethodDecompileResult)var3.next();
         } while(!"<init>".equals(var10.method.getName()));

         Openflower154_SomeSorter var17;
         if((var17 = a((Openflower154_SomeSorter)var10.result)) == null || var17.E().isEmpty()) {
            return;
         }

         Element var20;
         if((var20 = (Element)var17.E().get(0)).a == 8) {
            boolean var16;
            label82: {
               Openflower131 var15 = (Openflower131)var20;
               var6 = null;
               MethodDecompileResult var19 = var10;
               Openflower131 var11 = var15;
               if(var15.j() == 2 && var11.l().a == 12) {
                  Openflower135 var7 = (Openflower135)var11.l();
                  var8 = new IntPair(var7);
                  if((String)var19.varProcessor.getTypes().get(var8) != null && !var0.getClassInfo().name.equals(var11.i())) {
                     var16 = true;
                     break label82;
                  }
               }

               var16 = false;
            }

            if(var16) {
               var17.E().remove(0);
            }
         }
      }
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.E() != null) {
         return var0;
      } else if(var0.needsLabel()) {
         return null;
      } else {
         switch(var0.c) {
         case 2:
         case 6:
         case 10:
         case 13:
         case 15:
            return a(var0.s());
         default:
            return null;
         }
      }
   }
}
