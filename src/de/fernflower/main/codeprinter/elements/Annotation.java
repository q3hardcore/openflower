package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ImportManager;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.List;

public final class Annotation extends Element {

   private String owner;
   private List keys;
   private List values;


   public Annotation(String var1, List var2, List var3) {
      this.a = 13;
      this.owner = var1;
      this.keys = var2;
      this.values = var3;
   }

   public final String toString(int var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = Util.getIndent(var1);
      var2.append(var3);
      var2.append("@");
      ImportManager var10001 = Configuration.getImportManager();
      String var5 = Openflower89.getSourceName(this.owner);
      String var4 = null;
      var2.append(var10001.getRelativeName(var5, true));
      if(!this.keys.isEmpty()) {
         var2.append("(");
         if(this.keys.size() == 1 && "value".equals(this.keys.get(0))) {
            var2.append(((Element)this.values.get(0)).toString(var1 + 1));
         } else {
            var4 = Util.getIndent(var1 + 1);

            for(int var6 = 0; var6 < this.keys.size(); ++var6) {
               var2.append("\r\n" + var4);
               var2.append((String)this.keys.get(var6));
               var2.append(" = ");
               var2.append(((Element)this.values.get(var6)).toString(var1 + 2));
               if(var6 < this.keys.size() - 1) {
                  var2.append(",");
               }
            }

            var2.append("\r\n" + var3);
         }

         var2.append(")");
      }

      return var2.toString();
   }

   public final int getStyle() {
      return this.keys.isEmpty()?2:(this.keys.size() == 1 && "value".equals(this.keys.get(0))?3:1);
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Annotation) {
         Annotation var2 = (Annotation)var1;
         return this.owner.equals(var2.owner) && Util.safeEquals(this.keys, var2.keys) && Util.safeEquals(this.values, var2.values);
      } else {
         return false;
      }
   }

   public final String getOwner() {
      return this.owner;
   }
}
