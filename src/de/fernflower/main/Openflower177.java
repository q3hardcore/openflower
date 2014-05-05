package de.fernflower.main;

import de.fernflower.main.extern.IIdentifierRenamer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class Openflower177 {

   private IIdentifierRenamer renamer;
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();
   private HashMap d = new HashMap();


   public Openflower177(IIdentifierRenamer var1) {
      this.renamer = var1;
   }

   public final void a(String var1, String var2) {
      Object var3;
      if((var3 = (List)this.d.get(var1)) == null) {
         this.d.put(var1, var3 = new ArrayList());
      }

      ((List)var3).add(var2);
   }

   public final void b(String var1, String var2) {
      this.b.put(var1, var2);
      this.c.put(var2, var1);
   }

   public final String a(int var1, String var2, String var3, String var4) {
      String var5;
      if((var5 = (String)this.b.get(var1 == 1?var2:var2 + " " + var3 + " " + var4)) == null && (var1 == 2 || var1 == 3) && this.renamer.toBeRenamed(var1, var2, var3, var4)) {
         var5 = this.a(var2, var3, var4);
      }

      return var5;
   }

   private String a(String var1, String var2, String var3) {
      String var4 = null;
      List var6;
      if((var6 = (List)this.d.get(var1)) != null) {
         Iterator var5 = var6.iterator();

         while(var5.hasNext()) {
            var1 = (String)var5.next();
            if((var4 = (String)this.b.get(var1 + " " + var2 + " " + var3)) == null) {
               var4 = this.a(var1, var2, var3);
            }

            if(var4 != null) {
               break;
            }
         }
      }

      return var4;
   }

   public final String a(String var1) {
      return (String)this.c.get(var1);
   }

   public final IIdentifierRenamer a() {
      return this.renamer;
   }
}
