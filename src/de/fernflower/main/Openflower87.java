package de.fernflower.main;

import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower106;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower113;
import de.fernflower.main.Openflower12;
import de.fernflower.main.Openflower120;
import de.fernflower.main.Openflower13;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower150;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower153;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower155_SwitchPrinter;
import de.fernflower.main.Openflower156;
import de.fernflower.main.Openflower209;
import de.fernflower.main.Openflower211;
import de.fernflower.main.Openflower86;
import de.fernflower.main.Openflower96;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class Openflower87 {

   private static DualArrayList b(Openflower154_SomeSorter var0) {
      HashMap var1 = new HashMap();
      Openflower106 var10000 = new Openflower106(var0);
      List var2 = null;
      var2 = var10000.a();
      List var3 = var0.a(Openflower106.b(var2));
      Openflower211 var4;
      Openflower209 var5;
      (var5 = (var4 = new Openflower211(var3)).a()).b();
      Openflower209 var6;
      (var6 = var4.a()).b();
      Iterator var7 = var2.iterator();

      Openflower209 var8;
      Openflower154_SomeSorter var9;
      Iterator var10;
      while(var7.hasNext()) {
         if(Openflower106.a(var2 = (List)var7.next())) {
            (var8 = var4.a()).a((Collection)var2);
         } else {
            var8 = var6.a();
         }

         var10 = var2.iterator();

         while(var10.hasNext()) {
            var9 = (Openflower154_SomeSorter)var10.next();
            var1.put(var9, var8);
         }
      }

      Openflower154_SomeSorter var11;
      Iterator var23;
      do {
         var7 = var3.iterator();

         while(var7.hasNext()) {
            Openflower154_SomeSorter var13 = (Openflower154_SomeSorter)var7.next();
            if(var5.c((Object)var13)) {
               var5.b((Object)var13);
               var8 = (Openflower209)var1.get(var13);
               Openflower209 var19 = var4.a();
               List var22 = var13.getDataAsList(1, 1);

               for(int var16 = 0; var16 < var22.size(); ++var16) {
                  var11 = (Openflower154_SomeSorter)var22.get(var16);
                  Openflower209 var12 = (Openflower209)var1.get(var11);
                  if(var16 == 0) {
                     var19.b(var12);
                  } else {
                     var19.c(var12);
                  }
               }

               if(!var19.c((Object)var13)) {
                  var19.a((Object)var13);
               }

               if(!Util.safeEquals((Object)var19, (Object)var8)) {
                  var1.put(var13, var19);
                  List var15 = var13.getDataAsList(1, 0);
                  var6 = null;
                  var23 = var15.iterator();

                  while(var23.hasNext()) {
                     var11 = (Openflower154_SomeSorter)var23.next();
                     var5.a((Object)var11);
                  }
               }
            }
         }
      } while(!var5.c());

      DualArrayList var14 = new DualArrayList();
      List var18 = var0.p();
      HashMap var20 = new HashMap();

      for(int var21 = 0; var21 < var18.size(); ++var21) {
         var20.put(((Openflower154_SomeSorter)var18.get(var21)).id, Integer.valueOf(var21));
      }

      ArrayList var17;
      for(var10 = var3.iterator(); var10.hasNext(); var14.a((Object)var17, (Object)var9.id)) {
         var9 = (Openflower154_SomeSorter)var10.next();
         var17 = new ArrayList();
         var23 = ((Openflower209)var1.get(var9)).iterator();

         while(var23.hasNext()) {
            var11 = (Openflower154_SomeSorter)var23.next();
            var17.add(var11.id);
         }

         Collections.sort(var17, new Openflower86(var20));
         if(var17.size() > 1 && ((Integer)var17.get(0)).intValue() == var9.id.intValue()) {
            var17.add((Integer)var17.remove(0));
         }
      }

      return var14;
   }

   public static Openflower152 a(Openflower12 var0) {
      DualArrayList var1 = new DualArrayList();
      DualArrayList var2;
      Iterator var4 = (var2 = var0.b()).iterator();

      while(var4.hasNext()) {
         Openflower11 var3 = (Openflower11)var4.next();
         var1.a((Object)(new Openflower146(var3)), (Object)Integer.valueOf(var3.a));
      }

      Openflower154_SomeSorter var14 = (Openflower154_SomeSorter)var1.b(Integer.valueOf(var0.c().a));
      Openflower154_SomeSorter var15;
      (var15 = new Openflower154_SomeSorter()).c = 14;
      Openflower152 var10000;
      if(var1.size() > 1) {
         Openflower150 var5 = new Openflower150(var14, var1, (Openflower154_SomeSorter)null);
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            Openflower11 var12 = (Openflower11)var6.next();
            Openflower154_SomeSorter var7 = (Openflower154_SomeSorter)var1.b(Integer.valueOf(var12.a));

            Openflower11 var8;
            Iterator var9;
            Openflower154_SomeSorter var10;
            byte var16;
            for(var9 = var12.f().iterator(); var9.hasNext(); var7.f(new Openflower105(var16, var7, (Openflower154_SomeSorter)(var16 == 8?var5:var10), var16 == 1?null:var5))) {
               var8 = (Openflower11)var9.next();
               if((var10 = (Openflower154_SomeSorter)var1.b(Integer.valueOf(var8.a))) == var14) {
                  var16 = 8;
               } else if(var0.f().contains(var12)) {
                  var16 = 32;
                  var10 = var15;
               } else if(var8.a == var0.e().a) {
                  var16 = 4;
                  var10 = var15;
               } else {
                  var16 = 1;
               }
            }

            var9 = var12.g().iterator();

            while(var9.hasNext()) {
               var8 = (Openflower11)var9.next();
               var10 = (Openflower154_SomeSorter)var1.b(Integer.valueOf(var8.a));
               Openflower13 var17;
               if(!(var17 = var0.a(var8, var12)).a()) {
                  var7.f(new Openflower105(var7, var10, var17.d()));
               }
            }
         }

         var5.n();
         var5.o();
         var10000 = new Openflower152(var5, var15);
      } else {
         Openflower152 var13 = new Openflower152(var14, var15);
         var14.f(new Openflower105(4, var14, var15, var13));
         var10000 = var13;
      }

      Openflower152 var11 = var10000;
      if(!a(var10000, new HashMap())) {
         Configuration.getLogger().writeMessage("parsing failure!", 4);
         throw new RuntimeException("parsing failure!");
      } else {
         Openflower96.a(var11, new HashSet());
         Openflower102.a((Openflower154_SomeSorter)var11);
         var11.o();
         c(var11);
         return var11;
      }
   }

   public static void a(Openflower154_SomeSorter var0) {
      Iterator var1 = var0.t().iterator();

      while(var1.hasNext()) {
         a((Openflower154_SomeSorter)var1.next());
      }

      if(var0.c == 10) {
         ((Openflower156)var0).e();
      }

   }

   private static void c(Openflower154_SomeSorter var0) {
      Iterator var2 = var0.t().iterator();

      Openflower105 var1;
      while(var2.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var2.next();
         var1 = null;
         c(var10000);
      }

      boolean var7;
      if(var0.c == 15) {
         do {
            var7 = false;
            DualArrayList var9 = var0.t();

            for(int var3 = 0; var3 < var9.size() - 1; ++var3) {
               Openflower154_SomeSorter var4;
               if((var4 = (Openflower154_SomeSorter)var9.get(var3)).x()) {
                  Openflower154_SomeSorter var5;
                  Openflower154_SomeSorter var6;
                  for(var6 = var5 = (Openflower154_SomeSorter)var9.get(var3 + 1); var5.c == 15; var5 = var5.s()) {
                     ;
                  }

                  Openflower147 var12;
                  if(var5.c == 12 && (var12 = (Openflower147)var5).s().w() && var12.c().w()) {
                     var4.g((Openflower105)var4.c(1073741824).get(0));
                     var2 = var4.d(1073741824).iterator();

                     while(var2.hasNext()) {
                        var1 = (Openflower105)var2.next();
                        var4.e(var1);
                        var1.b().a(1, var1, var6);
                        var6.d(var1);
                     }

                     var0.t().a(var4.id);
                     var0.h((Openflower154_SomeSorter)var0.t().get(0));
                     Openflower156 var8;
                     (var8 = new Openflower156(var4, var12.s(), var12.c())).m();
                     Iterator var11 = (new HashSet(var12.C())).iterator();

                     while(var11.hasNext()) {
                        Openflower105 var10 = (Openflower105)var11.next();
                        var8.c(var10);
                     }

                     var4.f(new Openflower105(1, var4, var12.s()));
                     var12.B().a((Openflower154_SomeSorter)var12, (Openflower154_SomeSorter)var8);
                     var7 = true;
                     break;
                  }
               }
            }
         } while(var7);
      }

   }

   private static boolean a(Openflower154_SomeSorter var0, HashMap var1) {
      if(var0.c == 13) {
         Openflower154_SomeSorter var9;
         if((var9 = var0.s()).c != 0) {
            return true;
         } else {
            boolean var10;
            if(var10 = a(var9, var1)) {
               var0.a(var9, var9.s());
            }

            return var10;
         }
      } else {
         boolean var2 = var1.isEmpty();

         for(int var3 = 0; var3 < 2; ++var3) {
            for(int var4 = 0; var4 < 5; ++var4) {
               if(var4 > 0) {
                  if(!Openflower120.a(var0)) {
                     if(var3 == 2 || var2) {
                        Configuration.getLogger().writeMessage("Statement cannot be decomposed although reducible!", 4);
                     }
                     break;
                  }

                  if(!Openflower120.b(var0)) {
                     Configuration.getLogger().writeMessage("Irreducible statement cannot be decomposed!", 4);
                     break;
                  }

                  var1 = new HashMap();
                  var2 = true;
               }

               int var5 = 0;

               while(var5 < 2) {
                  boolean var6 = var5 != 0;

                  while(true) {
                     if(b(var0, var1)) {
                        var4 = 0;
                     }

                     if(var0.c == 11) {
                        return true;
                     }

                     Openflower154_SomeSorter var7;
                     if((var7 = a(var0, var6, var1)) == null) {
                        ++var5;
                        break;
                     }

                     boolean var10000 = a(var7, var0.s() == var7?var1:new HashMap());
                     boolean var8 = false;
                     if(!var10000) {
                        return false;
                     }

                     var0.a(var7, var7.s());
                     var1 = new HashMap();
                     var2 = true;
                     var4 = 0;
                  }
               }
            }

            if(var2) {
               break;
            }

            var1 = new HashMap();
         }

         return false;
      }
   }

   private static Openflower154_SomeSorter a(Openflower154_SomeSorter var0, boolean var1, HashMap var2) {
      DualArrayList var3 = var0.t();
      Openflower113 var4;
      if(var2.isEmpty()) {
         var4 = new Openflower113();
         var2.putAll(var4.a(var0));
      }

      DualArrayList var19;
      if(var1) {
         var19 = new DualArrayList();
         var4 = null;
         Iterator var6 = var0.a((List)null).iterator();

         while(var6.hasNext()) {
            Openflower154_SomeSorter var5 = (Openflower154_SomeSorter)var6.next();
            Set var7;
            if((var7 = (Set)var2.get(var5.id)) != null) {
               var19.a((Object)(new ArrayList(var7)), (Object)var5.id);
            }
         }

         Object var8;
         Set var21;
         Integer var24;
         if((var21 = (Set)var2.get(var0.s().id)) != null) {
            for(Iterator var25 = var21.iterator(); var25.hasNext(); ((List)var8).add(var24)) {
               var24 = (Integer)var25.next();
               if((var8 = (List)var19.b(var24)) == null) {
                  var19.a((Object)(var8 = new ArrayList()), (Object)var24);
               }
            }
         }
      } else {
         var19 = b(var0);
      }

      for(int var20 = 0; var20 < var19.size(); ++var20) {
         Integer var22 = (Integer)var19.a(var20);
         List var23 = (List)var19.get(var20);
         if(var2.containsKey(var22) || var23.size() == 1 && ((Integer)var23.get(0)).equals(var22)) {
            Openflower154_SomeSorter var26 = (Openflower154_SomeSorter)var3.b(var22);
            Set var27 = (Set)var2.get(var22);

            for(int var9 = 0; var9 < var23.size(); ++var9) {
               Integer var10;
               Openflower154_SomeSorter var28;
               if(((var10 = (Integer)var23.get(var9)).equals(var22) || var27.contains(var10)) && (var28 = (Openflower154_SomeSorter)var3.b(var10)) != null) {
                  boolean var11 = var28 == var26;
                  HashSet var12 = new HashSet();
                  HashSet var13 = new HashSet();
                  HashSet var14;
                  (var14 = new HashSet()).add(var26);

                  boolean var15;
                  Openflower154_SomeSorter var17;
                  Iterator var16;
                  Openflower154_SomeSorter var29;
                  do {
                     var15 = false;
                     var16 = var14.iterator();

                     while(var16.hasNext()) {
                        var17 = (Openflower154_SomeSorter)var16.next();
                        if(!var12.contains(var17)) {
                           boolean var18;
                           if(!(var18 = var12.size() == 0)) {
                              List var32 = var17.getDataAsList(2, 0);
                              var18 = var12.containsAll(var32) && (var12.size() > var32.size() || var12.size() == 1);
                           }

                           if(var18) {
                              LinkedList var31;
                              (var31 = new LinkedList()).add(var17);

                              while(!var31.isEmpty()) {
                                 var29 = (Openflower154_SomeSorter)var31.remove(0);
                                 if(!var12.contains(var29) && (var11 || var29 != var28)) {
                                    var12.add(var29);
                                    if(var29 != var26) {
                                       var13.addAll(var29.getDataAsList(1, 0));
                                    }

                                    var31.addAll(var29.getDataAsList(1, 1));
                                    var14.addAll(var29.getDataAsList(2, 1));
                                 }
                              }

                              var15 = true;
                              var14.remove(var17);
                              break;
                           }
                        }
                     }
                  } while(var15);

                  var14.clear();
                  var16 = var12.iterator();

                  while(var16.hasNext()) {
                     var29 = (Openflower154_SomeSorter)var16.next();
                     var14.addAll(var29.getDataAsList(2, 1));
                  }

                  var14.removeAll(var12);
                  var15 = true;
                  var16 = var14.iterator();

                  while(var16.hasNext()) {
                     Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var16.next();
                     var17 = null;
                     if(!var10000.getDataAsList(2, 0).containsAll(var12)) {
                        var15 = false;
                        break;
                     }
                  }

                  if(var15) {
                     var17 = null;
                     var13.removeAll(var12);
                     if(var13.size() == 0 && (var12.size() > 1 || var26.getDataAsList(1, 0).contains(var26)) && var12.size() < var3.size() && a(var12)) {
                        Openflower150 var30 = new Openflower150(var26, var12, var11?null:var28);
                        var0.d((Openflower154_SomeSorter)var30);
                        return var30;
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   private static boolean a(HashSet var0) {
      Iterator var2 = var0.iterator();

      List var3;
      do {
         Openflower154_SomeSorter var1;
         do {
            if(!var2.hasNext()) {
               return true;
            }
         } while(!(var1 = (Openflower154_SomeSorter)var2.next()).x());

         if((var3 = var1.c(1073741824)).size() != 1 || ((Openflower105)var3.get(0)).a() != 1) {
            return false;
         }
      } while(var0.contains(((Openflower105)var3.get(0)).c()));

      return false;
   }

   private static boolean b(Openflower154_SomeSorter var0, HashMap var1) {
      boolean var3 = false;

      while(true) {
         boolean var2 = false;
         Openflower154_SomeSorter var4 = null;
         Iterator var5 = var0.a((List)null).iterator();

         while(true) {
            if(var5.hasNext()) {
               Openflower154_SomeSorter var6;
               if((var4 = (var6 = Openflower149_LoopPrinter.a(var4 = (Openflower154_SomeSorter)var5.next())) != null?var6:((var6 = Openflower155_SwitchPrinter.a(var4)) != null?var6:((var6 = Openflower151.a(var4)) != null?var6:((var6 = Openflower153.a(var4)) != null?var6:((var6 = Openflower148.a(var4)) != null?var6:((var6 = Openflower147.a(var4)) != null?var6:null)))))) == null) {
                  continue;
               }

               if(var0.c == 0 && var4.s() == var0.s() && var0.t().size() == var4.t().size()) {
                  var0.c = 11;
               }

               var0.d(var4);
               if(!var1.isEmpty()) {
                  HashSet var9 = new HashSet();
                  Iterator var13 = var4.t().iterator();

                  while(var13.hasNext()) {
                     Openflower154_SomeSorter var10 = (Openflower154_SomeSorter)var13.next();
                     var9.add(var10.id);
                  }

                  Integer var12 = var4.id;
                  Iterator var11 = (new ArrayList((Collection)var1.keySet())).iterator();

                  while(var11.hasNext()) {
                     Integer var14 = (Integer)var11.next();
                     Set var7;
                     int var8 = (var7 = (Set)var1.get(var14)).size();
                     var7.removeAll(var9);
                     if(var9.contains(var14)) {
                        Object var15;
                        if((var15 = (Set)var1.get(var12)) == null) {
                           var1.put(var12, var15 = new HashSet());
                        }

                        ((Set)var15).addAll(var7);
                        var1.remove(var14);
                     } else if(var7.size() < var8) {
                        var7.add(var12);
                     }
                  }
               }

               var2 = true;
            }

            if(var2) {
               var3 = true;
            }

            if(!var2) {
               return var3;
            }
            break;
         }
      }
   }
}
