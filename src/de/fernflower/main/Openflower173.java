package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower144;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower164;
import de.fernflower.main.Openflower170;
import de.fernflower.main.Openflower171;
import de.fernflower.main.Openflower172;
import de.fernflower.main.Openflower212;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IDManager;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class Openflower173 {

   private HashMap a = new HashMap();
   private Openflower164 b;


   public final void a(Openflower152 var1) {
      MethodInfo var2 = (MethodInfo)Configuration.getObject("CURRENT_METHOD");
      Openflower144 var3;
      (var3 = new Openflower144()).a(var1, var2);
      Openflower137 var11 = (new Openflower143()).a(var1);
      ArrayList var5 = new ArrayList();
      Iterator var6 = var3.a().entrySet().iterator();

      int var16;
      while(var6.hasNext()) {
         Entry var12 = (Entry)var6.next();
         HashSet var7;
         (var7 = new HashSet()).add((IntPair)var12.getKey());
         Iterator var9 = ((Openflower212)var12.getValue()).iterator();

         while(var9.hasNext()) {
            Integer var8 = (Integer)var9.next();
            var7.add(new IntPair(((IntPair)var12.getKey()).val1, var8.intValue()));
         }

         for(var16 = var5.size() - 1; var16 >= 0; --var16) {
            HashSet var17 = (HashSet)var5.get(var16);
            HashSet var10;
            (var10 = new HashSet(var7)).retainAll(var17);
            if(!var10.isEmpty()) {
               var7.addAll(var17);
               var5.remove(var16);
            }
         }

         var5.add(var7);
      }

      HashMap var13 = new HashMap();
      Iterator var15 = var5.iterator();

      while(var15.hasNext()) {
         HashSet var14 = (HashSet)var15.next();
         var16 = Integer.MAX_VALUE;
         Iterator var19 = var14.iterator();

         IntPair var18;
         while(var19.hasNext()) {
            if((var18 = (IntPair)var19.next()).val2 < var16) {
               var16 = var18.val2;
            }
         }

         var19 = var14.iterator();

         while(var19.hasNext()) {
            var18 = (IntPair)var19.next();
            var13.put(new IntPair(var18.val1, var18.val2), Integer.valueOf(var16));
         }
      }

      var11.a(new Openflower170(var13));
      this.b = new Openflower164();
      this.b.a(var1, var11);
      this.a(this.b, var11);
      a(this.b);
      this.b(this.b, var11);
   }

   private static void a(Openflower164 var0) {
      HashMap var1 = var0.a();
      HashMap var6 = var0.b();
      HashSet var10000 = new HashSet((Collection)var6.keySet());
      IntPair var2 = null;
      Iterator var3 = var10000.iterator();

      while(var3.hasNext()) {
         var2 = (IntPair)var3.next();
         Descriptor var4 = (Descriptor)var6.get(var2);
         Descriptor var5 = (Descriptor)var1.get(var2);
         if(var4.type != 15 && var4.type != 16) {
            if(var4.type == 13) {
               var6.put(var2, Descriptor.OBJECT);
            }
         } else {
            var4 = var5 != null && var5.type == 1?Descriptor.CHAR:(var4.type == 15?Descriptor.BYTE:Descriptor.SHORT);
            var6.put(var2, var4);
         }
      }

   }

   private void a(Openflower164 var1, Openflower137 var2) {
      HashMap var16 = var1.a();
      HashMap var3 = var1.b();
      HashMap var4 = new HashMap();
      Iterator var6 = var3.keySet().iterator();

      while(var6.hasNext()) {
         IntPair var5;
         if((var5 = (IntPair)var6.next()).val2 >= 0) {
            HashSet var7;
            if((var7 = (HashSet)var4.get(Integer.valueOf(var5.val1))) == null) {
               var7 = new HashSet();
               var4.put(Integer.valueOf(var5.val1), var7);
            }

            var7.add(Integer.valueOf(var5.val2));
         }
      }

      HashMap var18 = new HashMap();
      Iterator var20 = var4.entrySet().iterator();

      while(var20.hasNext()) {
         Entry var19;
         if(((HashSet)(var19 = (Entry)var20.next()).getValue()).size() > 1) {
            ArrayList var17;
            Collections.sort(var17 = new ArrayList((Collection)var19.getValue()));

            for(int var8 = 0; var8 < var17.size(); ++var8) {
               IntPair var9 = new IntPair((Integer)var19.getKey(), (Integer)var17.get(var8));
               Descriptor var10 = (Descriptor)var3.get(var9);

               for(int var11 = var8 + 1; var11 < var17.size(); ++var11) {
                  IntPair var12 = new IntPair((Integer)var19.getKey(), (Integer)var17.get(var11));
                  Descriptor var13 = (Descriptor)var3.get(var12);
                  if(var10.equals((Object)var13) || var10.equals((Object)Descriptor.NULL) && var13.type == 8 || var13.equals((Object)Descriptor.NULL) && var10.type == 8) {
                     Descriptor var14 = (Descriptor)var16.get(var9);
                     Descriptor var15 = (Descriptor)var16.get(var12);
                     var16.put(var9, var14 == null?var15:(var15 == null?var14:Descriptor.a(var14, var15)));
                     var18.put(var12, Integer.valueOf(var9.val2));
                     var16.remove(var12);
                     var3.remove(var12);
                     if(var10.equals((Object)Descriptor.NULL)) {
                        var3.put(var9, var13);
                        var10 = var13;
                     }

                     var1.c().put(var9, Integer.valueOf(1));
                     var17.remove(var11);
                     --var11;
                  }
               }
            }
         }
      }

      if(!var18.isEmpty()) {
         var2.a(new Openflower171(var18));
      }

   }

   private void b(Openflower164 var1, Openflower137 var2) {
      HashMap var3 = var1.a();
      HashMap var4 = var1.b();
      HashMap var12 = var1.c();
      IDManager var5 = Configuration.getIDManager();
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      HashSet var10000 = new HashSet((Collection)var4.keySet());
      IntPair var8 = null;
      Iterator var9 = var10000.iterator();

      while(var9.hasNext()) {
         if((var8 = (IntPair)var9.next()).val2 >= 0) {
            int var10 = var8.val2 == 1?var8.val1:var5.getNext(2);
            IntPair var11 = new IntPair(var10, 0);
            var4.put(var11, (Descriptor)var4.get(var8));
            var3.put(var11, (Descriptor)var3.get(var8));
            if(var12.containsKey(var8)) {
               var12.put(var11, (Integer)var12.remove(var8));
            }

            var6.put(var8, Integer.valueOf(var10));
            var7.put(Integer.valueOf(var10), Integer.valueOf(var8.val1));
         }
      }

      var2.a(new Openflower172(var6, var3));
      this.a = var7;
   }

   public final Descriptor a(IntPair var1) {
      return this.b == null?null:this.b.a(var1);
   }

   public final void a(IntPair var1, Descriptor var2) {
      this.b.a(var1, var2);
   }

   public final int b(IntPair var1) {
      int var2 = 3;
      if(this.b != null) {
         Integer var3;
         var2 = (var3 = (Integer)this.b.c().get(var1)) == null?3:var3.intValue();
      }

      return var2;
   }

   public final void c(IntPair var1) {
      this.b.c().put(var1, Integer.valueOf(2));
   }

   public final HashMap a() {
      return this.a;
   }
}
