package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower157;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower162;
import de.fernflower.main.Openflower163;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.MethodSignatureHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Openflower164 {

   private HashMap a = new HashMap();
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();


   public final void a(Openflower152 var1, Openflower137 var2) {
      Openflower164 var8 = this;
      MethodInfo var10000 = (MethodInfo)Configuration.getObject("CURRENT_METHOD");
      List var4 = null;
      boolean var10 = (var10000.getAccess() & 8) == 0;
      MethodSignatureHolder var5 = (MethodSignatureHolder)Configuration.getObject("CURRENT_METHOD_DESCRIPTOR");
      if(var10) {
         Descriptor var6 = new Descriptor(8, 0, ((ClassInfo)Configuration.getObject("CURRENT_CLASS")).name);
         this.a.put(new IntPair(0, 1), var6);
         this.b.put(new IntPair(0, 1), var6);
      }

      int var13 = 0;

      for(int var7 = 0; var7 < var5.params.length; ++var7) {
         var8.a.put(new IntPair(var13 + (var10?1:0), 1), var5.params[var7]);
         var8.b.put(new IntPair(var13 + (var10?1:0), 1), var5.params[var7]);
         var13 += var5.params[var7].varSize;
      }

      LinkedList var14;
      (var14 = new LinkedList()).add(var1);

      Openflower154_SomeSorter var9;
      for(; !var14.isEmpty(); var14.addAll(var9.t())) {
         var9 = (Openflower154_SomeSorter)var14.removeFirst();
         var4 = null;
         if(var9.c == 12) {
            var4 = ((Openflower147)var9).g();
         } else if(var9.c == 7) {
            var4 = ((Openflower148)var9).e();
         }

         if(var4 != null) {
            Iterator var11 = var4.iterator();

            while(var11.hasNext()) {
               Openflower135 var12 = (Openflower135)var11.next();
               var8.a.put(new IntPair(var12.getIndex(), 1), var12.createDesriptor());
               var8.b.put(new IntPair(var12.getIndex(), 1), var12.createDesriptor());
            }
         }
      }

      var2.a(new Openflower162());

      while(!var2.a(new Openflower163(this))) {
         ;
      }

   }

   private boolean a(Element var1) {
      Iterator var3 = var1.b().iterator();

      while(var3.hasNext()) {
         Element var2 = (Element)var3.next();
         if(!this.a(var2)) {
            return false;
         }
      }

      ConstantElement var6;
      if(var1.a == 3 && (var6 = (ConstantElement)var1).i().r <= 2) {
         IntPair var9 = new IntPair(var6.b, -1);
         if(!this.a.containsKey(var9)) {
            this.a.put(var9, var6.i());
         }
      }

      Openflower158 var7;
      Iterator var4 = (var7 = var1.e()).a().iterator();

      while(var4.hasNext()) {
         Openflower157 var10;
         if((var10 = (Openflower157)var4.next()).b.r != 6) {
            this.a(var10.a, var10.b, 1);
         }
      }

      boolean var11 = true;

      Openflower157 var5;
      for(Iterator var8 = var7.b().iterator(); var8.hasNext(); var11 &= this.a(var5.a, var5.b, 0)) {
         var5 = (Openflower157)var8.next();
      }

      return var11;
   }

   private boolean a(Element var1, Descriptor var2, int var3) {
      boolean var4 = true;
      switch(var1.a) {
      case 2:
         return this.a(((Openflower124)var1).h(), var2, var3);
      case 3:
         ConstantElement var10000 = (ConstantElement)var1;
         Descriptor var5 = null;
         var5 = var10000.i();
         if(var2.r > 2 || var5.r > 2) {
            return true;
         }

         if(var2.r == 2 && (var5 = (new ConstantElement(((Integer)((ConstantElement)var1).j()).intValue(), false)).i()).typeEquals(var2)) {
            var2 = var5;
         }
      case 12:
         IntPair var7 = null;
         if(var1.a == 3) {
            var7 = new IntPair(((ConstantElement)var1).b, -1);
         } else if(var1.a == 12) {
            var7 = new IntPair((Openflower135)var1);
         }

         Descriptor var8;
         if(var3 == 0) {
            if((var8 = (Descriptor)this.a.get(var7)) != null && var2.r <= var8.r) {
               if(var2.r < var8.r) {
                  return true;
               }

               var2 = Descriptor.b(var8, var2);
            }

            this.a.put(var7, var2);
            if(var1.a == 3) {
               ((ConstantElement)var1).a(var2);
            }

            if(var8 != null && (var2.r > var8.r || var2.typeEquals(var8))) {
               return false;
            }
         } else {
            if((var8 = (Descriptor)this.b.get(var7)) != null && var2.r >= var8.r) {
               if(var2.r > var8.r) {
                  return true;
               }

               var2 = Descriptor.a(var8, var2);
            }

            this.b.put(var7, var2);
         }
         break;
      case 6:
         Openflower129 var6;
         switch((var6 = (Openflower129)var1).i()) {
         case 4:
         case 5:
         case 6:
            var4 = true & this.a((Element)var6.j().get(0), var2, var3) & this.a((Element)var6.j().get(1), var2, var3);
            return var4;
         case 36:
            var4 = true & this.a((Element)var6.j().get(1), var2, var3) & this.a((Element)var6.j().get(2), var2, var3);
            return var4;
         default:
            return var4;
         }
      }

      return var4;
   }

   public final HashMap a() {
      return this.b;
   }

   public final HashMap b() {
      return this.a;
   }

   public final HashMap c() {
      return this.c;
   }

   public final void a(IntPair var1, Descriptor var2) {
      this.a.put(var1, var2);
   }

   public final Descriptor a(IntPair var1) {
      return (Descriptor)this.a.get(var1);
   }

   // $FF: synthetic method
   static boolean a(Openflower164 var0, Element var1) {
      return var0.a(var1);
   }
}
