package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower89;
import de.fernflower.main.classreader.opcodes.Openflower10;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower134;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower155_SwitchPrinter extends Openflower154_SomeSorter {

   private List a;
   private List b;
   private List k;
   private Openflower105 l;
   private List m;


   private Openflower155_SwitchPrinter() {
      this.a = new ArrayList();
      this.b = new ArrayList();
      this.k = new ArrayList();
      this.m = new ArrayList();
      this.c = 6;
      this.m.add((Object)null);
   }

   private Openflower155_SwitchPrinter(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      this();
      this.child = var1;
      this.e.a((Object)var1, (Object)var1.id);
      HashSet var3 = new HashSet(var1.getDataAsList(1, 1));
      if(var2 != null) {
         this.i = var2;
         var3.remove(this.i);
      }

      this.l = (Openflower105)var1.c(1073741824).get(0);
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         var1 = (Openflower154_SomeSorter)var4.next();
         this.e.a((Object)var1, (Object)var1.id);
      }

   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.c == 8 && var0.u() == 1) {
         ArrayList var1 = new ArrayList();
         if(Openflower85.a(var0, var1)) {
            Openflower154_SomeSorter var2 = (Openflower154_SomeSorter)var1.remove(0);
            Iterator var3 = var1.iterator();

            while(var3.hasNext()) {
               if(((Openflower154_SomeSorter)var3.next()).x()) {
                  return null;
               }
            }

            if(Openflower85.a((List)var1)) {
               return new Openflower155_SwitchPrinter(var0, var2);
            }
         }
      }

      return null;
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuilder var3;
      (var3 = new StringBuilder()).append(Openflower89.a(this.h, var1));
      var3.append(this.child.getString(var1));
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      var3.append(var2 + ((Element)this.m.get(0)).toString(var1) + " {\r\n");

      for(int var4 = 0; var4 < this.a.size(); ++var4) {
         Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)this.a.get(var4);
         List var6 = (List)this.b.get(var4);
         List var7 = (List)this.k.get(var4);

         for(int var8 = 0; var8 < var6.size(); ++var8) {
            if(var6.get(var8) == this.l) {
               var3.append(var2 + "default:\r\n");
            } else {
               var3.append(var2 + "case " + ((ConstantElement)var7.get(var8)).toString(var1) + ":\r\n");
            }
         }

         var3.append(Openflower89.printLoopBody(var5, var1 + 1, false));
      }

      var3.append(var2 + "}\r\n");
      return var3.toString();
   }

   public final void e_() {
      Openflower134 var1;
      (var1 = (Openflower134)this.child.E().remove(this.child.E().size() - 1)).a(this.k);
      this.m.set(0, var1);
   }

   public final List d() {
      ArrayList var1;
      (var1 = new ArrayList(this.e)).add(1, this.m.get(0));
      return var1;
   }

   public final void a(Element var1, Element var2) {
      if(this.m.get(0) == var1) {
         this.m.set(0, var2);
      }

   }

   public final void a(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         if(this.a.get(var3) == var1) {
            this.a.set(var3, var2);
         }
      }

      super.a(var1, var2);
   }

   public final Openflower154_SomeSorter a() {
      return new Openflower155_SwitchPrinter();
   }

   public final void b() {
      this.child = (Openflower154_SomeSorter)this.e.get(0);
      this.l = (Openflower105)this.child.c(1073741824).get(0);
      this.e();
   }

   public final void e() {
      HashMap var1 = new HashMap();
      List var2 = this.child.c(1073741824);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var1.put((Openflower105)var2.get(var3), Integer.valueOf(var3 == 0?var2.size():var3));
      }

      Openflower146 var10000 = (Openflower146)this.child;
      ArrayList var15 = null;
      int[] var13 = ((Openflower10)var10000.e().c()).f();
      var15 = new ArrayList();
      ArrayList var4 = new ArrayList();

      ArrayList var7;
      Iterator var9;
      for(int var5 = 1; var5 < this.e.size(); ++var5) {
         Openflower154_SomeSorter var6 = (Openflower154_SomeSorter)this.e.get(var5);
         var7 = new ArrayList();
         var9 = var6.d(1).iterator();

         while(var9.hasNext()) {
            Openflower105 var8;
            if((var8 = (Openflower105)var9.next()).b() == this.child) {
               var7.add((Integer)var1.get(var8));
            }
         }

         Collections.sort(var7);
         var15.add(var6);
         var4.add(var7);
      }

      List var17 = this.child.c(12);

      int var24;
      while(!var17.isEmpty()) {
         Openflower105 var19 = (Openflower105)var17.get(0);
         var7 = new ArrayList();

         for(var24 = var17.size() - 1; var24 >= 0; --var24) {
            Openflower105 var25;
            if((var25 = (Openflower105)var17.get(var24)).c() == var19.c() && var25.a() == var19.a()) {
               var7.add((Integer)var1.get(var25));
               var17.remove(var24);
            }
         }

         Collections.sort(var7);
         var15.add((Object)null);
         var4.add(var7);
      }

      int var18;
      for(var18 = 0; var18 < var4.size() - 1; ++var18) {
         for(int var21 = var4.size() - 1; var21 > var18; --var21) {
            if(((Integer)((List)var4.get(var21 - 1)).get(0)).intValue() > ((Integer)((List)var4.get(var21)).get(0)).intValue()) {
               var4.set(var21, (List)var4.set(var21 - 1, (List)var4.get(var21)));
               var15.set(var21, (Openflower154_SomeSorter)var15.set(var21 - 1, (Openflower154_SomeSorter)var15.get(var21)));
            }
         }
      }

      for(var18 = 0; var18 < var15.size(); ++var18) {
         Openflower154_SomeSorter var23;
         if((var23 = (Openflower154_SomeSorter)var15.get(var18)) != null) {
            HashSet var27;
            (var27 = new HashSet(var23.getDataAsList(1, 0))).remove(this.child);
            if(!var27.isEmpty()) {
               Openflower154_SomeSorter var28 = (Openflower154_SomeSorter)var27.iterator().next();

               for(int var11 = var18 + 1; var11 < var15.size(); ++var11) {
                  if(var15.get(var11) == var28) {
                     var15.add(var11 + 1, var23);
                     var4.add(var11 + 1, (List)var4.get(var18));
                     var15.remove(var18);
                     var4.remove(var18);
                     --var18;
                     break;
                  }
               }
            }
         }
      }

      ArrayList var22 = new ArrayList();
      var7 = new ArrayList();
      var9 = var4.iterator();

      while(var9.hasNext()) {
         List var26 = (List)var9.next();
         ArrayList var12 = new ArrayList();
         var4 = new ArrayList();
         var17 = this.child.c(1073741824);
         Iterator var10 = var26.iterator();

         while(var10.hasNext()) {
            Integer var29;
            var24 = (var29 = (Integer)var10.next()).intValue() == var17.size()?0:var29.intValue();
            var12.add((Openflower105)var17.get(var24));
            var4.add(var24 == 0?null:new ConstantElement(var13[var24 - 1], false));
         }

         var22.add(var12);
         var7.add(var4);
      }

      for(var24 = 0; var24 < var15.size(); ++var24) {
         if(var15.get(var24) == null) {
            Openflower146 var30 = new Openflower146(new Openflower11(Configuration.getIDManager().getNext(0)));
            Openflower105 var14 = (Openflower105)((List)var22.get(var24)).get(0);
            var30.f(new Openflower105(var14.a(), var30, var14.c(), var14.b));
            Iterator var20 = ((List)var22.get(var24)).iterator();

            while(var20.hasNext()) {
               Openflower105 var16;
               (var16 = (Openflower105)var20.next()).b().a(1, var16, 1);
               var16.b.C().remove(var16);
               var16.c().e(var16);
               var16.b().a(1, var16, var30);
               var30.d(var16);
            }

            var15.set(var24, var30);
            this.e.a((Object)var30, (Object)var30.id);
            var30.i(this);
         }
      }

      this.a = var15;
      this.b = var22;
      this.k = var7;
   }

   public final List f() {
      return this.m;
   }

   public final List g() {
      return this.b;
   }

   public final List h() {
      return this.a;
   }

   public final Openflower105 i() {
      return this.l;
   }
}
