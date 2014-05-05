package de.fernflower.main.util;

import de.fernflower.main.extern.IFernflowerLogger;
import de.fernflower.main.util.Util;
import java.io.PrintStream;

public final class StreamLogger implements IFernflowerLogger {

   private int severity;
   private int indent;
   private PrintStream stream;


   public StreamLogger(int var1, PrintStream var2) {
      this.severity = var1;
      this.indent = 0;
      this.stream = var2;
   }

   public final void writeMessage(String var1, int var2) {
      this.writeMessage(var1, var2, this.indent);
   }

   public final void writeMessage(String var1, int var2, int var3) {
      if(var2 >= this.severity) {
         this.stream.println(Util.getIndent(var3) + names[var2] + ": " + var1);
      }

   }

   public final void startClass(String var1) {
      this.stream.println(Util.getIndent(this.indent++) + "Processing class " + var1 + " ...");
   }

   public final void endClass() {
      this.stream.println(Util.getIndent(--this.indent) + "... proceeded.");
   }

   public final void startWriteClass(String var1) {
      this.stream.println(Util.getIndent(this.indent++) + "Writing class " + var1 + " ...");
   }

   public final void endWriteClass() {
      this.stream.println(Util.getIndent(--this.indent) + "... written.");
   }

   public final void startMethod(String var1) {
      if(this.severity <= 2) {
         this.stream.println(Util.getIndent(this.indent) + "Processing method " + var1 + " ...");
      }

   }

   public final void endMethod() {
      if(this.severity <= 2) {
         this.stream.println(Util.getIndent(this.indent) + "... proceeded.");
      }

   }

   public final int getSeverity() {
      return this.severity;
   }

   public final void setSeverity(int var1) {
      this.severity = var1;
   }

   public final boolean getShowStacktrace() {
      return false;
   }
}
