package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower74;
import de.fernflower.main.codeprinter.elements.Openflower131;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ClassNode {

   public int a = 0;
   public int access_flags;
   public String name;
   public ClassInfo classInfo;
   public Openflower74 e;
   public String f;
   public Openflower131 g;
   public HashMap h = new HashMap();
   public HashMap i = new HashMap();
   public Descriptor desc;
   public List subClasses = new ArrayList();
   public Set l = new HashSet();
   public ClassNode classNode;


   public ClassNode(ClassInfo var1) {
      this.classInfo = var1;
      this.name = var1.name.substring(var1.name.lastIndexOf(47) + 1);
   }

   public final ClassNode getChild(String var1) {
      Iterator var2 = this.subClasses.iterator();

      while(var2.hasNext()) {
         ClassNode that = (ClassNode)var2.next();
         if(var1.equals(that.classInfo.name)) {
            return that;
         }
      }

      return null;
   }
}
