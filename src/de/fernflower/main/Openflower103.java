package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower144;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower89;
import de.fernflower.main.Openflower94;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower122;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower132;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public final class Openflower103 {

   private boolean a;


   public Openflower103(boolean var1) {
      this.a = var1;
   }

   public final boolean a(Openflower154_SomeSorter var1, HashSet var2, Openflower144 var3) {
      boolean var4 = false;
      boolean var5;
      if(var1.E() == null) {
         do {
            var5 = false;
            Iterator var7 = var1.t().iterator();

            while(var7.hasNext()) {
               Openflower154_SomeSorter var6 = (Openflower154_SomeSorter)var7.next();
               var4 |= this.a(var6, var2, var3);
               if(var5 = Openflower94.a(var6, var2)) {
                  break;
               }

               boolean var10000;
               label105: {
                  Openflower151 var15;
                  Openflower154_SomeSorter var16;
                  if((var16 = var6).c == 2 && var16.E() == null && (var15 = (Openflower151)var16).b == Openflower151.a) {
                     Openflower154_SomeSorter var8 = var15.f();
                     Openflower154_SomeSorter var9 = var15.e();
                     if(var8.E() != null && var8.E().size() == 1 && var9.E() != null && var9.E().size() == 1 && var8.q().size() == 1 && var9.q().size() == 1 && ((Openflower105)var8.q().get(0)).c() == ((Openflower105)var9.q().get(0)).c()) {
                        Element var10 = (Element)var8.E().get(0);
                        Element var20 = (Element)var9.E().get(0);
                        if(var10.a == 2 && var20.a == 2) {
                           Openflower124 var25 = (Openflower124)var10;
                           Openflower124 var21 = (Openflower124)var20;
                           if(var25.g().a == 12 && var21.g().a == 12) {
                              Openflower135 var23 = (Openflower135)var25.g();
                              Openflower135 var26 = (Openflower135)var21.g();
                              if(var23.getIndex() == var26.getIndex() && var23.n()) {
                                 boolean var13 = false;
                                 Iterator var14 = var3.a().entrySet().iterator();

                                 while(var14.hasNext()) {
                                    Entry var18;
                                    if(((IntPair)(var18 = (Entry)var14.next()).getKey()).val1 == var23.getIndex() && ((Openflower212)var18.getValue()).c((Object)Integer.valueOf(var23.getIndex2())) && ((Openflower212)var18.getValue()).c((Object)Integer.valueOf(var26.getIndex2()))) {
                                       var13 = true;
                                       break;
                                    }
                                 }

                                 if(var13) {
                                    ArrayList var17;
                                    (var17 = new ArrayList()).addAll(var15.s().E());
                                    var17.add(new Openflower124(var23, new Openflower129(36, Arrays.asList(new Element[]{var15.i().d(), var25.h(), var21.h()}))));
                                    var15.b((List)var17);
                                    if(var15.q().isEmpty()) {
                                       Openflower105 var27 = (Openflower105)var8.q().get(0);
                                       Openflower105 var19 = new Openflower105(var27.a(), var15, var27.c());
                                       var15.f(var19);
                                       if(var27.b != null) {
                                          var27.b.c(var19);
                                       }
                                    }

                                    Openflower102.b(var15);
                                    var10000 = true;
                                    break label105;
                                 }
                              }
                           }
                        } else if(var10.a == 4 && var20.a == 4) {
                           Openflower126 var24 = (Openflower126)var10;
                           Openflower126 var22 = (Openflower126)var20;
                           if(var24.f() == var22.f() && var24.g() != null && var22.g() != null && var24.f() == 0 && (var24.f() != 1 || var24.g().getDescriptor().equals((Object)var22.g().getDescriptor()))) {
                              ArrayList var11;
                              (var11 = new ArrayList()).addAll(var15.s().E());
                              var11.add(new Openflower126(var24.f(), new Openflower129(36, Arrays.asList(new Element[]{var15.i().d(), var24.g(), var22.g()})), var24.h()));
                              var15.b((List)var11);
                              Openflower105 var12 = (Openflower105)var8.q().get(0);
                              var15.f(new Openflower105(4, var15, var12.c(), var12.b == var15?var15.B():var12.b));
                              Openflower102.b(var15);
                              var10000 = true;
                              break label105;
                           }
                        }
                     }
                  }

                  var10000 = false;
               }

               var5 = var10000;
               if(var10000) {
                  break;
               }
            }

            var4 |= var5;
         } while(var5);
      } else {
         var4 = false | this.a(var1.E());
      }

      return var4;
   }

   private boolean a(List var1) {
      boolean var2 = false;
      int var3 = 0;

      while(var3 < var1.size()) {
         Element var4;
         Element var5;
         if((var5 = a(var4 = (Element)var1.get(var3))) != null) {
            var1.set(var3, var5);
            var2 = true;
         } else {
            Openflower132 var7;
            if(var4.a == 9 && (var7 = (Openflower132)var4).g() == 1 && var7.h().a == 12 && !((Openflower135)var7.h()).n()) {
               var1.remove(var3);
               var2 = true;
            } else {
               Openflower124 var19;
               boolean var10000;
               label155: {
                  if(var4.a == 2 && (var19 = (Openflower124)var4).g().a == 12 && var19.h().a == 12) {
                     Openflower135 var8 = (Openflower135)var19.g();
                     Openflower135 var9 = (Openflower135)var19.h();
                     if(var8.getIndex() == var9.getIndex() && var8.n() && var9.n()) {
                        var10000 = true;
                        break label155;
                     }
                  }

                  var10000 = false;
               }

               if(var10000) {
                  var1.remove(var3);
                  var2 = true;
               } else {
                  if(var3 == var1.size() - 1) {
                     break;
                  }

                  Openflower124 var27;
                  label267: {
                     var5 = (Element)var1.get(var3 + 1);
                     List var6 = var1;
                     Element var24;
                     if((var24 = (Element)var1.get(var3)).a == 2 && (var27 = (Openflower124)var24).g().a == 12 && var27.h().a == 10) {
                        Openflower133 var10;
                        Descriptor var11 = (var10 = (Openflower133)var27.h()).i();
                        IntPair var23 = new IntPair((Openflower135)var27.g());
                        if(var11.type == 8 && var11.arrayDepth == 0 && var10.g() == null) {
                           HashSet var12 = new HashSet();

                           for(int var13 = var3 + 1; var13 < var6.size(); ++var13) {
                              Element var14;
                              Openflower131 var15;
                              Set var16;
                              if((var14 = (Element)var6.get(var13)).a == 8 && (var15 = (Openflower131)var14).j() == 2 && var15.l().a == 12 && var27.g().equals(var15.l())) {
                                 (var16 = var14.p()).remove(var23);
                                 var16.retainAll(var12);
                                 if(var16.isEmpty()) {
                                    var10.a(var15);
                                    var15.a((Element)null);
                                    if(!var12.isEmpty()) {
                                       var6.add(var3 + 1, var27.copy());
                                       var6.remove(var13 + 1);
                                    } else {
                                       var6.set(var13, var27.copy());
                                    }

                                    var10000 = true;
                                    break label267;
                                 }
                              }

                              boolean var39 = false;
                              Openflower124 var41;
                              if(var14.a == 2 && (var41 = (Openflower124)var14).g().a == 12 && var41.h().a == 12) {
                                 var12.add(new IntPair((Openflower135)var41.g()));
                                 var39 = true;
                              }

                              if(!var39) {
                                 if((var16 = var14.p()).contains(var23)) {
                                    break;
                                 }

                                 var12.addAll(var16);
                              }
                           }
                        }
                     }

                     var10000 = false;
                  }

                  if(var10000) {
                     var1.remove(var3);
                     var2 = true;
                  } else if(Configuration.getBoolean("rgn") && b(var4, var5)) {
                     var1.remove(var3);
                     var2 = true;
                  } else {
                     int var18;
                     if((var18 = a(var1, var3)) > 0) {
                        for(int var22 = 0; var22 < var18; ++var22) {
                           var1.remove(var3 + 1);
                        }

                        var2 = true;
                     } else {
                        Openflower124 var28;
                        label237: {
                           Openflower133 var30;
                           if(var4.a == 2 && (var28 = (Openflower124)var4).h().a == 10 && var28.g().a == 12 && !(var30 = (Openflower133)var28.h()).j().isEmpty()) {
                              Openflower135 var34 = (Openflower135)var28.g();
                              Openflower122 var26;
                              Openflower124 var33;
                              Element var38;
                              int var36;
                              if(var5.a == 2 && (var33 = (Openflower124)var5).g().a == 1 && (var26 = (Openflower122)var33.g()).f().a == 12 && var34.equals(var26.f()) && var26.g().a == 3 && (var36 = ((ConstantElement)var26.g()).k()) < var30.j().size() && (var38 = (Element)var30.j().get(var36)).a == 3) {
                                 ConstantElement var40 = (ConstantElement)var38;
                                 Descriptor var42;
                                 (var42 = var30.i().copy()).popArray();
                                 ConstantElement var43 = Openflower89.c(var42);
                                 Element var17;
                                 if(var40.equals(var43) && !(var17 = var33.h()).b(var34)) {
                                    var30.j().set(var36, var17);
                                    if(var17.a == 10) {
                                       Openflower133 var20 = (Openflower133)var17;
                                       boolean var21 = false;
                                       if(var30.i().arrayDepth > 1 && !var20.j().isEmpty()) {
                                          var20.k();
                                       }
                                    }

                                    var10000 = true;
                                    break label237;
                                 }
                              }
                           }

                           var10000 = false;
                        }

                        if(var10000) {
                           var1.remove(var3 + 1);
                           var2 = true;
                        } else {
                           Openflower129 var44;
                           label220: {
                              Openflower129 var31;
                              if(var4.a == 2 && (var19 = (Openflower124)var4).h().a == 6 && ((var31 = (Openflower129)var19.h()).i() == 0 || var31.i() == 1)) {
                                 Element var29 = (Element)var31.j().get(0);
                                 Element var35;
                                 if((var35 = (Element)var31.j().get(1)).a != 3 && var29.a == 3 && var31.i() == 0) {
                                    var29 = var35;
                                    var35 = (Element)var31.j().get(0);
                                 }

                                 Element var37;
                                 if(var35.a == 3 && ((ConstantElement)var35).h() && (var37 = var19.g()).a != 12 && var37.equals(var29)) {
                                    (var31 = new Openflower129(var31.i() == 0?35:33, Arrays.asList(new Element[]{var29}))).a(Descriptor.INT);
                                    var44 = var31;
                                    break label220;
                                 }
                              }

                              var44 = null;
                           }

                           Openflower129 var25 = var44;
                           if(var44 != null) {
                              var1.set(var3, var25);
                              var2 = true;
                           } else {
                              label205: {
                                 if(var4.a == 2 && var5.a == 6) {
                                    var28 = (Openflower124)var4;
                                    Openflower129 var32;
                                    if(((var32 = (Openflower129)var5).i() == 33 || var32.i() == 35) && ((Element)var32.j().get(0)).equals(var28.h())) {
                                       if(var32.i() == 33) {
                                          var32.b(32);
                                       } else {
                                          var32.b(34);
                                       }

                                       var28.a(var32);
                                       var10000 = true;
                                       break label205;
                                    }
                                 }

                                 var10000 = false;
                              }

                              if(var10000) {
                                 var1.remove(var3 + 1);
                                 var2 = true;
                              } else if(a(var4, var5)) {
                                 var1.remove(var3 + 1);
                                 var2 = true;
                              } else {
                                 if(!this.a) {
                                    label190: {
                                       if(var4.a == 2 && var5.a == 2) {
                                          var28 = (Openflower124)var4;
                                          var27 = (Openflower124)var5;
                                          if(var28.g().a == 12 && var27.h().a == 12 && var28.g().equals(var27.h()) && ((Openflower135)var28.g()).n() && (var27.g().a != 12 || !((Openflower135)var27.g()).n())) {
                                             var28.a(new Openflower124(var27.g(), var28.h()));
                                             var10000 = true;
                                             break label190;
                                          }
                                       }

                                       var10000 = false;
                                    }

                                    if(var10000) {
                                       var1.remove(var3 + 1);
                                       var2 = true;
                                       continue;
                                    }
                                 }

                                 ++var3;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   private static int a(List var0, int var1) {
      Element var2;
      Openflower133 var3;
      Openflower124 var14;
      if((var2 = (Element)var0.get(var1)).a == 2 && (var14 = (Openflower124)var2).h().a == 10 && var14.g().a == 12 && (var3 = (Openflower133)var14.h()).getDescriptor().arrayDepth > 0 && var3.h().size() == 1 && var3.j().isEmpty() && ((Element)var3.h().get(0)).a == 3) {
         int var4;
         if((var4 = ((Integer)((ConstantElement)var3.h().get(0)).j()).intValue()) == 0) {
            return 0;
         }

         Openflower135 var15 = (Openflower135)var14.g();
         HashMap var5 = new HashMap();

         for(int var6 = 1; var1 + var6 < var0.size() && var6 <= var4; ++var6) {
            boolean var9 = false;
            Openflower124 var7;
            Openflower122 var8;
            Element var10;
            int var20;
            if((var10 = (Element)var0.get(var1 + var6)).a == 2 && (var7 = (Openflower124)var10).g().a == 1 && (var8 = (Openflower122)var7.g()).f().a == 12 && var15.equals(var8.f()) && var8.g().a == 3 && (var20 = ((ConstantElement)var8.g()).k()) < var4 && !var5.containsKey(Integer.valueOf(var20)) && !var7.h().b(var15)) {
               var5.put(Integer.valueOf(var20), var7.h());
               var9 = true;
            }

            if(!var9) {
               break;
            }
         }

         double var22 = (double)var5.size() / (double)var4;
         if(var15.n() && var22 > 0.0D || var4 <= 7 && var22 >= 0.3D || var4 > 7 && var22 >= 0.7D) {
            ArrayList var18 = new ArrayList();
            Descriptor var19;
            (var19 = var3.i().copy()).popArray();
            ConstantElement var21 = Openflower89.c(var19);

            int var11;
            for(var11 = 0; var11 < var4; ++var11) {
               var18.add(var21.copy());
            }

            var11 = var3.i().arrayDepth;
            Iterator var16 = var5.entrySet().iterator();

            while(var16.hasNext()) {
               Entry var12;
               Element var17 = (Element)(var12 = (Entry)var16.next()).getValue();
               var18.set(((Integer)var12.getKey()).intValue(), var17);
               if(var17.a == 10) {
                  Openflower133 var13 = (Openflower133)var17;
                  if(var11 > 1 && !var13.j().isEmpty()) {
                     var13.k();
                  }
               }
            }

            var3.a((List)var18);
            return var5.size();
         }
      }

      return 0;
   }

   private static boolean a(Element var0, Element var1) {
      if(var0.a == 2 && var1.a == 2) {
         Openflower124 var2 = (Openflower124)var0;
         Openflower124 var3 = (Openflower124)var1;

         while(true) {
            if(var2.h().equals(var3.h()) && var2.g().a == 12 && ((Openflower135)var2.g()).n() && (var3.g().a != 12 || !((Openflower135)var3.g()).n()) && !var3.g().b(var2.g())) {
               var2.a(var3);
               return true;
            }

            if(var2.h().a != 2) {
               break;
            }

            var2 = (Openflower124)var2.h();
         }
      }

      return false;
   }

   private static boolean b(Element var0, Element var1) {
      Openflower131 var3;
      if(var0.a == 8 && !(var3 = (Openflower131)var0).m() && var3.l().a == 12 && var3.o().equals("getClass") && var3.q().equals("()Ljava/lang/Class;")) {
         List var2;
         (var2 = var1.b()).add(var1);
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            Openflower133 var4;
            if((var1 = (Element)var6.next()).a == 10 && (var4 = (Openflower133)var1).g() != null && !var4.g().g().isEmpty() && ((Element)var4.g().g().get(0)).equals(var3.l())) {
               String var5 = var4.i().stringValue;
               ClassNode var7;
               if((var7 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(var5)) != null && var7.a != 0) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static Element a(Element var0) {
      List var10000 = var0.b();
      Element var1 = null;
      Iterator var2 = var10000.iterator();

      while(var2.hasNext()) {
         Element var3;
         if((var3 = a(var1 = (Element)var2.next())) != null) {
            var0.a(var1, var3);
         }
      }

      Openflower131 var4;
      if(var0.a == 8 && (var4 = (Openflower131)var0).j() == 2 && var4.l().a == 10) {
         Openflower133 var5;
         (var5 = (Openflower133)var4.l()).a(var4);
         var4.a((Element)null);
         return var5;
      } else {
         return null;
      }
   }
}
