package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower93;
import de.fernflower.main.Openflower98;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower130;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class Openflower94 {

   public static boolean a(Openflower152 var0) {
      boolean var1;
      if(var1 = b(var0, new HashSet())) {
         Openflower102.a((Openflower154_SomeSorter)var0);
      }

      return var1;
   }

   private static boolean b(Openflower154_SomeSorter var0, HashSet var1) {
      boolean var2 = false;
      boolean var3;
      if(var0.E() == null) {
         do {
            var3 = false;
            Iterator var4 = var0.t().iterator();

            while(var4.hasNext()) {
               Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)var4.next();
               var2 |= b(var5, var1);
               if(var3 = a(var5, var1)) {
                  break;
               }
            }

            var2 |= var3;
         } while(var3);
      }

      return var2;
   }

   public static boolean a(Openflower154_SomeSorter var0, HashSet var1) {
      if(var0.c != 2 && var0.c != 15) {
         return false;
      } else {
         boolean var2 = false;

         while(true) {
            boolean var3 = false;
            ArrayList var4 = new ArrayList();
            if(var0.c == 2) {
               var4.add(var0);
            } else {
               var4.addAll(var0.t());
            }

            boolean var5 = var4.size() == 1;
            Iterator var6 = var4.iterator();

            while(var6.hasNext()) {
               Openflower154_SomeSorter var15;
               if((var15 = (Openflower154_SomeSorter)var6.next()).c == 2) {
                  Openflower151 var8;
                  Openflower105 var12;
                  Openflower93 var10000;
                  if((var8 = (Openflower151)var15).b == Openflower151.a) {
                     var10000 = null;
                  } else {
                     Openflower93 var10 = new Openflower93(var8);
                     Openflower154_SomeSorter var11;
                     if((var11 = var8.f()) == null) {
                        var12 = var8.j();
                        var10.a(new Openflower93(var12.c()), 1);
                     } else {
                        Openflower93 var21 = new Openflower93(var11);
                        var10.a(var21, 0);
                        if(var11.c == 2 && ((Openflower151)var11).b == 0) {
                           Openflower151 var13;
                           Openflower154_SomeSorter var14;
                           if((var14 = (var13 = (Openflower151)var11).f()) == null) {
                              Openflower105 var7 = var13.j();
                              var21.a(new Openflower93(var7.c()), 1);
                           } else {
                              var21.a(new Openflower93(var14), 0);
                           }
                        }

                        if(!var11.q().isEmpty()) {
                           var21.a(new Openflower93(((Openflower105)var11.q().get(0)).c()), 1);
                        }
                     }

                     Openflower154_SomeSorter var25 = (var12 = (Openflower105)var8.q().get(0)).c();
                     Openflower93 var28 = new Openflower93(var25);
                     if(!var5 && var12.a() == 1) {
                        var10.a(var28, 0);
                        if(var25.c == 2 && ((Openflower151)var25).b == 0) {
                           Openflower151 var16;
                           Openflower154_SomeSorter var18;
                           if((var18 = (var16 = (Openflower151)var25).f()) == null) {
                              var28.a(new Openflower93(var16.j().c()), 1);
                           } else {
                              var28.a(new Openflower93(var18), 0);
                           }
                        }

                        if(!var25.q().isEmpty()) {
                           var28.a(new Openflower93(((Openflower105)var25.q().get(0)).c()), 1);
                        }
                     } else {
                        var10.a(var28, 1);
                     }

                     var10000 = var10;
                  }

                  Openflower93 var17 = var10000;
                  if(var10000 != null) {
                     Openflower93 var9;
                     Openflower151 var19;
                     Openflower151 var20;
                     boolean var31;
                     label103: {
                        if(((Integer)var17.c.get(0)).intValue() == 0 && (var9 = (Openflower93)var17.b.get(0)).b.size() == 2 && ((Openflower93)var9.b.get(1)).a == ((Openflower93)var17.b.get(1)).a) {
                           var20 = (Openflower151)var17.a;
                           var19 = (Openflower151)var9.a;
                           Openflower154_SomeSorter var24 = ((Openflower93)var9.b.get(0)).a;
                           if(var19.s().E().isEmpty()) {
                              var20.s().g(var20.j());
                              var19.g((Openflower105)var19.q().get(0));
                              var20.t().a(var19.id);
                              Openflower105 var22;
                              if(((Integer)var9.c.get(0)).intValue() == 1) {
                                 var20.c((Openflower154_SomeSorter)null);
                                 var22 = var19.j();
                                 var19.s().g(var22);
                                 var22.a(var20.s());
                                 if(var22.b == var19) {
                                    var22.b = null;
                                 }

                                 var20.s().f(var22);
                                 var20.b(var22);
                              } else {
                                 var19.s().g(var19.j());
                                 var22 = new Openflower105(1, var20.s(), var24);
                                 var20.s().f(var22);
                                 var20.b(var22);
                                 var20.c(var24);
                                 var20.t().a((Object)var24, (Object)var24.id);
                                 var24.i(var20);
                                 Openflower105 var29;
                                 if(!var24.q().isEmpty() && (var29 = (Openflower105)var24.q().get(0)).b == var19) {
                                    var29.b = null;
                                 }
                              }

                              Openflower130 var27 = var20.i();
                              ArrayList var26;
                              (var26 = new ArrayList()).add(var27.d());
                              var26.add(var19.i().d());
                              var27.a(new Openflower129(48, var26));
                              var31 = true;
                              break label103;
                           }
                        }

                        var31 = false;
                     }

                     var3 = var31;
                     if(var31) {
                        break;
                     }

                     if(!var1.contains(var15.id)) {
                        label136: {
                           if(((Integer)var17.c.get(0)).intValue() == 0 && (var9 = (Openflower93)var17.b.get(0)).b.size() == 2 && ((Openflower93)var9.b.get(0)).a == ((Openflower93)var17.b.get(1)).a) {
                              var20 = (Openflower151)var17.a;
                              if((var19 = (Openflower151)var9.a).s().E().isEmpty()) {
                                 var20.s().g(var20.j());
                                 var19.s().g(var19.j());
                                 var20.t().a(var19.id);
                                 if(((Integer)var9.c.get(1)).intValue() != 1 || ((Integer)var9.c.get(0)).intValue() != 1) {
                                    throw new RuntimeException("inconsistent if structure!");
                                 }

                                 var20.c((Openflower154_SomeSorter)null);
                                 var12 = (Openflower105)var19.q().get(0);
                                 var19.g(var12);
                                 var12.a(var20.s());
                                 var20.s().f(var12);
                                 var20.b(var12);
                                 Openflower130 var23 = var20.i();
                                 ArrayList var30;
                                 (var30 = new ArrayList()).add(var23.d());
                                 var30.add(new Openflower129(12, Arrays.asList(new Element[]{var19.i().d()})));
                                 var23.a(new Openflower129(48, var30));
                                 var31 = true;
                                 break label136;
                              }
                           }

                           var31 = false;
                        }

                        var3 = var31;
                        if(var31 || (var3 = a(var17))) {
                           break;
                        }
                     }

                     if(var3 = a((Openflower151)var15)) {
                        var1.add(var15.id);
                        break;
                     }
                  }
               }
            }

            if(!var3) {
               return var2;
            }

            var2 |= var3;
         }
      }
   }

   private static boolean a(Openflower93 var0) {
      if(((Integer)var0.c.get(1)).intValue() == 0) {
         Openflower93 var1;
         Openflower130 var13;
         if((var1 = (Openflower93)var0.b.get(1)).b.size() == 2) {
            int var2;
            if((var2 = ((Openflower93)var1.b.get(1)).a == ((Openflower93)var0.b.get(0)).a?2:(((Openflower93)var1.b.get(0)).a == ((Openflower93)var0.b.get(0)).a?1:0)) > 0) {
               Openflower151 var6 = (Openflower151)var0.a;
               Openflower151 var8 = (Openflower151)var1.a;
               Openflower154_SomeSorter var3 = var6.B();
               if(var8.s().E().isEmpty()) {
                  var6.s().g(var6.j());
                  var6.e(var8);
                  Iterator var5 = var6.r().iterator();

                  while(var5.hasNext()) {
                     Openflower105 var4 = (Openflower105)var5.next();
                     if(!var6.g(var4.b())) {
                        var6.e(var4);
                        var4.b().a(1, var4, var8);
                        var8.d(var4);
                     }
                  }

                  var3.t().a(var6.id);
                  if(var3.s() == var6) {
                     var3.h(var8);
                  }

                  var13 = var8.i();
                  ArrayList var14;
                  (var14 = new ArrayList()).add(var6.i().d());
                  if(var2 == 2) {
                     var14.set(0, new Openflower129(12, Arrays.asList(new Element[]{(Element)var14.get(0)})));
                  }

                  var14.add(var13.d());
                  var13.a(new Openflower129(var2 == 1?49:48, var14));
                  if(var8.s().E().isEmpty() && !var6.s().E().isEmpty()) {
                     var8.a(var8.s(), var6.s());
                  }

                  return true;
               }
            }
         } else if(var1.b.size() == 1 && ((Openflower93)var1.b.get(0)).a == ((Openflower93)var0.b.get(0)).a) {
            Openflower151 var10 = (Openflower151)var0.a;
            Openflower154_SomeSorter var7 = var1.a;
            var10.e(var7);
            Iterator var11 = var7.q().iterator();

            Openflower105 var9;
            while(var11.hasNext()) {
               var9 = (Openflower105)var11.next();
               var7.g(var9);
               var9.a(var10);
               var10.f(var9);
            }

            var9 = var10.j();
            var10.s().g(var9);
            var7.f(new Openflower105(var9.a(), var7, var9.c(), var9.b));
            Openflower105 var12 = new Openflower105(1, var10.s(), var7);
            var10.s().f(var12);
            var10.c(var7);
            var10.t().a((Object)var7, (Object)var7.id);
            var7.i(var10);
            var10.B().t().a(var7.id);
            (var13 = var10.i()).a(new Openflower129(12, Arrays.asList(new Element[]{var13.d()})));
            return true;
         }
      }

      return false;
   }

   private static boolean a(Openflower151 var0) {
      if(var0.b == Openflower151.a) {
         return false;
      } else {
         boolean var1 = false;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         Openflower154_SomeSorter var7;
         Object var12;
         Openflower154_SomeSorter var8 = a((Openflower154_SomeSorter)(var12 = (var7 = var0.B()).c == 15?var7:var0));
         if(var0.f() == null) {
            var3 = true;
            if(var0.j().a() == 32) {
               var1 = true;
            } else {
               var1 = Openflower98.a((Openflower154_SomeSorter)var12, var0.j().c());
            }
         } else {
            List var9;
            if(!(var9 = var0.f().q()).isEmpty() && ((Openflower105)var9.get(0)).a() == 32) {
               var1 = true;
            } else {
               var1 = a(var0.f(), (Openflower154_SomeSorter)var12);
            }
         }

         Object var10000 = var7.c == 15?(Openflower154_SomeSorter)((Openflower153)var7).t().a():var0;
         Object var22 = var10000;
         var4 = var10000 == var0;
         if(!((Openflower154_SomeSorter)var22).q().isEmpty() && ((Openflower105)((Openflower154_SomeSorter)var22).q().get(0)).a() == 32) {
            var2 = true;
         } else {
            var2 = a((Openflower154_SomeSorter)var22, (Openflower154_SomeSorter)var12);
         }

         if(!var4 && b(var0, ((Openflower105)var0.q().get(0)).c())) {
            return false;
         } else {
            if(!var1 && !var3) {
               var5 = b(var0, var8);
            }

            Openflower154_SomeSorter var11;
            Openflower153 var24;
            if(!var2 && !var4) {
               for(int var10 = (var24 = (Openflower153)var7).t().size() - 1; var10 >= 0 && (var11 = (Openflower154_SomeSorter)var24.t().get(var10)) != var0 && !(var6 = b(var11, var8)); --var10) {
                  ;
               }
            }

            Openflower154_SomeSorter var13;
            if((var1 || var5) && (var2 || var6) && !var3 && !var4) {
               var24 = (Openflower153)var7;
               ArrayList var27 = new ArrayList();

               for(int var31 = var24.t().size() - 1; var31 >= 0 && (var13 = (Openflower154_SomeSorter)var24.t().get(var31)) != var0; --var31) {
                  var27.add(0, var13);
               }

               Openflower154_SomeSorter var29;
               if(var27.size() == 1) {
                  var29 = (Openflower154_SomeSorter)var27.get(0);
               } else {
                  (var29 = new Openflower153(var27)).m();
               }

               var0.g((Openflower105)var0.q().get(0));
               Iterator var20 = var27.iterator();

               while(var20.hasNext()) {
                  var13 = (Openflower154_SomeSorter)var20.next();
                  var24.t().a(var13.id);
               }

               Openflower105 var21 = new Openflower105(1, var0.s(), (Openflower154_SomeSorter)var29);
               var0.s().f(var21);
               var0.b((Openflower154_SomeSorter)var29);
               var0.a(var21);
               var0.t().a(var29, (Object)((Openflower154_SomeSorter)var29).id);
               ((Openflower154_SomeSorter)var29).i(var0);
               var0.b = Openflower151.a;
            } else {
               if(!var1 || var2 && (!var3 || var4)) {
                  return false;
               }

               Openflower130 var23;
               (var23 = var0.i()).a(new Openflower129(12, Arrays.asList(new Element[]{var23.d()})));
               if(var4) {
                  Openflower105 var28 = var0.j();
                  Openflower105 var26 = (Openflower105)var0.q().get(0);
                  if(var3) {
                     var0.s().g(var28);
                     var0.g(var26);
                     var28.a(var0);
                     var26.a(var0.s());
                     var0.f(var28);
                     var0.s().f(var26);
                     var0.b(var26);
                  } else {
                     var13 = var0.f();
                     Openflower153 var15 = new Openflower153(Arrays.asList(new Openflower154_SomeSorter[]{var0, var13}));
                     var0.s().g(var28);
                     var0.t().a(var13.id);
                     var0.c((Openflower154_SomeSorter)null);
                     var0.g(var26);
                     var26.a(var0.s());
                     var0.s().f(var26);
                     var0.b(var26);
                     var0.B().a((Openflower154_SomeSorter)var0, (Openflower154_SomeSorter)var15);
                     var15.m();
                     var0.f(new Openflower105(1, var0, var13));
                  }
               } else {
                  Openflower153 var25 = (Openflower153)var7;
                  ArrayList var30 = new ArrayList();

                  Openflower154_SomeSorter var16;
                  for(int var14 = var25.t().size() - 1; var14 >= 0 && (var16 = (Openflower154_SomeSorter)var25.t().get(var14)) != var0; --var14) {
                     var30.add(0, var16);
                  }

                  Openflower154_SomeSorter var17;
                  if(var30.size() == 1) {
                     var17 = (Openflower154_SomeSorter)var30.get(0);
                  } else {
                     (var17 = new Openflower153(var30)).m();
                  }

                  var0.g((Openflower105)var0.q().get(0));
                  Iterator var18 = var30.iterator();

                  while(var18.hasNext()) {
                     var16 = (Openflower154_SomeSorter)var18.next();
                     var25.t().a(var16.id);
                  }

                  Openflower105 var19;
                  if(var3) {
                     var19 = var0.j();
                     var0.s().g(var19);
                     var19.a(var0);
                     var0.f(var19);
                  } else {
                     var16 = var0.f();
                     var0.s().g(var0.j());
                     var0.t().a(var16.id);
                     var0.f(new Openflower105(1, var0, var16));
                     var25.t().a((Object)var16, (Object)var16.id);
                     var16.i(var25);
                  }

                  var19 = new Openflower105(1, var0.s(), (Openflower154_SomeSorter)var17);
                  var0.s().f(var19);
                  var0.c((Openflower154_SomeSorter)var17);
                  var0.b(var19);
                  var0.t().a(var17, (Object)((Openflower154_SomeSorter)var17).id);
                  ((Openflower154_SomeSorter)var17).i(var0);
               }
            }

            return true;
         }
      }
   }

   private static boolean a(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      Iterator var3 = var0.q().iterator();

      Openflower105 var2;
      while(var3.hasNext()) {
         var2 = (Openflower105)var3.next();
         if(Openflower98.a(var1, var2.c())) {
            return true;
         }
      }

      if(var0.E() == null) {
         switch(var0.c) {
         case 2:
            Openflower151 var5;
            if((var5 = (Openflower151)var0).b == Openflower151.a) {
               if(!a(var5.f(), var1) && !a(var5.e(), var1)) {
                  return false;
               }

               return true;
            }
         case 3:
         case 4:
         case 5:
         case 8:
         case 9:
         case 11:
         case 13:
         case 14:
         default:
            break;
         case 6:
            Iterator var4 = var0.t().iterator();

            do {
               if(!var4.hasNext()) {
                  return false;
               }
            } while(!a((Openflower154_SomeSorter)var4.next(), var1));

            return true;
         case 7:
         case 12:
            var3 = var0.t().iterator();

            Openflower154_SomeSorter var10000;
            do {
               if(!var3.hasNext()) {
                  return false;
               }

               var10000 = (Openflower154_SomeSorter)var3.next();
               var2 = null;
            } while(!a(var10000, var1));

            return true;
         case 10:
            return a((Openflower154_SomeSorter)var0.t().get(1), var1);
         case 15:
            return a((Openflower154_SomeSorter)var0.t().a(), var1);
         }
      }

      return false;
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0) {
      Openflower154_SomeSorter var1;
      switch((var1 = var0.B()).c) {
      case 5:
         return var1;
      case 13:
         return ((Openflower152)var1).e();
      case 15:
         Openflower153 var2;
         if((var2 = (Openflower153)var1).t().a() != var0) {
            for(int var3 = var2.t().size() - 1; var3 >= 0; --var3) {
               if(var2.t().get(var3) == var0) {
                  return (Openflower154_SomeSorter)var2.t().get(var3 + 1);
               }
            }
         }
      default:
         return a(var1);
      }
   }

   private static boolean b(Openflower154_SomeSorter var0, Openflower154_SomeSorter var1) {
      Iterator var2 = var1.r().iterator();

      while(var2.hasNext()) {
         Openflower105 var3 = (Openflower105)var2.next();
         if(var0.g(var3.b())) {
            return true;
         }
      }

      return false;
   }
}
