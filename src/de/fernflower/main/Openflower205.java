package de.fernflower.main;

import java.util.ArrayList;
import java.util.List;

public final class Openflower205 {

   public int a;
   public int b;
   public String c;
   private List d = new ArrayList();
   private List e = new ArrayList();
   private List f = new ArrayList();


   public Openflower205(int var1, int var2, String var3) {
      this.a = 8;
      this.b = 0;
      this.c = var3;
   }

   public Openflower205(String var1) {
      this.b(var1);
   }

   private void b(String var1) {
      for(int var2 = 0; var2 < var1.length(); ++var2) {
         switch(var1.charAt(var2)) {
         case 76:
            this.a = 8;
            var1 = var1.substring(var2 + 1, var1.length() - 1);

            while(true) {
               String var3 = var1;
               var2 = 0;
               int var4 = 0;

               while(true) {
                  if(var4 < var3.length()) {
                     label55: {
                        switch(var3.charAt(var4)) {
                        case 46:
                           if(var2 == 0) {
                              break label55;
                           }
                           break;
                        case 60:
                           ++var2;
                           break;
                        case 62:
                           --var2;
                        }

                        ++var4;
                        continue;
                     }
                  }

                  String var6;
                  var3 = var6 = var3.substring(0, var4);
                  String var8 = null;
                  int var5;
                  if((var5 = var6.indexOf("<")) >= 0) {
                     var3 = var6.substring(0, var5);
                     var8 = var6.substring(var5 + 1, var6.length() - 1);
                  }

                  if(var6.length() >= var1.length()) {
                     this.c = var3;
                     a(var8, this);
                     return;
                  }

                  var1 = var1.substring(var6.length() + 1);
                  Openflower205 var7 = new Openflower205(8, 0, var3);
                  a(var8, var7);
                  this.d.add(var7);
                  break;
               }
            }
         case 84:
            this.a = 18;
            this.c = var1.substring(var2 + 1, var1.length() - 1);
            return;
         case 91:
            ++this.b;
            break;
         default:
            this.c = var1.substring(var2, var2 + 1);
            byte var10001;
            switch(this.c.charAt(0)) {
            case 65:
               var10001 = 9;
               break;
            case 66:
               var10001 = 0;
               break;
            case 67:
               var10001 = 1;
               break;
            case 68:
               var10001 = 2;
               break;
            case 69:
            case 72:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 87:
            default:
               throw new RuntimeException("Invalid type");
            case 70:
               var10001 = 3;
               break;
            case 71:
               var10001 = 12;
               break;
            case 73:
               var10001 = 4;
               break;
            case 74:
               var10001 = 5;
               break;
            case 78:
               var10001 = 14;
               break;
            case 83:
               var10001 = 6;
               break;
            case 85:
               var10001 = 17;
               break;
            case 86:
               var10001 = 10;
               break;
            case 88:
               var10001 = 15;
               break;
            case 89:
               var10001 = 16;
               break;
            case 90:
               var10001 = 7;
            }

            this.a = var10001;
         }
      }

   }

   private static void a(String var0, Openflower205 var1) {
      if(var0 != null) {
         while(var0.length() > 0) {
            String var2;
            int var3 = (var2 = a(var0)).length();
            byte var4 = 4;
            switch(var2.charAt(0)) {
            case 42:
               var4 = 3;
               break;
            case 43:
               var4 = 1;
            case 44:
            default:
               break;
            case 45:
               var4 = 2;
            }

            var1.f.add(Integer.valueOf(var4));
            if(var4 != 4) {
               var2 = var2.substring(1);
            }

            var1.e.add(var2.length() == 0?null:new Openflower205(var2));
            var0 = var0.substring(var3);
         }

      }
   }

   public static String a(String var0) {
      int var1 = 0;
      int var2 = 0;

      for(boolean var3 = false; var2 < var0.length(); ++var2) {
         switch(var0.charAt(var2)) {
         case 42:
            if(!var3) {
               return var0.substring(0, var2 + 1);
            }
         case 43:
         case 45:
         case 91:
            break;
         case 59:
            if(var1 == 0) {
               return var0.substring(0, var2 + 1);
            }
            break;
         case 60:
            ++var1;
            break;
         case 62:
            --var1;
            break;
         case 76:
         case 84:
            if(!var3) {
               var3 = true;
            }
            break;
         default:
            if(!var3) {
               return var0.substring(0, var2 + 1);
            }
         }
      }

      return var0.substring(0, var2 + 1);
   }

   public final List a() {
      return this.e;
   }

   public final List b() {
      return this.d;
   }

   public final List c() {
      return this.f;
   }
}
