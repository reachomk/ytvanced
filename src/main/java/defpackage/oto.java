package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: oto */
public final class oto {
    private static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private final StringBuilder c = new StringBuilder();

    public final boolean a(oza oza, otl otl, List list) {
        String s = oza.s();
        if (s != null) {
            Matcher matcher = a.matcher(s);
            if (matcher.matches()) {
                return oto.a(null, matcher, oza, otl, this.c, list);
            }
            String s2 = oza.s();
            if (s2 != null) {
                Matcher matcher2 = a.matcher(s2);
                if (matcher2.matches()) {
                    return oto.a(s.trim(), matcher2, oza, otl, this.c, list);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:24:0x00a7, code skipped:
            if (r4.equals("start") != false) goto L_0x00dd;
     */
    static void a(java.lang.String r10, defpackage.otl r11) {
        /*
        r0 = "WebvttCueParser";
        r1 = b;
        r10 = r1.matcher(r10);
    L_0x0008:
        r1 = r10.find();
        if (r1 == 0) goto L_0x0166;
    L_0x000e:
        r1 = 1;
        r2 = r10.group(r1);
        r3 = 2;
        r4 = r10.group(r3);
        r5 = "line";
        r5 = r5.equals(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r7 = 44;
        r8 = 0;
        r9 = -1;
        if (r5 != 0) goto L_0x010c;
    L_0x0026:
        r5 = "align";
        r5 = r5.equals(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r5 != 0) goto L_0x0096;
    L_0x002e:
        r1 = "position";
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r1 != 0) goto L_0x0075;
    L_0x0036:
        r1 = "size";
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r1 != 0) goto L_0x006e;
    L_0x003e:
        r1 = java.lang.String.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = r1.length();	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = r1 + 21;
        r3 = java.lang.String.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        r3 = r3.length();	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = r1 + r3;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0146 }
        r3.<init>(r1);	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = "Unknown cue setting ";
        r3.append(r1);	 Catch:{ NumberFormatException -> 0x0146 }
        r3.append(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = ":";
        r3.append(r1);	 Catch:{ NumberFormatException -> 0x0146 }
        r3.append(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = r3.toString();	 Catch:{ NumberFormatException -> 0x0146 }
        defpackage.oyp.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
    L_0x006e:
        r1 = defpackage.ots.b(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        r11.j = r1;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
    L_0x0075:
        r1 = r4.indexOf(r7);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r1 == r9) goto L_0x008c;
    L_0x007b:
        r2 = r1 + 1;
        r2 = r4.substring(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r2 = defpackage.oto.a(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r11.i = r2;	 Catch:{ NumberFormatException -> 0x0146 }
        r4 = r4.substring(r8, r1);	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x008e;
    L_0x008c:
        r11.i = r6;	 Catch:{ NumberFormatException -> 0x0146 }
    L_0x008e:
        r1 = defpackage.ots.b(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        r11.h = r1;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
    L_0x0096:
        r2 = r4.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        switch(r2) {
            case -1364013995: goto L_0x00d2;
            case -1074341483: goto L_0x00c8;
            case 100571: goto L_0x00be;
            case 3317767: goto L_0x00b4;
            case 108511772: goto L_0x00aa;
            case 109757538: goto L_0x00a1;
            default: goto L_0x00a0;
        };
    L_0x00a0:
        goto L_0x00dc;
    L_0x00a1:
        r2 = "start";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00a9:
        goto L_0x00dd;
    L_0x00aa:
        r2 = "right";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00b2:
        r8 = 5;
        goto L_0x00dd;
    L_0x00b4:
        r2 = "left";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00bc:
        r8 = 1;
        goto L_0x00dd;
    L_0x00be:
        r2 = "end";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00c6:
        r8 = 4;
        goto L_0x00dd;
    L_0x00c8:
        r2 = "middle";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00d0:
        r8 = 3;
        goto L_0x00dd;
    L_0x00d2:
        r2 = "center";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x00da:
        r8 = 2;
        goto L_0x00dd;
    L_0x00dc:
        r8 = -1;
    L_0x00dd:
        if (r8 == 0) goto L_0x0106;
    L_0x00df:
        if (r8 == r1) goto L_0x0106;
    L_0x00e1:
        if (r8 == r3) goto L_0x0103;
    L_0x00e3:
        if (r8 == r7) goto L_0x0103;
    L_0x00e5:
        if (r8 == r6) goto L_0x0100;
    L_0x00e7:
        if (r8 == r5) goto L_0x0100;
    L_0x00e9:
        r1 = "Invalid alignment value: ";
        r2 = r4.length();	 Catch:{ NumberFormatException -> 0x0146 }
        if (r2 != 0) goto L_0x00f7;
    L_0x00f1:
        r2 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x0146 }
        r2.<init>(r1);	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x00fb;
    L_0x00f7:
        r2 = r1.concat(r4);	 Catch:{ NumberFormatException -> 0x0146 }
    L_0x00fb:
        defpackage.oyp.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0146 }
        r1 = 0;
        goto L_0x0108;
    L_0x0100:
        r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0108;
    L_0x0103:
        r1 = android.text.Layout.Alignment.ALIGN_CENTER;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0108;
    L_0x0106:
        r1 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ NumberFormatException -> 0x0146 }
    L_0x0108:
        r11.d = r1;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
    L_0x010c:
        r2 = r4.indexOf(r7);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r2 == r9) goto L_0x0123;
    L_0x0112:
        r3 = r2 + 1;
        r3 = r4.substring(r3);	 Catch:{ NumberFormatException -> 0x0146 }
        r3 = defpackage.oto.a(r3);	 Catch:{ NumberFormatException -> 0x0146 }
        r11.g = r3;	 Catch:{ NumberFormatException -> 0x0146 }
        r4 = r4.substring(r8, r2);	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0125;
    L_0x0123:
        r11.g = r6;	 Catch:{ NumberFormatException -> 0x0146 }
    L_0x0125:
        r2 = "%";
        r2 = r4.endsWith(r2);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r2 == 0) goto L_0x0137;
    L_0x012d:
        r1 = defpackage.ots.b(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        r11.e = r1;	 Catch:{ NumberFormatException -> 0x0146 }
        r11.f = r8;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
    L_0x0137:
        r2 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r2 >= 0) goto L_0x013f;
    L_0x013d:
        r2 = r2 + -1;
    L_0x013f:
        r2 = (float) r2;	 Catch:{ NumberFormatException -> 0x0146 }
        r11.e = r2;	 Catch:{ NumberFormatException -> 0x0146 }
        r11.f = r1;	 Catch:{ NumberFormatException -> 0x0146 }
        goto L_0x0008;
        r1 = r10.group();
        r1 = java.lang.String.valueOf(r1);
        r2 = "Skipping bad cue setting: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x015d;
    L_0x0157:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0161;
    L_0x015d:
        r1 = r2.concat(r1);
    L_0x0161:
        defpackage.oyp.a(r0, r1);
        goto L_0x0008;
    L_0x0166:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oto.a(java.lang.String, otl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A:{LOOP_START, LOOP:2: B:72:0x010e->B:75:0x0123} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d7  */
    static void a(java.lang.String r17, java.lang.String r18, defpackage.otl r19, java.util.List r20) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = r20;
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>();
        r4 = new java.util.ArrayDeque;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = 0;
        r7 = 0;
    L_0x0017:
        r8 = r18.length();
        if (r7 < r8) goto L_0x003e;
    L_0x001d:
        r1 = r4.isEmpty();
        if (r1 != 0) goto L_0x002d;
    L_0x0023:
        r1 = r4.pop();
        r1 = (defpackage.otn) r1;
        defpackage.oto.a(r0, r1, r3, r2, r5);
        goto L_0x001d;
    L_0x002d:
        r1 = new otn;
        r4 = new java.lang.String[r6];
        r7 = "";
        r1.<init>(r7, r6, r7, r4);
        defpackage.oto.a(r0, r1, r3, r2, r5);
        r8 = r19;
        r8.c = r3;
        return;
    L_0x003e:
        r8 = r19;
        r9 = r1.charAt(r7);
        r10 = 62;
        r11 = 60;
        r12 = 38;
        r15 = -1;
        r13 = 1;
        if (r9 == r12) goto L_0x0139;
    L_0x004e:
        if (r9 == r11) goto L_0x0056;
    L_0x0050:
        r3.append(r9);
        r7 = r7 + 1;
        goto L_0x0017;
    L_0x0056:
        r9 = r7 + 1;
        r11 = r18.length();
        if (r9 >= r11) goto L_0x0136;
    L_0x005e:
        r11 = r1.charAt(r9);
        r9 = r1.indexOf(r10, r9);
        if (r9 != r15) goto L_0x006d;
    L_0x0068:
        r9 = r18.length();
        goto L_0x006f;
    L_0x006d:
        r9 = r9 + 1;
    L_0x006f:
        r10 = r9 + -2;
        r12 = r1.charAt(r10);
        r15 = 47;
        if (r11 == r15) goto L_0x007c;
    L_0x0079:
        r16 = 1;
        goto L_0x007e;
    L_0x007c:
        r16 = 2;
    L_0x007e:
        r7 = r7 + r16;
        if (r12 == r15) goto L_0x0084;
    L_0x0082:
        r10 = r9 + -1;
    L_0x0084:
        r7 = r1.substring(r7, r10);
        r10 = r7.trim();
        r16 = r10.isEmpty();
        if (r16 != 0) goto L_0x009b;
    L_0x0092:
        r15 = "[ \\.]";
        r10 = defpackage.ozp.b(r10, r15);
        r10 = r10[r6];
        goto L_0x009c;
    L_0x009b:
        r10 = 0;
    L_0x009c:
        if (r10 == 0) goto L_0x0133;
    L_0x009e:
        r15 = r10.hashCode();
        r6 = 98;
        r14 = 4;
        if (r15 == r6) goto L_0x00ef;
    L_0x00a7:
        r6 = 99;
        if (r15 == r6) goto L_0x00e5;
    L_0x00ab:
        r6 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r15 == r6) goto L_0x00db;
    L_0x00af:
        r6 = 3314158; // 0x3291ee float:4.644125E-39 double:1.6374116E-317;
        if (r15 == r6) goto L_0x00d1;
    L_0x00b4:
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        if (r15 == r6) goto L_0x00c7;
    L_0x00b8:
        r6 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r15 == r6) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00f9;
    L_0x00bd:
        r6 = "v";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00c5:
        r6 = 5;
        goto L_0x00fa;
    L_0x00c7:
        r6 = "u";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00cf:
        r6 = 4;
        goto L_0x00fa;
    L_0x00d1:
        r6 = "lang";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00d9:
        r6 = 3;
        goto L_0x00fa;
    L_0x00db:
        r6 = "i";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00e3:
        r6 = 2;
        goto L_0x00fa;
    L_0x00e5:
        r6 = "c";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00ed:
        r6 = 1;
        goto L_0x00fa;
    L_0x00ef:
        r6 = "b";
        r6 = r10.equals(r6);
        if (r6 == 0) goto L_0x00f9;
    L_0x00f7:
        r6 = 0;
        goto L_0x00fa;
    L_0x00f9:
        r6 = -1;
    L_0x00fa:
        if (r6 == 0) goto L_0x010a;
    L_0x00fc:
        if (r6 == r13) goto L_0x010a;
    L_0x00fe:
        r13 = 2;
        if (r6 == r13) goto L_0x010a;
    L_0x0101:
        r13 = 3;
        if (r6 == r13) goto L_0x010a;
    L_0x0104:
        if (r6 == r14) goto L_0x010a;
    L_0x0106:
        r13 = 5;
        if (r6 == r13) goto L_0x010a;
    L_0x0109:
        goto L_0x0133;
    L_0x010a:
        r6 = 47;
        if (r11 != r6) goto L_0x0126;
    L_0x010e:
        r6 = r4.isEmpty();
        if (r6 != 0) goto L_0x0133;
    L_0x0114:
        r6 = r4.pop();
        r6 = (defpackage.otn) r6;
        defpackage.oto.a(r0, r6, r3, r2, r5);
        r6 = r6.a;
        r6 = r6.equals(r10);
        if (r6 == 0) goto L_0x010e;
    L_0x0125:
        goto L_0x0133;
    L_0x0126:
        if (r12 == r6) goto L_0x0133;
    L_0x0128:
        r6 = r3.length();
        r6 = defpackage.otn.a(r7, r6);
        r4.push(r6);
    L_0x0133:
        r7 = r9;
        goto L_0x01e2;
    L_0x0136:
        r7 = r9;
        goto L_0x0017;
    L_0x0139:
        r7 = r7 + 1;
        r6 = 59;
        r6 = r1.indexOf(r6, r7);
        r14 = 32;
        r15 = r1.indexOf(r14, r7);
        r11 = -1;
        if (r6 != r11) goto L_0x014c;
    L_0x014a:
        r6 = r15;
        goto L_0x0152;
    L_0x014c:
        if (r15 == r11) goto L_0x0152;
    L_0x014e:
        r6 = java.lang.Math.min(r6, r15);
    L_0x0152:
        if (r6 == r11) goto L_0x01df;
    L_0x0154:
        r7 = r1.substring(r7, r6);
        r9 = r7.hashCode();
        r11 = 3309; // 0xced float:4.637E-42 double:1.635E-320;
        if (r9 == r11) goto L_0x018d;
    L_0x0160:
        r11 = 3464; // 0xd88 float:4.854E-42 double:1.7114E-320;
        if (r9 == r11) goto L_0x0183;
    L_0x0164:
        r11 = 96708; // 0x179c4 float:1.35517E-40 double:4.778E-319;
        if (r9 == r11) goto L_0x0179;
    L_0x0169:
        r11 = 3374865; // 0x337f11 float:4.729193E-39 double:1.667405E-317;
        if (r9 == r11) goto L_0x016f;
    L_0x016e:
        goto L_0x0197;
    L_0x016f:
        r9 = "nbsp";
        r9 = r7.equals(r9);
        if (r9 == 0) goto L_0x0197;
    L_0x0177:
        r9 = 2;
        goto L_0x0198;
    L_0x0179:
        r9 = "amp";
        r9 = r7.equals(r9);
        if (r9 == 0) goto L_0x0197;
    L_0x0181:
        r9 = 3;
        goto L_0x0198;
    L_0x0183:
        r9 = "lt";
        r9 = r7.equals(r9);
        if (r9 == 0) goto L_0x0197;
    L_0x018b:
        r9 = 0;
        goto L_0x0198;
    L_0x018d:
        r9 = "gt";
        r9 = r7.equals(r9);
        if (r9 == 0) goto L_0x0197;
    L_0x0195:
        r9 = 1;
        goto L_0x0198;
    L_0x0197:
        r9 = -1;
    L_0x0198:
        if (r9 == 0) goto L_0x01d0;
    L_0x019a:
        if (r9 == r13) goto L_0x01cc;
    L_0x019c:
        r11 = 2;
        if (r9 == r11) goto L_0x01c8;
    L_0x019f:
        r10 = 3;
        if (r9 == r10) goto L_0x01c4;
    L_0x01a2:
        r9 = r7.length();
        r10 = new java.lang.StringBuilder;
        r9 = r9 + 33;
        r10.<init>(r9);
        r9 = "ignoring unsupported entity: '&";
        r10.append(r9);
        r10.append(r7);
        r7 = ";'";
        r10.append(r7);
        r7 = r10.toString();
        r9 = "WebvttCueParser";
        defpackage.oyp.a(r9, r7);
        goto L_0x01d5;
    L_0x01c4:
        r3.append(r12);
        goto L_0x01d5;
    L_0x01c8:
        r3.append(r14);
        goto L_0x01d5;
    L_0x01cc:
        r3.append(r10);
        goto L_0x01d5;
    L_0x01d0:
        r7 = 60;
        r3.append(r7);
    L_0x01d5:
        if (r6 != r15) goto L_0x01dc;
    L_0x01d7:
        r7 = " ";
        r3.append(r7);
    L_0x01dc:
        r7 = r6 + 1;
        goto L_0x01e2;
    L_0x01df:
        r3.append(r9);
    L_0x01e2:
        r6 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oto.a(java.lang.String, java.lang.String, otl, java.util.List):void");
    }

    private static boolean a(String str, Matcher matcher, oza oza, otl otl, StringBuilder stringBuilder, List list) {
        String s;
        try {
            otl.a(ots.a(matcher.group(1))).b(ots.a(matcher.group(2)));
            oto.a(matcher.group(3), otl);
            stringBuilder.setLength(0);
            while (true) {
                s = oza.s();
                if (TextUtils.isEmpty(s)) {
                    oto.a(str, stringBuilder.toString(), otl, list);
                    return true;
                }
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("\n");
                }
                stringBuilder.append(s.trim());
            }
        } catch (NumberFormatException unused) {
            str = String.valueOf(matcher.group());
            s = "Skipping cue with bad header: ";
            oyp.a("WebvttCueParser", str.length() == 0 ? new String(s) : s.concat(str));
            return false;
        }
    }

    private static int a(java.lang.String r5) {
        /*
        r0 = r5.hashCode();
        r1 = 0;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        switch(r0) {
            case -1364013995: goto L_0x002a;
            case -1074341483: goto L_0x0020;
            case 100571: goto L_0x0016;
            case 109757538: goto L_0x000c;
            default: goto L_0x000b;
        };
    L_0x000b:
        goto L_0x0034;
    L_0x000c:
        r0 = "start";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x0014:
        r0 = 0;
        goto L_0x0035;
    L_0x0016:
        r0 = "end";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x001e:
        r0 = 3;
        goto L_0x0035;
    L_0x0020:
        r0 = "middle";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x0028:
        r0 = 2;
        goto L_0x0035;
    L_0x002a:
        r0 = "center";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x0032:
        r0 = 1;
        goto L_0x0035;
    L_0x0034:
        r0 = -1;
    L_0x0035:
        if (r0 == 0) goto L_0x0059;
    L_0x0037:
        if (r0 == r4) goto L_0x0058;
    L_0x0039:
        if (r0 == r3) goto L_0x0058;
    L_0x003b:
        if (r0 == r2) goto L_0x0057;
    L_0x003d:
        r0 = "Invalid anchor value: ";
        r1 = r5.length();
        if (r1 != 0) goto L_0x004b;
    L_0x0045:
        r5 = new java.lang.String;
        r5.<init>(r0);
        goto L_0x004f;
    L_0x004b:
        r5 = r0.concat(r5);
    L_0x004f:
        r0 = "WebvttCueParser";
        defpackage.oyp.a(r0, r5);
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        return r5;
    L_0x0057:
        return r3;
    L_0x0058:
        return r4;
    L_0x0059:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oto.a(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    private static void a(java.lang.String r16, defpackage.otn r17, android.text.SpannableStringBuilder r18, java.util.List r19, java.util.List r20) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = r20;
        r3 = r0.b;
        r4 = r18.length();
        r5 = r0.a;
        r6 = r5.hashCode();
        r10 = 2;
        r11 = 0;
        r12 = 1;
        if (r6 == 0) goto L_0x006d;
    L_0x0017:
        r13 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r6 == r13) goto L_0x0063;
    L_0x001b:
        r13 = 3314158; // 0x3291ee float:4.644125E-39 double:1.6374116E-317;
        if (r6 == r13) goto L_0x0059;
    L_0x0020:
        r13 = 98;
        if (r6 == r13) goto L_0x004f;
    L_0x0024:
        r13 = 99;
        if (r6 == r13) goto L_0x0045;
    L_0x0028:
        r13 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        if (r6 == r13) goto L_0x003b;
    L_0x002c:
        r13 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r6 == r13) goto L_0x0031;
    L_0x0030:
        goto L_0x0077;
    L_0x0031:
        r6 = "v";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x0039:
        r5 = 5;
        goto L_0x0078;
    L_0x003b:
        r6 = "u";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x0043:
        r5 = 2;
        goto L_0x0078;
    L_0x0045:
        r6 = "c";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x004d:
        r5 = 3;
        goto L_0x0078;
    L_0x004f:
        r6 = "b";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x0057:
        r5 = 0;
        goto L_0x0078;
    L_0x0059:
        r6 = "lang";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x0061:
        r5 = 4;
        goto L_0x0078;
    L_0x0063:
        r6 = "i";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x006b:
        r5 = 1;
        goto L_0x0078;
    L_0x006d:
        r6 = "";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0077;
    L_0x0075:
        r5 = 6;
        goto L_0x0078;
    L_0x0077:
        r5 = -1;
    L_0x0078:
        r6 = 33;
        switch(r5) {
            case 0: goto L_0x0090;
            case 1: goto L_0x0087;
            case 2: goto L_0x007e;
            case 3: goto L_0x0098;
            case 4: goto L_0x0098;
            case 5: goto L_0x0098;
            case 6: goto L_0x0098;
            default: goto L_0x007d;
        };
    L_0x007d:
        return;
    L_0x007e:
        r5 = new android.text.style.UnderlineSpan;
        r5.<init>();
        r1.setSpan(r5, r3, r4, r6);
        goto L_0x0098;
    L_0x0087:
        r5 = new android.text.style.StyleSpan;
        r5.<init>(r10);
        r1.setSpan(r5, r3, r4, r6);
        goto L_0x0098;
    L_0x0090:
        r5 = new android.text.style.StyleSpan;
        r5.<init>(r12);
        r1.setSpan(r5, r3, r4, r6);
    L_0x0098:
        r20.clear();
        r5 = r19.size();
        r13 = 0;
    L_0x00a0:
        if (r13 >= r5) goto L_0x011d;
    L_0x00a2:
        r14 = r19;
        r15 = r14.get(r13);
        r15 = (defpackage.otk) r15;
        r8 = r0.a;
        r12 = r0.d;
        r6 = r0.c;
        r9 = r15.a;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x00d9;
    L_0x00b8:
        r9 = r15.b;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x00d9;
    L_0x00c0:
        r9 = r15.c;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x00d9;
    L_0x00c8:
        r9 = r15.d;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x00d9;
    L_0x00d0:
        r6 = r8.isEmpty();
        r9 = 4;
        r10 = r16;
        r11 = r6;
        goto L_0x010b;
    L_0x00d9:
        r9 = r15.a;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = r16;
        r7 = defpackage.otk.a(r11, r9, r10, r7);
        r9 = r15.b;
        r11 = 2;
        r7 = defpackage.otk.a(r7, r9, r8, r11);
        r8 = r15.d;
        r9 = 4;
        r6 = defpackage.otk.a(r7, r8, r6, r9);
        r7 = -1;
        if (r6 == r7) goto L_0x010a;
    L_0x00f4:
        r7 = java.util.Arrays.asList(r12);
        r8 = r15.c;
        r7 = r7.containsAll(r8);
        if (r7 == 0) goto L_0x010a;
    L_0x0100:
        r7 = r15.c;
        r7 = r7.size();
        r7 = r7 << r11;
        r11 = r6 + r7;
        goto L_0x010b;
    L_0x010a:
        r11 = 0;
    L_0x010b:
        if (r11 <= 0) goto L_0x0115;
    L_0x010d:
        r6 = new otq;
        r6.<init>(r11, r15);
        r2.add(r6);
    L_0x0115:
        r13 = r13 + 1;
        r6 = 33;
        r10 = 2;
        r11 = 0;
        r12 = 1;
        goto L_0x00a0;
    L_0x011d:
        java.util.Collections.sort(r20);
        r0 = r20.size();
        r5 = 0;
    L_0x0125:
        if (r5 >= r0) goto L_0x01c9;
    L_0x0127:
        r6 = r2.get(r5);
        r6 = (defpackage.otq) r6;
        r6 = r6.a;
        if (r6 != 0) goto L_0x013a;
    L_0x0131:
        r7 = 0;
        r8 = -1;
        r9 = 33;
        r10 = 2;
        r11 = 3;
    L_0x0137:
        r12 = 1;
        goto L_0x01c5;
    L_0x013a:
        r7 = r6.a();
        r8 = -1;
        if (r7 == r8) goto L_0x0150;
    L_0x0141:
        r7 = new android.text.style.StyleSpan;
        r9 = r6.a();
        r7.<init>(r9);
        r9 = 33;
        r1.setSpan(r7, r3, r4, r9);
        goto L_0x0152;
    L_0x0150:
        r9 = 33;
    L_0x0152:
        r7 = r6.j;
        r10 = 1;
        if (r7 == r10) goto L_0x0158;
    L_0x0157:
        goto L_0x0160;
    L_0x0158:
        r7 = new android.text.style.StrikethroughSpan;
        r7.<init>();
        r1.setSpan(r7, r3, r4, r9);
    L_0x0160:
        r7 = r6.k;
        if (r7 == r10) goto L_0x0165;
    L_0x0164:
        goto L_0x016d;
    L_0x0165:
        r7 = new android.text.style.UnderlineSpan;
        r7.<init>();
        r1.setSpan(r7, r3, r4, r9);
    L_0x016d:
        r7 = r6.g;
        if (r7 != 0) goto L_0x0172;
    L_0x0171:
        goto L_0x017c;
    L_0x0172:
        r7 = new android.text.style.ForegroundColorSpan;
        r10 = r6.f;
        r7.<init>(r10);
        r1.setSpan(r7, r3, r4, r9);
    L_0x017c:
        r7 = r6.i;
        if (r7 != 0) goto L_0x0181;
    L_0x0180:
        goto L_0x018b;
    L_0x0181:
        r7 = new android.text.style.BackgroundColorSpan;
        r10 = r6.h;
        r7.<init>(r10);
        r1.setSpan(r7, r3, r4, r9);
    L_0x018b:
        r7 = r6.e;
        if (r7 != 0) goto L_0x0190;
    L_0x018f:
        goto L_0x0198;
    L_0x0190:
        r10 = new android.text.style.TypefaceSpan;
        r10.<init>(r7);
        r1.setSpan(r10, r3, r4, r9);
    L_0x0198:
        r6 = r6.n;
        r7 = 1;
        if (r6 == r7) goto L_0x01b9;
    L_0x019d:
        r7 = 0;
        r10 = 2;
        if (r6 == r10) goto L_0x01af;
    L_0x01a1:
        r11 = 3;
        if (r6 == r11) goto L_0x01a6;
    L_0x01a4:
        r7 = 0;
        goto L_0x0137;
    L_0x01a6:
        r6 = new android.text.style.RelativeSizeSpan;
        r6.<init>(r7);
        r1.setSpan(r6, r3, r4, r9);
        goto L_0x01a4;
    L_0x01af:
        r11 = 3;
        r6 = new android.text.style.RelativeSizeSpan;
        r6.<init>(r7);
        r1.setSpan(r6, r3, r4, r9);
        goto L_0x01a4;
    L_0x01b9:
        r10 = 2;
        r11 = 3;
        r6 = new android.text.style.AbsoluteSizeSpan;
        r7 = 0;
        r12 = 1;
        r6.<init>(r7, r12);
        r1.setSpan(r6, r3, r4, r9);
    L_0x01c5:
        r5 = r5 + 1;
        goto L_0x0125;
    L_0x01c9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oto.a(java.lang.String, otn, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }
}
