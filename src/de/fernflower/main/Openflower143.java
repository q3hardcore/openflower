package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower139;
import de.fernflower.main.Openflower140;
import de.fernflower.main.Openflower141;
import de.fernflower.main.Openflower142;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower149_LoopPrinter;
import de.fernflower.main.Openflower151;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower155_SwitchPrinter;
import de.fernflower.main.Openflower156;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class Openflower143 {

   private HashMap a = new HashMap();
   private List b = new ArrayList();
   private HashMap c = new HashMap();
   private HashMap d = new HashMap();
   private HashMap e = new HashMap();
   private Openflower137 f;
   private Openflower152 g;


   public final Openflower137 a(Openflower152 var1) {
      this.g = var1;
      this.f = new Openflower137();
      Openflower143 var2 = this;
      LinkedList var3;
      (var3 = new LinkedList()).add(new Openflower139(this.g, new LinkedList(), (List)null));

      label223:
      while(!var3.isEmpty()) {
         Openflower139 var4;
         Openflower154_SomeSorter var5 = (var4 = (Openflower139)var3.removeFirst()).a;
         LinkedList var6 = var4.b;
         int var7 = var4.d;
         Openflower138 var8 = null;
         Openflower138 var9 = null;
         Object var10 = new ArrayList();
         Openflower138 var11 = null;
         Openflower138 var15;
         LinkedList var25;
         Openflower138 var32;
         if(var4.f == null) {
            label219: {
               Openflower138 var10000;
               label216:
               switch(var5.c) {
               case 2:
               case 6:
               case 10:
               case 13:
               case 15:
                  int var37 = var5.t().size();
                  if(var5.c == 10) {
                     var37 = 2;
                  }

                  if(var7 <= var37) {
                     List var38 = null;
                     switch(var5.c) {
                     case 2:
                        var38 = ((Openflower151)var5).h();
                        break;
                     case 6:
                        var38 = ((Openflower155_SwitchPrinter)var5).f();
                        break;
                     case 10:
                        var38 = ((Openflower156)var5).g();
                     }

                     if(var7 < var37) {
                        var4.d = var7 + 1;
                        var3.addFirst(var4);
                        var3.addFirst(new Openflower139((Openflower154_SomeSorter)var5.t().get(var7), var6, var7 == 0 && var38 != null && var38.get(0) != null?var38:null));
                        continue;
                     }

                     var8 = (Openflower138)var2.f.a.b(((String[])var2.a.get(var5.s().id))[0]);
                     var2.a.put(var5.id, new String[]{var8.b, null});
                     if(var5.c == 2 && ((Openflower151)var5).b == 0) {
                        ((List)var10).add((Openflower105)var5.c(1073741824).get(0));
                        var10000 = var38.get(0) == null?var8:(Openflower138)var2.f.a.b(var8.b + "_tail");
                        break;
                     }
                  }
               case 3:
               case 4:
               case 9:
               case 11:
               case 14:
               default:
                  break label219;
               case 5:
                  if(var7 == 0) {
                     var4.d = 1;
                     var3.addFirst(var4);
                     var3.addFirst(new Openflower139(var5.s(), var6, (List)null));
                     continue;
                  }

                  var9 = (Openflower138)var2.f.a.b(((String[])var2.a.get(var5.s().id))[0]);
                  Openflower149_LoopPrinter var28;
                  int var31;
                  if((var31 = (var28 = (Openflower149_LoopPrinter)var5).k()) == 0) {
                     var2.a.put(var5.id, new String[]{var9.b, var9.b});
                     break label219;
                  }

                  ((List)var10).add((Openflower105)var5.c(1073741824).get(0));
                  switch(var31) {
                  case 1:
                  case 2:
                     (var8 = new Openflower138(4, var5, var5.id + "_cond")).e = var28.f();
                     var2.f.a.b(var8, var8.b);
                     var2.b.add(new Openflower140(var8.b, var5.s().id, 1));
                     if(var31 == 2) {
                        var2.a.put(var5.id, new String[]{var8.b, var8.b});
                     } else {
                        var2.a.put(var5.id, new String[]{var9.b, var8.b});
                        boolean var33 = false;
                        Iterator var36 = var2.b.iterator();

                        while(var36.hasNext()) {
                           Openflower140 var34;
                           if((var34 = (Openflower140)var36.next()).b.equals(var5.id) && var34.c == 8) {
                              var33 = true;
                              break;
                           }
                        }

                        if(!var33) {
                           var2.b.add(new Openflower140(var9.b, var5.id, 8));
                        }
                     }

                     var10000 = var8;
                     break label216;
                  case 3:
                     var32 = new Openflower138(3, var5, var5.id + "_init");
                     if(var28.j() != null) {
                        var32.e = var28.e();
                     }

                     var2.f.a.b(var32, var32.b);
                     (var15 = new Openflower138(4, var5, var5.id + "_cond")).e = var28.f();
                     var2.f.a.b(var15, var15.b);
                     Openflower138 var16;
                     (var16 = new Openflower138(5, var5, var5.id + "_inc")).e = var28.g();
                     var2.f.a.b(var16, var16.b);
                     var2.a.put(var5.id, new String[]{var32.b, var16.b});
                     var2.a.put(Integer.valueOf(-var5.id.intValue()), new String[]{var15.b, null});
                     var2.b.add(new Openflower140(var15.b, var5.s().id, 1));
                     var2.b.add(new Openflower140(var32.b, Integer.valueOf(-var5.id.intValue()), 1));
                     var2.b.add(new Openflower140(var16.b, Integer.valueOf(-var5.id.intValue()), 1));
                     boolean var17 = false;
                     Iterator var19 = var2.b.iterator();

                     while(var19.hasNext()) {
                        Openflower140 var18;
                        if((var18 = (Openflower140)var19.next()).b.equals(var5.id) && var18.c == 8) {
                           var17 = true;
                           break;
                        }
                     }

                     if(!var17) {
                        var2.b.add(new Openflower140(var9.b, var5.id, 8));
                     }

                     var11 = var15;
                  default:
                     break label219;
                  }
               case 7:
               case 12:
                  var9 = new Openflower138(6, var5, var5.id + "_try");
                  var2.a.put(var5.id, new String[]{var9.b, null});
                  var2.f.a.b(var9, var9.b);
                  var25 = new LinkedList();

                  Openflower154_SomeSorter var12;
                  LinkedList var14;
                  for(Iterator var13 = var5.t().iterator(); var13.hasNext(); var25.add(new Openflower139(var12, var14, (List)null))) {
                     var12 = (Openflower154_SomeSorter)var13.next();
                     var2.b.add(new Openflower140(var9.b, var12.id, 1));
                     var14 = var6;
                     if(var5.c == 12 && ((Openflower147)var5).a_()) {
                        var14 = new LinkedList(var6);
                        if(var12 == var5.s()) {
                           var14.add(new Openflower142((Openflower147)var5, Boolean.FALSE.booleanValue()));
                        } else {
                           var14.add(new Openflower142((Openflower147)var5, Boolean.TRUE.booleanValue(), 4, var2.g.e(), var12, var12, var9, var9, true));
                        }
                     }
                  }

                  var3.addAll(0, var25);
                  break label219;
               case 8:
                  var8 = new Openflower138(var5, (Openflower146)var5);
                  if(var5.E() != null) {
                     var8.e = var5.E();
                  }

                  var2.f.a.b(var8, var8.b);
                  var2.a.put(var5.id, new String[]{var8.b, null});
                  ((List)var10).addAll(var5.c(1073741824));
                  var11 = var8;
                  List var24 = var4.c;
                  if(var4.c != null) {
                     (var9 = new Openflower138(2, var5, var5.id + "_tail")).e = var24;
                     var2.f.a.b(var9, var9.b);
                     var2.a.put(Integer.valueOf(-var5.id.intValue()), new String[]{var9.b, null});
                     var2.b.add(new Openflower140(var8.b, Integer.valueOf(-var5.id.intValue()), 1));
                     var11 = var9;
                  }

                  if(var5.u() == 0) {
                     var2.e.put(var11.b, ((Openflower105)((List)var10).get(0)).c().id.toString());
                  }
                  break label219;
               }

               var11 = var10000;
            }
         }

         if(var11 != null) {
            if(var4.f != null) {
               var10 = var4.f;
            }

            for(var7 = var4.e; var7 < ((List)var10).size(); ++var7) {
               Openflower105 var26 = (Openflower105)((List)var10).get(var7);
               var25 = new LinkedList(var6);
               int var29 = var26.a();
               Openflower154_SomeSorter var30 = var26.c();
               var32 = var11;
               var15 = var11;
               Openflower154_SomeSorter var35 = null;
               Openflower154_SomeSorter var39 = null;
               boolean var41 = false;
               boolean var40 = false;

               boolean var27;
               do {
                  Openflower142 var23 = null;
                  if(!var25.isEmpty()) {
                     var23 = (Openflower142)var25.getLast();
                  }

                  var27 = true;
                  if(var23 == null) {
                     var2.a(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                  } else {
                     Openflower147 var20 = var23.a;
                     if(var23.b) {
                        if(var29 == 32) {
                           var25.removeLast();
                           var30 = var23.e;
                           var29 = var23.c;
                           var32 = var23.h;
                           var15 = var23.i;
                           var35 = var23.f;
                           var39 = var23.g;
                           var40 = true;
                           var41 = var20.f() != null & var23.d;
                           var27 = false;
                        } else if(!var20.g(var30)) {
                           var25.removeLast();
                           var27 = false;
                        } else {
                           var2.a(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                        }
                     } else {
                        if(!var20.g(var30)) {
                           var2.a(var11, var20.c(), 1, var40?var32:null, var15, var35, var39, var41);
                           var25.removeLast();
                           var25.add(new Openflower142(var20, Boolean.TRUE.booleanValue(), var29, var30, var20.c(), var39 == null?var20.c():var39, var11, var15, false));
                           var4.e = var7 + 1;
                           var4.f = (List)var10;
                           var3.addFirst(var4);
                           var3.addFirst(new Openflower139(var20.c(), var25, (List)null));
                           continue label223;
                        }

                        var2.a(var11, var30, var29, var40?var32:null, var15, var35, var39, var41);
                     }
                  }
               } while(!var27);
            }
         }
      }

      Openflower154_SomeSorter var21 = var1.e();
      Openflower138 var22;
      (var22 = new Openflower138(1, var21, var21.id.toString())).e = new ArrayList();
      this.f.a.a((Object)var22, (Object)var22.b);
      this.a.put(var21.id, new String[]{var22.b, null});
      this.b();
      this.f.b = (Openflower138)this.f.a.b(((String[])this.a.get(var1.id))[0]);
      this.f.a();
      return this.f;
   }

   private void a(Openflower138 var1, Openflower154_SomeSorter var2, int var3, Openflower138 var4, Openflower138 var5, Openflower154_SomeSorter var6, Openflower154_SomeSorter var7, boolean var8) {
      if(var3 != 32) {
         this.b.add(new Openflower140(var1.b, var2.id, var3));
      }

      if(var4 != null) {
         Object var9;
         if((var9 = (List)this.c.get(var1.b)) == null) {
            this.c.put(var1.b, var9 = new ArrayList());
         }

         ((List)var9).add(new String[]{var4.b, var2.id.toString(), var6.id.toString(), var8?"1":null});
         if((var9 = (List)this.d.get(var1.b)) == null) {
            this.d.put(var1.b, var9 = new ArrayList());
         }

         ((List)var9).add(new String[]{var5.b, var2.id.toString(), var7.id.toString()});
      }

   }

   private void b() {
      Iterator var2 = this.b.iterator();

      Openflower138 var5;
      while(var2.hasNext()) {
         Openflower140 var1;
         String var3 = (var1 = (Openflower140)var2.next()).a;
         Integer var4 = var1.b;
         var5 = (Openflower138)this.f.a.b(var3);
         Openflower138 var6 = (Openflower138)this.f.a.b(((String[])this.a.get(var4))[var1.c == 8?1:0]);
         if(!var5.f.contains(var6)) {
            var5.f.add(var6);
         }

         if(!var6.g.contains(var5)) {
            var6.g.add(var5);
         }

         if(this.e.containsKey(var3) && !var4.equals(this.e.get(var3))) {
            this.f.e.put(var3, var6.b);
         }
      }

      for(int var9 = 0; var9 < 2; ++var9) {
         Iterator var11 = (var9 == 0?this.c:this.d).entrySet().iterator();

         while(var11.hasNext()) {
            Entry var10 = (Entry)var11.next();
            ArrayList var12 = new ArrayList();
            List var10000 = (List)var10.getValue();
            var5 = null;
            Iterator var13 = var10000.iterator();

            while(var13.hasNext()) {
               String[] var14 = (String[])var13.next();
               Openflower138 var7 = (Openflower138)this.f.a.b(((String[])this.a.get(Integer.valueOf(Integer.parseInt(var14[1]))))[0]);
               Openflower138 var8 = (Openflower138)this.f.a.b(((String[])this.a.get(Integer.valueOf(Integer.parseInt(var14[2]))))[0]);
               var12.add(new Openflower141(var14[0], var7.b, var8.b, (Openflower141)null));
               if(var9 == 0 && var14[3] != null) {
                  this.f.f.put((String)var10.getKey(), var7.b);
               }
            }

            if(!var12.isEmpty()) {
               (var9 == 0?this.f.c:this.f.d).put((String)var10.getKey(), new ArrayList(new HashSet(var12)));
            }
         }
      }

   }

   public final HashMap a() {
      return this.a;
   }
}
