package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower129 extends Element {

   private static final Descriptor[] c = new Descriptor[]{Descriptor.LONG, Descriptor.FLOAT, Descriptor.DOUBLE, Descriptor.INT, Descriptor.FLOAT, Descriptor.DOUBLE, Descriptor.INT, Descriptor.LONG, Descriptor.DOUBLE, Descriptor.INT, Descriptor.LONG, Descriptor.FLOAT, Descriptor.BYTE, Descriptor.CHAR, Descriptor.SHORT};
   private static final String[] d = new String[]{" + ", " - ", " * ", " / ", " & ", " | ", " ^ ", " % ", " << ", " >> ", " >>> ", " == ", " != ", " < ", " >= ", " > ", " <= ", " && ", " || ", " + "};
   private static final int[] e = new int[]{3, 3, 2, 2, 7, 9, 8, 2, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 0, 1, 1, 1, 1, 12, -1, -1, -1, -1, -1, 6, 6, 5, 5, 5, 5, 10, 11, 3};
   private static final HashSet f = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(48), Integer.valueOf(49), Integer.valueOf(50)}));
   private int g;
   private Descriptor h;
   private List i = new ArrayList();


   public Openflower129(int var1, LIFOQueue var2) {
      this.a = 6;
      this.g = var1;
      if(var1 >= 11 && var1 <= 35 && var1 != 29 && var1 != 30) {
         this.i.add((Element)var2.pop());
      } else if(var1 == 36) {
         throw new RuntimeException("no direct instantiation possible");
      } else {
         Element var3 = (Element)var2.pop();
         this.i.add((Element)var2.pop());
         this.i.add(var3);
      }
   }

   public Openflower129(int var1, List var2) {
      this.a = 6;
      this.g = var1;
      this.i = var2;
   }

   public final Descriptor getDescriptor() {
      Descriptor var1 = null;
      if(this.g > 13 && this.g != 34 && this.g != 35 && this.g != 32 && this.g != 33) {
         if(this.g == 29) {
            var1 = ((Element)this.i.get(1)).getDescriptor();
         } else if(this.g == 36) {
            Element var5 = (Element)this.i.get(1);
            Element var6 = (Element)this.i.get(2);
            Descriptor var4 = Descriptor.b(var5.getDescriptor(), var6.getDescriptor());
            if(var5.a == 3 && var6.a == 3 && var4.type != 7 && Descriptor.INT.equals(var4)) {
               var1 = Descriptor.INT;
            } else {
               var1 = var4;
            }
         } else if(this.g == 50) {
            var1 = Descriptor.STRING;
         } else if(this.g >= 42) {
            var1 = Descriptor.BOOLEAN;
         } else if(this.g == 30) {
            var1 = Descriptor.BOOLEAN;
         } else if(this.g >= 31) {
            var1 = Descriptor.INT;
         } else {
            var1 = c[this.g - 14];
         }
      } else {
         Descriptor var2 = ((Element)this.i.get(0)).getDescriptor();
         Descriptor var3 = null;
         if(this.i.size() > 1) {
            var3 = ((Element)this.i.get(1)).getDescriptor();
         }

         switch(this.g) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 7:
            var1 = a(new Descriptor[]{var2, var3});
            break;
         case 4:
         case 5:
         case 6:
            if(var2.type == 7 & var3.type == 7) {
               var1 = Descriptor.BOOLEAN;
            } else {
               var1 = a(new Descriptor[]{var2, var3});
            }
            break;
         case 8:
         case 9:
         case 10:
         case 11:
         case 13:
            var1 = a(new Descriptor[]{var2});
            break;
         case 12:
            var1 = Descriptor.BOOLEAN;
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         default:
            break;
         case 32:
         case 33:
         case 34:
         case 35:
            var1 = this.h;
         }
      }

      return var1;
   }

   public final int d_() {
      if(this.g >= 32 && this.g <= 35) {
         return 0;
      } else {
         int var1 = 3;

         Element var3;
         for(Iterator var2 = this.i.iterator(); var2.hasNext(); var1 &= var3.d_()) {
            var3 = (Element)var2.next();
         }

         return var1;
      }
   }

   public final Openflower158 e() {
      Openflower158 var1 = new Openflower158();
      Element var2;
      Descriptor var3 = (var2 = (Element)this.i.get(0)).getDescriptor();
      Element var4 = null;
      Descriptor var5 = null;
      if(this.i.size() > 1) {
         var5 = (var4 = (Element)this.i.get(1)).getDescriptor();
      }

      switch(this.g) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 7:
      case 8:
      case 9:
      case 10:
      case 44:
      case 45:
      case 46:
      case 47:
         var1.b(var4, Descriptor.BYTE_NO_SIGN);
      case 4:
      case 5:
      case 6:
         if(var3.type == 7 && ((var3.intValue & 1) != 0 || var5.type != 7)) {
            var1.b(var2, Descriptor.BYTE_NO_SIGN);
         }

         if(var5.type == 7 && ((var5.intValue & 1) != 0 || var3.type != 7)) {
            var1.b(var4, Descriptor.BYTE_NO_SIGN);
         }
         break;
      case 11:
      case 13:
         var1.b(var2, Descriptor.BYTE_NO_SIGN);
      case 12:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      default:
         break;
      case 14:
      case 15:
      case 16:
      case 26:
      case 27:
      case 28:
         var1.b(var2, Descriptor.BYTE_NO_SIGN);
         var1.a(var2, Descriptor.INT);
         break;
      case 32:
      case 33:
      case 34:
      case 35:
         var1.b(var2, this.h);
         var1.a(var2, this.h);
         break;
      case 36:
         if((var3 = this.getDescriptor()) == null) {
            var3 = this.getDescriptor();
         }

         var1.b(var2, Descriptor.BOOLEAN);
         var1.b(var4, Descriptor.getFamily(var3.r));
         var1.b((Element)this.i.get(2), Descriptor.getFamily(var3.r));
         break;
      case 42:
      case 43:
         if(var3.type == 7 && (var5.typeEquals(var3) || var2.a == 3 && !((ConstantElement)var2).g() && (var4.a != 3 || !((ConstantElement)var4).g()))) {
            var1.b(var2, Descriptor.BYTE_NO_SIGN);
         }

         if(var5.type == 7 && (var3.typeEquals(var5) || var4.a == 3 && !((ConstantElement)var4).g() && (var2.a != 3 || !((ConstantElement)var2).g()))) {
            var1.b(var4, Descriptor.BYTE_NO_SIGN);
         }
      }

      return var1;
   }

   public final List b() {
      ArrayList var1;
      (var1 = new ArrayList()).addAll(this.i);
      return var1;
   }

   public final Element copy() {
      ArrayList var1 = new ArrayList();
      Iterator var3 = this.i.iterator();

      while(var3.hasNext()) {
         Element var2 = (Element)var3.next();
         var1.add(var2.copy());
      }

      Openflower129 var4;
      (var4 = new Openflower129(this.g, var1)).h = this.h;
      return var4;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower129) {
         Openflower129 var2 = (Openflower129)var1;
         return this.g == var2.g && Util.safeEquals(this.i, var2.i);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      for(int var3 = 0; var3 < this.i.size(); ++var3) {
         if(var1 == this.i.get(var3)) {
            this.i.set(var3, var2);
         }
      }

   }

   public final String toString(int var1) {
      if(this.g <= 10) {
         return this.a((Element)this.i.get(0), false, var1) + d[this.g] + this.a((Element)this.i.get(1), true, var1);
      } else if(this.g >= 42) {
         return this.a((Element)this.i.get(0), false, var1) + d[this.g - 42 + 11] + this.a((Element)this.i.get(1), true, var1);
      } else {
         switch(this.g) {
         case 11:
            return "~" + this.a((Element)this.i.get(0), true, var1);
         case 12:
            return "!" + this.a((Element)this.i.get(0), true, var1);
         case 13:
            return "-" + this.a((Element)this.i.get(0), true, var1);
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         default:
            if(this.g <= 28) {
               return "(" + Openflower89.a(c[this.g - 14]) + ")" + this.a((Element)this.i.get(0), true, var1);
            }

            throw new RuntimeException("invalid function");
         case 29:
            return "(" + ((Element)this.i.get(1)).toString(var1) + ")" + this.a((Element)this.i.get(0), true, var1);
         case 30:
            return this.a((Element)this.i.get(0), true, var1) + " instanceof " + this.a((Element)this.i.get(1), true, var1);
         case 31:
            Element var2 = (Element)this.i.get(0);
            String var3 = this.a(var2, false, var1);
            if(var2.getDescriptor().arrayDepth == 0) {
               Descriptor var4;
               (var4 = Descriptor.OBJECT.copy()).arrayDepth = 1;
               var3 = "((" + Openflower89.b(var4) + ")" + var3 + ")";
            }

            return var3 + ".length";
         case 32:
            return this.a((Element)this.i.get(0), true, var1) + "--";
         case 33:
            return "--" + this.a((Element)this.i.get(0), true, var1);
         case 34:
            return this.a((Element)this.i.get(0), true, var1) + "++";
         case 35:
            return "++" + this.a((Element)this.i.get(0), true, var1);
         case 36:
            return this.a((Element)this.i.get(0), true, var1) + "?" + this.a((Element)this.i.get(1), true, var1) + ":" + this.a((Element)this.i.get(2), true, var1);
         }
      }
   }

   public final int c_() {
      int var1 = this.g;
      return e[var1];
   }

   public static int g() {
      return e[29];
   }

   public final Descriptor h() {
      return c[this.g - 14];
   }

   private String a(Element var1, boolean var2, int var3) {
      int var4 = this.c_();
      int var5;
      boolean var6;
      if(!(var6 = (var5 = var1.c_()) > var4) && var2 && (var6 = var5 == var4) && var1.a == 6 && ((Openflower129)var1).g == this.g) {
         var6 = !f.contains(Integer.valueOf(this.g));
      }

      String var7 = var1.toString(var3);
      if(var6) {
         var7 = "(" + var7 + ")";
      }

      return var7;
   }

   private static Descriptor a(Descriptor[] var0) {
      int[] var1 = new int[]{2, 3, 5};
      Descriptor[] var2 = new Descriptor[]{Descriptor.DOUBLE, Descriptor.FLOAT, Descriptor.LONG};

      for(int var3 = 0; var3 < var1.length; ++var3) {
         for(int var4 = 0; var4 < var0.length; ++var4) {
            if(var0[var4].type == var1[var3]) {
               return var2[var3];
            }
         }
      }

      return Descriptor.INT;
   }

   public final int i() {
      return this.g;
   }

   public final void b(int var1) {
      this.g = var1;
   }

   public final List j() {
      return this.i;
   }

   public final void a(Descriptor var1) {
      this.h = var1;
   }
}
