package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.Annotations;
import de.fernflower.main.classreader.attributes.Attribute;
import de.fernflower.main.codeprinter.elements.Element;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class AnnotationDefault extends Attribute {

   private Element attributes;


   public final void read(ConstPool var1) {
      this.name = "AnnotationDefault";
      DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(this.data));
      this.attributes = Annotations.b(var2, var1);
   }

   public final Element getAttributes() {
      return this.attributes;
   }
}
