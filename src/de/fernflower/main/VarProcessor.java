package de.fernflower.main;

import de.fernflower.main.Descriptor;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower159;
import de.fernflower.main.Openflower160;
import de.fernflower.main.Openflower173;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LocalVarNamer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class VarProcessor {

   private HashMap names = new HashMap();
   private Openflower173 b;
   private HashMap c = new HashMap();
   private HashSet d = new HashSet();


   public final void a(Openflower152 var1) {
      this.b = new Openflower173();
      this.b.a(var1);
   }

   public final void a(Openflower154_SomeSorter var1) {
      this.names = new HashMap();
      (new Openflower159(var1, (MethodInfo)Configuration.getObject("CURRENT_METHOD"), this)).a();
   }

   public final void loadNames(HashMap var1) {
      if(this.b != null) {
         HashMap var2 = this.b.a();
         ArrayList var3;
         Collections.sort(var3 = new ArrayList((Collection)this.names.keySet()), new Openflower160());
         HashMap var4 = new HashMap();

         String var6;
         IntPair var8;
         for(Iterator var5 = var3.iterator(); var5.hasNext(); this.names.put(var8, var6)) {
            var8 = (IntPair)var5.next();
            var6 = (String)this.names.get(var8);
            Integer var7;
            if((var7 = (Integer)var2.get(Integer.valueOf(var8.val1))) != null && var1.containsKey(var7)) {
               var6 = (String)var1.get(var7);
            }

            var7 = (Integer)var4.get(var6);
            var4.put(var6, var7 == null?(var7 = new Integer(0)):(var7 = Integer.valueOf(var7.intValue() + 1)));
            if(var7.intValue() > 0) {
               var6 = var6 + String.valueOf(var7);
            }
         }

      }
   }

   public final void loadNames(LocalVarNamer var1) {
      HashMap var10000 = new HashMap(this.names);
      Entry var2 = null;
      Iterator var3 = var10000.entrySet().iterator();

      while(var3.hasNext()) {
         var2 = (Entry)var3.next();
         this.names.put((IntPair)var2.getKey(), var1.getName((String)var2.getValue()));
      }

   }

   public final Descriptor a(IntPair var1) {
      return this.b == null?null:this.b.a(var1);
   }

   public final void a(IntPair var1, Descriptor var2) {
      this.b.a(var1, var2);
   }

   public final String getName(IntPair var1) {
      return this.names == null?null:(String)this.names.get(var1);
   }

   public final void setName(IntPair var1, String var2) {
      this.names.put(var1, var2);
   }

   public final int c(IntPair var1) {
      return this.b == null?3:this.b.b(var1);
   }

   public final void d(IntPair var1) {
      this.b.c(var1);
   }

   public final HashMap getTypes() {
      return this.c;
   }

   public final HashSet b() {
      return this.d;
   }
}
