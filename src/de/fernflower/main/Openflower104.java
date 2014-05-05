package de.fernflower.main;

import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower103;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower144;
import de.fernflower.main.Openflower145;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower165;
import de.fernflower.main.Openflower166;
import de.fernflower.main.Openflower169;
import de.fernflower.main.Openflower212;
import de.fernflower.main.Openflower218;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower132;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower104 {

   public final void a(Openflower152 var1, MethodInfo var2) {
      HashSet var3 = new HashSet();
      Openflower145 var4 = null;

      boolean var5;
      do {
         var5 = false;
         Openflower144 var6;
         (var6 = new Openflower144()).a(var1, var2);

         for(Openflower103 var7 = new Openflower103(var4 == null); var7.a(var1, var3, var6); var5 = true) {
            ;
         }

         this.a((Openflower154_SomeSorter)var1);
         Openflower102.a((Openflower154_SomeSorter)var1);
         (var4 = new Openflower145()).a(var1, var2);
         if(this.a(var1, var4)) {
            var5 = true;
         }

         this.a((Openflower154_SomeSorter)var1);
      } while(var5);

      (var4 = new Openflower145()).a(var1, var2);
      this.a(var1, var4);
      this.a((Openflower154_SomeSorter)var1);
   }

   private void a(Openflower154_SomeSorter var1) {
      Iterator var2;
      if(var1.E() == null) {
         var2 = var1.d().iterator();

         while(var2.hasNext()) {
            Object var3;
            if((var3 = var2.next()) instanceof Openflower154_SomeSorter) {
               this.a((Openflower154_SomeSorter)var3);
            } else if(var3 instanceof Element) {
               a((Element)var3);
            }
         }

      } else {
         var2 = var1.E().iterator();

         while(var2.hasNext()) {
            a((Element)var2.next());
         }

      }
   }

   private static void a(Element var0) {
      List var1;
      (var1 = var0.a(true)).add(var0);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         if((var0 = (Element)var2.next()).a == 12) {
            ((Openflower135)var0).setIndex2(0);
         }
      }

   }

   private boolean a(Openflower152 var1, Openflower145 var2) {
      Openflower143 var10000 = new Openflower143();
      Object var3 = null;
      Openflower137 var13 = var10000.a(var1);
      boolean var15 = false;
      HashSet var4 = new HashSet();
      LinkedList var5 = new LinkedList();
      LinkedList var6 = new LinkedList();
      var5.add(var13.b);
      var6.add(new HashMap());

      while(!var5.isEmpty()) {
         Openflower138 var14 = (Openflower138)var5.removeFirst();
         HashMap var7 = (HashMap)var6.removeFirst();
         if(!var4.contains(var14)) {
            var4.add(var14);
            ArrayList var8 = new ArrayList();
            if(!var14.e.isEmpty()) {
               var8.add(var14.e);
            }

            Openflower138 var9;
            if(var14.f.size() == 1 && (var9 = (Openflower138)var14.f.get(0)).a == 2 && !var9.e.isEmpty()) {
               var8.add(((Openflower138)var14.f.get(0)).e);
               var14 = var9;
            }

            for(int var16 = 0; var16 < var8.size(); ++var16) {
               List var10 = (List)var8.get(var16);

               int[] var18;
               for(int var11 = 0; var11 < var10.size(); var15 |= var18[1] == 1) {
                  Element var12 = null;
                  if(var11 == var10.size() - 1) {
                     if(var16 < var8.size() - 1) {
                        var12 = (Element)((List)var8.get(var16 + 1)).get(0);
                     }
                  } else {
                     var12 = (Element)var10.get(var11 + 1);
                  }

                  if((var18 = this.a(var10, var11, var12, var7, var2))[0] >= 0) {
                     var11 = var18[0];
                  } else {
                     ++var11;
                  }
               }
            }

            Iterator var17 = var14.f.iterator();

            while(var17.hasNext()) {
               var9 = (Openflower138)var17.next();
               var5.add(var9);
               var6.add(new HashMap(var7));
            }
         }
      }

      return var15;
   }

   private void a(Element var1, Openflower135 var2, Element var3, Openflower145 var4) {
      var1.a(var2, var3);
      Openflower218 var6 = var4.a(new IntPair(var2));
      Iterator var9 = b(var3).iterator();

      while(var9.hasNext()) {
         IntPair var7 = (IntPair)var9.next();
         Iterator var8 = ((Openflower166)var4.a().a.b(var7)).f.e().iterator();

         while(var8.hasNext()) {
            Entry var10;
            Integer var5 = (Integer)(var10 = (Entry)var8.next()).getKey();
            if(!var6.a(var5.intValue())) {
               var8.remove();
            } else {
               Openflower212 var11;
               (var11 = (Openflower212)var10.getValue()).c(var6.b(var5.intValue()));
               if(var11.c()) {
                  var8.remove();
               }
            }
         }
      }

   }

   private int[] a(List var1, int var2, Element var3, HashMap var4, Openflower145 var5) {
      Element var6 = (Element)var1.get(var2);
      int var7 = 0;
      Iterator var9 = var6.b().iterator();

      boolean var12;
      while(var9.hasNext()) {
         Element var8 = (Element)var9.next();

         while(true) {
            Object[] var10;
            Element var11 = (Element)(var10 = this.a(var8, var6, var3, var4, var5))[0];
            var7 |= ((Boolean)var10[1]).booleanValue()?1:0;
            var12 = ((Boolean)var10[2]).booleanValue();
            if(var11 != null) {
               if(var12) {
                  this.a(var6, (Openflower135)var8, var11, var5);
                  var8 = var11;
               } else {
                  var6.a(var8, var11);
               }

               var7 = 1;
            }

            if(!var12) {
               break;
            }
         }
      }

      Openflower135 var22 = null;
      Element var23 = null;
      Openflower124 var27;
      if(var6.a == 2 && (var27 = (Openflower124)var6).g().a == 12) {
         var22 = (Openflower135)var27.g();
         var23 = var27.h();
      }

      if(var22 == null) {
         return new int[]{-1, var7};
      } else {
         IntPair var28 = new IntPair(var22);
         ArrayList var26 = new ArrayList();
         if(!(var12 = a(var5, var28, (List)var26)) && var26.isEmpty()) {
            if(var22.n() && (var23.a == 8 || var23.a == 2 || var23.a == 10)) {
               Openflower133 var19;
               if(var23.a == 10 && ((var19 = (Openflower133)var23).l() || var19.i().arrayDepth > 0 || var19.i().type != 8)) {
                  return new int[]{-1, var7};
               } else {
                  var1.set(var2, var23);
                  return new int[]{var2 + 1, 1};
               }
            } else if(var23.a == 12) {
               var1.remove(var2);
               return new int[]{var2, 1};
            } else {
               return new int[]{-1, var7};
            }
         } else {
            int var17 = var23.d_();
            if(!var22.n() && (var23.a != 12 || ((Openflower135)var23).n())) {
               return new int[]{-1, var7};
            } else if((var17 & 1) == 0 && (var12 || var26.size() > 1)) {
               return new int[]{-1, var7};
            } else {
               HashMap var18;
               boolean var21;
               if((var21 = (var18 = a(var28, var23, var5)).containsKey(Integer.valueOf(var28.val1))) && var12) {
                  return new int[]{-1, var7};
               } else {
                  HashSet var20 = var3 == null?null:b(var3);
                  if(var23.a != 3 && var23.a != 12 && var20 != null && var18.containsKey(Integer.valueOf(var28.val1))) {
                     Iterator var13 = var26.iterator();

                     while(var13.hasNext()) {
                        Openflower166 var25 = (Openflower166)var13.next();
                        if(!var20.contains(new IntPair(var25.a, var25.b))) {
                           return new int[]{-1, var7};
                        }
                     }
                  }

                  var18.remove(Integer.valueOf(var28.val1));
                  boolean var24 = false;
                  boolean var31 = false;
                  HashSet var14 = new HashSet();
                  Iterator var15 = var26.iterator();

                  while(var15.hasNext()) {
                     Openflower166 var29 = (Openflower166)var15.next();
                     IntPair var16;
                     if(a(var16 = new IntPair(var29.a, var29.b), var18, var5, var28) && (var23.a == 3 || var23.a == 12 || var23.a == 5 || var20 == null || var20.contains(var16))) {
                        var14.add(var16);
                        var31 = true;
                     } else {
                        var24 = true;
                     }
                  }

                  if(var21 && var24) {
                     return new int[]{-1, var7};
                  } else {
                     IntPair var30;
                     Element var32;
                     for(var15 = var14.iterator(); var15.hasNext(); var4.put(var30, var32)) {
                        var30 = (IntPair)var15.next();
                        var32 = var23.copy();
                        if(var23.a == 5 && var5.c().containsKey(Integer.valueOf(var23.b))) {
                           var5.c().put(Integer.valueOf(var32.b), (Integer)var5.c().get(Integer.valueOf(var23.b)));
                        }
                     }

                     if(!var12 && !var24) {
                        var1.remove(var2);
                        return new int[]{var2, 1};
                     } else if(var31) {
                        return new int[]{var2 + 1, var7};
                     } else {
                        return new int[]{-1, var7};
                     }
                  }
               }
            }
         }
      }
   }

   private static HashSet b(Element var0) {
      HashSet var1 = new HashSet();
      ArrayList var2;
      (var2 = new ArrayList(var0.a(true))).add(var0);
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         if((var0 = (Element)var4.next()).a == 12) {
            Openflower135 var3 = (Openflower135)var0;
            var1.add(new IntPair(var3));
         }
      }

      return var1;
   }

   private Object[] a(Element var1, Element var2, Element var3, HashMap var4, Openflower145 var5) {
      boolean var6 = false;
      Iterator var8 = var1.b().iterator();

      while(var8.hasNext()) {
         Element var7 = (Element)var8.next();

         while(true) {
            Object[] var9;
            Element var10 = (Element)(var9 = this.a(var7, var2, var3, var4, var5))[0];
            var6 |= ((Boolean)var9[1]).booleanValue();
            boolean var11 = ((Boolean)var9[2]).booleanValue();
            if(var10 != null) {
               if(var11) {
                  this.a(var1, (Openflower135)var7, var10, var5);
                  var7 = var10;
               } else {
                  var1.a(var7, var10);
               }

               var6 = true;
            }

            if(!var11) {
               break;
            }
         }
      }

      Element var22 = null;
      if(var1.a == 12) {
         Openflower135 var13 = (Openflower135)var1;
         var22 = (Element)var4.get(new IntPair(var13));
      }

      if(var22 != null) {
         return new Object[]{var22, Boolean.valueOf(true), Boolean.valueOf(true)};
      } else {
         Openflower135 var24 = null;
         Element var23 = null;
         Openflower124 var26;
         if(var1.a == 2 && (var26 = (Openflower124)var1).g().a == 12) {
            var24 = (Openflower135)var26.g();
            var23 = var26.h();
         }

         if(var24 == null) {
            return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
         } else {
            boolean var28 = false;
            Openflower132 var25;
            if(var3 == null && var2.a == 9 && (var25 = (Openflower132)var2).g() == 0 && var1.equals(var25.h())) {
               var28 = true;
            }

            if(!var24.n() && !var28) {
               return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
            } else {
               IntPair var30 = new IntPair(var24);
               ArrayList var14 = new ArrayList();
               boolean var16;
               if(!(var16 = a(var5, var30, (List)var14)) && var14.isEmpty()) {
                  return new Object[]{var23, Boolean.valueOf(var6), Boolean.valueOf(false)};
               } else if(!var24.n()) {
                  return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
               } else {
                  int var10000 = var23.d_();
                  boolean var21 = false;
                  if((var10000 & 3) != 3) {
                     return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                  } else {
                     HashMap var20;
                     if((var20 = a(var30, var23, var5)).containsKey(Integer.valueOf(var30.val1)) && var16) {
                        return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                     } else {
                        var20.remove(Integer.valueOf(var30.val1));
                        HashSet var18 = b(var2);
                        if(var3 != null) {
                           var18.addAll(b(var3));
                        }

                        boolean var19 = false;
                        HashSet var27 = new HashSet();
                        Iterator var31 = var14.iterator();

                        while(var31.hasNext()) {
                           Openflower166 var15 = (Openflower166)var31.next();
                           IntPair var12;
                           if(a(var12 = new IntPair(var15.a, var15.b), var20, var5, var30) && (var23.a == 12 || var18.contains(var12))) {
                              var27.add(var12);
                           } else {
                              var19 = true;
                           }
                        }

                        if(!var16 && !var19) {
                           IntPair var17;
                           Element var29;
                           for(var31 = var27.iterator(); var31.hasNext(); var4.put(var17, var29)) {
                              var17 = (IntPair)var31.next();
                              var29 = var23.copy();
                              if(var23.a == 5 && var5.c().containsKey(Integer.valueOf(var23.b))) {
                                 var5.c().put(Integer.valueOf(var29.b), (Integer)var5.c().get(Integer.valueOf(var23.b)));
                              }
                           }

                           return new Object[]{var23, Boolean.valueOf(var6), Boolean.valueOf(false)};
                        } else {
                           return new Object[]{null, Boolean.valueOf(var6), Boolean.valueOf(false)};
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean a(Openflower145 var0, IntPair var1, List var2) {
      Openflower166 var10 = (Openflower166)var0.a().a.b(var1);
      HashSet var11 = new HashSet();
      HashSet var3 = new HashSet();
      LinkedList var4;
      (var4 = new LinkedList()).add(var10);

      while(!var4.isEmpty()) {
         Openflower166 var5 = (Openflower166)var4.remove(0);
         var11.add(var5);
         if(var5 != var10 && (var5.e & 2) == 0) {
            var2.add(var5);
         }

         Iterator var6 = var5.c.iterator();

         while(var6.hasNext()) {
            Openflower165 var12;
            Openflower166 var7 = (var12 = (Openflower165)var6.next()).b;
            if(!var11.contains(var12.b)) {
               boolean var13 = true;
               Iterator var9 = var7.d.iterator();

               while(true) {
                  if(var9.hasNext()) {
                     Openflower165 var8 = (Openflower165)var9.next();
                     if(var11.contains(var8.a)) {
                        continue;
                     }

                     var13 = false;
                  }

                  if(var13) {
                     var4.add(var7);
                  } else {
                     var3.add(var7);
                  }
                  break;
               }
            }
         }
      }

      var3.removeAll(var11);
      if(var3.isEmpty()) {
         return false;
      } else {
         return true;
      }
   }

   private static boolean a(IntPair var0, HashMap var1, Openflower145 var2, IntPair var3) {
      Openflower169 var4 = var2.a();
      Openflower218 var5;
      if((var5 = var2.a(var0)) == null) {
         return false;
      } else if(!Util.safeEquals(var2.b().get(var3), var2.b().get(var0))) {
         return false;
      } else {
         Iterator var9 = var1.entrySet().iterator();

         while(var9.hasNext()) {
            Entry var8 = (Entry)var9.next();
            Openflower212 var10;
            if((var10 = var5.b(((Integer)var8.getKey()).intValue())) == null) {
               return false;
            }

            HashSet var12 = new HashSet();
            Iterator var7 = ((HashSet)var8.getValue()).iterator();

            while(var7.hasNext()) {
               IntPair var6 = (IntPair)var7.next();
               var12.add((Openflower166)var4.a.b(var6));
            }

            boolean var13 = false;
            Iterator var11 = var10.iterator();

            while(true) {
               if(var11.hasNext()) {
                  Integer var14 = (Integer)var11.next();
                  Openflower166 var15 = (Openflower166)var4.a.b(new IntPair(((Integer)var8.getKey()).intValue(), var14.intValue()));
                  if(!var4.a(var15, var12)) {
                     continue;
                  }

                  var13 = true;
               }

               if(!var13) {
                  return false;
               }
               break;
            }
         }

         return true;
      }
   }

   private static HashMap a(IntPair var0, Element var1, Openflower145 var2) {
      HashMap var3 = new HashMap();
      Openflower218 var4 = var2.a(var0);
      List var5;
      (var5 = var1.a(true)).add(var1);
      Iterator var10 = var5.iterator();

      while(var10.hasNext()) {
         HashSet var6;
         Integer var7;
         Iterator var8;
         int var9;
         if((var1 = (Element)var10.next()).a == 12) {
            var9 = ((Openflower135)var1).getIndex();
            if(var0.val1 != var9) {
               if(!var4.a(var9)) {
                  throw new RuntimeException("inkonsistent live map!");
               }

               var6 = new HashSet();
               var8 = var4.b(var9).iterator();

               while(var8.hasNext()) {
                  var7 = (Integer)var8.next();
                  var6.add(new IntPair(var9, var7.intValue()));
               }

               var3.put(Integer.valueOf(var9), var6);
            } else {
               var3.put(Integer.valueOf(var9), (Object)null);
            }
         } else if(var1.a == 5 && var2.c().containsKey(Integer.valueOf(var1.b))) {
            var9 = ((Integer)var2.c().get(Integer.valueOf(var1.b))).intValue();
            if(var4.a(var9)) {
               var6 = new HashSet();
               var8 = var4.b(var9).iterator();

               while(var8.hasNext()) {
                  var7 = (Integer)var8.next();
                  var6.add(new IntPair(var9, var7.intValue()));
               }

               var3.put(Integer.valueOf(var9), var6);
            }
         }
      }

      return var3;
   }
}
