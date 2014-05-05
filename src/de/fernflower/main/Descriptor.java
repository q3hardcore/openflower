package de.fernflower.main;

import de.fernflower.main.util.Util;

public final class Descriptor {

   public static final Descriptor UNKNOWN = new Descriptor(17);
   public static final Descriptor INT = new Descriptor(4);
   public static final Descriptor FLOAT = new Descriptor(3);
   public static final Descriptor LONG = new Descriptor(5);
   public static final Descriptor DOUBLE = new Descriptor(2);
   public static final Descriptor BYTE = new Descriptor(0);
   public static final Descriptor CHAR = new Descriptor(1);
   public static final Descriptor SHORT = new Descriptor(6);
   public static final Descriptor BOOLEAN = new Descriptor(7);
   public static final Descriptor BYTE_NO_SIGN = new Descriptor(15);
   public static final Descriptor SHORT_NO_SIGN = new Descriptor(16);
   public static final Descriptor NULL = new Descriptor(13, 0, (String)null);
   public static final Descriptor STRING;
   public static final Descriptor CLASS;
   public static final Descriptor OBJECT;
   public static final Descriptor VOID;
   public int type;
   public int r;
   public int arrayDepth;
   public String stringValue;
   public int varSize;
   public int intValue;


   static {
      new Descriptor(12);
      STRING = new Descriptor(8, 0, "java/lang/String");
      CLASS = new Descriptor(8, 0, "java/lang/Class");
      OBJECT = new Descriptor(8, 0, "java/lang/Object");
      VOID = new Descriptor(10);
   }

   public Descriptor(int var1) {
      this.type = var1;
      this.arrayDepth = 0;
      String var10001;
      switch(var1) {
      case 0:
         var10001 = "B";
         break;
      case 1:
         var10001 = "C";
         break;
      case 2:
         var10001 = "D";
         break;
      case 3:
         var10001 = "F";
         break;
      case 4:
         var10001 = "I";
         break;
      case 5:
         var10001 = "J";
         break;
      case 6:
         var10001 = "S";
         break;
      case 7:
         var10001 = "Z";
         break;
      case 8:
      case 13:
         var10001 = null;
         break;
      case 9:
         var10001 = "A";
         break;
      case 10:
         var10001 = "V";
         break;
      case 11:
      default:
         throw new RuntimeException("Invalid type");
      case 12:
         var10001 = "G";
         break;
      case 14:
         var10001 = "N";
         break;
      case 15:
         var10001 = "X";
         break;
      case 16:
         var10001 = "Y";
         break;
      case 17:
         var10001 = "U";
      }

      this.stringValue = var10001;
      this.setVarSize(var1);
      this.setFamily();
   }

   public Descriptor(int var1, int var2) {
      this(var1);
      this.arrayDepth = 1;
      this.setFamily();
   }

   public Descriptor(int var1, int var2, String var3) {
      this(var1);
      this.arrayDepth = var2;
      this.stringValue = var3;
      this.setFamily();
   }

   public Descriptor(String var1) {
      this(var1, false);
   }

   public Descriptor(String var1, boolean var2) {
      this.parse(var1, var2);
      this.setVarSize(this.type);
      this.setFamily();
   }

   public final void popArray() {
      if(this.arrayDepth > 0) {
         --this.arrayDepth;
         this.setFamily();
      }

   }

   public final String toString() {
      String var1 = "";

      for(int var2 = 0; var2 < this.arrayDepth; ++var2) {
         var1 = var1 + "[";
      }

      if(this.type == 8) {
         var1 = var1 + "L" + this.stringValue + ";";
      } else {
         var1 = var1 + this.stringValue;
      }

      return var1;
   }

   public final Descriptor copy() {
      Descriptor var1;
      (var1 = new Descriptor(this.type, this.arrayDepth, this.stringValue)).intValue = this.intValue;
      return var1;
   }

   public final boolean equals(Descriptor var1) {
      return this.equals((Object)var1) || this.typeEquals(var1);
   }

   public final boolean typeEquals(Descriptor var1) {
      int var2 = var1.type;
      if(var1.type == 17 && this.type != 17) {
         return true;
      } else if(var1.arrayDepth > 0) {
         return this.equals((Object)OBJECT);
      } else if(this.arrayDepth > 0) {
         return var2 == 13;
      } else {
         boolean var3 = false;
         switch(this.type) {
         case 2:
         case 3:
         case 5:
         case 7:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            break;
         case 4:
            var3 = false | (var2 == 6 || var2 == 1);
         case 6:
            var3 |= var2 == 0;
         case 1:
            var3 |= var2 == 16;
         case 0:
         case 16:
            var3 |= var2 == 15;
         case 15:
            var3 |= var2 == 7;
            break;
         case 8:
            if(var2 == 13) {
               return true;
            }

            if(this.equals((Object)OBJECT)) {
               if(var2 == 8 && !var1.equals((Object)OBJECT)) {
                  return true;
               }

               return false;
            }
            break;
         }

         return var3;
      }
   }

