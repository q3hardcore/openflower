package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower89;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower148 extends Openflower154_SomeSorter {

   private List a;
   private List b;


   private Openflower148() {
      this.a = new ArrayList();
      this.b = new ArrayList();
      this.c = 7;
   }

   private Openflower148(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2, HashSet var3) {
      this();
      this.child = var1;
      this.e.a((Object)this.child, (Object)this.child.id);
      Iterator var4 = var1.c(2).iterator();

      while(var4.hasNext()) {
         Openflower105 var6;
         Openflower154_SomeSorter var5 = (var6 = (Openflower105)var4.next()).c();
         if(var3.contains(var5)) {
            this.e.a((Object)var5, (Object)var5.id);
            this.a.add(var6.d());
            this.b.add(new Openflower135(Configuration.getIDManager().getNext(2), new Descriptor(8, 0, var6.d()), (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR")));
         }
      }

      if(var2 != null) {
         this.i = var2;
      }

   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.u() != 2) {
         return null;
      } else {
         HashSet var1;
         if(!(var1 = Openflower85.a(var0)).isEmpty()) {
            int var2 = 0;
            Openflower154_SomeSorter var3 = null;
            List var4;
            if(!(var4 = var0.c(1073741824)).isEmpty() && ((Openflower105)var4.get(0)).a() == 1) {
               var3 = ((Openflower105)var4.get(0)).c();
               var2 = 2;
            }

            Iterator var5 = var0.c(2).iterator();

            while(var5.hasNext()) {
               Openflower105 var8;
               Openflower154_SomeSorter var6 = (var8 = (Openflower105)var5.next()).c();
               boolean var7 = true;
               if(var8.d() != null && var1.contains(var6) && var6.u() == 2) {
                  if(!(var4 = var6.c(1073741824)).isEmpty() && ((Openflower105)var4.get(0)).a() == 1) {
                     Openflower154_SomeSorter var10 = ((Openflower105)var4.get(0)).c();
                     if(var3 == null) {
                        var3 = var10;
                     } else if(var3 != var10) {
                        var7 = false;
                     }

                     if(var7) {
                        ++var2;
                     }
                  }
               } else {
                  var7 = false;
               }

               if(!var7) {
                  var1.remove(var6);
               }
            }

            if(var2 != 1 && !var1.isEmpty()) {
               ArrayList var9;
               (var9 = new ArrayList()).add(var0);
               var9.addAll(var1);
               Iterator var11 = var9.iterator();

               while(var11.hasNext()) {
                  if(((Openflower154_SomeSorter)var11.next()).x()) {
                     return null;
                  }
               }

               if(Openflower85.a((List)var9)) {
                  return new Openflower148(var0, var3, var1);
               }
            }
         }

         return null;
      }
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(Openflower89.a(this.h, var1));
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      var3.append(var2 + "try {\r\n");
      var3.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
      var3.append(var2 + "}");

      for(int var4 = 1; var4 < this.e.size(); ++var4) {
         var3.append(" catch (" + ((Openflower135)this.b.get(var4 - 1)).toString(var1) + ") {\r\n" + Openflower89.printLoopBody((Openflower154_SomeSorter)this.e.get(var4), var1 + 1, true) + var2 + "}");
      }

      var3.append("\r\n");
      return var3.toString();
   }

   public final Openflower154_SomeSorter a() {
      Openflower148 var1 = new Openflower148();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.a.add(var3);
         var1.b.add(new Openflower135(Configuration.getIDManager().getNext(2), new Descriptor(8, 0, var3), (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR")));
      }

      return var1;
   }

   public final List e() {
      return this.b;
   }
}
