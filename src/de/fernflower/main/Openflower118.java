package de.fernflower.main;

import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower114;
import de.fernflower.main.Openflower117;
import de.fernflower.main.Openflower12;
import de.fernflower.main.Openflower13;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower9;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower118 {

   public static void a(Openflower12 var0) {
      ArrayList var1 = new ArrayList();
      Iterator var3 = var0.d().iterator();

      Iterator var6;
      while(var3.hasNext()) {
         Openflower13 var2 = (Openflower13)var3.next();
         boolean var4 = false;
         var6 = var1.iterator();

         while(true) {
            if(var6.hasNext()) {
               Object[] var5;
               if((var5 = (Object[])var6.next())[0] != var2.b() || !Util.safeEquals((Object)var2.d(), var5[1])) {
                  continue;
               }

               ((HashSet)var5[2]).addAll(var2.c());
               var4 = true;
            }

            if(!var4) {
               var1.add(new Object[]{var2.b(), var2.d(), new HashSet(var2.c()), var2});
            }
            break;
         }
      }

      var3 = var1.iterator();

      while(var3.hasNext()) {
         Object[] var13;
         if((var13 = (Object[])var3.next())[1] != null) {
            Openflower11 var15;
            Openflower7 var14 = (var15 = (Openflower11)var13[0]).e();
            var6 = null;
            Opcode var16;
            if(var14.d() > 0 && ((var16 = var14.b(0)).opcode == 87 || var16.opcode == 58)) {
               HashSet var7 = new HashSet((HashSet)var13[2]);
               Iterator var9 = var1.iterator();

               while(var9.hasNext()) {
                  Object[] var8 = (Object[])var9.next();
                  if(var13 != var8) {
                     HashSet var10 = new HashSet((HashSet)var8[2]);
                     if(!var7.contains(var8[0]) && !var10.contains(var15) && (var8[1] == null || var10.containsAll(var7))) {
                        if(var8[1] == null) {
                           var10.retainAll(var7);
                        } else {
                           var10.removeAll(var7);
                        }

                        if(!var10.isEmpty()) {
                           Openflower11 var18 = var15;
                           if(var14.d() > 1) {
                              var18 = new Openflower11(++var0.a);
                              Openflower9 var11;
                              (var11 = new Openflower9()).a(var16.b(), -1);
                              var18.a((Openflower7)var11);
                              var0.b().a((Object)var18, (Object)Integer.valueOf(var18.a));
                              ArrayList var17;
                              (var17 = new ArrayList()).addAll(var15.d());
                              var17.addAll(var15.h());
                              Iterator var12 = var17.iterator();

                              while(var12.hasNext()) {
                                 ((Openflower11)var12.next()).a(var15, var18);
                              }

                              var12 = var0.d().iterator();

                              while(var12.hasNext()) {
                                 Openflower13 var19;
                                 if((var19 = (Openflower13)var12.next()).b() == var15) {
                                    var19.a(var18);
                                 } else if(var19.c().contains(var15)) {
                                    var18.e(var19.b());
                                    var19.c().add(var18);
                                 }
                              }

                              var18.c(var15);
                              if(var0.c() == var15) {
                                 var0.b(var18);
                              }

                              var14.a(0);
                           }

                           var18.e((Openflower11)var8[0]);
                           ((Openflower13)var8[3]).c().add(var18);
                           var14 = (var15 = ((Openflower13)var13[3]).b()).e();
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static void b(Openflower12 var0) {
      HashSet var1 = new HashSet();
      Iterator var3 = var0.d().iterator();

      while(var3.hasNext()) {
         Openflower13 var10000 = (Openflower13)var3.next();
         Openflower11 var2 = null;
         var2 = var10000.b();
         if(!var1.contains(var2)) {
            var1.add(var2);
            Openflower11 var4 = new Openflower11(++var0.a);
            var0.b().a((Object)var4, (Object)Integer.valueOf(var4.a));
            ArrayList var5;
            (var5 = new ArrayList()).addAll(var2.h());
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
               ((Openflower11)var6.next()).a(var2, var4);
            }

            var6 = var0.d().iterator();

            while(var6.hasNext()) {
               Openflower13 var7;
               if((var7 = (Openflower13)var6.next()).b() == var2) {
                  var7.a(var4);
               } else if(var7.c().contains(var2)) {
                  var4.e(var7.b());
                  var7.c().add(var4);
               }
            }

            var4.c(var2);
            if(var0.c() == var2) {
               var0.b(var4);
            }
         }
      }

   }

   public static void removeEmptyExceptions(Openflower12 var0) {
      List var5;
      int var1 = (var5 = var0.d()).size() - 1;

      while(var1 >= 0) {
         Openflower13 var2 = (Openflower13)var5.get(var1);
         boolean var3 = true;
         Iterator var4 = var2.c().iterator();

         while(true) {
            if(var4.hasNext()) {
               if(((Openflower11)var4.next()).e().e()) {
                  continue;
               }

               var3 = false;
            }

            if(var3) {
               var4 = var2.c().iterator();

               while(var4.hasNext()) {
                  ((Openflower11)var4.next()).f(var2.b());
               }

               var5.remove(var1);
            }

            --var1;
            break;
         }
      }

   }

   public static void d(Openflower12 var0) {
      Openflower114 var1;
      (var1 = new Openflower114(new Openflower117(var0))).a();

      List var13;
      for(int var2 = (var13 = var0.d()).size() - 1; var2 >= 0; --var2) {
         Openflower13 var3;
         Openflower11 var4 = (var3 = (Openflower13)var13.get(var2)).b();
         List var5;
         if((var5 = var3.c()).contains(var4)) {
            Openflower114 var6 = var1;
            var3 = var3;
            ArrayList var7 = new ArrayList();
            LinkedList var8 = new LinkedList();
            HashSet var9 = new HashSet();
            Openflower11 var10 = var3.b();
            var8.addFirst(var10);

            while(!var8.isEmpty()) {
               Openflower11 var11 = (Openflower11)var8.removeFirst();
               var9.add(var11);
               if(var3.c().contains(var11) && var6.a(var11, var10)) {
                  var7.add(var11);
                  ArrayList var12;
                  (var12 = new ArrayList(var11.f())).addAll(var11.g());
                  Iterator var16 = var12.iterator();

                  while(var16.hasNext()) {
                     var11 = (Openflower11)var16.next();
                     if(!var9.contains(var11)) {
                        var8.add(var11);
                     }
                  }
               }
            }

            if(var7.size() < var5.size() || var5.size() == 1) {
               Iterator var15 = var7.iterator();

               while(var15.hasNext()) {
                  Openflower11 var14;
                  (var14 = (Openflower11)var15.next()).f(var4);
                  var5.remove(var14);
               }
            }

            if(var5.isEmpty()) {
               var13.remove(var2);
            }
         }
      }

   }

   public static boolean e(Openflower12 var0) {
      Openflower11 var1 = var0.c();
      HashMap var2 = new HashMap();

      Iterator var3;
      HashSet var4;
      Openflower13 var7;
      for(var3 = var0.d().iterator(); var3.hasNext(); var4.addAll(var7.c())) {
         var7 = (Openflower13)var3.next();
         if((var4 = (HashSet)var2.get(var7.b())) == null) {
            var2.put(var7.b(), var4 = new HashSet());
         }
      }

      var3 = var2.entrySet().iterator();

      Entry var8;
      do {
         do {
            if(!var3.hasNext()) {
               return false;
            }

            var8 = (Entry)var3.next();
            var4 = new HashSet();
            Iterator var5 = ((HashSet)var8.getValue()).iterator();

            while(var5.hasNext()) {
               Openflower11 var9 = (Openflower11)var5.next();
               HashSet var6;
               (var6 = new HashSet(var9.d())).removeAll((Collection)var8.getValue());
               if(!var6.isEmpty()) {
                  var4.add(var9);
               }
            }
         } while(var4.isEmpty());
      } while(var4.size() <= 1 && !((HashSet)var8.getValue()).contains(var1));

      return true;
   }
}
