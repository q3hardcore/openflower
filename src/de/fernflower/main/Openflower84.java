package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.util.MethodSignatureHolder;
import java.util.ArrayList;

public final class Openflower84 {

   private static final Descriptor a = new Descriptor(8, 0, "java/lang/StringBuilder");
   private static final Descriptor b = new Descriptor(8, 0, "java/lang/StringBuffer");


   public static Element a(Element var0) {
      Element var1 = null;
      Descriptor var2 = null;
      if(var0.a == 8) {
         Openflower131 var3 = (Openflower131)var0;
         if("toString".equals(var3.o())) {
            if("java/lang/StringBuilder".equals(var3.i())) {
               var2 = a;
            } else if("java/lang/StringBuffer".equals(var3.i())) {
               var2 = b;
            }

            if(var2 != null) {
               var1 = var3.l();
            }
         }
      }

      if(var1 == null) {
         return var0;
      } else {
         ArrayList var12 = new ArrayList();

         byte var4;
         MethodSignatureHolder var21;
         Descriptor var20;
         do {
            var4 = 0;
            switch(var1.a) {
            case 8:
               boolean var10000;
               Openflower131 var14;
               label163: {
                  Openflower131 var17 = var14 = (Openflower131)var1;
                  if("append".equals(var17.o()) && (var21 = var17.h()).ret.equals((Object)var2) && var21.params.length == 1) {
                     switch((var20 = var21.params[0]).type) {
                     case 6:
                     default:
                        break;
                     case 8:
                        if(!var20.equals((Object)Descriptor.STRING) && !var20.equals((Object)Descriptor.OBJECT)) {
                           break;
                        }
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 7:
                        var10000 = true;
                        break label163;
                     }
                  }

                  var10000 = false;
               }

               if(var10000) {
                  var12.add(0, (Element)var14.g().get(0));
                  var1 = var14.l();
                  var4 = 1;
               }
            case 9:
            default:
               break;
            case 10:
               Openflower133 var5;
               Openflower133 var6;
               Descriptor[] var8;
               if((var6 = var5 = (Openflower133)var1).i().equals((Object)var2) && ((var8 = var6.g().h().params).length == 0 || var8.length == 1 && var8[0].equals((Object)Descriptor.STRING))) {
                  if(var5.g().h().params.length == 1) {
                     var12.add(0, (Element)var5.g().g().get(0));
                  }

                  var4 = 2;
               }
            }

            if(var4 == 0) {
               return var0;
            }
         } while(var4 != 2);

         int var13 = 0;

         int var15;
         for(var15 = 0; var15 < var12.size() && var15 < 2; ++var15) {
            if(((Element)var12.get(var15)).getDescriptor().equals((Object)Descriptor.STRING)) {
               var13 |= var15 + 1;
            }
         }

         if(var13 == 0) {
            var12.add(0, new ConstantElement(Descriptor.STRING, ""));
         }

         for(var15 = 0; var15 < var12.size(); ++var15) {
            Element var11;
            Element var16;
            label122: {
               if((var16 = (Element)var12.get(var15)).a == 8) {
                  Openflower131 var7 = (Openflower131)var16;
                  if("valueOf".equals(var7.o()) && "java/lang/String".equals(var7.i()) && (var21 = var7.h()).params.length == 1) {
                     switch((var20 = var21.params[0]).type) {
                     case 6:
                     default:
                        break;
                     case 8:
                        if(!var20.equals((Object)Descriptor.OBJECT)) {
                           break;
                        }
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 7:
                        var11 = (Element)var7.g().get(0);
                        break label122;
                     }
                  }
               }

               var11 = var16;
            }

            var16 = var11;
            boolean var9;
            if(!(var9 = var15 > 1)) {
               var9 = var16.getDescriptor().equals((Object)Descriptor.STRING) || var13 != var15 + 1;
               if(var15 == 0) {
                  var13 &= 2;
               }
            }

            if(var9) {
               var12.set(var15, var16);
            }
         }

         Object var19 = (Element)var12.get(0);

         for(int var18 = 1; var18 < var12.size(); ++var18) {
            ArrayList var10;
            (var10 = new ArrayList()).add(var19);
            var10.add((Element)var12.get(var18));
            var19 = new Openflower129(50, var10);
         }

         return (Element)var19;
      }
   }
}
