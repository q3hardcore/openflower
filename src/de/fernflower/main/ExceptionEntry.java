package de.fernflower.main;


public final class ExceptionEntry {

   public int from = 0;
   public int to = 0;
   public int handler = 0;
   public int from_instr = 0;
   public int to_instr = 0;
   public int handler_instr = 0;
   public String exceptionClass = null;


   public final String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("from: " + this.from + " to: " + this.to + " handler: " + this.handler + "\n");
      var1.append("from_instr: " + this.from_instr + " to_instr: " + this.to_instr + " handler_instr: " + this.handler_instr + "\n");
      var1.append("exceptionClass: " + this.exceptionClass + "\n");
      return var1.toString();
   }
}
