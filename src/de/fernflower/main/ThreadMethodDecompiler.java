package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower101;
import de.fernflower.main.Openflower102;
import de.fernflower.main.Openflower104;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower118;
import de.fernflower.main.Openflower12;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower82;
import de.fernflower.main.Openflower83;
import de.fernflower.main.Openflower87;
import de.fernflower.main.Openflower88;
import de.fernflower.main.Openflower89;
import de.fernflower.main.Openflower92;
import de.fernflower.main.Openflower94;
import de.fernflower.main.Openflower95;
import de.fernflower.main.Openflower96;
import de.fernflower.main.Openflower97;
import de.fernflower.main.Openflower98;
import de.fernflower.main.Openflower99;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.util.Configuration;
import java.util.HashSet;
import java.util.Iterator;

public final class ThreadMethodDecompiler implements Runnable {

   private MethodInfo method;
   private VarProcessor varProcessor;
   private Configuration config;
   private Openflower152 processed;
   private Throwable exception;


   public ThreadMethodDecompiler(MethodInfo var1, VarProcessor var2, Configuration var3) {
      this.method = var1;
      this.varProcessor = var2;
      this.config = var3;
   }

   public final void run() {
      Configuration.setThreadInstance(this.config);
      this.exception = null;
      this.processed = null;

      try {
         this.processed = process(this.method, this.varProcessor);
         synchronized(this) {
            this.notify();
         }
      } catch (ThreadDeath var3) {
         ;
      } catch (Throwable var4) {
         this.exception = var4;
      }
   }

   public static Openflower152 process(MethodInfo var0, VarProcessor var1) throws java.io.IOException {
      ClassInfo var2 = var0.getOwner();
      boolean var3 = "<clinit>".equals(var0.getName());
      var0.initialize();
      Openflower7 var4 = var0.c();
      Openflower12 var8;
      Openflower82.a(var8 = new Openflower12(var4));
      var8.a(var0);
      Openflower11 var5 = null;
      var5 = var8.e();
      Iterator var7 = (new HashSet(var5.d())).iterator();

      while(var7.hasNext()) {
         Openflower11 var6 = (Openflower11)var7.next();
         var5.b(var6);
         var6.c(var5);
      }

      Openflower82.c(var8);
      Openflower118.d(var8);
      Openflower118.a(var8);
      if(Configuration.getBoolean("rer")) {
         Openflower118.removeEmptyExceptions(var8);
      }

      if(Configuration.getBoolean("ner")) {
         Openflower82.d(var8);
      }

      Openflower118.b(var8);
      Openflower82.e(var8);
      Configuration.getIDManager().set(2, var0.getMaxLocals());
      if(Openflower118.e(var8)) {
         Configuration.getLogger().writeMessage("Heavily obfuscated exception ranges found!", 3);
      }

      Openflower152 var9 = Openflower87.a(var8);
      if(!Configuration.getBoolean("FINALLY_CATCHALL")) {
         for(Openflower92 var10 = new Openflower92(var1); var10.a(var0, var9, var8); var9 = Openflower87.a(var8)) {
            ;
         }
      }

      Openflower87.a((Openflower154_SomeSorter)var9);
      Openflower102.a((Openflower154_SomeSorter)var9);
      Openflower83.a(var9);
      (new Openflower89()).a(var9, var2.getConstPool());

      do {
         (new Openflower104()).a(var9, var0);
         var1.a(var9);
      } while((new Openflower99()).a(var9));

      do {
         do {
            Openflower96.a(var9);

            do {
               do {
                  Openflower98.a((Openflower154_SomeSorter)var9);
               } while(Openflower97.a(var9));
            } while(Openflower94.a(var9));

            Openflower96.b(var9);
         } while(Openflower95.a(var9));
      } while(!var3 && Openflower88.a(var9));

      Openflower88.b(var9);
      Openflower101.a((Openflower154_SomeSorter)var9);
      var1.a((Openflower154_SomeSorter)var9);
      Openflower96.b((Openflower154_SomeSorter)var9);
      var0.deinitialize();
      return var9;
   }

   public final Openflower152 getProcessed() {
      return this.processed;
   }

   public final Throwable getErrors() {
      return this.exception;
   }
}
