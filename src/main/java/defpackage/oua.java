package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oua */
public final class oua extends oui {
    private static final int[] c = new int[0];
    private final ouo d;
    private final AtomicReference e;

    public oua() {
        this(new otv());
    }

    public static int a(int i, int i2) {
        int i3 = -1;
        if (i != -1) {
            if (i2 != -1) {
                return i - i2;
            }
            i3 = 1;
        } else if (i2 == -1) {
            return 0;
        }
        return i3;
    }

    protected static boolean a(int i, boolean z) {
        i &= 7;
        boolean z2 = true;
        if (i != 4) {
            if (z) {
                return i == 3 ? z2 : false;
            } else {
                z2 = false;
            }
        }
    }

    public static int b(int i, int i2) {
        if (i > i2) {
            i = 1;
        } else if (i2 > i) {
            return -1;
        } else {
            i = 0;
        }
        return i;
    }

    @Deprecated
    public oua(oux oux) {
        this(new otv(oux));
    }

    private oua(ouo ouo) {
        this.d = ouo;
        this.e = new AtomicReference(oub.a);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05c5 A:{LOOP_END, LOOP:16: B:249:0x046b->B:292:0x05c5} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x05bf A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03af  */
    public final android.util.Pair a(defpackage.ouh r38, int[][][] r39, int[] r40) {
        /*
        r37 = this;
        r0 = r37;
        r1 = r38;
        r2 = r0.e;
        r2 = r2.get();
        r2 = (defpackage.oub) r2;
        r3 = r1.a;
        r4 = new defpackage.oul[r3];
        r6 = 0;
        r7 = 0;
        r8 = 0;
    L_0x0013:
        r9 = 2;
        r12 = 1;
        if (r6 < r3) goto L_0x041c;
    L_0x0017:
        r6 = 0;
        r7 = 0;
        r13 = -1;
        r14 = 0;
    L_0x001b:
        if (r6 < r3) goto L_0x028c;
    L_0x001d:
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 0;
        r8 = -1;
        r13 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0023:
        if (r6 >= r3) goto L_0x0192;
    L_0x0025:
        r14 = r1.a(r6);
        if (r14 == r12) goto L_0x018a;
    L_0x002b:
        if (r14 == r9) goto L_0x018a;
    L_0x002d:
        r15 = 3;
        if (r14 == r15) goto L_0x00a6;
    L_0x0030:
        r14 = r1.b(r6);
        r15 = r39[r6];
        r9 = 0;
        r11 = 0;
        r18 = 0;
        r19 = 0;
    L_0x003c:
        r10 = r14.b;
        if (r11 >= r10) goto L_0x0093;
    L_0x0040:
        r10 = r14.a(r11);
        r21 = r15[r11];
        r22 = r19;
        r19 = r9;
        r9 = 0;
    L_0x004b:
        r5 = r10.a;
        if (r9 < r5) goto L_0x0056;
    L_0x004f:
        r11 = r11 + 1;
        r9 = r19;
        r19 = r22;
        goto L_0x003c;
    L_0x0056:
        r5 = r21[r9];
        r12 = r2.s;
        r5 = defpackage.oua.a(r5, r12);
        if (r5 == 0) goto L_0x0087;
    L_0x0060:
        r5 = r10.a(r9);
        r5 = r5.c;
        r12 = 1;
        r5 = r5 & r12;
        if (r5 != 0) goto L_0x006c;
    L_0x006a:
        r5 = 1;
        goto L_0x006d;
    L_0x006c:
        r5 = 2;
    L_0x006d:
        r12 = r21[r9];
        r40 = r10;
        r10 = 0;
        r12 = defpackage.oua.a(r12, r10);
        if (r12 == 0) goto L_0x007a;
    L_0x0078:
        r5 = r5 + 1000;
    L_0x007a:
        r10 = r5;
        r5 = r22;
        if (r10 > r5) goto L_0x0080;
    L_0x007f:
        goto L_0x008b;
    L_0x0080:
        r19 = r40;
        r18 = r9;
        r22 = r10;
        goto L_0x008d;
    L_0x0087:
        r40 = r10;
        r5 = r22;
    L_0x008b:
        r22 = r5;
    L_0x008d:
        r9 = r9 + 1;
        r10 = r40;
        r12 = 1;
        goto L_0x004b;
    L_0x0093:
        if (r9 == 0) goto L_0x00a1;
    L_0x0095:
        r11 = new oul;
        r5 = 1;
        r10 = new int[r5];
        r5 = 0;
        r10[r5] = r18;
        r11.<init>(r9, r10);
        goto L_0x00a2;
    L_0x00a1:
        r11 = 0;
    L_0x00a2:
        r4[r6] = r11;
        goto L_0x018a;
    L_0x00a6:
        r5 = r1.b(r6);
        r9 = r39[r6];
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r14 = 0;
    L_0x00b0:
        r15 = r5.b;
        if (r10 >= r15) goto L_0x0150;
    L_0x00b4:
        r15 = r5.a(r10);
        r18 = r9[r10];
        r21 = r5;
        r19 = r11;
        r11 = 0;
    L_0x00bf:
        r5 = r15.a;
        if (r11 < r5) goto L_0x00ca;
    L_0x00c3:
        r10 = r10 + 1;
        r11 = r19;
        r5 = r21;
        goto L_0x00b0;
    L_0x00ca:
        r5 = r18[r11];
        r22 = r9;
        r9 = r2.s;
        r5 = defpackage.oua.a(r5, r9);
        if (r5 == 0) goto L_0x013c;
    L_0x00d6:
        r5 = r15.a(r11);
        r9 = r5.c;
        r25 = r10;
        r10 = r2.z;
        r20 = -1;
        r10 = r10 ^ -1;
        r9 = r9 & r10;
        r10 = r9 & 1;
        r17 = 2;
        r9 = r9 & 2;
        r26 = r12;
        r12 = r2.x;
        r12 = defpackage.oua.a(r5, r12);
        r27 = r15;
        r15 = r5.A;
        r15 = defpackage.oua.a(r15);
        if (r12 <= 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x0105;
    L_0x00fe:
        r1 = r2.y;
        if (r1 == 0) goto L_0x0112;
    L_0x0102:
        if (r15 != 0) goto L_0x0105;
    L_0x0104:
        goto L_0x0112;
    L_0x0105:
        if (r10 != 0) goto L_0x010d;
    L_0x0107:
        if (r9 != 0) goto L_0x010b;
    L_0x0109:
        r15 = 7;
        goto L_0x010f;
    L_0x010b:
        r15 = 3;
        goto L_0x010f;
    L_0x010d:
        r15 = 11;
    L_0x010f:
        r9 = r15 + r12;
        goto L_0x0129;
    L_0x0112:
        if (r10 != 0) goto L_0x0128;
    L_0x0114:
        if (r9 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0142;
    L_0x0117:
        r1 = defpackage.oua.a(r5, r7);
        if (r1 > 0) goto L_0x0126;
    L_0x011d:
        if (r15 == 0) goto L_0x0142;
    L_0x011f:
        r1 = defpackage.oua.a(r7);
        if (r1 != 0) goto L_0x0126;
    L_0x0125:
        goto L_0x0142;
    L_0x0126:
        r9 = 1;
        goto L_0x0129;
    L_0x0128:
        r9 = 2;
    L_0x0129:
        r1 = r18[r11];
        r5 = 0;
        r1 = defpackage.oua.a(r1, r5);
        if (r1 == 0) goto L_0x0134;
    L_0x0132:
        r9 = r9 + 1000;
    L_0x0134:
        if (r9 > r14) goto L_0x0137;
    L_0x0136:
        goto L_0x0142;
    L_0x0137:
        r14 = r9;
        r12 = r11;
        r19 = r27;
        goto L_0x0144;
    L_0x013c:
        r25 = r10;
        r26 = r12;
        r27 = r15;
    L_0x0142:
        r12 = r26;
    L_0x0144:
        r11 = r11 + 1;
        r1 = r38;
        r9 = r22;
        r10 = r25;
        r15 = r27;
        goto L_0x00bf;
    L_0x0150:
        if (r11 == 0) goto L_0x0166;
    L_0x0152:
        r1 = new oul;
        r5 = 1;
        r9 = new int[r5];
        r5 = 0;
        r9[r5] = r12;
        r1.<init>(r11, r9);
        r5 = java.lang.Integer.valueOf(r14);
        r11 = android.util.Pair.create(r1, r5);
        goto L_0x0167;
    L_0x0166:
        r11 = 0;
    L_0x0167:
        if (r11 != 0) goto L_0x016a;
    L_0x0169:
        goto L_0x018a;
    L_0x016a:
        r1 = r11.second;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r1 <= r13) goto L_0x018a;
    L_0x0174:
        r1 = -1;
        if (r8 == r1) goto L_0x017a;
    L_0x0177:
        r1 = 0;
        r4[r8] = r1;
    L_0x017a:
        r1 = r11.first;
        r1 = (defpackage.oul) r1;
        r4[r6] = r1;
        r1 = r11.second;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r13 = r1;
        r8 = r6;
    L_0x018a:
        r6 = r6 + 1;
        r1 = r38;
        r9 = 2;
        r12 = 1;
        goto L_0x0023;
    L_0x0192:
        r1 = 0;
    L_0x0193:
        if (r1 < r3) goto L_0x023a;
    L_0x0195:
        r1 = r0.d;
        r5 = r0.b;
        r5 = defpackage.oxz.a(r5);
        r5 = (defpackage.oux) r5;
        r1 = r1.a(r4, r5);
        r4 = new defpackage.oan[r3];
        r5 = 0;
    L_0x01a6:
        if (r5 >= r3) goto L_0x01c6;
    L_0x01a8:
        r6 = r2.a(r5);
        if (r6 != 0) goto L_0x01be;
    L_0x01ae:
        r9 = r38;
        r6 = r9.a(r5);
        r7 = 6;
        if (r6 == r7) goto L_0x01bb;
    L_0x01b7:
        r6 = r1[r5];
        if (r6 == 0) goto L_0x01c0;
    L_0x01bb:
        r11 = defpackage.oan.a;
        goto L_0x01c1;
    L_0x01be:
        r9 = r38;
    L_0x01c0:
        r11 = 0;
    L_0x01c1:
        r4[r5] = r11;
        r5 = r5 + 1;
        goto L_0x01a6;
    L_0x01c6:
        r9 = r38;
        r2 = r2.t;
        if (r2 == 0) goto L_0x0235;
    L_0x01cc:
        r3 = 0;
        r5 = -1;
        r6 = -1;
    L_0x01cf:
        r7 = r9.a;
        if (r3 >= r7) goto L_0x021c;
    L_0x01d3:
        r7 = r9.a(r3);
        r8 = r1[r3];
        r10 = 1;
        if (r7 == r10) goto L_0x01e0;
    L_0x01dc:
        r10 = 2;
        if (r7 == r10) goto L_0x01e0;
    L_0x01df:
        goto L_0x0208;
    L_0x01e0:
        if (r8 != 0) goto L_0x01e3;
    L_0x01e2:
        goto L_0x0208;
    L_0x01e3:
        r10 = r39[r3];
        r11 = r9.b(r3);
        r12 = r8.f();
        r11 = r11.a(r12);
        r12 = 0;
    L_0x01f2:
        r13 = r8.g();
        if (r12 >= r13) goto L_0x020a;
    L_0x01f8:
        r13 = r10[r11];
        r14 = r8.b(r12);
        r13 = r13[r14];
        r14 = 32;
        r13 = r13 & r14;
        if (r13 != r14) goto L_0x0208;
    L_0x0205:
        r12 = r12 + 1;
        goto L_0x01f2;
    L_0x0208:
        r7 = -1;
        goto L_0x0217;
    L_0x020a:
        r8 = 1;
        if (r7 != r8) goto L_0x0213;
    L_0x020d:
        r7 = -1;
        if (r6 == r7) goto L_0x0211;
    L_0x0210:
        goto L_0x021a;
    L_0x0211:
        r6 = r3;
        goto L_0x0217;
    L_0x0213:
        r7 = -1;
        if (r5 != r7) goto L_0x021a;
    L_0x0216:
        r5 = r3;
    L_0x0217:
        r3 = r3 + 1;
        goto L_0x01cf;
    L_0x021a:
        r3 = 0;
        goto L_0x021e;
    L_0x021c:
        r7 = -1;
        r3 = 1;
    L_0x021e:
        if (r6 != r7) goto L_0x0223;
    L_0x0220:
        r23 = 0;
        goto L_0x0228;
    L_0x0223:
        if (r5 != r7) goto L_0x0226;
    L_0x0225:
        goto L_0x0220;
    L_0x0226:
        r23 = 1;
    L_0x0228:
        r3 = r3 & r23;
        if (r3 == 0) goto L_0x0235;
    L_0x022c:
        r3 = new oan;
        r3.<init>(r2);
        r4[r6] = r3;
        r4[r5] = r3;
    L_0x0235:
        r1 = android.util.Pair.create(r4, r1);
        return r1;
    L_0x023a:
        r9 = r38;
        r5 = r2.a(r1);
        if (r5 == 0) goto L_0x0246;
    L_0x0242:
        r5 = 0;
        r4[r1] = r5;
        goto L_0x0288;
    L_0x0246:
        r5 = r9.b(r1);
        r6 = r2.u;
        r6 = r6.get(r1);
        r6 = (java.util.Map) r6;
        if (r6 == 0) goto L_0x0288;
    L_0x0254:
        r6 = r6.containsKey(r5);
        if (r6 == 0) goto L_0x0288;
    L_0x025a:
        r6 = r2.u;
        r6 = r6.get(r1);
        r6 = (java.util.Map) r6;
        if (r6 == 0) goto L_0x026c;
    L_0x0264:
        r6 = r6.get(r5);
        r11 = r6;
        r11 = (defpackage.oud) r11;
        goto L_0x026d;
    L_0x026c:
        r11 = 0;
    L_0x026d:
        if (r11 == 0) goto L_0x0285;
    L_0x026f:
        r6 = new oul;
        r7 = r11.a;
        r5 = r5.a(r7);
        r7 = r11.b;
        r8 = r11.c;
        r10 = r11.d;
        r10 = java.lang.Integer.valueOf(r10);
        r6.<init>(r5, r7, r8, r10);
        goto L_0x0286;
    L_0x0285:
        r6 = 0;
    L_0x0286:
        r4[r1] = r6;
    L_0x0288:
        r1 = r1 + 1;
        goto L_0x0193;
    L_0x028c:
        r9 = r1;
        r1 = r9.a(r6);
        r5 = 1;
        if (r1 != r5) goto L_0x03ff;
    L_0x0294:
        r1 = r8 ^ 1;
        r5 = r9.b(r6);
        r10 = r39[r6];
        r11 = 0;
        r12 = -1;
        r15 = 0;
        r18 = -1;
    L_0x02a1:
        r0 = r5.b;
        if (r11 >= r0) goto L_0x02fa;
    L_0x02a5:
        r0 = r5.a(r11);
        r19 = r10[r11];
        r21 = r3;
        r22 = r7;
        r3 = r15;
        r15 = r12;
        r12 = 0;
    L_0x02b2:
        r7 = r0.a;
        if (r12 < r7) goto L_0x02bf;
    L_0x02b6:
        r11 = r11 + 1;
        r12 = r15;
        r7 = r22;
        r15 = r3;
        r3 = r21;
        goto L_0x02a1;
    L_0x02bf:
        r7 = r19[r12];
        r25 = r11;
        r11 = r2.s;
        r7 = defpackage.oua.a(r7, r11);
        if (r7 == 0) goto L_0x02f1;
    L_0x02cb:
        r7 = r0.a(r12);
        r11 = new ouc;
        r40 = r0;
        r0 = r19[r12];
        r11.<init>(r7, r2, r0);
        r0 = r11.a;
        if (r0 != 0) goto L_0x02e1;
    L_0x02dc:
        r0 = r2.n;
        if (r0 != 0) goto L_0x02e1;
    L_0x02e0:
        goto L_0x02f3;
    L_0x02e1:
        if (r3 != 0) goto L_0x02e4;
    L_0x02e3:
        goto L_0x02eb;
    L_0x02e4:
        r0 = r11.compareTo(r3);
        if (r0 > 0) goto L_0x02eb;
    L_0x02ea:
        goto L_0x02f3;
    L_0x02eb:
        r3 = r11;
        r18 = r12;
        r15 = r25;
        goto L_0x02f3;
    L_0x02f1:
        r40 = r0;
    L_0x02f3:
        r12 = r12 + 1;
        r0 = r40;
        r11 = r25;
        goto L_0x02b2;
    L_0x02fa:
        r21 = r3;
        r22 = r7;
        r0 = -1;
        if (r12 == r0) goto L_0x03c5;
    L_0x0301:
        r0 = r5.a(r12);
        r3 = r2.r;
        if (r3 != 0) goto L_0x03a6;
    L_0x0309:
        r3 = r2.q;
        if (r3 == 0) goto L_0x030f;
    L_0x030d:
        goto L_0x03a6;
    L_0x030f:
        if (r1 != 0) goto L_0x0313;
    L_0x0311:
        goto L_0x03a6;
    L_0x0313:
        r1 = r10[r12];
        r3 = r2.o;
        r5 = r2.p;
        r7 = new java.util.HashSet;
        r7.<init>();
        r19 = r8;
        r10 = 0;
        r11 = 0;
        r12 = 0;
    L_0x0323:
        r8 = r0.a;
        if (r10 >= r8) goto L_0x0370;
    L_0x0327:
        r8 = r0.a(r10);
        r25 = r2;
        r2 = new otz;
        r9 = r8.v;
        r26 = r6;
        r6 = r8.w;
        r8 = r8.i;
        r2.<init>(r9, r6, r8);
        r6 = r7.add(r2);
        if (r6 == 0) goto L_0x0363;
    L_0x0340:
        r6 = 0;
        r8 = 0;
    L_0x0342:
        r9 = r0.a;
        if (r6 < r9) goto L_0x034e;
    L_0x0346:
        if (r8 > r11) goto L_0x0349;
    L_0x0348:
        goto L_0x0363;
    L_0x0349:
        r12 = r2;
        r40 = r7;
        r11 = r8;
        goto L_0x0365;
    L_0x034e:
        r9 = r0.a(r6);
        r40 = r7;
        r7 = r1[r6];
        r7 = defpackage.oua.a(r9, r7, r2, r3, r5);
        if (r7 == 0) goto L_0x035e;
    L_0x035c:
        r8 = r8 + 1;
    L_0x035e:
        r6 = r6 + 1;
        r7 = r40;
        goto L_0x0342;
    L_0x0363:
        r40 = r7;
    L_0x0365:
        r10 = r10 + 1;
        r9 = r38;
        r7 = r40;
        r2 = r25;
        r6 = r26;
        goto L_0x0323;
    L_0x0370:
        r25 = r2;
        r26 = r6;
        r2 = 1;
        if (r11 > r2) goto L_0x037a;
    L_0x0377:
        r1 = c;
        goto L_0x039d;
    L_0x037a:
        r2 = new int[r11];
        r6 = 0;
        r7 = 0;
    L_0x037e:
        r8 = r0.a;
        if (r6 >= r8) goto L_0x039c;
    L_0x0382:
        r8 = r0.a(r6);
        r9 = r1[r6];
        r10 = defpackage.oxz.a(r12);
        r10 = (defpackage.otz) r10;
        r8 = defpackage.oua.a(r8, r9, r10, r3, r5);
        if (r8 == 0) goto L_0x0399;
    L_0x0394:
        r8 = r7 + 1;
        r2[r7] = r6;
        r7 = r8;
    L_0x0399:
        r6 = r6 + 1;
        goto L_0x037e;
    L_0x039c:
        r1 = r2;
    L_0x039d:
        r2 = r1.length;
        if (r2 <= 0) goto L_0x03ac;
    L_0x03a0:
        r11 = new oul;
        r11.<init>(r0, r1);
        goto L_0x03ad;
    L_0x03a6:
        r25 = r2;
        r26 = r6;
        r19 = r8;
    L_0x03ac:
        r11 = 0;
    L_0x03ad:
        if (r11 != 0) goto L_0x03ba;
    L_0x03af:
        r11 = new oul;
        r1 = 1;
        r2 = new int[r1];
        r1 = 0;
        r2[r1] = r18;
        r11.<init>(r0, r2);
    L_0x03ba:
        r0 = defpackage.oxz.a(r15);
        r0 = (defpackage.ouc) r0;
        r11 = android.util.Pair.create(r11, r0);
        goto L_0x03cc;
    L_0x03c5:
        r25 = r2;
        r26 = r6;
        r19 = r8;
        r11 = 0;
    L_0x03cc:
        if (r11 != 0) goto L_0x03cf;
    L_0x03ce:
        goto L_0x0409;
    L_0x03cf:
        if (r14 != 0) goto L_0x03d3;
    L_0x03d1:
        r0 = -1;
        goto L_0x03de;
    L_0x03d3:
        r0 = r11.second;
        r0 = (defpackage.ouc) r0;
        r0 = r0.compareTo(r14);
        if (r0 > 0) goto L_0x03d1;
    L_0x03dd:
        goto L_0x03ce;
    L_0x03de:
        r1 = 0;
        if (r13 == r0) goto L_0x03e3;
    L_0x03e1:
        r4[r13] = r1;
    L_0x03e3:
        r0 = r11.first;
        r0 = (defpackage.oul) r0;
        r4[r26] = r0;
        r2 = r0.a;
        r0 = r0.b;
        r3 = 0;
        r0 = r0[r3];
        r0 = r2.a(r0);
        r0 = r0.A;
        r2 = r11.second;
        r2 = (defpackage.ouc) r2;
        r7 = r0;
        r14 = r2;
        r13 = r26;
        goto L_0x040c;
    L_0x03ff:
        r25 = r2;
        r21 = r3;
        r26 = r6;
        r22 = r7;
        r19 = r8;
    L_0x0409:
        r1 = 0;
        r7 = r22;
    L_0x040c:
        r6 = r26 + 1;
        r9 = 2;
        r12 = 1;
        r0 = r37;
        r1 = r38;
        r8 = r19;
        r3 = r21;
        r2 = r25;
        goto L_0x001b;
    L_0x041c:
        r0 = r1;
        r25 = r2;
        r21 = r3;
        r19 = r8;
        r1 = 0;
        r2 = r0.a(r6);
        r3 = 2;
        if (r2 == r3) goto L_0x0437;
    L_0x042b:
        r32 = r4;
        r5 = r6;
        r1 = r7;
        r8 = r19;
        r7 = r25;
        r24 = 0;
        goto L_0x06e2;
    L_0x0437:
        if (r7 == 0) goto L_0x0444;
    L_0x0439:
        r32 = r4;
        r5 = r6;
        r1 = r7;
        r7 = r25;
        r12 = 1;
        r24 = 0;
        goto L_0x06d5;
    L_0x0444:
        r2 = r0.b(r6);
        r3 = r39[r6];
        r5 = r40[r6];
        r7 = r25;
        r8 = r7.r;
        if (r8 != 0) goto L_0x05d2;
    L_0x0452:
        r8 = r7.q;
        if (r8 != 0) goto L_0x05d2;
    L_0x0456:
        r8 = r7.h;
        if (r8 != 0) goto L_0x045d;
    L_0x045a:
        r8 = 16;
        goto L_0x045f;
    L_0x045d:
        r8 = 24;
    L_0x045f:
        r9 = r7.g;
        if (r9 == 0) goto L_0x0469;
    L_0x0463:
        r5 = r5 & r8;
        if (r5 != 0) goto L_0x0467;
    L_0x0466:
        goto L_0x0469;
    L_0x0467:
        r5 = 1;
        goto L_0x046a;
    L_0x0469:
        r5 = 0;
    L_0x046a:
        r15 = 0;
    L_0x046b:
        r9 = r2.b;
        if (r15 >= r9) goto L_0x05d2;
    L_0x046f:
        r14 = r2.a(r15);
        r18 = r3[r15];
        r13 = r7.b;
        r12 = r7.c;
        r11 = r7.d;
        r10 = r7.e;
        r9 = r7.i;
        r1 = r7.j;
        r16 = r10;
        r10 = r7.k;
        r25 = r11;
        r11 = r14.a;
        r26 = r12;
        r12 = 2;
        if (r11 >= r12) goto L_0x049c;
    L_0x048e:
        r1 = c;
    L_0x0490:
        r32 = r4;
        r28 = r5;
        r35 = r6;
        r6 = r14;
        r36 = r15;
        r4 = 2;
        goto L_0x05bc;
    L_0x049c:
        r1 = defpackage.oua.a(r14, r9, r1, r10);
        r9 = r1.size();
        if (r9 >= r12) goto L_0x04a9;
    L_0x04a6:
        r1 = c;
        goto L_0x0490;
    L_0x04a9:
        if (r5 != 0) goto L_0x056f;
    L_0x04ab:
        r12 = new java.util.HashSet;
        r12.<init>();
        r10 = 0;
        r11 = 0;
        r27 = 0;
    L_0x04b4:
        r9 = r1.size();
        if (r11 >= r9) goto L_0x0561;
    L_0x04ba:
        r9 = r1.get(r11);
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        r9 = r14.a(r9);
        r9 = r9.i;
        r28 = r12.add(r9);
        if (r28 == 0) goto L_0x0539;
    L_0x04d0:
        r28 = r5;
        r29 = r9;
        r0 = 0;
        r5 = 0;
    L_0x04d6:
        r9 = r1.size();
        if (r5 >= r9) goto L_0x0522;
    L_0x04dc:
        r9 = r1.get(r5);
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        r30 = r14.a(r9);
        r31 = r18[r9];
        r9 = r30;
        r32 = r4;
        r4 = r10;
        r30 = r16;
        r10 = r29;
        r33 = r11;
        r11 = r31;
        r31 = r12;
        r12 = r8;
        r34 = r13;
        r35 = r6;
        r6 = r14;
        r14 = r26;
        r36 = r15;
        r15 = r25;
        r9 = defpackage.oua.a(r9, r10, r11, r12, r13, r14, r15, r16);
        if (r9 == 0) goto L_0x050f;
    L_0x050d:
        r0 = r0 + 1;
    L_0x050f:
        r5 = r5 + 1;
        r10 = r4;
        r14 = r6;
        r16 = r30;
        r12 = r31;
        r4 = r32;
        r11 = r33;
        r13 = r34;
        r6 = r35;
        r15 = r36;
        goto L_0x04d6;
    L_0x0522:
        r32 = r4;
        r35 = r6;
        r4 = r10;
        r33 = r11;
        r31 = r12;
        r34 = r13;
        r6 = r14;
        r36 = r15;
        r30 = r16;
        if (r0 > r4) goto L_0x0535;
    L_0x0534:
        goto L_0x054b;
    L_0x0535:
        r10 = r0;
        r27 = r29;
        goto L_0x054c;
    L_0x0539:
        r32 = r4;
        r28 = r5;
        r35 = r6;
        r4 = r10;
        r33 = r11;
        r31 = r12;
        r34 = r13;
        r6 = r14;
        r36 = r15;
        r30 = r16;
    L_0x054b:
        r10 = r4;
    L_0x054c:
        r11 = r33 + 1;
        r0 = r38;
        r14 = r6;
        r5 = r28;
        r16 = r30;
        r12 = r31;
        r4 = r32;
        r13 = r34;
        r6 = r35;
        r15 = r36;
        goto L_0x04b4;
    L_0x0561:
        r32 = r4;
        r28 = r5;
        r35 = r6;
        r34 = r13;
        r6 = r14;
        r36 = r15;
        r30 = r16;
        goto L_0x057e;
    L_0x056f:
        r32 = r4;
        r28 = r5;
        r35 = r6;
        r34 = r13;
        r6 = r14;
        r36 = r15;
        r30 = r16;
        r27 = 0;
    L_0x057e:
        r0 = r1.size();
        r4 = -1;
        r0 = r0 + r4;
    L_0x0584:
        if (r0 < 0) goto L_0x05ae;
    L_0x0586:
        r4 = r1.get(r0);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r9 = r6.a(r4);
        r11 = r18[r4];
        r10 = r27;
        r12 = r8;
        r13 = r34;
        r14 = r26;
        r15 = r25;
        r16 = r30;
        r4 = defpackage.oua.a(r9, r10, r11, r12, r13, r14, r15, r16);
        if (r4 == 0) goto L_0x05a8;
    L_0x05a7:
        goto L_0x05ab;
    L_0x05a8:
        r1.remove(r0);
    L_0x05ab:
        r0 = r0 + -1;
        goto L_0x0584;
    L_0x05ae:
        r0 = r1.size();
        r4 = 2;
        if (r0 < r4) goto L_0x05ba;
    L_0x05b5:
        r1 = defpackage.ozp.a(r1);
        goto L_0x05bc;
    L_0x05ba:
        r1 = c;
    L_0x05bc:
        r0 = r1.length;
        if (r0 <= 0) goto L_0x05c5;
    L_0x05bf:
        r11 = new oul;
        r11.<init>(r6, r1);
        goto L_0x05d8;
    L_0x05c5:
        r15 = r36 + 1;
        r0 = r38;
        r5 = r28;
        r4 = r32;
        r6 = r35;
        r1 = 0;
        goto L_0x046b;
    L_0x05d2:
        r32 = r4;
        r35 = r6;
        r4 = 2;
        r11 = 0;
    L_0x05d8:
        if (r11 != 0) goto L_0x06c6;
    L_0x05da:
        r0 = 0;
        r1 = 0;
        r5 = 0;
        r6 = 0;
        r8 = -1;
        r9 = -1;
    L_0x05e0:
        r10 = r2.b;
        if (r0 >= r10) goto L_0x06b2;
    L_0x05e4:
        r10 = r2.a(r0);
        r11 = r7.i;
        r12 = r7.j;
        r13 = r7.k;
        r11 = defpackage.oua.a(r10, r11, r12, r13);
        r12 = r3[r0];
        r13 = r1;
        r1 = 0;
    L_0x05f6:
        r14 = r10.a;
        if (r1 < r14) goto L_0x05fe;
    L_0x05fa:
        r0 = r0 + 1;
        r1 = r13;
        goto L_0x05e0;
    L_0x05fe:
        r14 = r12[r1];
        r15 = r7.s;
        r14 = defpackage.oua.a(r14, r15);
        if (r14 != 0) goto L_0x0610;
    L_0x0608:
        r16 = r0;
        r18 = r2;
        r25 = r3;
        goto L_0x06a7;
    L_0x0610:
        r14 = r10.a(r1);
        r15 = java.lang.Integer.valueOf(r1);
        r15 = r11.contains(r15);
        if (r15 == 0) goto L_0x064d;
    L_0x061e:
        r15 = r14.n;
        r4 = -1;
        if (r15 == r4) goto L_0x0627;
    L_0x0623:
        r4 = r7.b;
        if (r15 > r4) goto L_0x064d;
    L_0x0627:
        r4 = r14.o;
        r15 = -1;
        if (r4 != r15) goto L_0x062d;
    L_0x062c:
        goto L_0x0632;
    L_0x062d:
        r15 = r7.c;
        if (r4 <= r15) goto L_0x0632;
    L_0x0631:
        goto L_0x064d;
    L_0x0632:
        r4 = r14.p;
        r15 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1));
        if (r15 == 0) goto L_0x0641;
    L_0x063a:
        r15 = r7.d;
        r15 = (float) r15;
        r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1));
        if (r4 > 0) goto L_0x064d;
    L_0x0641:
        r4 = r14.e;
        r15 = -1;
        if (r4 == r15) goto L_0x064b;
    L_0x0646:
        r15 = r7.e;
        if (r4 <= r15) goto L_0x064b;
    L_0x064a:
        goto L_0x064d;
    L_0x064b:
        r4 = 1;
        goto L_0x064e;
    L_0x064d:
        r4 = 0;
    L_0x064e:
        if (r4 != 0) goto L_0x0654;
    L_0x0650:
        r15 = r7.f;
        if (r15 == 0) goto L_0x0608;
    L_0x0654:
        if (r4 != 0) goto L_0x065a;
    L_0x0656:
        r16 = r0;
        r15 = 1;
        goto L_0x065d;
    L_0x065a:
        r16 = r0;
        r15 = 2;
    L_0x065d:
        r0 = r12[r1];
        r18 = r2;
        r2 = 0;
        r0 = defpackage.oua.a(r0, r2);
        if (r0 == 0) goto L_0x066a;
    L_0x0668:
        r15 = r15 + 1000;
    L_0x066a:
        if (r15 != r6) goto L_0x0699;
    L_0x066c:
        r2 = r14.e;
        r2 = defpackage.oua.a(r2, r8);
        r25 = r3;
        r3 = r7.q;
        if (r3 != 0) goto L_0x0679;
    L_0x0678:
        goto L_0x067e;
    L_0x0679:
        if (r2 == 0) goto L_0x067e;
    L_0x067b:
        if (r2 < 0) goto L_0x069e;
    L_0x067d:
        goto L_0x06a7;
    L_0x067e:
        r2 = r14.a();
        if (r2 == r9) goto L_0x0689;
    L_0x0684:
        r2 = defpackage.oua.a(r2, r9);
        goto L_0x068f;
    L_0x0689:
        r2 = r14.e;
        r2 = defpackage.oua.a(r2, r8);
    L_0x068f:
        if (r0 == 0) goto L_0x0696;
    L_0x0691:
        if (r4 == 0) goto L_0x0696;
    L_0x0693:
        if (r2 <= 0) goto L_0x06a7;
    L_0x0695:
        goto L_0x069e;
    L_0x0696:
        if (r2 < 0) goto L_0x069e;
    L_0x0698:
        goto L_0x06a7;
    L_0x0699:
        r25 = r3;
        if (r15 > r6) goto L_0x069e;
    L_0x069d:
        goto L_0x06a7;
    L_0x069e:
        r8 = r14.e;
        r9 = r14.a();
        r5 = r1;
        r13 = r10;
        r6 = r15;
    L_0x06a7:
        r1 = r1 + 1;
        r0 = r16;
        r2 = r18;
        r3 = r25;
        r4 = 2;
        goto L_0x05f6;
    L_0x06b2:
        if (r1 == 0) goto L_0x06c1;
    L_0x06b4:
        r11 = new oul;
        r12 = 1;
        r0 = new int[r12];
        r24 = 0;
        r0[r24] = r5;
        r11.<init>(r1, r0);
        goto L_0x06c9;
    L_0x06c1:
        r12 = 1;
        r24 = 0;
        r11 = 0;
        goto L_0x06c9;
    L_0x06c6:
        r12 = 1;
        r24 = 0;
    L_0x06c9:
        r32[r35] = r11;
        if (r11 == 0) goto L_0x06cf;
    L_0x06cd:
        r0 = 1;
        goto L_0x06d0;
    L_0x06cf:
        r0 = 0;
    L_0x06d0:
        r1 = r0;
        r5 = r35;
        r0 = r38;
    L_0x06d5:
        r2 = r0.b(r5);
        r2 = r2.b;
        if (r2 <= 0) goto L_0x06de;
    L_0x06dd:
        goto L_0x06df;
    L_0x06de:
        r12 = 0;
    L_0x06df:
        r2 = r19 | r12;
        r8 = r2;
    L_0x06e2:
        r6 = r5 + 1;
        r2 = r7;
        r3 = r21;
        r4 = r32;
        r7 = r1;
        r1 = r0;
        r0 = r37;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oua.a(ouh, int[][][], int[]):android.util.Pair");
    }

    private static boolean a(nzw nzw, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (oua.a(i, false) && (i & i2) != 0 && (str == null || ozp.a(nzw.i, (Object) str))) {
            int i7 = nzw.n;
            if (i7 == -1 || i7 <= i3) {
                i7 = nzw.o;
                if (i7 == -1 || i7 <= i4) {
                    float f = nzw.p;
                    if (f == -1.0f || f <= ((float) i5)) {
                        int i8 = nzw.e;
                        if (i8 == -1) {
                            z = true;
                        } else if (i8 > i6) {
                            return z;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            if (android.text.TextUtils.equals(r5, r6.c) != false) goto L_0x0020;
     */
    private static boolean a(defpackage.nzw r4, int r5, defpackage.otz r6, boolean r7, boolean r8) {
        /*
        r0 = 0;
        r5 = defpackage.oua.a(r5, r0);
        r1 = 1;
        if (r5 == 0) goto L_0x002d;
    L_0x0008:
        r5 = r4.v;
        r2 = -1;
        if (r5 == r2) goto L_0x002d;
    L_0x000d:
        r3 = r6.a;
        if (r5 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x002d;
    L_0x0012:
        if (r7 != 0) goto L_0x0020;
    L_0x0014:
        r5 = r4.i;
        if (r5 == 0) goto L_0x002d;
    L_0x0018:
        r7 = r6.c;
        r5 = android.text.TextUtils.equals(r5, r7);
        if (r5 == 0) goto L_0x002d;
    L_0x0020:
        if (r8 != 0) goto L_0x002c;
    L_0x0022:
        r4 = r4.w;
        if (r4 == r2) goto L_0x002d;
    L_0x0026:
        r5 = r6.b;
        if (r4 == r5) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        return r1;
    L_0x002c:
        r0 = 1;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oua.a(nzw, int, otz, boolean, boolean):boolean");
    }

    private static boolean a(String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "und");
    }

    protected static int a(nzw nzw, String str) {
        String str2 = nzw.A;
        if (str2 == null || str == null) {
            return 0;
        }
        if (TextUtils.equals(str2, str)) {
            return 3;
        }
        if (nzw.A.startsWith(str) || str.startsWith(nzw.A)) {
            return 2;
        }
        if (nzw.A.length() < 3 || str.length() < 3 || !nzw.A.substring(0, 3).equals(str.substring(0, 3))) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    private static java.util.List a(defpackage.opx r12, int r13, int r14, boolean r15) {
        /*
        r0 = new java.util.ArrayList;
        r1 = r12.a;
        r0.<init>(r1);
        r1 = 0;
        r2 = 0;
    L_0x0009:
        r3 = r12.a;
        if (r2 >= r3) goto L_0x0017;
    L_0x000d:
        r3 = java.lang.Integer.valueOf(r2);
        r0.add(r3);
        r2 = r2 + 1;
        goto L_0x0009;
    L_0x0017:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r13 == r2) goto L_0x00aa;
    L_0x001c:
        if (r14 == r2) goto L_0x00aa;
    L_0x001e:
        r3 = 0;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0022:
        r5 = r12.a;
        if (r3 >= r5) goto L_0x0082;
    L_0x0026:
        r5 = r12.a(r3);
        r6 = r5.n;
        if (r6 <= 0) goto L_0x007f;
    L_0x002e:
        r7 = r5.o;
        if (r7 > 0) goto L_0x0033;
    L_0x0032:
        goto L_0x007f;
    L_0x0033:
        if (r15 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0041;
    L_0x0036:
        r8 = 1;
        if (r6 > r7) goto L_0x003b;
    L_0x0039:
        r9 = 0;
        goto L_0x003c;
    L_0x003b:
        r9 = 1;
    L_0x003c:
        if (r13 > r14) goto L_0x003f;
    L_0x003e:
        r8 = 0;
    L_0x003f:
        if (r9 != r8) goto L_0x0044;
    L_0x0041:
        r9 = r13;
        r8 = r14;
        goto L_0x0046;
    L_0x0044:
        r8 = r13;
        r9 = r14;
    L_0x0046:
        r10 = r6 * r8;
        r11 = r7 * r9;
        if (r10 < r11) goto L_0x0057;
    L_0x004c:
        r7 = new android.graphics.Point;
        r6 = defpackage.ozp.a(r11, r6);
        r7.<init>(r9, r6);
        r6 = r7;
        goto L_0x0060;
    L_0x0057:
        r6 = new android.graphics.Point;
        r7 = defpackage.ozp.a(r10, r7);
        r6.<init>(r7, r8);
    L_0x0060:
        r7 = r5.n;
        r8 = r5.o;
        r8 = r8 * r7;
        r9 = r6.x;
        r9 = (float) r9;
        r10 = 1065017672; // 0x3f7ae148 float:0.98 double:5.26188644E-315;
        r9 = r9 * r10;
        r9 = (int) r9;
        if (r7 < r9) goto L_0x007f;
    L_0x0071:
        r5 = r5.o;
        r6 = r6.y;
        r6 = (float) r6;
        r6 = r6 * r10;
        r6 = (int) r6;
        if (r5 < r6) goto L_0x007f;
    L_0x007b:
        if (r8 < r4) goto L_0x007e;
    L_0x007d:
        goto L_0x007f;
    L_0x007e:
        r4 = r8;
    L_0x007f:
        r3 = r3 + 1;
        goto L_0x0022;
    L_0x0082:
        if (r4 != r2) goto L_0x0085;
    L_0x0084:
        goto L_0x00aa;
    L_0x0085:
        r13 = r0.size();
        r14 = -1;
        r13 = r13 + r14;
    L_0x008b:
        if (r13 < 0) goto L_0x00aa;
    L_0x008d:
        r15 = r0.get(r13);
        r15 = (java.lang.Integer) r15;
        r15 = r15.intValue();
        r15 = r12.a(r15);
        r15 = r15.a();
        if (r15 != r14) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a4;
    L_0x00a2:
        if (r15 <= r4) goto L_0x00a7;
    L_0x00a4:
        r0.remove(r13);
    L_0x00a7:
        r13 = r13 + -1;
        goto L_0x008b;
    L_0x00aa:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oua.a(opx, int, int, boolean):java.util.List");
    }
}