   public static Descriptor a(Descriptor var0, Descriptor var1) {
      if(var0.equals(var1)) {
         return var1;
      } else if(var1.equals(var0)) {
         return var0;
      } else {
         if(var0.r == var1.r) {
            switch(var0.r) {
            case 2:
               if((var0.type != 1 || var1.type != 6) && (var0.type != 6 || var1.type != 1)) {
                  return BYTE_NO_SIGN;
               }

               return SHORT_NO_SIGN;
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 6:
               return NULL;
            }
         }

         return null;
      }
   }

   public static Descriptor b(Descriptor var0, Descriptor var1) {
      if(var0.equals(var1)) {
         return var0;
      } else if(var1.equals(var0)) {
         return var1;
      } else {
         if(var0.r == var1.r) {
            switch(var0.r) {
            case 2:
               if((var0.type != 16 || var1.type != 0) && (var0.type != 0 || var1.type != 16)) {
                  return INT;
               }

               return SHORT;
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 6:
               return OBJECT;
            }
         }

         return null;
      }
   }

   public static Descriptor getFamily(int var0) {
      switch(var0) {
      case 0:
         return UNKNOWN;
      case 1:
         return BOOLEAN;
      case 2:
         return BYTE_NO_SIGN;
      case 3:
         return FLOAT;
      case 4:
         return LONG;
      case 5:
         return DOUBLE;
      case 6:
         return NULL;
      default:
         throw new RuntimeException("invalid type family!");
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Descriptor) {
         Descriptor var2 = (Descriptor)var1;
         return this.type == var2.type && this.arrayDepth == var2.arrayDepth && Util.safeEquals((Object)this.stringValue, (Object)var2.stringValue);
      } else {
         return false;
      }
   }

   private void parse(String var1, boolean var2) {
      int var3 = 0;

      while(var3 < var1.length()) {
         switch(var1.charAt(var3)) {
         case 91:
            ++this.arrayDepth;
            ++var3;
            break;
         case 76:
            if(var1.charAt(var1.length() - 1) == 59) {
               this.type = 8;
               this.stringValue = var1.substring(var3 + 1, var1.length() - 1);
               return;
            }
         default:
            this.stringValue = var1.substring(var3, var1.length());
            byte var10001;
            Descriptor var10000;
            if((!var2 || var3 != 0) && this.stringValue.length() <= 1) {
               var10000 = this;
               switch(this.stringValue.charAt(0)) {
               case 65:
                  var10001 = 9;
                  break;
               case 66:
                  var10001 = 0;
                  break;
               case 67:
                  var10001 = 1;
                  break;
               case 68:
                  var10001 = 2;
                  break;
               case 69:
               case 72:
               case 75:
               case 76:
               case 77:
               case 79:
               case 80:
               case 81:
               case 82:
               case 84:
               case 87:
               default:
                  throw new RuntimeException("Invalid type");
               case 70:
                  var10001 = 3;
                  break;
               case 71:
                  var10001 = 12;
                  break;
               case 73:
                  var10001 = 4;
                  break;
               case 74:
                  var10001 = 5;
                  break;
               case 78:
                  var10001 = 14;
                  break;
               case 83:
                  var10001 = 6;
                  break;
               case 85:
                  var10001 = 17;
                  break;
               case 86:
                  var10001 = 10;
                  break;
               case 88:
                  var10001 = 15;
                  break;
               case 89:
                  var10001 = 16;
                  break;
               case 90:
                  var10001 = 7;
               }
            } else {
               var10000 = this;
               var10001 = 8;
            }

            var10000.type = var10001;
            return;
         }
      }

   }

   private void setVarSize(int var1) {
      byte var10001;
      Descriptor var10000;
      label25: {
         if(this.arrayDepth > 0) {
            var10000 = this;
         } else {
            var10000 = this;
            if(var1 == 2 || var1 == 5) {
               var10001 = 2;
               break label25;
            }

            if(var1 == 10 || var1 == 12) {
               var10001 = 0;
               break label25;
            }
         }

         var10001 = 1;
      }

      var10000.varSize = var10001;
   }

   private void setFamily() {
      if(this.arrayDepth > 0) {
         this.r = 6;
      } else {
         switch(this.type) {
         case 0:
         case 1:
         case 4:
         case 6:
         case 15:
         case 16:
            this.r = 2;
            return;
         case 2:
            this.r = 5;
            return;
         case 3:
            this.r = 3;
            return;
         case 5:
            this.r = 4;
            return;
         case 7:
            this.r = 1;
            return;
         case 8:
         case 13:
            this.r = 6;
            return;
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            this.r = 0;
         }
      }
   }
}
