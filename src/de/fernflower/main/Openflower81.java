package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LocalVarNamer;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class Openflower81 {

   private boolean a;
   private HashMap b = new HashMap();


   public final void a(ClassNode var1) {
      if(!var1.subClasses.isEmpty()) {
         this.a = Configuration.getBoolean("nns");
         this.b(var1);
         this.c(var1);
      }
   }

   private void b(ClassNode var1) {
      Iterator var3 = var1.subClasses.iterator();

      while(var3.hasNext()) {
         ClassNode var2 = (ClassNode)var3.next();
         this.b(var2);
      }

      var3 = var1.e.getResults().iterator();

      while(var3.hasNext()) {
         MethodDecompileResult var4 = (MethodDecompileResult)var3.next();
         this.a(var1, var4);
      }

   }

   private void a(ClassNode var1, MethodDecompileResult var2) {
      byte var3 = 1;
      if(var2.result != null) {
         Openflower137 var4 = var2.a();
         int var5;
         if((((var5 = var2.method.getAccess()) & 4096) != 0 || var2.method.getAttributes().d("Synthetic") || this.a) && (var5 & 8) != 0 && var4.a.size() == 2) {
            Element var12;
            if(var4.b.e.size() == 1) {
               var12 = (Element)var4.b.e.get(0);
               int var6 = MethodSignatureHolder.create(var2.method.getDesc()).params.length;
               Element var7 = var12;
               Openflower126 var16;
               if(var12.a == 4 && (var16 = (Openflower126)var12).f() == 0 && var16.g() != null) {
                  var7 = var16.g();
               }

               switch(var7.a) {
               case 2:
                  Openflower124 var8;
                  if((var8 = (Openflower124)var7).g().a == 5 && var8.h().a == 12) {
                     Openflower128 var10 = (Openflower128)var8.g();
                     if((var6 == 2 && !var10.j() || var6 == 1 && var10.j()) && var10.g().equals(var1.classInfo.name) && (var10.j() || var10.i().a == 12 && ((Openflower135)var10.i()).getIndex() == 0) && ((Openflower135)var8.h()).getIndex() == var6 - 1) {
                        var3 = 3;
                     }
                  }
                  break;
               case 5:
                  Openflower128 var14 = (Openflower128)var7;
                  if((var6 == 1 && !var14.j() || var6 == 0 && var14.j()) && var14.g().equals(var1.classInfo.name) && (var14.j() || var14.i().a == 12 && ((Openflower135)var14.i()).getIndex() == 0)) {
                     var3 = 2;
                  }
                  break;
               case 8:
                  var3 = 4;
                  break;
               case 12:
                  if(var6 == 1 && ((Openflower135)var7).getIndex() != 0) {
                     var3 = 2;
                  }
               }

               if(var3 == 4) {
                  var3 = 1;
                  Openflower131 var17;
                  if((var17 = (Openflower131)var7).m() && var17.g().size() == var6 || !var17.m() && var17.l().a == 12 && ((Openflower135)var17.l()).getIndex() == 0 && var17.g().size() == var6 - 1) {
                     boolean var20 = true;

                     for(int var11 = 0; var11 < var17.g().size(); ++var11) {
                        Element var9;
                        if((var9 = (Element)var17.g().get(var11)).a != 12 || ((Openflower135)var9).getIndex() != var11 + (var17.m()?0:1)) {
                           var20 = false;
                           break;
                        }
                     }

                     if(var20) {
                        var3 = 4;
                     }
                  }
               }
            } else if(var4.b.e.size() == 2) {
               var12 = (Element)var4.b.e.get(0);
               Element var13 = (Element)var4.b.e.get(1);
               if(var12.a == 2 && var13.a == 4) {
                  int var19 = MethodSignatureHolder.create(var2.method.getDesc()).params.length;
                  Openflower124 var18;
                  if((var18 = (Openflower124)var12).g().a == 5 && var18.h().a == 12) {
                     Openflower128 var21 = (Openflower128)var18.g();
                     Openflower126 var15;
                     if((var19 == 2 && !var21.j() || var19 == 1 && var21.j()) && var21.g().equals(var1.classInfo.name) && (var21.j() || var21.i().a == 12 && ((Openflower135)var21.i()).getIndex() == 0) && ((Openflower135)var18.h()).getIndex() == var19 - 1 && (var15 = (Openflower126)var13).f() == 0 && var15.g() != null && var15.g().a == 12 && ((Openflower135)var18.h()).getIndex() == var19 - 1) {
                        var3 = 3;
                     }
                  }
               }
            }
         }
      }

      if(var3 != 1) {
         this.b.put(var2, Integer.valueOf(var3));
      } else {
         this.b.remove(var2);
      }
   }

   private void c(ClassNode var1) {
      Iterator var3 = var1.e.getResults().iterator();

      while(var3.hasNext()) {
         MethodDecompileResult var2;
         if((var2 = (MethodDecompileResult)var3.next()).result != null) {
            boolean var4 = false;
            Openflower137 var5 = var2.a();
            HashSet var6 = new HashSet();
            LinkedList var7;
            (var7 = new LinkedList()).add(var5.b);

            while(!var7.isEmpty()) {
               Openflower138 var12 = (Openflower138)var7.removeFirst();
               if(!var6.contains(var12)) {
                  var6.add(var12);

                  for(int var8 = 0; var8 < var12.e.size(); ++var8) {
                     Element var9 = (Element)var12.e.get(var8);
                     var4 |= this.a(var1, var2, var9);
                     Element var10 = null;
                     if(var9.a == 8) {
                        var10 = this.a(var1, var2, (Openflower131)var9);
                     } else if(var9.a == 5) {
                        var10 = this.a(var1, var2, (Openflower128)var9);
                     }

                     if(var10 != null) {
                        var12.e.set(var8, var10);
                        var4 = true;
                     }
                  }

                  Iterator var14 = var12.f.iterator();

                  while(var14.hasNext()) {
                     Openflower138 var13 = (Openflower138)var14.next();
                     var7.add(var13);
                  }
               }
            }

            if(var4) {
               this.a(var1, var2);
            }
         }
      }

      var3 = var1.subClasses.iterator();

      while(var3.hasNext()) {
         ClassNode var11 = (ClassNode)var3.next();
         this.c(var11);
      }

   }

   private boolean a(ClassNode var1, MethodDecompileResult var2, Element var3) {
      boolean var4 = false;

      Element var5;
      for(Iterator var6 = var3.b().iterator(); var6.hasNext(); var4 |= this.a(var1, var2, var5)) {
         var5 = (Element)var6.next();
      }

      while(true) {
         boolean var9 = false;
         Iterator var7 = var3.b().iterator();

         while(true) {
            if(var7.hasNext()) {
               Element var10 = (Element)var7.next();
               Element var8 = null;
               if(var10.a == 8) {
                  var8 = this.a(var1, var2, (Openflower131)var10);
               } else if(var10.a == 5) {
                  var8 = this.a(var1, var2, (Openflower128)var10);
               }

               if(var8 == null) {
                  continue;
               }

               var3.a(var10, var8);
               var9 = true;
               var4 = true;
            }

            if(!var9) {
               return var4;
            }
            break;
         }
      }
   }

   private static boolean a(ClassNode var0, ClassNode var1) {
      if(var0.classInfo.name.equals(var1.classInfo.name)) {
         return false;
      } else {
         while(var0.classNode != null) {
            var0 = var0.classNode;
         }

         while(var1.classNode != null) {
            var1 = var1.classNode;
         }

         return var0 == var1;
      }
   }

   private Element a(ClassNode var1, MethodDecompileResult var2, Openflower128 var3) {
      ClassNode var5 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var3.g());
      if(var5 != null && var5.h != null) {
         String var4 = Util.concat(var3.k(), var3.h());
         if(var5.h.containsKey(var4) && (var4 = (String)var5.i.get(var4)) != null && var4.length() > 0) {
            if(!a(var1, var5)) {
               return null;
            } else {
               if(!var2.g.contains(var4)) {
                  LocalVarNamer var6;
                  (var6 = new LocalVarNamer()).setUsed(var4);
                  var2.varProcessor.loadNames(var6);
                  var2.g.add(var4);
               }

               int var7 = var2.idManager.getNext(2);
               Openflower135 var8 = new Openflower135(var7, var3.getDescriptor(), var2.varProcessor);
               var2.varProcessor.setName(new IntPair(var7, 0), var4);
               return var8;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private Element a(ClassNode var1, MethodDecompileResult var2, Openflower131 var3) {
      ClassNode var4 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var3.i());
      MethodDecompileResult var5 = null;
      if(var4 != null && var4.e != null) {
         var5 = var4.e.getResult(var3.o(), var3.q());
      }

      if(var5 != null && this.b.containsKey(var5)) {
         if(var4.classInfo.name.equals(var1.classInfo.name) && var5.method.getName().equals(var2.method.getName()) && var5.method.getDesc().equals(var2.method.getDesc())) {
            return null;
         } else {
            int var7 = ((Integer)this.b.get(var5)).intValue();
            if(!a(var1, var4)) {
               return null;
            } else {
               Element var8 = (Element)var5.a().b.e.get(0);
               Object var6 = null;
               switch(var7) {
               case 2:
                  Openflower126 var10;
                  if((var10 = (Openflower126)var8).g().a == 12) {
                     Openflower135 var15 = (Openflower135)var10.g();
                     String var12 = var5.varProcessor.getName(new IntPair(var15));
                     if(!var2.g.contains(var12)) {
                        LocalVarNamer var19;
                        (var19 = new LocalVarNamer()).setUsed(var12);
                        var2.varProcessor.loadNames(var19);
                        var2.g.add(var12);
                     }

                     int var18 = var2.idManager.getNext(2);
                     var15 = new Openflower135(var18, var15.createDesriptor(), var2.varProcessor);
                     var2.varProcessor.setName(new IntPair(var18, 0), var12);
                     var6 = var15;
                  } else {
                     Openflower128 var17;
                     if(!(var17 = (Openflower128)var10.g().copy()).j()) {
                        var17.a(var17.i(), (Element)var3.g().get(0));
                     }

                     var6 = var17;
                  }
                  break;
               case 3:
                  Openflower124 var14;
                  if(var8.a == 4) {
                     Openflower126 var10000 = (Openflower126)var8;
                     //this = null;
                     var14 = (Openflower124)((Openflower124)var10000.g()).copy();
                  } else {
                     var14 = (Openflower124)((Openflower124)var8).copy();
                  }

                  Openflower128 var9;
                  if((var9 = (Openflower128)var14.g()).j()) {
                     var14.a(var14.h(), (Element)var3.g().get(0));
                  } else {
                     var14.a(var14.h(), (Element)var3.g().get(1));
                     var9.a(var9.i(), (Element)var3.g().get(0));
                  }

                  var6 = var14;
                  break;
               case 4:
                  if(var8.a == 4) {
                     var8 = ((Openflower126)var8).g();
                  }

                  var6 = (Openflower131)var8.copy();
                  byte var11 = 0;
                  if(!((Openflower131)var6).m()) {
                     ((Openflower131)var6).a(((Openflower131)var6).l(), (Element)var3.g().get(0));
                     var11 = 1;
                  }

                  for(var7 = 0; var7 < ((Openflower131)var6).g().size(); ++var7) {
                     ((Openflower131)var6).a((Element)((Openflower131)var6).g().get(var7), (Element)var3.g().get(var7 + var11));
                  }
               }

               if(var6 != null) {
                  boolean var13 = true;
                  if(var4.a == 0 || (var4.access_flags & 8) != 0) {
                     MethodInfo var16 = var5.method;
                     if((var5.method.getAccess() & 4096) == 0 && !var16.getAttributes().d("Synthetic")) {
                        var13 = false;
                     }
                  }

                  if(var13) {
                     var4.e.d().add(Util.concat(var3.o(), var3.q()));
                  }
               }

               return (Element)var6;
            }
         }
      } else {
         return null;
      }
   }
}
