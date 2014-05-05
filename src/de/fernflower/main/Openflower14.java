package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower194;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower197;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.MethodSignatureHolder;

public final class Openflower14 {

   private static final int[][][] a = new int[][][]{new int[2][], null, null, null, null, null, null, null, null, {null, {5}}, {null, {5}}, {null, {3}}, {null, {3}}, {null, {3}}, {null, {2}}, {null, {2}}, {null, {4}}, {null, {4}}, null, null, null, {null, {4}}, {null, {5}}, {null, {3}}, {null, {2}}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, {{8, 4}, {4}}, {{8, 4}, {5}}, {{8, 4}, {3}}, {{8, 4}, {2}}, null, {{8, 4}, {4}}, {{8, 4}, {4}}, {{8, 4}, {4}}, {{4}, null}, {{5}, null}, {{3}, null}, {{2}, null}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, {{8, 4, 4}, null}, {{8, 4, 5}, null}, {{8, 4, 3}, null}, {{8, 4, 2}, null}, {{8, 4, 8}, null}, {{8, 4, 4}, null}, {{8, 4, 4}, null}, {{8, 4, 4}, null}, {{11}, null}, {{11, 11}, null}, null, null, null, null, null, null, null, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{3, 3}, {3}}, {{2, 2}, {2}}, {{4}, {4}}, {{5}, {5}}, {{3}, {3}}, {{2}, {2}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 4}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, {{4, 4}, {4}}, {{5, 5}, {5}}, new int[2][], {{4}, {5}}, {{4}, {3}}, {{4}, {2}}, {{5}, {4}}, {{5}, {3}}, {{5}, {2}}, {{3}, {4}}, {{3}, {5}}, {{3}, {2}}, {{2}, {4}}, {{2}, {5}}, {{2}, {3}}, {{4}, {4}}, {{4}, {4}}, {{4}, {4}}, {{5, 5}, {4}}, {{3, 3}, {4}}, {{3, 3}, {4}}, {{2, 2}, {4}}, {{2, 2}, {4}}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{4, 4}, null}, {{8, 8}, null}, {{8, 8}, null}, new int[2][], {null, {9}}, new int[2][], {{4}, null}, {{4}, null}, {{4}, null}, {{5}, null}, {{3}, null}, {{2}, null}, {{8}, null}, new int[2][], null, null, null, null, null, null, null, null, null, null, null, null, {{8}, {4}}, null, null, null, {{8}, null}, {{8}, null}, null, null, {{8}, null}, {{8}, null}, new int[2][], {null, {9}}};
   private static final int[] b = new int[]{7, 1, 3, 2, 0, 6, 4, 5};


   public static void a(Openflower197 var0, Opcode var1, ConstPool var2) {
      LIFOQueue var3 = var0.c();
      int[][] var4;
      int var13;
      if((var4 = a[var1.opcode]) != null) {
         int[] var6 = var4[0];
         int[] var9 = var4[1];
         int var10;
         if(var6 != null) {
            var10 = 0;

            for(var13 = 0; var13 < var6.length; ++var13) {
               int var5 = var6[var13];
               ++var10;
               if(var5 == 5 || var5 == 2) {
                  ++var10;
               }
            }

            var3.trimMultiple(var10);
         }

         if(var9 != null) {
            for(var10 = 0; var10 < var9.length; ++var10) {
               var13 = var9[var10];
               var3.push(new Descriptor(var13));
               if(var13 == 5 || var13 == 2) {
                  var3.push(new Descriptor(12));
               }
            }

            return;
         }
      } else {
         var3 = var0.c();
         Openflower196 var7;
         Descriptor var8;
         Openflower194 var12;
         int var14;
         switch(var1.opcode) {
         case 1:
            var3.push(new Descriptor(13, 0, (String)null));
            return;
         case 18:
         case 19:
         case 20:
            switch(var2.a(var1.getValue(0)).d) {
            case 3:
               var3.push(new Descriptor(4));
               return;
            case 4:
               var3.push(new Descriptor(3));
               return;
            case 5:
               var3.push(new Descriptor(5));
               var3.push(new Descriptor(12));
               return;
            case 6:
               var3.push(new Descriptor(2));
               var3.push(new Descriptor(12));
               return;
            case 7:
               var3.push(new Descriptor(8, 0, "java/lang/Class"));
            case 8:
               var3.push(new Descriptor(8, 0, "java/lang/String"));
               return;
            default:
               return;
            }
         case 25:
            if((var8 = var0.a(var1.getValue(0))) != null) {
               var3.push(var8);
               return;
            }

            var3.push(new Descriptor(8, 0, (String)null));
            return;
         case 50:
            var8 = (Descriptor)var3.pop(2);
            var3.push(new Descriptor(var8.type, var8.arrayDepth - 1, var8.stringValue));
            return;
         case 58:
            var0.a(var1.getValue(0), (Descriptor)var3.pop());
            return;
         case 89:
         case 90:
         case 91:
            var14 = 88 - var1.opcode;
            var3.putOffset(var14, ((Descriptor)var3.getOffset(-1)).copy());
            return;
         case 92:
         case 93:
         case 94:
            var14 = 90 - var1.opcode;
            var3.putOffset(var14, ((Descriptor)var3.getOffset(-2)).copy());
            var3.putOffset(var14, ((Descriptor)var3.getOffset(-1)).copy());
            return;
         case 95:
            var8 = (Descriptor)var3.pop();
            var3.putOffset(-1, var8);
            return;
         case 180:
            var3.pop();
         case 178:
            var12 = var2.b(var1.getValue(0));
            var8 = new Descriptor(var12.c);
            var3.push(var8);
            if(var8.varSize == 2) {
               var3.push(new Descriptor(12));
               return;
            }
            break;
         case 181:
            var3.pop();
         case 179:
            var12 = var2.b(var1.getValue(0));
            var8 = new Descriptor(var12.c);
            var3.pop(var8.varSize);
            return;
         case 182:
         case 183:
         case 185:
            var3.pop();
         case 184:
            MethodSignatureHolder var11 = MethodSignatureHolder.create(var2.b(var1.getValue(0)).c);

            for(var13 = 0; var13 < var11.params.length; ++var13) {
               var3.pop(var11.params[var13].varSize);
            }

            if(var11.ret.type != 10) {
               var3.push(var11.ret);
               if(var11.ret.varSize == 2) {
                  var3.push(new Descriptor(12));
                  return;
               }
            }
            break;
         case 187:
            var7 = var2.a(var1.getValue(0));
            var3.push(new Descriptor(8, 0, (String)var7.a));
            return;
         case 188:
            var3.pop();
            (var8 = new Descriptor(b[var1.getValue(0) - 4])).arrayDepth = 1;
            var3.push(var8);
            return;
         case 189:
         case 197:
            var13 = var1.opcode == 189?1:var1.getValue(1);
            var3.pop(var13);
            if((var7 = var2.a(var1.getValue(0))).b) {
               Descriptor var10000 = var8 = new Descriptor(8, 0, (String)var7.a);
               var10000.arrayDepth += var13;
               var3.push(var8);
               return;
            }

            var3.push(new Descriptor(8, var13, (String)var7.a));
            break;
         case 191:
            var8 = (Descriptor)var3.pop();
            var3.clear();
            var3.push(var8);
            return;
         case 192:
         case 193:
            var3.pop();
            var7 = var2.a(var1.getValue(0));
            var3.push(new Descriptor(8, 0, (String)var7.a));
            return;
         }
      }

   }
}
