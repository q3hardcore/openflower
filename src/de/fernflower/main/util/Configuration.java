package de.fernflower.main.util;

import de.fernflower.main.DecompileClassOuter;
import de.fernflower.main.DecompileDispatcher;
import de.fernflower.main.ImportManager;
import de.fernflower.main.Openflower177;
import de.fernflower.main.extern.IFernflowerLogger;
import de.fernflower.main.util.IDManager;
import de.fernflower.main.util.LocalVarNamer;
import java.util.HashMap;

public final class Configuration {

   private static ThreadLocal instance = new ThreadLocal();
   private HashMap values = new HashMap();
   private DecompileDispatcher dispatcher;
   private ImportManager importManager;
   private LocalVarNamer localVarNamer;
   private IDManager idManager;
   private DecompileClassOuter classProcessor;
   private Openflower177 h;
   private IFernflowerLogger logger;


   private Configuration(HashMap var1) {
      this.values.putAll(var1);
   }

   public static void createThreadInstance(HashMap var0) {
      HashMap var1;
      (var1 = new HashMap()).put("din", "1");
      var1.put("dc4", "1");
      var1.put("das", "1");
      var1.put("rbr", "1");
      var1.put("rsy", "0");
      var1.put("hes", "1");
      var1.put("hdc", "1");
      var1.put("dgs", "0");
      var1.put("occ", "0");
      var1.put("ner", "1");
      var1.put("den", "1");
      var1.put("fdi", "1");
      var1.put("rgn", "1");
      var1.put("bto", "1");
      var1.put("nns", "1");
      var1.put("uto", "1");
      var1.put("udv", "1");
      var1.put("mpm", "0");
      var1.put("rer", "1");
      if(var0 != null) {
         var1.putAll(var0);
      }

      instance.set(new Configuration(var1));
   }

   public static Configuration getThreadInstance() {
      return (Configuration)instance.get();
   }

   public static void setThreadInstance(Configuration var0) {
      instance.set(var0);
   }

   public static Object getObject(String var0) {
      return getThreadInstance().values.get(var0);
   }

   public static void put(String var0, Object var1) {
      getThreadInstance().values.put(var0, var1);
   }

   public static boolean getBoolean(String var0) {
      return "1".equals(getThreadInstance().values.get(var0));
   }

   public static ImportManager getImportManager() {
      return getThreadInstance().importManager;
   }

   public static void setImportManager(ImportManager var0) {
      getThreadInstance().importManager = var0;
   }

   public static LocalVarNamer getLocalVarNamer() {
      return getThreadInstance().localVarNamer;
   }

   public static void setLocalVarnamer(LocalVarNamer var0) {
      getThreadInstance().localVarNamer = var0;
   }

   public static DecompileDispatcher getDispatcher() {
      return getThreadInstance().dispatcher;
   }

   public static void setDispatcher(DecompileDispatcher var0) {
      getThreadInstance().dispatcher = var0;
   }

   public static IDManager getIDManager() {
      return getThreadInstance().idManager;
   }

   public static void setIDManager(IDManager var0) {
      getThreadInstance().idManager = var0;
   }

   public static DecompileClassOuter getClassProcessor() {
      return getThreadInstance().classProcessor;
   }

   public static void setClassProcessor(DecompileClassOuter var0) {
      getThreadInstance().classProcessor = var0;
   }

   public static Openflower177 g() {
      return getThreadInstance().h;
   }

   public static void a(Openflower177 var0) {
      getThreadInstance().h = var0;
   }

   public static IFernflowerLogger getLogger() {
      return getThreadInstance().logger;
   }

   public static void setLogger(IFernflowerLogger var0) {
      getThreadInstance().logger = var0;
      String var1;
      Integer var2;
      if((var0 = getThreadInstance().logger) != null && (var1 = (String)getObject("log")) != null && (var2 = (Integer)IFernflowerLogger.mapLogLevel.get(var1.toUpperCase())) != null) {
         var0.setSeverity(var2.intValue());
      }

   }
}
