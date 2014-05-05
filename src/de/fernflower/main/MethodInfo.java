package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ConstPool;
import de.fernflower.main.ExceptionEntry;
import de.fernflower.main.Openflower0;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower3;
import de.fernflower.main.Openflower4;
import de.fernflower.main.Openflower7;
import de.fernflower.main.classreader.attributes.Attribute;
import de.fernflower.main.classreader.attributes.LocalVariableTable;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.classreader.opcodes.OpcodeFactory;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.ReliableDataInputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public final class MethodInfo implements Openflower0 {

   private int name_index;
   private int desc_index;
   private static final int[] ICONST = new int[]{-1, 0, 1, 2, 3, 4, 5};
   private static final int[] XLOAD_XSTORE = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   private static final int[] f = new int[]{21, 22, 23, 24, 25};
   private static final int[] g = new int[]{54, 55, 56, 57, 58};
   private int access_flags;
   private DualArrayList attributes;
   private int max_locals;
   private String name;
   private String desc;
   private Openflower7 m;
   private boolean codeLoaded;
   private boolean loadCode;
   private ClassInfo owner;
   private boolean q;
   private boolean r;
   private int code_length;
   private int total_code_length;


   public MethodInfo(ReliableDataInputStream var1, boolean var2, ClassInfo var3) throws java.io.IOException {
      this(var1, true, var2, var3);
   }

   private MethodInfo(ReliableDataInputStream var1, boolean var2, boolean var3, ClassInfo var4) throws java.io.IOException {
      this.codeLoaded = false;
      this.code_length = 0;
      this.total_code_length = 0;
      this.loadCode = var3;
      this.q = true;
      this.r = false;
      this.owner = var4;
      this.access_flags = var1.readUnsignedShort();
      this.name_index = var1.readUnsignedShort();
      this.desc_index = var1.readUnsignedShort();
      ConstPool var10 = var4.getConstPool();
      int var5 = var4.this_class;
      String[] var12 = var10.a(3, var5, this.name_index, this.desc_index);
      this.name = var12[0];
      this.desc = var12[1];
      DualArrayList var11 = new DualArrayList();
      int var13 = var1.readUnsignedShort();

      for(var5 = 0; var5 < var13; ++var5) {
         int var6 = var1.readUnsignedShort();
         Openflower196 var10000 = var10.a(var6);
         String var9 = null;
         String var7 = (String)var10000.a;
         if("Code".equals(var7)) {
            if(!this.loadCode) {
               var1.skip(8L);
               var1.skip((long)var1.readInt());
               var1.skip((long)(8 * var1.readUnsignedShort()));
            } else {
               this.codeLoaded = true;
               var1.skip(4L);
               var1.readUnsignedShort();
               this.max_locals = var1.readUnsignedShort();
               this.code_length = var1.readInt();
               var1.skip((long)this.code_length);
               var6 = var1.readUnsignedShort();
               this.total_code_length = this.code_length + (var6 << 3) + 2;
               var1.skip((long)(var6 << 3));
            }

            var6 = var1.readUnsignedShort();

            for(int var14 = 0; var14 < var6; ++var14) {
               int var8 = var1.readUnsignedShort();
               var9 = (String)var10.a(var8).a;
               readAttribute(var1, var10, var11, var8, var9);
            }
         } else {
            readAttribute(var1, var10, var11, var6, var7);
         }
      }

      this.attributes = var11;
   }

   private static void readAttribute(ReliableDataInputStream var0, ConstPool var1, DualArrayList var2, int var3, String var4) throws java.io.IOException {
      Attribute var5;
      if((var5 = Attribute.create(var3, var4)) != null) {
         byte[] var6 = new byte[var0.readInt()];
         var0.a(var6);
         var5.setData(var6);
         var5.read(var1);
         var4 = var5.getName();
         if("LocalVariableTable".equals(var4) && var2.d(var4)) {
            ((LocalVariableTable)var2.b(var4)).a((LocalVariableTable)var5);
         } else {
            var2.a((Object)var5, (Object)var5.getName());
         }
      } else {
         var0.skip((long)var0.readInt());
      }
   }

   public final void initialize() throws java.io.IOException {
      if(this.codeLoaded && this.q && !this.r) {
         byte[] var1 = this.owner.getBytecodeReaderHelper().getMethodCode(this, this.total_code_length);
         this.m = processCode(new ReliableDataInputStream(new ByteArrayInputStream(var1)), this.code_length, this.owner.getConstPool());
         this.r = true;
      }

   }

   public final void deinitialize() {
      if(this.codeLoaded && this.q && this.r) {
         this.m = null;
         this.r = false;
      }

   }

   private static Openflower7 processCode(ReliableDataInputStream var0, int var1, ConstPool var2) throws java.io.IOException {
      DualArrayList var3 = new DualArrayList();

      int var6;
      int var12;
      for(int var4 = 0; var4 < var1; ++var4) {
         final int n2 = var4;
         var6 = var0.readUnsignedByte();
         byte var7 = 1;
         boolean var8;
         if(var8 = var6 == 196) {
            ++var4;
            var6 = var0.readUnsignedByte();
         }

         ArrayList var9 = new ArrayList();
         int var11;
         if(var6 >= 2 && var6 <= 8) {
            var9.add(new Integer(ICONST[var6 - 2]));
            var6 = 16;
         } else if(var6 >= 26 && var6 <= 45) {
            var9.add(new Integer(XLOAD_XSTORE[var6 - 26]));
            var6 = f[(var6 - 26) / 4];
         } else if(var6 >= 59 && var6 <= 78) {
            var9.add(new Integer(XLOAD_XSTORE[var6 - 59]));
            var6 = g[(var6 - 59) / 4];
         } else {
            int var10;
            switch(var6) {
            case 16:
               var9.add(new Integer(var0.readByte()));
               ++var4;
               break;
            case 17:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               if(var6 != 17) {
                  var7 = 2;
               }

               var9.add(new Integer(var0.readShort()));
               var4 += 2;
               break;
            case 18:
            case 188:
               var9.add(new Integer(var0.readUnsignedByte()));
               ++var4;
               break;
            case 19:
            case 20:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 187:
            case 189:
            case 192:
            case 193:
               var9.add(new Integer(var0.readUnsignedShort()));
               var4 += 2;
               if(var6 >= 178 && var6 <= 181) {
                  var7 = 5;
               } else if(var6 >= 182 && var6 <= 184) {
                  var7 = 4;
               }
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
               if(var8) {
                  var9.add(new Integer(var0.readUnsignedShort()));
                  var4 += 2;
               } else {
                  var9.add(new Integer(var0.readUnsignedByte()));
                  ++var4;
               }

               if(var6 != 169) {
                  break;
               }
               break;
            case 132:
               if(var8) {
                  var9.add(new Integer(var0.readUnsignedShort()));
                  var9.add(new Integer(var0.readShort()));
                  var4 += 4;
               } else {
                  var9.add(new Integer(var0.readUnsignedByte()));
                  var9.add(new Integer(var0.readByte()));
                  var4 += 2;
               }
               break;
            case 170:
               var0.skip((long)((4 - (var4 + 1) % 4) % 4));
               var4 += (4 - (var4 + 1) % 4) % 4;
               var9.add(new Integer(var0.readInt()));
               var4 += 4;
               var10 = var0.readInt();
               var9.add(new Integer(var10));
               var4 += 4;
               var11 = var0.readInt();
               var9.add(new Integer(var11));
               var4 += 4;

               for(var12 = 0; var12 < var11 - var10 + 1; ++var12) {
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
               }

               var7 = 3;
               break;
            case 171:
               var0.skip((long)((4 - (var4 + 1) % 4) % 4));
               var4 += (4 - (var4 + 1) % 4) % 4;
               var9.add(new Integer(var0.readInt()));
               var4 += 4;
               var12 = var0.readInt();
               var9.add(new Integer(var12));
               var4 += 4;

               for(var10 = 0; var10 < var12; ++var10) {
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
                  var9.add(new Integer(var0.readInt()));
                  var4 += 4;
               }

               var7 = 3;
               break;
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 191:
               var7 = 6;
               break;
            case 185:
               var9.add(new Integer(var0.readUnsignedShort()));
               var9.add(new Integer(var0.readUnsignedByte()));
               var0.skip(1L);
               var7 = 4;
               var4 += 4;
               break;
            case 197:
               var9.add(new Integer(var0.readUnsignedShort()));
               var9.add(new Integer(var0.readUnsignedByte()));
               var4 += 3;
               break;
            case 200:
            case 201:
               var6 = var6 == 201?168:167;
               var9.add(new Integer(var0.readInt()));
               var7 = 2;
               var4 += 4;
            }
         }

         int[] var16 = new int[var9.size()];

         for(var11 = 0; var11 < var9.size(); ++var11) {
            var16[var11] = ((Integer)var9.get(var11)).intValue();
         }

         Opcode var18 = OpcodeFactory.createOpcode(var6, var8, var7, var16);
         var3.a((Object)var18, (Object)(new Integer(n2)));
      }

      ArrayList var19 = new ArrayList();
      int var5 = var0.readUnsignedShort();

      for(var6 = 0; var6 < var5; ++var6) {
         ExceptionEntry var17;
         (var17 = new ExceptionEntry()).from = var0.readUnsignedShort();
         var17.to = var0.readUnsignedShort();
         var17.handler = var0.readUnsignedShort();
         int var14;
         if((var14 = var0.readUnsignedShort()) != 0) {
            var17.exceptionClass = (String)var2.a(var14).a;
         }

         var19.add(var17);
      }

      Openflower4 var15;
      var12 = (var15 = new Openflower4(var3, new Openflower3(var19))).d() - 1;
      var15.g(var12);

      for(; var12 >= 0; var15.f()) {
         Opcode var13;
         if((var13 = var15.b(var12--)).b != 1) {
            var13.a(var15);
         }
      }

      return var15;
   }

   public final Openflower7 c() {
      return this.m;
   }

   public final String getDesc() {
      return this.desc;
   }

   public final String getName() {
      return this.name;
   }

   public final int getAccess() {
      return this.access_flags;
   }

   public final int getMaxLocals() {
      return this.max_locals;
   }

   public final DualArrayList getAttributes() {
      return this.attributes;
   }

   public final ClassInfo getOwner() {
      return this.owner;
   }
}
