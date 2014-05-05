package de.fernflower.main.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public final class Util {

   public static void copyFile(File var0, File var1) throws IOException {
      FileChannel var11 = (new FileInputStream(var0)).getChannel();
      FileChannel var12 = (new FileOutputStream(var1)).getChannel();

      try {
         int var2 = 67076096;
         long var3 = var11.size();

         for(long var5 = 0L; var5 < var3; var5 += var11.transferTo(var5, (long)var2, var12)) {
            ;
         }
      } catch (IOException var9) {
         throw var9;
      } finally {
         if(var11 != null) {
            var11.close();
         }

         if(var12 != null) {
            var12.close();
         }

      }

   }

   public static void copyStream(InputStream var0, OutputStream var1) throws IOException {
      byte[] var2 = new byte[1024];

      int var3;
      while((var3 = var0.read(var2)) >= 0) {
         var1.write(var2, 0, var3);
      }

   }

   public static String getIndent(int var0) {
      StringBuffer var1 = new StringBuffer();

      while(var0-- > 0) {
         var1.append("   ");
      }

      return var1.toString();
   }

   public static boolean safeEquals(Object var0, Object var1) {
      return var0 == null?var1 == null:var0.equals(var1);
   }

   public static boolean safeEquals(Object[] var0, Object[] var1) {
      if(var0 == null) {
         return safeEquals((Object)var0, (Object)var1);
      } else if(var0.length != var1.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if(!safeEquals(var0[var2], var1[var2])) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean safeEquals(List var0, List var1) {
      if(var0 == null) {
         return var1 == null;
      } else if(var1 == null) {
         return var0 == null;
      } else if(var0.size() != var1.size()) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            if(!safeEquals(var0.get(var2), var1.get(var2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static String toUnicodeLiteral(int var0) {
      String var1 = Integer.toHexString(var0);
      var1 = ("0000" + var1).substring(var1.length());
      return "\\u" + var1;
   }

   public static String concat(String var0, String var1) {
      return var0 + " " + var1;
   }
}
