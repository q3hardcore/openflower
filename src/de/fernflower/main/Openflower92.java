package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower12;
import de.fernflower.main.Openflower13;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower144;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower82;
import de.fernflower.main.Openflower89;
import de.fernflower.main.Openflower9;
import de.fernflower.main.Openflower91;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.classreader.opcodes.OpcodeFactory;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower92 {

   private HashMap a = new HashMap();
   private HashMap b = new HashMap();
   private VarProcessor c;


   public Openflower92(VarProcessor var1) {
      this.c = var1;
   }

   public final boolean a(MethodInfo var1, Openflower152 var2, Openflower12 var3) {
      LinkedList var4;
      (var4 = new LinkedList()).add(var2);

      Openflower154_SomeSorter var5;
      for(; !var4.isEmpty(); var4.addAll(var5.t())) {
         Openflower154_SomeSorter var6;
         if((var6 = (var5 = (Openflower154_SomeSorter)var4.removeLast()).B()) != null && var6.c == 12 && var5 == var6.s() && !var6.F()) {
            Openflower147 var11;
            Openflower11 var7 = (var11 = (Openflower147)var6).y().e();
            Openflower11 var8 = var11.c().y().e();
            if(!this.b.containsKey(Integer.valueOf(var8.a))) {
               if(!this.a.containsKey(Integer.valueOf(var8.a))) {
                  Object[] var12;
                  if((var12 = a(var1, var2, var11)) == null) {
                     this.b.put(Integer.valueOf(var8.a), (Object)null);
                  } else {
                     if(Configuration.getBoolean("fdi") && this.a(var3, var11, var12)) {
                        this.a.put(Integer.valueOf(var8.a), (Object)null);
                     } else {
                        int var10 = Configuration.getIDManager().getNext(2);
                        this.a(var3, a(var11.s()), var7, var8, var10, var12);
                        this.a.put(Integer.valueOf(var8.a), Integer.valueOf(var10));
                     }

                     Openflower82.a(var3);
                     Openflower82.b(var3);
                     Openflower82.e(var3);
                  }

                  return true;
               }

               var11.e();
               Integer var9 = (Integer)this.a.get(Integer.valueOf(var8.a));
               var11.a(var9 == null?null:new Openflower135(var9.intValue(), Descriptor.INT, this.c));
            }
         }
      }

      return false;
   }

   private static Object[] a(MethodInfo var0, Openflower152 var1, Openflower147 var2) {
      HashMap var3 = new HashMap();
      Openflower146 var4;
      Openflower11 var5;
      Opcode var6 = (var5 = (var4 = var2.c().y()).e()).b();
      byte var7 = 0;
      switch(var6.opcode) {
      case 58:
         var7 = 2;
         break;
      case 87:
         var7 = 1;
      }

      (new Openflower89()).a(var1, var0.getOwner().getConstPool());
      (new Openflower144()).a(var1, var0);
      List var16 = var4.E();
      IntPair var17 = new IntPair((Openflower135)((Openflower124)var16.get(var7 == 2?1:0)).g());
      Openflower137 var18 = (new Openflower143()).a(var1);
      LinkedList var20;
      (var20 = new LinkedList()).add(var18.b);
      HashSet var19 = new HashSet();

      while(!var20.isEmpty()) {
         Openflower138 var22 = (Openflower138)var20.removeFirst();
         if(!var19.contains(var22)) {
            var19.add(var22);
            Openflower146 var8 = null;
            if(var22.c != null) {
               var8 = var22.c;
            } else if(var22.g.size() == 1) {
               var8 = ((Openflower138)var22.g.get(0)).c;
            }

            boolean var9 = true;
            if(var7 != 1) {
               var9 = false;

               for(int var10 = 0; var10 < var22.e.size(); ++var10) {
                  Element var11 = (Element)var22.e.get(var10);
                  if(var7 == 0) {
                     List var12;
                     (var12 = var11.b()).add(var11);
                     boolean var13 = false;
                     Iterator var15 = var12.iterator();

                     while(var15.hasNext()) {
                        Element var14;
                        if((var14 = (Element)var15.next()).a == 12 && (new IntPair((Openflower135)var14)).equals(var17)) {
                           var13 = true;
                           break;
                        }
                     }

                     if(var13) {
                        var13 = false;
                        Openflower126 var32;
                        if(var11.a == 4 && (var32 = (Openflower126)var11).f() == 1 && var32.g().a == 12) {
                           var13 = true;
                        }

                        if(!var13) {
                           return null;
                        }

                        var9 = true;
                     }
                  } else {
                     Openflower124 var27;
                     if(var7 == 2 && var11.a == 2 && (var27 = (Openflower124)var11).h().a == 12 && (new IntPair((Openflower135)var27.h())).equals(var17)) {
                        Element var30 = null;
                        if(var10 == var22.e.size() - 1) {
                           Openflower138 var33;
                           if(var22.f.size() == 1 && !(var33 = (Openflower138)var22.f.get(0)).e.isEmpty()) {
                              var30 = (Element)var33.e.get(0);
                           }
                        } else {
                           var30 = (Element)var22.e.get(var10 + 1);
                        }

                        boolean var29 = false;
                        Openflower126 var31;
                        if(var30 != null && var30.a == 4 && (var31 = (Openflower126)var30).f() == 1 && var31.g().a == 12 && var27.g().equals(var31.g())) {
                           var29 = true;
                        }

                        if(!var29) {
                           return null;
                        }

                        var9 = true;
                     }
                  }
               }
            }

            if(var8 != null && var8.e() != null) {
               Openflower154_SomeSorter var25 = var2.c();
               Iterator var28 = var8.c(1073741824).iterator();

               while(var28.hasNext()) {
                  Openflower105 var24;
                  Boolean var34;
                  if((var24 = (Openflower105)var28.next()).a() != 1 && var25.f((Openflower154_SomeSorter)var8) && !var25.f(var24.c()) && ((var34 = (Boolean)var3.get(var8.e())) == null || !var34.booleanValue())) {
                     var3.put(var8.e(), Boolean.valueOf(var9));
                     break;
                  }
               }
            }

            var20.addAll(var22.f);
         }
      }

      if(var2.c().c == 8) {
         boolean var21 = false;
         boolean var23 = var3.containsKey(var5);
         Openflower7 var26 = var5.e();
         switch(var7) {
         case 0:
            var21 = var23 && var26.d() == 1;
            break;
         case 1:
            var21 = var26.d() == 1;
            break;
         case 2:
            var21 = var23?var26.d() == 3:var26.d() == 1;
         }

         if(var21) {
            var7 = 3;
         }
      }

      return new Object[]{Integer.valueOf(var7), var3};
   }

   private void a(Openflower12 var1, HashSet var2, Openflower11 var3, Openflower11 var4, int var5, Object[] var6) {
      HashSet var11 = new HashSet(var2);
      int var7 = ((Integer)var6[0]).intValue();
      HashMap var17 = (HashMap)var6[1];
      a(var4, 1, var7);
      Iterator var16 = var17.entrySet().iterator();

      Openflower11 var8;
      while(var16.hasNext()) {
         Entry var14;
         var8 = (Openflower11)(var14 = (Entry)var16.next()).getKey();
         if(((Boolean)var14.getValue()).booleanValue()) {
            a(var8, 2, var7);
            var1.f().add(var8);
         }
      }

      var16 = var2.iterator();

      Openflower11 var12;
      Iterator var19;
      while(var16.hasNext()) {
         List var10000 = (var4 = (Openflower11)var16.next()).f();
         var8 = null;
         var19 = var10000.iterator();

         while(var19.hasNext()) {
            var12 = (Openflower11)var19.next();
            if(!var11.contains(var12) && var12 != var1.e()) {
               Openflower9 var9;
               (var9 = new Openflower9()).a(OpcodeFactory.createOpcode(16, false, 1, new int[1]), -1);
               var9.a(OpcodeFactory.createOpcode(54, false, 1, new int[]{var5}), -1);
               (var8 = new Openflower11(++var1.a)).a((Openflower7)var9);
               var4.a(var12, var8);
               var8.c(var12);
               var11.add(var8);
               var1.b().a((Object)var8, (Object)Integer.valueOf(var8.a));

               for(int var13 = 0; var13 < var4.g().size(); ++var13) {
                  Openflower11 var20 = (Openflower11)var4.g().get(var13);
                  Openflower13 var10 = var1.a(var20, var4);
                  var8.e(var20);
                  var10.c().add(var8);
               }
            }
         }
      }

      Openflower9 var15;
      (var15 = new Openflower9()).a(OpcodeFactory.createOpcode(16, false, 1, new int[]{1}), -1);
      var15.a(OpcodeFactory.createOpcode(54, false, 1, new int[]{var5}), -1);
      Openflower11 var18;
      (var18 = new Openflower11(++var1.a)).a((Openflower7)var15);
      a(var1, var3, var18);
      (var15 = new Openflower9()).a(OpcodeFactory.createOpcode(16, false, 1, new int[1]), -1);
      var15.a(OpcodeFactory.createOpcode(54, false, 1, new int[]{var5}), -1);
      (var8 = new Openflower11(++var1.a)).a((Openflower7)var15);
      a(var1, var18, var8);
      var11.add(var18);
      var11.add(var8);
      var19 = (new HashSet(var8.g())).iterator();

      while(var19.hasNext()) {
         var12 = (Openflower11)var19.next();
         Openflower13 var21 = var1.a(var12, var8);
         if(var11.containsAll(var21.c())) {
            var8.f(var12);
            var21.c().remove(var8);
         }
      }

   }

   private static void a(Openflower12 var0, Openflower11 var1, Openflower11 var2) {
      ArrayList var3;
      (var3 = new ArrayList()).addAll(var1.d());
      var3.addAll(var1.h());
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         ((Openflower11)var4.next()).a(var1, var2);
      }

      var4 = var1.g().iterator();

      while(var4.hasNext()) {
         Openflower11 var6 = (Openflower11)var4.next();
         Openflower13 var5 = var0.a(var6, var1);
         var2.e(var6);
         var5.c().add(var2);
      }

      var4 = var0.d().iterator();

      while(var4.hasNext()) {
         Openflower13 var7;
         if((var7 = (Openflower13)var4.next()).b() == var1) {
            var7.a(var2);
         }
      }

      var2.c(var1);
      var0.b().a((Object)var2, (Object)Integer.valueOf(var2.a));
      if(var0.c() == var1) {
         var0.b(var2);
      }

   }

   private static HashSet a(Openflower154_SomeSorter var0) {
      LinkedList var1;
      (var1 = new LinkedList()).add(var0);
      int var3 = 0;

      do {
         Openflower154_SomeSorter var2;
         if((var2 = (Openflower154_SomeSorter)var1.get(var3)).c == 8) {
            ++var3;
         } else {
            var1.addAll(var2.t());
            var1.remove(var3);
         }
      } while(var3 < var1.size());

      HashSet var5 = new HashSet();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var0 = (Openflower154_SomeSorter)var4.next();
         var5.add(((Openflower146)var0).e());
      }

      return var5;
   }

   private boolean a(Openflower12 var1, Openflower147 var2, Object[] var3) {
      HashSet var4 = a(var2.s());
      HashSet var5 = a(var2.c());
      int var6 = ((Integer)var3[0]).intValue();
      HashMap var12 = (HashMap)var3[1];
      Openflower11 var7 = var2.c().y().e();
      boolean var8 = false;
      if(var6 == 3) {
         a(var7, 3, var6);
         if(var12.containsKey(var7)) {
            var1.f().add(var7);
         }

         return true;
      } else {
         Openflower11 var9;
         if(var7.e().d() == 1 && var6 > 0) {
            var9 = (Openflower11)var7.f().get(0);
            if(var5.contains(var9)) {
               var7 = var9;
               var8 = true;
            }
         }

         HashSet var14 = new HashSet();
         Iterator var11 = var4.iterator();

         while(var11.hasNext()) {
            Openflower11 var10 = (Openflower11)var11.next();
            var14.addAll(var10.f());
         }

         var14.remove(var1.e());
         var14.removeAll(var4);
         ArrayList var17 = new ArrayList();
         Iterator var13 = var14.iterator();

         while(var13.hasNext()) {
            Openflower11 var16 = (Openflower11)var13.next();
            Object[] var15;
            if((var15 = this.a(var1, var16, var5, var7, var6, var12, var8)) == null) {
               return false;
            }

            var17.add(new Object[]{var16, var15[0], var15[1]});
         }

         var13 = var17.iterator();

         while(var13.hasNext()) {
            Object[] var18 = (Object[])var13.next();
            a(var1, var18);
         }

         var13 = var12.entrySet().iterator();

         while(var13.hasNext()) {
            Entry var19;
            var9 = (Openflower11)(var19 = (Entry)var13.next()).getKey();
            if(((Boolean)var19.getValue()).booleanValue()) {
               a(var9, 2, var6);
               var1.f().add(var9);
            }
         }

         a(var2.c().y().e(), 1, var6);
         return true;
      }
   }

   private Object[] a(Openflower12 var1, Openflower11 var2, HashSet var3, Openflower11 var4, int var5, HashMap var6, boolean var7) {
      LinkedList var8 = new LinkedList();
      HashSet var9 = new HashSet();
      HashMap var10 = new HashMap();
      var8.add(new Openflower91(var4, var2, new ArrayList()));

      while(!var8.isEmpty()) {
         Openflower91 var21;
         Openflower11 var11 = (var21 = (Openflower91)var8.remove(0)).a;
         Openflower11 var12 = var21.b;
         boolean var13 = !var7 && var11 == var4;
         boolean var14;
         boolean var15 = (var14 = var6.containsKey(var11)) && ((Boolean)var6.get(var11)).booleanValue();
         if(!this.a(var1, var11, var12, (var13?1:0) | (var15?2:0), var5, var21.c)) {
            return null;
         }

         if(var12.f().size() != var11.f().size()) {
            return null;
         }

         var9.add(var12);

         Openflower11 var17;
         Openflower11 var16;
         int var22;
         for(var22 = 0; var22 < var11.f().size(); ++var22) {
            var16 = (Openflower11)var11.f().get(var22);
            var17 = (Openflower11)var12.f().get(var22);
            if(var3.contains(var16) && !var9.contains(var17)) {
               var8.add(new Openflower91(var16, var17, var21.c));
            }
         }

         if(!var14 || !var12.e().e()) {
            if(var11.g().size() != var12.g().size()) {
               return null;
            }

            for(var22 = 0; var22 < var11.g().size(); ++var22) {
               var16 = (Openflower11)var11.g().get(var22);
               var17 = (Openflower11)var12.g().get(var22);
               String var18 = var1.a(var16, var11).d();
               String var19 = var1.a(var17, var12).d();
               boolean var10000 = var18 == null?var19 == null:var18.equals(var19);
               boolean var28 = false;
               if(!var10000) {
                  return null;
               }

               if(var3.contains(var16) && !var9.contains(var17)) {
                  List var27 = var21.c;
                  if(var16.e().d() > 0 && var17.e().d() > 0) {
                     Opcode var26 = var16.e().b(0);
                     Opcode var20 = var17.e().b(0);
                     if(var26.opcode == 58 && var20.opcode == 58) {
                        (var27 = new ArrayList((Collection)var27)).add(new int[]{var26.getValue(0), var20.getValue(0)});
                     }
                  }

                  var8.add(new Openflower91(var16, var17, (List)var27));
               }
            }
         }

         if(var14) {
            HashSet var23;
            (var23 = new HashSet(var12.f())).removeAll(var9);
            Iterator var25 = var8.iterator();

            while(var25.hasNext()) {
               Openflower91 var24 = (Openflower91)var25.next();
               var23.remove(var24.b);
            }

            var25 = var23.iterator();

            while(var25.hasNext()) {
               var16 = (Openflower11)var25.next();
               if(var1.e() != var16) {
                  var10.put(var12.a + "#" + var16.a, new Openflower11[]{var12, var16, var15?var16:null});
               }
            }
         }
      }

      return new Object[]{var9, a(var1, new HashSet(var10.values()))};
   }

   private static Openflower11 a(Openflower12 var0, HashSet var1) {
      Openflower11 var2 = null;
      boolean var3 = false;
      Iterator var5 = var1.iterator();

      Openflower11[] var4;
      while(var5.hasNext()) {
         if((var4 = (Openflower11[])var5.next())[2] != null) {
            var2 = var4[1];
            var3 = false;
            break;
         }

         if(var2 == null) {
            var2 = var4[1];
         } else if(var2 != var4[1]) {
            var3 = true;
         }

         if(var4[1].d().size() == 1) {
            var2 = var4[1];
         }
      }

      if(var3) {
         var5 = var1.iterator();

         while(var5.hasNext()) {
            Openflower11[] var10000 = (Openflower11[])var5.next();
            var4 = null;
            Openflower11 var12;
            if((var12 = var10000[1]) != var2) {
               List var10 = var2.f();
               List var6 = var12.f();
               List var14 = var10;
               boolean var11;
               if(var10 == null) {
                  var11 = var6 == null;
               } else {
                  label72: {
                     if(var6 != null && var14.size() == var6.size()) {
                        HashSet var16;
                        (var16 = new HashSet(var14)).removeAll(var6);
                        if(var16.size() == 0) {
                           var11 = true;
                           break label72;
                        }
                     }

                     var11 = false;
                  }
               }

               if(!var11) {
                  return null;
               }

               Openflower7 var15 = var2.e();
               Openflower7 var13 = var12.e();
               if(var15.d() != var13.d()) {
                  return null;
               }

               for(int var17 = 0; var17 < var15.d(); ++var17) {
                  Opcode var7 = var15.b(var17);
                  Opcode var8 = var13.b(var17);
                  if(var7.opcode != var8.opcode || var7.isWide != var8.isWide || var7.getNumValues() != var8.getNumValues()) {
                     return null;
                  }

                  for(int var9 = 0; var17 < var7.getValues().length; ++var9) {
                     if(var7.getValue(var9) != var8.getValue(var9)) {
                        return null;
                     }
                  }
               }
            }
         }

         var5 = var1.iterator();

         while(var5.hasNext()) {
            if((var4 = (Openflower11[])var5.next())[1] != var2) {
               var4[0].d(var4[1]);
               var4[0].c(var2);
            }
         }

         Openflower82.a(var0);
      }

      return var2;
   }

   private boolean a(Openflower12 var1, Openflower11 var2, Openflower11 var3, int var4, int var5, List var6) {
      Openflower7 var12 = var2.e();
      Openflower7 var15 = var3.e();
      if(var4 != 0) {
         var12 = var12.a();
         if((var4 & 1) > 0 && var5 > 0) {
            var12.a(0);
         }

         if((var4 & 2) > 0) {
            if(var5 == 0 || var5 == 2) {
               var12.a(var12.d() - 1);
            }

            if(var5 == 2) {
               var12.a(var12.d() - 1);
            }
         }
      }

      if(var12.d() > var15.d()) {
         return false;
      } else {
         for(var4 = 0; var4 < var12.d(); ++var4) {
            Opcode var19 = var12.b(var4);
            Opcode var7 = var15.b(var4);
            Opcode var10000 = var19;
            var7 = var7;
            var19 = var19;
            boolean var18;
            if(var10000.opcode == var7.opcode && var19.isWide == var7.isWide && var19.getNumValues() == var7.getNumValues()) {
               label104: {
                  if(var19.b != 2 && var19.getValues() != null) {
                     label100:
                     for(int var9 = 0; var9 < var19.getValues().length; ++var9) {
                        int var10 = var19.getValue(var9);
                        int var11 = var7.getValue(var9);
                        if(var10 != var11) {
                           if(var19.opcode == 25 || var19.opcode == 58) {
                              Iterator var25 = var6.iterator();

                              while(var25.hasNext()) {
                                 int[] var22;
                                 if((var22 = (int[])var25.next())[0] == var10 && var22[1] == var11) {
                                    break label100;
                                 }
                              }
                           }

                           var18 = false;
                           break label104;
                        }
                     }
                  }

                  var18 = true;
               }
            } else {
               var18 = false;
            }

            if(!var18) {
               return false;
            }
         }

         if(var12.d() < var15.d()) {
            Openflower9 var21 = new Openflower9();

            for(var5 = var15.d() - 1; var5 >= var12.d(); --var5) {
               var21.a(var15.b(var5));
               var15.a(var5);
            }

            Openflower11 var23;
            (var23 = new Openflower11(++var1.a)).a((Openflower7)var21);
            ArrayList var24;
            (var24 = new ArrayList()).addAll(var3.f());
            Iterator var16 = var24.iterator();

            Openflower11 var13;
            while(var16.hasNext()) {
               var13 = (Openflower11)var16.next();
               var3.d(var13);
               var23.c(var13);
            }

            var3.c(var23);
            var1.b().a((Object)var23, (Object)Integer.valueOf(var23.a));
            HashSet var14;
            if((var14 = var1.f()).contains(var3)) {
               var14.remove(var3);
               var14.add(var23);
            }

            for(int var17 = 0; var17 < var3.g().size(); ++var17) {
               var13 = (Openflower11)var3.g().get(var17);
               Openflower13 var20 = var1.a(var13, var3);
               var23.e(var13);
               var20.c().add(var23);
            }
         }

         return true;
      }
   }

   private static void a(Openflower12 var0, Object[] var1) {
      Openflower11 var2 = (Openflower11)var1[0];
      Openflower11 var3 = (Openflower11)var1[2];
      if(var2 != var3) {
         if(var3 == null) {
            var3 = var0.e();
         }

         Iterator var5 = (new ArrayList(var2.d())).iterator();

         HashSet var4;
         while(var5.hasNext()) {
            Openflower11 var10000 = (Openflower11)var5.next();
            var4 = null;
            var10000.a(var2, var3);
         }

         Iterator var7 = (var4 = (HashSet)var1[1]).iterator();

         while(var7.hasNext()) {
            Openflower11 var8 = (Openflower11)var7.next();
            if(var0.b().d(Integer.valueOf(var8.a))) {
               if(var8.e().e() && var8.f().size() == 1) {
                  var2 = (Openflower11)var8.f().get(0);
                  Iterator var6 = (new ArrayList(var8.d())).iterator();

                  while(var6.hasNext()) {
                     var3 = (Openflower11)var6.next();
                     if(!var4.contains(var3)) {
                        var3.a(var8, var2);
                     }
                  }

                  if(var0.c() == var8) {
                     var0.b(var2);
                  }
               }

               var0.a(var8);
            }
         }

      }
   }

   private static void a(Openflower11 var0, int var1, int var2) {
      Openflower7 var3 = var0.e();
      if(var2 == 3) {
         for(var1 = var3.d() - 1; var1 >= 0; --var1) {
            var3.a(var1);
         }

      } else {
         if((var1 & 1) > 0 && (var2 == 2 || var2 == 1)) {
            var3.a(0);
         }

         if((var1 & 2) > 0) {
            if(var2 == 2 || var2 == 0) {
               var3.a(var3.d() - 1);
            }

            if(var2 == 2) {
               var3.a(var3.d() - 1);
            }
         }

      }
   }
}
