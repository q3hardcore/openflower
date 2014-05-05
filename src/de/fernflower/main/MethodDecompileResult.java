package de.fernflower.main;

import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower152;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.util.IDManager;
import java.util.HashSet;
import java.util.List;

public final class MethodDecompileResult {

   public Openflower152 result;
   public VarProcessor varProcessor;
   public MethodInfo method;
   public IDManager idManager;
   private Openflower137 h;
   public List e;
   public boolean failed;
   public HashSet g = new HashSet();


   public MethodDecompileResult(Openflower152 var1, VarProcessor var2, MethodInfo var3, IDManager var4) {
      this.result = var1;
      this.varProcessor = var2;
      this.method = var3;
      this.idManager = var4;
   }

   public final Openflower137 a() {
      if(this.h == null && this.result != null) {
         Openflower143 var1 = new Openflower143();
         this.h = var1.a(this.result);
      }

      return this.h;
   }
}
