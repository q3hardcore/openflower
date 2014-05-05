package de.fernflower.main;

import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower141;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower156;
import de.fernflower.main.Openflower165;
import de.fernflower.main.Openflower166;
import de.fernflower.main.Openflower169;
import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower214;
import de.fernflower.main.Openflower218;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower145 {

   private HashMap a = new HashMap();
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();
   private HashMap d = new HashMap();
   private HashMap e = new HashMap();
   private HashMap f = new HashMap();
   private HashMap g = new HashMap();
   private HashMap h = new HashMap();
   private HashMap i = new HashMap();
   private Openflower169 j = new Openflower169();
   private HashMap k = new HashMap();
   private int l = -1;
   private Openflower214 m;


   public final void a(Openflower152 var1, MethodInfo var2) {
      Openflower143 var3;
      Openflower137 var4 = (var3 = new Openflower143()).a(var1);
      HashSet var5 = new HashSet();

      for(int var6 = 0; var6 < 64; ++var6) {
         var5.add(Integer.valueOf(var6));
      }

      this.m = new Openflower214(var5);
      this.d.put(var4.b.b, this.a(var2, var1));
      this.a((Openflower154_SomeSorter)var1, var4, var3);
      HashSet var7 = new HashSet();

      do {
         this.a(var4, var7, false);
      } while(!var7.isEmpty());

      this.a(var4, var7, true);
      this.j.a();
   }

   private void a(Openflower137 var1, HashSet var2, boolean var3) {
      Iterator var5 = var1.a.iterator();

      while(var5.hasNext()) {
         Openflower138 var4 = (Openflower138)var5.next();
         var2.remove(var4.b);
         Openflower137 var8 = var1;
         Openflower138 var7 = var4;
         Openflower145 var6 = this;
         Openflower218 var9 = new Openflower218();
         Iterator var11 = var4.g.iterator();

         Openflower218 var18;
         while(var11.hasNext()) {
            Openflower138 var10 = (Openflower138)var11.next();
            var18 = var6.a(var7.b, var10.b, var8, var7.b);
            if(var9.c()) {
               var9 = var18.a();
            } else {
               a(var9, var18);
            }
         }

         if(var6.d.containsKey(var7.b)) {
            var18 = (Openflower218)var6.d.get(var7.b);
            if(var9.c()) {
               var9 = var18.a();
            } else {
               a(var9, var18);
            }
         }

         var6.a.put(var7.b, var9);
         Openflower218 var14 = new Openflower218((Openflower218)this.a.get(var4.b));
         Openflower218[] var13 = new Openflower218[]{var14, null};
         if(var4.e != null) {
            Iterator var17 = var4.e.iterator();

            while(var17.hasNext()) {
               Element var15 = (Element)var17.next();
               this.a(var15, var13, var4.d, var3);
            }
         }

         if(var13[1] == null) {
            var13[1] = var13[0];
         }

         if(!b(var13[0], (Openflower218)this.b.get(var4.b)) || this.c.containsKey(var4.b) && !b(var13[1], (Openflower218)this.c.get(var4.b))) {
            this.b.put(var4.b, var13[0]);
            if(var1.e.containsKey(var4.b)) {
               this.c.put(var4.b, var13[1]);
            }

            Iterator var12 = var4.f.iterator();

            while(var12.hasNext()) {
               Openflower138 var16 = (Openflower138)var12.next();
               var2.add(var16.b);
            }
         }
      }

   }

   private void a(Element var1, Openflower218[] var2, Openflower154_SomeSorter var3, boolean var4) {
      if(var1 != null) {
         Openflower135 var5 = null;
         boolean var6 = false;
         Openflower129 var8;
         Openflower218[] var11;
         Element var22;
         switch(var1.a) {
         case 2:
            Openflower124 var7;
            if((var7 = (Openflower124)var1).i() == -1 && (var22 = var7.g()).a == 12) {
               var5 = (Openflower135)var22;
            }
         case 3:
         case 4:
         case 5:
         default:
            break;
         case 6:
            switch((var8 = (Openflower129)var1).i()) {
            case 36:
               this.a((Element)var8.j().get(0), var2, var3, var4);
               Openflower218 var19;
               if(var2[1] == null) {
                  var19 = new Openflower218(var2[0]);
               } else {
                  var19 = var2[1];
                  var2[1] = null;
               }

               this.a((Element)var8.j().get(1), var2, var3, var4);
               Openflower218[] var9 = new Openflower218[]{var19, null};
               this.a((Element)var8.j().get(2), var9, var3, var4);
               a(var2[0], var9[0]);
               var2[1] = null;
               var6 = true;
               break;
            case 48:
               this.a((Element)var8.j().get(0), var2, var3, var4);
               Openflower218[] var10 = new Openflower218[]{new Openflower218(var2[0]), null};
               this.a((Element)var8.j().get(1), var10, var3, var4);
               var2[1] = a(var2[var2[1] == null?0:1], var10[var10[1] == null?0:1]);
               var2[0] = var10[0];
               var6 = true;
               break;
            case 49:
               this.a((Element)var8.j().get(0), var2, var3, var4);
               var11 = new Openflower218[]{new Openflower218(var2[var2[1] == null?0:1]), null};
               this.a((Element)var8.j().get(1), var11, var3, var4);
               var2[1] = var11[var11[1] == null?0:1];
               var2[0] = a(var2[0], var11[0]);
               var6 = true;
            }
         }

         if(!var6) {
            List var18;
            (var18 = var1.b()).remove(var5);
            Iterator var21 = var18.iterator();

            while(var21.hasNext()) {
               var22 = (Element)var21.next();
               this.a(var22, var2, var3, var4);
            }
         }

         Openflower218 var20 = var2[0];
         if(var1.a == 5) {
            int var26;
            if(this.k.containsKey(Integer.valueOf(var1.b))) {
               var26 = ((Integer)this.k.get(Integer.valueOf(var1.b))).intValue();
            } else {
               var26 = this.l--;
               this.k.put(Integer.valueOf(var1.b), Integer.valueOf(var26));
               this.j.a(new IntPair(var26, 1));
            }

            this.a(var20, Integer.valueOf(var26), Integer.valueOf(1));
         } else if(var1.a == 8 || var1.a == 2 && ((Openflower124)var1).g().a == 5 || var1.a == 10 && ((Openflower133)var1).i().type == 8 || var1.a == 6) {
            boolean var27 = true;
            if(var1.a == 6) {
               var27 = false;
               Openflower129 var25;
               if((var25 = (Openflower129)var1).i() >= 32 && var25.i() <= 35 && ((Element)var25.j().get(0)).a == 5) {
                  var27 = true;
               }
            }

            if(var27) {
               var20.d();
            }
         }

         Integer var28;
         if(var5 != null) {
            Integer var32 = Integer.valueOf(var5.getIndex());
            if(var5.getIndex2() == 0) {
               var28 = this.a(var32, var3);
               var5.setIndex2(var28.intValue());
               this.j.a(new IntPair(var32, var28));
               this.a(var20, var32, var28);
            } else {
               if(var4) {
                  this.a(new IntPair(var32.intValue(), var5.getIndex2()), var20);
               }

               this.a(var20, var32, Integer.valueOf(var5.getIndex2()));
            }
         } else {
            Integer var12;
            Openflower166 var13;
            Integer var24;
            if(var1.a == 6) {
               switch((var8 = (Openflower129)var1).i()) {
               case 32:
               case 33:
               case 34:
               case 35:
                  if(((Element)var8.j().get(0)).a != 12) {
                     break;
                  }

                  Openflower135 var23;
                  var24 = Integer.valueOf((var23 = (Openflower135)var8.j().get(0)).getIndex());
                  IntPair var29 = new IntPair(var24.intValue(), var23.getIndex2());
                  IntPair var10000 = (IntPair)this.h.get(var29);
                  var11 = null;
                  if(var10000 == null) {
                     var12 = this.a(var24, (Openflower154_SomeSorter)null);
                     IntPair var33 = new IntPair(var24, var12);
                     this.j.a(var33);
                     var13 = (Openflower166)this.j.a.b(var29);
                     Openflower212 var17 = this.m.a();
                     if(var13.d.size() == 1) {
                        var17.a((Object)Integer.valueOf(((Openflower165)var13.d.iterator().next()).a.b));
                     } else {
                        Iterator var34 = var13.d.iterator();

                        while(var34.hasNext()) {
                           Openflower165 var14 = (Openflower165)var34.next();
                           var17.a((Object)Integer.valueOf(((Openflower165)var14.a.d.iterator().next()).a.b));
                        }
                     }

                     var17.a((Object)var12);
                     this.a(var29, var17, var3);
                     this.h.put(var29, var33);
                  }

                  if(var4) {
                     this.a(var29, var20);
                  }

                  this.a(var20, Integer.valueOf(var24.intValue()), Integer.valueOf(var23.getIndex2()));
               default:
                  return;
               }
            } else if(var1.a == 12) {
               Openflower135 var35;
               var28 = Integer.valueOf((var35 = (Openflower135)var1).getIndex());
               var24 = Integer.valueOf(var35.getIndex2());
               Openflower212 var30;
               int var36;
               if((var36 = (var30 = var20.b(var28.intValue())).b()) == 1) {
                  if(var24.intValue() != 0) {
                     if(var4) {
                        this.a(new IntPair(var28, var24), var20);
                     }

                     this.a(var20, var28, var24);
                     return;
                  }

                  var12 = this.a(var28, var3);
                  var35.setIndex2(var12.intValue());
                  this.a(var20, var28, var12);
                  Integer var15 = (Integer)var30.iterator().next();
                  Openflower166 var16 = (Openflower166)this.j.a.b(new IntPair(var28, var15));
                  var13 = this.j.a(new IntPair(var28, var12));
                  Openflower165 var31 = new Openflower165(0, var16, var13);
                  var16.c(var31);
                  var13.d(var31);
                  return;
               }

               if(var36 == 2) {
                  if(var24.intValue() != 0) {
                     if(var4) {
                        this.a(new IntPair(var28, var24), var20);
                     }

                     this.a(var20, var28, var24);
                  } else {
                     var12 = this.a(var28, var3);
                     var35.setIndex2(var12.intValue());
                     this.j.a(new IntPair(var28, var12));
                     this.a(var20, var28, var12);
                     var24 = var12;
                  }

                  this.a(new IntPair(var28, var24), var30, var3);
               }
            }

         }
      }
   }

   private void a(IntPair var1, Openflower212 var2, Openflower154_SomeSorter var3) {
      Openflower212 var4 = var2.a();
      HashSet var5 = new HashSet();
      Openflower166 var6 = (Openflower166)this.j.a.b(var1);
      ArrayList var7;
      Openflower165 var14;
      if((var7 = new ArrayList(var6.d)).size() == 1) {
         (var14 = (Openflower165)var7.get(0)).a.a(var14);
         var6.b(var14);
      } else {
         Iterator var8 = var7.iterator();

         while(var8.hasNext()) {
            int var9 = ((Openflower165)(var14 = (Openflower165)var8.next()).a.d.iterator().next()).a.b;
            if(!var2.c((Object)Integer.valueOf(var9))) {
               var14.a.a(var14);
               var6.b(var14);
            } else {
               var4.b((Object)Integer.valueOf(var9));
               var5.add(Integer.valueOf(var9));
            }
         }
      }

      var7 = new ArrayList();
      ArrayList var15 = new ArrayList();
      Iterator var12 = var4.iterator();

      while(var12.hasNext()) {
         Integer var16 = (Integer)var12.next();
         Openflower166 var13 = (Openflower166)this.j.a.b(new IntPair(var1.val1, var16.intValue()));
         var16 = this.a(Integer.valueOf(var1.val1), var3);
         Openflower166 var10 = new Openflower166(var1.val1, var16.intValue());
         var7.add(var10);
         var15.add(new IntPair(var1.val1, var16.intValue()));
         Openflower165 var11 = new Openflower165(0, var13, var10);
         var13.c(var11);
         var10.d(var11);
         var11 = new Openflower165(0, var10, var6);
         var10.c(var11);
         var6.d(var11);
         var5.add(var16);
      }

      this.j.a.a((Collection)var7, (Collection)var15);
      this.e.put(var1, var5);
   }

   private void a(IntPair var1, Openflower218 var2) {
      ((Openflower166)this.j.a.b(var1)).f = new Openflower218(var2);
   }

   private Integer a(Integer var1, Openflower154_SomeSorter var2) {
      Integer var3;
      if((var3 = (Integer)this.f.get(var1)) == null) {
         var3 = new Integer(1);
      } else {
         var3 = new Integer(var3.intValue() + 1);
      }

      this.f.put(var1, var3);
      Integer var4;
      if(var2 != null && (var4 = a(var2)) != null) {
         this.g.put(new IntPair(var1, var3), var4);
      }

      return var3;
   }

   private Openflower218 a(String var1, String var2, Openflower137 var3, String var4) {
      Openflower218 var5 = new Openflower218();
      boolean var6 = var3.c.containsKey(var2);
      if(var1.equals(var3.e.get(var2))) {
         if(this.c.containsKey(var2)) {
            var5 = ((Openflower218)this.c.get(var2)).a();
         }
      } else if(this.b.containsKey(var2)) {
         var5 = ((Openflower218)this.b.get(var2)).a();
      }

      if(var6) {
         Openflower218 var21 = var5.a();
         Openflower218 var7 = new Openflower218();
         String var8;
         boolean var25 = (var8 = (String)var3.f.get(var2)) != null && !var1.equals(var8);
         HashSet var9 = new HashSet();
         Iterator var11 = var3.d.values().iterator();

         Openflower141 var10;
         Iterator var13;
         while(var11.hasNext()) {
            List var10000 = (List)var11.next();
            var10 = null;
            var13 = var10000.iterator();

            while(var13.hasNext()) {
               Openflower141 var12 = (Openflower141)var13.next();
               var9.add(var12.b + "##" + var12.a);
            }
         }

         var11 = ((List)var3.c.get(var2)).iterator();

         while(var11.hasNext()) {
            var10 = (Openflower141)var11.next();
            Openflower218 var28;
            boolean var30;
            if(var30 = var3.c.containsKey(var10.a)) {
               var28 = this.a(var10.c, var10.a, var3, var4);
            } else if(var10.c.equals(var3.e.get(var10.a))) {
               var28 = (Openflower218)this.c.get(var10.a);
            } else {
               var28 = (Openflower218)this.b.get(var10.a);
            }

            boolean var14 = false;
            if(var30) {
               var14 = !var10.b.equals(var1);
            } else {
               var14 = !var9.contains(var4 + "##" + var10.a);
            }

            if(var14) {
               var21.a(var28);
            } else if(var7.c()) {
               if(var28 != null) {
                  var7 = var28.a();
               }
            } else {
               a(var7, var28);
            }
         }

         if(var25) {
            var5 = var7;
         } else {
            var21.c(var7);
            var5.b(var21);
            if(!var7.c() && !var5.c()) {
               HashMap var27;
               if((var27 = (HashMap)this.i.get(var2)) == null) {
                  var27 = new HashMap();
               }

               Openflower218 var29;
               (var29 = var5.a()).a(var7);
               var13 = var29.e().iterator();

               Openflower212 var17;
               IntPair var20;
               while(var13.hasNext()) {
                  Entry var32;
                  for(Iterator var15 = ((Openflower212)(var32 = (Entry)var13.next()).getValue()).iterator(); var15.hasNext(); var17.a((Object)Integer.valueOf(var20.val2))) {
                     Integer var31 = (Integer)var15.next();
                     Integer var16 = (Integer)var32.getKey();
                     IntPair var19 = new IntPair(var16, var31);
                     (var17 = var5.b(var16.intValue())).b((Object)var31);
                     if((var20 = (IntPair)var27.get(var19)) == null) {
                        Integer var22 = this.a(Integer.valueOf(var19.val1), (Openflower154_SomeSorter)null);
                        var20 = new IntPair(var19.val1, var22.intValue());
                        Openflower166 var23 = (Openflower166)this.j.a.b(var19);
                        Openflower166 var24;
                        Openflower166 var18 = var24 = this.j.a(var20);
                        var18.e |= 2;
                        Openflower165 var26 = new Openflower165(1, var23, var24);
                        var23.c(var26);
                        var24.d(var26);
                        var27.put(var19, var20);
                     }
                  }
               }

               if(!var27.isEmpty()) {
                  this.i.put(var2, var27);
               }
            }
         }
      }

      return var5;
   }

   private static Openflower218 a(Openflower218 var0, Openflower218 var1) {
      if(var1 != null && !var1.c()) {
         var0.c(var1);
      }

      return var0;
   }

   private static boolean b(Openflower218 var0, Openflower218 var1) {
      if(var0 == null) {
         return var1 == null;
      } else if(var1 == null) {
         return false;
      } else if(var0.b() != var1.b()) {
         return false;
      } else {
         Iterator var2 = var1.e().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if(!Util.safeEquals((Object)var0.b(((Integer)var3.getKey()).intValue()), var3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   private void a(Openflower218 var1, Integer var2, Integer var3) {
      Openflower212 var4;
      (var4 = this.m.a()).a((Object)var3);
      var1.a(var2.intValue(), var4);
   }

   private void a(Openflower154_SomeSorter var1, Openflower137 var2, Openflower143 var3) {
      switch(var1.c) {
      case 7:
      case 12:
         List var5;
         if(var1.c == 12) {
            var5 = ((Openflower147)var1).g();
         } else {
            var5 = ((Openflower148)var1).e();
         }

         for(int var6 = 1; var6 < var1.t().size(); ++var6) {
            int var7 = ((Openflower135)var5.get(var6 - 1)).getIndex();
            int var8 = this.a(Integer.valueOf(var7), var1).intValue();
            Openflower218 var4 = new Openflower218();
            this.a(var4, Integer.valueOf(var7), Integer.valueOf(var8));
            this.d.put(((Openflower138)var2.a.b(((String[])var3.a().get(((Openflower154_SomeSorter)var1.t().get(var6)).id))[0])).b, var4);
            this.j.a(new IntPair(var7, var8));
         }
      default:
         Iterator var10 = var1.t().iterator();

         while(var10.hasNext()) {
            Openflower154_SomeSorter var9 = (Openflower154_SomeSorter)var10.next();
            this.a(var9, var2, var3);
         }

      }
   }

   private Openflower218 a(MethodInfo var1, Openflower152 var2) {
      boolean var3 = (var1.getAccess() & 8) == 0;
      MethodSignatureHolder var10;
      int var4 = (var10 = MethodSignatureHolder.create(var1.getDesc())).params.length + (var3?1:0);
      int var5 = 0;
      Openflower218 var6 = new Openflower218();

      for(int var7 = 0; var7 < var4; ++var7) {
         int var8 = this.a(Integer.valueOf(var5), (Openflower154_SomeSorter)var2).intValue();
         Openflower212 var9;
         (var9 = this.m.a()).a((Object)Integer.valueOf(var8));
         var6.a(var5, var9);
         this.j.a(new IntPair(var5, var8));
         if(var3) {
            if(var7 == 0) {
               ++var5;
            } else {
               var5 += var10.params[var7 - 1].varSize;
            }
         } else {
            var5 += var10.params[var7].varSize;
         }
      }

      return var6;
   }

   private static Integer a(Openflower154_SomeSorter var0) {
      Openflower154_SomeSorter var1;
      for(; (var1 = var0.B()) != null; var0 = var1) {
         if(var1.c != 12 && var1.c != 7) {
            if(var1.c == 10 && ((Openflower156)var1).f() == var0) {
               return var1.id;
            }
         } else if(var1.s() == var0) {
            return var1.id;
         }
      }

      return null;
   }

   public final Openflower169 a() {
      return this.j;
   }

   public final Openflower218 a(IntPair var1) {
      Openflower166 var2;
      return (var2 = (Openflower166)this.j.a.b(var1)) != null?var2.f:null;
   }

   public final HashMap b() {
      return this.g;
   }

   public final HashMap c() {
      return this.k;
   }
}
