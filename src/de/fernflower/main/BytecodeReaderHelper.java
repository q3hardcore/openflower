package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower206;
import de.fernflower.main.extern.IBytecodeProvider;
import de.fernflower.main.util.ReliableDataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public final class BytecodeReaderHelper {

   private HashMap a = new HashMap();
   private IBytecodeProvider provider;


   public BytecodeReaderHelper(IBytecodeProvider var1) {
      this.provider = var1;
   }

   public final void a(String var1, Openflower206 var2) {
      this.a.put(var1, var2);
   }

   public final void a(String var1) {
      this.a.remove(var1);
   }

   public final Openflower206 b(String var1) {
      return (Openflower206)this.a.get(var1);
   }

   public final ConstPool getConstPool(String var1) {
      try {
         ReliableDataInputStream var3;
         if((var3 = this.getBytecodeStream(var1)) == null) {
            return null;
         } else {
            var3.skip(8L);
            return new ConstPool(var3);
         }
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   public final byte[] getMethodCode(MethodInfo var1, int var2) {
      try {
         ReliableDataInputStream var10;
         if((var10 = this.getBytecodeStream(var1.getOwner().name)) == null) {
            return null;
         } else {
            ConstPool var3 = null;
            var10.skip(8L);
            int var5;
            int var6;
            if((var3 = var1.getOwner().getConstPool()) == null) {
               var3 = new ConstPool(var10);
            } else {
               ReliableDataInputStream var4 = var10;
               var5 = var10.readUnsignedShort();

               for(var6 = 1; var6 < var5; ++var6) {
                  switch(var4.readUnsignedByte()) {
                  case 1:
                     var4.readUTF();
                  case 2:
                  default:
                     break;
                  case 3:
                  case 4:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                     var4.skip(4L);
                     break;
                  case 5:
                  case 6:
                     var4.skip(8L);
                     ++var6;
                     break;
                  case 7:
                  case 8:
                     var4.skip(2L);
                  }
               }
            }

            var10.skip(2L);
            int var12 = var10.readUnsignedShort();
            var10.skip(2L);
            var10.skip((long)(var10.readUnsignedShort() << 1));
            var5 = var10.readUnsignedShort();

            for(var6 = 0; var6 < var5; ++var6) {
               var10.skip(6L);
               skipAttributeArray(var10);
            }

            var5 = var10.readUnsignedShort();

            for(var6 = 0; var6 < var5; ++var6) {
               var10.skip(2L);
               int var7 = var10.readUnsignedShort();
               int var8 = var10.readUnsignedShort();
               String[] var15;
               String var17 = (var15 = var3.a(3, var12, var7, var8))[0];
               if(var1.getName().equals(var17)) {
                  String var16 = var15[1];
                  if(var1.getDesc().equals(var16)) {
                     int var11 = var10.readUnsignedShort();

                     for(var12 = 0; var12 < var11; ++var12) {
                        var5 = var10.readUnsignedShort();
                        Openflower196 var10000 = var3.a(var5);
                        String var14 = null;
                        var14 = (String)var10000.a;
                        if("Code".equals(var14)) {
                           var10.skip(12L);
                           byte[] var13 = new byte[var2];
                           var10.a(var13);
                           return var13;
                        }

                        var10.skip((long)var10.readInt());
                     }

                     return null;
                  }
               }

               skipAttributeArray(var10);
            }

            return null;
         }
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }
   }

   public final ReliableDataInputStream getStream(String var1, String var2) {
      InputStream var3;
      return (var3 = this.provider.getBytecodeStream(var1, var2)) == null?null:new ReliableDataInputStream(var3);
   }

   public final ReliableDataInputStream getBytecodeStream(String var1) {
      Openflower206 var2;
      return (var2 = (Openflower206)this.a.get(var1)) == null?null:this.getStream(var2.a, var2.b);
   }

   private static void skipAttributeArray(ReliableDataInputStream var0) throws IOException {
      int var1 = var0.readUnsignedShort();

      for(int var2 = 0; var2 < var1; ++var2) {
         var0.skip(2L);
         var0.skip((long)var0.readInt());
      }

   }
}
