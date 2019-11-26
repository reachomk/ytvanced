package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: afgz */
public final class afgz {
    public static final afgt a = null;
    public static final Set b = Collections.emptySet();
    public static final Set c = Collections.emptySet();
    private static final aahn[] g = afgu.h;
    private static final aahr[] h = afgu.f;
    private static final aajq[] i = afgu.g;
    public final afgs d;
    public final xhv e;
    public final afjc f;
    private final afjv j;
    private final oux k;
    private final bcaa l;
    private final aeeu m;

    public afgz(afgs afgs, afjv afjv, xhv xhv, oux oux, afjc afjc, bcaa bcaa, aeeu aeeu) {
        this.d = (afgs) amqw.a((Object) afgs);
        this.j = (afjv) amqw.a((Object) afjv);
        this.e = (xhv) amqw.a((Object) xhv);
        this.k = (oux) amqw.a((Object) oux);
        this.f = (afjc) amqw.a((Object) afjc);
        this.l = (bcaa) amqw.a((Object) bcaa);
        this.m = aeeu;
    }

    public static boolean a(int i, int i2, int i3, int i4, float f) {
        boolean z = false;
        if (i3 <= 0 || ((float) i) * f <= ((float) i3)) {
            if (i4 > 0) {
                return ((float) i2) * f > ((float) i4) ? z : true;
            } else {
                z = true;
            }
        }
    }

