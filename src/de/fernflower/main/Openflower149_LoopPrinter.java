package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower149_LoopPrinter extends Openflower154_SomeSorter {

   private int a;
   private List b;
   private List k;
   private List l;


   private Openflower149_LoopPrinter() {
      this.b = new ArrayList();
      this.k = new ArrayList();
      this.l = new ArrayList();
      this.c = 5;
      this.a = 0;
      this.b.add((Object)null);
      this.k.add((Object)null);
      this.l.add((Object)null);
   }

   private Openflower149_LoopPrinter(Openflower154_SomeSorter var1) {
      this();
      this.child = var1;
      this.e.a((Object)this.child, (Object)this.child.id);
   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.u() == 2 && !var0.x()) {
         Openflower105 var1 = null;
         List var2;
         if(!(var2 = var0.c(1073741824)).isEmpty()) {
            var1 = (Openflower105)var2.get(0);
         }

         if(var1 != null && var1.a() == 1 && var1.c() == var0) {
            return new Openflower149_LoopPrinter(var0);
         }

         if(var0.c != 5 && (var1 == null || var1.a() != 1) && var0.v().contains(var0.y())) {
            return new Openflower149_LoopPrinter(var0);
         }
      }

      return null;
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(Openflower89.a(this.h, var1));
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      switch(this.a) {
      case 0:
         var3.append(var2 + "while(true) {\r\n");
         var3.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
         var3.append(var2 + "}\r\n");
         break;
      case 1:
         var3.append(var2 + "do {\r\n");
         var3.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
         var3.append(var2 + "} while(" + ((Element)this.k.get(0)).toString(var1) + ");\r\n");
         break;
      case 2:
         var3.append(var2 + "while(" + ((Element)this.k.get(0)).toString(var1) + ") {\r\n");
         var3.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
         var3.append(var2 + "}\r\n");
         break;
      case 3:
         var3.append(var2 + "for(" + (this.b.get(0) == null?"":((Element)this.b.get(0)).toString(var1)) + "; " + ((Element)this.k.get(0)).toString(var1) + "; " + ((Element)this.l.get(0)).toString(var1) + ") {\r\n");
         var3.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
         var3.append(var2 + "}\r\n");
      }

      return var3.toString();
   }

   public final List d() {
      ArrayList var1 = new ArrayList();
      switch(this.a) {
      case 3:
         if(this.j() != null) {
            var1.add(this.j());
         }
      case 2:
         var1.add(this.h());
      default:
         var1.add(this.child);
         switch(this.a) {
         case 1:
            var1.add(this.h());
         case 2:
         default:
            break;
         case 3:
            var1.add(this.i());
         }

         return var1;
      }
   }

   public final void a(Element var1, Element var2) {
      if(this.b.get(0) == var1) {
         this.b.set(0, var2);
      }

      if(this.k.get(0) == var1) {
         this.k.set(0, var2);
      }

      if(this.l.get(0) == var1) {
         this.l.set(0, var2);
      }

   }

   public final Openflower154_SomeSorter a() {
      return new Openflower149_LoopPrinter();
   }

   public final List e() {
      return this.b;
   }

   public final List f() {
      return this.k;
   }

   public final List g() {
      return this.l;
   }

   public final Element h() {
      return (Element)this.k.get(0);
   }

   public final void a(Element var1) {
      this.k.set(0, var1);
   }

   public final Element i() {
      return (Element)this.l.get(0);
   }

   public final void b(Element var1) {
      this.l.set(0, var1);
   }

   public final Element j() {
      return (Element)this.b.get(0);
   }

   public final void c(Element var1) {
      this.b.set(0, var1);
   }

   public final int k() {
      return this.a;
   }

   public final void b(int var1) {
      this.a = var1;
   }
}
