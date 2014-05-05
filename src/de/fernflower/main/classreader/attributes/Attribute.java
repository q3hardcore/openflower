package de.fernflower.main.classreader.attributes;

import de.fernflower.main.ConstPool;
import de.fernflower.main.classreader.attributes.AnnotationDefault;
import de.fernflower.main.classreader.attributes.Annotations;
import de.fernflower.main.classreader.attributes.ConstantValue;
import de.fernflower.main.classreader.attributes.EnclosingMethod;
import de.fernflower.main.classreader.attributes.Exceptions;
import de.fernflower.main.classreader.attributes.InnerClasses;
import de.fernflower.main.classreader.attributes.LocalVariableTable;
import de.fernflower.main.classreader.attributes.ParameterAnnotations;
import de.fernflower.main.classreader.attributes.Signature;

public class Attribute {

   private int nameIndex;
   protected byte[] data;
   protected String name;


   public void read(ConstPool var1) {
      this.name = (String)var1.a(this.nameIndex).a;
   }

   public static Attribute create(int var0, String var1) {
      Object var2;
      if("InnerClasses".equals(var1)) {
         var2 = new InnerClasses();
      } else if("ConstantValue".equals(var1)) {
         var2 = new ConstantValue();
      } else if("Signature".equals(var1)) {
         var2 = new Signature();
      } else if("AnnotationDefault".equals(var1)) {
         var2 = new AnnotationDefault();
      } else if("Exceptions".equals(var1)) {
         var2 = new Exceptions();
      } else if("EnclosingMethod".equals(var1)) {
         var2 = new EnclosingMethod();
      } else if(!"RuntimeVisibleAnnotations".equals(var1) && !"RuntimeInvisibleAnnotations".equals(var1)) {
         if(!"RuntimeVisibleParameterAnnotations".equals(var1) && !"RuntimeInvisibleParameterAnnotations".equals(var1)) {
            if(!"LocalVariableTable".equals(var1)) {
               return null;
            }

            var2 = new LocalVariableTable();
         } else {
            var2 = new ParameterAnnotations();
         }
      } else {
         var2 = new Annotations();
      }

      ((Attribute)var2).nameIndex = var0;
      return (Attribute)var2;
   }

   public final void setData(byte[] var1) {
      this.data = var1;
   }

   public final String getName() {
      return this.name;
   }
}
