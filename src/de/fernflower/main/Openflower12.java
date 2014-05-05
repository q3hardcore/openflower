package de.fernflower.main;

import de.fernflower.main.ConstPool;
import de.fernflower.main.Descriptor;
import de.fernflower.main.ExceptionEntry;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower0;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower13;
import de.fernflower.main.Openflower14;
import de.fernflower.main.Openflower197;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower82;
import de.fernflower.main.Openflower9;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.classreader.opcodes.Openflower10;
import de.fernflower.main.classreader.opcodes.Openflower8;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.LIFOQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower12 implements Openflower0 {

   public int a = 0;
   private DualArrayList b;
   private Openflower11 c;
   private Openflower11 d;
   private List f;
   private HashMap g;
   private HashSet h = new HashSet();


   public Openflower12(Openflower7 var1) {
      short[] var2 = a(var1);
      HashMap var3 = new HashMap();
      DualArrayList var4 = this.a(var2, var1, var3);
      this.b = var4;
      a((List)var4, var3);
      this.a(var1, var3);
      this.h();
      this.i();
   }

   private void g() {
      for(Iterator var1 = this.b.iterator(); var1.hasNext(); ((Openflower11)var1.next()).b = 0) {
         ;
      }

   }

   public final String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         Openflower11 var2 = (Openflower11)var3.next();
         var1.append("----- Block " + var2.a + " -----\r\n");
         var1.append(var2.toString());
         var1.append("----- Edges -----\r\n");
         List var4 = var2.f();

         int var5;
         for(var5 = 0; var5 < var4.size(); ++var5) {
            var1.append(">>>>>>>>(regular) Block " + ((Openflower11)var4.get(var5)).a + "\r\n");
         }

         var4 = var2.g();

         for(var5 = 0; var5 < var4.size(); ++var5) {
            Openflower11 var6 = (Openflower11)var4.get(var5);
            Openflower13 var7 = this.a(var6, var2);
            var1.append(">>>>>>>>(exception) Block " + var6.a + "\t" + (var7 == null?"ERROR: range not found!":var7.d()) + "\r\n");
         }

         var1.append("----- ----- -----\r\n");
      }

      return var1.toString();
   }

   public final void a(MethodInfo var1) {
      Openflower12 var2 = this;

      while(true) {
         Openflower12 var3 = var2;
         ArrayList var4 = new ArrayList();
         Iterator var6 = var2.g.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var5;
            Openflower11 var7 = (Openflower11)(var5 = (Entry)var6.next()).getKey();
            Openflower11 var8 = (Openflower11)var5.getValue();
            var4.add(new Object[]{var7, var3.b(var7, var8), var8});
         }

         ArrayList var12 = new ArrayList();
         Iterator var15 = var4.iterator();

         while(var15.hasNext()) {
            Object[] var14 = (Object[])var15.next();

            int var17;
            for(var17 = 0; var17 < var12.size() && !((HashSet)((Object[])var12.get(var17))[1]).contains(var14[0]); ++var17) {
               ;
            }

            var12.add(var17, var14);
         }

         int var13 = 0;

         label42:
         while(true) {
            boolean var10000;
            if(var13 >= var12.size()) {
               var10000 = false;
            } else {
               Object[] var16;
               HashSet var19 = (HashSet)(var16 = (Object[])var12.get(var13))[1];
               int var11 = var13 + 1;

               while(true) {
                  if(var11 >= var12.size()) {
                     ++var13;
                     continue label42;
                  }

                  Object[] var9;
                  HashSet var10 = (HashSet)(var9 = (Object[])var12.get(var11))[1];
                  if(!var19.contains(var9[0]) && !var10.contains(var16[0])) {
                     HashSet var18;
                     (var18 = new HashSet(var19)).retainAll(var10);
                     if(!var18.isEmpty()) {
                        var3.a((Openflower11)var16[0], (Openflower11)var16[2], var18);
                        var10000 = true;
                        break;
                     }
                  }

                  ++var11;
               }
            }

            if(!var10000) {
               this.a(var1.getOwner().getConstPool(), this.c, Openflower197.a(var1));
               this.g();
               Openflower82.b(this);
               return;
            }
            break;
         }
      }
   }

   public final void a(Openflower11 var1) {
      while(var1.f().size() > 0) {
         var1.d((Openflower11)var1.f().get(0));
      }

      while(var1.g().size() > 0) {
         var1.f((Openflower11)var1.g().get(0));
      }

      while(var1.d().size() > 0) {
         ((Openflower11)var1.d().get(0)).d(var1);
      }

      while(var1.h().size() > 0) {
         ((Openflower11)var1.h().get(0)).f(var1);
      }

      this.d.b(var1);
      this.b.a(Integer.valueOf(var1.a));

      for(int var2 = this.f.size() - 1; var2 >= 0; --var2) {
         Openflower13 var3;
         if((var3 = (Openflower13)this.f.get(var2)).b() == var1) {
            this.f.remove(var2);
         } else {
            List var5;
            (var5 = var3.c()).remove(var1);
            if(var5.isEmpty()) {
               this.f.remove(var2);
            }
         }
      }

      Iterator var4 = this.g.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var6;
         if((var6 = (Entry)var4.next()).getKey() == var1 || var6.getValue() == var1) {
            var4.remove();
         }
      }

   }

   public final Openflower13 a(Openflower11 var1, Openflower11 var2) {
      for(int var3 = this.f.size() - 1; var3 >= 0; --var3) {
         Openflower13 var4;
         if((var4 = (Openflower13)this.f.get(var3)).b() == var1 && var4.c().contains(var2)) {
            return var4;
         }
      }

      return null;
   }

   private static short[] a(Openflower7 var0) {
      int var1;
      short[] var2 = new short[var1 = var0.d()];
      HashSet var3 = new HashSet();
      Iterator var5 = var0.h().a().iterator();

      while(var5.hasNext()) {
         ExceptionEntry var4 = (ExceptionEntry)var5.next();
         var3.add(Integer.valueOf(var4.from_instr));
         var3.add(Integer.valueOf(var4.to_instr));
         var3.add(Integer.valueOf(var4.handler_instr));
      }

      for(int var8 = 0; var8 < var1; ++var8) {
         if(var3.contains(new Integer(var8))) {
            var2[var8] = 1;
         }

         Opcode var9;
         switch((var9 = var0.b(var8)).b) {
         case 2:
            var2[((Openflower8)var9).values] = 1;
         case 6:
            if(var8 + 1 < var1) {
               var2[var8 + 1] = 1;
            }
            break;
         case 3:
            int[] var6;
            Openflower10 var10;
            for(int var7 = (var6 = (var10 = (Openflower10)var9).d()).length - 1; var7 >= 0; --var7) {
               var2[var6[var7]] = 1;
            }

            var2[var10.e()] = 1;
            if(var8 + 1 < var1) {
               var2[var8 + 1] = 1;
            }
         case 4:
         case 5:
         default:
            break;
         }
      }

      var2[0] = 1;
      return var2;
   }

   private DualArrayList a(short[] var1, Openflower7 var2, HashMap var3) {
      DualArrayList var4 = new DualArrayList();
      Openflower9 var5 = null;
      ArrayList var6 = null;
      int var7 = var1.length;
      short var8 = 0;
      int var9 = 0;
      Openflower11 var10 = null;

      for(int var11 = 0; var11 < var7; ++var11) {
         if(var1[var11] == 1) {
            (var10 = new Openflower11()).a = ++var8;
            var5 = new Openflower9();
            var6 = new ArrayList();
            var10.a((Openflower7)var5);
            var10.a((List)var6);
            var4.a((Object)var10, (Object)Integer.valueOf(var10.a));
            var9 = var2.c(var11);
         }

         var1[var11] = var8;
         var3.put(Integer.valueOf(var11), var10);
         var5.a(var2.b(var11), var2.c(var11) - var9);
         var6.add(Integer.valueOf(var2.c(var11)));
      }

      this.a = var8;
      return var4;
   }

   private static void a(List var0, HashMap var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         Openflower11 var3;
         Opcode var4;
         Opcode var5;
         boolean var9 = (var5 = var4 = (var3 = (Openflower11)var0.get(var2)).c()).opcode != 167 && var5.opcode != 200 && var5.opcode != 169 && (var5.opcode < 172 || var5.opcode > 177) && var5.opcode != 191 && var5.opcode != 168 && var5.opcode != 170 && var5.opcode != 171;
         Openflower11 var8;
         switch(var4.b) {
         case 2:
            int var10 = ((Openflower8)var4).values;
            var8 = (Openflower11)var1.get(Integer.valueOf(var10));
            var3.c(var8);
            break;
         case 3:
            Openflower10 var10000 = (Openflower10)var4;
            Object var6 = null;
            int[] var11 = var10000.d();
            var8 = (Openflower11)var1.get(Integer.valueOf(((Openflower10)var4).e()));
            var3.c(var8);

            for(int var7 = 0; var7 < var11.length; ++var7) {
               var8 = (Openflower11)var1.get(Integer.valueOf(var11[var7]));
               var3.c(var8);
            }
         }

         if(var9 && var2 < var0.size() - 1) {
            var8 = (Openflower11)var0.get(var2 + 1);
            var3.c(var8);
         }
      }

   }

   private void a(Openflower7 var1, HashMap var2) {
      this.f = new ArrayList();
      Iterator var3 = var1.h().a().iterator();

      while(var3.hasNext()) {
         ExceptionEntry var9 = (ExceptionEntry)var3.next();
         Openflower11 var4 = (Openflower11)var2.get(Integer.valueOf(var9.from_instr));
         Openflower11 var5 = (Openflower11)var2.get(Integer.valueOf(var9.to_instr));
         Openflower11 var6 = (Openflower11)var2.get(Integer.valueOf(var9.handler_instr));
         ArrayList var7 = new ArrayList();

         for(int var10 = var4.a; var10 < var5.a; ++var10) {
            Openflower11 var8 = (Openflower11)this.b.b(Integer.valueOf(var10));
            var7.add(var8);
            var8.e(var6);
         }

         this.f.add(new Openflower13(var7, var6, var9.exceptionClass));
      }

   }

   private void h() {
      HashMap var1 = new HashMap();
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         Openflower11 var2;
         if((var2 = (Openflower11)var3.next()).e().c().opcode == 168) {
            LinkedList var4 = new LinkedList();
            LinkedList var5 = new LinkedList();
            HashSet var6 = new HashSet();
            var4.add(var2);
            var5.add(new LinkedList());

            while(!var4.isEmpty()) {
               var2 = (Openflower11)var4.removeFirst();
               LinkedList var7 = (LinkedList)var5.removeFirst();
               var6.add(var2);
               Openflower11 var8;
               switch(var2.e().c().opcode) {
               case 168:
                  var7.add(var2);
                  break;
               case 169:
                  var8 = (Openflower11)var7.getLast();
                  Openflower11 var9;
                  if((var9 = (Openflower11)this.b.b(Integer.valueOf(var8.a + 1))) == null) {
                     throw new RuntimeException("ERROR: last instruction jsr");
                  }

                  if(!var2.g(var9)) {
                     var2.c(var9);
                  }

                  var7.removeLast();
                  var1.put(var8, var9);
               }

               if(!var7.isEmpty()) {
                  Iterator var10 = var2.f().iterator();

                  while(var10.hasNext()) {
                     var8 = (Openflower11)var10.next();
                     if(!var6.contains(var8)) {
                        var4.add(var8);
                        var5.add(new LinkedList(var7));
                     }
                  }
               }
            }
         }
      }

      this.g = var1;
   }

   private HashSet b(Openflower11 var1, Openflower11 var2) {
      HashSet var3 = new HashSet();
      LinkedList var4;
      (var4 = new LinkedList()).add(var1);
      Openflower11 var5 = (Openflower11)var1.f().get(0);

      while(!var4.isEmpty()) {
         Openflower11 var6 = (Openflower11)var4.remove(0);

         for(int var7 = 0; var7 < 2; ++var7) {
            List var8;
            if(var7 == 0) {
               if(var6.c().opcode == 169 && var6.f().contains(var2)) {
                  continue;
               }

               var8 = var6.f();
            } else {
               if(var6 == var1) {
                  continue;
               }

               var8 = var6.g();
            }

            label60:
            for(int var9 = var8.size() - 1; var9 >= 0; --var9) {
               Openflower11 var10 = (Openflower11)var8.get(var9);
               if(!var3.contains(var10)) {
                  if(var6 != var1) {
                     int var11;
                     for(var11 = 0; var11 < var10.d().size(); ++var11) {
                        if(!Openflower82.a(this, (Openflower11)var10.d().get(var11), var5)) {
                           continue label60;
                        }
                     }

                     for(var11 = 0; var11 < var10.h().size(); ++var11) {
                        if(!Openflower82.a(this, (Openflower11)var10.h().get(var11), var5)) {
                           continue label60;
                        }
                     }
                  }

                  if(var10 != this.d) {
                     var3.add(var10);
                  }

                  var4.add(var10);
               }
            }
         }
      }

      return var3;
   }

   private void a(Openflower11 var1, Openflower11 var2, HashSet var3) {
      LinkedList var4 = new LinkedList();
      HashMap var5 = new HashMap();
      var4.add(var1);
      var5.put(Integer.valueOf(var1.a), var1);

      while(!var4.isEmpty()) {
         Openflower11 var6 = (Openflower11)var4.remove(0);

         for(int var7 = 0; var7 < 2; ++var7) {
            List var8;
            if(var7 == 0) {
               if(var6.c().opcode == 169 && var6.f().contains(var2)) {
                  continue;
               }

               var8 = var6.f();
            } else {
               if(var6 == var1) {
                  continue;
               }

               var8 = var6.g();
            }

            for(int var9 = var8.size() - 1; var9 >= 0; --var9) {
               Openflower11 var10;
               Integer var11 = Integer.valueOf((var10 = (Openflower11)var8.get(var9)).a);
               if(var5.containsKey(var11)) {
                  var6.a(var10, (Openflower11)var5.get(var11));
               } else if(var3.contains(var10)) {
                  Openflower11 var12;
                  (var12 = (Openflower11)var10.clone()).a = ++this.a;
                  int var13;
                  if(var12.c().opcode == 169 && var10.f().contains(var2)) {
                     var12.c(var2);
                     var10.d(var2);
                  } else {
                     for(var13 = 0; var13 < var10.f().size(); ++var13) {
                        var12.c((Openflower11)var10.f().get(var13));
                     }
                  }

                  for(var13 = 0; var13 < var10.g().size(); ++var13) {
                     var12.e((Openflower11)var10.g().get(var13));
                  }

                  var4.add(var12);
                  var5.put(var11, var12);
                  if(this.d.d().contains(var10)) {
                     this.d.a(var12);
                  }

                  var6.a(var10, var12);
                  this.b.a((Object)var12, (Object)Integer.valueOf(var12.a));
               } else {
                  var5.put(var11, var10);
               }
            }
         }
      }

      this.a(var3, var5);
   }

   private void a(HashSet var1, HashMap var2) {
      for(int var3 = this.f.size() - 1; var3 >= 0; --var3) {
         Openflower13 var4;
         Object var5 = (var4 = (Openflower13)this.f.get(var3)).c();
         HashSet var6;
         (var6 = new HashSet(var1)).retainAll((Collection)var5);
         if(var6.size() > 0) {
            if(var6.size() == ((List)var5).size()) {
               var5 = new ArrayList();
               var4 = new Openflower13((List)var5, (Openflower11)var2.get(Integer.valueOf(var4.b().a)), var4.d());
               this.f.add(var4);
            }

            Iterator var8 = var6.iterator();

            while(var8.hasNext()) {
               Openflower11 var7 = (Openflower11)var8.next();
               ((List)var5).add((Openflower11)var2.get(Integer.valueOf(var7.a)));
            }
         }
      }

   }

   private void a(ConstPool var1, Openflower11 var2, Openflower197 var3) {
      LIFOQueue var4 = var3.c();
      Openflower7 var5 = var2.e();

      int var6;
      for(var6 = 0; var6 < var5.d(); ++var6) {
         Opcode var7 = var5.b(var6);
         Descriptor var8 = null;
         if(var7.opcode == 58 || var7.opcode == 87) {
            var8 = (Descriptor)var4.getOffset(-1);
         }

         Openflower14.a(var3, var7, var1);
         switch(var7.opcode) {
         case 58:
         case 87:
            if(var8.type == 9) {
               var5.a(var6);
               --var6;
            }
            break;
         case 168:
         case 169:
            var5.a(var6);
            --var6;
         }
      }

      var2.b = 1;

      Openflower11 var9;
      for(var6 = 0; var6 < var2.f().size(); ++var6) {
         if((var9 = (Openflower11)var2.f().get(var6)).b != 1) {
            this.a(var1, var9, var3.a());
         }
      }

      for(var6 = 0; var6 < var2.g().size(); ++var6) {
         if((var9 = (Openflower11)var2.g().get(var6)).b != 1) {
            Openflower197 var10;
            (var10 = new Openflower197()).a((List)(new ArrayList(var3.b())));
            var10.c().push(new Descriptor(8, 0, (String)null));
            this.a(var1, var9, var10);
         }
      }

   }

   private void i() {
      this.c = (Openflower11)this.b.get(0);
      this.d = new Openflower11();
      this.d.a = ++this.a;
      this.d.a((Openflower7)(new Openflower9()));
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         Openflower11 var1;
         if((var1 = (Openflower11)var2.next()).f().isEmpty()) {
            this.d.a(var1);
         }
      }

   }

   public final List a() {
      LinkedList var1 = new LinkedList();
      a(this.c, (List)var1);
      return var1;
   }

   private static void a(Openflower11 var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (Openflower11)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);
         ArrayList var6;
         (var6 = new ArrayList(var0.f())).addAll(var0.g());

         while(true) {
            if(var5 < var6.size()) {
               Openflower11 var7 = (Openflower11)var6.get(var5);
               if(var4.contains(var7)) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var7);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var6.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   public final DualArrayList b() {
      return this.b;
   }

   public final Openflower11 c() {
      return this.c;
   }

   public final void b(Openflower11 var1) {
      this.c = var1;
   }

   public final List d() {
      return this.f;
   }

   public final Openflower11 e() {
      return this.d;
   }

   public final HashSet f() {
      return this.h;
   }
}
