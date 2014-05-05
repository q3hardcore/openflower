package de.fernflower.main;

import de.fernflower.main.ClassNode;
import de.fernflower.main.DecompileClassOuter;
import de.fernflower.main.DecompileDispatcher;
import de.fernflower.main.ImportManagerSorter;
import de.fernflower.main.util.Configuration;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class ImportManager {

   private HashMap imports = new HashMap();
   private HashSet siblings = new HashSet();
   private String path = "";
   private String pkg = "";


   public ImportManager(ClassNode var1) {
      int var2;
      String var3;
      if((var2 = (var3 = var1.classInfo.name).lastIndexOf("/")) >= 0) {
         this.path = var3.substring(0, var2);
         this.pkg = this.path.replace('/', '.');
         this.path = this.path + "/";
      }

   }

   public final String getRelativeName(String var1, boolean var2) {
      DecompileClassOuter var10000 = Configuration.getClassProcessor();
      ClassNode var3 = null;
      var3 = (ClassNode)var10000.getInnerMap().get(var1.replace('.', '/'));
      String var4 = null;
      if(var3 != null && var3.classInfo.isNotLibrary()) {
         for(var4 = var3.name; var3.classNode != null && var3.a == 1; var3 = var3.classNode) {
            var4 = var3.classNode.name + "." + var4;
         }

         if(var3.a != 0) {
            return var4;
         }

         var1 = var3.classInfo.name.replace('/', '.');
      } else if(var3 == null || !var3.classInfo.isNotLibrary()) {
         var1 = var1.replace('$', '.');
      }

      String var7 = var1;
      String var5 = "";
      int var6;
      if((var6 = var1.lastIndexOf(".")) >= 0) {
         var7 = var1.substring(var6 + 1);
         var5 = var1.substring(0, var6);
      }

      DecompileDispatcher var8;
      if(((var8 = Configuration.getDispatcher()).getClass(this.path + var7) == null || var5.equals(this.pkg)) && var8.getClass(var7) == null && (!this.imports.containsKey(var7) || var5.equals(this.imports.get(var7)))) {
         if(!this.imports.containsKey(var7)) {
            this.imports.put(var7, var5);
            if(!var2) {
               this.siblings.add(var7);
            }
         }

         return var4 == null?var7:var4;
      } else {
         return var1;
      }
   }

   public final void addImports(BufferedWriter var1) throws java.io.IOException {
      ArrayList var2;
      Collections.sort(var2 = new ArrayList((Collection)this.imports.entrySet()), new ImportManagerSorter());
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Entry var6 = (Entry)var4.next();
         if(!this.siblings.contains(var6.getKey()) && !"java.lang".equals(var6.getValue()) && ((String)var6.getValue()).length() > 0) {
            String var7 = (String)var6.getValue() + "." + (String)var6.getKey();
            var3.add(var7);
         }
      }

      Iterator var8 = var3.iterator();

      while(var8.hasNext()) {
         String var5 = (String)var8.next();
         var1.write("import " + var5 + ";");
         var1.newLine();
      }

   }
}
