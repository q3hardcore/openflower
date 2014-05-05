package de.fernflower.main;

import de.fernflower.main.extern.IIdentifierRenamer;
import java.util.HashSet;

public final class DefaultIdentifierRenamer implements IIdentifierRenamer {

   private static HashSet a;
   private int b = 0;
   private int c = 0;
   private int d = 0;
   private HashSet e = new HashSet();


   static {
      (a = new HashSet()).add("abstract");
      a.add("do");
      a.add("if");
      a.add("package");
      a.add("synchronized");
      a.add("boolean");
      a.add("double");
      a.add("implements");
      a.add("private");
      a.add("this");
      a.add("break");
      a.add("else");
      a.add("import");
      a.add("protected");
      a.add("throw");
      a.add("byte");
      a.add("extends");
      a.add("instanceof");
      a.add("public");
      a.add("throws");
      a.add("case");
      a.add("false");
      a.add("int");
      a.add("return");
      a.add("transient");
      a.add("catch");
      a.add("final");
      a.add("interface");
      a.add("short");
      a.add("true");
      a.add("char");
      a.add("finally");
      a.add("long");
      a.add("static");
      a.add("try");
      a.add("class");
      a.add("float");
      a.add("native");
      a.add("strictfp");
      a.add("void");
      a.add("const");
      a.add("for");
      a.add("new");
      a.add("super");
      a.add("volatile");
      a.add("continue");
      a.add("goto");
      a.add("null");
      a.add("switch");
      a.add("while");
      a.add("default");
      a.add("assert");
      a.add("enum");
   }

   public final boolean toBeRenamed(int var1, String var2, String var3, String var4) {
      String var5;
      return (var5 = var1 == 1?var2:var3) == null || var5.length() == 0 || var5.length() <= 2 || a.contains(var5) || !Character.isJavaIdentifierStart(var5.charAt(0));
   }

   public final String getNextClassname(String var1, String var2) {
      if(var2 == null) {
         return "class_" + this.b++;
      } else {
         int var3;
         for(var3 = 0; Character.isDigit(var2.charAt(var3)); ++var3) {
            ;
         }

         if(var3 != 0 && var3 != var2.length()) {
            var1 = var2.substring(var3);
            if(this.e.contains(var1)) {
               return "Inner" + var1 + "_" + this.b++;
            } else {
               this.e.add(var1);
               return "Inner" + var1;
            }
         } else {
            return "class_" + this.b++;
         }
      }
   }

   public final String getNextFieldname(String var1, String var2, String var3) {
      return "field_" + this.c++;
   }

   public final String getNextMethodname(String var1, String var2, String var3) {
      return "method_" + this.d++;
   }

   public static String a(String var0) {
      return var0.substring(var0.lastIndexOf(47) + 1);
   }

   public static String a(String var0, String var1) {
      return var0.substring(0, var0.lastIndexOf(47) + 1) + var1;
   }
}
