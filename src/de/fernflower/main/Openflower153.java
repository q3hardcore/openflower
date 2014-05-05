package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower89;
import de.fernflower.main.util.Util;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Openflower153 extends Openflower154_SomeSorter {

   private Openflower153() {
      this.c = 15;
   }

   public Openflower153(List var1) {
      this();
      this.j = ((Openflower154_SomeSorter)var1.get(var1.size() - 1)).u();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Openflower154_SomeSorter var3 = (Openflower154_SomeSorter)var2.next();
         this.e.a((Object)var3, (Object)var3.id);
      }

      this.child = (Openflower154_SomeSorter)this.e.get(0);
   }

   private Openflower153(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      this(Arrays.asList(new Openflower154_SomeSorter[]{var1, var2}));
      List var3;
      Openflower105 var4;
      if(!(var3 = var2.c(1073741824)).isEmpty() && (var4 = (Openflower105)var3.get(0)).a() == 1 && var4.c() != var1) {
         this.i = var4.c();
      }

   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.u() != 2) {
         return null;
      } else {
         Openflower105 var1 = null;
         List var2;
         if(!(var2 = var0.c(1073741824)).isEmpty()) {
            var1 = (Openflower105)var2.get(0);
         }

         Openflower154_SomeSorter var3;
         return var1 != null && var1.a() == 1 && (var3 = var1.c()) != var0 && var3.d(1).size() == 1 && !var3.x() && var3.u() == 2 && Openflower85.a(Arrays.asList(new Openflower154_SomeSorter[]{var0, var3}))?new Openflower153(var0, var3):null;
      }
   }

   public final String getString(int var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = null;
      boolean var4 = this.needsLabel();
      var2.append(Openflower89.a(this.h, var1));
      if(var4) {
         var3 = Util.getIndent(var1);
         ++var1;
         var2.append(var3 + "label" + this.id + ": {\r\n");
      }

      boolean var5 = false;

      for(int var6 = 0; var6 < this.e.size(); ++var6) {
         Openflower154_SomeSorter var7 = (Openflower154_SomeSorter)this.e.get(var6);
         if(var6 > 0 && var5) {
            var2.append("\r\n");
         }

         String var8 = Openflower89.printLoopBody(var7, var1, false);
         var2.append(var8);
         var5 = var8.trim().length() > 0;
      }

      if(var4) {
         var2.append(var3 + "}\r\n");
      }

      return var2.toString();
   }

   public final Openflower154_SomeSorter a() {
      return new Openflower153();
   }
}
