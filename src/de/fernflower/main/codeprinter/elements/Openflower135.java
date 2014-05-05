package de.fernflower.main.codeprinter.elements;

import de.fernflower.main.ClassDecompiler;
import de.fernflower.main.ClassNode;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower89;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.IntPair;
import de.fernflower.main.util.Util;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public final class Openflower135 extends Element {

   private int index;
   private Descriptor desc;
   private boolean isDeclaration = false;
   private VarProcessor varProcessor;
   private int index2 = 0;
   private boolean h = false;
   private boolean i = false;


   public Openflower135(int var1, Descriptor var2, VarProcessor var3) {
      this.a = 12;
      this.index = var1;
      this.desc = var2;
      this.varProcessor = var3;
   }

   public final Descriptor getDescriptor() {
      return this.createDesriptor();
   }

   public final int d_() {
      return 3;
   }

   public final List b() {
      return new ArrayList();
   }

   public final Element copy() {
      Openflower135 var1;
      (var1 = new Openflower135(this.index, this.createDesriptor(), this.varProcessor)).isDeclaration = this.isDeclaration;
      var1.index2 = this.index2;
      var1.h = this.h;
      var1.i = this.i;
      return var1;
   }

   public final String toString(int var1) {
      if(this.h) {
         ClassNode var7 = (ClassNode)Configuration.getClassProcessor().getInnerMap().get(this.desc.stringValue);
         StringWriter var8 = new StringWriter();
         BufferedWriter var6 = new BufferedWriter(var8);
         ClassDecompiler var4 = new ClassDecompiler();

         try {
            var4.decompile(var7, var6, var1);
            var6.flush();
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         return var8.toString();
      } else {
         String var2 = null;
         if(this.varProcessor != null) {
            var2 = this.varProcessor.getName(new IntPair(this.index, this.index2));
         }

         StringBuilder var3 = new StringBuilder();
         if(this.isDeclaration) {
            if(this.varProcessor != null && this.varProcessor.c(new IntPair(this.index, this.index2)) == 2) {
               var3.append("final ");
            }

            var3.append(Openflower89.b(this.createDesriptor()) + " ");
         }

         var3.append(var2 == null?"var" + this.index + (this.index2 == 0?"":"_" + this.index2):var2);
         return var3.toString();
      }
   }

   public final boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Openflower135) {
         Openflower135 var2 = (Openflower135)var1;
         return this.index == var2.index && this.index2 == var2.index2 && Util.safeEquals((Object)this.createDesriptor(), (Object)var2.createDesriptor());
      } else {
         return false;
      }
   }

   public final int getIndex() {
      return this.index;
   }

   public final void setIndex(int var1) {
      this.index = var1;
   }

   public final Descriptor createDesriptor() {
      Descriptor var1 = null;
      if(this.varProcessor != null) {
         var1 = this.varProcessor.a(new IntPair(this.index, this.index2));
      }

      if(var1 == null || this.desc != null && this.desc.type != 17) {
         var1 = this.desc;
      }

      return var1 == null?Descriptor.UNKNOWN:var1;
   }

   public final void setDescriptor(Descriptor var1) {
      this.desc = var1;
   }

   public final boolean isDeclaration() {
      return this.isDeclaration;
   }

   public final void setDeclaration() {
      this.isDeclaration = true;
   }

   public final VarProcessor getVarProcessor() {
      return this.varProcessor;
   }

   public final int getIndex2() {
      return this.index2;
   }

   public final void setIndex2(int var1) {
      this.index2 = var1;
   }

   public final boolean l() {
      return this.h;
   }

   public final void m() {
      this.h = true;
   }

   public final boolean n() {
      return this.i;
   }

   public final void o() {
      this.i = true;
   }
}
