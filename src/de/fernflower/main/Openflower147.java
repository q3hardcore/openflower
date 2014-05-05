package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower85;
import de.fernflower.main.Openflower89;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower147 extends Openflower154_SomeSorter {

   private Openflower154_SomeSorter a;
   private boolean b;
   private Openflower135 k;
   private List l;


   private Openflower147() {
      this.l = new ArrayList();
      this.c = 12;
   }

   private Openflower147(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      this();
      this.child = var1;
      this.e.a((Object)var1, (Object)var1.id);
      this.a = var2;
      this.e.a((Object)var2, (Object)var2.id);
      List var3;
      Openflower105 var4;
      if(!(var3 = var1.c(1073741824)).isEmpty() && (var4 = (Openflower105)var3.get(0)).a() == 1) {
         this.i = var4.c();
      }

      this.l.add(new Openflower135(Configuration.getIDManager().getNext(2), new Descriptor(8, 0, "java/lang/Throwable"), (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR")));
   }

   public static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      if(var0.u() != 2) {
         return null;
      } else {
         HashSet var1;
         if((var1 = Openflower85.a(var0)).size() != 1) {
            return null;
         } else {
            Iterator var3 = var0.c(2).iterator();

            Openflower154_SomeSorter var4;
            do {
               List var5;
               do {
                  do {
                     Openflower105 var2;
                     do {
                        do {
                           if(!var3.hasNext()) {
                              return null;
                           }

                           var4 = (var2 = (Openflower105)var3.next()).c();
                        } while(var2.d() != null);
                     } while(!var1.contains(var4));
                  } while(var4.u() != 2);
               } while(!(var5 = var4.c(1073741824)).isEmpty() && ((Openflower105)var5.get(0)).a() == 1);

               if(var0.x() || var4.x()) {
                  return null;
               }
            } while(!Openflower85.a(Arrays.asList(new Openflower154_SomeSorter[]{var0, var4})));

            return new Openflower147(var0, var4);
         }
      }
   }

   public final String getString(int var1) {
      String var2 = Util.getIndent(var1);
      String var3 = null;
      StringBuffer var4;
      (var4 = new StringBuffer()).append(Openflower89.a(this.h, var1));
      boolean var5;
      if(var5 = this.needsLabel()) {
         var4.append(var2 + "label" + this.id + ":\r\n");
      }

      List var6 = this.child.c(1073741824);
      if(this.child.c == 7 && this.child.h.isEmpty() && this.b && !var5 && !this.child.needsLabel() && (var6.isEmpty() || !((Openflower105)var6.get(0)).d)) {
         String var7 = (var7 = Openflower89.printLoopBody(this.child, var1, true)).substring(0, var7.length() - 2);
         var4.append(var7);
      } else {
         var4.append(var2 + "try {\r\n");
         var4.append(Openflower89.printLoopBody(this.child, var1 + 1, true));
         var4.append(var2 + "}");
      }

      var4.append((this.b?" finally":" catch (" + ((Openflower135)this.l.get(0)).toString(var1) + ")") + " {\r\n");
      if(this.k != null) {
         var3 = Util.getIndent(var1 + 1);
         var4.append(var3 + "if(" + this.k.toString(var1) + ") {\r\n");
      }

      var4.append(Openflower89.printLoopBody(this.a, var1 + 1 + (this.k != null?1:0), true));
      if(this.k != null) {
         var4.append(var3 + "}\r\n");
      }

      var4.append(var2 + "}\r\n");
      return var4.toString();
   }

   public final void a(Openflower154_SomeSorter var1, Openflower154_SomeSorter var2) {
      if(this.a == var1) {
         this.a = var2;
      }

      super.a(var1, var2);
   }

   public final Openflower154_SomeSorter a() {
      Openflower147 var1;
      (var1 = new Openflower147()).b = this.b;
      if(this.k != null) {
         var1.k = new Openflower135(Configuration.getIDManager().getNext(2), Descriptor.INT, (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR"));
      }

      if(!this.l.isEmpty()) {
         this.l.add(new Openflower135(Configuration.getIDManager().getNext(2), new Descriptor(8, 0, "java/lang/Throwable"), (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR")));
      }

      return var1;
   }

   public final void b() {
      this.child = (Openflower154_SomeSorter)this.e.get(0);
      this.a = (Openflower154_SomeSorter)this.e.get(1);
   }

   public final Openflower154_SomeSorter c() {
      return this.a;
   }

   public final boolean a_() {
      return this.b;
   }

   public final void e() {
      this.b = true;
   }

   public final Openflower135 f() {
      return this.k;
   }

   public final void a(Openflower135 var1) {
      this.k = var1;
   }

   public final List g() {
      return this.l;
   }
}
