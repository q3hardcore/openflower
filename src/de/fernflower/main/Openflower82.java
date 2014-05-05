package de.fernflower.main;

import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower12;
import de.fernflower.main.Openflower13;
import de.fernflower.main.Openflower7;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Openflower82 {

   public static void a(Openflower12 var0) {
      LinkedList var1 = new LinkedList();
      HashSet var2 = new HashSet();
      var1.add(var0.c());
      var2.add(var0.c());

      while(!var1.isEmpty()) {
         Openflower11 var3 = (Openflower11)var1.removeFirst();
         ArrayList var4;
         (var4 = new ArrayList(var3.f())).addAll(var3.g());
         Iterator var7 = var4.iterator();

         while(var7.hasNext()) {
            var3 = (Openflower11)var7.next();
            if(!var2.contains(var3)) {
               var1.add(var3);
               var2.add(var3);
            }
         }
      }

      HashSet var5;
      (var5 = new HashSet(var0.b())).removeAll(var2);
      Iterator var6 = var5.iterator();

      while(var6.hasNext()) {
         Openflower11 var8 = (Openflower11)var6.next();
         var0.a(var8);
      }

   }

   public static void b(Openflower12 var0) {
      DualArrayList var1 = var0.b();

      while(true) {
         boolean var2 = false;
         int var3 = var1.size() - 1;

         while(true) {
            if(var3 >= 0) {
               Openflower11 var4 = (Openflower11)var1.get(var3);
               if(!a(var0, var4, false)) {
                  --var3;
                  continue;
               }

               var2 = true;
            }

            if(!var2) {
               return;
            }
            break;
         }
      }
   }

   private static boolean a(Openflower12 var0, Openflower11 var1, boolean var2) {
      boolean var3 = false;
      if(var1.e().e()) {
         if(var1.f().size() > 1) {
            if(var1.d().size() > 1) {
               throw new RuntimeException("ERROR: empty block with multiple predecessors and successors found");
            }

            if(!var2) {
               throw new RuntimeException("ERROR: empty block with multiple successors found");
            }
         }

         HashSet var4 = new HashSet(var0.e().d());
         if(var1.h().isEmpty() && (!var4.contains(var1) || var1.d().size() == 1)) {
            Openflower11 var10;
            if(var4.contains(var1) && ((var10 = (Openflower11)var1.d().get(0)).f().size() != 1 || !var10.e().e() && var10.e().c().b == 3)) {
               return false;
            }

            List var11;
            for(int var5 = (var11 = var0.d()).size() - 1; var5 >= 0; --var5) {
               Openflower13 var6;
               List var7;
               if((var7 = (var6 = (Openflower13)var11.get(var5)).c()).size() == 1 && var7.get(0) == var1) {
                  if(!Configuration.getBoolean("rer")) {
                     return false;
                  }

                  var1.f(var6.b());
                  var11.remove(var5);
                  var3 = true;
               }
            }

            HashSet var12 = new HashSet(var1.f());
            HashSet var13 = new HashSet(var1.d());
            Iterator var8;
            Iterator var9;
            Openflower11 var14;
            if(var2) {
               (var14 = (Openflower11)var1.d().get(0)).d(var1);
               ArrayList var10000 = new ArrayList(var1.f());
               var9 = null;
               var8 = var10000.iterator();

               while(var8.hasNext()) {
                  var10 = (Openflower11)var8.next();
                  var1.d(var10);
                  var14.c(var10);
               }
            } else {
               var9 = var13.iterator();

               while(var9.hasNext()) {
                  var14 = (Openflower11)var9.next();
                  var8 = var12.iterator();

                  while(var8.hasNext()) {
                     var10 = (Openflower11)var8.next();
                     var14.a(var1, var10);
                  }
               }
            }

            HashSet var15;
            if((var15 = var0.f()).contains(var1)) {
               var15.remove(var1);
               var15.add((Openflower11)var13.iterator().next());
            }

            if(var0.c() == var1) {
               if(var12.size() != 1) {
                  throw new RuntimeException("multiple or no entry blocks!");
               }

               var0.b((Openflower11)var12.iterator().next());
            }

            var0.a(var1);
            if(var3) {
               a(var0);
            }
         }
      }

      return var3;
   }

   public static boolean a(Openflower12 var0, Openflower11 var1, Openflower11 var2) {
      HashSet var3 = new HashSet();
      if(var1 == var2) {
         return true;
      } else {
         LinkedList var4;
         (var4 = new LinkedList()).add(var1);

         while(!var4.isEmpty()) {
            var1 = (Openflower11)var4.remove(0);
            if(!var3.contains(var1)) {
               var3.add(var1);
               if(var1 == var0.c()) {
                  return false;
               }

               int var5;
               Openflower11 var6;
               for(var5 = 0; var5 < var1.d().size(); ++var5) {
                  var6 = (Openflower11)var1.d().get(var5);
                  if(!var3.contains(var6) && var6 != var2) {
                     var4.add(var6);
                  }
               }

               for(var5 = 0; var5 < var1.h().size(); ++var5) {
                  var6 = (Openflower11)var1.h().get(var5);
                  if(!var3.contains(var6) && var6 != var2) {
                     var4.add(var6);
                  }
               }
            }
         }

         return true;
      }
   }

   public static void c(Openflower12 var0) {
      Iterator var2 = var0.b().iterator();

      while(var2.hasNext()) {
         Openflower11 var1;
         Opcode var3;
         if((var3 = (var1 = (Openflower11)var2.next()).c()) != null && var3.opcode == 167) {
            var1.e().a(var1.e().d() - 1);
         }
      }

      b(var0);
   }

   public static void d(Openflower12 var0) {
      Iterator var2 = var0.b().iterator();

      while(var2.hasNext()) {
         Openflower11 var1;
         Openflower7 var3;
         int var4;
         if((var4 = (var3 = (var1 = (Openflower11)var2.next()).e()).d()) > 0 && var4 < 3) {
            boolean var5 = false;
            if(var3.c().opcode >= 172 && var3.c().opcode <= 177) {
               label58: {
                  if(var4 != 1) {
                     if(var3.c().opcode == 177) {
                        break label58;
                     }

                     switch(var3.b(0).opcode) {
                     case 1:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                        break;
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     default:
                        break label58;
                     }
                  }

                  var5 = true;
               }
            }

            if(var5) {
               Openflower11 var6;
               Openflower11 var13;
               Openflower13 var10000;
               Iterator var14;
               if(!var1.d().isEmpty()) {
                  HashSet var8 = new HashSet();
                  HashSet var11 = new HashSet();
                  var5 = true;

                  for(Iterator var7 = var1.d().iterator(); var7.hasNext(); var8.addAll(var6.g())) {
                     var6 = (Openflower11)var7.next();
                     if(var5) {
                        var11.addAll(var6.g());
                        var5 = false;
                     } else {
                        var11.retainAll(var6.g());
                     }
                  }

                  var11.removeAll(var1.g());
                  var6 = (Openflower11)var1.d().get(0);
                  Iterator var12 = var11.iterator();

                  while(var12.hasNext()) {
                     Openflower11 var15 = (Openflower11)var12.next();
                     var10000 = var0.a(var15, var6);
                     var14 = null;
                     var10000.c().add(var1);
                     var1.e(var15);
                  }

                  HashSet var17;
                  (var17 = new HashSet(var1.g())).removeAll(var8);
                  var14 = var17.iterator();

                  while(var14.hasNext()) {
                     var13 = (Openflower11)var14.next();
                     Openflower13 var9;
                     if((var9 = var0.a(var13, var1)).c().size() > 1) {
                        var9.c().remove(var1);
                        var1.f(var13);
                     }
                  }
               }

               Openflower11 var10;
               if(var1.d().size() == 1 && var1.h().isEmpty() && (var10 = (Openflower11)var1.d().get(0)).f().size() == 1) {
                  var14 = var10.g().iterator();

                  while(var14.hasNext()) {
                     var13 = (Openflower11)var14.next();
                     if(!var1.g().contains(var13)) {
                        var10000 = var0.a(var13, var10);
                        var6 = null;
                        var10000.c().add(var1);
                        var1.e(var13);
                     }
                  }

                  var14 = (new HashSet(var1.g())).iterator();

                  while(var14.hasNext()) {
                     var13 = (Openflower11)var14.next();
                     Openflower13 var16;
                     if(!var10.g().contains(var13) && (var16 = var0.a(var13, var1)).c().size() > 1) {
                        var16.c().remove(var1);
                        var1.f(var13);
                     }
                  }
               }
            }
         }
      }

   }

   public static void e(Openflower12 var0) {
      boolean var1;
      do {
         var1 = false;
         Iterator var3 = var0.b().iterator();

         while(var3.hasNext()) {
            Openflower11 var2;
            Openflower7 var4 = (var2 = (Openflower11)var3.next()).e();
            Openflower11 var5;
            if(var2.f().size() == 1 && (var5 = (Openflower11)var2.f().get(0)) != var0.e() && (var4.e() || var4.c().b != 3) && var5.d().size() == 1 && var5.h().isEmpty() && var5 != var0.c()) {
               boolean var6 = true;
               Iterator var8 = var0.d().iterator();

               while(var8.hasNext()) {
                  Openflower13 var7;
                  if((var7 = (Openflower13)var8.next()).c().contains(var2) ^ var7.c().contains(var5)) {
                     var6 = false;
                     break;
                  }
               }

               if(var6) {
                  Openflower7 var10 = var5.e();
                  Openflower7 var9 = var4;

                  for(int var11 = 0; var11 < var10.d(); ++var11) {
                     var9.a(var10.b(var11), -1);
                  }

                  var5.e().b();
                  a(var0, var5, true);
                  var1 = true;
                  break;
               }
            }
         }
      } while(var1);

   }
}
