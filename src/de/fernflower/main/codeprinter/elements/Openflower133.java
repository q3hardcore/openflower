package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassDecompiler;
import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower89;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.Util;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Openflower133 extends Element {

   private Openflower131 c;
   private Descriptor d;
   private List e = new ArrayList();
   private List f = new ArrayList();
   private boolean g;
   private boolean h;
   private boolean i;


   public Openflower133(Descriptor var1, LIFOQueue var2, int var3) {
      this.a = 10;
      this.d = var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.e.add(0, (Element)var2.pop());
      }

      this.n();
   }

   public Openflower133(Descriptor var1, List var2) {
      this.a = 10;
      this.d = var1;
      this.e = var2;
      this.n();
   }

   private void n() {
      this.h = false;
      ClassNode var1;
      if(this.d.type == 8 && this.d.arrayDepth == 0 && (var1 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.d.stringValue)) != null && var1.a == 2) {
         this.h = true;
      }

   }

   public final Descriptor getDescriptor() {
      return this.h?((ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.d.stringValue)).desc:this.d;
   }

   public final Openflower158 e() {
      Openflower158 var1 = new Openflower158();
      if(this.d.arrayDepth != 0) {
         Iterator var3 = this.e.iterator();

         while(var3.hasNext()) {
            Element var2 = (Element)var3.next();
            var1.b(var2, Descriptor.BYTE_NO_SIGN);
            var1.a(var2, Descriptor.INT);
         }

         if(this.d.arrayDepth == 1) {
            Descriptor var5;
            (var5 = this.d.copy()).popArray();
            Iterator var4 = this.f.iterator();

            while(var4.hasNext()) {
               Element var6 = (Element)var4.next();
               var1.b(var6, Descriptor.getFamily(var5.r));
               var1.a(var6, var5);
            }
         }
      } else if(this.c != null) {
         return this.c.e();
      }

      return var1;
   }

   public final List b() {
      ArrayList var1 = new ArrayList();
      if(this.d.arrayDepth == 0) {
         if(this.c != null) {
            var1.addAll(this.c.g());
         }
      } else {
         var1.addAll(this.e);
         var1.addAll(this.f);
      }

      return var1;
   }

   public final Element copy() {
      ArrayList var1 = new ArrayList();
      Iterator var3 = this.e.iterator();

      while(var3.hasNext()) {
         Element var2 = (Element)var3.next();
         var1.add(var2.copy());
      }

      Openflower133 var4;
      (var4 = new Openflower133(this.d, var1)).c = this.c == null?null:(Openflower131)this.c.copy();
      var4.f = this.f;
      var4.g = this.g;
      var4.h = this.h;
      var4.i = this.i;
      return var4;
   }

   public final int c_() {
      return 1;
   }

   public final String toString(int var1) {
      StringBuffer var2 = new StringBuffer();
      ClassNode var5;
      String var13;
      int var21;
      if(this.h) {
         ClassNode var3 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.d.stringValue);
         var2.append("(");
         if(this.c != null) {
            Openflower131 var4 = var3.g;
            var5 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var4.i());
            List var6 = null;
            if(var5 != null) {
               if(var5.e != null) {
                  var6 = var5.e.getResult("<init>", var4.q()).e;
               } else if(var5.a == 1 && (var5.access_flags & 8) == 0 && !this.c.g().isEmpty()) {
                  (var6 = new ArrayList((Collection)Collections.nCopies(this.c.g().size(), (Object)null))).set(0, new IntPair(-1, 0));
               }
            }

            boolean var7 = true;

            for(int var8 = 0; var8 < var4.g().size(); ++var8) {
               if(var6 == null || ((List)var6).get(var8) == null) {
                  if(!var7) {
                     var2.append(", ");
                  }

                  Element var15;
                  if((var15 = (Element)var4.g().get(var8)).a == 12 && (var21 = ((Openflower135)var15).getIndex()) > 0 && var21 <= this.c.g().size()) {
                     var15 = (Element)this.c.g().get(var21 - 1);
                  }

                  StringBuilder var26 = new StringBuilder();
                  Openflower89.a(var15, var4.h().params[var8], var26, var1, true);
                  var2.append(var26);
                  var7 = false;
               }
            }
         }

         if(!this.i) {
            var13 = null;
            if(this.c != null) {
               var13 = a(var3.desc.stringValue, this.c.g(), var1);
            }

            String var18 = Openflower89.b(var3.desc);
            if(var13 != null) {
               ClassNode var20;
               if((var20 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var3.desc.stringValue)) != null) {
                  var18 = var20.name;
               } else {
                  var18 = var18.substring(var18.lastIndexOf(46) + 1);
               }
            }

            var2.insert(0, "new " + var18);
            if(var13 != null) {
               var2.insert(0, var13 + ".");
            }
         }

         var2.append(")");
         StringWriter var14 = new StringWriter();
         BufferedWriter var24 = new BufferedWriter(var14);
         ClassDecompiler var25 = new ClassDecompiler();

         try {
            var25.decompile(var3, var24, var1);
            var24.flush();
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         var2.append(var14.toString());
      } else {
         Descriptor var10;
         int var17;
         StringBuilder var23;
         if(this.g) {
            (var10 = this.d.copy()).popArray();
            var2.append("{");

            for(var17 = 0; var17 < this.f.size(); ++var17) {
               if(var17 > 0) {
                  var2.append(", ");
               }

               var23 = new StringBuilder();
               Openflower89.a((Element)this.f.get(var17), var10, var23, var1, false);
               var2.append(var23);
            }

            var2.append("}");
         } else if(this.d.arrayDepth == 0) {
            if(this.c != null) {
               List var11 = this.c.g();
               ClassNode var19 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.c.i());
               List var28 = null;
               if(var19 != null) {
                  if(var19.e != null) {
                     var28 = var19.e.getResult("<init>", this.c.q()).e;
                  } else if(var19.a == 1 && (var19.access_flags & 8) == 0 && !this.c.g().isEmpty()) {
                     (var28 = new ArrayList((Collection)Collections.nCopies(var11.size(), (Object)null))).set(0, new IntPair(-1, 0));
                  }
               }

               var2.append("(");
               boolean var22 = true;

               for(var21 = 0; var21 < var11.size(); ++var21) {
                  if(var28 == null || ((List)var28).get(var21) == null) {
                     if(!var22) {
                        var2.append(", ");
                     }

                     StringBuilder var27 = new StringBuilder();
                     Openflower89.a((Element)var11.get(var21), this.c.h().params[var21], var27, var1, true);
                     var2.append(var27);
                     var22 = false;
                  }
               }

               var2.append(")");
            }

            if(!this.i) {
               String var12 = null;
               if(this.c != null) {
                  var12 = a(this.d.stringValue, this.c.g(), var1);
               }

               var13 = Openflower89.a(this.d);
               if(var12 != null) {
                  if((var5 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.d.stringValue)) != null) {
                     var13 = var5.name;
                  } else {
                     var13 = var13.substring(var13.lastIndexOf(46) + 1);
                  }
               }

               var2.insert(0, "new " + var13);
               if(var12 != null) {
                  var2.insert(0, var12 + ".");
               }
            }
         } else {
            var2.append("new " + Openflower89.a(this.d));
            int var16;
            if(this.f.isEmpty()) {
               for(var16 = 0; var16 < this.d.arrayDepth; ++var16) {
                  var2.append("[" + (var16 < this.e.size()?((Element)this.e.get(var16)).toString(var1):"") + "]");
               }
            } else {
               for(var16 = 0; var16 < this.d.arrayDepth; ++var16) {
                  var2.append("[]");
               }

               (var10 = this.d.copy()).popArray();
               var2.append("{");

               for(var17 = 0; var17 < this.f.size(); ++var17) {
                  if(var17 > 0) {
                     var2.append(", ");
                  }

                  var23 = new StringBuilder();
                  Openflower89.a((Element)this.f.get(var17), var10, var23, var1, false);
                  var2.append(var23);
               }

               var2.append("}");
            }
         }
      }

      return var2.toString();
   }

   private static String a(String var0, List var1, int var2) {
      ClassNode var5;
      if((var5 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var0)) != null && var5.a != 0 && (var5.access_flags & 8) == 0 && !var1.isEmpty()) {
         Element var6;
         boolean var7;
         label18: {
            var6 = (Element)var1.get(0);
            var7 = false;
            if(var6.a == 12) {
               Openflower135 var3 = (Openflower135)var6;
               ClassInfo var4 = ((ClassNode)Configuration.getObject("CURRENT_CLASSNODE")).classInfo;
               String var8 = (String)var3.getVarProcessor().getTypes().get(new IntPair(var3));
               if(var4.name.equals(var8)) {
                  break label18;
               }
            }

            var7 = true;
         }

         if(var7) {
            return var6.toString(var2);
         }
      }

      return null;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower133) {
         Openflower133 var2 = (Openflower133)var1;
         return Util.safeEquals((Object)this.d, (Object)var2.d) && Util.safeEquals(this.e, var2.e) && Util.safeEquals((Object)this.c, (Object)var2.c) && this.g == var2.g && Util.safeEquals(this.f, var2.f);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.c) {
         this.c = (Openflower131)var2;
      }

      if(this.c != null) {
         this.c.a(var1, var2);
      }

      int var3;
      for(var3 = 0; var3 < this.e.size(); ++var3) {
         if(var1 == this.e.get(var3)) {
            this.e.set(var3, var2);
         }
      }

      for(var3 = 0; var3 < this.f.size(); ++var3) {
         if(var1 == this.f.get(var3)) {
            this.f.set(var3, var2);
         }
      }

   }

   public final Openflower131 g() {
      return this.c;
   }

   public final void a(Openflower131 var1) {
      this.c = var1;
   }

   public final List h() {
      return this.e;
   }

   public final Descriptor i() {
      return this.d;
   }

   public final List j() {
      return this.f;
   }

   public final void a(List var1) {
      this.f = var1;
   }

   public final void k() {
      this.g = true;
   }

   public final boolean l() {
      return this.h;
   }

   public final void m() {
      this.i = true;
   }
}
