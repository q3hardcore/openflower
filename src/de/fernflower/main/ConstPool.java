package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower177;
import de.fernflower.main.Openflower194;
import de.fernflower.main.Openflower195;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower198;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.MethodSignatureHolder;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.List;

public final class ConstPool {

   private List entries = new ArrayList();
   private Openflower177 b;


   public ConstPool(DataInputStream var1) throws java.io.IOException {
      int var2;
      int[] var3 = new int[var2 = var1.readUnsignedShort()];
      this.entries.add((Object)null);

      int var4;
      for(var4 = 1; var4 < var2; ++var4) {
         byte var5;
         switch(var5 = (byte)var1.readUnsignedByte()) {
         case 1:
            this.entries.add(new Openflower196(1, var1.readUTF()));
         case 2:
         default:
            break;
         case 3:
            this.entries.add(new Openflower196(3, new Integer(var1.readInt())));
            break;
         case 4:
            this.entries.add(new Openflower196(4, new Float(var1.readFloat())));
            break;
         case 5:
            this.entries.add(new Openflower196(5, new Long(var1.readLong())));
            this.entries.add((Object)null);
            ++var4;
            break;
         case 6:
            this.entries.add(new Openflower196(6, new Double(var1.readDouble())));
            this.entries.add((Object)null);
            ++var4;
            break;
         case 7:
         case 8:
            this.entries.add(new Openflower196(var5, var1.readUnsignedShort()));
            var3[var4] = 1;
            break;
         case 9:
         case 10:
         case 11:
         case 12:
            this.entries.add(new Openflower194(var5, var1.readUnsignedShort(), var1.readUnsignedShort()));
            if(var5 == 12) {
               var3[var4] = 1;
            } else {
               var3[var4] = 2;
            }
         }
      }

      for(var4 = 1; var4 < var2; ++var4) {
         if(var3[var4] == 1) {
            ((Openflower195)this.entries.get(var4)).a(this);
         }
      }

      for(var4 = 1; var4 < var2; ++var4) {
         if(var3[var4] == 2) {
            ((Openflower195)this.entries.get(var4)).a(this);
         }
      }

      this.b = Configuration.g();
   }

   public final String[] a(int var1, int var2, int var3, int var4) {
      String var6 = (String)((Openflower196)this.get(var2)).a;
      String var7 = (String)((Openflower196)this.get(var3)).a;
      String var8 = (String)((Openflower196)this.get(var4)).a;
      if(this.b != null) {
         if((var6 = this.b.a(var1, var6, var7, var8)) != null) {
            var7 = var6.split(" ")[1];
         }

         String var5;
         if((var5 = this.a(var1 == 2?9:10, var8)) != null) {
            var8 = var5;
         }
      }

      return new String[]{var7, var8};
   }

   private Openflower195 get(int var1) {
      return (Openflower195)this.entries.get(var1);
   }

   public final Openflower196 a(int var1) {
      String var2;
      Openflower196 var3;
      if((var3 = (Openflower196)this.get(var1)) != null && this.b != null && var3.d == 7 && (var2 = this.a((String)var3.a)) != null) {
         var3 = new Openflower196(7, var2);
      }

      return var3;
   }

   public final Openflower194 b(int var1) {
      Openflower194 var5;
      if((var5 = (Openflower194)this.get(var1)) != null && this.b != null && (var5.d == 9 || var5.d == 10 || var5.d == 11)) {
         String var2 = this.a(var5.a);
         String var3 = this.b.a(var5.d == 9?2:3, var5.a, var5.b, var5.c);
         String var4 = this.a(var5.d, var5.c);
         if(var2 != null || var3 != null || var4 != null) {
            var5 = new Openflower194(var5.d, var2 == null?var5.a:var2, var3 == null?var5.b:var3.split(" ")[1], var4 == null?var5.c:var4);
         }
      }

      return var5;
   }

   private String a(String var1) {
      Descriptor var5 = new Descriptor(var1, true);
      String var4;
      if((var4 = this.b.a(1, var5.stringValue, (String)null, (String)null)) == null) {
         return null;
      } else {
         StringBuilder var2 = new StringBuilder();
         if(var5.arrayDepth > 0) {
            for(int var3 = 0; var3 < var5.arrayDepth; ++var3) {
               var2.append("[");
            }

            var2.append("L" + var4 + ";");
         } else {
            var2.append(var4);
         }

         return var2.toString();
      }
   }

   private String a(int var1, String var2) {
      boolean var3 = false;
      Descriptor var10;
      if(var1 == 9) {
         String var4;
         Openflower198 var8;
         if((var10 = (var8 = Openflower198.a(var2)).e).type == 8 && (var4 = this.a(var10.stringValue)) != null) {
            var10.stringValue = var4;
            var3 = true;
         }

         if(var3) {
            return var8.a();
         }
      } else {
         Descriptor[] var6;
         MethodSignatureHolder var9;
         int var5 = (var6 = (var9 = MethodSignatureHolder.create(var2)).params).length;

         for(int var11 = 0; var11 < var5; ++var11) {
            String var7;
            if((var10 = var6[var11]).type == 8 && (var7 = this.a(var10.stringValue)) != null) {
               var10.stringValue = var7;
               var3 = true;
            }
         }

         if(var9.ret.type == 8 && (var2 = this.a(var9.ret.stringValue)) != null) {
            var9.ret.stringValue = var2;
            var3 = true;
         }

         if(var3) {
            return var9.toString();
         }
      }

      return null;
   }
}
