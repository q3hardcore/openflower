package de.fernflower.main.extern;

import de.fernflower.main.extern.IFernflowerLoggerLevels;
import java.util.HashMap;

public interface IFernflowerLogger {

   int DEBUG = 1;
   int INFO = 2;
   int WARNING = 3;
   int ERROR = 4;
   int IMMEDIATE = 5;
   HashMap mapLogLevel = new IFernflowerLoggerLevels();
   String[] names = new String[]{"", "DEBUG", "INFO", "WARNING", "ERROR", ""};


   void writeMessage(String var1, int var2);

   void writeMessage(String var1, int var2, int var3);

   void startClass(String var1);

   void endClass();

   void startWriteClass(String var1);

   void endWriteClass();

   void startMethod(String var1);

   void endMethod();

   int getSeverity();

   void setSeverity(int var1);

   boolean getShowStacktrace();
}
