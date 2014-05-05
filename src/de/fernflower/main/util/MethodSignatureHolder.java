package de.fernflower.main.util;

import de.fernflower.main.Descriptor;
import java.util.ArrayList;

public final class MethodSignatureHolder {

   public Descriptor[] params;
   public Descriptor ret;


   public static MethodSignatureHolder create(String var0) {
      MethodSignatureHolder var1 = new MethodSignatureHolder();
      ArrayList var2 = new ArrayList();
      String[] var8;
      String var3 = (var8 = var0.split("[()]"))[1];
      int var4 = -1;
      int var6 = 0;

      for(int var7 = var3.length(); var6 < var7; ++var6) {
         switch(var3.charAt(var6)) {
         case 76:
            int var5 = var3.indexOf(";", var6);
            var2.add(var3.substring(var4 < 0?var6:var4, var5 + 1));
            var6 = var5;
            var4 = -1;
            break;
         case 91:
            if(var4 < 0) {
               var4 = var6;
            }
            break;
         default:
            var2.add(var3.substring(var4 < 0?var6:var4, var6 + 1));
            var4 = -1;
         }
      }

      var2.add(var8[2]);
      var1.params = new Descriptor[var2.size() - 1];

      int var9;
      for(var9 = 0; var9 < var2.size() - 1; ++var9) {
         var1.params[var9] = new Descriptor((String)var2.get(var9));
      }

      var1.ret = new Descriptor((String)var2.get(var9));
      return var1;
   }

   public final String toString() {
      String var1 = "(";

      for(int var2 = 0; var2 < this.params.length; ++var2) {
         var1 = var1 + this.params[var2].toString();
      }

      return var1 + ")" + this.ret.toString();
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof MethodSignatureHolder) {
         MethodSignatureHolder var3 = (MethodSignatureHolder)var1;
         if(this.ret.equals((Object)var3.ret) && this.params.length == var3.params.length) {
            for(int var2 = 0; var2 < this.params.length; ++var2) {
               if(!this.params[var2].equals((Object)var3.params[var2])) {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return this.ret.hashCode();
   }
}
