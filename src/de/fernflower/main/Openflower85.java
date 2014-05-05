package de.fernflower.main;

import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.codeprinter.elements.Element;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Openflower85 {

   public static boolean a(List var0) {
      HashSet var1 = new HashSet(var0);
      HashSet var2 = new HashSet();
      Set var3 = null;
      Iterator var5 = var0.iterator();

      while(var5.hasNext()) {
         Openflower154_SomeSorter var10000 = (Openflower154_SomeSorter)var5.next();
         Set var4 = null;
         var4 = var10000.getDataAsSet(2, 1);
         if(var3 == null) {
            var3 = var4;
         } else {
            HashSet var6;
            (var6 = new HashSet(var3)).removeAll(var4);
            var3.retainAll(var4);
            var4.removeAll(var3);
            var2.addAll(var6);
            var2.addAll(var4);
         }
      }

      var5 = var2.iterator();

      Openflower154_SomeSorter var7;
      do {
         if(!var5.hasNext()) {
            for(int var8 = 1; var8 < var0.size(); ++var8) {
               Openflower154_SomeSorter var9;
               if(!(var9 = (Openflower154_SomeSorter)var0.get(var8)).d(2).isEmpty() && !var2.contains(var9)) {
                  return false;
               }
            }

            return true;
         }

         var7 = (Openflower154_SomeSorter)var5.next();
      } while(var1.contains(var7) && var1.containsAll(var7.getDataAsList(2, 0)));

      return false;
   }

   public static boolean a(Openflower154_SomeSorter var0, List var1) {
      Openflower154_SomeSorter var2 = null;
      Set var3;
      if((var3 = var0.getDataAsSet(1, 1)).contains(var0)) {
         return false;
      } else {
         while(true) {
            var1.clear();
            boolean var4 = false;
            var3.remove(var2);
            Iterator var5 = var3.iterator();

            while(true) {
               if(var5.hasNext()) {
                  Openflower154_SomeSorter var6;
                  if((var6 = (Openflower154_SomeSorter)var5.next()).u() != 2) {
                     if(var2 != null) {
                        return false;
                     }

                     var2 = var6;
                     var4 = true;
                  } else {
                     Set var7;
                     (var7 = var6.getDataAsSet(1, 0)).remove(var0);
                     if(var7.contains(var6)) {
                        return false;
                     }

                     if(var3.containsAll(var7) && var7.size() <= 1) {
                        Openflower154_SomeSorter var8;
                        if(var7.size() == 1) {
                           var8 = (Openflower154_SomeSorter)var7.iterator().next();

                           while(var1.contains(var8)) {
                              (var7 = var8.getDataAsSet(1, 0)).remove(var0);
                              if(var7.isEmpty()) {
                                 break;
                              }

                              if((var8 = (Openflower154_SomeSorter)var7.iterator().next()) == var6) {
                                 return false;
                              }
                           }
                        }

                        List var9;
                        if((var9 = var6.c(1073741824)).size() > 1) {
                           (var7 = var6.getDataAsSet(1073741824, 1)).retainAll(var3);
                           if(var7.size() > 0) {
                              return false;
                           }

                           if(var2 != null) {
                              return false;
                           }

                           var2 = var6;
                           var4 = true;
                        } else {
                           label99: {
                              Openflower105 var10;
                              if(var9.size() == 1 && (var10 = (Openflower105)var9.get(0)).a() == 1) {
                                 var8 = var10.c();
                                 if(var0 == var8) {
                                    return false;
                                 }

                                 if(!var3.contains(var8) && var2 != var8) {
                                    if(var2 != null) {
                                       return false;
                                    }

                                    if(var8.getDataAsSet(1, 0).size() <= 1) {
                                       return false;
                                    }

                                    var2 = var8;
                                    var4 = true;
                                    break label99;
                                 }
                              }

                              var1.add(var6);
                              continue;
                           }
                        }
                     } else {
                        if(var2 != null) {
                           return false;
                        }

                        var2 = var6;
                        var4 = true;
                     }
                  }
               }

               if(!var4) {
                  var1.add(var0);
                  var1.remove(var2);
                  var1.add(0, var2);
                  return true;
               }
               break;
            }
         }
      }
   }

   public static HashSet a(Openflower154_SomeSorter var0) {
      HashSet var2;
      Iterator var1 = (var2 = new HashSet(var0.getDataAsList(2, 1))).iterator();

      while(var1.hasNext()) {
         if(((Openflower154_SomeSorter)var1.next()).d(2).size() > 1) {
            var1.remove();
         }
      }

      return var2;
   }

   public static List b(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         Element var3 = (Element)var2.next();
         var1.add(var3.copy());
      }

      return var1;
   }
}
