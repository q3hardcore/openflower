package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower198;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ConstantElement extends Element {

   private static final HashMap c;
   private Descriptor desc;
   private Object value;
   private boolean isBoolean;


   static {
      (c = new HashMap()).put(new Integer(8), "\\b");
      c.put(new Integer(9), "\\t");
      c.put(new Integer(10), "\\n");
      c.put(new Integer(12), "\\f");
      c.put(new Integer(13), "\\r");
      c.put(new Integer(34), "\\\"");
      c.put(new Integer(39), "\\\'");
      c.put(new Integer(92), "\\\\");
   }

   public ConstantElement(int var1, boolean var2) {
      this.a = 3;
      this.isBoolean = var2;
      if(var2) {
         this.desc = Descriptor.BOOLEAN;
         if(var1 != 0 && var1 != 1) {
            this.desc = this.desc.copy();
            this.desc.intValue |= 1;
         }
      } else if(var1 >= 0 && var1 <= 127) {
         this.desc = Descriptor.BYTE_NO_SIGN;
      } else if(-128 <= var1 && var1 <= 127) {
         this.desc = Descriptor.BYTE;
      } else if(var1 >= 0 && var1 <= 32767) {
         this.desc = Descriptor.SHORT_NO_SIGN;
      } else if(-32768 <= var1 && var1 <= 32767) {
         this.desc = Descriptor.SHORT;
      } else if(var1 >= 0 && var1 <= '\uffff') {
         this.desc = Descriptor.CHAR;
      } else {
         this.desc = Descriptor.INT;
      }

      this.value = new Integer(var1);
   }

   public ConstantElement(Descriptor var1, Object var2) {
      this.a = 3;
      this.desc = var1;
      this.value = var2;
   }

   public final Element copy() {
      return new ConstantElement(this.desc, this.value);
   }

   public final Descriptor getDescriptor() {
      return this.desc;
   }

   public final int d_() {
      return 3;
   }

   public final List b() {
      return new ArrayList();
   }

   public final String toString(int var1) {
      if(this.desc.type != 13 && this.value == null) {
         return Openflower89.b(this.desc);
      } else {
         String var6;
         switch(this.desc.type) {
         case 0:
         case 4:
         case 6:
         case 15:
         case 16:
            if((var1 = ((Integer)this.value).intValue()) == Integer.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var1 != Integer.MIN_VALUE) {
                  return this.value.toString();
               }

               var6 = "MIN_VALUE";
            }

            return (new Openflower128(var6, "java/lang/Integer", true, (Element)null, Openflower198.a)).toString(0);
         case 1:
            Integer var10 = (Integer)this.value;
            String var9;
            if((var9 = (String)c.get(var10)) == null) {
               if(var10.intValue() >= 32 && var10.intValue() < 127) {
                  var9 = String.valueOf((char)var10.intValue());
               } else {
                  var9 = Util.toUnicodeLiteral(var10.intValue());
               }
            }

            return "\'" + var9 + "\'";
         case 2:
            double var4;
            if(Double.isNaN(var4 = ((Double)this.value).doubleValue())) {
               var6 = "NaN";
            } else if(var4 == Double.POSITIVE_INFINITY) {
               var6 = "POSITIVE_INFINITY";
            } else if(var4 == Double.NEGATIVE_INFINITY) {
               var6 = "NEGATIVE_INFINITY";
            } else if(var4 == Double.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var4 != Double.MIN_VALUE) {
                  return this.value.toString() + "D";
               }

               var6 = "MIN_VALUE";
            }

            return (new Openflower128(var6, "java/lang/Double", true, (Element)null, Openflower198.d)).toString(0);
         case 3:
            float var8;
            if(Float.isNaN(var8 = ((Float)this.value).floatValue())) {
               var6 = "NaN";
            } else if(var8 == Float.POSITIVE_INFINITY) {
               var6 = "POSITIVE_INFINITY";
            } else if(var8 == Float.NEGATIVE_INFINITY) {
               var6 = "NEGATIVE_INFINITY";
            } else if(var8 == Float.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var8 != Float.MIN_VALUE) {
                  return this.value.toString() + "F";
               }

               var6 = "MIN_VALUE";
            }

            return (new Openflower128(var6, "java/lang/Float", true, (Element)null, Openflower198.c)).toString(0);
         case 5:
            long var2;
            if((var2 = ((Long)this.value).longValue()) == Long.MAX_VALUE) {
               var6 = "MAX_VALUE";
            } else {
               if(var2 != Long.MIN_VALUE) {
                  return this.value.toString() + "L";
               }

               var6 = "MIN_VALUE";
            }

            return (new Openflower128(var6, "java/lang/Long", true, (Element)null, Openflower198.b)).toString(0);
         case 7:
            return (new Boolean(((Integer)this.value).intValue() != 0)).toString();
         case 8:
            if(this.desc.equals((Object)Descriptor.STRING)) {
               return "\"" + a(this.value.toString()) + "\"";
            } else if(this.desc.equals((Object)Descriptor.CLASS)) {
               Descriptor var7;
               if((var6 = this.value.toString()).startsWith("[")) {
                  var7 = new Descriptor(var6, false);
               } else {
                  var7 = new Descriptor(var6, true);
               }

               return Openflower89.b(var7) + ".class";
            }
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            throw new RuntimeException("invalid constant type");
         case 13:
            return "null";
         }
      }
   }

   private static String a(String var0) {
      char[] var5 = var0.toCharArray();
      StringBuilder var1 = new StringBuilder(var5.length);
      char[] var4 = var5;
      int var3 = var5.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         char var6;
         switch(var6 = var4[var2]) {
         case 8:
            var1.append("\\b");
            break;
         case 9:
            var1.append("\\t");
            break;
         case 10:
            var1.append("\\n");
            break;
         case 12:
            var1.append("\\f");
            break;
         case 13:
            var1.append("\\r");
            break;
         case 34:
            var1.append("\\\"");
            break;
         case 39:
            var1.append("\\\'");
            break;
         case 92:
            var1.append("\\\\");
            break;
         default:
            if(Configuration.getBoolean("asc") && (var6 < 32 || var6 >= 127)) {
               var1.append(Util.toUnicodeLiteral(var6));
            } else {
               var1.append(var6);
            }
         }
      }

      return var1.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof ConstantElement) {
         ConstantElement var2 = (ConstantElement)var1;
         return Util.safeEquals((Object)this.desc, (Object)var2.desc) && Util.safeEquals(this.value, var2.value);
      } else {
         return false;
      }
   }

   public final boolean g() {
      switch(this.desc.type) {
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 15:
      case 16:
         Integer var1;
         return (var1 = (Integer)this.value).intValue() == 0 || Configuration.getBoolean("bto") && var1.intValue() == 1;
      case 2:
      case 3:
      case 5:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         return false;
      }
   }

   public final boolean h() {
      switch(this.desc.type) {
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 15:
      case 16:
         if(((Integer)this.value).intValue() == 1) {
            return true;
         }

         return false;
      case 2:
         if(((Double)this.value).intValue() == 1) {
            return true;
         }

         return false;
      case 3:
         if(((Float)this.value).intValue() == 1) {
            return true;
         }

         return false;
      case 5:
         if(((Long)this.value).intValue() == 1) {
            return true;
         }

         return false;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         return false;
      }
   }

   public static ConstantElement b(int var0) {
      switch(var0) {
      case 2:
         return new ConstantElement(Descriptor.DOUBLE, new Double(0.0D));
      case 3:
         return new ConstantElement(Descriptor.FLOAT, new Float(0.0F));
      case 4:
         return new ConstantElement(Descriptor.INT, new Integer(0));
      case 5:
         return new ConstantElement(Descriptor.LONG, new Long(0L));
      default:
         throw new RuntimeException("Invalid argument!");
      }
   }

   public final Descriptor i() {
      return this.desc;
   }

   public final void a(Descriptor var1) {
      this.desc = var1;
   }

   public final Object j() {
      return this.value;
   }

   public final int k() {
      return ((Integer)this.value).intValue();
   }

   public final boolean l() {
      return this.isBoolean;
   }
}
