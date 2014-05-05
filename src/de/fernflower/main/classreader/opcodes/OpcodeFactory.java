package de.fernflower.main.classreader.opcodes;

import de.fernflower.main.classreader.opcodes.ALoad;
import de.fernflower.main.classreader.opcodes.ANewArray;
import de.fernflower.main.classreader.opcodes.AStore;
import de.fernflower.main.classreader.opcodes.Bipush;
import de.fernflower.main.classreader.opcodes.CheckCast;
import de.fernflower.main.classreader.opcodes.DLoad;
import de.fernflower.main.classreader.opcodes.DStore;
import de.fernflower.main.classreader.opcodes.FLoad;
import de.fernflower.main.classreader.opcodes.FStore;
import de.fernflower.main.classreader.opcodes.GetField;
import de.fernflower.main.classreader.opcodes.GetStatic;
import de.fernflower.main.classreader.opcodes.Goto;
import de.fernflower.main.classreader.opcodes.GotoW;
import de.fernflower.main.classreader.opcodes.IInc;
import de.fernflower.main.classreader.opcodes.ILoad;
import de.fernflower.main.classreader.opcodes.IStore;
import de.fernflower.main.classreader.opcodes.InstanceOf;
import de.fernflower.main.classreader.opcodes.InvokeInterface;
import de.fernflower.main.classreader.opcodes.InvokeSpecial;
import de.fernflower.main.classreader.opcodes.InvokeStatic;
import de.fernflower.main.classreader.opcodes.InvokeVirtual;
import de.fernflower.main.classreader.opcodes.Jsr;
import de.fernflower.main.classreader.opcodes.JsrW;
import de.fernflower.main.classreader.opcodes.LLoad;
import de.fernflower.main.classreader.opcodes.LStore;
import de.fernflower.main.classreader.opcodes.Ldc;
import de.fernflower.main.classreader.opcodes.Ldc2W;
import de.fernflower.main.classreader.opcodes.LdcW;
import de.fernflower.main.classreader.opcodes.LookupSwitch;
import de.fernflower.main.classreader.opcodes.MultiANewArray;
import de.fernflower.main.classreader.opcodes.New;
import de.fernflower.main.classreader.opcodes.NewArray;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.classreader.opcodes.Openflower5;
import de.fernflower.main.classreader.opcodes.PutField;
import de.fernflower.main.classreader.opcodes.PutStatic;
import de.fernflower.main.classreader.opcodes.Ret;
import de.fernflower.main.classreader.opcodes.Sipush;
import de.fernflower.main.classreader.opcodes.TableSwitch;

public final class OpcodeFactory {

   private static String[] NAMES = new String[]{"nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0", "dconst_1", "bipush", "sipush", "ldc", "ldc_w", "ldc2_w", "iload", "lload", "fload", "dload", "aload", "iload_0", "iload_1", "iload_2", "iload_3", "lload_0", "lload_1", "lload_2", "lload_3", "fload_0", "fload_1", "fload_2", "fload_3", "dload_0", "dload_1", "dload_2", "dload_3", "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload", "faload", "daload", "aaload", "baload", "caload", "saload", "istore", "lstore", "fstore", "dstore", "astore", "istore_0", "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", "lastore", "fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2", "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul", "dmul", "idiv", "ldiv", "fdiv", "ddiv", "irem", "lrem", "frem", "drem", "ineg", "lneg", "fneg", "dneg", "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", "ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", "f2l", "f2d", "d2i", "d2l", "d2f", "i2b", "i2c", "i2s", "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq", "if_acmpne", "goto", "jsr", "ret", "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn", "areturn", "return", "getstatic", "putstatic", "getfield", "putfield", "invokevirtual", "invokespecial", "invokestatic", "invokeinterface", "xxxunusedxxx", "new", "newarray", "anewarray", "arraylength", "athrow", "checkcast", "instanceof", "monitorenter", "monitorexit", "wide", "multianewarray", "ifnull", "ifnonnull", "goto_w", "jsr_w"};
   private static Class[] CLASSES = new Class[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Bipush.class, Sipush.class, Ldc.class, LdcW.class, Ldc2W.class, ILoad.class, LLoad.class, FLoad.class, DLoad.class, ALoad.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, IStore.class, LStore.class, FStore.class, DStore.class, AStore.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, IInc.class, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Goto.class, Jsr.class, Ret.class, TableSwitch.class, LookupSwitch.class, null, null, null, null, null, null, GetStatic.class, PutStatic.class, GetField.class, PutField.class, InvokeVirtual.class, InvokeSpecial.class, InvokeStatic.class, InvokeInterface.class, null, New.class, NewArray.class, ANewArray.class, null, null, CheckCast.class, InstanceOf.class, null, null, null, MultiANewArray.class, null, null, GotoW.class, JsrW.class};


   public static String getName(int var0) {
      return NAMES[var0];
   }

   public static Opcode createOpcode(int var0, boolean var1, int var2, int[] var3) {
      Opcode var4;
      (var4 = createOpcode(var0)).isWide = var1;
      var4.b = var2;
      var4.setValues(var3);
      return var4;
   }

   private static Opcode createOpcode(int var0) {
      try {
         Object var1;
         if((var0 < 153 || var0 > 166) && var0 != 198 && var0 != 199) {
            Class var3;
            if((var3 = CLASSES[var0]) == null) {
               var1 = new Opcode();
            } else {
               var1 = (Opcode)var3.newInstance();
            }
         } else {
            var1 = new Openflower5();
         }

         ((Opcode)var1).opcode = var0;
         return (Opcode)var1;
      } catch (Exception var2) {
         return null;
      }
   }
}
