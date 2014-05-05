package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower84;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower130;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class Openflower101 {

   private static final int[] a = new int[]{43, 42, 45, 44, 47, 46, 49, 48};
   private static final HashMap b;


   static {
      (b = new HashMap()).put(Integer.valueOf(42), new Integer[]{Integer.valueOf(44), Integer.valueOf(42), Integer.valueOf(46)});
      b.put(Integer.valueOf(43), new Integer[]{Integer.valueOf(45), Integer.valueOf(43), Integer.valueOf(47)});
      b.put(Integer.valueOf(46), new Integer[]{Integer.valueOf(45), Integer.valueOf(46), null});
      b.put(Integer.valueOf(45), new Integer[]{null, Integer.valueOf(45), Integer.valueOf(46)});
      b.put(Integer.valueOf(44), new Integer[]{null, Integer.valueOf(44), Integer.valueOf(47)});
      b.put(Integer.valueOf(47), new Integer[]{Integer.valueOf(44), Integer.valueOf(47), null});
   }

   public static boolean a(Openflower154_SomeSorter var0) {
      if(var0.E() == null && var0.c == 2) {
         Openflower151 var1;
         Openflower154_SomeSorter var2 = (var1 = (Openflower151)var0).f();
         if(var1.b == Openflower151.a && var2.E() != null && var2.E().isEmpty() && (var2.q().isEmpty() || !((Openflower105)var2.q().get(0)).d)) {
            var1.t().a(var2.id);
            var1.b = 0;
            var1.c(var1.e());
            var1.b((Openflower154_SomeSorter)null);
            if(var1.q().isEmpty() && !var2.q().isEmpty()) {
               Openflower105 var8 = (Openflower105)var2.q().get(0);
               var2.g(var8);
               var8.a(var1);
               if(var8.b != null) {
                  var1.B().c(var8);
               }

               var1.f(var8);
            }

            var1.s().g(var1.j());
            var1.b(var1.k());
            var1.a((Openflower105)null);
            var1.a(!var1.g());
            var1.h().set(0, ((Openflower130)var1.i().copy()).b_());
            return true;
         }
      }

      boolean var6 = true;

      while(var6) {
         var6 = false;
         ArrayList var7 = new ArrayList(var0.E() == null?var0.d():var0.E());

         for(int var3 = 0; var3 < var7.size(); ++var3) {
            Object var4;
            if((var4 = var7.get(var3)) instanceof Openflower154_SomeSorter) {
               if(a((Openflower154_SomeSorter)var4)) {
                  var6 = true;
                  break;
               }
            } else {
               Element var5;
               if(var4 instanceof Element && (var5 = b((Element)var4)) != null) {
                  if(var0.E() == null) {
                     var0.a((Element)var4, var5);
                  } else {
                     var0.E().set(var3, var5);
                  }

                  var6 = true;
                  break;
               }
            }
         }
      }

      return false;
   }

   private static Element b(Element var0) {
      Openflower129 var1;
      Element var4;
      Openflower129 var5;
      ConstantElement var6;
      Element var12;
      if(var0.a == 6) {
         switch((var1 = (Openflower129)var0).i()) {
         case 12:
            if((var12 = a((Element)var1)) != null) {
               return var12;
            }
            break;
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            Element var3 = (Element)var1.j().get(0);
            var4 = (Element)var1.j().get(1);
            if(var3.a == 3) {
               var4 = var3;
               var3 = (Element)var1.j().get(1);
            }

            if(var3.a == 6 && var4.a == 3) {
               var5 = (Openflower129)var3;
               var6 = (ConstantElement)var4;
               int var2;
               if((var2 = var5.i()) == 37 || var2 == 39 || var2 == 38 || var2 == 41 || var2 == 40) {
                  int var7 = -1;
                  Integer[] var8;
                  int var9;
                  Integer var10;
                  if((var8 = (Integer[])b.get(Integer.valueOf(var1.i()))) != null && (var9 = var6.k() + 1) >= 0 && var9 <= 2 && (var10 = var8[var9]) != null) {
                     var7 = var10.intValue();
                  }

                  if(var7 >= 0) {
                     return new Openflower129(var7, var5.j());
                  }
               }
            }
         }
      }

      boolean var11 = true;

      while(var11) {
         var11 = false;
         Iterator var17 = var0.b().iterator();

         while(var17.hasNext()) {
            if((var4 = b(var12 = (Element)var17.next())) != null) {
               var0.a(var12, var4);
               var11 = true;
               break;
            }
         }
      }

      Openflower129 var13;
      Element var22;
      switch(var0.a) {
      case 2:
         Openflower124 var25;
         var22 = (var25 = (Openflower124)var0).h();
         Element var28 = var25.g();
         if(var22.a == 6) {
            var13 = (Openflower129)var22;
            Descriptor var32 = null;
            if(var13.i() >= 14 && var13.i() <= 28) {
               var22 = (Element)var13.j().get(0);
               var32 = var13.h();
               if(var22.a != 6) {
                  return null;
               }

               var13 = (Openflower129)var22;
            }

            List var29 = var13.j();
            Element var15 = null;
            switch(var13.i()) {
            case 0:
            case 4:
            case 5:
            case 6:
               if(var28.equals(var29.get(1))) {
                  var15 = (Element)var29.get(0);
                  break;
               }
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
               if(var28.equals(var29.get(0))) {
                  var15 = (Element)var29.get(1);
               }
            }

            if(var15 != null && (var32 == null || var32.equals((Object)var15.getDescriptor()))) {
               var25.a(var15);
               var25.b(var13.i());
            }
         }
      case 3:
      case 4:
      case 5:
      case 7:
      default:
         break;
      case 6:
         List var19 = (var13 = (Openflower129)var0).j();
         int var21;
         ConstantElement var20;
         int var24;
         switch(var13.i()) {
         case 6:
            for(var21 = 0; var21 < 2; ++var21) {
               Descriptor var26 = (var22 = (Element)var19.get(var21)).getDescriptor();
               if(var22.a == 3 && var26.type != 7) {
                  var20 = (ConstantElement)var22;
                  long var31;
                  if(var26.type == 5) {
                     var31 = ((Long)var20.j()).longValue();
                  } else {
                     var31 = (long)((Integer)var20.j()).intValue();
                  }

                  if(var31 == -1L) {
                     ArrayList var14;
                     (var14 = new ArrayList()).add((Element)var19.get(1 - var21));
                     return new Openflower129(11, var14);
                  }
               }
            }

            return null;
         case 12:
            if(((Element)var19.get(0)).a == 3) {
               int var33 = ((ConstantElement)var19.get(0)).k();
               boolean var23 = false;
               if(var33 == 0) {
                  return new ConstantElement(Descriptor.BOOLEAN, new Integer(1));
               }

               return new ConstantElement(Descriptor.BOOLEAN, new Integer(0));
            }

            return null;
         case 36:
            var4 = (Element)var19.get(1);
            var22 = (Element)var19.get(2);
            if(var4.a == 3 && var22.a == 3) {
               var6 = (ConstantElement)var4;
               var20 = (ConstantElement)var22;
               if(var6.getDescriptor().type == 7 && var20.getDescriptor().type == 7) {
                  if(var6.k() == 0 && var20.k() != 0) {
                     return new Openflower129(12, Arrays.asList(new Element[]{(Element)var19.get(0)}));
                  }

                  if(var6.k() != 0 && var20.k() == 0) {
                     return (Element)var19.get(0);
                  }

                  return null;
               }
            }

            return null;
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
            var24 = Configuration.getIDManager().getNext(2);
            Descriptor var18 = ((Element)var19.get(0)).getDescriptor();
            VarProcessor var27 = (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR");
            Openflower129 var30 = new Openflower129(36, Arrays.asList(new Element[]{new Openflower129(44, Arrays.asList(new Element[]{new Openflower135(var24, var18, var27), ConstantElement.b(var18.type)})), new ConstantElement(Descriptor.INT, new Integer(-1)), new ConstantElement(Descriptor.INT, new Integer(1))}));
            var1 = new Openflower129(42, Arrays.asList(new Element[]{new Openflower124(new Openflower135(var24, var18, var27), new Openflower129(1, Arrays.asList(new Element[]{(Element)var19.get(0), (Element)var19.get(1)}))), ConstantElement.b(var18.type)}));
            var27.a(new IntPair(var24, 0), var18);
            return new Openflower129(36, Arrays.asList(new Element[]{var1, new ConstantElement(Descriptor.INT, new Integer(0)), var30}));
         case 42:
         case 43:
            if(((Element)var19.get(0)).getDescriptor().type == 7 && ((Element)var19.get(1)).getDescriptor().type == 7) {
               for(var21 = 0; var21 < 2; ++var21) {
                  if(((Element)var19.get(var21)).a == 3) {
                     ConstantElement var10000 = (ConstantElement)var19.get(var21);
                     var5 = null;
                     var24 = ((Integer)var10000.j()).intValue();
                     if((var13.i() != 42 || var24 != 1) && (var13.i() != 43 || var24 != 0)) {
                        ArrayList var16;
                        (var16 = new ArrayList()).add((Element)var19.get(1 - var21));
                        return new Openflower129(12, var16);
                     }

                     return (Element)var19.get(1 - var21);
                  }
               }
            }

            return null;
         default:
            return null;
         }
      case 8:
         var12 = Openflower84.a(var0);
         if(!var0.equals(var12)) {
            return var12;
         }
      }

      return null;
   }

   public static Element a(Element var0) {
      Openflower129 var6;
      if(var0.a == 6 && (var6 = (Openflower129)var0).i() == 12 && (var0 = (Element)var6.j().get(0)).a == 6) {
         int var1;
         switch(var1 = (var6 = (Openflower129)var0).i()) {
         case 12:
            Element var7;
            if((var7 = a(var0 = (Element)var6.j().get(0))) == null) {
               return var0;
            }

            return var7;
         case 48:
         case 49:
            List var2 = var6.j();

            for(int var3 = 0; var3 < var2.size(); ++var3) {
               Openflower129 var4;
               Element var5 = a((Element)(var4 = new Openflower129(12, Arrays.asList(new Element[]{(Element)var2.get(var3)}))));
               var2.set(var3, var5 == null?var4:var5);
            }
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            var6.b(a[var1 - 42]);
            return var6;
         }
      }

      return null;
   }
}
