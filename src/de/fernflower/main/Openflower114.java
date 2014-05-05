package de.fernflower.main;

import de.fernflower.main.Openflower115;
import de.fernflower.main.Openflower116;
import de.fernflower.main.util.DualArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower114 {

   private Openflower115 a;
   private DualArrayList b = new DualArrayList();
   private Set c;


   public Openflower114(Openflower115 var1) {
      this.a = var1;
   }

   public final void a() {
      Openflower114 var5;
      Openflower114 var10000 = var5 = this/* = this*/;
      var10000.c = var10000.a.b();
      Iterator var8 = var5.a.a().iterator();

      Openflower116 var6;
      while(var8.hasNext()) {
         var6 = (Openflower116)var8.next();
         var5.b.a((Object)null, (Object)var6);
      }

      List var1 = (List)this.b.c();

      boolean var2;
      do {
         var2 = false;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            Openflower116 var3 = (Openflower116)var4.next();
            Openflower116 var13 = null;
            if(!this.c.contains(var3)) {
               Iterator var7 = var3.a().iterator();

               while(var7.hasNext()) {
                  var6 = (Openflower116)var7.next();
                  if(this.b.b(var6) != null) {
                     Openflower116 var12 = var13;
                     DualArrayList var14 = this.b;
                     var6 = var6;
                     var13 = var13;
                     if(var12 == null) {
                        var12 = var6;
                     } else if(var6 == null) {
                        var12 = var13;
                     } else {
                        int var10 = var14.c(var13);

                        label54:
                        while(true) {
                           for(int var11 = var14.c(var6); var10 != var11; var10 = var14.c(var13)) {
                              Openflower116 var9;
                              if(var10 <= var11) {
                                 var9 = var6;
                                 var6 = (Openflower116)var14.b(var6);
                                 if(var9 != var6) {
                                    continue label54;
                                 }

                                 var12 = null;
                                 break label54;
                              }

                              var9 = var13;
                              var13 = (Openflower116)var14.b(var13);
                              if(var9 == var13) {
                                 var12 = null;
                                 break label54;
                              }
                           }

                           var12 = var13;
                           break;
                        }
                     }

                     var13 = var12;
                     if(var12 == null) {
                        break;
                     }
                  }
               }
            }

            if(var13 == null) {
               var13 = var3;
            }

            var6 = (Openflower116)this.b.b(var13, var3);
            if(!var13.equals(var6)) {
               var2 = true;
            }
         }
      } while(var2);

   }

   public final boolean a(Openflower116 var1, Openflower116 var2) {
      while(!var1.equals(var2)) {
         Openflower116 var3;
         if((var3 = (Openflower116)this.b.b(var1)) == var1) {
            return false;
         }

         if(var3 == null) {
            throw new RuntimeException("Inconsistent idom sequence discovered!");
         }

         var1 = var3;
      }

      return true;
   }
}
