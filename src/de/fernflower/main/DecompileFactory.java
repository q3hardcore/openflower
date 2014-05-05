package de.fernflower.main;

import de.fernflower.main.BytecodeReaderHelper;
import de.fernflower.main.ClassInfo;
import de.fernflower.main.ClassNode;
import de.fernflower.main.DecompileClassOuter;
import de.fernflower.main.DecompileDispatcher;
import de.fernflower.main.Openflower176;
import de.fernflower.main.extern.IBytecodeProvider;
import de.fernflower.main.extern.IDecompilatSaver;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IDManager;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.HashMap;

public final class DecompileFactory {

   private DecompileDispatcher dispatcher;
   private DecompileClassOuter b;


   public DecompileFactory(IBytecodeProvider var1, IDecompilatSaver var2, HashMap var3) {
      DecompileDispatcher var4 = new DecompileDispatcher(var2, this, new BytecodeReaderHelper(var1));
      this.dispatcher = var4;
      Configuration.createThreadInstance(var3);
      Configuration.setIDManager(new IDManager());
   }

   public final void a() {
      if(Configuration.getBoolean("ren")) {
         (new Openflower176()).a(this.dispatcher);
      }

      this.b = new DecompileClassOuter(this.dispatcher);
      Configuration.setClassProcessor(this.b);
      Configuration.setDispatcher(this.dispatcher);
      this.dispatcher.b();
   }

   public final String getFileName(ClassInfo var1, String var2) {
      if(((ClassNode)this.b.getInnerMap().get(var1.name)).a != 0) {
         return null;
      } else if(Configuration.getBoolean("ren")) {
         String var3 = var1.name.substring(var1.name.lastIndexOf(47) + 1);
         return var2.substring(0, var2.lastIndexOf(47) + 1) + var3 + ".java";
      } else {
         return var2.substring(0, var2.lastIndexOf(".class")) + ".java";
      }
   }

   public final DecompileDispatcher getDispatcher() {
      return this.dispatcher;
   }

   public final String decompile(ClassInfo var1) {
      String var2 = null;

      try {
         StringWriter var3 = new StringWriter();
         this.b.decompileClass(var1, new BufferedWriter(var3));
         var2 = var3.toString();
      } catch (ThreadDeath var4) {
         throw var4;
      } catch (Throwable var5) {
         var5.printStackTrace();
         Configuration.getLogger().writeMessage("Class " + var1.name + " couldn\'t be fully decompiled.", 4);
      }

      return var2;
   }
}
