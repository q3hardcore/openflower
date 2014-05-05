package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.EnumDecompiler;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower177;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower198;
import de.fernflower.main.Openflower201;
import de.fernflower.main.Openflower202;
import de.fernflower.main.Openflower203;
import de.fernflower.main.Openflower204;
import de.fernflower.main.Openflower205;
import de.fernflower.main.Openflower52;
import de.fernflower.main.Openflower54;
import de.fernflower.main.Openflower61;
import de.fernflower.main.Openflower74;
import de.fernflower.main.Openflower89;
import de.fernflower.main.classreader.attributes.AnnotationDefault;
import de.fernflower.main.classreader.attributes.Annotations;
import de.fernflower.main.classreader.attributes.ConstantValue;
import de.fernflower.main.classreader.attributes.Exceptions;
import de.fernflower.main.classreader.attributes.ParameterAnnotations;
import de.fernflower.main.classreader.attributes.Signature;
import de.fernflower.main.codeprinter.elements.Annotation;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ClassDecompiler {

   private static final int[] flagsClass = new int[]{1, 4, 2, 1024, 8, 16, 2048};
   private static final String[] namesClass = new String[]{"public ", "protected ", "private ", "abstract ", "static ", "final ", "strictfp "};
   private static final int[] flagsField = new int[]{1, 4, 2, 8, 16, 128, 64};
   private static final String[] namesField = new String[]{"public ", "protected ", "private ", "static ", "final ", "transient ", "volatile "};
   private static final int[] flagsMethod = new int[]{1, 4, 2, 1024, 8, 16, 32, 256, 2048};
   private static final String[] namesMethod = new String[]{"public ", "protected ", "private ", "abstract ", "static ", "final ", "synchronized ", "native ", "strictfp "};
   private static final HashSet flagsClassIgnore = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1024), Integer.valueOf(8)}));
   private static final HashSet flagsFieldIgnore = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(8), Integer.valueOf(16)}));
   private static final HashSet flagsMethodIgnore = new HashSet((Collection)Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(1024)}));
   private Openflower54 j = new Openflower54();
   private Openflower177 k = Configuration.g();


   public final void decompile(ClassNode var1, BufferedWriter var2, int var3) throws java.io.IOException {
      Openflower74 var4 = var1.e;
      ClassInfo var5 = var1.e.getClassInfo();
      ClassNode var6 = (ClassNode)Configuration.getObject("CURRENT_CLASSNODE");
      Configuration.put("CURRENT_CLASSNODE", var1);
      Openflower74 var9 = var1.e;
      ClassInfo var10 = var1.e.getClassInfo();
      Openflower61.a(var9);
      if(var1.a == 0 && Configuration.getBoolean("dc4")) {
         this.j.a(var1);
      }

      if(Configuration.getBoolean("den") && (var10.access_flags & 16384) != 0) {
         EnumDecompiler.a(var9);
      }

      if(Configuration.getBoolean("das")) {
         Openflower52.a(var9);
      }

      Configuration.getLogger().startWriteClass(var5.name);
      int var32 = var3;
      BufferedWriter var24 = var2;
      int var13;
      boolean var14;
      boolean var15;
      if(var1.a == 2) {
         var2.write(" {");
         var2.newLine();
      } else {
         String var11 = Util.getIndent(var3);
         ClassInfo var12 = null;
         var12 = var1.e.getClassInfo();
         var14 = ((var13 = var1.a == 0?var12.access_flags:var1.access_flags) & 512) != 0;
         var15 = (var13 & 8192) != 0;
         boolean var16 = Configuration.getBoolean("den") && (var13 & 16384) != 0;
         boolean var17 = var12.getAttributes().d("Deprecated");
         String var18;
         if(this.k != null && (var18 = this.k.a(var12.name)) != null) {
            var2.write(var11);
            var2.write("// $FF: renamed from: " + this.a(var18, 0));
            var2.newLine();
         }

         List var10000 = getRuntimeAnnotations(var12.getAttributes());
         var18 = null;
         Iterator var41 = var10000.iterator();

         Annotation var7;
         while(var41.hasNext()) {
            var7 = (Annotation)var41.next();
            if("java/lang/Deprecated".equals(var7.getOwner())) {
               var17 = false;
            }

            var24.write(var7.toString(var32));
            var24.newLine();
         }

         boolean var43 = (var13 & 4096) != 0 || var12.getAttributes().d("Synthetic");
         boolean var19 = false;
         if(var43) {
            var24.write(var11);
            var24.write("// $FF: synthetic class");
            var24.newLine();
         }

         if(var17) {
            var24.write(var11);
            var24.write("@Deprecated");
            var24.newLine();
         }

         var24.write(var11);
         if(var16) {
            var13 = var13 & -1025 & -17;
         }

         for(int var40 = 0; var40 < flagsClass.length; ++var40) {
            if((!var14 || !flagsClassIgnore.contains(Integer.valueOf(flagsClass[var40]))) && (var13 & flagsClass[var40]) != 0) {
               var24.write(namesClass[var40]);
            }
         }

         if(var16) {
            var24.write("enum ");
         } else if(var14) {
            if(var15) {
               var24.write("@");
            }

            var24.write("interface ");
         } else {
            var24.write("class ");
         }

         Openflower201 var42 = null;
         Signature var21;
         if(Configuration.getBoolean("dgs") && (var21 = (Signature)var12.getAttributes().b("Signature")) != null) {
            var42 = Openflower203.a(var21.a());
         }

         var24.write(var1.name);
         if(var42 != null && !var42.c.isEmpty()) {
            var24.write("<");

            for(int var20 = 0; var20 < var42.c.size(); ++var20) {
               if(var20 > 0) {
                  var24.write(", ");
               }

               var24.write((String)var42.c.get(var20) + " extends ");
               List var8 = (List)var42.d.get(var20);
               var24.write(Openflower203.a((Openflower205)var8.get(0)));

               for(var32 = 1; var32 < var8.size(); ++var32) {
                  var24.write(" & " + Openflower203.a((Openflower205)var8.get(var32)));
               }
            }

            var24.write(">");
         }

         var24.write(" ");
         if(!var16 && !var14 && var12.super_class_cp_info != null) {
            Descriptor var44 = new Descriptor((String)var12.super_class_cp_info.a, true);
            var7 = null;
            Descriptor var27 = var44;
            if(!Descriptor.OBJECT.equals((Object)var27)) {
               var24.write("extends ");
               if(var42 != null) {
                  var24.write(Openflower203.a(var42.a));
               } else {
                  var24.write(Openflower89.b(var27));
               }

               var24.write(" ");
            }
         }

         int[] var25;
         if(!var15 && (var25 = var12.getInterfaceIndexes()).length > 0) {
            var24.write(var14?"extends ":"implements ");

            for(int var22 = 0; var22 < var25.length; ++var22) {
               if(var22 > 0) {
                  var24.write(", ");
               }

               if(var42 != null) {
                  var24.write(Openflower203.a((Openflower205)var42.b.get(var22)));
               } else {
                  var24.write(Openflower89.b(new Descriptor(var12.getInterface(var22), true)));
               }
            }

            var24.write(" ");
         }

         var24.write("{");
         var24.newLine();
      }

      StringWriter var28 = new StringWriter();
      BufferedWriter var26 = new BufferedWriter(var28);
      boolean var29 = true;
      boolean var31 = false;
      Iterator var35 = var5.getMethods().iterator();

      while(var35.hasNext()) {
         MethodInfo var30;
         var14 = ((var13 = (var30 = (MethodInfo)var35.next()).getAccess()) & 4096) != 0 || var30.getAttributes().d("Synthetic");
         var15 = (var13 & 64) != 0;
         if((!var14 || !Configuration.getBoolean("rsy")) && (!var15 || !Configuration.getBoolean("rbr")) && !var4.d().contains(Util.concat(var30.getName(), var30.getDesc()))) {
            if(!var31 && (!var29 || var1.a != 2)) {
               var26.newLine();
               var29 = false;
            }

            var31 = !this.decompileMethod(var1, var30, var26, var3 + 1);
         }
      }

      var26.flush();
      StringWriter var36 = new StringWriter();
      BufferedWriter var37 = new BufferedWriter(var36);
      var13 = 0;
      var14 = false;
      Iterator var23 = var5.getFields().iterator();

      while(var23.hasNext()) {
         int var33;
         FieldInfo var39;
         if((((var33 = (var39 = (FieldInfo)var23.next()).access_flags) & 4096) == 0 && !var39.a().d("Synthetic") || !Configuration.getBoolean("rsy")) && !var4.d().contains(Util.concat(var39.getName(), var39.getDesc()))) {
            if(Configuration.getBoolean("den") && (var33 & 16384) != 0) {
               if(var14) {
                  var37.write(",");
                  var37.newLine();
               } else {
                  var14 = true;
               }
            } else if(var14) {
               var37.write(";");
               var37.newLine();
               var14 = false;
            }

            this.decompileField(var4, var5, var39, var37, var3 + 1);
            ++var13;
         }
      }

      if(var14) {
         var37.write(";");
         var37.newLine();
      }

      var37.flush();
      if(var13 > 0) {
         var2.newLine();
         var2.write(var36.toString());
         var2.newLine();
      }

      var2.write(var28.toString());
      var23 = var1.subClasses.iterator();

      while(var23.hasNext()) {
         ClassNode var38;
         if((var38 = (ClassNode)var23.next()).a == 1) {
            ClassInfo var34 = var38.classInfo;
            if(((var38.classInfo.access_flags & 4096) == 0 && !var34.getAttributes().d("Synthetic") || !Configuration.getBoolean("rsy")) && !var4.d().contains(var34.name)) {
               var2.newLine();
               this.decompile(var38, var2, var3 + 1);
            }
         }
      }

      var2.write(Util.getIndent(var3));
      var2.write("}");
      if(var1.a != 2) {
         var2.newLine();
      }

      var2.flush();
      Configuration.put("CURRENT_CLASSNODE", var6);
      Configuration.getLogger().endWriteClass();
   }

   private void decompileField(Openflower74 var1, ClassInfo var2, FieldInfo var3, BufferedWriter var4, int var5) throws java.io.IOException {
      String var6 = Util.getIndent(var5);
      boolean var7 = (var2.access_flags & 512) != 0;
      int var8 = var3.access_flags;
      String var9;
      String[] var10;
      if(this.k != null && (var9 = this.k.a(var2.name + " " + var3.getName() + " " + var3.getDesc())) != null) {
         var10 = var9.split(" ");
         var4.write(var6);
         var4.write("// $FF: renamed from: " + var10[1] + " " + this.a(var10[2], 1));
         var4.newLine();
      }

      boolean var21 = var3.a().d("Deprecated");
      List var10000 = getRuntimeAnnotations(var3.a());
      var10 = null;
      Iterator var23 = var10000.iterator();

      while(var23.hasNext()) {
         Annotation var11 = (Annotation)var23.next();
         if("java/lang/Deprecated".equals(var11.getOwner())) {
            var21 = false;
         }

         var4.write(var11.toString(var5));
         var4.newLine();
      }

      boolean var12 = (var8 & 4096) != 0 || var3.a().d("Synthetic");
      boolean var22 = Configuration.getBoolean("den") && (var8 & 16384) != 0;
      if(var12) {
         var4.write(var6);
         var4.write("// $FF: synthetic field");
         var4.newLine();
      }

      if(var21) {
         var4.write(var6);
         var4.write("@Deprecated");
         var4.newLine();
      }

      var4.write(var6);
      if(!var22) {
         for(int var13 = 0; var13 < flagsField.length; ++var13) {
            if((!var7 || !flagsFieldIgnore.contains(Integer.valueOf(flagsField[var13]))) && (var8 & flagsField[var13]) != 0) {
               var4.write(namesField[var13]);
            }
         }
      }

      Descriptor var15 = new Descriptor(var3.getDesc(), false);
      Openflower202 var18 = null;
      Signature var19;
      if(Configuration.getBoolean("dgs") && (var19 = (Signature)var3.a().b("Signature")) != null) {
         var18 = Openflower203.b(var19.a());
      }

      if(!var22) {
         if(var18 != null) {
            var4.write(Openflower203.a(var18.a));
         } else {
            var4.write(Openflower89.b(var15));
         }

         var4.write(" ");
      }

      var4.write(var3.getName());
      Element var20;
      if((var8 & 8) != 0) {
         var20 = (Element)var1.e().b(Util.concat(var3.getName(), var3.getDesc()));
      } else {
         var20 = (Element)var1.f().b(Util.concat(var3.getName(), var3.getDesc()));
      }

      if(var20 != null) {
         if(var22 && var20.a == 10) {
            Openflower133 var14;
            (var14 = (Openflower133)var20).m();
            var4.write(var14.toString(var5));
         } else {
            var4.write(" = ");
            var4.write(var20.toString(var5));
         }
      } else {
         ConstantValue var16;
         if((var8 & 16) != 0 && (var8 & 8) != 0 && (var16 = (ConstantValue)var3.a().b("ConstantValue")) != null) {
            Openflower196 var17 = var2.getConstPool().a(var16.a());
            var4.write(" = ");
            var4.write((new ConstantElement(var15, var17.a)).toString(var5));
         }
      }

      if(!var22) {
         var4.write(";");
         var4.newLine();
      }

   }

   private boolean decompileMethod(ClassNode var1, MethodInfo var2, BufferedWriter var3, int var4) throws java.io.IOException {
      Openflower74 var5 = var1.e;
      ClassInfo var6 = var1.e.getClassInfo();
      MethodDecompileResult var7 = var5.getResult(var2.getName(), var2.getDesc());
      MethodDecompileResult var8 = (MethodDecompileResult)Configuration.getObject("CURRENT_METHOD_WRAPPER");
      Configuration.put("CURRENT_METHOD_WRAPPER", var7);
      boolean var9 = (var6.access_flags & 512) != 0;
      boolean var10 = (var6.access_flags & 8192) != 0;
      boolean var11 = var2.getAttributes().d("Deprecated");
      String var12 = Util.getIndent(var4);
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      MethodSignatureHolder var16 = MethodSignatureHolder.create(var2.getDesc());
      StringWriter var17 = new StringWriter();
      BufferedWriter var18 = new BufferedWriter(var17);
      int var19;
      if(((var19 = var2.getAccess()) & 256) != 0) {
         var19 &= -2049;
      }

      if("<clinit>".equals(var2.getName())) {
         var19 &= 8;
      }

      String var20;
      if(this.k != null && (var20 = this.k.a(var6.name + " " + var2.getName() + " " + var2.getDesc())) != null) {
         String[] var39 = var20.split(" ");
         var18.write(var12);
         var18.write("// $FF: renamed from: " + var39[1] + " " + this.a(var39[2], 2));
         var18.newLine();
      }

      List var10000 = getRuntimeAnnotations(var2.getAttributes());
      var20 = null;
      Iterator var29 = var10000.iterator();

      while(var29.hasNext()) {
         Annotation var42 = (Annotation)var29.next();
         if("java/lang/Deprecated".equals(var42.getOwner())) {
            var11 = false;
         }

         var18.write(var42.toString(var4));
         var18.newLine();
      }

      boolean var43 = (var19 & 4096) != 0 || var2.getAttributes().d("Synthetic");
      boolean var30 = (var19 & 64) != 0;
      if(var43) {
         var18.write(var12);
         var18.write("// $FF: synthetic method");
         var18.newLine();
      }

      if(var30) {
         var18.write(var12);
         var18.write("// $FF: bridge method");
         var18.newLine();
      }

      if(var11) {
         var18.write(var12);
         var18.write("@Deprecated");
         var18.newLine();
      }

      var18.write(var12);

      for(int var31 = 0; var31 < flagsMethod.length; ++var31) {
         if((!var9 || !flagsMethodIgnore.contains(Integer.valueOf(flagsMethod[var31]))) && (var19 & flagsMethod[var31]) != 0) {
            var18.write(namesMethod[var31]);
         }
      }

      Openflower204 var33 = null;
      Signature var34;
      if(Configuration.getBoolean("dgs") && (var34 = (Signature)var2.getAttributes().b("Signature")) != null) {
         var33 = Openflower203.c(var34.a());
         if(var16.params.length != var33.c.size()) {
            Configuration.getLogger().writeMessage("Inconsistent generic signature in method " + var2.getName() + " " + var2.getDesc(), 3);
            var33 = null;
         }
      }

      String var35 = var2.getName();
      if("<init>".equals(var35)) {
         if(var1.a == 2) {
            var35 = "";
            var15 = true;
         } else {
            var35 = var1.name;
            var14 = true;
         }
      } else if("<clinit>".equals(var35)) {
         var35 = "";
         var13 = true;
      }

      boolean var32 = false;
      int var38 = 0;
      int var25;
      if(!var13 && !var15) {
         var43 = (var2.getAccess() & 8) == 0;
         int var23;
         List var22;
         if(var33 != null && !var33.a.isEmpty()) {
            var18.write("<");

            for(int var21 = 0; var21 < var33.a.size(); ++var21) {
               if(var21 > 0) {
                  var18.write(", ");
               }

               var18.write((String)var33.a.get(var21) + " extends ");
               var22 = (List)var33.b.get(var21);
               var18.write(Openflower203.a((Openflower205)var22.get(0)));

               for(var23 = 1; var23 < var22.size(); ++var23) {
                  var18.write(" & " + Openflower203.a((Openflower205)var22.get(var23)));
               }
            }

            var18.write("> ");
         }

         if(!var14) {
            if(var33 != null) {
               var18.write(Openflower203.a(var33.d));
            } else {
               var18.write(Openflower89.b(var16.ret));
            }

            var18.write(" ");
         }

         var18.write(var35);
         var18.write("(");
         List var44 = getParamRuntimeAnnotations(var2.getAttributes());
         var22 = var7.e;
         var23 = -1;

         for(int var36 = 0; var36 < var16.params.length; ++var36) {
            if(var22 == null || var22.get(var36) == null) {
               var23 = var36;
            }
         }

         var9 = true;
         int var24 = var43?1:0;

         for(var25 = 0; var25 < var16.params.length; ++var25) {
            if(var22 == null || var22.get(var25) == null) {
               if(!var9) {
                  var18.write(", ");
               }

               if(var44.size() > var25) {
                  List var26 = (List)var44.get(var25);

                  for(int var27 = 0; var27 < var26.size(); ++var27) {
                     Annotation var37;
                     if((var37 = (Annotation)var26.get(var27)).getStyle() == 1) {
                        var18.newLine();
                        var18.write(var37.toString(var4 + 1));
                     } else {
                        var18.write(var37.toString(0));
                     }

                     var18.write(" ");
                  }
               }

               if(var7.varProcessor.c(new IntPair(var24, 0)) == 2) {
                  var18.write("final ");
               }

               boolean var50;
               if(var33 != null) {
                  Openflower205 var54 = (Openflower205)var33.c.get(var25);
                  if(var50 = var25 == var23 && (var2.getAccess() & 128) != 0 && var54.b > 0) {
                     --var54.b;
                  }

                  var35 = Openflower203.a(var54);
                  if("<undefinedtype>".equals(var35) && Configuration.getBoolean("uto")) {
                     var35 = Openflower89.b(Descriptor.OBJECT);
                  }

                  var18.write(var35);
                  if(var50) {
                     var18.write(" ...");
                  }
               } else {
                  Descriptor var53 = var16.params[var25].copy();
                  if(var50 = var25 == var23 && (var2.getAccess() & 128) != 0 && var53.arrayDepth > 0) {
                     var53.popArray();
                  }

                  var35 = Openflower89.b(var53);
                  if("<undefinedtype>".equals(var35) && Configuration.getBoolean("uto")) {
                     var35 = Openflower89.b(Descriptor.OBJECT);
                  }

                  var18.write(var35);
                  if(var50) {
                     var18.write(" ...");
                  }
               }

               var18.write(" ");
               String var56 = var7.varProcessor.getName(new IntPair(var24, 0));
               var18.write(var56 == null?"param" + var24:var56);
               var9 = false;
               ++var38;
            }

            var24 += var16.params[var25].varSize;
         }

         var18.write(")");
         Exceptions var46 = (Exceptions)var2.getAttributes().b("Exceptions");
         if(var33 != null && !var33.e.isEmpty() || var46 != null) {
            var32 = true;
            var18.write(" throws ");

            for(int var55 = 0; var55 < var46.a().size(); ++var55) {
               if(var55 > 0) {
                  var18.write(", ");
               }

               if(var33 != null && !var33.e.isEmpty()) {
                  var18.write(Openflower203.a((Openflower205)var33.e.get(var55)));
               } else {
                  Descriptor var52 = new Descriptor(var46.a(var55, var6.getConstPool()), true);
                  var18.write(Openflower89.b(var52));
               }
            }
         }
      }

      var43 = false;
      if((var19 & 1280) != 0) {
         AnnotationDefault var45;
         if(var10 && (var45 = (AnnotationDefault)var2.getAttributes().b("AnnotationDefault")) != null) {
            var18.write(" default ");
            var18.write(var45.getAttributes().toString(var4 + 1));
         }

         var18.write(";");
         var18.newLine();
      } else {
         if(!var13 && !var15) {
            var18.write(" ");
         }

         var18.write("{");
         Openflower152 var40 = var5.getResult(var2.getName(), var2.getDesc()).result;
         StringWriter var41 = new StringWriter();
         BufferedWriter var47 = new BufferedWriter(var41);
         if(var40 != null && !var7.failed) {
            try {
               var35 = var40.getString(var4 + 1);
               boolean var48 = false;
               if(var14 && var38 == 0 && !var32 && Configuration.getBoolean("hdc")) {
                  var25 = 0;
                  Iterator var51 = var5.getResults().iterator();

                  while(var51.hasNext()) {
                     MethodDecompileResult var49 = (MethodDecompileResult)var51.next();
                     if("<init>".equals(var49.method.getName())) {
                        ++var25;
                     }
                  }

                  var48 = var25 == 1;
               }

               var43 = (var13 || var15 || var48) && var35.length() == 0;
               var47.write(var35);
            } catch (Throwable var28) {
               if(Configuration.getLogger().getShowStacktrace()) {
                  var28.printStackTrace();
               }

               Configuration.getLogger().writeMessage("Method " + var2.getName() + " " + var2.getDesc() + " couldn\'t be written.", 4);
               var7.failed = true;
            }
         }

         if(var7.failed) {
            var47.write(Util.getIndent(var4 + 1));
            var47.write("// $FF: Couldn\'t be decompiled");
            var47.newLine();
         }

         var47.flush();
         if((var35 = var41.toString()).isEmpty()) {
            var18.write("}");
         } else {
            var18.newLine();
            var18.write(var35);
            var18.write(var12 + "}");
         }

         var18.newLine();
      }

      var18.flush();
      if(!var43) {
         var3.write(var17.toString());
      }

      Configuration.put("CURRENT_METHOD_WRAPPER", var8);
      if(var43) {
         return false;
      } else {
         return true;
      }
   }

   private static List getRuntimeAnnotations(DualArrayList var0) {
      String[] var1 = new String[]{"RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"};
      ArrayList var2 = new ArrayList();
      String[] var5 = var1;
      int var4 = var1.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         String var6 = var5[var3];
         Annotations var7;
         if((var7 = (Annotations)var0.b(var6)) != null) {
            var2.addAll(var7.getAttributes());
         }
      }

      return var2;
   }

   private static List getParamRuntimeAnnotations(DualArrayList var0) {
      String[] var1 = new String[]{"RuntimeVisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations"};
      ArrayList var2 = new ArrayList();
      String[] var5 = var1;
      int var4 = var1.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         String var9 = var5[var3];
         ParameterAnnotations var10;
         if((var10 = (ParameterAnnotations)var0.b(var9)) != null) {
            for(int var6 = 0; var6 < var10.a().size(); ++var6) {
               Object var7 = new ArrayList();
               boolean var8;
               if(!(var8 = var2.size() <= var6)) {
                  var7 = (List)var2.get(var6);
               }

               ((List)var7).addAll((Collection)var10.a().get(var6));
               if(var8) {
                  var2.add(var7);
               } else {
                  var2.set(var6, var7);
               }
            }
         }
      }

      return var2;
   }

   private String a(String var1, int var2) {
      switch(var2) {
      case 0:
         return Openflower89.getSourceName(var1);
      case 1:
         return a(Openflower198.a(var1).e);
      case 2:
      default:
         MethodSignatureHolder var7 = MethodSignatureHolder.create(var1);
         StringBuilder var8 = new StringBuilder("(");
         boolean var9 = true;
         Descriptor[] var6 = var7.params;
         int var5 = var7.params.length;

         for(int var4 = 0; var4 < var5; ++var4) {
            Descriptor var3 = var6[var4];
            if(var9) {
               var9 = false;
            } else {
               var8.append(", ");
            }

            var8.append(a(var3));
         }

         var8.append(") ");
         var8.append(a(var7.ret));
         return var8.toString();
      }
   }

   private static String a(Descriptor var0) {
      String var1 = Openflower89.a(var0, false);
      if("<undefinedtype>".equals(var1) && Configuration.getBoolean("uto")) {
         var1 = Openflower89.a(Descriptor.OBJECT, false);
      }

      return var1;
   }
}
