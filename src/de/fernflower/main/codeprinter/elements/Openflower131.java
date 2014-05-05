package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.ImportManager;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower158;
import de.fernflower.main.Openflower194;
import de.fernflower.main.Openflower89;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LIFOQueue;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower131 extends Element {

   private String c;
   private String d;
   private boolean e;
   private int f = 1;
   private Element g;
   private MethodSignatureHolder h;
   private String i;
   private int j = 2;
   private List k = new ArrayList();


   public Openflower131() {
      this.a = 8;
   }

   public Openflower131(int var1, Openflower194 var2, LIFOQueue var3) {
      this.a = 8;
      this.c = var2.b;
      this.d = var2.a;
      switch(var1) {
      case 182:
         this.j = 2;
         break;
      case 183:
         this.j = 1;
         break;
      case 184:
         this.j = 3;
         break;
      case 185:
         this.j = 4;
      }

      if("<init>".equals(this.c)) {
         this.f = 2;
      } else if("<clinit>".equals(this.c)) {
         this.f = 3;
      }

      this.i = var2.c;
      this.h = MethodSignatureHolder.create(var2.c);

      for(int var4 = 0; var4 < this.h.params.length; ++var4) {
         this.k.add(0, (Element)var3.pop());
      }

      if(var1 == 184) {
         this.e = true;
      } else {
         this.g = (Element)var3.pop();
      }
   }

   private Openflower131(Openflower131 var1) {
      this.a = 8;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      if(this.g != null) {
         this.g = this.g.copy();
      }

      this.j = var1.j;
      this.i = var1.i;
      this.h = var1.h;
      this.k = new ArrayList(var1.k);

      for(int var2 = 0; var2 < this.k.size(); ++var2) {
         this.k.set(var2, ((Element)this.k.get(var2)).copy());
      }

   }

   public final Descriptor getDescriptor() {
      return this.h.ret;
   }

   public final Openflower158 e() {
      Openflower158 var1 = new Openflower158();

      for(int var2 = 0; var2 < this.k.size(); ++var2) {
         Element var3 = (Element)this.k.get(var2);
         Descriptor var4 = this.h.params[var2];
         var1.b(var3, Descriptor.getFamily(var4.r));
         var1.a(var3, var4);
      }

      return var1;
   }

   public final List b() {
      ArrayList var1 = new ArrayList();
      if(this.g != null) {
         var1.add(this.g);
      }

      var1.addAll(this.k);
      return var1;
   }

   public final Element copy() {
      return new Openflower131(this);
   }

   public final String toString(int var1) {
      StringBuilder var2 = new StringBuilder("");
      String var3 = null;
      boolean var4 = false;
      IntPair var6;
      ImportManager var10001;
      String var10002;
      if(this.e) {
         ClassNode var5;
         if((var5 = (ClassNode)Configuration.getObject("CURRENT_CLASSNODE")) == null || !this.d.equals(var5.classInfo.name)) {
            var10001 = Configuration.getImportManager();
            var10002 = Openflower89.getSourceName(this.d);
            var6 = null;
            var2.append(var10001.getRelativeName(var10002, true));
         }
      } else {
         if(this.g != null && this.g.a == 12) {
            Openflower135 var10 = (Openflower135)this.g;
            var6 = new IntPair(var10);
            VarProcessor var7;
            MethodDecompileResult var8;
            if((var7 = var10.getVarProcessor()) == null && (var8 = (MethodDecompileResult)Configuration.getObject("CURRENT_METHOD_WRAPPER")) != null) {
               var7 = var8.varProcessor;
            }

            String var19 = null;
            if(var7 != null) {
               var19 = (String)var7.getTypes().get(var6);
            }

            if(var19 != null) {
               var4 = true;
               if(this.j == 1 && !this.d.equals(var19)) {
                  var3 = var19;
               }
            }
         }

         if(this.f == 1) {
            if(var3 != null) {
               ClassInfo var12 = ((ClassNode)Configuration.getObject("CURRENT_CLASSNODE")).classInfo;
               if(!var3.equals(var12.name)) {
                  var10001 = Configuration.getImportManager();
                  var10002 = Openflower89.getSourceName(var3);
                  var6 = null;
                  var2.append(var10001.getRelativeName(var10002, true));
                  var2.append(".");
               }

               var2.append("super");
            } else {
               String var11 = this.g.toString(var1);
               Descriptor var15 = this.g.getDescriptor();
               Descriptor var16 = new Descriptor(8, 0, this.d);
               if(var15.equals((Object)Descriptor.OBJECT) && !var16.equals((Object)var15)) {
                  var2.append("((" + Openflower89.b(var16) + ")");
                  if(this.g.c_() >= Openflower129.g()) {
                     var11 = "(" + var11 + ")";
                  }

                  var2.append(var11 + ")");
               } else if(this.g.c_() > this.c_()) {
                  var2.append("(" + var11 + ")");
               } else {
                  var2.append(var11);
               }
            }
         }
      }

      switch(this.f) {
      case 1:
         if("<VAR_NAMELESS_ENCLOSURE>".equals(var2.toString())) {
            var2 = new StringBuilder("");
         }

         if(var2.length() > 0) {
            var2.append(".");
         }

         var2.append(this.c + "(");
         break;
      case 2:
         if(var3 != null) {
            var2.append("super(");
         } else if(var4) {
            var2.append("this(");
         } else {
            var2.append(this.g.toString(var1));
            var2.append(".<init>(");
         }
         break;
      case 3:
         throw new RuntimeException("Explicite invocation of <clinit>");
      }

      List var14 = null;
      ClassNode var13;
      if(this.f == 2 && (var13 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.d)) != null) {
         if(var13.e != null) {
            var14 = var13.e.getResult("<init>", this.i).e;
         } else if(var13.a == 1 && (var13.access_flags & 8) == 0) {
            (var14 = new ArrayList((Collection)Collections.nCopies(this.k.size(), (Object)null))).set(0, new IntPair(-1, 0));
         }
      }

      Set var17 = this.r();
      boolean var18 = true;

      for(int var20 = 0; var20 < this.k.size(); ++var20) {
         if(var14 == null || ((List)var14).get(var20) == null) {
            if(!var18) {
               var2.append(", ");
            }

            StringBuilder var9 = new StringBuilder();
            Openflower89.a((Element)this.k.get(var20), this.h.params[var20], var9, var1, true, var17.contains(Integer.valueOf(var20)));
            var2.append(var9);
            var18 = false;
         }
      }

      var2.append(")");
      return var2.toString();
   }

   private Set r() {
      HashSet var1 = new HashSet();
      ClassInfo var2;
      if((var2 = Configuration.getDispatcher().getClass(this.d)) != null) {
         ArrayList var3 = new ArrayList();
         Iterator var4 = var2.getMethods().iterator();

         MethodSignatureHolder var5;
         int var8;
         while(var4.hasNext()) {
            MethodInfo var7 = (MethodInfo)var4.next();
            if(this.c.equals(var7.getName()) && (var5 = MethodSignatureHolder.create(var7.getDesc())).params.length == this.h.params.length) {
               boolean var6 = true;

               for(var8 = 0; var8 < var5.params.length; ++var8) {
                  if(var5.params[var8].r != this.h.params[var8].r) {
                     var6 = false;
                     break;
                  }
               }

               if(var6) {
                  var3.add(var5);
               }
            }
         }

         if(var3.size() > 1) {
            for(var8 = 0; var8 < this.h.params.length; ++var8) {
               Descriptor var9 = this.h.params[var8];
               Iterator var10 = var3.iterator();

               while(var10.hasNext()) {
                  var5 = (MethodSignatureHolder)var10.next();
                  if(!var9.equals((Object)var5.params[var8])) {
                     var1.add(Integer.valueOf(var8));
                     break;
                  }
               }
            }
         }
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower131) {
         Openflower131 var2 = (Openflower131)var1;
         return Util.safeEquals((Object)this.c, (Object)var2.c) && Util.safeEquals((Object)this.d, (Object)var2.d) && this.e == var2.e && Util.safeEquals((Object)this.g, (Object)var2.g) && Util.safeEquals((Object)this.h, (Object)var2.h) && this.f == var2.f && Util.safeEquals(this.k, var2.k);
      } else {
         return false;
      }
   }

   public final void a(Element var1, Element var2) {
      if(var1 == this.g) {
         this.g = var2;
      }

      for(int var3 = 0; var3 < this.k.size(); ++var3) {
         if(var1 == this.k.get(var3)) {
            this.k.set(var3, var2);
         }
      }

   }

   public final List g() {
      return this.k;
   }

   public final void a(List var1) {
      this.k = var1;
   }

   public final MethodSignatureHolder h() {
      return this.h;
   }

   public final void a(MethodSignatureHolder var1) {
      this.h = var1;
   }

   public final String i() {
      return this.d;
   }

   public final void a(String var1) {
      this.d = var1;
   }

   public final int j() {
      return this.f;
   }

   public final void k() {
      this.f = 2;
   }

   public final Element l() {
      return this.g;
   }

   public final void a(Element var1) {
      this.g = var1;
   }

   public final boolean m() {
      return this.e;
   }

   public final void n() {
      this.e = true;
   }

   public final String o() {
      return this.c;
   }

   public final void b(String var1) {
      this.c = var1;
   }

   public final String q() {
      return this.i;
   }

   public final void c(String var1) {
      this.i = var1;
   }
}
