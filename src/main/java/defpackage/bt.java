package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: bt */
public final class bt implements Serializable {
    public static final Pattern b = Pattern.compile("\\s*,\\s*");
    public static final Pattern c = Pattern.compile("\\s*~\\s*");
    private static final bx d = new bw();
    private static final cf e = new cf("other", d, null, null);
    private static final bt f;
    private static final Pattern g = Pattern.compile("\\s*\\Q\\E@\\s*");
    private static final Pattern h = Pattern.compile("\\s*or\\s*");
    private static final Pattern i = Pattern.compile("\\s*and\\s*");
    private static final Pattern j = Pattern.compile("\\s*;\\s*");
    public static final long serialVersionUID = 1;
    public final ci a;

    public static bt a(String str) {
        CharSequence trim = str.trim();
        if (trim.length() == 0) {
            return f;
        }
        ci ciVar = new ci();
        if (trim.endsWith(";")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String[] split = j.split(trim);
        for (String trim2 : split) {
            cf b = bt.b(trim2.trim());
            int i = 1;
            if (b.c == null && b.d == null) {
                i = 0;
            }
            ciVar.a |= i;
            ciVar.a(b);
        }
        Iterator it = ciVar.b.iterator();
        Object obj = null;
        while (it.hasNext()) {
            cf cfVar = (cf) it.next();
            if ("other".equals(cfVar.a)) {
                it.remove();
                obj = cfVar;
            }
        }
        if (obj == null) {
            obj = bt.b("other:");
        }
        ciVar.b.add(obj);
        return new bt(ciVar);
    }

    private static ParseException a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 25) + String.valueOf(str2).length());
        stringBuilder.append("unexpected token '");
        stringBuilder.append(str);
        stringBuilder.append("' in '");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        return new ParseException(stringBuilder.toString(), -1);
    }

    private static String a(String[] strArr, int i, String str) {
        if (i < strArr.length) {
            return strArr[i];
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
        stringBuilder.append("missing token at end of '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        throw new ParseException(stringBuilder.toString(), -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    private static defpackage.cf b(java.lang.String r38) {
        /*
        r0 = r38.length();
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r0 = e;
        return r0;
    L_0x0009:
        r0 = java.util.Locale.ENGLISH;
        r1 = r38;
        r0 = r1.toLowerCase(r0);
        r1 = 58;
        r1 = r0.indexOf(r1);
        r2 = -1;
        r3 = 0;
        if (r1 == r2) goto L_0x0456;
    L_0x001b:
        r4 = r0.substring(r3, r1);
        r4 = r4.trim();
        r5 = 0;
    L_0x0024:
        r6 = r4.length();
        if (r5 >= r6) goto L_0x005b;
    L_0x002a:
        r6 = r4.charAt(r5);
        r7 = 97;
        if (r6 < r7) goto L_0x0039;
    L_0x0032:
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r6 > r7) goto L_0x0039;
    L_0x0036:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x0039:
        r0 = new java.text.ParseException;
        r1 = r4.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 22;
        r2.<init>(r1);
        r1 = "keyword '";
        r2.append(r1);
        r2.append(r4);
        r1 = " is not valid";
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1, r3);
        throw r0;
    L_0x005b:
        r5 = 1;
        r1 = r1 + r5;
        r0 = r0.substring(r1);
        r0 = r0.trim();
        r1 = g;
        r1 = r1.split(r0);
        r6 = r1.length;
        r7 = 3;
        r9 = 2;
        if (r6 == r5) goto L_0x00d1;
    L_0x0070:
        if (r6 == r9) goto L_0x00c3;
    L_0x0072:
        if (r6 == r7) goto L_0x0090;
    L_0x0074:
        r1 = new java.lang.IllegalArgumentException;
        r0 = java.lang.String.valueOf(r0);
        r2 = "Too many samples in ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x0088;
    L_0x0082:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x008c;
    L_0x0088:
        r0 = r2.concat(r0);
    L_0x008c:
        r1.<init>(r0);
        throw r1;
    L_0x0090:
        r6 = r1[r5];
        r6 = defpackage.cb.a(r6);
        r10 = r1[r9];
        r10 = defpackage.cb.a(r10);
        r11 = r6.a;
        if (r11 != r5) goto L_0x00a7;
    L_0x00a0:
        r11 = r10.a;
        if (r11 == r9) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a7;
    L_0x00a5:
        r0 = r6;
        goto L_0x00d3;
    L_0x00a7:
        r1 = new java.lang.IllegalArgumentException;
        r0 = java.lang.String.valueOf(r0);
        r2 = "Must have @integer then @decimal in ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x00bb;
    L_0x00b5:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x00bf;
    L_0x00bb:
        r0 = r2.concat(r0);
    L_0x00bf:
        r1.<init>(r0);
        throw r1;
    L_0x00c3:
        r0 = r1[r5];
        r0 = defpackage.cb.a(r0);
        r6 = r0.a;
        if (r6 == r9) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00d2;
    L_0x00ce:
        r10 = r0;
        r0 = 0;
        goto L_0x00d3;
    L_0x00d1:
        r0 = 0;
    L_0x00d2:
        r10 = 0;
    L_0x00d3:
        r6 = "other";
        r6 = r4.equals(r6);
        r11 = r1[r3];
        r11 = r11.length();
        if (r11 == 0) goto L_0x00e3;
    L_0x00e1:
        r11 = 0;
        goto L_0x00e4;
    L_0x00e3:
        r11 = 1;
    L_0x00e4:
        if (r6 != r11) goto L_0x044e;
    L_0x00e6:
        if (r6 == 0) goto L_0x00f2;
    L_0x00e8:
        r1 = d;
        r29 = r0;
        r34 = r4;
        r31 = r10;
        goto L_0x0442;
    L_0x00f2:
        r1 = r1[r3];
        r6 = h;
        r1 = r6.split(r1);
        r6 = 0;
        r11 = 0;
    L_0x00fc:
        r12 = r1.length;
        if (r6 >= r12) goto L_0x043b;
    L_0x00ff:
        r12 = i;
        r13 = r1[r6];
        r12 = r12.split(r13);
        r13 = 0;
        r14 = 0;
    L_0x0109:
        r15 = r12.length;
        if (r13 >= r15) goto L_0x0410;
    L_0x010c:
        r15 = d;
        r16 = r12[r13];
        r2 = r16.trim();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r7 = 0;
        r9 = -1;
    L_0x011b:
        r5 = r2.length();
        if (r7 >= r5) goto L_0x017f;
    L_0x0121:
        r5 = r2.charAt(r7);
        r3 = 32;
        if (r5 <= r3) goto L_0x012a;
    L_0x0129:
        goto L_0x013d;
    L_0x012a:
        if (r5 == r3) goto L_0x0170;
    L_0x012c:
        r3 = 9;
        if (r5 == r3) goto L_0x0170;
    L_0x0130:
        r3 = 10;
        if (r5 == r3) goto L_0x0170;
    L_0x0134:
        r3 = 12;
        if (r5 == r3) goto L_0x0170;
    L_0x0138:
        r3 = 13;
        if (r5 != r3) goto L_0x013d;
    L_0x013c:
        goto L_0x0170;
    L_0x013d:
        r3 = 61;
        if (r5 > r3) goto L_0x016b;
    L_0x0141:
        r3 = 33;
        if (r5 < r3) goto L_0x016b;
    L_0x0145:
        if (r5 == r3) goto L_0x0157;
    L_0x0147:
        r3 = 37;
        if (r5 == r3) goto L_0x0157;
    L_0x014b:
        r3 = 44;
        if (r5 == r3) goto L_0x0157;
    L_0x014f:
        r3 = 46;
        if (r5 == r3) goto L_0x0157;
    L_0x0153:
        r3 = 61;
        if (r5 != r3) goto L_0x016b;
    L_0x0157:
        if (r9 >= 0) goto L_0x015a;
    L_0x0159:
        goto L_0x0161;
    L_0x015a:
        r3 = r2.substring(r9, r7);
        r8.add(r3);
    L_0x0161:
        r3 = r7 + 1;
        r3 = r2.substring(r7, r3);
        r8.add(r3);
        goto L_0x017a;
    L_0x016b:
        if (r9 < 0) goto L_0x016e;
    L_0x016d:
        goto L_0x017b;
    L_0x016e:
        r9 = r7;
        goto L_0x017b;
    L_0x0170:
        if (r9 >= 0) goto L_0x0173;
    L_0x0172:
        goto L_0x017b;
    L_0x0173:
        r3 = r2.substring(r9, r7);
        r8.add(r3);
    L_0x017a:
        r9 = -1;
    L_0x017b:
        r7 = r7 + 1;
        r3 = 0;
        goto L_0x011b;
    L_0x017f:
        if (r9 < 0) goto L_0x0188;
    L_0x0181:
        r3 = r2.substring(r9);
        r8.add(r3);
    L_0x0188:
        r3 = r8.size();
        r3 = new java.lang.String[r3];
        r3 = r8.toArray(r3);
        r3 = (java.lang.String[]) r3;
        r5 = 0;
        r7 = r3[r5];
        r21 = defpackage.ce.a(r7);	 Catch:{ Exception -> 0x040b }
        r5 = r3.length;
        r8 = 1;
        if (r5 <= r8) goto L_0x03d5;
    L_0x019f:
        r5 = r3[r8];
        r7 = "mod";
        r7 = r7.equals(r5);
        if (r7 != 0) goto L_0x01b6;
    L_0x01a9:
        r7 = "%";
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x01b2;
    L_0x01b1:
        goto L_0x01b6;
    L_0x01b2:
        r7 = 0;
        r9 = 3;
        r15 = 2;
        goto L_0x01c8;
    L_0x01b6:
        r5 = 2;
        r7 = r3[r5];
        r5 = java.lang.Integer.parseInt(r7);
        r9 = 3;
        r7 = defpackage.bt.a(r3, r9, r2);
        r15 = 4;
        r36 = r7;
        r7 = r5;
        r5 = r36;
    L_0x01c8:
        r8 = "not";
        r17 = r8.equals(r5);
        r9 = "=";
        if (r17 == 0) goto L_0x01ee;
    L_0x01d2:
        r5 = r15 + 1;
        r15 = defpackage.bt.a(r3, r15, r2);
        r17 = r9.equals(r15);
        if (r17 != 0) goto L_0x01e9;
    L_0x01de:
        r17 = r1;
        r28 = r12;
        r1 = 0;
        r36 = r15;
        r15 = r5;
        r5 = r36;
        goto L_0x0211;
    L_0x01e9:
        r0 = defpackage.bt.a(r15, r2);
        throw r0;
    L_0x01ee:
        r17 = r1;
        r1 = "!";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x020e;
    L_0x01f8:
        r1 = r15 + 1;
        r5 = defpackage.bt.a(r3, r15, r2);
        r15 = r9.equals(r5);
        if (r15 == 0) goto L_0x0209;
    L_0x0204:
        r15 = r1;
        r28 = r12;
        r1 = 0;
        goto L_0x0211;
    L_0x0209:
        r0 = defpackage.bt.a(r5, r2);
        throw r0;
    L_0x020e:
        r28 = r12;
        r1 = 1;
    L_0x0211:
        r12 = "is";
        r18 = r12.equals(r5);
        if (r18 == 0) goto L_0x021c;
    L_0x0219:
        r29 = r0;
        goto L_0x0244;
    L_0x021c:
        r29 = r0;
        r0 = "in";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0244;
    L_0x0226:
        r0 = r9.equals(r5);
        if (r0 != 0) goto L_0x0244;
    L_0x022c:
        r0 = "within";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x023f;
    L_0x0234:
        r0 = r15 + 1;
        r5 = defpackage.bt.a(r3, r15, r2);
        r9 = r0;
        r0 = 0;
        r22 = 0;
        goto L_0x025a;
    L_0x023f:
        r0 = defpackage.bt.a(r5, r2);
        throw r0;
    L_0x0244:
        r0 = r12.equals(r5);
        if (r0 != 0) goto L_0x024b;
    L_0x024a:
        goto L_0x024d;
    L_0x024b:
        if (r1 == 0) goto L_0x03d0;
    L_0x024d:
        r5 = r15 + 1;
        r9 = defpackage.bt.a(r3, r15, r2);
        r22 = 1;
        r36 = r9;
        r9 = r5;
        r5 = r36;
    L_0x025a:
        r8 = r8.equals(r5);
        if (r8 != 0) goto L_0x0265;
    L_0x0260:
        r20 = r1;
        r8 = r5;
        r5 = r9;
        goto L_0x0274;
    L_0x0265:
        if (r0 == 0) goto L_0x0268;
    L_0x0267:
        goto L_0x026a;
    L_0x0268:
        if (r1 == 0) goto L_0x03cb;
    L_0x026a:
        r1 = r1 ^ 1;
        r5 = r9 + 1;
        r8 = defpackage.bt.a(r3, r9, r2);
        r20 = r1;
    L_0x0274:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r18 = 4890909195324358656; // 0x43e0000000000000 float:0.0 double:9.223372036854776E18;
        r23 = -4332462841530417152; // 0xc3e0000000000000 float:0.0 double:-9.223372036854776E18;
        r31 = r10;
        r30 = r11;
        r32 = r13;
        r33 = r14;
        r9 = r18;
        r11 = r23;
    L_0x0289:
        r13 = java.lang.Long.parseLong(r8);
        r15 = r3.length;
        r18 = r8;
        r8 = ",";
        if (r5 >= r15) goto L_0x02f5;
    L_0x0294:
        r34 = r4;
        r4 = r5 + 1;
        r5 = defpackage.bt.a(r3, r5, r2);
        r35 = r6;
        r6 = ".";
        r18 = r5.equals(r6);
        if (r18 == 0) goto L_0x02e4;
    L_0x02a6:
        r5 = r4 + 1;
        r4 = defpackage.bt.a(r3, r4, r2);
        r6 = r4.equals(r6);
        if (r6 == 0) goto L_0x02df;
    L_0x02b2:
        r4 = r5 + 1;
        r5 = defpackage.bt.a(r3, r5, r2);
        r18 = java.lang.Long.parseLong(r5);
        if (r4 >= r15) goto L_0x02d6;
    L_0x02be:
        r5 = r4 + 1;
        r4 = defpackage.bt.a(r3, r4, r2);
        r6 = r4.equals(r8);
        if (r6 == 0) goto L_0x02d1;
    L_0x02ca:
        r6 = r5;
        r36 = r18;
        r18 = r0;
        r0 = r4;
        goto L_0x02dc;
    L_0x02d1:
        r0 = defpackage.bt.a(r4, r2);
        throw r0;
    L_0x02d6:
        r6 = r4;
        r36 = r18;
        r18 = r0;
        r0 = r5;
    L_0x02dc:
        r4 = r36;
        goto L_0x0301;
    L_0x02df:
        r0 = defpackage.bt.a(r4, r2);
        throw r0;
    L_0x02e4:
        r6 = r5.equals(r8);
        if (r6 == 0) goto L_0x02f0;
    L_0x02ea:
        r18 = r0;
        r6 = r4;
        r0 = r5;
        r4 = r13;
        goto L_0x0301;
    L_0x02f0:
        r0 = defpackage.bt.a(r5, r2);
        throw r0;
    L_0x02f5:
        r34 = r4;
        r35 = r6;
        r6 = r5;
        r4 = r13;
        r36 = r18;
        r18 = r0;
        r0 = r36;
    L_0x0301:
        r19 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r19 > 0) goto L_0x03b0;
    L_0x0305:
        if (r7 != 0) goto L_0x030c;
    L_0x0307:
        r19 = r2;
        r23 = r3;
        goto L_0x0315;
    L_0x030c:
        r19 = r2;
        r23 = r3;
        r2 = (long) r7;
        r24 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r24 >= 0) goto L_0x0393;
    L_0x0315:
        r2 = java.lang.Long.valueOf(r13);
        r1.add(r2);
        r2 = java.lang.Long.valueOf(r4);
        r1.add(r2);
        r2 = (double) r13;
        r9 = java.lang.Math.min(r9, r2);
        r2 = (double) r4;
        r11 = java.lang.Math.max(r11, r2);
        if (r6 >= r15) goto L_0x0341;
    L_0x032f:
        r5 = r6 + 1;
        r2 = r19;
        r3 = r23;
        r8 = defpackage.bt.a(r3, r6, r2);
        r0 = r18;
        r4 = r34;
        r6 = r35;
        goto L_0x0289;
    L_0x0341:
        r2 = r19;
        r3 = r0.equals(r8);
        if (r3 != 0) goto L_0x038e;
    L_0x0349:
        r0 = r1.size();
        r3 = 2;
        if (r0 == r3) goto L_0x036c;
    L_0x0350:
        r0 = r1.size();
        r8 = new long[r0];
        r0 = 0;
    L_0x0357:
        r4 = r8.length;
        if (r0 >= r4) goto L_0x0369;
    L_0x035a:
        r4 = r1.get(r0);
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r8[r0] = r4;
        r0 = r0 + 1;
        goto L_0x0357;
    L_0x0369:
        r27 = r8;
        goto L_0x036e;
    L_0x036c:
        r27 = 0;
    L_0x036e:
        r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r0 != 0) goto L_0x0373;
    L_0x0372:
        goto L_0x037f;
    L_0x0373:
        if (r18 == 0) goto L_0x037f;
    L_0x0375:
        if (r20 == 0) goto L_0x0378;
    L_0x0377:
        goto L_0x037f;
    L_0x0378:
        r0 = "is not <range>";
        r0 = defpackage.bt.a(r0, r2);
        throw r0;
    L_0x037f:
        r0 = new cg;
        r18 = r0;
        r19 = r7;
        r23 = r9;
        r25 = r11;
        r18.<init>(r19, r20, r21, r22, r23, r25, r27);
        r15 = r0;
        goto L_0x03e8;
    L_0x038e:
        r0 = defpackage.bt.a(r0, r2);
        throw r0;
    L_0x0393:
        r2 = r19;
        r0 = new java.lang.StringBuilder;
        r1 = 36;
        r0.<init>(r1);
        r0.append(r4);
        r1 = ">mod=";
        r0.append(r1);
        r0.append(r7);
        r0 = r0.toString();
        r0 = defpackage.bt.a(r0, r2);
        throw r0;
    L_0x03b0:
        r0 = new java.lang.StringBuilder;
        r1 = 41;
        r0.<init>(r1);
        r0.append(r13);
        r1 = "~";
        r0.append(r1);
        r0.append(r4);
        r0 = r0.toString();
        r0 = defpackage.bt.a(r0, r2);
        throw r0;
    L_0x03cb:
        r0 = defpackage.bt.a(r5, r2);
        throw r0;
    L_0x03d0:
        r0 = defpackage.bt.a(r5, r2);
        throw r0;
    L_0x03d5:
        r29 = r0;
        r17 = r1;
        r34 = r4;
        r35 = r6;
        r31 = r10;
        r30 = r11;
        r28 = r12;
        r32 = r13;
        r33 = r14;
        r3 = 2;
    L_0x03e8:
        if (r33 == 0) goto L_0x03f3;
    L_0x03ea:
        r0 = new bv;
        r8 = r33;
        r0.<init>(r8, r15);
        r14 = r0;
        goto L_0x03f4;
    L_0x03f3:
        r14 = r15;
    L_0x03f4:
        r13 = r32 + 1;
        r1 = r17;
        r12 = r28;
        r0 = r29;
        r11 = r30;
        r10 = r31;
        r4 = r34;
        r6 = r35;
        r2 = -1;
        r3 = 0;
        r5 = 1;
        r7 = 3;
        r9 = 2;
        goto L_0x0109;
    L_0x040b:
        r0 = defpackage.bt.a(r7, r2);
        throw r0;
    L_0x0410:
        r29 = r0;
        r17 = r1;
        r34 = r4;
        r35 = r6;
        r31 = r10;
        r30 = r11;
        r8 = r14;
        r3 = 2;
        if (r30 == 0) goto L_0x0429;
    L_0x0420:
        r0 = new cd;
        r1 = r30;
        r0.<init>(r1, r8);
        r11 = r0;
        goto L_0x042a;
    L_0x0429:
        r11 = r8;
    L_0x042a:
        r6 = r35 + 1;
        r1 = r17;
        r0 = r29;
        r10 = r31;
        r4 = r34;
        r2 = -1;
        r3 = 0;
        r5 = 1;
        r7 = 3;
        r9 = 2;
        goto L_0x00fc;
    L_0x043b:
        r29 = r0;
        r34 = r4;
        r31 = r10;
        r1 = r11;
    L_0x0442:
        r0 = new cf;
        r8 = r29;
        r10 = r31;
        r2 = r34;
        r0.<init>(r2, r1, r8, r10);
        return r0;
    L_0x044e:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "The keyword 'other' must have no constraints, just samples.";
        r0.<init>(r1);
        throw r0;
    L_0x0456:
        r1 = new java.text.ParseException;
        r2 = r0.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 34;
        r3.<init>(r2);
        r2 = "missing ':' in rule description '";
        r3.append(r2);
        r3.append(r0);
        r0 = "'";
        r3.append(r0);
        r0 = r3.toString();
        r2 = 0;
        r1.<init>(r0, r2);
        goto L_0x047a;
    L_0x0479:
        throw r1;
    L_0x047a:
        goto L_0x0479;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt.b(java.lang.String):cf");
    }

    public static void a(StringBuilder stringBuilder, double d, double d2, boolean z) {
        if (z) {
            stringBuilder.append(",");
        }
        if (d == d2) {
            stringBuilder.append(bt.a(d));
            return;
        }
        String a = bt.a(d);
        String a2 = bt.a(d2);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a).length() + 2) + String.valueOf(a2).length());
        stringBuilder2.append(a);
        stringBuilder2.append("..");
        stringBuilder2.append(a2);
        stringBuilder.append(stringBuilder2.toString());
    }

    private static String a(double d) {
        long j = (long) d;
        return d != ((double) j) ? String.valueOf(d) : String.valueOf(j);
    }

    private bt(ci ciVar) {
        this.a = ciVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cf cfVar : ciVar.b) {
            linkedHashSet.add(cfVar.a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt) {
            bt btVar = (bt) obj;
            if (btVar != null && toString().equals(btVar.toString())) {
                return true;
            }
        }
        return false;
    }

    static {
        ci ciVar = new ci();
        ciVar.a(e);
        f = new bt(ciVar);
        Pattern.compile("\\s*\\Q..\\E\\s*");
    }

    public static bt a(Locale locale, int i) {
        Map map;
        bt btVar;
        ch chVar = ch.c;
        chVar.a();
        if (i != 1) {
            map = chVar.b;
        } else {
            map = chVar.a;
        }
        String str = (String) map.get(locale.getLanguage());
        if (str == null || str.trim().length() == 0) {
            btVar = f;
        } else {
            btVar = chVar.a(str);
            if (btVar == null) {
                return f;
            }
        }
        return btVar;
    }
}
