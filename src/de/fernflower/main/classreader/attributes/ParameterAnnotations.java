package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Annotations;
import de.fernflower.main.classreader.attributes.Attribute;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class ParameterAnnotations extends Attribute {

   private List c;


   public final void read(ConstPool var1) {
      super.read(var1);
      this.c = new ArrayList();
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.data));

      try {
         int var3 = var2.readUnsignedByte();

         for(int var4 = 0; var4 < var3; ++var4) {
            ArrayList var5 = new ArrayList();
            int var6 = var2.readUnsignedShort();

            for(int var7 = 0; var7 < var6; ++var7) {
               var5.add(Annotations.a(var2, var1));
            }

            this.c.add(var5);
         }

      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }
   }

   public final List a() {
      return this.c;
   }
}
