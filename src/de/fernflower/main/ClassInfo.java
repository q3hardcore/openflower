package de.fernflower.main;

import de.fernflower.main.BytecodeReaderHelper;
import de.fernflower.main.ConstPool;
import de.fernflower.main.FieldInfo;
import de.fernflower.main.MethodInfo;
import de.fernflower.main.Openflower196;
import de.fernflower.main.classreader.attributes.Attribute;
import de.fernflower.main.util.DualArrayList;
import de.fernflower.main.util.ReliableDataInputStream;
import de.fernflower.main.util.Util;
import java.io.InputStream;

public final class ClassInfo {

   public int minor_version;
   public int major_version;
   public int access_flags;
   public int this_class;
   private int super_class;
   private Openflower196 this_class_cp_info;
   public Openflower196 super_class_cp_info;
   public String name;
   private ConstPool constant_pool;
   private int[] interface_indexes;
   private String[] interface_names;
   private DualArrayList fields;
   private DualArrayList methods;
   private DualArrayList attributes;
   private boolean canRename;
   private BytecodeReaderHelper bytecode;


   public ClassInfo(InputStream var1, boolean var2, BytecodeReaderHelper var3) throws java.io.IOException {
      this(new ReliableDataInputStream(var1), var2, var3);
   }

   public ClassInfo(ReliableDataInputStream var1, boolean var2, BytecodeReaderHelper var3) throws java.io.IOException {
      this.fields = new DualArrayList();
      this.methods = new DualArrayList();
      this.attributes = new DualArrayList();
      this.canRename = true;
      this.canRename = var2;
      this.bytecode = var3;
      this.readClassHeader(var1);
   }

   public final FieldInfo getField(String var1, String var2) {
      return (FieldInfo)this.fields.b(Util.concat(var1, var2));
   }

   public final MethodInfo getMethod(String var1, String var2) {
      return (MethodInfo)this.methods.b(Util.concat(var1, var2));
   }

   public final String getInterface(int var1) {
      return this.interface_names[var1];
   }

   public final void resetConstPool() {
      if(this.bytecode != null) {
         this.constant_pool = null;
      }

   }

   private void readClassHeader(ReliableDataInputStream var1) throws java.io.IOException {
      var1.skip(4L);
      this.minor_version = var1.readUnsignedShort();
      this.major_version = var1.readUnsignedShort();
      this.constant_pool = new ConstPool(var1);
      this.access_flags = var1.readUnsignedShort();
      this.this_class = var1.readUnsignedShort();
      this.this_class_cp_info = this.constant_pool.a(this.this_class);
      this.name = (String)this.this_class_cp_info.a;
      this.super_class = var1.readUnsignedShort();
      this.super_class_cp_info = this.constant_pool.a(this.super_class);
      int var2;
      int[] var3 = new int[var2 = var1.readUnsignedShort()];
      String[] var4 = new String[var2];

      for(int var5 = 0; var5 < var2; ++var5) {
         var3[var5] = var1.readUnsignedShort();
         var4[var5] = (String)this.constant_pool.a(var3[var5]).a;
      }

      this.interface_indexes = var3;
      this.interface_names = var4;
      DualArrayList var9 = new DualArrayList();
      var2 = var1.readUnsignedShort();

      int var6;
      for(var6 = 0; var6 < var2; ++var6) {
         FieldInfo var7;
         (var7 = new FieldInfo()).access_flags = var1.readUnsignedShort();
         var7.name_index = var1.readUnsignedShort();
         var7.descriptor_index = var1.readUnsignedShort();
         var7.setSignature(this.constant_pool, this.this_class);
         var7.a(this.readAttributes(var1));
         var9.a((Object)var7, (Object)Util.concat(var7.getName(), var7.getDesc()));
      }

      this.fields = var9;
      var2 = var1.readUnsignedShort();

      for(var6 = 0; var6 < var2; ++var6) {
         MethodInfo var8 = new MethodInfo(var1, this.canRename, this);
         this.methods.a((Object)var8, (Object)Util.concat(var8.getName(), var8.getDesc()));
      }

      this.attributes = this.readAttributes(var1);
      if(this.bytecode != null) {
         this.constant_pool = null;
      }

   }

   private DualArrayList readAttributes(ReliableDataInputStream var1) throws java.io.IOException {
      DualArrayList var2 = new DualArrayList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.readUnsignedShort();
         Openflower196 var10000 = this.constant_pool.a(var5);
         String var6 = null;
         var6 = (String)var10000.a;
         Attribute var7;
         if((var7 = Attribute.create(var5, var6)) != null) {
            byte[] var8 = new byte[var1.readInt()];
            var1.a(var8);
            var7.setData(var8);
            var7.read(this.constant_pool);
            var2.a((Object)var7, (Object)var7.getName());
         } else {
            var1.skip((long)var1.readInt());
         }
      }

      return var2;
   }

   public final ConstPool getConstPool() {
      if(this.constant_pool == null && this.bytecode != null) {
         this.constant_pool = this.bytecode.getConstPool(this.name);
      }

      return this.constant_pool;
   }

   public final int[] getInterfaceIndexes() {
      return this.interface_indexes;
   }

   public final String[] getInterfaceNames() {
      return this.interface_names;
   }

   public final DualArrayList getMethods() {
      return this.methods;
   }

   public final DualArrayList getFields() {
      return this.fields;
   }

   public final DualArrayList getAttributes() {
      return this.attributes;
   }

   public final boolean isNotLibrary() {
      return this.canRename;
   }

   public final BytecodeReaderHelper getBytecodeReaderHelper() {
      return this.bytecode;
   }
}
