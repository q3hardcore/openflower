package de.fernflower.main.extern;

import java.util.HashMap;

final class IFernflowerLoggerLevels extends HashMap {

   IFernflowerLoggerLevels() {
      this.put("DEBUG", Integer.valueOf(1));
      this.put("INFO", Integer.valueOf(2));
      this.put("WARN", Integer.valueOf(3));
      this.put("ERROR", Integer.valueOf(4));
      this.put("IMME", Integer.valueOf(5));
   }
}
