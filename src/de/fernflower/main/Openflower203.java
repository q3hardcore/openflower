package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ImportManager;
import de.fernflower.main.Openflower201;
import de.fernflower.main.Openflower202;
import de.fernflower.main.Openflower204;
import de.fernflower.main.Openflower205;
import de.fernflower.main.util.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Openflower203 {

   private static final String[] a = new String[]{"byte", "char", "double", "float", "int", "long", "short", "boolean"};


   public static Openflower201 a(String var0) {
      Openflower201 var1 = new Openflower201();
      String var2 = Openflower205.a(var0 = a(var0, var1.c, var1.d));
      var1.a = new Openflower205(var2);

      for(var0 = var0.substring(var2.length()); var0.length() > 0; var0 = var0.substring(var2.length())) {
         var2 = Openflower205.a(var0);
         var1.b.add(new Openflower205(var2));
      }

      return var1;
   }

   public static Openflower202 b(String var0) {
      Openflower202 var1;
      (var1 = new Openflower202()).a = new Openflower205(var0);
      return var1;
   }

   public static Openflower204 c(String var0) {
      Openflower204 var1 = new Openflower204();
      int var2 = (var0 = a(var0, var1.a, var1.b)).indexOf(")");
      String var3 = var0.substring(1, var2);

      String var5;
      for(var0 = var0.substring(var2 + 1); var3.length() > 0; var3 = var3.substring(var5.length())) {
         var5 = Openflower205.a(var3);
         var1.c.add(new Openflower205(var5));
      }

      var5 = Openflower205.a(var0);
      var1.d = new Openflower205(var5);
      if((var0 = var0.substring(var5.length())).length() > 0) {
         String[] var4 = var0.split("\\^");

         for(var2 = 1; var2 < var4.length; ++var2) {
            var1.e.add(new Openflower205(var4[var2]));
         }
      }

      return var1;
   }

   private static String a(String var0, List var1, List var2) {
      if(var0.charAt(0) != 60) {
         return var0;
      } else {
         int var3 = 1;

         int var4;
         label44:
         for(var4 = 1; var4 < var0.length(); ++var4) {
            switch(var0.charAt(var4)) {
            case 60:
               ++var3;
            case 61:
            default:
               break;
            case 62:
               --var3;
               if(var3 == 0) {
                  break label44;
               }
            }
         }

         String var7 = var0.substring(1, var4);
         var0 = var0.substring(var4 + 1);

         while(var7.length() > 0) {
            var4 = var7.indexOf(":");
            String var5 = var7.substring(0, var4);
            var7 = var7.substring(var4 + 1);
            ArrayList var8 = new ArrayList();

            while(true) {
               if(var7.charAt(0) == 58) {
                  var8.add(new Openflower205(8, 0, "java/lang/Object"));
                  var7 = var7.substring(1);
               }

               String var6 = Openflower205.a(var7);
               var8.add(new Openflower205(var6));
               if((var7 = var7.substring(var6.length())).length() == 0 || var7.charAt(0) != 58) {
                  var1.add(var5);
                  var2.add(var8);
                  break;
               }

               var7 = var7.substring(1);
            }
         }

         return var0;
      }
   }

   public static String a(Openflower205 var0) {
      Openflower205 var1 = var0;
      int var2 = var0.a;
      String var10000;
      if(var0.a <= 7) {
         var10000 = a[var2];
      } else if(var2 == 10) {
         var10000 = "void";
      } else if(var2 == 18) {
         var10000 = var0.c;
      } else {
         if(var2 != 8) {
            throw new RuntimeException("invalid type");
         }

         StringBuilder var7;
         StringBuilder var9 = var7 = new StringBuilder();
         ImportManager var10001 = Configuration.getImportManager();
         String var4 = b(var0);
         Object var3 = null;
         var9.append(var10001.getRelativeName(var4, true));
         if(!var0.a().isEmpty()) {
            var7.append("<");

            for(int var10 = 0; var10 < var1.a().size(); ++var10) {
               if(var10 > 0) {
                  var7.append(", ");
               }

               int var11;
               if((var11 = ((Integer)var1.c().get(var10)).intValue()) != 4) {
                  var7.append("?");
                  switch(var11) {
                  case 1:
                     var7.append(" extends ");
                     break;
                  case 2:
                     var7.append(" super ");
                  }
               }

               Openflower205 var12;
               if((var12 = (Openflower205)var1.a().get(var10)) != null) {
                  var7.append(a(var12));
               }
            }

            var7.append(">");
         }

         var10000 = var7.toString();
      }

      String var6 = var10000;

      for(int var5 = var0.b; var5-- > 0; var6 = var6 + "[]") {
         ;
      }

      return var6;
   }

   private static String b(Openflower205 var0) {
      String var1 = "";

      Openflower205 var2;
      for(Iterator var3 = var0.b().iterator(); var3.hasNext(); var1 = var1 + var2.c + "$") {
         var2 = (Openflower205)var3.next();
      }

      String var4;
      ClassInfo var5;
      if((var4 = (var1 = var1 + var0.c).replace('/', '.')).indexOf("$") >= 0 && ((var5 = Configuration.getDispatcher().getClass(var1)) == null || !var5.isNotLibrary())) {
         var4 = var4.replace('$', '.');
      }

      return var4;
   }
}
