package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InnerClasses extends Attribute {

   private List indexes = new ArrayList();
   private List names = new ArrayList();


   public final void read(ConstPool var1) {
      this.name = "InnerClasses";
      int var2 = 2 + (((this.data[0] & 255) << 8 | this.data[1] & 255) << 3);
      int var3 = 2;

      int[] var4;
      while(var3 < var2) {
         var4 = new int[4];

         for(int var5 = 0; var5 < 4; ++var5) {
            var4[var5] = (this.data[var3] & 255) << 8 | this.data[var3 + 1] & 255;
            var3 += 2;
         }

         this.indexes.add(var4);
      }

      String[] var6;
      for(Iterator var7 = this.indexes.iterator(); var7.hasNext(); this.names.add(var6)) {
         var4 = (int[])var7.next();
         (var6 = new String[3])[0] = (String)var1.a(var4[0]).a;
         if(var4[1] != 0) {
            var6[1] = (String)var1.a(var4[1]).a;
         }

         if(var4[2] != 0) {
            var6[2] = (String)var1.a(var4[2]).a;
         }
      }

   }

   public final List getIndexes() {
      return this.indexes;
   }

   public final List getNames() {
      return this.names;
   }
}
