package de.fernflower.main.util;

import java.io.DataInputStream;
import java.io.InputStream;

public final class ReliableDataInputStream extends DataInputStream {

   public ReliableDataInputStream(InputStream var1) {
      super(var1);
   }

   public final int a(byte[] var1) throws java.io.IOException {
      int var2;
      byte[] var3 = new byte[var2 = var1.length];
      int var4 = 0;
      boolean var5 = false;

      int var6;
      while((var6 = this.read(var3, 0, var2 - var4)) != -1) {
         System.arraycopy(var3, 0, var1, var4, var6);
         if((var4 += var6) == var2) {
            return var2;
         }
      }

      return -1;
   }
}
