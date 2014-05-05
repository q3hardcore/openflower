package de.fernflower.main;

import de.fernflower.main.Openflower114;
import de.fernflower.main.Openflower116;
import de.fernflower.main.Openflower165;
import de.fernflower.main.Openflower166;
import de.fernflower.main.Openflower168;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Openflower169 {

   public DualArrayList a = new DualArrayList();
   private Openflower114 b;


   public final Openflower166 a(IntPair var1) {
      Openflower166 var2;
      this.a.a((Object)(var2 = new Openflower166(var1.val1, var1.val2)), (Object)var1);
      return var2;
   }

   public final boolean a(Openflower166 var1, HashSet var2) {
      if(var2.size() == 1) {
         return this.b.a(var1, (Openflower116)var2.iterator().next());
      } else {
         HashSet var5 = new HashSet();
         if(var2.contains(var1)) {
            return true;
         } else {
            LinkedList var3;
            (var3 = new LinkedList()).add(var1);

            while(!var3.isEmpty()) {
               var1 = (Openflower166)var3.remove(0);
               if(!var5.contains(var1)) {
                  var5.add(var1);
                  if(var1.d.isEmpty()) {
                     return false;
                  }

                  Iterator var4 = var1.d.iterator();

                  while(var4.hasNext()) {
                     var1 = ((Openflower165)var4.next()).a;
                     if(!var5.contains(var1) && !var2.contains(var1)) {
                        var3.add(var1);
                     }
                  }
               }
            }

            return true;
         }
      }
   }

   public final void a() {
      HashSet var1 = new HashSet();
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         Openflower166 var2;
         if((var2 = (Openflower166)var3.next()).d.isEmpty()) {
            var1.add(var2);
         }
      }

      this.b = new Openflower114(new Openflower168(this, var1));
      this.b.a();
   }

   private static void a(Openflower166 var0, List var1, HashSet var2) {
      HashMap var3 = new HashMap();
      LinkedList var4 = new LinkedList();
      LinkedList var5 = new LinkedList();
      var4.add(var0);
      var5.add(Integer.valueOf(0));

      while(!var4.isEmpty()) {
         var0 = (Openflower166)var4.getLast();
         int var6 = ((Integer)var5.removeLast()).intValue();
         var2.add(var0);
         Object var7;
         if((var7 = (List)var3.get(var0)) == null) {
            var3.put(var0, var7 = new ArrayList(var0.c));
         }

         while(true) {
            if(var6 < ((List)var7).size()) {
               Openflower166 var8 = ((Openflower165)((List)var7).get(var6)).b;
               if(var2.contains(var8)) {
                  ++var6;
                  continue;
               }

               var5.add(Integer.valueOf(var6 + 1));
               var4.add(var8);
               var5.add(Integer.valueOf(0));
            }

            if(var6 == ((List)var7).size()) {
               var1.add(0, var0);
               var4.removeLast();
            }
            break;
         }
      }

   }

   // $FF: synthetic method
   static LinkedList a(Openflower169 var0, Collection var1) {
      LinkedList var5 = new LinkedList();
      HashSet var2 = new HashSet();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Openflower166 var6 = (Openflower166)var3.next();
         LinkedList var4 = new LinkedList();
         a(var6, var4, var2);
         var5.addAll(var4);
      }

      return var5;
   }
}
