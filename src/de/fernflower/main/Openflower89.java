package de.fernflower.main;

import de.fernflower.main.ClassInfo;
import de.fernflower.main.ConstPool;
import de.fernflower.main.Descriptor;
import de.fernflower.main.Openflower0;
import de.fernflower.main.Openflower100;
import de.fernflower.main.Openflower105;
import de.fernflower.main.Openflower11;
import de.fernflower.main.Openflower137;
import de.fernflower.main.Openflower138;
import de.fernflower.main.Openflower141;
import de.fernflower.main.Openflower143;
import de.fernflower.main.Openflower146;
import de.fernflower.main.Openflower147;
import de.fernflower.main.Openflower148;
import de.fernflower.main.Openflower152;
import de.fernflower.main.Openflower154_SomeSorter;
import de.fernflower.main.Openflower196;
import de.fernflower.main.Openflower7;
import de.fernflower.main.Openflower90;
import de.fernflower.main.VarProcessor;
import de.fernflower.main.classreader.opcodes.Opcode;
import de.fernflower.main.codeprinter.elements.ConstantElement;
import de.fernflower.main.codeprinter.elements.Element;
import de.fernflower.main.codeprinter.elements.Openflower122;
import de.fernflower.main.codeprinter.elements.Openflower124;
import de.fernflower.main.codeprinter.elements.Openflower126;
import de.fernflower.main.codeprinter.elements.Openflower128;
import de.fernflower.main.codeprinter.elements.Openflower129;
import de.fernflower.main.codeprinter.elements.Openflower130;
import de.fernflower.main.codeprinter.elements.Openflower131;
import de.fernflower.main.codeprinter.elements.Openflower132;
import de.fernflower.main.codeprinter.elements.Openflower133;
import de.fernflower.main.codeprinter.elements.Openflower134;
import de.fernflower.main.codeprinter.elements.Openflower135;
import de.fernflower.main.util.Configuration;
import de.fernflower.main.util.MethodSignatureHolder;
import de.fernflower.main.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class Openflower89 implements Openflower0 {

   private static final HashMap a;
   private static final Descriptor[] b;
   private static final Descriptor[] c;
   private static final Descriptor[] d;
   private static final int[] f;
   private static final int[] g;
   private static final int[] h;
   private static final int[] i;
   private static final int[] j;
   private static final int[] k;
   private static final int[] l;
   private static final int[] m;
   private static final int[] n;
   private static final int[] o;
   private static final String[] p;
   private VarProcessor varProcessor = (VarProcessor)Configuration.getObject("CURRENT_VAR_PROCESSOR");


   static {
      (a = new HashMap()).put(new Integer(190), new Integer(31));
      a.put(new Integer(192), new Integer(29));
      a.put(new Integer(193), new Integer(30));
      b = new Descriptor[]{Descriptor.INT, Descriptor.FLOAT, Descriptor.LONG, Descriptor.DOUBLE, Descriptor.CLASS, Descriptor.STRING};
      c = new Descriptor[]{Descriptor.INT, Descriptor.LONG, Descriptor.FLOAT, Descriptor.DOUBLE, Descriptor.OBJECT};
      d = new Descriptor[]{Descriptor.INT, Descriptor.LONG, Descriptor.FLOAT, Descriptor.DOUBLE, Descriptor.OBJECT, Descriptor.BOOLEAN, Descriptor.CHAR, Descriptor.SHORT};
      f = new int[]{0, 1, 2, 3, 7};
      g = new int[]{8, 9, 10, 4, 5, 6};
      h = new int[]{14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
      i = new int[]{37, 38, 39, 40, 41};
      j = new int[]{0, 1, 2, 3, 4, 5};
      k = new int[]{8, 9, 10, 11, 12, 13, 14, 15};
      l = new int[]{6, 7};
      m = new int[]{0, 1};
      n = new int[]{7, 1, 3, 2, 0, 6, 4, 5};
      o = new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14};
      p = new String[]{"byte", "char", "double", "float", "int", "long", "short", "boolean"};
   }

   public final void a(Openflower152 var1, ConstPool var2) {
      Openflower143 var3;
      Openflower137 var4 = (var3 = new Openflower143()).a(var1);
      HashSet var5 = new HashSet();
      Iterator var7 = var4.c.values().iterator();

      HashSet var6;
      while(var7.hasNext()) {
         List var10000 = (List)var7.next();
         var6 = null;
         Iterator var9 = var10000.iterator();

         while(var9.hasNext()) {
            Openflower141 var8 = (Openflower141)var9.next();
            var5.add(var8.c);
         }
      }

      var6 = new HashSet();
      Iterator var23 = var4.d.values().iterator();

      while(var23.hasNext()) {
         Iterator var10 = ((List)var23.next()).iterator();

         while(var10.hasNext()) {
            Openflower141 var24 = (Openflower141)var10.next();
            var6.add(var24.a + "##" + var24.c);
         }
      }

      HashMap var21 = new HashMap();
      this.a((Openflower154_SomeSorter)var1, var3, (Map)var21);
      HashMap var22 = new HashMap();
      LinkedList var25 = new LinkedList();
      LinkedList var26 = new LinkedList();
      var25.add(var4.b);
      var26.add(new LinkedList());
      HashMap var19;
      (var19 = new HashMap()).put((Object)null, new Openflower100());
      var22.put(var4.b, var19);

      while(!var25.isEmpty()) {
         Openflower138 var20 = (Openflower138)var25.removeFirst();
         LinkedList var11 = (LinkedList)var26.removeFirst();
         Openflower100 var27;
         if(var21.containsKey(var20.b)) {
            Openflower135 var12 = (Openflower135)var21.get(var20.b);
            Openflower100 var13 = new Openflower100();
            Openflower135 var14;
            (var14 = new Openflower135(10000, var12.getDescriptor(), var12.getVarProcessor())).o();
            var13.b().add(new Openflower124(var14, var12.copy()));
            var13.c().a(var14.copy());
            var27 = var13;
         } else {
            var27 = (Openflower100)((Map)var22.get(var20)).get(a(var11));
         }

         Openflower146 var29 = var20.c;
         if(var20.c != null) {
            this.a(var29, var27, var2);
            var29.b(var27.b());
         }

         String var28 = var11.isEmpty()?null:(String)var11.getLast();
         Iterator var15 = var20.f.iterator();

         while(var15.hasNext()) {
            Openflower138 var30 = (Openflower138)var15.next();
            boolean var16 = true;
            if(var28 != null && var4.d.containsKey(var20.b)) {
               var16 = false;
               Iterator var18 = ((List)var4.d.get(var20.b)).iterator();

               while(var18.hasNext()) {
                  Openflower141 var17;
                  if((var17 = (Openflower141)var18.next()).a.equals(var28) && var17.b.equals(var30.b)) {
                     var16 = true;
                     break;
                  }
               }
            }

            if(var16) {
               Object var31;
               if((var31 = (Map)var22.get(var30)) == null) {
                  var22.put(var30, var31 = new HashMap());
               }

               LinkedList var33 = new LinkedList(var11);
               if(var6.contains(var20.b + "##" + var30.b)) {
                  var33.addLast(var20.b);
               } else if(!var5.contains(var30.b) && var4.d.containsKey(var20.b)) {
                  var33.removeLast();
               }

               String var32 = a(var33);
               if(!((Map)var31).containsKey(var32)) {
                  ((Map)var31).put(var32, a(var27.a()));
                  var25.add(var30);
                  var26.add(var33);
               }
            }
         }
      }

      this.a((Openflower154_SomeSorter)var1);
   }

   private static String a(LinkedList var0) {
      if(var0.isEmpty()) {
         return null;
      } else {
         StringBuilder var1 = new StringBuilder();
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.append(var3);
            var1.append(":");
         }

         return var1.toString();
      }
   }

   private static Openflower100 a(Openflower100 var0) {
      Openflower90 var1 = var0.c();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         var1.set(var2, ((Element)var1.get(var2)).copy());
      }

      return var0;
   }

   private void a(Openflower154_SomeSorter var1, Openflower143 var2, Map var3) {
      List var4 = null;
      if(var1.c == 12) {
         Openflower147 var5;
         if(!(var5 = (Openflower147)var1).a_()) {
            var4 = var5.g();
         }
      } else if(var1.c == 7) {
         var4 = ((Openflower148)var1).e();
      }

      if(var4 != null) {
         for(int var7 = 1; var7 < var1.t().size(); ++var7) {
            var3.put(((String[])var2.a().get(((Openflower154_SomeSorter)var1.t().get(var7)).id))[0], (Openflower135)var4.get(var7 - 1));
         }
      }

      Iterator var6 = var1.t().iterator();

      while(var6.hasNext()) {
         Openflower154_SomeSorter var8 = (Openflower154_SomeSorter)var6.next();
         this.a(var8, var2, var3);
      }

   }

   private void a(Openflower154_SomeSorter var1) {
      var1.e_();
      Iterator var2 = var1.t().iterator();

      while(var2.hasNext()) {
         var1 = (Openflower154_SomeSorter)var2.next();
         this.a(var1);
      }

   }

   private void a(Openflower146 var1, Openflower100 var2, ConstPool var3) {
      Openflower11 var10 = var1.e();
      Openflower90 var4 = var2.c();
      List var12 = var2.b();
      Openflower7 var11 = var10.e();

      for(int var5 = 0; var5 < var11.d(); ++var5) {
         Opcode var6;
         Descriptor var8;
         Element var15;
         Openflower124 var16;
         Element var21;
         switch((var6 = var11.b(var5)).opcode) {
         case 1:
            this.a(var4, var12, (Element)(new ConstantElement(Descriptor.NULL, (Object)null)));
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 167:
         case 168:
         case 169:
         case 186:
         case 196:
         default:
            break;
         case 9:
         case 10:
            this.a(var4, var12, (Element)(new ConstantElement(Descriptor.LONG, new Long((long)(var6.opcode - 9)))));
            break;
         case 11:
         case 12:
         case 13:
            this.a(var4, var12, (Element)(new ConstantElement(Descriptor.FLOAT, new Float((float)(var6.opcode - 11)))));
            break;
         case 14:
         case 15:
            this.a(var4, var12, (Element)(new ConstantElement(Descriptor.DOUBLE, new Double((double)(var6.opcode - 14)))));
            break;
         case 16:
         case 17:
            this.a(var4, var12, (Element)(new ConstantElement(var6.getValue(0), true)));
            break;
         case 18:
         case 19:
         case 20:
            Openflower196 var17 = var3.a(var6.getValue(0));
            this.a(var4, var12, (Element)(new ConstantElement(b[var17.d - 3], var17.a)));
            break;
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
            this.a(var4, var12, (Element)(new Openflower135(var6.getValue(0), c[var6.opcode - 21], this.varProcessor)));
            break;
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
            var15 = var4.a();
            var21 = var4.a();
            Descriptor var19 = null;
            switch(var6.opcode) {
            case 47:
               var19 = Descriptor.LONG;
            case 48:
            default:
               break;
            case 49:
               var19 = Descriptor.DOUBLE;
            }

            this.a(var4, var12, new Openflower122(var21, var15, d[var6.opcode - 46]), var19);
            break;
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
            var15 = var4.a();
            int var20 = var6.getValue(0);
            var16 = new Openflower124(new Openflower135(var20, c[var6.opcode - 54], this.varProcessor), var15);
            var12.add(var16);
            break;
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
            var15 = var4.a();
            var21 = var4.a();
            Element var9 = var4.a();
            var16 = new Openflower124(new Openflower122(var9, var21, d[var6.opcode - 79]), var15);
            var12.add(var16);
            break;
         case 87:
         case 88:
            var4.a();
            break;
         case 89:
            this.a(var4, var12, ((Element)var4.getOffset(-1)).copy());
            break;
         case 90:
            this.a(-2, var4, var12, -1);
            break;
         case 91:
            if(((Element)var4.getOffset(-2)).getDescriptor().varSize == 2) {
               this.a(-2, var4, var12, -1);
            } else {
               this.a(-3, var4, var12, -1);
            }
            break;
         case 92:
            if(((Element)var4.getOffset(-1)).getDescriptor().varSize == 2) {
               this.a(var4, var12, ((Element)var4.getOffset(-1)).copy());
            } else {
               this.a(var4, var12, ((Element)var4.getOffset(-2)).copy());
               this.a(var4, var12, ((Element)var4.getOffset(-2)).copy());
            }
            break;
         case 93:
            if(((Element)var4.getOffset(-1)).getDescriptor().varSize == 2) {
               this.a(-2, var4, var12, -1);
            } else {
               this.a(-3, var4, var12, -2);
               this.a(-3, var4, var12, -1);
            }
            break;
         case 94:
            if(((Element)var4.getOffset(-1)).getDescriptor().varSize == 2) {
               if(((Element)var4.getOffset(-2)).getDescriptor().varSize == 2) {
                  this.a(-2, var4, var12, -1);
               } else {
                  this.a(-3, var4, var12, -1);
               }
            } else if(((Element)var4.getOffset(-3)).getDescriptor().varSize == 2) {
               this.a(-3, var4, var12, -2);
               this.a(-3, var4, var12, -1);
            } else {
               this.a(-4, var4, var12, -2);
               this.a(-4, var4, var12, -1);
            }
            break;
         case 95:
            this.a(-2, var4, var12, -1);
            var4.a();
            break;
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
            this.a(var4, var12, (Element)(new Openflower129(f[(var6.opcode - 96) / 4], var4)));
            break;
         case 116:
         case 117:
         case 118:
         case 119:
            this.a(var4, var12, (Element)(new Openflower129(13, var4)));
            break;
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
            this.a(var4, var12, (Element)(new Openflower129(g[(var6.opcode - 120) / 2], var4)));
            break;
         case 132:
            Openflower135 var18 = new Openflower135(var6.getValue(0), Descriptor.INT, this.varProcessor);
            var12.add(new Openflower124(var18, new Openflower129(var6.getValue(1) < 0?1:0, Arrays.asList(new Element[]{var18.copy(), new ConstantElement(Descriptor.INT, new Integer(Math.abs(var6.getValue(1))))}))));
            break;
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
            this.a(var4, var12, (Element)(new Openflower129(h[var6.opcode - 133], var4)));
            break;
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
            this.a(var4, var12, (Element)(new Openflower129(i[var6.opcode - 148], var4)));
            break;
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
            var12.add(new Openflower130(o[j[var6.opcode - 153]], var4));
            break;
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
            var12.add(new Openflower130(o[k[var6.opcode - 159]], var4));
            break;
         case 170:
         case 171:
            var12.add(new Openflower134(var4.a()));
            break;
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 191:
            var12.add(new Openflower126(var6.opcode == 191?1:0, var6.opcode == 177?null:var4.a(), var6.opcode == 191?null:((MethodSignatureHolder)Configuration.getObject("CURRENT_METHOD_DESCRIPTOR")).ret));
            break;
         case 178:
         case 180:
            this.a(var4, var12, (Element)(new Openflower128(var3.b(var6.getValue(0)), var6.opcode == 178?null:var4.a())));
            break;
         case 179:
         case 181:
            var15 = var4.a();
            Openflower128 var13 = new Openflower128(var3.b(var6.getValue(0)), var6.opcode == 179?null:var4.a());
            var12.add(new Openflower124(var13, var15));
            break;
         case 182:
         case 183:
         case 184:
         case 185:
            Openflower131 var14;
            if((var14 = new Openflower131(var6.opcode, var3.b(var6.getValue(0)), var4)).h().ret.type == 10) {
               var12.add(var14);
            } else {
               this.a(var4, var12, (Element)var14);
            }
            break;
         case 187:
         case 189:
         case 197:
            int var7 = var6.opcode == 187?0:(var6.opcode == 189?1:var6.getValue(1));
            Descriptor var10000;
            Openflower196 var10002 = var3.a(var6.getValue(0));
            var8 = null;
            var10000 = new Descriptor((String)var10002.a, true);
            var8 = var10000;
            if(var6.opcode != 197) {
               var8.arrayDepth += var7;
            }

            this.a(var4, var12, (Element)(new Openflower133(var8, var4, var7)));
            break;
         case 188:
            this.a(var4, var12, (Element)(new Openflower133(new Descriptor(n[var6.getValue(0) - 4], 1), var4, 1)));
            break;
         case 192:
         case 193:
            ConstantElement var10001;
            Descriptor var10003;
            Openflower196 var10005 = var3.a(var6.getValue(0));
            var8 = null;
            var10003 = new Descriptor((String)var10005.a, true);
            var10001 = new ConstantElement(var10003, (Object)null);
            var4.a(var10001);
         case 190:
            this.a(var4, var12, (Element)(new Openflower129(((Integer)a.get(Integer.valueOf(var6.opcode))).intValue(), var4)));
            break;
         case 194:
         case 195:
            var12.add(new Openflower132(m[var6.opcode - 194], var4.a()));
            break;
         case 198:
         case 199:
            var12.add(new Openflower130(o[l[var6.opcode - 198]], var4));
         }
      }

   }

   private void a(Openflower90 var1, List var2, Element var3) {
      this.a(var1, var2, var3, (Descriptor)null);
   }

   private void a(Openflower90 var1, List var2, Element var3, Descriptor var4) {
      int var5 = 10000 + var1.size();
      Openflower135 var6;
      (var6 = new Openflower135(var5, var4 == null?var3.getDescriptor():var4, this.varProcessor)).o();
      var2.add(new Openflower124(var6, var3));
      var1.a(var6.copy());
   }

   private void a(int var1, Openflower90 var2, List var3, int var4) {
      int var5 = 10000 + var2.size();
      LinkedList var6 = new LinkedList();

      Openflower135 var9;
      for(int var7 = -1; var7 >= var1; --var7) {
         Element var8 = var2.a();
         (var9 = new Openflower135(var5 + var7 + 1, var8.getDescriptor(), this.varProcessor)).o();
         var3.add(new Openflower124(var9, var8));
         var6.add(0, (Openflower135)var9.copy());
      }

      Element var11 = ((Openflower135)var6.get(var6.size() + var4)).copy();
      Openflower135 var12;
      (var12 = new Openflower135(var5 + var1, var11.getDescriptor(), this.varProcessor)).o();
      var3.add(new Openflower124(var12, var11));
      var6.add(0, (Openflower135)var12.copy());
      Iterator var10 = var6.iterator();

      while(var10.hasNext()) {
         var9 = (Openflower135)var10.next();
         var2.a(var9);
      }

   }

   public static String a(Descriptor var0) {
      return b(var0, true);
   }

   private static String b(Descriptor var0, boolean var1) {
      int var2 = var0.type;
      if(var0.type <= 7) {
         return p[var2];
      } else if(var2 == 17) {
         return "<unknown>";
      } else if(var2 == 13) {
         return "<null>";
      } else if(var2 == 10) {
         return "void";
      } else if(var2 == 8) {
         String var3 = getSourceName(var0.stringValue);
         if(var1) {
            var3 = Configuration.getImportManager().getRelativeName(var3, true);
         }

         if(var3 == null) {
            var3 = "<undefinedtype>";
         }

         return var3;
      } else {
         throw new RuntimeException("invalid type");
      }
   }

   public static String b(Descriptor var0) {
      return a(var0, true);
   }

   public static String a(Descriptor var0, boolean var1) {
      String var3 = b(var0, var1);

      for(int var2 = var0.arrayDepth; var2-- > 0; var3 = var3 + "[]") {
         ;
      }

      return var3;
   }

   public static String printLoopBody(Openflower154_SomeSorter var0, int var1, boolean var2) {
      StringBuffer var3 = new StringBuffer(var0.getString(var1));
      List var4;
      Openflower105 var5;
      if((var4 = var0.c(1073741824)).size() == 1 && (var5 = (Openflower105)var4.get(0)).a() != 1 && var5.d && var5.c().c != 14) {
         var3.append(Util.getIndent(var1));
         switch(var5.a()) {
         case 4:
            var3.append("break");
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            var3.append("continue");
         }

         if(var5.c) {
            var3.append(" label" + var5.b.id);
         }

         var3.append(";\r\n");
      }

      if(var3.length() == 0 && var2) {
         var3.append(Util.getIndent(var1) + ";\r\n");
      }

      return var3.toString();
   }

   public static String getSourceName(String var0) {
      String var1;
      ClassInfo var2;
      if((var1 = var0.replace('/', '.')).indexOf("$") >= 0 && ((var2 = Configuration.getDispatcher().getClass(var0)) == null || !var2.isNotLibrary())) {
         var1 = var1.replace('$', '.');
      }

      return var1;
   }

   public static String a(List var0, int var1) {
      String var2 = Util.getIndent(var1);
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         String var5;
         Element var6;
         if((var5 = (var6 = (Element)var4.next()).toString(var1)).length() > 0) {
            if(var6.a != 12 || !((Openflower135)var6).l()) {
               var3.append(var2);
            }

            var3.append(var5);
            if(var6.a == 9 && ((Openflower132)var6).g() == 0) {
               var3.append("{}");
            }

            int var7;
            if((var7 = var6.a) != 11 && var7 != 9 && var7 != 7 && (var7 != 12 || !((Openflower135)var6).l())) {
               var3.append(";");
            }

            var3.append("\r\n");
         }
      }

      return var3.toString();
   }

   public static ConstantElement c(Descriptor var0) {
      ConstantElement var1;
      if(var0.type != 8 && var0.arrayDepth <= 0) {
         if(var0.type == 3) {
            var1 = new ConstantElement(Descriptor.FLOAT, new Float(0.0F));
         } else if(var0.type == 5) {
            var1 = new ConstantElement(Descriptor.LONG, new Long(0L));
         } else if(var0.type == 2) {
            var1 = new ConstantElement(Descriptor.DOUBLE, new Double(0.0D));
         } else {
            var1 = new ConstantElement(0, true);
         }
      } else {
         var1 = new ConstantElement(Descriptor.NULL, (Object)null);
      }

      return var1;
   }

   public static boolean a(Element var0, Descriptor var1, StringBuilder var2, int var3, boolean var4) {
      return a(var0, var1, var2, var3, var4, false);
   }

   public static boolean a(Element var0, Descriptor var1, StringBuilder var2, int var3, boolean var4, boolean var5) {
      boolean var6 = false;
      Descriptor var7 = var0.getDescriptor();
      String var9 = var0.toString(var3);
      boolean var10000 = !var1.equals(var7) && (var7.equals((Object)Descriptor.OBJECT) || var1.type != 8);
      boolean var8 = false;
      if(!(var8 = var10000 | (var5 && !var1.equals((Object)var7))) && var4 && var7.type == 13) {
         Object var10 = null;
         var8 = !"<undefinedtype>".equals(b(var1, true));
      }

      if(!var8) {
         label54: {
            if(var0.a == 3) {
               switch(((ConstantElement)var0).i().type) {
               case 0:
               case 4:
               case 6:
               case 15:
               case 16:
                  var10000 = true;
                  break label54;
               }
            }

            var10000 = false;
         }

         var8 = var10000 && Descriptor.INT.typeEquals(var1);
      }

      if(var8) {
         if(var0.c_() >= Openflower129.g()) {
            var9 = "(" + var9 + ")";
         }

         var9 = "(" + a(var1, true) + ")" + var9;
         var6 = true;
      }

      var2.append(var9);
      return var6;
   }
}
