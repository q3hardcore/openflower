package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower152;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower129;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Openflower99 {

   private boolean a;


   public final boolean a(Openflower152 var1) {
      Openflower143 var10000 = new Openflower143();
      LinkedList var2 = null;
      Openflower137 var5 = var10000.a(var1);
      (var2 = new LinkedList()).add(var5.b);
      HashSet var6 = new HashSet();
      boolean var3 = false;

      while(!var2.isEmpty()) {
         Openflower138 var4 = (Openflower138)var2.removeFirst();
         if(!var6.contains(var4)) {
            var6.add(var4);
            var3 |= this.a(var4.e);
            var2.addAll(var4.f);
         }
      }

      return var3;
   }

   private boolean a(List var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         Element var4 = (Element)var1.get(var3);
         this.a = false;
         if((var4 = this.a(var4)) != null) {
            var1.set(var3, var4);
            var2 = true;
            --var3;
         }

         var2 |= this.a;
      }

      return var2;
   }

   private Element a(Element var1) {
      boolean var2 = true;

      while(var2) {
         var2 = false;
         Iterator var4 = var1.b().iterator();

         while(var4.hasNext()) {
            Element var3 = (Element)var4.next();
            Element var5;
            if((var5 = this.a(var3)) != null) {
               var1.a(var3, var5);
               var2 = true;
               this.a = true;
               break;
            }
         }
      }

      Openflower124 var8;
      if(var1.a == 2 && (var8 = (Openflower124)var1).h().a == 6) {
         Openflower129 var10 = (Openflower129)var8.h();
         Descriptor var11 = null;
         if(var10.i() >= 14 && var10.i() <= 28) {
            var11 = var10.h();
            if(((Element)var10.j().get(0)).a != 6) {
               return null;
            }

            var10 = (Openflower129)var10.j().get(0);
         }

         if(var10.i() == 0 || var10.i() == 1) {
            var1 = (Element)var10.j().get(0);
            Element var7;
            if((var7 = (Element)var10.j().get(1)).a != 3 && var1.a == 3 && var10.i() == 0) {
               var1 = var7;
               var7 = (Element)var10.j().get(0);
            }

            if(var7.a == 3 && ((ConstantElement)var7).h()) {
               var7 = var8.g();
               Descriptor var9 = var1.getDescriptor();
               if(var7.equals(var1) && (var11 == null || var11.equals((Object)var9))) {
                  Openflower129 var6;
                  (var6 = new Openflower129(var10.i() == 0?35:33, Arrays.asList(new Element[]{var1}))).a(var9);
                  this.a = true;
                  return var6;
               }
            }
         }
      }

      return null;
   }
}
