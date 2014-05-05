package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower158;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Element {

   public int a;
   public int b = Configuration.getIDManager().getNext(1);


   public int c_() {
      return 0;
   }

   public Descriptor getDescriptor() {
      return Descriptor.VOID;
   }

   public int d_() {
      return 0;
   }

   public Openflower158 e() {
      return new Openflower158();
   }

   public final boolean b(Element var1) {
      ArrayList var2;
      (var2 = new ArrayList(this.a(true))).add(this);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if(((Element)var3.next()).equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final List a(boolean var1) {
      List var2;
      for(int var3 = (var2 = this.b()).size() - 1; var3 >= 0; --var3) {
         var2.addAll(((Element)var2.get(var3)).a(true));
      }

      return var2;
   }

   public final Set p() {
      HashSet var1 = new HashSet();
      List var2;
      (var2 = this.a(true)).add(this);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         Element that = (Element)var3.next();
         if(that.a == 12) {
            var1.add(new IntPair((Openflower135)that));
         }
      }

      return var1;
   }

   public List b() {
      throw new RuntimeException("not implemented");
   }

   public Element copy() {
      throw new RuntimeException("not implemented");
   }

   public String toString(int var1) {
      throw new RuntimeException("not implemented");
   }

   public void a(Element var1, Element var2) {}
}
