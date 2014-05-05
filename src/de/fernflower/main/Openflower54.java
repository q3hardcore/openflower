package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower53;
import de.fernflower.main.Openflower74;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class Openflower54 {

   private Openflower126 a;
   private Openflower126 b;


   public Openflower54() {
      Openflower131 var1;
      (var1 = new Openflower131()).b("forName");
      var1.a("java/lang/Class");
      var1.c("(Ljava/lang/String;)Ljava/lang/Class;");
      var1.a(MethodSignatureHolder.create("(Ljava/lang/String;)Ljava/lang/Class;"));
      var1.n();
      var1.a(Arrays.asList(new Element[]{new Openflower135(0, Descriptor.STRING, (VarProcessor)null)}));
      this.a = new Openflower126(0, var1, Descriptor.CLASS);
      (var1 = new Openflower131()).b("<init>");
      var1.a("java/lang/NoClassDefFoundError");
      var1.c("()V");
      var1.k();
      var1.a(MethodSignatureHolder.create("()V"));
      Openflower133 var2;
      (var2 = new Openflower133(new Descriptor(8, 0, "java/lang/NoClassDefFoundError"), new ArrayList())).a(var1);
      (var1 = new Openflower131()).b("initCause");
      var1.a("java/lang/NoClassDefFoundError");
      var1.c("(Ljava/lang/Throwable;)Ljava/lang/Throwable;");
      var1.a(MethodSignatureHolder.create("(Ljava/lang/Throwable;)Ljava/lang/Throwable;"));
      var1.a((Element)var2);
      var1.a(Arrays.asList(new Element[]{new Openflower135(2, new Descriptor(8, 0, "java/lang/ClassNotFoundException"), (VarProcessor)null)}));
      this.b = new Openflower126(1, var1, (Descriptor)null);
   }

   public final void a(ClassNode var1) {
      Openflower74 var2 = var1.e;
      int var3 = var1.e.getClassInfo().major_version;
      int var6 = var2.getClassInfo().minor_version;
      if(var3 <= 48 && (var3 != 48 || var6 <= 0)) {
         HashMap var7 = new HashMap();
         this.a(var1, var7);
         if(!var7.isEmpty()) {
            HashSet var8 = new HashSet();
            this.a(var1, var7, var8);
            if(!var8.isEmpty()) {
               Iterator var5 = var8.iterator();

               while(var5.hasNext()) {
                  Openflower74 var4 = (Openflower74)var5.next();
                  MethodInfo var9 = ((MethodDecompileResult)var7.get(var4)).method;
                  var4.d().add(Util.concat(var9.getName(), var9.getDesc()));
               }
            }

         }
      }
   }

   private void a(ClassNode var1, HashMap var2, HashSet var3) {
      Openflower74 var4 = var1.e;
      Iterator var6 = var1.e.getResults().iterator();

      Entry var8;
      while(var6.hasNext()) {
         Object var7 = null;
         MethodDecompileResult var5;
         if((var5 = (MethodDecompileResult)var6.next()).result != null) {
            Openflower137 var10000 = var5.a();
            var8 = null;
            var10000.a(new Openflower53(this, var2, var3));
         }
      }

      for(int var11 = 0; var11 < 2; ++var11) {
         DualArrayList var13 = var11 == 0?var4.e():var4.f();

         for(int var14 = 0; var14 < var13.size(); ++var14) {
            Iterator var9 = var2.entrySet().iterator();

            while(var9.hasNext()) {
               var8 = (Entry)var9.next();
               Element var10 = (Element)var13.get(var14);
               if(this.a(var10, (Openflower74)var8.getKey(), (MethodDecompileResult)var8.getValue())) {
                  var3.add((Openflower74)var8.getKey());
               }

               String var15;
               if((var15 = b(var10, (Openflower74)var8.getKey(), (MethodDecompileResult)var8.getValue())) != null) {
                  var13.set(var14, new ConstantElement(Descriptor.CLASS, var15.replace('.', '/')));
                  var3.add((Openflower74)var8.getKey());
               }
            }
         }
      }

      var6 = var1.subClasses.iterator();

      while(var6.hasNext()) {
         ClassNode var12 = (ClassNode)var6.next();
         this.a(var12, var2, var3);
      }

   }

   private void a(ClassNode var1, HashMap var2) {
      boolean var3 = Configuration.getBoolean("nns");
      Openflower74 var4 = var1.e;
      Iterator var6 = var1.e.getResults().iterator();

      while(var6.hasNext()) {
         MethodDecompileResult var5;
         MethodInfo var7;
         if((((var7 = (var5 = (MethodDecompileResult)var6.next()).method).getAccess() & 4096) != 0 || var7.getAttributes().d("Synthetic") || var3) && var7.getDesc().equals("(Ljava/lang/String;)Ljava/lang/Class;") && (var7.getAccess() & 8) != 0) {
            Openflower152 var10 = var5.result;
            Openflower148 var12;
            if(var5.result != null && var10.s().c == 7 && (var12 = (Openflower148)var10.s()).t().size() == 2 && var12.s().c == 8 && ((Openflower154_SomeSorter)var12.t().get(1)).c == 8 && ((Openflower135)var12.e().get(0)).createDesriptor().equals((Object)(new Descriptor(8, 0, "java/lang/ClassNotFoundException")))) {
               Openflower146 var8 = (Openflower146)var12.s();
               Openflower146 var11 = (Openflower146)var12.t().get(1);
               if(var8.E().size() == 1 && var11.E().size() == 1 && this.a.equals(var8.E().get(0)) && this.b.equals(var11.E().get(0))) {
                  var2.put(var4, var5);
                  break;
               }
            }
         }
      }

      var6 = var1.subClasses.iterator();

      while(var6.hasNext()) {
         ClassNode var9 = (ClassNode)var6.next();
         this.a(var9, var2);
      }

   }

   private boolean a(Element var1, Openflower74 var2, MethodDecompileResult var3) {
      boolean var4 = false;

      while(true) {
         boolean var5 = false;
         Iterator var7 = var1.b().iterator();

         while(true) {
            if(var7.hasNext()) {
               Element var6;
               String var8;
               if((var8 = b(var6 = (Element)var7.next(), var2, var3)) == null) {
                  var4 |= this.a(var6, var2, var3);
                  continue;
               }

               var1.a(var6, new ConstantElement(Descriptor.CLASS, var8.replace('.', '/')));
               var5 = true;
               var4 = true;
            }

            if(!var5) {
               return var4;
            }
            break;
         }
      }
   }

   private static String b(Element var0, Openflower74 var1, MethodDecompileResult var2) {
      Openflower129 var3;
      Openflower129 var5;
      if(var0.a == 6 && (var5 = (Openflower129)var0).i() == 36 && ((Element)var5.j().get(0)).a == 6 && (var3 = (Openflower129)var5.j().get(0)).i() == 42 && ((Element)var3.j().get(0)).a == 5 && ((Element)var3.j().get(1)).a == 3 && ((ConstantElement)var3.j().get(1)).i().equals((Object)Descriptor.NULL)) {
         Openflower128 var8 = (Openflower128)var3.j().get(0);
         ClassNode var4;
         Openflower124 var6;
         Openflower131 var7;
         FieldInfo var9;
         if((var4 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var8.g())) != null && var4.classInfo.name.equals(var1.getClassInfo().name) && (var9 = var1.getClassInfo().getField(var8.k(), var8.h())) != null && (var9.access_flags & 8) != 0 && ((var9.access_flags & 4096) != 0 || var9.a().d("Synthetic") || Configuration.getBoolean("nns")) && ((Element)var5.j().get(1)).a == 2 && ((Element)var5.j().get(2)).equals(var8) && (var6 = (Openflower124)var5.j().get(1)).g().equals(var8) && var6.h().a == 8 && (var7 = (Openflower131)var6.h()).i().equals(var1.getClassInfo().name) && var7.o().equals(var2.method.getName()) && var7.q().equals(var2.method.getDesc()) && ((Element)var7.g().get(0)).a == 3) {
            var1.d().add(Util.concat(var9.getName(), var9.getDesc()));
            return ((ConstantElement)var7.g().get(0)).j().toString();
         }
      }

      return null;
   }

   // $FF: synthetic method
   static boolean a(Openflower54 var0, Element var1, Openflower74 var2, MethodDecompileResult var3) {
      return var0.a(var1, var2, var3);
   }
}