    public final afgv a(aajj aajj, aajs aajs, afgt afgt, Set set, Set set2, boolean z, boolean z2, int i, String str) {
        aajs aajs2 = aajs;
        Set set3 = set;
        int i2 = i;
        if (aajs.c()) {
            aahr aahr = aajs2.q;
            if ((set3 == null || set3.contains(Integer.valueOf(aahv.at))) && aahr != null) {
                afgq afgq = new afgq(Math.min(i2, a(aajj)), 0);
                afgt afgt2 = new afgt(afgq, null);
                return new afgv(new aahr[]{aahr}, h, aahr, i, g, afgq, afgt2, this.f.a(this.e));
            }
            throw afgr.a(Collections.singletonList(aahr), set3, set2, i2, Integer.MAX_VALUE);
        }
        Set set4 = set2;
        return a(aajj, aajs2.m, afgt, set, set4, false, false, z, z2, i, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036f A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036f A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036f A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384  */
    /* JADX WARNING: Missing block: B:65:0x0147, code skipped:
            if (r9.l == false) goto L_0x0149;
     */
    /* JADX WARNING: Missing block: B:161:0x0312, code skipped:
            if (r14.isEmpty() == false) goto L_0x031d;
     */
    public final defpackage.afgv a(defpackage.aajj r32, java.util.Collection r33, defpackage.afgt r34, java.util.Set r35, java.util.Set r36, boolean r37, boolean r38, boolean r39, boolean r40, int r41, java.lang.String r42) {
        /*
        r31 = this;
        r0 = r31;
        r1 = r32;
        r2 = r33;
        r3 = r35;
        r4 = r36;
        r5 = r37;
        r6 = r41;
        r7 = r0.e;
        r7 = r7.k();
        r8 = r0.j;
        r8 = r8.get();
        r8 = (defpackage.afjs) r8;
        if (r34 != 0) goto L_0x0028;
    L_0x001e:
        r9 = r0.d;
        r10 = r42;
        r9 = r9.a(r5, r1, r10);
        r15 = r9;
        goto L_0x002a;
    L_0x0028:
        r15 = r34;
    L_0x002a:
        r9 = "video/webm";
        r9 = defpackage.afgz.a(r2, r3, r9);
        r10 = "audio/webm";
        r14 = defpackage.afgz.a(r2, r4, r10);
        r10 = r32.o();
        if (r10 == 0) goto L_0x0041;
    L_0x003c:
        r9 = new java.util.ArrayList;
        r9.<init>();
    L_0x0041:
        r13 = r9;
        r9 = defpackage.aaja.a;
        r9 = r9.get();
        r9 = (java.util.Set) r9;
        r10 = r13.iterator();
    L_0x004e:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x0068;
    L_0x0054:
        r11 = r10.next();
        r11 = (defpackage.aahr) r11;
        r11 = r11.e();
        r11 = r9.contains(r11);
        if (r11 != 0) goto L_0x004e;
    L_0x0064:
        r10.remove();
        goto L_0x004e;
    L_0x0068:
        r9 = r13.size();
        r12 = 1;
        r11 = 0;
        if (r9 != r12) goto L_0x007c;
    L_0x0070:
        r9 = r13.get(r11);
        r9 = (defpackage.aahr) r9;
        r9 = r9.w();
        if (r9 != 0) goto L_0x0083;
    L_0x007c:
        r9 = r31.a(r32);
        defpackage.afgz.a(r13, r9);
    L_0x0083:
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r5 != 0) goto L_0x009b;
    L_0x0088:
        r10 = r0.e;
        r10 = r10.d();
        if (r10 == 0) goto L_0x009b;
    L_0x0090:
        r10 = r0.f;
        r10 = r10.a(r7);
        if (r10 == r9) goto L_0x009b;
    L_0x0098:
        defpackage.afgz.a(r13, r10, r12);
    L_0x009b:
        r10 = r1.c;
        r12 = r10.a;
        r12 = r12 & 8192;
        if (r12 == 0) goto L_0x0137;
    L_0x00a3:
        r10 = r10.i;
        if (r10 != 0) goto L_0x00a9;
    L_0x00a7:
        r10 = defpackage.aosb.n;
    L_0x00a9:
        r10 = r10.m;
        if (r10 == 0) goto L_0x0137;
    L_0x00ad:
        r10 = r13.iterator();
    L_0x00b1:
        r12 = r10.hasNext();
        if (r12 == 0) goto L_0x00dd;
    L_0x00b7:
        r12 = r10.next();
        r12 = (defpackage.aahr) r12;
        r12 = r12.B();
        if (r12 == 0) goto L_0x00b1;
    L_0x00c3:
        r10 = r13.iterator();
    L_0x00c7:
        r12 = r10.hasNext();
        if (r12 == 0) goto L_0x0137;
    L_0x00cd:
        r12 = r10.next();
        r12 = (defpackage.aahr) r12;
        r12 = r12.B();
        if (r12 != 0) goto L_0x00c7;
    L_0x00d9:
        r10.remove();
        goto L_0x00c7;
    L_0x00dd:
        r10 = new java.util.HashSet;
        r10.<init>();
        r12 = r13.iterator();
    L_0x00e6:
        r16 = r12.hasNext();
        if (r16 == 0) goto L_0x0107;
    L_0x00ec:
        r16 = r12.next();
        r16 = (defpackage.aahr) r16;
        r17 = r16.A();
        if (r17 == 0) goto L_0x00e6;
    L_0x00f8:
        r16 = r16.u();
        r9 = java.lang.Integer.valueOf(r16);
        r10.add(r9);
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x00e6;
    L_0x0107:
        r9 = r10.isEmpty();
        if (r9 != 0) goto L_0x0137;
    L_0x010d:
        r9 = r13.iterator();
        r10 = java.util.Collections.min(r10);
        r10 = (java.lang.Integer) r10;
        r10 = r10.intValue();
    L_0x011b:
        r12 = r9.hasNext();
        if (r12 == 0) goto L_0x0137;
    L_0x0121:
        r12 = r9.next();
        r12 = (defpackage.aahr) r12;
        r16 = r12.A();
        if (r16 != 0) goto L_0x011b;
    L_0x012d:
        r12 = r12.u();
        if (r12 < r10) goto L_0x011b;
    L_0x0133:
        r9.remove();
        goto L_0x011b;
    L_0x0137:
        r9 = r1.c;
        r10 = r9.a;
        r10 = r10 & 8192;
        if (r10 == 0) goto L_0x0149;
    L_0x013f:
        r9 = r9.i;
        if (r9 != 0) goto L_0x0145;
    L_0x0143:
        r9 = defpackage.aosb.n;
    L_0x0145:
        r9 = r9.l;
        if (r9 != 0) goto L_0x0172;
    L_0x0149:
        r9 = new afha;
        r9.<init>(r11);
        java.util.Collections.sort(r13, r9);
        r9 = r13.iterator();
        r10 = 0;
    L_0x0156:
        r12 = r9.hasNext();
        if (r12 == 0) goto L_0x0172;
    L_0x015c:
        r12 = r9.next();
        r12 = (defpackage.aahr) r12;
        r11 = r12.u();
        if (r11 >= r10) goto L_0x016c;
    L_0x0168:
        r9.remove();
        goto L_0x0170;
    L_0x016c:
        r10 = r12.u();
    L_0x0170:
        r11 = 0;
        goto L_0x0156;
    L_0x0172:
        r9 = r0.a(r13);
        r10 = r15.b;
        r11 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r6 < r11) goto L_0x0181;
    L_0x017d:
        r20 = r9;
        r12 = r10;
        goto L_0x01b1;
    L_0x0181:
        if (r5 == 0) goto L_0x01a6;
    L_0x0183:
        r9 = new afgq;
        r11 = 0;
        r9.<init>(r6, r11);
        r9 = r0.a(r13, r9);
        r12 = r10.b;
        r12 = java.lang.Math.min(r12, r6);
        r11 = r10.c;
        r11 = java.lang.Math.min(r11, r6);
        r42 = r9;
        r9 = new afgq;
        r10 = r10.d;
        r9.<init>(r12, r11, r10);
        r10 = r9;
        r9 = r42;
        goto L_0x01ad;
    L_0x01a6:
        defpackage.afgz.a(r13, r6);
        r9 = r0.a(r13);
    L_0x01ad:
        r11 = r9.length;
        if (r11 == 0) goto L_0x03f4;
    L_0x01b0:
        goto L_0x017d;
    L_0x01b1:
        if (r5 != 0) goto L_0x01b8;
    L_0x01b3:
        r9 = r32.q();
        goto L_0x01bd;
    L_0x01b8:
        r9 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x01bd:
        r17 = r9;
        r11 = new afhb;
        r10 = r0.k;
        r9 = r0.m;
        r42 = r12;
        r12 = r15.d;
        if (r5 != 0) goto L_0x01e5;
    L_0x01cb:
        r19 = r9;
        r9 = r1.c;
        r21 = r13;
        r13 = r9.a;
        r13 = r13 & 8192;
        if (r13 != 0) goto L_0x01d8;
    L_0x01d7:
        goto L_0x01e9;
    L_0x01d8:
        r9 = r9.i;
        if (r9 != 0) goto L_0x01de;
    L_0x01dc:
        r9 = defpackage.aosb.n;
    L_0x01de:
        r9 = r9.b;
        if (r9 != 0) goto L_0x01e3;
    L_0x01e2:
        goto L_0x01d7;
    L_0x01e3:
        r13 = 1;
        goto L_0x01ea;
    L_0x01e5:
        r19 = r9;
        r21 = r13;
    L_0x01e9:
        r13 = 0;
    L_0x01ea:
        if (r5 != 0) goto L_0x01f6;
    L_0x01ec:
        r9 = r32.f();
        if (r9 != 0) goto L_0x01f3;
    L_0x01f2:
        goto L_0x01f6;
    L_0x01f3:
        r22 = 1;
        goto L_0x01f8;
    L_0x01f6:
        r22 = 0;
    L_0x01f8:
        r9 = r1.c;
        r23 = r14;
        r14 = r9.a;
        r14 = r14 & 2;
        if (r14 == 0) goto L_0x0219;
    L_0x0202:
        r9 = r9.d;
        if (r9 == 0) goto L_0x0207;
    L_0x0206:
        goto L_0x0209;
    L_0x0207:
        r9 = defpackage.arhh.bv;
    L_0x0209:
        r14 = new anyc;
        r9 = r9.P;
        r24 = r15;
        r15 = defpackage.arhh.Q;
        r14.<init>(r9, r15);
        r9 = defpackage.aajj.a(r14);
        goto L_0x021f;
    L_0x0219:
        r24 = r15;
        r9 = java.util.Collections.emptyList();
    L_0x021f:
        r14 = r1.c;
        r15 = r14.a;
        r15 = r15 & 2;
        r25 = 0;
        if (r15 == 0) goto L_0x0233;
    L_0x0229:
        r14 = r14.d;
        if (r14 != 0) goto L_0x022f;
    L_0x022d:
        r14 = defpackage.arhh.bv;
    L_0x022f:
        r14 = r14.W;
        r14 = (long) r14;
        goto L_0x0235;
    L_0x0233:
        r14 = r25;
    L_0x0235:
        r2 = r0.k;
        r27 = r2.a();
        r2 = java.lang.Integer.valueOf(r7);
        r2 = r9.contains(r2);
        r9 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1));
        if (r9 <= 0) goto L_0x0252;
    L_0x0247:
        r9 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1));
        if (r9 > 0) goto L_0x0252;
    L_0x024b:
        r9 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1));
        if (r9 > 0) goto L_0x0250;
    L_0x024f:
        goto L_0x0252;
    L_0x0250:
        r9 = 1;
        goto L_0x0253;
    L_0x0252:
        r9 = 0;
    L_0x0253:
        if (r2 == 0) goto L_0x0257;
    L_0x0255:
        r15 = 1;
        goto L_0x025b;
    L_0x0257:
        if (r9 == 0) goto L_0x025a;
    L_0x0259:
        goto L_0x0255;
    L_0x025a:
        r15 = 0;
    L_0x025b:
        r2 = r1.c;
        r9 = r2.a;
        r9 = r9 & 2;
        if (r9 == 0) goto L_0x0273;
    L_0x0263:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0269;
    L_0x0267:
        r2 = defpackage.arhh.bv;
    L_0x0269:
        r2 = r2.aM;
        if (r2 != 0) goto L_0x026e;
    L_0x026d:
        goto L_0x0273;
    L_0x026e:
        r2 = r19;
        r19 = 1;
        goto L_0x0277;
    L_0x0273:
        r2 = r19;
        r19 = 0;
    L_0x0277:
        r9 = r11;
        r14 = r11;
        r1 = 0;
        r11 = r2;
        r2 = r42;
        r29 = r21;
        r1 = r14;
        r30 = r23;
        r14 = r22;
        r3 = r24;
        r16 = r17;
        r18 = r19;
        r19 = r8;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18, r19);
        r9 = 0;
        r1.a = r9;
        r10 = r29;
        java.util.Collections.sort(r10, r1);
        r11 = r30;
        java.util.Collections.sort(r11, r1);
        r12 = r10.isEmpty();
        if (r12 != 0) goto L_0x02a9;
    L_0x02a2:
        r12 = r10.get(r9);
        r12 = (defpackage.aahr) r12;
        goto L_0x02aa;
    L_0x02a9:
        r12 = 0;
    L_0x02aa:
        if (r5 != 0) goto L_0x02b1;
    L_0x02ac:
        r5 = r2.a(r10);
        goto L_0x02b2;
    L_0x02b1:
        r5 = r10;
    L_0x02b2:
        r9 = r3.c;
        r9 = r9.a(r11);
        r10 = defpackage.afgz.b(r9);
        if (r38 != 0) goto L_0x0317;
    L_0x02be:
        r11 = r3.e;
        r13 = android.text.TextUtils.isEmpty(r11);
        r14 = new java.util.ArrayList;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r16 = r9.iterator();
    L_0x02d2:
        r17 = r16.hasNext();
        if (r17 == 0) goto L_0x0304;
    L_0x02d8:
        r17 = r16.next();
        r34 = r9;
        r9 = r17;
        r9 = (defpackage.aahr) r9;
        r17 = r9.j();
        if (r17 == 0) goto L_0x02eb;
    L_0x02e8:
        r14.add(r9);
    L_0x02eb:
        if (r13 != 0) goto L_0x0301;
    L_0x02ed:
        r42 = r12;
        r12 = r9.k();
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x02fc;
    L_0x02f9:
        r15.add(r9);
    L_0x02fc:
        r9 = r34;
        r12 = r42;
        goto L_0x02d2;
    L_0x0301:
        r9 = r34;
        goto L_0x02d2;
    L_0x0304:
        r34 = r9;
        r42 = r12;
        r9 = r15.isEmpty();
        if (r9 == 0) goto L_0x0315;
    L_0x030e:
        r9 = r14.isEmpty();
        if (r9 != 0) goto L_0x031b;
    L_0x0314:
        goto L_0x031d;
    L_0x0315:
        r14 = r15;
        goto L_0x031d;
    L_0x0317:
        r34 = r9;
        r42 = r12;
    L_0x031b:
        r14 = r34;
    L_0x031d:
        r9 = r5.isEmpty();
        if (r9 == 0) goto L_0x0329;
    L_0x0323:
        r9 = r14.isEmpty();
        if (r9 != 0) goto L_0x03e5;
    L_0x0329:
        r9 = r5.isEmpty();
        if (r9 != 0) goto L_0x0330;
    L_0x032f:
        goto L_0x0332;
    L_0x0330:
        if (r39 != 0) goto L_0x03e5;
    L_0x0332:
        r9 = r14.isEmpty();
        if (r9 == 0) goto L_0x033a;
    L_0x0338:
        if (r40 != 0) goto L_0x03e5;
    L_0x033a:
        r4 = 1;
        r1.a = r4;
        java.util.Collections.sort(r14, r1);
        r4 = new java.util.HashSet;
        r4.<init>();
        r6 = r14.iterator();
    L_0x0349:
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x0367;
    L_0x034f:
        r9 = r6.next();
        r9 = (defpackage.aahr) r9;
        r9 = r9.k();
        r11 = r4.contains(r9);
        if (r11 == 0) goto L_0x0363;
    L_0x035f:
        r6.remove();
        goto L_0x0349;
    L_0x0363:
        r4.add(r9);
        goto L_0x0349;
    L_0x0367:
        r4 = r14.isEmpty();
        if (r4 == 0) goto L_0x036f;
    L_0x036d:
        r4 = 0;
        goto L_0x037a;
    L_0x036f:
        if (r40 == 0) goto L_0x036d;
    L_0x0371:
        r4 = 0;
        r4 = r14.get(r4);
        r4 = (defpackage.aahr) r4;
        r4 = r4.f;
    L_0x037a:
        r11 = (long) r4;
        r1.b = r11;
        java.util.Collections.sort(r5, r1);
        r1 = r8.b;
        if (r1 <= 0) goto L_0x03ad;
    L_0x0384:
        r6 = r8.c;
        if (r6 <= 0) goto L_0x03ad;
    L_0x0388:
        r8 = r0.e;
        r9 = r32.ao();
        r11 = r0.f;
        r11 = r11.a(r7);
        r33 = r5;
        r34 = r2;
        r35 = r8;
        r36 = r32;
        r37 = r4;
        r38 = r1;
        r39 = r6;
        r40 = r9;
        r41 = r11;
        r42 = r7;
        r1 = defpackage.afgz.a(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42);
        goto L_0x03af;
    L_0x03ad:
        r1 = r42;
    L_0x03af:
        r4 = new afgv;
        r6 = r5.size();
        r6 = new defpackage.aahr[r6];
        r5 = r5.toArray(r6);
        r5 = (defpackage.aahr[]) r5;
        r6 = r14.size();
        r6 = new defpackage.aahr[r6];
        r6 = r14.toArray(r6);
        r6 = (defpackage.aahr[]) r6;
        r8 = r0.f;
        r7 = r8.a(r7);
        r32 = r4;
        r33 = r5;
        r34 = r6;
        r35 = r1;
        r36 = r20;
        r37 = r10;
        r38 = r2;
        r39 = r3;
        r40 = r7;
        r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40);
        return r4;
    L_0x03e5:
        r1 = r0.f;
        r1 = r1.a(r7);
        r2 = r33;
        r3 = r35;
        r1 = defpackage.afgr.a(r2, r3, r4, r6, r1);
        throw r1;
    L_0x03f4:
        r1 = r0.f;
        r1 = r1.a(r7);
        r1 = defpackage.afgr.a(r2, r3, r4, r6, r1);
        goto L_0x0400;
    L_0x03ff:
        throw r1;
    L_0x0400:
        goto L_0x03ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgz.a(aajj, java.util.Collection, afgt, java.util.Set, java.util.Set, boolean, boolean, boolean, boolean, int, java.lang.String):afgv");
    }

    public final aajq[] a(List list) {
        return a(list, null);
    }

    private final aajq[] a(List list, afgq afgq) {
        int u;
        HashMap hashMap = new HashMap();
        for (aahr aahr : list) {
            u = aahr.u();
            String h = aahr.h();
            if (!(u == -1 || TextUtils.isEmpty(h))) {
                if ((afgq == null || afgq.a(u) == 0) && (!hashMap.containsKey(h) || aahr.w())) {
                    hashMap.put(h, aahr);
                }
            }
        }
        aajq[] aajqArr = new aajq[hashMap.size()];
        int i = 0;
        for (Entry value : hashMap.entrySet()) {
            u = i + 1;
            aajqArr[i] = new aajq((aahr) value.getValue());
            i = u;
        }
        arvt b = this.f.d.b();
        Comparator comparator = null;
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            aorz aorz = auuo.i;
            if (aorz == null) {
                aorz = aorz.j;
            }
            if (aorz.f) {
                comparator = Collections.reverseOrder();
            }
        }
        Arrays.sort(aajqArr, comparator);
        return aajqArr;
    }

    public static aahn[] b(List list) {
        HashMap hashMap = new HashMap();
        for (aahr aahr : list) {
            String k = aahr.k();
            String l = aahr.l();
            if (!(TextUtils.isEmpty(k) || TextUtils.isEmpty(l) || hashMap.containsKey(k))) {
                hashMap.put(k, new aahn(k, l));
            }
        }
        aahn[] aahnArr = (aahn[]) hashMap.values().toArray(new aahn[hashMap.size()]);
        Arrays.sort(aahnArr);
        return aahnArr;
    }

    public static List a(Collection collection, Set set, @Deprecated String str) {
        if (set == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        if (!set.isEmpty()) {
            for (aahr aahr : collection) {
                if (set.contains(Integer.valueOf(aahr.b()))) {
                    arrayList.add(aahr);
                }
            }
            if (arrayList.isEmpty()) {
                for (aahr aahr2 : collection) {
                    if (str.equals(aahr2.e())) {
                        arrayList.add(aahr2);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void a(List list, int i) {
        afgz.a(list, i, false);
    }

    private static void a(List list, int i, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aahr aahr = (aahr) it.next();
            if (!z || !aahr.w()) {
                int u = aahr.u();
                if (u == -1 || u > i) {
                    it.remove();
                }
            }
        }
    }

    private final int a(aajj aajj) {
        return !this.f.n() ? Math.max(((Integer) this.l.get()).intValue(), aajj.p()) : Integer.MAX_VALUE;
    }

    public static aahr a(List list, afgq afgq, xhv xhv, aajj aajj, int i, int i2, int i3, float f, int i4, int i5) {
        afgq afgq2 = afgq;
        int i6 = i2;
        int i7 = i3;
        float f2 = f;
        if (list.isEmpty()) {
            return null;
        }
        int length;
        int i8;
        int i9;
        List list2 = list;
        aahr[] aahrArr = (aahr[]) list.toArray(new aahr[list.size()]);
        byte b = (byte) 0;
        Arrays.sort(aahrArr, new afgy());
        int b2 = afgz.b(afgq2, i6, i7, f2, false);
        byte length2 = aahrArr.length - 1;
        byte b3 = (byte) 0;
        while (true) {
            length = aahrArr.length;
            if (b3 < length) {
                if (aahrArr[b3].g() <= b2) {
                    length2 = b3;
                    break;
                }
                b3++;
            } else {
                break;
            }
        }
        b2 = afgz.a(afgq2, i6, i7, f2, false);
        while (true) {
            byte length3 = length3 - 1;
            if (length3 >= 0) {
                if (aahrArr[length3].g() >= b2) {
                    b = length3;
                    break;
                }
            } else {
                break;
            }
        }
        if (length2 > b) {
            i8 = length2;
            i9 = i8;
        } else {
            i9 = b;
            i8 = length2;
        }
        while (i8 <= i9) {
            aahr aahr = aahrArr[i8];
            if (!afgz.a(aahr.f(), aahr.g(), i6, i7, f2) || !afgz.a((long) aahr.f, afgq, aajj, false, i, i5)) {
                xhv xhv2 = xhv;
                int i10 = i4;
            } else if (!afgz.a(aahr.g(), xhv, i4)) {
                return aahr;
            }
            i8++;
        }
        return aahrArr[i9];
    }

    public static int a(afgq afgq, int i, int i2, float f, boolean z) {
        int i3 = afgq.c;
        if (!z) {
            return i3;
        }
        i = (int) (((float) aahr.a(i, i2)) / f);
        return aahr.a(i) ? Math.max(i, i3) : i3;
    }

    public static int b(afgq afgq, int i, int i2, float f, boolean z) {
        int i3 = afgq.b;
        if (!z) {
            return i3;
        }
        i = (int) (((float) aahr.a(i, i2)) / f);
        return aahr.a(i) ? Math.min(i, i3) : i3;
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            if (r3.f != false) goto L_0x0043;
     */
    public static boolean a(long r1, defpackage.afgq r3, defpackage.aajj r4, boolean r5, int r6, int r7) {
        /*
        r0 = r3.a();
        if (r0 != 0) goto L_0x0043;
    L_0x0006:
        r0 = r3.b();
        if (r0 != 0) goto L_0x0043;
    L_0x000c:
        r3 = r3.c();
        if (r3 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0026;
    L_0x0013:
        r3 = r4.c;
        r0 = r3.b;
        r0 = r0 & 1024;
        if (r0 == 0) goto L_0x0026;
    L_0x001b:
        r3 = r3.B;
        if (r3 != 0) goto L_0x0021;
    L_0x001f:
        r3 = defpackage.axur.g;
    L_0x0021:
        r3 = r3.f;
        if (r3 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0043;
    L_0x0026:
        if (r5 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0043;
    L_0x0029:
        r3 = r4.r();
        r5 = java.lang.Integer.valueOf(r7);
        r3 = r3.contains(r5);
        if (r3 == 0) goto L_0x0043;
    L_0x0037:
        r5 = (long) r6;
        r1 = r1 + r5;
        r3 = r4.q();
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0043;
    L_0x0041:
        r1 = 0;
        return r1;
    L_0x0043:
        r1 = 1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgz.a(long, afgq, aajj, boolean, int, int):boolean");
    }

    public static boolean a(int i, xhv xhv, int i2) {
        return i > i2 && xhv.d();
    }
}
