package de.fernflower.main;

import de.fernflower.main.BytecodeReaderHelper;
import de.fernflower.main.ClassInfo;
import de.fernflower.main.DecompileFactory;
import de.fernflower.main.Openflower206;
import de.fernflower.main.extern.IDecompilatSaver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Manifest;

public final class Openflower178 {

   private int a;
   private String root;
   private String fileName;
   private List classes = new ArrayList();
   private List e = new ArrayList();
   private List f = new ArrayList();
   private List g = new ArrayList();
   private Manifest manifest;
   private IDecompilatSaver archive;
   private DecompileFactory j;
   private boolean k = true;


   public Openflower178(int var1, String var2, String var3, boolean var4, IDecompilatSaver var5, DecompileFactory var6) {
      this.a = var1;
      this.k = var4;
      this.root = var2;
      this.fileName = var3;
      this.archive = var5;
      this.j = var6;
   }

   public final void a(ClassInfo var1, String var2) {
      this.classes.add(var1);
      this.e.add(var2);
   }

   public final void a(String var1) {
      this.f.add(var1);
   }

   public final void a(String var1, String var2) {
      this.g.add(new String[]{var1, var2});
   }

   public final void loadClasses(BytecodeReaderHelper var1) throws java.io.IOException {
      ArrayList var2 = new ArrayList();
      Iterator var4 = this.classes.iterator();

      while(var4.hasNext()) {
         ClassInfo var3;
         String var5 = (var3 = (ClassInfo)var4.next()).name;
         var3 = new ClassInfo(var1.getBytecodeStream(var5), var3.isNotLibrary(), var1);
         var2.add(var3);
         Openflower206 var6 = var1.b(var5);
         var1.a(var5);
         var1.a(var3.name, var6);
      }

      this.classes = var2;
   }

   public final void a() {
      Iterator var2;
      String var3;
      String var4;
      String[] var5;
      int var6;
      ClassInfo var7;
      switch(this.a) {
      case 0:
         this.archive.saveFolder(this.fileName);
         var2 = this.g.iterator();

         while(var2.hasNext()) {
            var5 = (String[])var2.next();
            this.archive.copyFile(var5[0], this.fileName, var5[1]);
         }

         for(var6 = 0; var6 < this.classes.size(); ++var6) {
            var7 = (ClassInfo)this.classes.get(var6);
            var3 = (String)this.e.get(var6);
            if((var3 = this.j.getFileName(var7, var3)) != null && (var4 = this.j.decompile(var7)) != null) {
               this.archive.saveClassFile(this.fileName, var7.name, var3, var4);
            }
         }

         return;
      case 1:
      case 2:
         this.archive.saveFolder(this.root);
         this.archive.createArchive(this.root, this.fileName, this.manifest);
         var2 = this.f.iterator();

         while(var2.hasNext()) {
            String var1 = (String)var2.next();
            this.archive.saveEntry(this.root, this.fileName, var1, (String)null);
         }

         var2 = this.g.iterator();

         while(var2.hasNext()) {
            var5 = (String[])var2.next();
            if(this.a != 1 || !"META-INF/MANIFEST.MF".equalsIgnoreCase(var5[1])) {
               this.archive.copyEntry(var5[0], this.root, this.fileName, var5[1]);
            }
         }

         for(var6 = 0; var6 < this.classes.size(); ++var6) {
            var7 = (ClassInfo)this.classes.get(var6);
            var3 = (String)this.e.get(var6);
            if((var3 = this.j.getFileName(var7, var3)) != null) {
               var4 = this.j.decompile(var7);
               this.archive.saveClassEntry(this.root, this.fileName, var7.name, var3, var4);
            }
         }

         this.archive.closeArchive(this.root, this.fileName);
      default:
      }
   }

   public final void setManifest(Manifest var1) {
      this.manifest = var1;
   }

   public final boolean b() {
      return this.k;
   }

   public final List getClasses() {
      return this.classes;
   }
}
