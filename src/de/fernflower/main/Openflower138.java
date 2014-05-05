package de.fernflower.main;

import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower154_SomeSorter;
import java.util.ArrayList;
import java.util.List;

public final class Openflower138 {

   public int a;
   public String b;
   public Openflower146 c;
   public Openflower154_SomeSorter d;
   public List e = new ArrayList();
   public List f = new ArrayList();
   public List g = new ArrayList();


   public Openflower138(int var1, Openflower154_SomeSorter var2, String var3) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
   }

   public Openflower138(Openflower154_SomeSorter var1, Openflower146 var2) {
      this.a = 1;
      this.d = var1;
      this.b = var2.id.toString();
      this.c = var2;
   }

   public final String toString() {
      return this.b;
   }
}
