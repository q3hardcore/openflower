package de.fernflower.main;

import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.util.Util;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class Openflower150 extends Openflower154_SomeSorter {

   private Openflower150() {
      this.c = 0;
   }

   public Openflower150(Openflower154_SomeSorter var1, Collection var2, Openflower154_SomeSorter var3) {
      this();
      this.child = var1;
      this.e.a((Object)var1, (Object)var1.id);
      HashSet var4;
      (var4 = new HashSet(var2)).remove(var1);
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         var1 = (Openflower154_SomeSorter)var5.next();
         this.e.a((Object)var1, (Object)var1.id);
      }

      this.i = var3;
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3 = new StringBuffer();
      if(this.needsLabel()) {
         var3.append(var2 + "label" + this.id + ":\r\n");
      }

      var3.append(var2 + "abstract statement {\r\n");

      for(int var4 = 0; var4 < this.e.size(); ++var4) {
         var3.append(((Openflower154_SomeSorter)this.e.get(var4)).getString(var1 + 1));
      }

      var3.append(var2 + "}");
      return var3.toString();
   }
}
