package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LocalVarNamer;
import de.fernflower.main.util.MethodSignatureHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public final class Openflower159 {

   private HashMap a = new HashMap();
   private HashMap b = new HashMap();
   private HashSet c = new HashSet();
   private VarProcessor varProcessor;


   public Openflower159(Openflower154_SomeSorter var1, MethodInfo var2, VarProcessor var3) {
      this.varProcessor = var3;
      LocalVarNamer var4 = Configuration.getLocalVarNamer();
      boolean var5 = (var2.getAccess() & 8) == 0;
      MethodSignatureHolder var9 = MethodSignatureHolder.create(var2.getDesc());
      byte var6 = 0;
      if(var5) {
         var6 = 1;
      }

      int var14 = var6 + var9.params.length;
      int var7 = 0;

      for(int var8 = 0; var8 < var14; ++var8) {
         this.c.add(Integer.valueOf(var7));
         var3.setName(new IntPair(var7, 0), var4.getName(var7));
         if(var5) {
            if(var8 == 0) {
               ++var7;
            } else {
               var7 += var9.params[var8 - 1].varSize;
            }
         } else {
            var7 += var9.params[var8].varSize;
         }
      }

      if(var5) {
         ClassInfo var15 = (ClassInfo)Configuration.getObject("CURRENT_CLASS");
         var3.getTypes().put(new IntPair(0, 0), var15.name);
         var3.setName(new IntPair(0, 0), "this");
         var4.setUsed("this");
      }

      LinkedList var16;
      (var16 = new LinkedList()).add(var1);

      Openflower154_SomeSorter var10;
      for(; !var16.isEmpty(); var16.addAll(var10.t())) {
         var10 = (Openflower154_SomeSorter)var16.removeFirst();
         List var11 = null;
         if(var10.c == 12) {
            var11 = ((Openflower147)var10).g();
         } else if(var10.c == 7) {
            var11 = ((Openflower148)var10).e();
         }

         if(var11 != null) {
            Iterator var13 = var11.iterator();

            while(var13.hasNext()) {
               Openflower135 var12 = (Openflower135)var13.next();
               this.c.add(Integer.valueOf(var12.getIndex()));
               var3.setName(new IntPair(var12), var4.getName(var12.getIndex()));
               var12.setDeclaration();
            }
         }
      }

      this.a(var1);
   }

   public final void a() {
      LocalVarNamer var1 = Configuration.getLocalVarNamer();
      Iterator var2 = this.a.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3;
         Openflower154_SomeSorter var4 = (Openflower154_SomeSorter)(var3 = (Entry)var2.next()).getValue();
         Integer var11 = (Integer)var3.getKey();
         if(!this.c.contains(var11)) {
            this.varProcessor.setName(new IntPair(var11.intValue(), 0), var1.getName(var11.intValue()));
            Openflower149_LoopPrinter var5;
            Openflower154_SomeSorter var6;
            if(var4.c == 5 && (var5 = (Openflower149_LoopPrinter)var4).k() == 3) {
               if(var5.j() != null && a(var5.j(), var11)) {
                  continue;
               }

               Iterator var7 = a(Arrays.asList(new Element[]{var5.h(), var5.i()})).iterator();

               while(var7.hasNext()) {
                  Openflower135 var10000 = (Openflower135)var7.next();
                  var6 = null;
                  if(var10000.getIndex() == var11.intValue()) {
                     var4 = var4.B();
                     break;
                  }
               }
            }

            Integer var19 = var11;
            Openflower159 var13 = this;
            LinkedList var8;
            (var8 = new LinkedList()).add(var4);

            Openflower154_SomeSorter var12;
            label89:
            while(true) {
               if(var8.isEmpty()) {
                  var12 = null;
                  break;
               }

               var6 = (Openflower154_SomeSorter)var8.remove(0);
               if(var8.isEmpty() || ((HashSet)var13.b.get(var6.id)).contains(var19)) {
                  if(var6.needsLabel() && !var8.isEmpty()) {
                     var12 = var6;
                     break;
                  }

                  if(var6.E() != null) {
                     var12 = var6;
                     break;
                  }

                  var8.clear();
                  switch(var6.c) {
                  case 2:
                  case 6:
                  case 10:
                  case 13:
                     var8.add(var6.s());
                     break;
                  case 15:
                     var8.addAll(0, var6.t());
                     break;
                  default:
                     var12 = var6;
                     break label89;
                  }
               }
            }

            Openflower154_SomeSorter var17 = var12;
            List var15;
            if(var12 == null) {
               var15 = var4.D();
            } else if(var17.E() == null) {
               var15 = var17.D();
            } else {
               var15 = var17.E();
            }

            boolean var18 = false;
            int var20 = 0;

            for(Iterator var21 = var15.iterator(); var21.hasNext(); ++var20) {
               Element var14;
               if(a(var14 = (Element)var21.next(), var11)) {
                  var18 = true;
                  break;
               }

               boolean var9 = false;
               Iterator var10 = var14.a(true).iterator();

               while(var10.hasNext()) {
                  if((var14 = (Element)var10.next()).a == 12 && ((Openflower135)var14).getIndex() == var11.intValue()) {
                     var9 = true;
                     break;
                  }
               }

               if(var9) {
                  break;
               }
            }

            if(!var18) {
               Openflower135 var16;
               (var16 = new Openflower135(var11.intValue(), this.varProcessor.a(new IntPair(var11.intValue(), 0)), this.varProcessor)).setDeclaration();
               var15.add(var20, var16);
            }
         }
      }

   }

   private Set a(Openflower154_SomeSorter var1) {
      HashMap var2 = new HashMap();
      List var8;
      if(var1.E() == null) {
         ArrayList var3 = new ArrayList();
         ArrayList var4 = new ArrayList();
         Iterator var6 = var1.d().iterator();

         while(var6.hasNext()) {
            Object var5;
            if((var5 = var6.next()) instanceof Openflower154_SomeSorter) {
               Openflower154_SomeSorter var7 = (Openflower154_SomeSorter)var5;
               var3.addAll(this.a(var7));
               if(var7.c == 5) {
                  Openflower149_LoopPrinter var12;
                  if((var12 = (Openflower149_LoopPrinter)var7).k() != 3 && var12.k() != 0) {
                     var4.add(var12.h());
                  }
               } else {
                  Openflower147 var14;
                  if(var7.c == 12 && (var14 = (Openflower147)var7).a_() && var14.f() != null) {
                     var4.add(var14.f());
                  }
               }
            } else if(var5 instanceof Element) {
               var4.add((Element)var5);
            }
         }

         Integer var16;
         Integer var13;
         for(var6 = var3.iterator(); var6.hasNext(); var2.put(var13, new Integer(var16.intValue() + 1))) {
            var13 = (Integer)var6.next();
            if((var16 = (Integer)var2.get(var13)) == null) {
               var16 = new Integer(0);
            }
         }

         var8 = a((List)var4);
      } else {
         var8 = a(var1.E());
      }

      Iterator var10 = var8.iterator();

      while(var10.hasNext()) {
         Openflower135 var9 = (Openflower135)var10.next();
         var2.put(new Integer(var9.getIndex()), new Integer(2));
      }

      HashSet var11 = new HashSet((Collection)var2.keySet());
      var10 = var2.entrySet().iterator();

      while(var10.hasNext()) {
         Entry var15;
         if(((Integer)(var15 = (Entry)var10.next()).getValue()).intValue() > 1) {
            this.a.put((Integer)var15.getKey(), var1);
         }
      }

      this.b.put(var1.id, var11);
      return var11;
   }

   private static List a(List var0) {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var0.iterator();

      Element var4;
      while(var3.hasNext()) {
         var4 = (Element)var3.next();
         var2.addAll(var4.a(true));
         var2.add(var4);
      }

      var3 = var2.iterator();

      while(var3.hasNext()) {
         if((var4 = (Element)var3.next()).a == 12) {
            var1.add((Openflower135)var4);
         }
      }

      return var1;
   }

   private static boolean a(Element var0, Integer var1) {
      Openflower135 var2;
      if(var0.a == 2 && (var0 = ((Openflower124)var0).g()).a == 12 && (var2 = (Openflower135)var0).getIndex() == var1.intValue()) {
         var2.setDeclaration();
         return true;
      } else {
         return false;
      }
   }
}
