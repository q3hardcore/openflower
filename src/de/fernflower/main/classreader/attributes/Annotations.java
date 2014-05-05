package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower0;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower198;
import de.fernflower.main.classreader.attributes.Attribute;
import de.fernflower.main.codeprinter.elements.Annotation;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower133;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Annotations extends Attribute {

   private List attributes;


   public final void read(ConstPool var1) {
      super.read(var1);
      this.attributes = new ArrayList();
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.data, 2, this.data.length));
      int var3 = (this.data[0] & 255) << 8 | this.data[1] & 255;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.attributes.add(a(var2, var1));
      }

   }

   public static Annotation a(DataInputStream var0, ConstPool var1) {
      try {
         String var2 = (String)var1.a(var0.readUnsignedShort()).a;
         Descriptor var8 = new Descriptor(var2);
         int var3 = var0.readUnsignedShort();
         ArrayList var4 = new ArrayList();
         ArrayList var5 = new ArrayList();

         for(int var6 = 0; var6 < var3; ++var6) {
            var4.add((String)var1.a(var0.readUnsignedShort()).a);
            var5.add(b(var0, var1));
         }

         return new Annotation(var8.stringValue, var4, var5);
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }

   public static Element b(DataInputStream var0, ConstPool var1) {
      try {
         int var2;
         ArrayList var3;
         Descriptor var7;
         String var11;
         Openflower196 var10000;
         switch(var2 = var0.readUnsignedByte()) {
         case 64:
            return a(var0, var1);
         case 91:
            var2 = var0.readUnsignedShort();
            var3 = new ArrayList();

            for(int var4 = 0; var4 < var2; ++var4) {
               var3.add(b(var0, var1));
            }

            Descriptor var12;
            if(var3.isEmpty()) {
               var12 = new Descriptor(8, 1, "java/lang/Object");
            } else {
               var7 = ((Element)var3.get(0)).getDescriptor();
               var12 = new Descriptor(var7.type, 1, var7.stringValue);
            }

            Openflower133 var9;
            (var9 = new Openflower133(var12, new ArrayList())).k();
            var9.a((List)var3);
            return var9;
         case 99:
            var10000 = var1.a(var0.readUnsignedShort());
            var3 = null;
            if((var7 = Openflower198.a((String)var10000.a).e).arrayDepth <= 0) {
               var11 = null;
               switch(var7.type) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 10:
                  var11 = Openflower0.e[var7.type];
                  break;
               case 8:
                  var11 = var7.stringValue;
                  break;
               case 9:
               default:
                  throw new RuntimeException("invalid class type!");
               }

               if(var11 != null) {
                  return new ConstantElement(Descriptor.CLASS, var11);
               }
            }

            throw new RuntimeException("unknown annotation type!");
         case 101:
            var10000 = var1.a(var0.readUnsignedShort());
            var3 = null;
            var11 = (String)var10000.a;
            String var6 = (String)var1.a(var0.readUnsignedShort()).a;
            Openflower198 var8 = Openflower198.a(var11);
            return new Openflower128(var6, var8.e.stringValue, true, (Element)null, var8);
         default:
            Openflower196 var10 = var1.a(var0.readUnsignedShort());
            switch(var2) {
            case 66:
               return new ConstantElement(Descriptor.BYTE, var10.a);
            case 67:
               return new ConstantElement(Descriptor.CHAR, var10.a);
            case 68:
               return new ConstantElement(Descriptor.DOUBLE, var10.a);
            case 70:
               return new ConstantElement(Descriptor.FLOAT, var10.a);
            case 73:
               return new ConstantElement(Descriptor.INT, var10.a);
            case 74:
               return new ConstantElement(Descriptor.LONG, var10.a);
            case 83:
               return new ConstantElement(Descriptor.SHORT, var10.a);
            case 90:
               return new ConstantElement(Descriptor.BOOLEAN, var10.a);
            case 115:
               return new ConstantElement(Descriptor.STRING, var10.a);
            default:
               throw new RuntimeException("invalid element type!");
            }
         }
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   public final List getAttributes() {
      return this.attributes;
   }
}
