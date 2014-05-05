package de.fernflower.main;

import de.fernflower.main.Openflower136;
import de.fernflower.main.Openflower138;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.DualArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Openflower137 {

   public DualArrayList a = new DualArrayList();
   public Openflower138 b;
   public HashMap c = new HashMap();
   public HashMap d = new HashMap();
   public HashMap e = new HashMap();
   public HashMap f = new HashMap();


   public final void a() {
      LinkedList var1 = new LinkedList();
      a(this.b, var1);
      this.a.clear();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Openflower138 var3 = (Openflower138)var2.next();
         this.a.a((Object)var3, (Object)var3.b);
      }

   }

   private static void a(Openflower138 var0, List var1) {
      LinkedList var2 = new LinkedList();
      LinkedList var3 = new LinkedList();
      HashSet var4 = new HashSet();
      var2.add(var0);
      var3.add(Integer.valueOf(0));

      while(!var2.isEmpty()) {
         var0 = (Openflower138)var2.getLast();
         int var5 = ((Integer)var3.removeLast()).intValue();
         var4.add(var0);

         while(true) {
            if(var5 < var0.f.size()) {
               Openflower138 var6 = (Openflower138)var0.f.get(var5);
               if(var4.contains(var6)) {
                  ++var5;
                  continue;
               }

               var3.add(Integer.valueOf(var5 + 1));
               var2.add(var6);
               var3.add(Integer.valueOf(0));
            }

            if(var5 == var0.f.size()) {
               var1.add(0, var0);
               var2.removeLast();
            }
            break;
         }
      }

   }

   public final boolean a(Openflower136 var1) {
      LinkedList var2;
      (var2 = new LinkedList()).add(this.b);
      HashSet var6 = new HashSet();

      while(!var2.isEmpty()) {
         Openflower138 var3 = (Openflower138)var2.removeFirst();
         if(!var6.contains(var3)) {
            var6.add(var3);

            for(int var4 = 0; var4 < var3.e.size(); ++var4) {
               int var5;
               if((var5 = var1.a((Element)var3.e.get(var4))) == 1) {
                  return false;
               }

               if(var5 == 2) {
                  var3.e.remove(var4);
                  --var4;
               }
            }

            var2.addAll(var3.f);
         }
      }

      return true;
   }
}
