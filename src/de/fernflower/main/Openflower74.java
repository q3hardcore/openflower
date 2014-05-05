package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodDecompileResult;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower152;
import de.fernflower.main.ThreadMethodDecompiler;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.classreader.attributes.LocalVariableTable;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.IDManager;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.LocalVarNamer;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.HashSet;
import java.util.Iterator;

public final class Openflower74 {

   private ClassInfo classInfo;
   private HashSet b = new HashSet();
   private DualArrayList c = new DualArrayList();
   private DualArrayList d = new DualArrayList();
   private DualArrayList results = new DualArrayList();


   public Openflower74(ClassInfo var1) {
      this.classInfo = var1;
   }

   public final void process() {
      Configuration.put("CURRENT_CLASS", this.classInfo);
      Configuration.getLogger().startClass(this.classInfo.name);
      HashSet var1 = new HashSet();
      Iterator var3 = this.classInfo.getFields().iterator();

      while(var3.hasNext()) {
         FieldInfo var2 = (FieldInfo)var3.next();
         var1.add(var2.getName());
      }

      for(var3 = this.classInfo.getMethods().iterator(); var3.hasNext(); Configuration.getLogger().endMethod()) {
         MethodInfo var19 = (MethodInfo)var3.next();
         Configuration.getLogger().startMethod(var19.getName() + " " + var19.getDesc());
         LocalVarNamer var4;
         Configuration.setLocalVarnamer(var4 = new LocalVarNamer());
         IDManager var5;
         Configuration.setIDManager(var5 = new IDManager());
         Configuration.put("CURRENT_METHOD", var19);
         Configuration.put("CURRENT_METHOD_DESCRIPTOR", MethodSignatureHolder.create(var19.getDesc()));
         VarProcessor var6 = new VarProcessor();
         Configuration.put("CURRENT_VAR_PROCESSOR", var6);
         Thread var7 = null;
         Openflower152 var8 = null;
         boolean var9 = false;

         try {
            int var12;
            if((var19.getAccess() & 1280) == 0) {
               int var10;
               if((var10 = 10 * Integer.parseInt(Configuration.getObject("mpm").toString())) == 0) {
                  var8 = ThreadMethodDecompiler.process(var19, var6);
               } else {
                  ThreadMethodDecompiler var11 = new ThreadMethodDecompiler(var19, var6, Configuration.getThreadInstance());
                  (var7 = new Thread(var11)).start();
                  var12 = 0;

                  while(var7.isAlive()) {
                     synchronized(var11) {
                        var11.wait(100L);
                     }

                     if(var10 > 0) {
                        ++var12;
                        if(var12 > var10) {
                           Configuration.getLogger().writeMessage("Processing time limit (" + var10 + " sec.) for method " + var19.getName() + " " + var19.getDesc() + " exceeded, execution interrupted.", 4, 0);
                           var7.stop();
                           var9 = true;
                           break;
                        }
                     }
                  }

                  if(!var9) {
                     if(var11.getErrors() != null) {
                        throw var11.getErrors();
                     }

                     var8 = var11.getProcessed();
                  }
               }
            } else {
               boolean var21 = (var19.getAccess() & 8) == 0;
               MethodSignatureHolder var20 = MethodSignatureHolder.create(var19.getDesc());
               byte var23 = 0;
               if(var21) {
                  var6.getTypes().put(new IntPair(0, 0), this.classInfo.name);
                  var23 = 1;
               }

               var12 = var23 + var20.params.length;
               int var13 = 0;

               for(int var14 = 0; var14 < var12; ++var14) {
                  var6.setName(new IntPair(var13, 0), var4.getName(var13));
                  if(var21) {
                     if(var14 == 0) {
                        ++var13;
                     } else {
                        var13 += var20.params[var14 - 1].varSize;
                     }
                  } else {
                     var13 += var20.params[var14].varSize;
                  }
               }
            }
         } catch (ThreadDeath var17) {
            try {
               if(var7 != null) {
                  var7.stop();
               }
            } catch (Throwable var15) {
               ;
            }

            throw var17;
         } catch (Throwable var18) {
            if(Configuration.getLogger().getShowStacktrace()) {
               var18.printStackTrace();
            }

            Configuration.getLogger().writeMessage("Method " + var19.getName() + " " + var19.getDesc() + " couldn\'t be decompiled.", 4);
            var9 = true;
         }

         MethodDecompileResult var22;
         (var22 = new MethodDecompileResult(var8, var6, var19, var5)).failed = var9;
         this.results.a((Object)var22, (Object)Util.concat(var19.getName(), var19.getDesc()));
         var6.loadNames(new LocalVarNamer(var1));
         LocalVariableTable var24;
         if(Configuration.getBoolean("udv") && (var24 = (LocalVariableTable)var19.getAttributes().b("LocalVariableTable")) != null) {
            var6.loadNames(var24.a());
         }
      }

      Configuration.getLogger().endClass();
   }

   public final MethodDecompileResult getResult(String var1, String var2) {
      return (MethodDecompileResult)this.results.b(Util.concat(var1, var2));
   }

   public final ClassInfo getClassInfo() {
      return this.classInfo;
   }

   public final DualArrayList getResults() {
      return this.results;
   }

   public final HashSet d() {
      return this.b;
   }

   public final DualArrayList e() {
      return this.c;
   }

   public final DualArrayList f() {
      return this.d;
   }
}
