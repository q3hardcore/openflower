package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class Openflower156 extends Openflower154_SomeSorter {

   private Openflower154_SomeSorter a;
   private List b;


   public Openflower156() {
      this.b = new ArrayList();
      this.c = 10;
      this.b.add((Object)null);
   }

   public Openflower156(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2, Openflower154_SomeSorter var3) {
      this();
      this.child = var1;
      this.e.a((Object)var1, (Object)var1.id);
      this.a = var2;
      this.e.a((Object)var2, (Object)var2.id);
      this.e.a((Object)var3, (Object)var3.id);
      List var4;
      Openflower105 var5;
      if(!(var4 = var2.c(1073741824)).isEmpty() && (var5 = (Openflower105)var4.get(0)).a() == 1) {
         this.i = var5.c();
      }

   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3;
      (var3 = new StringBuffer()).append(Openflower89.a(this.h, var1));
      var3.append(this.child.getString(var1));
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      var3.append(var2 + ((Element)this.b.get(0)).toString(var1) + " {\r\n");
      var3.append(Openflower89.printLoopBody(this.a, var1 + 1, true));
      var3.append(var2 + "}\r\n");
      return var3.toString();
   }

   public final void e_() {
      this.b.set(0, (Element)this.child.E().remove(this.child.E().size() - 1));
   }

   public final List d() {
      ArrayList var1;
      (var1 = new ArrayList(this.e)).add(1, this.b.get(0));
      return var1;
   }

   public final void a(Element var1, Element var2) {
      if(this.b.get(0) == var1) {
         this.b.set(0, var2);
      }

   }

   public final void a(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      if(this.a == var1) {
         this.a = var2;
      }

      super.a(var1, var2);
   }

   public final void e() {
      Openflower154_SomeSorter var1;
      Openflower102.a(var1 = (Openflower154_SomeSorter)this.e.get(2), true);
      this.e.a(var1.id);
   }

   public final Openflower154_SomeSorter a() {
      return new Openflower156();
   }

   public final void b() {
      this.child = (Openflower154_SomeSorter)this.e.get(0);
      this.a = (Openflower154_SomeSorter)this.e.get(1);
   }

   public final Openflower154_SomeSorter f() {
      return this.a;
   }

   public final List g() {
      return this.b;
   }
}
