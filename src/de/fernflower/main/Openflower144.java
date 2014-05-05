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
import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower214;
import de.fernflower.main.Openflower218;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower144 {

   private HashMap a = new HashMap();
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();
   private HashMap d = new HashMap();
   private HashMap e = new HashMap();
   private HashMap f = new HashMap();
   private List g = new ArrayList();
   private Openflower214 h;


   public final void a(Openflower152 var1, MethodInfo var2) {
      Openflower143 var3;
      Openflower137 var4 = (var3 = new Openflower143()).a(var1);
      HashSet var5 = new HashSet();

      for(int var6 = 0; var6 < 64; ++var6) {
         var5.add(Integer.valueOf(var6));
      }

      this.h = new Openflower214(var5);
      Openflower218 var8 = this.a(var2);
      this.d.put(var4.b.b, var8);
      this.a((Openflower154_SomeSorter)var1, var4, var3);
      HashSet var7 = new HashSet();

      do {
         this.a(var4, var7);
      } while(!var7.isEmpty());

   }

   private void a(Openflower137 var1, HashSet var2) {
      Iterator var4 = var1.a.iterator();

      while(var4.hasNext()) {
         Openflower138 var3 = (Openflower138)var4.next();
         var2.remove(var3.b);
         Openflower137 var7 = var1;
         Openflower138 var6 = var3;
         Openflower144 var5 = this;
         Openflower218 var8 = new Openflower218();
         Iterator var10 = var3.g.iterator();

         Openflower218 var17;
         while(var10.hasNext()) {
            Openflower138 var9 = (Openflower138)var10.next();
            var17 = var5.a(var6.b, var9.b, var7, var6.b);
            if(var8.c()) {
               var8 = var17.a();
            } else {
               a(var8, var17);
            }
         }

         if(var5.d.containsKey(var6.b)) {
            var17 = (Openflower218)var5.d.get(var6.b);
            if(var8.c()) {
               var8 = var17.a();
            } else {
               a(var8, var17);
            }
         }

         var5.a.put(var6.b, var8);
         Openflower218 var12 = (Openflower218)this.a.get(var3.b);
         var12 = new Openflower218(var12);
         Openflower218[] var13 = new Openflower218[]{var12, null};
         if(var3.e != null) {
            Iterator var15 = var3.e.iterator();

            while(var15.hasNext()) {
               Element var14 = (Element)var15.next();
               this.a(var14, var13);
            }
         }

         if(var13[1] == null) {
            var13[1] = var13[0];
         }

         if(!b(var13[0], (Openflower218)this.b.get(var3.b)) || this.c.containsKey(var3.b) && !b(var13[1], (Openflower218)this.c.get(var3.b))) {
            this.b.put(var3.b, var13[0]);
            if(var1.e.containsKey(var3.b)) {
               this.c.put(var3.b, var13[1]);
            }

            Iterator var11 = var3.f.iterator();

            while(var11.hasNext()) {
               Openflower138 var16 = (Openflower138)var11.next();
               var2.add(var16.b);
            }
         }
      }

   }

   private void a(Element var1, Openflower218[] var2) {
      if(var1 != null) {
         Openflower135 var3 = null;
         boolean var4 = false;
         Element var14;
         switch(var1.a) {
         case 2:
            Openflower124 var11;
            if((var11 = (Openflower124)var1).i() == -1 && (var14 = var11.g()).a == 12) {
               var3 = (Openflower135)var14;
            }
         case 3:
         case 4:
         case 5:
         default:
            break;
         case 6:
            Openflower129 var5;
            switch((var5 = (Openflower129)var1).i()) {
            case 36:
               this.a((Element)var5.j().get(0), var2);
               Openflower218 var12;
               if(var2[1] == null) {
                  var12 = new Openflower218(var2[0]);
               } else {
                  var12 = var2[1];
                  var2[1] = null;
               }

               this.a((Element)var5.j().get(1), var2);
               Openflower218[] var6 = new Openflower218[]{var12, null};
               this.a((Element)var5.j().get(2), var6);
               a(var2[0], var6[0]);
               var2[1] = null;
               var4 = true;
               break;
            case 48:
               this.a((Element)var5.j().get(0), var2);
               Openflower218[] var7 = new Openflower218[]{new Openflower218(var2[0]), null};
               this.a((Element)var5.j().get(1), var7);
               var2[1] = a(var2[var2[1] == null?0:1], var7[var7[1] == null?0:1]);
               var2[0] = var7[0];
               var4 = true;
               break;
            case 49:
               this.a((Element)var5.j().get(0), var2);
               Openflower218[] var8 = new Openflower218[]{new Openflower218(var2[var2[1] == null?0:1]), null};
               this.a((Element)var5.j().get(1), var8);
               var2[1] = var8[var8[1] == null?0:1];
               var2[0] = a(var2[0], var8[0]);
               var4 = true;
            }
         }

         if(!var4) {
            List var13;
            (var13 = var1.b()).remove(var3);
            Iterator var15 = var13.iterator();

            while(var15.hasNext()) {
               var14 = (Element)var15.next();
               this.a(var14, var2);
            }

            Openflower218 var16 = var2[0];
            Integer var17;
            if(var3 != null) {
               Integer var18 = Integer.valueOf(var3.getIndex());
               if(var3.getIndex2() == 0) {
                  var17 = this.a(var18);
                  var3.setIndex2(var17.intValue());
                  this.a(var16, var18, var17);
               } else {
                  this.a(var16, var18, Integer.valueOf(var3.getIndex2()));
               }
            } else {
               if(var1.a == 12) {
                  Openflower135 var20;
                  var17 = Integer.valueOf((var20 = (Openflower135)var1).getIndex());
                  Integer var9;
                  Openflower212 var19;
                  int var21;
                  if((var21 = (var19 = var16.b(var17.intValue())).b()) == 1) {
                     var9 = (Integer)var19.iterator().next();
                     var20.setIndex2(var9.intValue());
                     return;
                  }

                  if(var21 == 2) {
                     var9 = Integer.valueOf(var20.getIndex2());
                     IntPair var10 = new IntPair(var17, var9);
                     if(var9.intValue() != 0 && this.e.containsKey(var10)) {
                        this.a(var16, var17, var9);
                        ((Openflower212)this.e.get(var10)).a(var19);
                        return;
                     }

                     var9 = this.a(var17);
                     var20.setIndex2(var9.intValue());
                     this.a(var16, var17, var9);
                     this.e.put(new IntPair(var17, var9), var19);
                  }
               }

            }
         }
      }
   }

   private Integer a(Integer var1) {
      Integer var2;
      if((var2 = (Integer)this.f.get(var1)) == null) {
         var2 = new Integer(1);
      } else {
         var2 = new Integer(var2.intValue() + 1);
      }

      this.f.put(var1, var2);
      return var2;
   }

   private Openflower218 a(String var1, String var2, Openflower137 var3, String var4) {
      Openflower218 var5 = new Openflower218();
      if(var1.equals(var3.e.get(var2))) {
         if(this.c.containsKey(var2)) {
            var5 = ((Openflower218)this.c.get(var2)).a();
         }
      } else if(this.b.containsKey(var2)) {
         var5 = ((Openflower218)this.b.get(var2)).a();
      }

      boolean var10000 = var3.c.containsKey(var2);
      boolean var6 = false;
      if(var10000 && !var5.c()) {
         Openflower218 var15 = var5.a();
         Openflower218 var7 = new Openflower218();
         String var8;
         boolean var16 = (var8 = (String)var3.f.get(var2)) != null && !var1.equals(var8);
         HashSet var9 = new HashSet();
         Iterator var11 = ((List)var3.d.get(var2)).iterator();

         Openflower141 var10;
         while(var11.hasNext()) {
            var10 = (Openflower141)var11.next();
            var9.add(var10.b + "##" + var10.a);
         }

         var11 = ((List)var3.c.get(var2)).iterator();

         while(var11.hasNext()) {
            var10 = (Openflower141)var11.next();
            boolean var12;
            Openflower218 var14;
            if(var12 = var3.c.containsKey(var10.a)) {
               var14 = this.a(var10.c, var10.a, var3, var4);
            } else if(var10.c.equals(var3.e.get(var10.a))) {
               var14 = (Openflower218)this.c.get(var10.a);
            } else {
               var14 = (Openflower218)this.b.get(var10.a);
            }

            boolean var13 = false;
            if(var12) {
               var13 = !var10.b.equals(var1);
            } else {
               var13 = !var9.contains(var4 + "##" + var10.a);
            }

            if(var13) {
               var15.a(var14);
            } else if(var7.c()) {
               if(var14 != null) {
                  var7 = var14.a();
               }
            } else {
               a(var7, var14);
            }
         }

         if(var16) {
            var5 = var7;
         } else {
            var15.c(var7);
            Openflower218 var17;
            if((var17 = (Openflower218)this.a.get(var1)) != null) {
               var15.c(var17);
            }

            var5.b(var15);
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
      (var4 = this.h.a()).a((Object)var3);
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
            int var8 = this.a(Integer.valueOf(var7)).intValue();
            Openflower218 var4 = new Openflower218();
            this.a(var4, Integer.valueOf(var7), Integer.valueOf(var8));
            this.d.put(((Openflower138)var2.a.b(((String[])var3.a().get(((Openflower154_SomeSorter)var1.t().get(var6)).id))[0])).b, var4);
            this.g.add(new IntPair(var7, var8));
         }
      default:
         Iterator var10 = var1.t().iterator();

         while(var10.hasNext()) {
            Openflower154_SomeSorter var9 = (Openflower154_SomeSorter)var10.next();
            this.a(var9, var2, var3);
         }

      }
   }

   private Openflower218 a(MethodInfo var1) {
      boolean var2 = (var1.getAccess() & 8) == 0;
      MethodSignatureHolder var9;
      int var3 = (var9 = MethodSignatureHolder.create(var1.getDesc())).params.length + (var2?1:0);
      int var4 = 0;
      Openflower218 var5 = new Openflower218();

      for(int var6 = 0; var6 < var3; ++var6) {
         int var7 = this.a(Integer.valueOf(var4)).intValue();
         Openflower212 var8;
         (var8 = this.h.a()).a((Object)Integer.valueOf(var7));
         var5.a(var4, var8);
         this.g.add(new IntPair(var4, var7));
         if(var2) {
            if(var6 == 0) {
               ++var4;
            } else {
               var4 += var9.params[var6 - 1].varSize;
            }
         } else {
            var4 += var9.params[var6].varSize;
         }
      }

      return var5;
   }

   public final HashMap a() {
      return this.e;
   }
}
