package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: rgl */
final class rgl implements rha {
    private static final int[] a = new int[0];
    private static final Unsafe b = rhv.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final rgh g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final rgp n;
    private final rfr o;
    private final rhp p;
    private final rei q;
    private final rgb r;

    private rgl(int[] iArr, Object[] objArr, int i, int i2, rgh rgh, boolean z, int[] iArr2, int i3, int i4, rgp rgp, rfr rfr, rhp rhp, rei rei, rgb rgb) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = rgh instanceof reu;
        this.j = z;
        boolean z2 = false;
        if (rei != null && rei.a(rgh)) {
            z2 = true;
        }
        this.h = z2;
        this.k = iArr2;
        this.l = i3;
        this.m = i4;
        this.n = rgp;
        this.o = rfr;
        this.p = rhp;
        this.q = rei;
        this.g = rgh;
        this.r = rgb;
    }

    private static boolean e(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0430  */
    static defpackage.rgl a(defpackage.rgg r35, defpackage.rgp r36, defpackage.rfr r37, defpackage.rhp r38, defpackage.rei r39, defpackage.rgb r40) {
        /*
        r0 = r35;
        r1 = r0 instanceof defpackage.rgy;
        if (r1 == 0) goto L_0x047f;
    L_0x0006:
        r0 = (defpackage.rgy) r0;
        r1 = r0.a();
        r2 = 2;
        r3 = 0;
        if (r1 != r2) goto L_0x0012;
    L_0x0010:
        r11 = 1;
        goto L_0x0013;
    L_0x0012:
        r11 = 0;
    L_0x0013:
        r1 = r0.b;
        r2 = r1.length();
        r5 = r1.charAt(r3);
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r5 < r7) goto L_0x003b;
    L_0x0022:
        r5 = r5 & 8191;
        r8 = r5;
        r5 = 1;
        r9 = 13;
    L_0x0028:
        r10 = r5 + 1;
        r5 = r1.charAt(r5);
        if (r5 < r7) goto L_0x0038;
    L_0x0030:
        r5 = r5 & 8191;
        r5 = r5 << r9;
        r8 = r8 | r5;
        r9 = r9 + 13;
        r5 = r10;
        goto L_0x0028;
    L_0x0038:
        r5 = r5 << r9;
        r5 = r5 | r8;
        goto L_0x003c;
    L_0x003b:
        r10 = 1;
    L_0x003c:
        r8 = r10 + 1;
        r9 = r1.charAt(r10);
        if (r9 < r7) goto L_0x005b;
    L_0x0044:
        r9 = r9 & 8191;
        r10 = 13;
    L_0x0048:
        r12 = r8 + 1;
        r8 = r1.charAt(r8);
        if (r8 < r7) goto L_0x0058;
    L_0x0050:
        r8 = r8 & 8191;
        r8 = r8 << r10;
        r9 = r9 | r8;
        r10 = r10 + 13;
        r8 = r12;
        goto L_0x0048;
    L_0x0058:
        r8 = r8 << r10;
        r9 = r9 | r8;
        goto L_0x005c;
    L_0x005b:
        r12 = r8;
    L_0x005c:
        if (r9 != 0) goto L_0x006b;
    L_0x005e:
        r8 = a;
        r17 = r12;
        r9 = 0;
        r10 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r12 = r8;
        r8 = 0;
        goto L_0x01a7;
    L_0x006b:
        r8 = r12 + 1;
        r9 = r1.charAt(r12);
        if (r9 < r7) goto L_0x008a;
    L_0x0073:
        r9 = r9 & 8191;
        r10 = 13;
    L_0x0077:
        r12 = r8 + 1;
        r8 = r1.charAt(r8);
        if (r8 < r7) goto L_0x0087;
    L_0x007f:
        r8 = r8 & 8191;
        r8 = r8 << r10;
        r9 = r9 | r8;
        r10 = r10 + 13;
        r8 = r12;
        goto L_0x0077;
    L_0x0087:
        r8 = r8 << r10;
        r8 = r8 | r9;
        goto L_0x008c;
    L_0x008a:
        r12 = r8;
        r8 = r9;
    L_0x008c:
        r9 = r12 + 1;
        r10 = r1.charAt(r12);
        if (r10 < r7) goto L_0x00ab;
    L_0x0094:
        r10 = r10 & 8191;
        r12 = 13;
    L_0x0098:
        r13 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00a8;
    L_0x00a0:
        r9 = r9 & 8191;
        r9 = r9 << r12;
        r10 = r10 | r9;
        r12 = r12 + 13;
        r9 = r13;
        goto L_0x0098;
    L_0x00a8:
        r9 = r9 << r12;
        r10 = r10 | r9;
        goto L_0x00ac;
    L_0x00ab:
        r13 = r9;
    L_0x00ac:
        r9 = r13 + 1;
        r12 = r1.charAt(r13);
        if (r12 < r7) goto L_0x00cc;
    L_0x00b4:
        r12 = r12 & 8191;
        r13 = 13;
    L_0x00b8:
        r14 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00c8;
    L_0x00c0:
        r9 = r9 & 8191;
        r9 = r9 << r13;
        r12 = r12 | r9;
        r13 = r13 + 13;
        r9 = r14;
        goto L_0x00b8;
    L_0x00c8:
        r9 = r9 << r13;
        r9 = r9 | r12;
        r12 = r9;
        goto L_0x00cd;
    L_0x00cc:
        r14 = r9;
    L_0x00cd:
        r9 = r14 + 1;
        r13 = r1.charAt(r14);
        if (r13 < r7) goto L_0x00ed;
    L_0x00d5:
        r13 = r13 & 8191;
        r14 = 13;
    L_0x00d9:
        r15 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00e9;
    L_0x00e1:
        r9 = r9 & 8191;
        r9 = r9 << r14;
        r13 = r13 | r9;
        r14 = r14 + 13;
        r9 = r15;
        goto L_0x00d9;
    L_0x00e9:
        r9 = r9 << r14;
        r9 = r9 | r13;
        r13 = r9;
        goto L_0x00ee;
    L_0x00ed:
        r15 = r9;
    L_0x00ee:
        r9 = r15 + 1;
        r14 = r1.charAt(r15);
        if (r14 < r7) goto L_0x0110;
    L_0x00f6:
        r14 = r14 & 8191;
        r15 = 13;
    L_0x00fa:
        r16 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x010b;
    L_0x0102:
        r9 = r9 & 8191;
        r9 = r9 << r15;
        r14 = r14 | r9;
        r15 = r15 + 13;
        r9 = r16;
        goto L_0x00fa;
    L_0x010b:
        r9 = r9 << r15;
        r9 = r9 | r14;
        r14 = r9;
        r9 = r16;
    L_0x0110:
        r15 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x0133;
    L_0x0118:
        r9 = r9 & 8191;
        r16 = 13;
    L_0x011c:
        r17 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x012e;
    L_0x0124:
        r15 = r15 & 8191;
        r15 = r15 << r16;
        r9 = r9 | r15;
        r16 = r16 + 13;
        r15 = r17;
        goto L_0x011c;
    L_0x012e:
        r15 = r15 << r16;
        r9 = r9 | r15;
        r15 = r17;
    L_0x0133:
        r16 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0161;
    L_0x013b:
        r15 = r15 & 8191;
        r17 = 13;
        r33 = r16;
        r16 = r15;
        r15 = r33;
    L_0x0145:
        r18 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0158;
    L_0x014d:
        r15 = r15 & 8191;
        r15 = r15 << r17;
        r16 = r16 | r15;
        r17 = r17 + 13;
        r15 = r18;
        goto L_0x0145;
    L_0x0158:
        r15 = r15 << r17;
        r15 = r16 | r15;
        r16 = r15;
        r15 = r18;
        goto L_0x0167;
    L_0x0161:
        r33 = r16;
        r16 = r15;
        r15 = r33;
    L_0x0167:
        r17 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0192;
    L_0x016f:
        r15 = r15 & 8191;
        r18 = 13;
        r33 = r17;
        r17 = r15;
        r15 = r33;
    L_0x0179:
        r19 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x018c;
    L_0x0181:
        r15 = r15 & 8191;
        r15 = r15 << r18;
        r17 = r17 | r15;
        r18 = r18 + 13;
        r15 = r19;
        goto L_0x0179;
    L_0x018c:
        r15 = r15 << r18;
        r15 = r17 | r15;
        r17 = r19;
    L_0x0192:
        r18 = r15 + r9;
        r3 = r18 + r16;
        r3 = new int[r3];
        r16 = r8 + r8;
        r10 = r16 + r10;
        r33 = r12;
        r12 = r3;
        r3 = r9;
        r9 = r33;
        r34 = r15;
        r15 = r13;
        r13 = r34;
    L_0x01a7:
        r6 = b;
        r4 = r0.c;
        r7 = r0.a;
        r7 = r7.getClass();
        r20 = r10;
        r10 = r14 * 3;
        r10 = new int[r10];
        r14 = r14 + r14;
        r14 = new java.lang.Object[r14];
        r3 = r3 + r13;
        r21 = r3;
        r24 = r21;
        r23 = r13;
        r3 = r17;
        r22 = r20;
        r17 = 0;
        r20 = 0;
    L_0x01c9:
        if (r3 >= r2) goto L_0x0457;
    L_0x01cb:
        r25 = r3 + 1;
        r3 = r1.charAt(r3);
        r26 = r2;
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r3 < r2) goto L_0x01ff;
    L_0x01d8:
        r3 = r3 & 8191;
        r27 = 13;
        r33 = r25;
        r25 = r3;
        r3 = r33;
    L_0x01e2:
        r28 = r3 + 1;
        r3 = r1.charAt(r3);
        if (r3 < r2) goto L_0x01f8;
    L_0x01ea:
        r2 = r3 & 8191;
        r2 = r2 << r27;
        r25 = r25 | r2;
        r27 = r27 + 13;
        r3 = r28;
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x01e2;
    L_0x01f8:
        r2 = r3 << r27;
        r3 = r25 | r2;
        r2 = r28;
        goto L_0x0201;
    L_0x01ff:
        r2 = r25;
    L_0x0201:
        r25 = r2 + 1;
        r2 = r1.charAt(r2);
        r27 = r13;
        r13 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r13) goto L_0x0235;
    L_0x020e:
        r2 = r2 & 8191;
        r28 = 13;
        r33 = r25;
        r25 = r2;
        r2 = r33;
    L_0x0218:
        r29 = r2 + 1;
        r2 = r1.charAt(r2);
        if (r2 < r13) goto L_0x022e;
    L_0x0220:
        r2 = r2 & 8191;
        r2 = r2 << r28;
        r25 = r25 | r2;
        r28 = r28 + 13;
        r2 = r29;
        r13 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x0218;
    L_0x022e:
        r2 = r2 << r28;
        r2 = r25 | r2;
        r13 = r29;
        goto L_0x0237;
    L_0x0235:
        r13 = r25;
    L_0x0237:
        r25 = r11;
        r11 = r2 & 255;
        r28 = r15;
        r15 = r2 & 1024;
        if (r15 == 0) goto L_0x0247;
    L_0x0241:
        r15 = r20 + 1;
        r12[r20] = r17;
        r20 = r15;
    L_0x0247:
        r15 = defpackage.ren.MAP;
        r15 = r15.k;
        if (r11 <= r15) goto L_0x0306;
    L_0x024d:
        r15 = r13 + 1;
        r13 = r1.charAt(r13);
        r29 = r15;
        r15 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r13 < r15) goto L_0x0280;
    L_0x025a:
        r13 = r13 & 8191;
        r30 = 13;
        r33 = r29;
        r29 = r13;
        r13 = r33;
    L_0x0264:
        r31 = r13 + 1;
        r13 = r1.charAt(r13);
        if (r13 < r15) goto L_0x027a;
    L_0x026c:
        r13 = r13 & 8191;
        r13 = r13 << r30;
        r29 = r29 | r13;
        r30 = r30 + 13;
        r13 = r31;
        r15 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x0264;
    L_0x027a:
        r13 = r13 << r30;
        r13 = r29 | r13;
        r29 = r31;
    L_0x0280:
        r15 = defpackage.ren.MESSAGE;
        r15 = r15.k;
        r15 = r15 + 51;
        if (r11 == r15) goto L_0x02b3;
    L_0x0288:
        r15 = defpackage.ren.GROUP;
        r15 = r15.k;
        r15 = r15 + 51;
        if (r11 != r15) goto L_0x0291;
    L_0x0290:
        goto L_0x02b3;
    L_0x0291:
        r15 = defpackage.ren.ENUM;
        r15 = r15.k;
        r15 = r15 + 51;
        if (r11 != r15) goto L_0x02ae;
    L_0x0299:
        r15 = r5 & 1;
        r30 = r9;
        r9 = 1;
        if (r15 == r9) goto L_0x02a1;
    L_0x02a0:
        goto L_0x02b0;
    L_0x02a1:
        r15 = r17 / 3;
        r31 = r22 + 1;
        r15 = r15 + r15;
        r15 = r15 + r9;
        r9 = r4[r22];
        r14[r15] = r9;
        r15 = r31;
        goto L_0x02c2;
    L_0x02ae:
        r30 = r9;
    L_0x02b0:
        r15 = r22;
        goto L_0x02c2;
    L_0x02b3:
        r30 = r9;
        r9 = r17 / 3;
        r15 = r22 + 1;
        r9 = r9 + r9;
        r18 = 1;
        r9 = r9 + 1;
        r22 = r4[r22];
        r14[r9] = r22;
    L_0x02c2:
        r13 = r13 + r13;
        r9 = r4[r13];
        r22 = r15;
        r15 = r9 instanceof java.lang.reflect.Field;
        if (r15 == 0) goto L_0x02ce;
    L_0x02cb:
        r9 = (java.lang.reflect.Field) r9;
        goto L_0x02d6;
    L_0x02ce:
        r9 = (java.lang.String) r9;
        r9 = defpackage.rgl.a(r7, r9);
        r4[r13] = r9;
    L_0x02d6:
        r15 = r10;
        r9 = r6.objectFieldOffset(r9);
        r10 = (int) r9;
        r13 = r13 + 1;
        r9 = r4[r13];
        r31 = r10;
        r10 = r9 instanceof java.lang.reflect.Field;
        if (r10 == 0) goto L_0x02e9;
    L_0x02e6:
        r9 = (java.lang.reflect.Field) r9;
        goto L_0x02f1;
    L_0x02e9:
        r9 = (java.lang.String) r9;
        r9 = defpackage.rgl.a(r7, r9);
        r4[r13] = r9;
    L_0x02f1:
        r9 = r6.objectFieldOffset(r9);
        r10 = (int) r9;
        r32 = r1;
        r18 = r22;
        r13 = r29;
        r1 = 0;
        r22 = r0;
        r29 = r2;
        r2 = r10;
        r10 = r31;
        goto L_0x03fe;
    L_0x0306:
        r30 = r9;
        r15 = r10;
        r9 = r22 + 1;
        r10 = r4[r22];
        r10 = (java.lang.String) r10;
        r10 = defpackage.rgl.a(r7, r10);
        r22 = r0;
        r0 = defpackage.ren.MESSAGE;
        r0 = r0.k;
        if (r11 == r0) goto L_0x0395;
    L_0x031b:
        r0 = defpackage.ren.GROUP;
        r0 = r0.k;
        if (r11 != r0) goto L_0x0323;
    L_0x0321:
        goto L_0x0395;
    L_0x0323:
        r0 = defpackage.ren.MESSAGE_LIST;
        r0 = r0.k;
        if (r11 == r0) goto L_0x0387;
    L_0x0329:
        r0 = defpackage.ren.GROUP_LIST;
        r0 = r0.k;
        if (r11 != r0) goto L_0x0330;
    L_0x032f:
        goto L_0x0387;
    L_0x0330:
        r0 = defpackage.ren.ENUM;
        r0 = r0.k;
        if (r11 == r0) goto L_0x0375;
    L_0x0336:
        r0 = defpackage.ren.ENUM_LIST;
        r0 = r0.k;
        if (r11 == r0) goto L_0x0375;
    L_0x033c:
        r0 = defpackage.ren.ENUM_LIST_PACKED;
        r0 = r0.k;
        if (r11 == r0) goto L_0x0375;
    L_0x0342:
        r0 = defpackage.ren.MAP;
        r0 = r0.k;
        if (r11 != r0) goto L_0x0371;
    L_0x0348:
        r0 = r23 + 1;
        r12[r23] = r17;
        r23 = r17 / 3;
        r23 = r23 + r23;
        r29 = r9 + 1;
        r9 = r4[r9];
        r14[r23] = r9;
        r9 = r2 & 2048;
        if (r9 == 0) goto L_0x0369;
    L_0x035a:
        r9 = r29 + 1;
        r23 = r23 + 1;
        r29 = r4[r29];
        r14[r23] = r29;
        r23 = r0;
        r29 = r2;
        r18 = r9;
        goto L_0x036f;
    L_0x0369:
        r23 = r0;
        r18 = r29;
        r29 = r2;
    L_0x036f:
        r2 = 1;
        goto L_0x03a4;
    L_0x0371:
        r29 = r2;
        r2 = 1;
        goto L_0x03a2;
    L_0x0375:
        r0 = r5 & 1;
        r29 = r2;
        r2 = 1;
        if (r0 != r2) goto L_0x03a2;
    L_0x037c:
        r0 = r17 / 3;
        r18 = r9 + 1;
        r0 = r0 + r0;
        r0 = r0 + r2;
        r9 = r4[r9];
        r14[r0] = r9;
        goto L_0x03a4;
    L_0x0387:
        r29 = r2;
        r2 = 1;
        r0 = r17 / 3;
        r18 = r9 + 1;
        r0 = r0 + r0;
        r0 = r0 + r2;
        r9 = r4[r9];
        r14[r0] = r9;
        goto L_0x03a4;
    L_0x0395:
        r29 = r2;
        r2 = 1;
        r0 = r17 / 3;
        r0 = r0 + r0;
        r0 = r0 + r2;
        r18 = r10.getType();
        r14[r0] = r18;
    L_0x03a2:
        r18 = r9;
    L_0x03a4:
        r9 = r6.objectFieldOffset(r10);
        r10 = (int) r9;
        r0 = r5 & 1;
        if (r0 != r2) goto L_0x0402;
    L_0x03ad:
        r0 = defpackage.ren.GROUP;
        r0 = r0.k;
        if (r11 > r0) goto L_0x0402;
    L_0x03b3:
        r0 = r13 + 1;
        r9 = r1.charAt(r13);
        r13 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r9 < r13) goto L_0x03d8;
    L_0x03be:
        r9 = r9 & 8191;
        r19 = 13;
    L_0x03c2:
        r31 = r0 + 1;
        r0 = r1.charAt(r0);
        if (r0 < r13) goto L_0x03d4;
    L_0x03ca:
        r0 = r0 & 8191;
        r0 = r0 << r19;
        r9 = r9 | r0;
        r19 = r19 + 13;
        r0 = r31;
        goto L_0x03c2;
    L_0x03d4:
        r0 = r0 << r19;
        r9 = r9 | r0;
        goto L_0x03da;
    L_0x03d8:
        r31 = r0;
    L_0x03da:
        r0 = r8 + r8;
        r19 = r9 / 32;
        r0 = r0 + r19;
        r2 = r4[r0];
        r13 = r2 instanceof java.lang.reflect.Field;
        if (r13 == 0) goto L_0x03e9;
    L_0x03e6:
        r2 = (java.lang.reflect.Field) r2;
        goto L_0x03f1;
    L_0x03e9:
        r2 = (java.lang.String) r2;
        r2 = defpackage.rgl.a(r7, r2);
        r4[r0] = r2;
    L_0x03f1:
        r32 = r1;
        r0 = r6.objectFieldOffset(r2);
        r1 = (int) r0;
        r0 = r9 % 32;
        r2 = r1;
        r13 = r31;
        r1 = r0;
    L_0x03fe:
        r0 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x0409;
    L_0x0402:
        r32 = r1;
        r0 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r1 = 0;
        r2 = 0;
    L_0x0409:
        r9 = 18;
        if (r11 < r9) goto L_0x0417;
    L_0x040d:
        r9 = 49;
        if (r11 > r9) goto L_0x0417;
    L_0x0411:
        r9 = r24 + 1;
        r12[r24] = r10;
        r24 = r9;
    L_0x0417:
        r9 = r17 + 1;
        r15[r17] = r3;
        r3 = r9 + 1;
        r17 = r4;
        r0 = r29;
        r4 = r0 & 512;
        if (r4 == 0) goto L_0x0428;
    L_0x0425:
        r4 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        goto L_0x0429;
    L_0x0428:
        r4 = 0;
    L_0x0429:
        r0 = r0 & 256;
        if (r0 == 0) goto L_0x0430;
    L_0x042d:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        goto L_0x0431;
    L_0x0430:
        r0 = 0;
    L_0x0431:
        r0 = r0 | r4;
        r4 = r11 << 20;
        r0 = r0 | r4;
        r0 = r0 | r10;
        r15[r9] = r0;
        r0 = r3 + 1;
        r1 = r1 << 20;
        r1 = r1 | r2;
        r15[r3] = r1;
        r3 = r13;
        r10 = r15;
        r4 = r17;
        r11 = r25;
        r2 = r26;
        r13 = r27;
        r15 = r28;
        r9 = r30;
        r1 = r32;
        r17 = r0;
        r0 = r22;
        r22 = r18;
        goto L_0x01c9;
    L_0x0457:
        r22 = r0;
        r30 = r9;
        r25 = r11;
        r27 = r13;
        r28 = r15;
        r15 = r10;
        r0 = new rgl;
        r1 = r22;
        r10 = r1.a;
        r5 = r0;
        r6 = r15;
        r7 = r14;
        r8 = r30;
        r9 = r28;
        r14 = r21;
        r15 = r36;
        r16 = r37;
        r17 = r38;
        r18 = r39;
        r19 = r40;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        return r0;
    L_0x047f:
        r0 = (defpackage.rhm) r0;
        r0.a();
        r0 = new java.lang.NoSuchMethodError;
        r0.<init>();
        goto L_0x048b;
    L_0x048a:
        throw r0;
    L_0x048b:
        goto L_0x048a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(rgg, rgp, rfr, rhp, rei, rgb):rgl");
    }

    private static Field a(Class cls, String str) {
        try {
            cls = cls.getDeclaredField(str);
            return cls;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 40) + name.length()) + String.valueOf(arrays).length());
            stringBuilder.append("Field ");
            stringBuilder.append(str);
            stringBuilder.append(" for ");
            stringBuilder.append(name);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(arrays);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final Object a() {
        return this.n.a(this.g);
    }

    public final boolean a(Object obj, Object obj2) {
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            boolean a;
            int c = c(i);
            long j = (long) (c & 1048575);
            switch ((c >>> 20) & 255) {
                case 0:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 1:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 2:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (c(obj, obj2, i) && rhv.c(obj, j) == rhv.c(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (c(obj, obj2, i) && rhc.a(rhv.f(obj, j), rhv.f(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (c(obj, obj2, i) && rhc.a(rhv.f(obj, j), rhv.f(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (c(obj, obj2, i) && rhc.a(rhv.f(obj, j), rhv.f(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (c(obj, obj2, i) && rhv.a(obj, j) == rhv.a(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (c(obj, obj2, i) && rhv.b(obj, j) == rhv.b(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (c(obj, obj2, i) && rhc.a(rhv.f(obj, j), rhv.f(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                case 46:
                case 47:
                case 48:
                case cv.aT /*49*/:
                    a = rhc.a(rhv.f(obj, j), rhv.f(obj2, j));
                    break;
                case cv.aU /*50*/:
                    a = rhc.a(rhv.f(obj, j), rhv.f(obj2, j));
                    break;
                case cv.aV /*51*/:
                case cv.aW /*52*/:
                case cv.aX /*53*/:
                case cv.aY /*54*/:
                case cv.aZ /*55*/:
                case cv.ba /*56*/:
                case cv.bb /*57*/:
                case 58:
                case cv.bc /*59*/:
                case cv.bd /*60*/:
                case cv.be /*61*/:
                case cv.bf /*62*/:
                case cv.bg /*63*/:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long d = (long) (d(i) & 1048575);
                    if (rhv.a(obj, d) == rhv.a(obj2, d) && rhc.a(rhv.f(obj, j), rhv.f(obj2, j))) {
                        continue;
                    }
                default:
                    break;
            }
            if (!a) {
                return false;
            }
        }
        if (this.p.b(obj).equals(this.p.b(obj2))) {
            return this.h ? this.q.a(obj).equals(this.q.a(obj2)) : true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Missing block: B:73:0x01c2, code skipped:
            r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Missing block: B:83:0x0226, code skipped:
            r2 = r2 + r3;
     */
    /* JADX WARNING: Missing block: B:84:0x0227, code skipped:
            r1 = r1 + 3;
     */
    public final int a(java.lang.Object r9) {
        /*
        r8 = this;
        r0 = r8.c;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        if (r1 >= r0) goto L_0x022b;
    L_0x0007:
        r3 = r8.c(r1);
        r4 = r8.c;
        r4 = r4[r1];
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r5 = r5 & r3;
        r5 = (long) r5;
        r3 = r3 >>> 20;
        r3 = r3 & 255;
        r7 = 37;
        switch(r3) {
            case 0: goto L_0x0218;
            case 1: goto L_0x020d;
            case 2: goto L_0x0202;
            case 3: goto L_0x01f7;
            case 4: goto L_0x01f0;
            case 5: goto L_0x01e5;
            case 6: goto L_0x01de;
            case 7: goto L_0x01d3;
            case 8: goto L_0x01c6;
            case 9: goto L_0x01b8;
            case 10: goto L_0x01ac;
            case 11: goto L_0x01a4;
            case 12: goto L_0x019c;
            case 13: goto L_0x0194;
            case 14: goto L_0x0188;
            case 15: goto L_0x0180;
            case 16: goto L_0x0174;
            case 17: goto L_0x0169;
            case 18: goto L_0x015d;
            case 19: goto L_0x015d;
            case 20: goto L_0x015d;
            case 21: goto L_0x015d;
            case 22: goto L_0x015d;
            case 23: goto L_0x015d;
            case 24: goto L_0x015d;
            case 25: goto L_0x015d;
            case 26: goto L_0x015d;
            case 27: goto L_0x015d;
            case 28: goto L_0x015d;
            case 29: goto L_0x015d;
            case 30: goto L_0x015d;
            case 31: goto L_0x015d;
            case 32: goto L_0x015d;
            case 33: goto L_0x015d;
            case 34: goto L_0x015d;
            case 35: goto L_0x015d;
            case 36: goto L_0x015d;
            case 37: goto L_0x015d;
            case 38: goto L_0x015d;
            case 39: goto L_0x015d;
            case 40: goto L_0x015d;
            case 41: goto L_0x015d;
            case 42: goto L_0x015d;
            case 43: goto L_0x015d;
            case 44: goto L_0x015d;
            case 45: goto L_0x015d;
            case 46: goto L_0x015d;
            case 47: goto L_0x015d;
            case 48: goto L_0x015d;
            case 49: goto L_0x015d;
            case 50: goto L_0x0151;
            case 51: goto L_0x013b;
            case 52: goto L_0x0129;
            case 53: goto L_0x0117;
            case 54: goto L_0x0105;
            case 55: goto L_0x00f7;
            case 56: goto L_0x00e5;
            case 57: goto L_0x00d7;
            case 58: goto L_0x00c5;
            case 59: goto L_0x00b1;
            case 60: goto L_0x009f;
            case 61: goto L_0x008d;
            case 62: goto L_0x007f;
            case 63: goto L_0x0071;
            case 64: goto L_0x0063;
            case 65: goto L_0x0051;
            case 66: goto L_0x0043;
            case 67: goto L_0x0031;
            case 68: goto L_0x001f;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x0227;
    L_0x001f:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0025:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x0031:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0037:
        r2 = r2 * 53;
        r3 = defpackage.rgl.e(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0043:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0049:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x0051:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0057:
        r2 = r2 * 53;
        r3 = defpackage.rgl.e(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0063:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0069:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x0071:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0077:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x007f:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0085:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x008d:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0093:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x009f:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00a5:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x00b1:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00b7:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x00c5:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00cb:
        r2 = r2 * 53;
        r3 = defpackage.rgl.f(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x00d7:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00dd:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x00e5:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00eb:
        r2 = r2 * 53;
        r3 = defpackage.rgl.e(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x00f7:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x00fd:
        r2 = r2 * 53;
        r3 = defpackage.rgl.d(r9, r5);
        goto L_0x0226;
    L_0x0105:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x010b:
        r2 = r2 * 53;
        r3 = defpackage.rgl.e(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0117:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x011d:
        r2 = r2 * 53;
        r3 = defpackage.rgl.e(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0129:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x012f:
        r2 = r2 * 53;
        r3 = defpackage.rgl.c(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0226;
    L_0x013b:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0227;
    L_0x0141:
        r2 = r2 * 53;
        r3 = defpackage.rgl.b(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0151:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x015d:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x0169:
        r3 = defpackage.rhv.f(r9, r5);
        if (r3 == 0) goto L_0x01c2;
    L_0x016f:
        r7 = r3.hashCode();
        goto L_0x01c2;
    L_0x0174:
        r2 = r2 * 53;
        r3 = defpackage.rhv.b(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0180:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x0188:
        r2 = r2 * 53;
        r3 = defpackage.rhv.b(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0194:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x019c:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x01a4:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x01ac:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x01b8:
        r3 = defpackage.rhv.f(r9, r5);
        if (r3 == 0) goto L_0x01c2;
    L_0x01be:
        r7 = r3.hashCode();
    L_0x01c2:
        r2 = r2 * 53;
        r2 = r2 + r7;
        goto L_0x0227;
    L_0x01c6:
        r2 = r2 * 53;
        r3 = defpackage.rhv.f(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0226;
    L_0x01d3:
        r2 = r2 * 53;
        r3 = defpackage.rhv.c(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x01de:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x01e5:
        r2 = r2 * 53;
        r3 = defpackage.rhv.b(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x01f0:
        r2 = r2 * 53;
        r3 = defpackage.rhv.a(r9, r5);
        goto L_0x0226;
    L_0x01f7:
        r2 = r2 * 53;
        r3 = defpackage.rhv.b(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x0202:
        r2 = r2 * 53;
        r3 = defpackage.rhv.b(r9, r5);
        r3 = defpackage.rfc.a(r3);
        goto L_0x0226;
    L_0x020d:
        r2 = r2 * 53;
        r3 = defpackage.rhv.d(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0226;
    L_0x0218:
        r2 = r2 * 53;
        r3 = defpackage.rhv.e(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = defpackage.rfc.a(r3);
    L_0x0226:
        r2 = r2 + r3;
    L_0x0227:
        r1 = r1 + 3;
        goto L_0x0005;
    L_0x022b:
        r2 = r2 * 53;
        r0 = r8.p;
        r0 = r0.b(r9);
        r0 = r0.hashCode();
        r2 = r2 + r0;
        r0 = r8.h;
        if (r0 == 0) goto L_0x0249;
    L_0x023c:
        r2 = r2 * 53;
        r0 = r8.q;
        r9 = r0.a(r9);
        r9 = r9.hashCode();
        r2 = r2 + r9;
    L_0x0249:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object):int");
    }

    public final void b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.c.length; i += 3) {
                int c = c(i);
                long j = (long) (1048575 & c);
                int i2 = this.c[i];
                switch ((c >>> 20) & 255) {
                    case 0:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.e(obj2, j));
                        b(obj, i);
                        break;
                    case 1:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.d(obj2, j));
                        b(obj, i);
                        break;
                    case 2:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.b(obj2, j));
                        b(obj, i);
                        break;
                    case 3:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.b(obj2, j));
                        b(obj, i);
                        break;
                    case 4:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 5:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.b(obj2, j));
                        b(obj, i);
                        break;
                    case 6:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 7:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.c(obj2, j));
                        b(obj, i);
                        break;
                    case 8:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.f(obj2, j));
                        b(obj, i);
                        break;
                    case 9:
                        a(obj, obj2, i);
                        break;
                    case 10:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.f(obj2, j));
                        b(obj, i);
                        break;
                    case 11:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 12:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 13:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 14:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.b(obj2, j));
                        b(obj, i);
                        break;
                    case 15:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.a(obj2, j));
                        b(obj, i);
                        break;
                    case 16:
                        if (!a(obj2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.b(obj2, j));
                        b(obj, i);
                        break;
                    case 17:
                        a(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
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
                    case 46:
                    case 47:
                    case 48:
                    case cv.aT /*49*/:
                        this.o.a(obj, obj2, j);
                        break;
                    case cv.aU /*50*/:
                        rhc.a(this.r, obj, obj2, j);
                        break;
                    case cv.aV /*51*/:
                    case cv.aW /*52*/:
                    case cv.aX /*53*/:
                    case cv.aY /*54*/:
                    case cv.aZ /*55*/:
                    case cv.ba /*56*/:
                    case cv.bb /*57*/:
                    case 58:
                    case cv.bc /*59*/:
                        if (!a(obj2, i2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.f(obj2, j));
                        b(obj, i2, i);
                        break;
                    case cv.bd /*60*/:
                        b(obj, obj2, i);
                        break;
                    case cv.be /*61*/:
                    case cv.bf /*62*/:
                    case cv.bg /*63*/:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, i2, i)) {
                            break;
                        }
                        rhv.a(obj, j, rhv.f(obj2, j));
                        b(obj, i2, i);
                        break;
                    case 68:
                        b(obj, obj2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.j) {
                rhc.a(this.p, obj, obj2);
                if (this.h) {
                    rhc.a(this.q, obj, obj2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    private final void a(Object obj, Object obj2, int i) {
        long c = (long) (c(i) & 1048575);
        if (a(obj2, i)) {
            Object f = rhv.f(obj, c);
            obj2 = rhv.f(obj2, c);
            if (f != null && obj2 != null) {
                rhv.a(obj, c, rfc.a(f, obj2));
                b(obj, i);
            } else if (obj2 != null) {
                rhv.a(obj, c, obj2);
                b(obj, i);
            }
        }
    }

    private final void b(Object obj, Object obj2, int i) {
        int c = c(i);
        int i2 = this.c[i];
        long j = (long) (c & 1048575);
        if (a(obj2, i2, i)) {
            Object f = rhv.f(obj, j);
            obj2 = rhv.f(obj2, j);
            if (f != null && obj2 != null) {
                rhv.a(obj, j, rfc.a(f, obj2));
                b(obj, i2, i);
            } else if (obj2 != null) {
                rhv.a(obj, j, obj2);
                b(obj, i2, i);
            }
        }
    }

    /* JADX WARNING: Missing block: B:110:0x0293, code skipped:
            r3 = r3 + ((r5 + r6) + r4);
     */
    /* JADX WARNING: Missing block: B:301:0x06fd, code skipped:
            r4 = r4 + ((r8 + r9) + r7);
     */
    public final int b(java.lang.Object r14) {
        /*
        r13 = this;
        r0 = r13.j;
        r1 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r2 = 0;
        if (r0 == 0) goto L_0x045e;
    L_0x0008:
        r0 = b;
        r3 = 0;
    L_0x000b:
        r4 = r13.c;
        r4 = r4.length;
        if (r2 >= r4) goto L_0x0456;
    L_0x0010:
        r4 = r13.c(r2);
        r5 = r4 >>> 20;
        r5 = r5 & 255;
        r6 = r13.c;
        r6 = r6[r2];
        r4 = r4 & r1;
        r7 = (long) r4;
        r4 = defpackage.ren.DOUBLE_LIST_PACKED;
        r4 = r4.k;
        if (r5 >= r4) goto L_0x0025;
    L_0x0024:
        goto L_0x0029;
    L_0x0025:
        r4 = defpackage.ren.SINT64_LIST_PACKED;
        r4 = r4.k;
    L_0x0029:
        switch(r5) {
            case 0: goto L_0x0446;
            case 1: goto L_0x043a;
            case 2: goto L_0x042a;
            case 3: goto L_0x041a;
            case 4: goto L_0x040a;
            case 5: goto L_0x03fe;
            case 6: goto L_0x03f2;
            case 7: goto L_0x03e6;
            case 8: goto L_0x03c8;
            case 9: goto L_0x03b4;
            case 10: goto L_0x03a3;
            case 11: goto L_0x0394;
            case 12: goto L_0x0385;
            case 13: goto L_0x037a;
            case 14: goto L_0x036f;
            case 15: goto L_0x0360;
            case 16: goto L_0x0351;
            case 17: goto L_0x033c;
            case 18: goto L_0x0331;
            case 19: goto L_0x0328;
            case 20: goto L_0x031f;
            case 21: goto L_0x0316;
            case 22: goto L_0x030d;
            case 23: goto L_0x0304;
            case 24: goto L_0x02fb;
            case 25: goto L_0x02f2;
            case 26: goto L_0x02e9;
            case 27: goto L_0x02dc;
            case 28: goto L_0x02d3;
            case 29: goto L_0x02ca;
            case 30: goto L_0x02c0;
            case 31: goto L_0x02b6;
            case 32: goto L_0x02ac;
            case 33: goto L_0x02a2;
            case 34: goto L_0x0298;
            case 35: goto L_0x027f;
            case 36: goto L_0x026a;
            case 37: goto L_0x0255;
            case 38: goto L_0x0240;
            case 39: goto L_0x022b;
            case 40: goto L_0x0216;
            case 41: goto L_0x0200;
            case 42: goto L_0x01ea;
            case 43: goto L_0x01d4;
            case 44: goto L_0x01be;
            case 45: goto L_0x01a8;
            case 46: goto L_0x0192;
            case 47: goto L_0x017c;
            case 48: goto L_0x0166;
            case 49: goto L_0x0158;
            case 50: goto L_0x014c;
            case 51: goto L_0x0140;
            case 52: goto L_0x0134;
            case 53: goto L_0x0124;
            case 54: goto L_0x0114;
            case 55: goto L_0x0104;
            case 56: goto L_0x00f8;
            case 57: goto L_0x00ec;
            case 58: goto L_0x00e0;
            case 59: goto L_0x00c2;
            case 60: goto L_0x00ae;
            case 61: goto L_0x009c;
            case 62: goto L_0x008c;
            case 63: goto L_0x007c;
            case 64: goto L_0x0070;
            case 65: goto L_0x0064;
            case 66: goto L_0x0054;
            case 67: goto L_0x0044;
            case 68: goto L_0x002e;
            default: goto L_0x002c;
        };
    L_0x002c:
        goto L_0x0452;
    L_0x002e:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0034:
        r4 = defpackage.rhv.f(r14, r7);
        r4 = (defpackage.rgh) r4;
        r5 = r13.a(r2);
        r4 = defpackage.rdt.b(r6, r4, r5);
        goto L_0x0339;
    L_0x0044:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x004a:
        r4 = defpackage.rgl.e(r14, r7);
        r4 = defpackage.rdt.f(r6, r4);
        goto L_0x0339;
    L_0x0054:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x005a:
        r4 = defpackage.rgl.d(r14, r7);
        r4 = defpackage.rdt.h(r6, r4);
        goto L_0x0339;
    L_0x0064:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x006a:
        r4 = defpackage.rdt.h(r6);
        goto L_0x0339;
    L_0x0070:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0076:
        r4 = defpackage.rdt.f(r6);
        goto L_0x0339;
    L_0x007c:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0082:
        r4 = defpackage.rgl.d(r14, r7);
        r4 = defpackage.rdt.i(r6, r4);
        goto L_0x0339;
    L_0x008c:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0092:
        r4 = defpackage.rgl.d(r14, r7);
        r4 = defpackage.rdt.g(r6, r4);
        goto L_0x0339;
    L_0x009c:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00a2:
        r4 = defpackage.rhv.f(r14, r7);
        r4 = (defpackage.rdg) r4;
        r4 = defpackage.rdt.c(r6, r4);
        goto L_0x0339;
    L_0x00ae:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00b4:
        r4 = defpackage.rhv.f(r14, r7);
        r5 = r13.a(r2);
        r4 = defpackage.rhc.a(r6, r4, r5);
        goto L_0x0339;
    L_0x00c2:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00c8:
        r4 = defpackage.rhv.f(r14, r7);
        r5 = r4 instanceof defpackage.rdg;
        if (r5 == 0) goto L_0x00d8;
    L_0x00d0:
        r4 = (defpackage.rdg) r4;
        r4 = defpackage.rdt.c(r6, r4);
        goto L_0x0339;
    L_0x00d8:
        r4 = (java.lang.String) r4;
        r4 = defpackage.rdt.b(r6, r4);
        goto L_0x0339;
    L_0x00e0:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00e6:
        r4 = defpackage.rdt.k(r6);
        goto L_0x0339;
    L_0x00ec:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00f2:
        r4 = defpackage.rdt.e(r6);
        goto L_0x0339;
    L_0x00f8:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x00fe:
        r4 = defpackage.rdt.g(r6);
        goto L_0x0339;
    L_0x0104:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x010a:
        r4 = defpackage.rgl.d(r14, r7);
        r4 = defpackage.rdt.f(r6, r4);
        goto L_0x0339;
    L_0x0114:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x011a:
        r4 = defpackage.rgl.e(r14, r7);
        r4 = defpackage.rdt.e(r6, r4);
        goto L_0x0339;
    L_0x0124:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x012a:
        r4 = defpackage.rgl.e(r14, r7);
        r4 = defpackage.rdt.d(r6, r4);
        goto L_0x0339;
    L_0x0134:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x013a:
        r4 = defpackage.rdt.i(r6);
        goto L_0x0339;
    L_0x0140:
        r4 = r13.a(r14, r6, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0146:
        r4 = defpackage.rdt.j(r6);
        goto L_0x0339;
    L_0x014c:
        r4 = r13.r;
        r5 = defpackage.rhv.f(r14, r7);
        r4 = r4.e(r5);
        goto L_0x0339;
    L_0x0158:
        r4 = defpackage.rgl.a(r14, r7);
        r5 = r13.a(r2);
        r4 = defpackage.rhc.b(r6, r4, r5);
        goto L_0x0339;
    L_0x0166:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.c(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0172:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x017c:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.g(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0188:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x0192:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.i(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x019e:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x01a8:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.h(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x01b4:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x01be:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.d(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x01ca:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x01d4:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.f(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x01e0:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x01ea:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.j(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x01f6:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x0200:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.h(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x020c:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x0216:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.i(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0222:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x022b:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.e(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0237:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x0240:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.b(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x024c:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x0255:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.a(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0261:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x026a:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.h(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x0276:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
        goto L_0x0293;
    L_0x027f:
        r4 = r0.getObject(r14, r7);
        r4 = (java.util.List) r4;
        r4 = defpackage.rhc.i(r4);
        if (r4 <= 0) goto L_0x0452;
    L_0x028b:
        r5 = defpackage.rdt.l(r6);
        r6 = defpackage.rdt.n(r4);
    L_0x0293:
        r5 = r5 + r6;
        r5 = r5 + r4;
        r3 = r3 + r5;
        goto L_0x0452;
    L_0x0298:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.c(r6, r4);
        goto L_0x0339;
    L_0x02a2:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.g(r6, r4);
        goto L_0x0339;
    L_0x02ac:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.i(r6, r4);
        goto L_0x0339;
    L_0x02b6:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.h(r6, r4);
        goto L_0x0339;
    L_0x02c0:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.d(r6, r4);
        goto L_0x0339;
    L_0x02ca:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.f(r6, r4);
        goto L_0x0339;
    L_0x02d3:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.l(r6, r4);
        goto L_0x0339;
    L_0x02dc:
        r4 = defpackage.rgl.a(r14, r7);
        r5 = r13.a(r2);
        r4 = defpackage.rhc.a(r6, r4, r5);
        goto L_0x0339;
    L_0x02e9:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.k(r6, r4);
        goto L_0x0339;
    L_0x02f2:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.j(r6, r4);
        goto L_0x0339;
    L_0x02fb:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.h(r6, r4);
        goto L_0x0339;
    L_0x0304:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.i(r6, r4);
        goto L_0x0339;
    L_0x030d:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.e(r6, r4);
        goto L_0x0339;
    L_0x0316:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.b(r6, r4);
        goto L_0x0339;
    L_0x031f:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.a(r6, r4);
        goto L_0x0339;
    L_0x0328:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.h(r6, r4);
        goto L_0x0339;
    L_0x0331:
        r4 = defpackage.rgl.a(r14, r7);
        r4 = defpackage.rhc.i(r6, r4);
    L_0x0339:
        r3 = r3 + r4;
        goto L_0x0452;
    L_0x033c:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0342:
        r4 = defpackage.rhv.f(r14, r7);
        r4 = (defpackage.rgh) r4;
        r5 = r13.a(r2);
        r4 = defpackage.rdt.b(r6, r4, r5);
        goto L_0x0339;
    L_0x0351:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0357:
        r4 = defpackage.rhv.b(r14, r7);
        r4 = defpackage.rdt.f(r6, r4);
        goto L_0x0339;
    L_0x0360:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0366:
        r4 = defpackage.rhv.a(r14, r7);
        r4 = defpackage.rdt.h(r6, r4);
        goto L_0x0339;
    L_0x036f:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0375:
        r4 = defpackage.rdt.h(r6);
        goto L_0x0339;
    L_0x037a:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0380:
        r4 = defpackage.rdt.f(r6);
        goto L_0x0339;
    L_0x0385:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x038b:
        r4 = defpackage.rhv.a(r14, r7);
        r4 = defpackage.rdt.i(r6, r4);
        goto L_0x0339;
    L_0x0394:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x039a:
        r4 = defpackage.rhv.a(r14, r7);
        r4 = defpackage.rdt.g(r6, r4);
        goto L_0x0339;
    L_0x03a3:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x03a9:
        r4 = defpackage.rhv.f(r14, r7);
        r4 = (defpackage.rdg) r4;
        r4 = defpackage.rdt.c(r6, r4);
        goto L_0x0339;
    L_0x03b4:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x03ba:
        r4 = defpackage.rhv.f(r14, r7);
        r5 = r13.a(r2);
        r4 = defpackage.rhc.a(r6, r4, r5);
        goto L_0x0339;
    L_0x03c8:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x03ce:
        r4 = defpackage.rhv.f(r14, r7);
        r5 = r4 instanceof defpackage.rdg;
        if (r5 == 0) goto L_0x03de;
    L_0x03d6:
        r4 = (defpackage.rdg) r4;
        r4 = defpackage.rdt.c(r6, r4);
        goto L_0x0339;
    L_0x03de:
        r4 = (java.lang.String) r4;
        r4 = defpackage.rdt.b(r6, r4);
        goto L_0x0339;
    L_0x03e6:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x03ec:
        r4 = defpackage.rdt.k(r6);
        goto L_0x0339;
    L_0x03f2:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x03f8:
        r4 = defpackage.rdt.e(r6);
        goto L_0x0339;
    L_0x03fe:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0404:
        r4 = defpackage.rdt.g(r6);
        goto L_0x0339;
    L_0x040a:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0410:
        r4 = defpackage.rhv.a(r14, r7);
        r4 = defpackage.rdt.f(r6, r4);
        goto L_0x0339;
    L_0x041a:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0420:
        r4 = defpackage.rhv.b(r14, r7);
        r4 = defpackage.rdt.e(r6, r4);
        goto L_0x0339;
    L_0x042a:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0430:
        r4 = defpackage.rhv.b(r14, r7);
        r4 = defpackage.rdt.d(r6, r4);
        goto L_0x0339;
    L_0x043a:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x0440:
        r4 = defpackage.rdt.i(r6);
        goto L_0x0339;
    L_0x0446:
        r4 = r13.a(r14, r2);
        if (r4 == 0) goto L_0x0452;
    L_0x044c:
        r4 = defpackage.rdt.j(r6);
        goto L_0x0339;
    L_0x0452:
        r2 = r2 + 3;
        goto L_0x000b;
    L_0x0456:
        r0 = r13.p;
        r14 = defpackage.rgl.a(r0, r14);
        r3 = r3 + r14;
        return r3;
    L_0x045e:
        r0 = b;
        r3 = -1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = -1;
    L_0x0465:
        r7 = r13.c;
        r7 = r7.length;
        if (r3 >= r7) goto L_0x08c1;
    L_0x046a:
        r7 = r13.c(r3);
        r8 = r13.c;
        r9 = r8[r3];
        r10 = r7 >>> 20;
        r10 = r10 & 255;
        r11 = 17;
        if (r10 > r11) goto L_0x048e;
    L_0x047a:
        r11 = r3 + 2;
        r8 = r8[r11];
        r11 = r8 & r1;
        r8 = r8 >>> 20;
        r12 = 1;
        r8 = r12 << r8;
        if (r11 == r6) goto L_0x048f;
    L_0x0487:
        r5 = (long) r11;
        r5 = r0.getInt(r14, r5);
        r6 = r11;
        goto L_0x048f;
    L_0x048e:
        r8 = 0;
    L_0x048f:
        r7 = r7 & r1;
        r11 = (long) r7;
        switch(r10) {
            case 0: goto L_0x08b3;
            case 1: goto L_0x08a9;
            case 2: goto L_0x089b;
            case 3: goto L_0x088d;
            case 4: goto L_0x087f;
            case 5: goto L_0x0875;
            case 6: goto L_0x086b;
            case 7: goto L_0x0861;
            case 8: goto L_0x0845;
            case 9: goto L_0x0834;
            case 10: goto L_0x0825;
            case 11: goto L_0x0818;
            case 12: goto L_0x080b;
            case 13: goto L_0x0802;
            case 14: goto L_0x07f9;
            case 15: goto L_0x07ec;
            case 16: goto L_0x07df;
            case 17: goto L_0x07ca;
            case 18: goto L_0x07bd;
            case 19: goto L_0x07b2;
            case 20: goto L_0x07a7;
            case 21: goto L_0x079c;
            case 22: goto L_0x0791;
            case 23: goto L_0x0786;
            case 24: goto L_0x077b;
            case 25: goto L_0x0770;
            case 26: goto L_0x0765;
            case 27: goto L_0x0756;
            case 28: goto L_0x074a;
            case 29: goto L_0x073e;
            case 30: goto L_0x0732;
            case 31: goto L_0x0726;
            case 32: goto L_0x071a;
            case 33: goto L_0x070e;
            case 34: goto L_0x0702;
            case 35: goto L_0x06e9;
            case 36: goto L_0x06d4;
            case 37: goto L_0x06bf;
            case 38: goto L_0x06aa;
            case 39: goto L_0x0695;
            case 40: goto L_0x0680;
            case 41: goto L_0x066a;
            case 42: goto L_0x0654;
            case 43: goto L_0x063e;
            case 44: goto L_0x0628;
            case 45: goto L_0x0612;
            case 46: goto L_0x05fc;
            case 47: goto L_0x05e6;
            case 48: goto L_0x05d0;
            case 49: goto L_0x05c0;
            case 50: goto L_0x05b4;
            case 51: goto L_0x05a8;
            case 52: goto L_0x059c;
            case 53: goto L_0x058c;
            case 54: goto L_0x057c;
            case 55: goto L_0x056c;
            case 56: goto L_0x0560;
            case 57: goto L_0x0554;
            case 58: goto L_0x0548;
            case 59: goto L_0x052a;
            case 60: goto L_0x0516;
            case 61: goto L_0x0504;
            case 62: goto L_0x04f4;
            case 63: goto L_0x04e4;
            case 64: goto L_0x04d8;
            case 65: goto L_0x04cc;
            case 66: goto L_0x04bc;
            case 67: goto L_0x04ac;
            case 68: goto L_0x0496;
            default: goto L_0x0494;
        };
    L_0x0494:
        goto L_0x08bd;
    L_0x0496:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x049c:
        r7 = r0.getObject(r14, r11);
        r7 = (defpackage.rgh) r7;
        r8 = r13.a(r3);
        r7 = defpackage.rdt.b(r9, r7, r8);
        goto L_0x07c7;
    L_0x04ac:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04b2:
        r7 = defpackage.rgl.e(r14, r11);
        r7 = defpackage.rdt.f(r9, r7);
        goto L_0x07c7;
    L_0x04bc:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04c2:
        r7 = defpackage.rgl.d(r14, r11);
        r7 = defpackage.rdt.h(r9, r7);
        goto L_0x07c7;
    L_0x04cc:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04d2:
        r7 = defpackage.rdt.h(r9);
        goto L_0x07c7;
    L_0x04d8:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04de:
        r7 = defpackage.rdt.f(r9);
        goto L_0x07c7;
    L_0x04e4:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04ea:
        r7 = defpackage.rgl.d(r14, r11);
        r7 = defpackage.rdt.i(r9, r7);
        goto L_0x07c7;
    L_0x04f4:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x04fa:
        r7 = defpackage.rgl.d(r14, r11);
        r7 = defpackage.rdt.g(r9, r7);
        goto L_0x07c7;
    L_0x0504:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x050a:
        r7 = r0.getObject(r14, r11);
        r7 = (defpackage.rdg) r7;
        r7 = defpackage.rdt.c(r9, r7);
        goto L_0x07c7;
    L_0x0516:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x051c:
        r7 = r0.getObject(r14, r11);
        r8 = r13.a(r3);
        r7 = defpackage.rhc.a(r9, r7, r8);
        goto L_0x07c7;
    L_0x052a:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x0530:
        r7 = r0.getObject(r14, r11);
        r8 = r7 instanceof defpackage.rdg;
        if (r8 == 0) goto L_0x0540;
    L_0x0538:
        r7 = (defpackage.rdg) r7;
        r7 = defpackage.rdt.c(r9, r7);
        goto L_0x07c7;
    L_0x0540:
        r7 = (java.lang.String) r7;
        r7 = defpackage.rdt.b(r9, r7);
        goto L_0x07c7;
    L_0x0548:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x054e:
        r7 = defpackage.rdt.k(r9);
        goto L_0x07c7;
    L_0x0554:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x055a:
        r7 = defpackage.rdt.e(r9);
        goto L_0x07c7;
    L_0x0560:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x0566:
        r7 = defpackage.rdt.g(r9);
        goto L_0x07c7;
    L_0x056c:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x0572:
        r7 = defpackage.rgl.d(r14, r11);
        r7 = defpackage.rdt.f(r9, r7);
        goto L_0x07c7;
    L_0x057c:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x0582:
        r7 = defpackage.rgl.e(r14, r11);
        r7 = defpackage.rdt.e(r9, r7);
        goto L_0x07c7;
    L_0x058c:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x0592:
        r7 = defpackage.rgl.e(r14, r11);
        r7 = defpackage.rdt.d(r9, r7);
        goto L_0x07c7;
    L_0x059c:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x05a2:
        r7 = defpackage.rdt.i(r9);
        goto L_0x07c7;
    L_0x05a8:
        r7 = r13.a(r14, r9, r3);
        if (r7 == 0) goto L_0x08bd;
    L_0x05ae:
        r7 = defpackage.rdt.j(r9);
        goto L_0x07c7;
    L_0x05b4:
        r7 = r13.r;
        r8 = r0.getObject(r14, r11);
        r7 = r7.e(r8);
        goto L_0x07c7;
    L_0x05c0:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r8 = r13.a(r3);
        r7 = defpackage.rhc.b(r9, r7, r8);
        goto L_0x07c7;
    L_0x05d0:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.c(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x05dc:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x05e6:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.g(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x05f2:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x05fc:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x0608:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x0612:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x061e:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x0628:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.d(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x0634:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x063e:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.f(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x064a:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x0654:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.j(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x0660:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x066a:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x0676:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x0680:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x068c:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x0695:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.e(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x06a1:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x06aa:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.b(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x06b6:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x06bf:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.a(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x06cb:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x06d4:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x06e0:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
        goto L_0x06fd;
    L_0x06e9:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r7);
        if (r7 <= 0) goto L_0x08bd;
    L_0x06f5:
        r8 = defpackage.rdt.l(r9);
        r9 = defpackage.rdt.n(r7);
    L_0x06fd:
        r8 = r8 + r9;
        r8 = r8 + r7;
        r4 = r4 + r8;
        goto L_0x08bd;
    L_0x0702:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.c(r9, r7);
        goto L_0x07c7;
    L_0x070e:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.g(r9, r7);
        goto L_0x07c7;
    L_0x071a:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r9, r7);
        goto L_0x07c7;
    L_0x0726:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r9, r7);
        goto L_0x07c7;
    L_0x0732:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.d(r9, r7);
        goto L_0x07c7;
    L_0x073e:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.f(r9, r7);
        goto L_0x07c7;
    L_0x074a:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.l(r9, r7);
        goto L_0x07c7;
    L_0x0756:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r8 = r13.a(r3);
        r7 = defpackage.rhc.a(r9, r7, r8);
        goto L_0x07c7;
    L_0x0765:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.k(r9, r7);
        goto L_0x07c7;
    L_0x0770:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.j(r9, r7);
        goto L_0x07c7;
    L_0x077b:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r9, r7);
        goto L_0x07c7;
    L_0x0786:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r9, r7);
        goto L_0x07c7;
    L_0x0791:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.e(r9, r7);
        goto L_0x07c7;
    L_0x079c:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.b(r9, r7);
        goto L_0x07c7;
    L_0x07a7:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.a(r9, r7);
        goto L_0x07c7;
    L_0x07b2:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.h(r9, r7);
        goto L_0x07c7;
    L_0x07bd:
        r7 = r0.getObject(r14, r11);
        r7 = (java.util.List) r7;
        r7 = defpackage.rhc.i(r9, r7);
    L_0x07c7:
        r4 = r4 + r7;
        goto L_0x08bd;
    L_0x07ca:
        r7 = r5 & r8;
        if (r7 != 0) goto L_0x07d0;
    L_0x07ce:
        goto L_0x08bd;
    L_0x07d0:
        r7 = r0.getObject(r14, r11);
        r7 = (defpackage.rgh) r7;
        r8 = r13.a(r3);
        r7 = defpackage.rdt.b(r9, r7, r8);
        goto L_0x07c7;
    L_0x07df:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x07e3:
        r7 = r0.getLong(r14, r11);
        r7 = defpackage.rdt.f(r9, r7);
        goto L_0x07c7;
    L_0x07ec:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x07f0:
        r7 = r0.getInt(r14, r11);
        r7 = defpackage.rdt.h(r9, r7);
        goto L_0x07c7;
    L_0x07f9:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x07fd:
        r7 = defpackage.rdt.h(r9);
        goto L_0x07c7;
    L_0x0802:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0806:
        r7 = defpackage.rdt.f(r9);
        goto L_0x07c7;
    L_0x080b:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x080f:
        r7 = r0.getInt(r14, r11);
        r7 = defpackage.rdt.i(r9, r7);
        goto L_0x07c7;
    L_0x0818:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x081c:
        r7 = r0.getInt(r14, r11);
        r7 = defpackage.rdt.g(r9, r7);
        goto L_0x07c7;
    L_0x0825:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0829:
        r7 = r0.getObject(r14, r11);
        r7 = (defpackage.rdg) r7;
        r7 = defpackage.rdt.c(r9, r7);
        goto L_0x07c7;
    L_0x0834:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0838:
        r7 = r0.getObject(r14, r11);
        r8 = r13.a(r3);
        r7 = defpackage.rhc.a(r9, r7, r8);
        goto L_0x07c7;
    L_0x0845:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0849:
        r7 = r0.getObject(r14, r11);
        r8 = r7 instanceof defpackage.rdg;
        if (r8 == 0) goto L_0x0859;
    L_0x0851:
        r7 = (defpackage.rdg) r7;
        r7 = defpackage.rdt.c(r9, r7);
        goto L_0x07c7;
    L_0x0859:
        r7 = (java.lang.String) r7;
        r7 = defpackage.rdt.b(r9, r7);
        goto L_0x07c7;
    L_0x0861:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0865:
        r7 = defpackage.rdt.k(r9);
        goto L_0x07c7;
    L_0x086b:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x086f:
        r7 = defpackage.rdt.e(r9);
        goto L_0x07c7;
    L_0x0875:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0879:
        r7 = defpackage.rdt.g(r9);
        goto L_0x07c7;
    L_0x087f:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0883:
        r7 = r0.getInt(r14, r11);
        r7 = defpackage.rdt.f(r9, r7);
        goto L_0x07c7;
    L_0x088d:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x0891:
        r7 = r0.getLong(r14, r11);
        r7 = defpackage.rdt.e(r9, r7);
        goto L_0x07c7;
    L_0x089b:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x089f:
        r7 = r0.getLong(r14, r11);
        r7 = defpackage.rdt.d(r9, r7);
        goto L_0x07c7;
    L_0x08a9:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x08ad:
        r7 = defpackage.rdt.i(r9);
        goto L_0x07c7;
    L_0x08b3:
        r7 = r5 & r8;
        if (r7 == 0) goto L_0x08bd;
    L_0x08b7:
        r7 = defpackage.rdt.j(r9);
        goto L_0x07c7;
    L_0x08bd:
        r3 = r3 + 3;
        goto L_0x0465;
    L_0x08c1:
        r0 = r13.p;
        r0 = defpackage.rgl.a(r0, r14);
        r4 = r4 + r0;
        r0 = r13.h;
        if (r0 == 0) goto L_0x091a;
    L_0x08cc:
        r0 = r13.q;
        r14 = r0.a(r14);
        r0 = 0;
    L_0x08d3:
        r1 = r14.a;
        r1 = r1.b();
        if (r2 >= r1) goto L_0x08f3;
    L_0x08db:
        r1 = r14.a;
        r1 = r1.b(r2);
        r3 = r1.getKey();
        r3 = (defpackage.reo) r3;
        r1 = r1.getValue();
        r1 = defpackage.rem.b(r3, r1);
        r0 = r0 + r1;
        r2 = r2 + 1;
        goto L_0x08d3;
    L_0x08f3:
        r14 = r14.a;
        r14 = r14.c();
        r14 = r14.iterator();
    L_0x08fd:
        r1 = r14.hasNext();
        if (r1 == 0) goto L_0x0919;
    L_0x0903:
        r1 = r14.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (defpackage.reo) r2;
        r1 = r1.getValue();
        r1 = defpackage.rem.b(r2, r1);
        r0 = r0 + r1;
        goto L_0x08fd;
    L_0x0919:
        r4 = r4 + r0;
    L_0x091a:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.b(java.lang.Object):int");
    }

    private static int a(rhp rhp, Object obj) {
        return rhp.f(rhp.b(obj));
    }

    private static List a(Object obj, long j) {
        return (List) rhv.f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0507  */
    public final void a(java.lang.Object r13, defpackage.rik r14) {
        /*
        r12 = this;
        r0 = r12.j;
        if (r0 == 0) goto L_0x0522;
    L_0x0004:
        r0 = r12.h;
        r1 = 0;
        if (r0 == 0) goto L_0x0020;
    L_0x0009:
        r0 = r12.q;
        r0 = r0.a(r13);
        r2 = r0.a();
        if (r2 != 0) goto L_0x0020;
    L_0x0015:
        r0 = r0.c();
        r2 = r0.next();
        r2 = (java.util.Map.Entry) r2;
        goto L_0x0022;
    L_0x0020:
        r0 = r1;
        r2 = r0;
    L_0x0022:
        r3 = r12.c;
        r3 = r3.length;
        r4 = 0;
        r5 = r2;
        r2 = 0;
    L_0x0028:
        if (r2 >= r3) goto L_0x0505;
    L_0x002a:
        r6 = r12.c(r2);
        r7 = r12.c;
        r7 = r7[r2];
    L_0x0032:
        if (r5 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0051;
    L_0x0035:
        r8 = r12.q;
        r8 = r8.a(r5);
        if (r8 > r7) goto L_0x0051;
    L_0x003d:
        r8 = r12.q;
        r8.a(r14, r5);
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x004f;
    L_0x0048:
        r5 = r0.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0032;
    L_0x004f:
        r5 = r1;
        goto L_0x0032;
    L_0x0051:
        r8 = r6 >>> 20;
        r8 = r8 & 255;
        r9 = 1;
        r10 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        switch(r8) {
            case 0: goto L_0x04f2;
            case 1: goto L_0x04e2;
            case 2: goto L_0x04d2;
            case 3: goto L_0x04c2;
            case 4: goto L_0x04b2;
            case 5: goto L_0x04a2;
            case 6: goto L_0x0492;
            case 7: goto L_0x0481;
            case 8: goto L_0x0470;
            case 9: goto L_0x045b;
            case 10: goto L_0x0448;
            case 11: goto L_0x0437;
            case 12: goto L_0x0426;
            case 13: goto L_0x0415;
            case 14: goto L_0x0404;
            case 15: goto L_0x03f3;
            case 16: goto L_0x03e2;
            case 17: goto L_0x03cd;
            case 18: goto L_0x03bc;
            case 19: goto L_0x03ab;
            case 20: goto L_0x039a;
            case 21: goto L_0x0389;
            case 22: goto L_0x0378;
            case 23: goto L_0x0367;
            case 24: goto L_0x0356;
            case 25: goto L_0x0345;
            case 26: goto L_0x0334;
            case 27: goto L_0x031f;
            case 28: goto L_0x030e;
            case 29: goto L_0x02fd;
            case 30: goto L_0x02ec;
            case 31: goto L_0x02db;
            case 32: goto L_0x02ca;
            case 33: goto L_0x02b9;
            case 34: goto L_0x02a8;
            case 35: goto L_0x0297;
            case 36: goto L_0x0286;
            case 37: goto L_0x0275;
            case 38: goto L_0x0264;
            case 39: goto L_0x0253;
            case 40: goto L_0x0242;
            case 41: goto L_0x0231;
            case 42: goto L_0x0220;
            case 43: goto L_0x020f;
            case 44: goto L_0x01fe;
            case 45: goto L_0x01ed;
            case 46: goto L_0x01dc;
            case 47: goto L_0x01cb;
            case 48: goto L_0x01ba;
            case 49: goto L_0x01a5;
            case 50: goto L_0x019a;
            case 51: goto L_0x0189;
            case 52: goto L_0x0178;
            case 53: goto L_0x0167;
            case 54: goto L_0x0156;
            case 55: goto L_0x0145;
            case 56: goto L_0x0134;
            case 57: goto L_0x0123;
            case 58: goto L_0x0112;
            case 59: goto L_0x0101;
            case 60: goto L_0x00ec;
            case 61: goto L_0x00d9;
            case 62: goto L_0x00c8;
            case 63: goto L_0x00b7;
            case 64: goto L_0x00a6;
            case 65: goto L_0x0095;
            case 66: goto L_0x0084;
            case 67: goto L_0x0073;
            case 68: goto L_0x005e;
            default: goto L_0x005c;
        };
    L_0x005c:
        goto L_0x0501;
    L_0x005e:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0064:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r8 = r12.a(r2);
        r14.b(r7, r6, r8);
        goto L_0x0501;
    L_0x0073:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0079:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.e(r13, r8);
        r14.e(r7, r8);
        goto L_0x0501;
    L_0x0084:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x008a:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.f(r7, r6);
        goto L_0x0501;
    L_0x0095:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x009b:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.e(r13, r8);
        r14.b(r7, r8);
        goto L_0x0501;
    L_0x00a6:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x00ac:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x00b7:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x00bd:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.b(r7, r6);
        goto L_0x0501;
    L_0x00c8:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x00ce:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.e(r7, r6);
        goto L_0x0501;
    L_0x00d9:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x00df:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (defpackage.rdg) r6;
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x00ec:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x00f2:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r8 = r12.a(r2);
        r14.a(r7, r6, r8);
        goto L_0x0501;
    L_0x0101:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0107:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        defpackage.rgl.a(r7, r6, r14);
        goto L_0x0501;
    L_0x0112:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0118:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.f(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x0123:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0129:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.d(r7, r6);
        goto L_0x0501;
    L_0x0134:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x013a:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.e(r13, r8);
        r14.d(r7, r8);
        goto L_0x0501;
    L_0x0145:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x014b:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.d(r13, r8);
        r14.c(r7, r6);
        goto L_0x0501;
    L_0x0156:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x015c:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.e(r13, r8);
        r14.c(r7, r8);
        goto L_0x0501;
    L_0x0167:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x016d:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.e(r13, r8);
        r14.a(r7, r8);
        goto L_0x0501;
    L_0x0178:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x017e:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rgl.c(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x0189:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x018f:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rgl.b(r13, r8);
        r14.a(r7, r8);
        goto L_0x0501;
    L_0x019a:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r12.a(r14, r7, r6);
        goto L_0x0501;
    L_0x01a5:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        r8 = r12.a(r2);
        defpackage.rhc.b(r7, r6, r14, r8);
        goto L_0x0501;
    L_0x01ba:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.e(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x01cb:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.j(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x01dc:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.g(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x01ed:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.l(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x01fe:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.m(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x020f:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.i(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0220:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.n(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0231:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.k(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0242:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.f(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0253:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.h(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0264:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.d(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0275:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.c(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0286:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.b(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x0297:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r10 = (long) r6;
        r6 = defpackage.rhv.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.rhc.a(r7, r6, r14, r9);
        goto L_0x0501;
    L_0x02a8:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.e(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x02b9:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.j(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x02ca:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.g(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x02db:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.l(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x02ec:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.m(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x02fd:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.i(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x030e:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.b(r7, r6, r14);
        goto L_0x0501;
    L_0x031f:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        r8 = r12.a(r2);
        defpackage.rhc.a(r7, r6, r14, r8);
        goto L_0x0501;
    L_0x0334:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.a(r7, r6, r14);
        goto L_0x0501;
    L_0x0345:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.n(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x0356:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.k(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x0367:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.f(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x0378:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.h(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x0389:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.d(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x039a:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.c(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x03ab:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.b(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x03bc:
        r7 = r12.c;
        r7 = r7[r2];
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.rhc.a(r7, r6, r14, r4);
        goto L_0x0501;
    L_0x03cd:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x03d3:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r8 = r12.a(r2);
        r14.b(r7, r6, r8);
        goto L_0x0501;
    L_0x03e2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x03e8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.b(r13, r8);
        r14.e(r7, r8);
        goto L_0x0501;
    L_0x03f3:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x03f9:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.f(r7, r6);
        goto L_0x0501;
    L_0x0404:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x040a:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.b(r13, r8);
        r14.b(r7, r8);
        goto L_0x0501;
    L_0x0415:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x041b:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x0426:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x042c:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.b(r7, r6);
        goto L_0x0501;
    L_0x0437:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x043d:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.e(r7, r6);
        goto L_0x0501;
    L_0x0448:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x044e:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r6 = (defpackage.rdg) r6;
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x045b:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0461:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        r8 = r12.a(r2);
        r14.a(r7, r6, r8);
        goto L_0x0501;
    L_0x0470:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0476:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.f(r13, r8);
        defpackage.rgl.a(r7, r6, r14);
        goto L_0x0501;
    L_0x0481:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0487:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.c(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x0492:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x0498:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.d(r7, r6);
        goto L_0x0501;
    L_0x04a2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04a8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.b(r13, r8);
        r14.d(r7, r8);
        goto L_0x0501;
    L_0x04b2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04b8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.a(r13, r8);
        r14.c(r7, r6);
        goto L_0x0501;
    L_0x04c2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04c8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.b(r13, r8);
        r14.c(r7, r8);
        goto L_0x0501;
    L_0x04d2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04d8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.b(r13, r8);
        r14.a(r7, r8);
        goto L_0x0501;
    L_0x04e2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04e8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r6 = defpackage.rhv.d(r13, r8);
        r14.a(r7, r6);
        goto L_0x0501;
    L_0x04f2:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x0501;
    L_0x04f8:
        r6 = r6 & r10;
        r8 = (long) r6;
        r8 = defpackage.rhv.e(r13, r8);
        r14.a(r7, r8);
    L_0x0501:
        r2 = r2 + 3;
        goto L_0x0028;
    L_0x0505:
        if (r5 == 0) goto L_0x051c;
    L_0x0507:
        r2 = r12.q;
        r2.a(r14, r5);
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x051a;
    L_0x0512:
        r2 = r0.next();
        r5 = r2;
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0505;
    L_0x051a:
        r5 = r1;
        goto L_0x0505;
    L_0x051c:
        r0 = r12.p;
        defpackage.rgl.a(r0, r13, r14);
        return;
    L_0x0522:
        r12.b(r13, r14);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, rik):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04a5  */
    private final void b(java.lang.Object r18, defpackage.rik r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r0.h;
        if (r3 == 0) goto L_0x0021;
    L_0x000a:
        r3 = r0.q;
        r3 = r3.a(r1);
        r5 = r3.a();
        if (r5 != 0) goto L_0x0021;
    L_0x0016:
        r3 = r3.c();
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0023;
    L_0x0021:
        r3 = 0;
        r5 = 0;
    L_0x0023:
        r6 = r0.c;
        r6 = r6.length;
        r7 = b;
        r8 = -1;
        r11 = r5;
        r5 = 0;
        r10 = 0;
    L_0x002c:
        if (r5 >= r6) goto L_0x04a3;
    L_0x002e:
        r12 = r0.c(r5);
        r13 = r0.c;
        r14 = r13[r5];
        r15 = r12 >>> 20;
        r15 = r15 & 255;
        r4 = r0.j;
        r16 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r4 == 0) goto L_0x0043;
    L_0x0041:
        r9 = 0;
        goto L_0x005c;
    L_0x0043:
        r4 = 17;
        if (r15 > r4) goto L_0x0041;
    L_0x0047:
        r4 = r5 + 2;
        r4 = r13[r4];
        r13 = r4 & r16;
        if (r13 == r8) goto L_0x0055;
    L_0x004f:
        r9 = (long) r13;
        r10 = r7.getInt(r1, r9);
        goto L_0x0056;
    L_0x0055:
        r13 = r8;
    L_0x0056:
        r4 = r4 >>> 20;
        r8 = 1;
        r9 = r8 << r4;
        r8 = r13;
    L_0x005c:
        if (r11 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x007c;
    L_0x005f:
        r4 = r0.q;
        r4 = r4.a(r11);
        if (r4 > r14) goto L_0x007c;
    L_0x0067:
        r4 = r0.q;
        r4.a(r2, r11);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x007a;
    L_0x0072:
        r4 = r3.next();
        r11 = r4;
        r11 = (java.util.Map.Entry) r11;
        goto L_0x005c;
    L_0x007a:
        r11 = 0;
        goto L_0x005c;
    L_0x007c:
        r4 = r12 & r16;
        r12 = (long) r4;
        switch(r15) {
            case 0: goto L_0x0493;
            case 1: goto L_0x0486;
            case 2: goto L_0x0479;
            case 3: goto L_0x046c;
            case 4: goto L_0x045f;
            case 5: goto L_0x0452;
            case 6: goto L_0x0445;
            case 7: goto L_0x0438;
            case 8: goto L_0x042a;
            case 9: goto L_0x0418;
            case 10: goto L_0x0408;
            case 11: goto L_0x03fa;
            case 12: goto L_0x03ec;
            case 13: goto L_0x03de;
            case 14: goto L_0x03d0;
            case 15: goto L_0x03c2;
            case 16: goto L_0x03b4;
            case 17: goto L_0x03a2;
            case 18: goto L_0x0392;
            case 19: goto L_0x0382;
            case 20: goto L_0x0372;
            case 21: goto L_0x0362;
            case 22: goto L_0x0352;
            case 23: goto L_0x0342;
            case 24: goto L_0x0332;
            case 25: goto L_0x0322;
            case 26: goto L_0x0313;
            case 27: goto L_0x0300;
            case 28: goto L_0x02f1;
            case 29: goto L_0x02e1;
            case 30: goto L_0x02d1;
            case 31: goto L_0x02c1;
            case 32: goto L_0x02b1;
            case 33: goto L_0x02a1;
            case 34: goto L_0x0291;
            case 35: goto L_0x0281;
            case 36: goto L_0x0271;
            case 37: goto L_0x0261;
            case 38: goto L_0x0251;
            case 39: goto L_0x0241;
            case 40: goto L_0x0231;
            case 41: goto L_0x0221;
            case 42: goto L_0x0211;
            case 43: goto L_0x0201;
            case 44: goto L_0x01f1;
            case 45: goto L_0x01e1;
            case 46: goto L_0x01d1;
            case 47: goto L_0x01c1;
            case 48: goto L_0x01b1;
            case 49: goto L_0x019e;
            case 50: goto L_0x0195;
            case 51: goto L_0x0186;
            case 52: goto L_0x0177;
            case 53: goto L_0x0168;
            case 54: goto L_0x0159;
            case 55: goto L_0x014a;
            case 56: goto L_0x013b;
            case 57: goto L_0x012c;
            case 58: goto L_0x011d;
            case 59: goto L_0x010e;
            case 60: goto L_0x00fb;
            case 61: goto L_0x00eb;
            case 62: goto L_0x00dd;
            case 63: goto L_0x00cf;
            case 64: goto L_0x00c1;
            case 65: goto L_0x00b3;
            case 66: goto L_0x00a5;
            case 67: goto L_0x0097;
            case 68: goto L_0x0085;
            default: goto L_0x0082;
        };
    L_0x0082:
        r15 = 0;
        goto L_0x049f;
    L_0x0085:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x008b:
        r4 = r7.getObject(r1, r12);
        r9 = r0.a(r5);
        r2.b(r14, r4, r9);
        goto L_0x0082;
    L_0x0097:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x009d:
        r12 = defpackage.rgl.e(r1, r12);
        r2.e(r14, r12);
        goto L_0x0082;
    L_0x00a5:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00ab:
        r4 = defpackage.rgl.d(r1, r12);
        r2.f(r14, r4);
        goto L_0x0082;
    L_0x00b3:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00b9:
        r12 = defpackage.rgl.e(r1, r12);
        r2.b(r14, r12);
        goto L_0x0082;
    L_0x00c1:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00c7:
        r4 = defpackage.rgl.d(r1, r12);
        r2.a(r14, r4);
        goto L_0x0082;
    L_0x00cf:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00d5:
        r4 = defpackage.rgl.d(r1, r12);
        r2.b(r14, r4);
        goto L_0x0082;
    L_0x00dd:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00e3:
        r4 = defpackage.rgl.d(r1, r12);
        r2.e(r14, r4);
        goto L_0x0082;
    L_0x00eb:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x00f1:
        r4 = r7.getObject(r1, r12);
        r4 = (defpackage.rdg) r4;
        r2.a(r14, r4);
        goto L_0x0082;
    L_0x00fb:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0101:
        r4 = r7.getObject(r1, r12);
        r9 = r0.a(r5);
        r2.a(r14, r4, r9);
        goto L_0x0082;
    L_0x010e:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0114:
        r4 = r7.getObject(r1, r12);
        defpackage.rgl.a(r14, r4, r2);
        goto L_0x0082;
    L_0x011d:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0123:
        r4 = defpackage.rgl.f(r1, r12);
        r2.a(r14, r4);
        goto L_0x0082;
    L_0x012c:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0132:
        r4 = defpackage.rgl.d(r1, r12);
        r2.d(r14, r4);
        goto L_0x0082;
    L_0x013b:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0141:
        r12 = defpackage.rgl.e(r1, r12);
        r2.d(r14, r12);
        goto L_0x0082;
    L_0x014a:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0150:
        r4 = defpackage.rgl.d(r1, r12);
        r2.c(r14, r4);
        goto L_0x0082;
    L_0x0159:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x015f:
        r12 = defpackage.rgl.e(r1, r12);
        r2.c(r14, r12);
        goto L_0x0082;
    L_0x0168:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x016e:
        r12 = defpackage.rgl.e(r1, r12);
        r2.a(r14, r12);
        goto L_0x0082;
    L_0x0177:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x017d:
        r4 = defpackage.rgl.c(r1, r12);
        r2.a(r14, r4);
        goto L_0x0082;
    L_0x0186:
        r4 = r0.a(r1, r14, r5);
        if (r4 == 0) goto L_0x0082;
    L_0x018c:
        r12 = defpackage.rgl.b(r1, r12);
        r2.a(r14, r12);
        goto L_0x0082;
    L_0x0195:
        r4 = r7.getObject(r1, r12);
        r0.a(r2, r14, r4);
        goto L_0x0082;
    L_0x019e:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.a(r5);
        defpackage.rhc.b(r4, r9, r2, r12);
        goto L_0x0082;
    L_0x01b1:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 1;
        defpackage.rhc.e(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x01c1:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.j(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x01d1:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.g(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x01e1:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.l(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x01f1:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.m(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0201:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.i(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0211:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.n(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0221:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.k(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0231:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.f(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0241:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.h(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0251:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.d(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0261:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.c(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0271:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.b(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0281:
        r14 = 1;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.a(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x0291:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 0;
        defpackage.rhc.e(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02a1:
        r14 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.j(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02b1:
        r14 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.g(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02c1:
        r14 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.l(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02d1:
        r14 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.m(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02e1:
        r14 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.i(r4, r9, r2, r14);
        goto L_0x0082;
    L_0x02f1:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.b(r4, r9, r2);
        goto L_0x0082;
    L_0x0300:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.a(r5);
        defpackage.rhc.a(r4, r9, r2, r12);
        goto L_0x0082;
    L_0x0313:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.a(r4, r9, r2);
        goto L_0x0082;
    L_0x0322:
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r15 = 0;
        defpackage.rhc.n(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0332:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.k(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0342:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.f(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0352:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.h(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0362:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.d(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0372:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.c(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0382:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.b(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x0392:
        r15 = 0;
        r4 = r0.c;
        r4 = r4[r5];
        r9 = r7.getObject(r1, r12);
        r9 = (java.util.List) r9;
        defpackage.rhc.a(r4, r9, r2, r15);
        goto L_0x049f;
    L_0x03a2:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03a7:
        r4 = r7.getObject(r1, r12);
        r9 = r0.a(r5);
        r2.b(r14, r4, r9);
        goto L_0x049f;
    L_0x03b4:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03b9:
        r12 = r7.getLong(r1, r12);
        r2.e(r14, r12);
        goto L_0x049f;
    L_0x03c2:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03c7:
        r4 = r7.getInt(r1, r12);
        r2.f(r14, r4);
        goto L_0x049f;
    L_0x03d0:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03d5:
        r12 = r7.getLong(r1, r12);
        r2.b(r14, r12);
        goto L_0x049f;
    L_0x03de:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03e3:
        r4 = r7.getInt(r1, r12);
        r2.a(r14, r4);
        goto L_0x049f;
    L_0x03ec:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03f1:
        r4 = r7.getInt(r1, r12);
        r2.b(r14, r4);
        goto L_0x049f;
    L_0x03fa:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x03ff:
        r4 = r7.getInt(r1, r12);
        r2.e(r14, r4);
        goto L_0x049f;
    L_0x0408:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x040d:
        r4 = r7.getObject(r1, r12);
        r4 = (defpackage.rdg) r4;
        r2.a(r14, r4);
        goto L_0x049f;
    L_0x0418:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x041d:
        r4 = r7.getObject(r1, r12);
        r9 = r0.a(r5);
        r2.a(r14, r4, r9);
        goto L_0x049f;
    L_0x042a:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x042f:
        r4 = r7.getObject(r1, r12);
        defpackage.rgl.a(r14, r4, r2);
        goto L_0x049f;
    L_0x0438:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x043d:
        r4 = defpackage.rhv.c(r1, r12);
        r2.a(r14, r4);
        goto L_0x049f;
    L_0x0445:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x044a:
        r4 = r7.getInt(r1, r12);
        r2.d(r14, r4);
        goto L_0x049f;
    L_0x0452:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x0457:
        r12 = r7.getLong(r1, r12);
        r2.d(r14, r12);
        goto L_0x049f;
    L_0x045f:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x0464:
        r4 = r7.getInt(r1, r12);
        r2.c(r14, r4);
        goto L_0x049f;
    L_0x046c:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x0471:
        r12 = r7.getLong(r1, r12);
        r2.c(r14, r12);
        goto L_0x049f;
    L_0x0479:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x047e:
        r12 = r7.getLong(r1, r12);
        r2.a(r14, r12);
        goto L_0x049f;
    L_0x0486:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x048b:
        r4 = defpackage.rhv.d(r1, r12);
        r2.a(r14, r4);
        goto L_0x049f;
    L_0x0493:
        r15 = 0;
        r4 = r10 & r9;
        if (r4 == 0) goto L_0x049f;
    L_0x0498:
        r12 = defpackage.rhv.e(r1, r12);
        r2.a(r14, r12);
    L_0x049f:
        r5 = r5 + 3;
        goto L_0x002c;
    L_0x04a3:
        if (r11 == 0) goto L_0x04ba;
    L_0x04a5:
        r4 = r0.q;
        r4.a(r2, r11);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x04b8;
    L_0x04b0:
        r4 = r3.next();
        r11 = r4;
        r11 = (java.util.Map.Entry) r11;
        goto L_0x04a3;
    L_0x04b8:
        r11 = 0;
        goto L_0x04a3;
    L_0x04ba:
        r3 = r0.p;
        defpackage.rgl.a(r3, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.b(java.lang.Object, rik):void");
    }

    private final void a(rik rik, int i, Object obj) {
        if (obj != null) {
            rfz b = this.r.b();
            for (Entry entry : this.r.b(obj).entrySet()) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                rdz.a.b(rga.a(b, entry.getKey(), entry.getValue()));
                rga.a(rdz.a, b, entry.getKey(), entry.getValue());
            }
        }
    }

    private static void a(rhp rhp, Object obj, rik rik) {
        rhp.a(rhp.b(obj), rik);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x05d7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05c6 A:{LOOP_END, LOOP:10: B:165:0x05c2->B:167:0x05c6} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x05d6 A:{REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x05d3  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0534 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:119|120|(1:122)|123|(6:174|125|(2:128|126)|256|(1:130)|131)(1:252)) */
    /* JADX WARNING: Missing block: B:120:?, code skipped:
            r6.a();
     */
    /* JADX WARNING: Missing block: B:121:0x0537, code skipped:
            if (r9 == null) goto L_0x0539;
     */
    /* JADX WARNING: Missing block: B:122:0x0539, code skipped:
            r9 = r6.c(r13);
     */
    /* JADX WARNING: Missing block: B:124:0x0542, code skipped:
            if (r6.a(r9, r14) == false) goto L_0x0544;
     */
    /* JADX WARNING: Missing block: B:125:0x0544, code skipped:
            r14 = r12.l;
     */
    /* JADX WARNING: Missing block: B:127:0x0548, code skipped:
            if (r14 < r12.m) goto L_0x054a;
     */
    /* JADX WARNING: Missing block: B:128:0x054a, code skipped:
            r9 = a(r13, r12.k[r14], r9, r6);
            r14 = r14 + 1;
     */
    /* JADX WARNING: Missing block: B:129:0x0555, code skipped:
            if (r9 != null) goto L_0x0557;
     */
    /* JADX WARNING: Missing block: B:130:0x0557, code skipped:
            r6.b(r13, r9);
     */
    /* JADX WARNING: Missing block: B:131:0x055a, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:171:0x05dd, code skipped:
            throw new java.lang.NullPointerException();
     */
    public final void a(java.lang.Object r13, defpackage.rgx r14, defpackage.reg r15) {
        /*
        r12 = this;
        if (r15 == 0) goto L_0x05d7;
    L_0x0002:
        r6 = r12.p;
        r7 = r12.q;
        r8 = 0;
        r0 = r8;
        r9 = r0;
    L_0x0009:
        r1 = r14.a();	 Catch:{ all -> 0x0531 }
        r2 = r12.f(r1);	 Catch:{ all -> 0x0531 }
        if (r2 < 0) goto L_0x055b;
    L_0x0013:
        r3 = r12.c(r2);	 Catch:{ all -> 0x0531 }
        r4 = r3 >>> 20;
        r4 = r4 & 255;
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        switch(r4) {
            case 0: goto L_0x0504;
            case 1: goto L_0x04f5;
            case 2: goto L_0x04e6;
            case 3: goto L_0x04d7;
            case 4: goto L_0x04c8;
            case 5: goto L_0x04b9;
            case 6: goto L_0x04aa;
            case 7: goto L_0x049b;
            case 8: goto L_0x0493;
            case 9: goto L_0x0462;
            case 10: goto L_0x0453;
            case 11: goto L_0x0444;
            case 12: goto L_0x0422;
            case 13: goto L_0x0413;
            case 14: goto L_0x0404;
            case 15: goto L_0x03f5;
            case 16: goto L_0x03e6;
            case 17: goto L_0x03b5;
            case 18: goto L_0x03a7;
            case 19: goto L_0x0399;
            case 20: goto L_0x038b;
            case 21: goto L_0x037d;
            case 22: goto L_0x036f;
            case 23: goto L_0x0361;
            case 24: goto L_0x0353;
            case 25: goto L_0x0345;
            case 26: goto L_0x0323;
            case 27: goto L_0x0311;
            case 28: goto L_0x0303;
            case 29: goto L_0x02f5;
            case 30: goto L_0x02e0;
            case 31: goto L_0x02d2;
            case 32: goto L_0x02c4;
            case 33: goto L_0x02b6;
            case 34: goto L_0x02a8;
            case 35: goto L_0x029a;
            case 36: goto L_0x028c;
            case 37: goto L_0x027e;
            case 38: goto L_0x0270;
            case 39: goto L_0x0262;
            case 40: goto L_0x0254;
            case 41: goto L_0x0246;
            case 42: goto L_0x0238;
            case 43: goto L_0x022a;
            case 44: goto L_0x0215;
            case 45: goto L_0x0207;
            case 46: goto L_0x01f9;
            case 47: goto L_0x01eb;
            case 48: goto L_0x01dd;
            case 49: goto L_0x01cb;
            case 50: goto L_0x018c;
            case 51: goto L_0x017a;
            case 52: goto L_0x0168;
            case 53: goto L_0x0156;
            case 54: goto L_0x0144;
            case 55: goto L_0x0132;
            case 56: goto L_0x0120;
            case 57: goto L_0x010e;
            case 58: goto L_0x00fc;
            case 59: goto L_0x00f4;
            case 60: goto L_0x00c3;
            case 61: goto L_0x00b5;
            case 62: goto L_0x00a3;
            case 63: goto L_0x007e;
            case 64: goto L_0x006d;
            case 65: goto L_0x005c;
            case 66: goto L_0x004b;
            case 67: goto L_0x003a;
            case 68: goto L_0x0029;
            default: goto L_0x0021;
        };
    L_0x0021:
        if (r9 != 0) goto L_0x0514;
    L_0x0023:
        r1 = r6.b();	 Catch:{ rfj -> 0x0534 }
        goto L_0x0513;
    L_0x0029:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r5 = r14.b(r5, r15);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x003a:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.t();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x004b:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.s();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x005c:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.r();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x006d:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.q();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x007e:
        r4 = r14.p();	 Catch:{ rfj -> 0x0534 }
        r10 = r12.b(r2);	 Catch:{ rfj -> 0x0534 }
        if (r10 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r10 = r10.a(r4);	 Catch:{ rfj -> 0x0534 }
        if (r10 != 0) goto L_0x0095;
    L_0x008f:
        r9 = defpackage.rhc.a(r1, r4, r9, r6);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0095:
        r3 = r3 & r5;
        r10 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r10, r3);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x00a3:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.o();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x00b5:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.n();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x00c3:
        r4 = r12.a(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        if (r4 == 0) goto L_0x00df;
    L_0x00c9:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = defpackage.rhv.f(r13, r3);	 Catch:{ rfj -> 0x0534 }
        r10 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r10 = r14.a(r10, r15);	 Catch:{ rfj -> 0x0534 }
        r5 = defpackage.rfc.a(r5, r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        goto L_0x00ef;
    L_0x00df:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r5 = r14.a(r5, r15);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
    L_0x00ef:
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x00f4:
        r12.a(r13, r3, r14);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x00fc:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.k();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x010e:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.j();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0120:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.i();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0132:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.h();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0144:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.f();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0156:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.g();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0168:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r5 = r14.e();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x017a:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.d();	 Catch:{ rfj -> 0x0534 }
        r5 = java.lang.Double.valueOf(r10);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r5);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r1, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x018c:
        r1 = r12.c(r2);	 Catch:{ rfj -> 0x0534 }
        r1 = r1 & r5;
        r1 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r3 = defpackage.rhv.f(r13, r1);	 Catch:{ rfj -> 0x0534 }
        if (r3 != 0) goto L_0x01a2;
    L_0x0198:
        r3 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r3 = r3.a();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r1, r3);	 Catch:{ rfj -> 0x0534 }
        goto L_0x01ba;
    L_0x01a2:
        r4 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r4 = r4.c(r3);	 Catch:{ rfj -> 0x0534 }
        if (r4 != 0) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01ba;
    L_0x01ab:
        r4 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r4 = r4.a();	 Catch:{ rfj -> 0x0534 }
        r5 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r5.a(r4, r3);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r1, r4);	 Catch:{ rfj -> 0x0534 }
        r3 = r4;
    L_0x01ba:
        r1 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r3);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.r;	 Catch:{ rfj -> 0x0534 }
        r2 = r2.b();	 Catch:{ rfj -> 0x0534 }
        r14.a(r1, r2, r15);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x01cb:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r2.a(r13, r3);	 Catch:{ rfj -> 0x0534 }
        r14.b(r2, r1, r15);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x01dd:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.q(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x01eb:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.p(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x01f9:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.o(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0207:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.n(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0215:
        r4 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r3 = r3 & r5;
        r10 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r3 = r4.a(r13, r10);	 Catch:{ rfj -> 0x0534 }
        r14.m(r3);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.b(r2);	 Catch:{ rfj -> 0x0534 }
        r9 = defpackage.rhc.a(r1, r3, r2, r9, r6);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x022a:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.l(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0238:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.h(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0246:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.g(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0254:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.f(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0262:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.e(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0270:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.c(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x027e:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.d(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x028c:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.b(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x029a:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.a(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02a8:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.q(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02b6:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.p(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02c4:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.o(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02d2:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.n(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02e0:
        r4 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r3 = r3 & r5;
        r10 = (long) r3;	 Catch:{ rfj -> 0x0534 }
        r3 = r4.a(r13, r10);	 Catch:{ rfj -> 0x0534 }
        r14.m(r3);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.b(r2);	 Catch:{ rfj -> 0x0534 }
        r9 = defpackage.rhc.a(r1, r3, r2, r9, r6);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x02f5:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.l(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0303:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.k(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0311:
        r1 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r4 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r4.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.a(r2, r1, r15);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0323:
        r1 = defpackage.rgl.e(r3);	 Catch:{ rfj -> 0x0534 }
        if (r1 == 0) goto L_0x0337;
    L_0x0329:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.j(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0337:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.i(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0345:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.h(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0353:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.g(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0361:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.f(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x036f:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.e(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x037d:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.c(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x038b:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.d(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0399:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.b(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x03a7:
        r1 = r12.o;	 Catch:{ rfj -> 0x0534 }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ rfj -> 0x0534 }
        r1 = r1.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        r14.a(r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x03b5:
        r1 = r12.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        if (r1 == 0) goto L_0x03d3;
    L_0x03bb:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = defpackage.rhv.f(r13, r3);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r2 = r14.b(r2, r15);	 Catch:{ rfj -> 0x0534 }
        r1 = defpackage.rfc.a(r1, r2);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x03d3:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r1 = r14.b(r1, r15);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x03e6:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.t();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x03f5:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.s();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0404:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.r();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0413:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.q();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0422:
        r4 = r14.p();	 Catch:{ rfj -> 0x0534 }
        r10 = r12.b(r2);	 Catch:{ rfj -> 0x0534 }
        if (r10 != 0) goto L_0x042d;
    L_0x042c:
        goto L_0x0439;
    L_0x042d:
        r10 = r10.a(r4);	 Catch:{ rfj -> 0x0534 }
        if (r10 != 0) goto L_0x0439;
    L_0x0433:
        r9 = defpackage.rhc.a(r1, r4, r9, r6);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0439:
        r1 = r3 & r5;
        r10 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r10, r4);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0444:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.o();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0453:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.n();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0462:
        r1 = r12.a(r13, r2);	 Catch:{ rfj -> 0x0534 }
        if (r1 == 0) goto L_0x0480;
    L_0x0468:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = defpackage.rhv.f(r13, r3);	 Catch:{ rfj -> 0x0534 }
        r2 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r2 = r14.a(r2, r15);	 Catch:{ rfj -> 0x0534 }
        r1 = defpackage.rfc.a(r1, r2);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0480:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r12.a(r2);	 Catch:{ rfj -> 0x0534 }
        r1 = r14.a(r1, r15);	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0493:
        r12.a(r13, r3, r14);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x049b:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.k();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04aa:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.j();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04b9:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.i();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04c8:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.h();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04d7:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.f();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04e6:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.g();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x04f5:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r1 = r14.e();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r1);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0504:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ rfj -> 0x0534 }
        r10 = r14.d();	 Catch:{ rfj -> 0x0534 }
        defpackage.rhv.a(r13, r3, r10);	 Catch:{ rfj -> 0x0534 }
        r12.b(r13, r2);	 Catch:{ rfj -> 0x0534 }
        goto L_0x0009;
    L_0x0513:
        r9 = r1;
    L_0x0514:
        r1 = r6.a(r9, r14);	 Catch:{ rfj -> 0x0534 }
        if (r1 != 0) goto L_0x0009;
    L_0x051a:
        r14 = r12.l;
    L_0x051c:
        r15 = r12.m;
        if (r14 >= r15) goto L_0x052b;
    L_0x0520:
        r15 = r12.k;
        r15 = r15[r14];
        r9 = r12.a(r13, r15, r9, r6);
        r14 = r14 + 1;
        goto L_0x051c;
    L_0x052b:
        if (r9 == 0) goto L_0x0530;
    L_0x052d:
        r6.b(r13, r9);
    L_0x0530:
        return;
    L_0x0531:
        r14 = move-exception;
        goto L_0x05c0;
    L_0x0534:
        r6.a();	 Catch:{ all -> 0x0531 }
        if (r9 != 0) goto L_0x053e;
    L_0x0539:
        r1 = r6.c(r13);	 Catch:{ all -> 0x0531 }
        r9 = r1;
    L_0x053e:
        r1 = r6.a(r9, r14);	 Catch:{ all -> 0x0531 }
        if (r1 != 0) goto L_0x0009;
    L_0x0544:
        r14 = r12.l;
    L_0x0546:
        r15 = r12.m;
        if (r14 >= r15) goto L_0x0555;
    L_0x054a:
        r15 = r12.k;
        r15 = r15[r14];
        r9 = r12.a(r13, r15, r9, r6);
        r14 = r14 + 1;
        goto L_0x0546;
    L_0x0555:
        if (r9 == 0) goto L_0x055a;
    L_0x0557:
        r6.b(r13, r9);
    L_0x055a:
        return;
    L_0x055b:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r2) goto L_0x05a9;
    L_0x0560:
        r2 = r12.h;	 Catch:{ all -> 0x0531 }
        if (r2 == 0) goto L_0x056b;
    L_0x0564:
        r2 = r12.g;	 Catch:{ all -> 0x0531 }
        r1 = r7.a(r15, r2, r1);	 Catch:{ all -> 0x0531 }
        goto L_0x056c;
    L_0x056b:
        r1 = r8;
    L_0x056c:
        if (r1 != 0) goto L_0x0595;
    L_0x056e:
        r6.a();	 Catch:{ all -> 0x0531 }
        if (r9 != 0) goto L_0x0578;
    L_0x0573:
        r1 = r6.c(r13);	 Catch:{ all -> 0x0531 }
        r9 = r1;
    L_0x0578:
        r1 = r6.a(r9, r14);	 Catch:{ all -> 0x0531 }
        if (r1 != 0) goto L_0x0009;
    L_0x057e:
        r14 = r12.l;
    L_0x0580:
        r15 = r12.m;
        if (r14 >= r15) goto L_0x058f;
    L_0x0584:
        r15 = r12.k;
        r15 = r15[r14];
        r9 = r12.a(r13, r15, r9, r6);
        r14 = r14 + 1;
        goto L_0x0580;
    L_0x058f:
        if (r9 == 0) goto L_0x0594;
    L_0x0591:
        r6.b(r13, r9);
    L_0x0594:
        return;
    L_0x0595:
        if (r0 != 0) goto L_0x059b;
    L_0x0597:
        r0 = r7.b(r13);	 Catch:{ all -> 0x0531 }
    L_0x059b:
        r10 = r0;
        r0 = r7;
        r1 = r14;
        r2 = r15;
        r3 = r10;
        r4 = r9;
        r5 = r6;
        r9 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0531 }
        r0 = r10;
        goto L_0x0009;
    L_0x05a9:
        r14 = r12.l;
    L_0x05ab:
        r15 = r12.m;
        if (r14 >= r15) goto L_0x05ba;
    L_0x05af:
        r15 = r12.k;
        r15 = r15[r14];
        r9 = r12.a(r13, r15, r9, r6);
        r14 = r14 + 1;
        goto L_0x05ab;
    L_0x05ba:
        if (r9 == 0) goto L_0x05bf;
    L_0x05bc:
        r6.b(r13, r9);
    L_0x05bf:
        return;
    L_0x05c0:
        r15 = r12.l;
    L_0x05c2:
        r0 = r12.m;
        if (r15 >= r0) goto L_0x05d1;
    L_0x05c6:
        r0 = r12.k;
        r0 = r0[r15];
        r9 = r12.a(r13, r0, r9, r6);
        r15 = r15 + 1;
        goto L_0x05c2;
    L_0x05d1:
        if (r9 == 0) goto L_0x05d6;
    L_0x05d3:
        r6.b(r13, r9);
    L_0x05d6:
        throw r14;
    L_0x05d7:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        goto L_0x05de;
    L_0x05dd:
        throw r13;
    L_0x05de:
        goto L_0x05dd;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, rgx, reg):void");
    }

    private static rhs e(Object obj) {
        reu reu = (reu) obj;
        rhs rhs = reu.zzuhr;
        if (rhs != rhs.a) {
            return rhs;
        }
        rhs = rhs.a();
        reu.zzuhr = rhs;
        return rhs;
    }

    private static int a(rha rha, byte[] bArr, int i, int i2, rcx rcx) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = rcy.a(i, bArr, i3, rcx);
            i = rcx.a;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw rfk.a();
        }
        Object a = rha.a();
        i += i4;
        rha.a(a, bArr, i4, i, rcx);
        rha.c(a);
        rcx.c = a;
        return i;
    }

    private static int a(rha rha, byte[] bArr, int i, int i2, int i3, rcx rcx) {
        rgl rgl = (rgl) rha;
        Object a = rgl.a();
        int a2 = rgl.a(a, bArr, i, i2, i3, rcx);
        rgl.c(a);
        rcx.c = a;
        return a2;
    }

    private static int a(rha rha, int i, byte[] bArr, int i2, int i3, rfi rfi, rcx rcx) {
        i2 = rgl.a(rha, bArr, i2, i3, rcx);
        rfi.add(rcx.c);
        while (i2 < i3) {
            int a = rcy.a(bArr, i2, rcx);
            if (i != rcx.a) {
                break;
            }
            i2 = rgl.a(rha, bArr, a, i3, rcx);
            rfi.add(rcx.c);
        }
        return i2;
    }

    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return r2 + 4;
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return r2 + 8;
     */
    private static int a(byte[] r1, int r2, int r3, defpackage.rii r4, java.lang.Class r5, defpackage.rcx r6) {
        /*
        r0 = defpackage.rgo.a;
        r4 = r4.ordinal();
        r4 = r0[r4];
        switch(r4) {
            case 1: goto L_0x0097;
            case 2: goto L_0x0092;
            case 3: goto L_0x0085;
            case 4: goto L_0x0078;
            case 5: goto L_0x0078;
            case 6: goto L_0x006d;
            case 7: goto L_0x006d;
            case 8: goto L_0x0062;
            case 9: goto L_0x0055;
            case 10: goto L_0x0055;
            case 11: goto L_0x0055;
            case 12: goto L_0x0048;
            case 13: goto L_0x0048;
            case 14: goto L_0x003d;
            case 15: goto L_0x002b;
            case 16: goto L_0x0019;
            case 17: goto L_0x0013;
            default: goto L_0x000b;
        };
    L_0x000b:
        r1 = new java.lang.RuntimeException;
        r2 = "unsupported field type.";
        r1.<init>(r2);
        throw r1;
    L_0x0013:
        r1 = defpackage.rcy.d(r1, r2, r6);
        goto L_0x00ac;
    L_0x0019:
        r1 = defpackage.rcy.b(r1, r2, r6);
        r2 = r6.b;
        r2 = defpackage.rdp.a(r2);
        r2 = java.lang.Long.valueOf(r2);
        r6.c = r2;
        goto L_0x00ac;
    L_0x002b:
        r1 = defpackage.rcy.a(r1, r2, r6);
        r2 = r6.a;
        r2 = defpackage.rdp.f(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r6.c = r2;
        goto L_0x00ac;
    L_0x003d:
        r4 = defpackage.rgw.a;
        r4 = r4.a(r5);
        r1 = defpackage.rgl.a(r4, r1, r2, r3, r6);
        goto L_0x00ac;
    L_0x0048:
        r1 = defpackage.rcy.b(r1, r2, r6);
        r2 = r6.b;
        r2 = java.lang.Long.valueOf(r2);
        r6.c = r2;
        goto L_0x00ac;
    L_0x0055:
        r1 = defpackage.rcy.a(r1, r2, r6);
        r2 = r6.a;
        r2 = java.lang.Integer.valueOf(r2);
        r6.c = r2;
        goto L_0x00ac;
    L_0x0062:
        r1 = defpackage.rcy.d(r1, r2);
        r1 = java.lang.Float.valueOf(r1);
        r6.c = r1;
        goto L_0x0082;
    L_0x006d:
        r3 = defpackage.rcy.b(r1, r2);
        r1 = java.lang.Long.valueOf(r3);
        r6.c = r1;
        goto L_0x008f;
    L_0x0078:
        r1 = defpackage.rcy.a(r1, r2);
        r1 = java.lang.Integer.valueOf(r1);
        r6.c = r1;
    L_0x0082:
        r1 = r2 + 4;
        goto L_0x00ac;
    L_0x0085:
        r3 = defpackage.rcy.c(r1, r2);
        r1 = java.lang.Double.valueOf(r3);
        r6.c = r1;
    L_0x008f:
        r1 = r2 + 8;
        goto L_0x00ac;
    L_0x0092:
        r1 = defpackage.rcy.e(r1, r2, r6);
        goto L_0x00ac;
    L_0x0097:
        r1 = defpackage.rcy.b(r1, r2, r6);
        r2 = r6.b;
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00a5;
    L_0x00a3:
        r2 = 1;
        goto L_0x00a6;
    L_0x00a5:
        r2 = 0;
    L_0x00a6:
        r2 = java.lang.Boolean.valueOf(r2);
        r6.c = r2;
    L_0x00ac:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(byte[], int, int, rii, java.lang.Class, rcx):int");
    }

    private static int a(int i, byte[] bArr, int i2, int i3, Object obj, rcx rcx) {
        return rcy.a(i, bArr, i2, i3, rgl.e(obj), rcx);
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Missing block: B:150:0x02a5, code skipped:
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:232:0x0424, code skipped:
            return r1;
     */
    private final int a(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, defpackage.rcx r29) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r16;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r2 = r20;
        r6 = r22;
        r8 = r23;
        r9 = r27;
        r7 = r29;
        r11 = b;
        r11 = r11.getObject(r1, r9);
        r11 = (defpackage.rfi) r11;
        r12 = r11.a();
        if (r12 != 0) goto L_0x0034;
    L_0x0021:
        r12 = r11.size();
        if (r12 == 0) goto L_0x0029;
    L_0x0027:
        r12 = r12 + r12;
        goto L_0x002b;
    L_0x0029:
        r12 = 10;
    L_0x002b:
        r11 = r11.a(r12);
        r12 = b;
        r12.putObject(r1, r9, r11);
    L_0x0034:
        r9 = 5;
        r12 = 0;
        r10 = 1;
        r14 = 2;
        switch(r26) {
            case 18: goto L_0x03c5;
            case 19: goto L_0x0387;
            case 20: goto L_0x0346;
            case 21: goto L_0x0346;
            case 22: goto L_0x032b;
            case 23: goto L_0x02ec;
            case 24: goto L_0x02ad;
            case 25: goto L_0x0255;
            case 26: goto L_0x01a2;
            case 27: goto L_0x0187;
            case 28: goto L_0x012f;
            case 29: goto L_0x032b;
            case 30: goto L_0x00f8;
            case 31: goto L_0x02ad;
            case 32: goto L_0x02ec;
            case 33: goto L_0x00ab;
            case 34: goto L_0x005e;
            case 35: goto L_0x03c5;
            case 36: goto L_0x0387;
            case 37: goto L_0x0346;
            case 38: goto L_0x0346;
            case 39: goto L_0x032b;
            case 40: goto L_0x02ec;
            case 41: goto L_0x02ad;
            case 42: goto L_0x0255;
            case 43: goto L_0x032b;
            case 44: goto L_0x00f8;
            case 45: goto L_0x02ad;
            case 46: goto L_0x02ec;
            case 47: goto L_0x00ab;
            case 48: goto L_0x005e;
            default: goto L_0x003c;
        };
    L_0x003c:
        r1 = 3;
        if (r6 != r1) goto L_0x0423;
    L_0x003f:
        r1 = r15.a(r8);
        r6 = r2 & -8;
        r6 = r6 | 4;
        r21 = r1;
        r22 = r17;
        r23 = r18;
        r24 = r19;
        r25 = r6;
        r26 = r29;
        r4 = defpackage.rgl.a(r21, r22, r23, r24, r25, r26);
        r8 = r7.c;
        r11.add(r8);
        goto L_0x0403;
    L_0x005e:
        if (r6 == r14) goto L_0x0089;
    L_0x0060:
        if (r6 != 0) goto L_0x0423;
    L_0x0062:
        r11 = (defpackage.rfw) r11;
        r1 = defpackage.rcy.b(r3, r4, r7);
        r8 = r7.b;
        r8 = defpackage.rdp.a(r8);
        r11.a(r8);
    L_0x0071:
        if (r1 >= r5) goto L_0x0424;
    L_0x0073:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x007b:
        r1 = defpackage.rcy.b(r3, r4, r7);
        r8 = r7.b;
        r8 = defpackage.rdp.a(r8);
        r11.a(r8);
        goto L_0x0071;
    L_0x0089:
        r11 = (defpackage.rfw) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x0092:
        if (r1 >= r2) goto L_0x00a2;
    L_0x0094:
        r1 = defpackage.rcy.b(r3, r1, r7);
        r4 = r7.b;
        r4 = defpackage.rdp.a(r4);
        r11.a(r4);
        goto L_0x0092;
    L_0x00a2:
        if (r1 != r2) goto L_0x00a6;
    L_0x00a4:
        goto L_0x0424;
    L_0x00a6:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x00ab:
        if (r6 == r14) goto L_0x00d6;
    L_0x00ad:
        if (r6 != 0) goto L_0x0423;
    L_0x00af:
        r11 = (defpackage.rez) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r4 = r7.a;
        r4 = defpackage.rdp.f(r4);
        r11.c(r4);
    L_0x00be:
        if (r1 >= r5) goto L_0x0424;
    L_0x00c0:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x00c8:
        r1 = defpackage.rcy.a(r3, r4, r7);
        r4 = r7.a;
        r4 = defpackage.rdp.f(r4);
        r11.c(r4);
        goto L_0x00be;
    L_0x00d6:
        r11 = (defpackage.rez) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x00df:
        if (r1 >= r2) goto L_0x00ef;
    L_0x00e1:
        r1 = defpackage.rcy.a(r3, r1, r7);
        r4 = r7.a;
        r4 = defpackage.rdp.f(r4);
        r11.c(r4);
        goto L_0x00df;
    L_0x00ef:
        if (r1 != r2) goto L_0x00f3;
    L_0x00f1:
        goto L_0x0424;
    L_0x00f3:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x00f8:
        if (r6 == r14) goto L_0x010c;
    L_0x00fa:
        if (r6 != 0) goto L_0x0423;
    L_0x00fc:
        r2 = r20;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r6 = r11;
        r7 = r29;
        r2 = defpackage.rcy.a(r2, r3, r4, r5, r6, r7);
        goto L_0x0110;
    L_0x010c:
        r2 = defpackage.rcy.a(r3, r4, r11, r7);
    L_0x0110:
        r1 = (defpackage.reu) r1;
        r3 = r1.zzuhr;
        r4 = defpackage.rhs.a;
        if (r3 == r4) goto L_0x0119;
    L_0x0118:
        goto L_0x011a;
    L_0x0119:
        r3 = 0;
    L_0x011a:
        r4 = r15.b(r8);
        r5 = r0.p;
        r6 = r21;
        r3 = defpackage.rhc.a(r6, r11, r4, r3, r5);
        r3 = (defpackage.rhs) r3;
        if (r3 != 0) goto L_0x012c;
    L_0x012a:
        goto L_0x02a5;
    L_0x012c:
        r1.zzuhr = r3;
        return r2;
    L_0x012f:
        if (r6 != r14) goto L_0x0423;
    L_0x0131:
        r1 = defpackage.rcy.a(r3, r4, r7);
        r4 = r7.a;
        if (r4 < 0) goto L_0x0182;
    L_0x0139:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x017d;
    L_0x013d:
        if (r4 != 0) goto L_0x0145;
    L_0x013f:
        r4 = defpackage.rdg.a;
        r11.add(r4);
        goto L_0x014d;
    L_0x0145:
        r6 = defpackage.rdg.a(r3, r1, r4);
        r11.add(r6);
    L_0x014c:
        r1 = r1 + r4;
    L_0x014d:
        if (r1 >= r5) goto L_0x0424;
    L_0x014f:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x0157:
        r1 = defpackage.rcy.a(r3, r4, r7);
        r4 = r7.a;
        if (r4 < 0) goto L_0x0178;
    L_0x015f:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x0173;
    L_0x0163:
        if (r4 != 0) goto L_0x016b;
    L_0x0165:
        r4 = defpackage.rdg.a;
        r11.add(r4);
        goto L_0x014d;
    L_0x016b:
        r6 = defpackage.rdg.a(r3, r1, r4);
        r11.add(r6);
        goto L_0x014c;
    L_0x0173:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x0178:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x017d:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x0182:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x0187:
        if (r6 == r14) goto L_0x018b;
    L_0x0189:
        goto L_0x0423;
    L_0x018b:
        r1 = r15.a(r8);
        r21 = r1;
        r22 = r20;
        r23 = r17;
        r24 = r18;
        r25 = r19;
        r26 = r11;
        r27 = r29;
        r1 = defpackage.rgl.a(r21, r22, r23, r24, r25, r26, r27);
        return r1;
    L_0x01a2:
        if (r6 != r14) goto L_0x0423;
    L_0x01a4:
        r8 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r8 = r24 & r8;
        r1 = "";
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x020f;
    L_0x01af:
        r4 = defpackage.rcy.a(r3, r4, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x020a;
    L_0x01b7:
        if (r6 != 0) goto L_0x01bd;
    L_0x01b9:
        r11.add(r1);
        goto L_0x01d0;
    L_0x01bd:
        r8 = r4 + r6;
        r9 = defpackage.rib.a(r3, r4, r8);
        if (r9 == 0) goto L_0x0205;
    L_0x01c5:
        r9 = new java.lang.String;
        r10 = defpackage.rfc.a;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
    L_0x01cf:
        r4 = r8;
    L_0x01d0:
        if (r4 >= r5) goto L_0x0423;
    L_0x01d2:
        r6 = defpackage.rcy.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x0423;
    L_0x01da:
        r4 = defpackage.rcy.a(r3, r6, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x0200;
    L_0x01e2:
        if (r6 != 0) goto L_0x01e8;
    L_0x01e4:
        r11.add(r1);
        goto L_0x01d0;
    L_0x01e8:
        r8 = r4 + r6;
        r9 = defpackage.rib.a(r3, r4, r8);
        if (r9 == 0) goto L_0x01fb;
    L_0x01f0:
        r9 = new java.lang.String;
        r10 = defpackage.rfc.a;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
        goto L_0x01cf;
    L_0x01fb:
        r1 = defpackage.rfk.i();
        throw r1;
    L_0x0200:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x0205:
        r1 = defpackage.rfk.i();
        throw r1;
    L_0x020a:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x020f:
        r4 = defpackage.rcy.a(r3, r4, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x0250;
    L_0x0217:
        if (r6 == 0) goto L_0x0225;
    L_0x0219:
        r8 = new java.lang.String;
        r9 = defpackage.rfc.a;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
    L_0x0223:
        r4 = r4 + r6;
        goto L_0x0228;
    L_0x0225:
        r11.add(r1);
    L_0x0228:
        if (r4 >= r5) goto L_0x0423;
    L_0x022a:
        r6 = defpackage.rcy.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x0423;
    L_0x0232:
        r4 = defpackage.rcy.a(r3, r6, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x024b;
    L_0x023a:
        if (r6 == 0) goto L_0x0247;
    L_0x023c:
        r8 = new java.lang.String;
        r9 = defpackage.rfc.a;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
        goto L_0x0223;
    L_0x0247:
        r11.add(r1);
        goto L_0x0228;
    L_0x024b:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x0250:
        r1 = defpackage.rfk.b();
        throw r1;
    L_0x0255:
        r1 = 0;
        if (r6 == r14) goto L_0x0287;
    L_0x0258:
        if (r6 != 0) goto L_0x0423;
    L_0x025a:
        r11 = (defpackage.rde) r11;
        r4 = defpackage.rcy.b(r3, r4, r7);
        r8 = r7.b;
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0268;
    L_0x0266:
        r6 = 1;
        goto L_0x0269;
    L_0x0268:
        r6 = 0;
    L_0x0269:
        r11.a(r6);
    L_0x026c:
        if (r4 >= r5) goto L_0x0423;
    L_0x026e:
        r6 = defpackage.rcy.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x0423;
    L_0x0276:
        r4 = defpackage.rcy.b(r3, r6, r7);
        r8 = r7.b;
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0282;
    L_0x0280:
        r6 = 1;
        goto L_0x0283;
    L_0x0282:
        r6 = 0;
    L_0x0283:
        r11.a(r6);
        goto L_0x026c;
    L_0x0287:
        r11 = (defpackage.rde) r11;
        r2 = defpackage.rcy.a(r3, r4, r7);
        r4 = r7.a;
        r4 = r4 + r2;
    L_0x0290:
        if (r2 >= r4) goto L_0x02a3;
    L_0x0292:
        r2 = defpackage.rcy.b(r3, r2, r7);
        r5 = r7.b;
        r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r8 == 0) goto L_0x029e;
    L_0x029c:
        r5 = 1;
        goto L_0x029f;
    L_0x029e:
        r5 = 0;
    L_0x029f:
        r11.a(r5);
        goto L_0x0290;
    L_0x02a3:
        if (r2 != r4) goto L_0x02a8;
    L_0x02a5:
        r1 = r2;
        goto L_0x0424;
    L_0x02a8:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x02ad:
        if (r6 == r14) goto L_0x02ce;
    L_0x02af:
        if (r6 != r9) goto L_0x0423;
    L_0x02b1:
        r11 = (defpackage.rez) r11;
        r1 = defpackage.rcy.a(r17, r18);
        r11.c(r1);
    L_0x02ba:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x0424;
    L_0x02be:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x02c6:
        r1 = defpackage.rcy.a(r3, r4);
        r11.c(r1);
        goto L_0x02ba;
    L_0x02ce:
        r11 = (defpackage.rez) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x02d7:
        if (r1 >= r2) goto L_0x02e3;
    L_0x02d9:
        r4 = defpackage.rcy.a(r3, r1);
        r11.c(r4);
        r1 = r1 + 4;
        goto L_0x02d7;
    L_0x02e3:
        if (r1 != r2) goto L_0x02e7;
    L_0x02e5:
        goto L_0x0424;
    L_0x02e7:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x02ec:
        if (r6 == r14) goto L_0x030d;
    L_0x02ee:
        if (r6 != r10) goto L_0x0423;
    L_0x02f0:
        r11 = (defpackage.rfw) r11;
        r8 = defpackage.rcy.b(r17, r18);
        r11.a(r8);
    L_0x02f9:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x0424;
    L_0x02fd:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x0305:
        r8 = defpackage.rcy.b(r3, r4);
        r11.a(r8);
        goto L_0x02f9;
    L_0x030d:
        r11 = (defpackage.rfw) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x0316:
        if (r1 >= r2) goto L_0x0322;
    L_0x0318:
        r4 = defpackage.rcy.b(r3, r1);
        r11.a(r4);
        r1 = r1 + 8;
        goto L_0x0316;
    L_0x0322:
        if (r1 != r2) goto L_0x0326;
    L_0x0324:
        goto L_0x0424;
    L_0x0326:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x032b:
        if (r6 != r14) goto L_0x0333;
    L_0x032d:
        r1 = defpackage.rcy.a(r3, r4, r11, r7);
        goto L_0x0424;
    L_0x0333:
        if (r6 == 0) goto L_0x0337;
    L_0x0335:
        goto L_0x0423;
    L_0x0337:
        r21 = r17;
        r22 = r18;
        r23 = r19;
        r24 = r11;
        r25 = r29;
        r1 = defpackage.rcy.a(r20, r21, r22, r23, r24, r25);
        return r1;
    L_0x0346:
        if (r6 == r14) goto L_0x0369;
    L_0x0348:
        if (r6 != 0) goto L_0x0423;
    L_0x034a:
        r11 = (defpackage.rfw) r11;
        r1 = defpackage.rcy.b(r3, r4, r7);
        r8 = r7.b;
        r11.a(r8);
    L_0x0355:
        if (r1 >= r5) goto L_0x0424;
    L_0x0357:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x035f:
        r1 = defpackage.rcy.b(r3, r4, r7);
        r8 = r7.b;
        r11.a(r8);
        goto L_0x0355;
    L_0x0369:
        r11 = (defpackage.rfw) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x0372:
        if (r1 >= r2) goto L_0x037e;
    L_0x0374:
        r1 = defpackage.rcy.b(r3, r1, r7);
        r4 = r7.b;
        r11.a(r4);
        goto L_0x0372;
    L_0x037e:
        if (r1 != r2) goto L_0x0382;
    L_0x0380:
        goto L_0x0424;
    L_0x0382:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x0387:
        if (r6 == r14) goto L_0x03a8;
    L_0x0389:
        if (r6 != r9) goto L_0x0423;
    L_0x038b:
        r11 = (defpackage.rep) r11;
        r1 = defpackage.rcy.d(r17, r18);
        r11.a(r1);
    L_0x0394:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x0424;
    L_0x0398:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x03a0:
        r1 = defpackage.rcy.d(r3, r4);
        r11.a(r1);
        goto L_0x0394;
    L_0x03a8:
        r11 = (defpackage.rep) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x03b1:
        if (r1 >= r2) goto L_0x03bd;
    L_0x03b3:
        r4 = defpackage.rcy.d(r3, r1);
        r11.a(r4);
        r1 = r1 + 4;
        goto L_0x03b1;
    L_0x03bd:
        if (r1 != r2) goto L_0x03c0;
    L_0x03bf:
        goto L_0x0424;
    L_0x03c0:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x03c5:
        if (r6 == r14) goto L_0x03e6;
    L_0x03c7:
        if (r6 != r10) goto L_0x0423;
    L_0x03c9:
        r11 = (defpackage.rec) r11;
        r8 = defpackage.rcy.c(r17, r18);
        r11.a(r8);
    L_0x03d2:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x0424;
    L_0x03d6:
        r4 = defpackage.rcy.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0424;
    L_0x03de:
        r8 = defpackage.rcy.c(r3, r4);
        r11.a(r8);
        goto L_0x03d2;
    L_0x03e6:
        r11 = (defpackage.rec) r11;
        r1 = defpackage.rcy.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x03ef:
        if (r1 >= r2) goto L_0x03fb;
    L_0x03f1:
        r4 = defpackage.rcy.c(r3, r1);
        r11.a(r4);
        r1 = r1 + 8;
        goto L_0x03ef;
    L_0x03fb:
        if (r1 != r2) goto L_0x03fe;
    L_0x03fd:
        goto L_0x0424;
    L_0x03fe:
        r1 = defpackage.rfk.a();
        throw r1;
    L_0x0403:
        if (r4 >= r5) goto L_0x0423;
    L_0x0405:
        r8 = defpackage.rcy.a(r3, r4, r7);
        r9 = r7.a;
        if (r2 != r9) goto L_0x0423;
    L_0x040d:
        r21 = r1;
        r22 = r17;
        r23 = r8;
        r24 = r19;
        r25 = r6;
        r26 = r29;
        r4 = defpackage.rgl.a(r21, r22, r23, r24, r25, r26);
        r8 = r7.c;
        r11.add(r8);
        goto L_0x0403;
    L_0x0423:
        r1 = r4;
    L_0x0424:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, rcx):int");
    }

    private final int a(Object obj, byte[] bArr, int i, int i2, long j, rcx rcx) {
        Unsafe unsafe = b;
        Object object = unsafe.getObject(obj, j);
        if (this.r.c(object)) {
            Object a = this.r.a();
            this.r.a(a, object);
            unsafe.putObject(obj, j, a);
            object = a;
        }
        rfz b = this.r.b();
        Map a2 = this.r.a(object);
        i = rcy.a(bArr, i, rcx);
        int i3 = rcx.a;
        if (i3 < 0 || i3 > i2 - i) {
            throw rfk.a();
        }
        i3 += i;
        Object obj2 = b.b;
        object = b.d;
        while (i < i3) {
            int i4 = i + 1;
            i = bArr[i];
            if (i < 0) {
                i4 = rcy.a(i, bArr, i4, rcx);
                i = rcx.a;
            }
            int i5 = i4;
            i4 = i & 7;
            int i6 = i >>> 3;
            rii rii;
            if (i6 == 1) {
                rii = b.a;
                if (i4 == rii.s) {
                    i = rgl.a(bArr, i5, i2, rii, null, rcx);
                    obj2 = rcx.c;
                }
            } else if (i6 == 2) {
                rii = b.c;
                if (i4 == rii.s) {
                    i = rgl.a(bArr, i5, i2, rii, b.d.getClass(), rcx);
                    object = rcx.c;
                }
            }
            i = rcy.a(i, bArr, i5, i2, rcx);
        }
        if (i == i3) {
            a2.put(obj2, object);
            return i3;
        }
        throw rfk.h();
    }

    /* JADX WARNING: Missing block: B:62:0x018e, code skipped:
            r2 = r4 + 4;
     */
    /* JADX WARNING: Missing block: B:66:0x019f, code skipped:
            r2 = r4 + 8;
     */
    /* JADX WARNING: Missing block: B:67:0x01a1, code skipped:
            r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Missing block: B:69:?, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:73:?, code skipped:
            return r2;
     */
    private final int a(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, defpackage.rcx r29) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r2 = r21;
        r8 = r22;
        r5 = r23;
        r9 = r26;
        r6 = r28;
        r11 = r29;
        r12 = b;
        r7 = r0.c;
        r13 = r6 + 2;
        r7 = r7[r13];
        r13 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r7 = r7 & r13;
        r13 = (long) r7;
        r7 = 5;
        r15 = 2;
        switch(r25) {
            case 51: goto L_0x0191;
            case 52: goto L_0x0181;
            case 53: goto L_0x0171;
            case 54: goto L_0x0171;
            case 55: goto L_0x0161;
            case 56: goto L_0x0152;
            case 57: goto L_0x0144;
            case 58: goto L_0x012b;
            case 59: goto L_0x00f7;
            case 60: goto L_0x00c9;
            case 61: goto L_0x00bc;
            case 62: goto L_0x0161;
            case 63: goto L_0x008e;
            case 64: goto L_0x0144;
            case 65: goto L_0x0152;
            case 66: goto L_0x0079;
            case 67: goto L_0x0062;
            case 68: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x01a5;
    L_0x0028:
        r7 = 3;
        if (r5 == r7) goto L_0x002d;
    L_0x002b:
        goto L_0x01a5;
    L_0x002d:
        r5 = r0.a(r6);
        r2 = r2 & -8;
        r6 = r2 | 4;
        r2 = r5;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r7 = r29;
        r2 = defpackage.rgl.a(r2, r3, r4, r5, r6, r7);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x004d;
    L_0x0048:
        r15 = r12.getObject(r1, r9);
        goto L_0x004e;
    L_0x004d:
        r15 = 0;
    L_0x004e:
        if (r15 != 0) goto L_0x0057;
    L_0x0050:
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0057:
        r3 = r11.c;
        r3 = defpackage.rfc.a(r15, r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0062:
        if (r5 == 0) goto L_0x0066;
    L_0x0064:
        goto L_0x01a5;
    L_0x0066:
        r2 = defpackage.rcy.b(r3, r4, r11);
        r3 = r11.b;
        r3 = defpackage.rdp.a(r3);
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0079:
        if (r5 != 0) goto L_0x01a5;
    L_0x007b:
        r2 = defpackage.rcy.a(r3, r4, r11);
        r3 = r11.a;
        r3 = defpackage.rdp.f(r3);
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x008e:
        if (r5 != 0) goto L_0x01a5;
    L_0x0090:
        r3 = defpackage.rcy.a(r3, r4, r11);
        r4 = r11.a;
        r5 = r0.b(r6);
        if (r5 == 0) goto L_0x00b2;
    L_0x009c:
        r5 = r5.a(r4);
        if (r5 == 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00b2;
    L_0x00a3:
        r1 = defpackage.rgl.e(r17);
        r4 = (long) r4;
        r4 = java.lang.Long.valueOf(r4);
        r1.a(r2, r4);
        r2 = r3;
        goto L_0x01a6;
    L_0x00b2:
        r2 = java.lang.Integer.valueOf(r4);
        r12.putObject(r1, r9, r2);
        r2 = r3;
        goto L_0x01a1;
    L_0x00bc:
        if (r5 != r15) goto L_0x01a5;
    L_0x00be:
        r2 = defpackage.rcy.e(r3, r4, r11);
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x00c9:
        if (r5 != r15) goto L_0x01a5;
    L_0x00cb:
        r2 = r0.a(r6);
        r5 = r20;
        r2 = defpackage.rgl.a(r2, r3, r4, r5, r11);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x00e0;
    L_0x00db:
        r15 = r12.getObject(r1, r9);
        goto L_0x00e1;
    L_0x00e0:
        r15 = 0;
    L_0x00e1:
        if (r15 != 0) goto L_0x00e9;
    L_0x00e3:
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        goto L_0x00f2;
    L_0x00e9:
        r3 = r11.c;
        r3 = defpackage.rfc.a(r15, r3);
        r12.putObject(r1, r9, r3);
    L_0x00f2:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x00f7:
        if (r5 != r15) goto L_0x01a5;
    L_0x00f9:
        r2 = defpackage.rcy.a(r3, r4, r11);
        r4 = r11.a;
        if (r4 != 0) goto L_0x0107;
    L_0x0101:
        r3 = "";
        r12.putObject(r1, r9, r3);
        goto L_0x0126;
    L_0x0107:
        r5 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r24 & r5;
        if (r5 == 0) goto L_0x011b;
    L_0x010d:
        r5 = r2 + r4;
        r5 = defpackage.rib.a(r3, r2, r5);
        if (r5 == 0) goto L_0x0116;
    L_0x0115:
        goto L_0x011b;
    L_0x0116:
        r1 = defpackage.rfk.i();
        throw r1;
    L_0x011b:
        r5 = new java.lang.String;
        r6 = defpackage.rfc.a;
        r5.<init>(r3, r2, r4, r6);
        r12.putObject(r1, r9, r5);
        r2 = r2 + r4;
    L_0x0126:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x012b:
        if (r5 != 0) goto L_0x01a5;
    L_0x012d:
        r2 = defpackage.rcy.b(r3, r4, r11);
        r3 = r11.b;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x013b;
    L_0x0139:
        r15 = 1;
        goto L_0x013c;
    L_0x013b:
        r15 = 0;
    L_0x013c:
        r3 = java.lang.Boolean.valueOf(r15);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0144:
        if (r5 != r7) goto L_0x01a5;
    L_0x0146:
        r2 = defpackage.rcy.a(r18, r19);
        r2 = java.lang.Integer.valueOf(r2);
        r12.putObject(r1, r9, r2);
        goto L_0x018e;
    L_0x0152:
        r2 = 1;
        if (r5 != r2) goto L_0x01a5;
    L_0x0155:
        r2 = defpackage.rcy.b(r18, r19);
        r2 = java.lang.Long.valueOf(r2);
        r12.putObject(r1, r9, r2);
        goto L_0x019f;
    L_0x0161:
        if (r5 != 0) goto L_0x01a5;
    L_0x0163:
        r2 = defpackage.rcy.a(r3, r4, r11);
        r3 = r11.a;
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0171:
        if (r5 != 0) goto L_0x01a5;
    L_0x0173:
        r2 = defpackage.rcy.b(r3, r4, r11);
        r3 = r11.b;
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0181:
        if (r5 != r7) goto L_0x01a5;
    L_0x0183:
        r2 = defpackage.rcy.d(r18, r19);
        r2 = java.lang.Float.valueOf(r2);
        r12.putObject(r1, r9, r2);
    L_0x018e:
        r2 = r4 + 4;
        goto L_0x01a1;
    L_0x0191:
        r2 = 1;
        if (r5 != r2) goto L_0x01a5;
    L_0x0194:
        r2 = defpackage.rcy.c(r18, r19);
        r2 = java.lang.Double.valueOf(r2);
        r12.putObject(r1, r9, r2);
    L_0x019f:
        r2 = r4 + 8;
    L_0x01a1:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x01a5:
        r2 = r4;
    L_0x01a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, rcx):int");
    }

    private final rha a(int i) {
        i /= 3;
        i += i;
        rha rha = (rha) this.d[i];
        if (rha != null) {
            return rha;
        }
        rha = rgw.a.a((Class) this.d[i + 1]);
        this.d[i] = rha;
        return rha;
    }

    private final rfg b(int i) {
        i /= 3;
        return (rfg) this.d[(i + i) + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f1 A:{LOOP_END, LOOP:1: B:135:0x03ed->B:137:0x03f1} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0409  */
    /* JADX WARNING: Missing block: B:44:0x0134, code skipped:
            r6 = r6 | r11;
     */
    /* JADX WARNING: Missing block: B:45:0x0135, code skipped:
            r11 = r31;
            r3 = r7;
     */
    /* JADX WARNING: Missing block: B:46:0x0138, code skipped:
            r1 = r13;
            r2 = r18;
            r7 = r29;
            r13 = r30;
     */
    /* JADX WARNING: Missing block: B:47:0x0141, code skipped:
            r21 = r13;
     */
    /* JADX WARNING: Missing block: B:72:0x01d4, code skipped:
            r6 = r6 | r11;
            r11 = r31;
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:73:0x01d8, code skipped:
            r3 = r7;
            r2 = r18;
     */
    /* JADX WARNING: Missing block: B:77:0x01fa, code skipped:
            r21 = r2;
     */
    /* JADX WARNING: Missing block: B:90:0x025d, code skipped:
            r0 = r8 + 8;
     */
    /* JADX WARNING: Missing block: B:91:0x025f, code skipped:
            r6 = r6 | r11;
     */
    /* JADX WARNING: Missing block: B:92:0x0260, code skipped:
            r11 = r31;
            r3 = r7;
     */
    /* JADX WARNING: Missing block: B:93:0x0263, code skipped:
            r2 = r18;
            r1 = r21;
     */
    /* JADX WARNING: Missing block: B:94:0x0267, code skipped:
            r7 = r29;
     */
    /* JADX WARNING: Missing block: B:97:0x027e, code skipped:
            r24 = r29;
            r20 = r6;
            r17 = r7;
            r2 = r8;
            r8 = r10;
            r7 = r14;
            r9 = r15;
            r10 = r21;
            r6 = r31;
     */
    /* JADX WARNING: Missing block: B:103:0x02cc, code skipped:
            if (r0 == r15) goto L_0x02ce;
     */
    /* JADX WARNING: Missing block: B:105:0x02db, code skipped:
            r15 = r26;
            r14 = r27;
            r12 = r28;
            r13 = r30;
            r11 = r31;
            r9 = r32;
            r3 = r17;
            r2 = r18;
            r6 = r20;
            r1 = r21;
            r7 = r24;
            r10 = r25;
     */
    /* JADX WARNING: Missing block: B:109:0x0323, code skipped:
            if (r0 == r15) goto L_0x02ce;
     */
    /* JADX WARNING: Missing block: B:113:0x033b, code skipped:
            if (r0 == r15) goto L_0x02ce;
     */
    private final int a(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, defpackage.rcx r32) {
        /*
        r26 = this;
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r9 = r32;
        r10 = b;
        r16 = 0;
        r0 = r29;
        r1 = 0;
        r2 = -1;
        r3 = 0;
        r6 = 0;
        r7 = -1;
    L_0x0017:
        if (r0 >= r13) goto L_0x03d4;
    L_0x0019:
        r1 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0028;
    L_0x001f:
        r0 = defpackage.rcy.a(r0, r12, r1, r9);
        r1 = r9.a;
        r5 = r0;
        r4 = r1;
        goto L_0x002a;
    L_0x0028:
        r4 = r0;
        r5 = r1;
    L_0x002a:
        r1 = r4 >>> 3;
        r0 = r4 & 7;
        r8 = 3;
        if (r1 <= r2) goto L_0x0037;
    L_0x0031:
        r3 = r3 / r8;
        r2 = r15.a(r1, r3);
        goto L_0x003b;
    L_0x0037:
        r2 = r15.f(r1);
    L_0x003b:
        r3 = -1;
        if (r2 == r3) goto L_0x039c;
    L_0x003e:
        r3 = r15.c;
        r18 = r2 + 1;
        r8 = r3[r18];
        r18 = r1;
        r1 = r8 >>> 20;
        r1 = r1 & 255;
        r19 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r20 = r4;
        r4 = r8 & r19;
        r21 = r5;
        r4 = (long) r4;
        r11 = 17;
        r22 = r8;
        if (r1 > r11) goto L_0x028e;
    L_0x005a:
        r11 = r2 + 2;
        r3 = r3[r11];
        r11 = r3 >>> 20;
        r8 = 1;
        r11 = r8 << r11;
        r3 = r3 & r19;
        if (r3 != r7) goto L_0x0068;
    L_0x0067:
        goto L_0x0076;
    L_0x0068:
        r8 = -1;
        if (r7 != r8) goto L_0x006c;
    L_0x006b:
        goto L_0x0070;
    L_0x006c:
        r8 = (long) r7;
        r10.putInt(r14, r8, r6);
    L_0x0070:
        r6 = (long) r3;
        r6 = r10.getInt(r14, r6);
        r7 = r3;
    L_0x0076:
        r3 = 5;
        switch(r1) {
            case 0: goto L_0x024a;
            case 1: goto L_0x0235;
            case 2: goto L_0x0213;
            case 3: goto L_0x0213;
            case 4: goto L_0x01fe;
            case 5: goto L_0x01dd;
            case 6: goto L_0x01c0;
            case 7: goto L_0x019c;
            case 8: goto L_0x017b;
            case 9: goto L_0x0145;
            case 10: goto L_0x011f;
            case 11: goto L_0x01fe;
            case 12: goto L_0x00f0;
            case 13: goto L_0x01c0;
            case 14: goto L_0x01dd;
            case 15: goto L_0x00d7;
            case 16: goto L_0x00a7;
            default: goto L_0x007a;
        };
    L_0x007a:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r1 = 3;
        r7 = r2;
        r21 = r20;
        if (r0 != r1) goto L_0x027e;
    L_0x0086:
        r0 = r15.a(r7);
        r1 = r18 << 3;
        r19 = r1 | 4;
        r1 = r28;
        r2 = r8;
        r3 = r30;
        r12 = r4;
        r4 = r19;
        r5 = r32;
        r0 = defpackage.rgl.a(r0, r1, r2, r3, r4, r5);
        r1 = r6 & r11;
        if (r1 != 0) goto L_0x026b;
    L_0x00a0:
        r1 = r9.c;
        r10.putObject(r14, r12, r1);
        goto L_0x0278;
    L_0x00a7:
        if (r0 == 0) goto L_0x00b4;
    L_0x00a9:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r21 = r20;
        goto L_0x027e;
    L_0x00b4:
        r9 = r32;
        r8 = r21;
        r8 = defpackage.rcy.b(r12, r8, r9);
        r0 = r9.b;
        r21 = defpackage.rdp.a(r0);
        r0 = r10;
        r1 = r27;
        r29 = r7;
        r7 = r2;
        r2 = r4;
        r13 = r20;
        r4 = r21;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r11;
        r11 = r31;
        r3 = r7;
        r0 = r8;
        goto L_0x0138;
    L_0x00d7:
        r9 = r32;
        r29 = r7;
        r13 = r20;
        r8 = r21;
        r7 = r2;
        if (r0 != 0) goto L_0x0141;
    L_0x00e2:
        r0 = defpackage.rcy.a(r12, r8, r9);
        r1 = r9.a;
        r1 = defpackage.rdp.f(r1);
        r10.putInt(r14, r4, r1);
        goto L_0x0134;
    L_0x00f0:
        r9 = r32;
        r29 = r7;
        r13 = r20;
        r8 = r21;
        r7 = r2;
        if (r0 != 0) goto L_0x0141;
    L_0x00fb:
        r0 = defpackage.rcy.a(r12, r8, r9);
        r1 = r9.a;
        r2 = r15.b(r7);
        if (r2 == 0) goto L_0x011b;
    L_0x0107:
        r2 = r2.a(r1);
        if (r2 == 0) goto L_0x010e;
    L_0x010d:
        goto L_0x011b;
    L_0x010e:
        r2 = defpackage.rgl.e(r27);
        r3 = (long) r1;
        r1 = java.lang.Long.valueOf(r3);
        r2.a(r13, r1);
        goto L_0x0135;
    L_0x011b:
        r10.putInt(r14, r4, r1);
        goto L_0x0134;
    L_0x011f:
        r9 = r32;
        r29 = r7;
        r13 = r20;
        r8 = r21;
        r1 = 2;
        r7 = r2;
        if (r0 != r1) goto L_0x0141;
    L_0x012b:
        r0 = defpackage.rcy.e(r12, r8, r9);
        r1 = r9.c;
        r10.putObject(r14, r4, r1);
    L_0x0134:
        r6 = r6 | r11;
    L_0x0135:
        r11 = r31;
        r3 = r7;
    L_0x0138:
        r1 = r13;
        r2 = r18;
        r7 = r29;
        r13 = r30;
        goto L_0x0017;
    L_0x0141:
        r21 = r13;
        goto L_0x027e;
    L_0x0145:
        r9 = r32;
        r29 = r7;
        r13 = r20;
        r8 = r21;
        r1 = 2;
        r7 = r2;
        if (r0 != r1) goto L_0x0176;
    L_0x0151:
        r0 = r15.a(r7);
        r2 = r13;
        r13 = r30;
        r0 = defpackage.rgl.a(r0, r12, r8, r13, r9);
        r1 = r6 & r11;
        if (r1 != 0) goto L_0x0167;
    L_0x0160:
        r1 = r9.c;
        r10.putObject(r14, r4, r1);
        goto L_0x01d4;
    L_0x0167:
        r1 = r10.getObject(r14, r4);
        r3 = r9.c;
        r1 = defpackage.rfc.a(r1, r3);
        r10.putObject(r14, r4, r1);
        goto L_0x01d4;
    L_0x0176:
        r2 = r13;
        r13 = r30;
        goto L_0x01fa;
    L_0x017b:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r1 = 2;
        r7 = r2;
        r2 = r20;
        if (r0 != r1) goto L_0x01fa;
    L_0x0187:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r22 & r0;
        if (r0 == 0) goto L_0x0192;
    L_0x018d:
        r0 = defpackage.rcy.d(r12, r8, r9);
        goto L_0x0196;
    L_0x0192:
        r0 = defpackage.rcy.c(r12, r8, r9);
    L_0x0196:
        r1 = r9.c;
        r10.putObject(r14, r4, r1);
        goto L_0x01d4;
    L_0x019c:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r2 = r20;
        if (r0 != 0) goto L_0x01fa;
    L_0x01a7:
        r0 = defpackage.rcy.b(r12, r8, r9);
        r3 = r0;
        r0 = r9.b;
        r20 = 0;
        r8 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r8 == 0) goto L_0x01b6;
    L_0x01b4:
        r0 = 1;
        goto L_0x01b7;
    L_0x01b6:
        r0 = 0;
    L_0x01b7:
        defpackage.rhv.a(r14, r4, r0);
        r6 = r6 | r11;
        r11 = r31;
        r1 = r2;
        r0 = r3;
        goto L_0x01d8;
    L_0x01c0:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r2 = r20;
        if (r0 != r3) goto L_0x01fa;
    L_0x01cb:
        r0 = defpackage.rcy.a(r12, r8);
        r10.putInt(r14, r4, r0);
        r0 = r8 + 4;
    L_0x01d4:
        r6 = r6 | r11;
        r11 = r31;
        r1 = r2;
    L_0x01d8:
        r3 = r7;
        r2 = r18;
        goto L_0x0267;
    L_0x01dd:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r1 = 1;
        r7 = r2;
        r2 = r20;
        if (r0 != r1) goto L_0x01fa;
    L_0x01e9:
        r19 = defpackage.rcy.b(r12, r8);
        r0 = r10;
        r1 = r27;
        r21 = r2;
        r2 = r4;
        r4 = r19;
        r0.putLong(r1, r2, r4);
        goto L_0x025d;
    L_0x01fa:
        r21 = r2;
        goto L_0x027e;
    L_0x01fe:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r21 = r20;
        if (r0 != 0) goto L_0x027e;
    L_0x0209:
        r0 = defpackage.rcy.a(r12, r8, r9);
        r1 = r9.a;
        r10.putInt(r14, r4, r1);
        goto L_0x025f;
    L_0x0213:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r21 = r20;
        if (r0 != 0) goto L_0x027e;
    L_0x021e:
        r8 = defpackage.rcy.b(r12, r8, r9);
        r2 = r9.b;
        r0 = r10;
        r1 = r27;
        r19 = r2;
        r2 = r4;
        r4 = r19;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r11;
        r11 = r31;
        r3 = r7;
        r0 = r8;
        goto L_0x0263;
    L_0x0235:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r7 = r2;
        r21 = r20;
        if (r0 != r3) goto L_0x027e;
    L_0x0240:
        r0 = defpackage.rcy.d(r12, r8);
        defpackage.rhv.a(r14, r4, r0);
        r0 = r8 + 4;
        goto L_0x025f;
    L_0x024a:
        r9 = r32;
        r29 = r7;
        r8 = r21;
        r1 = 1;
        r7 = r2;
        r21 = r20;
        if (r0 != r1) goto L_0x027e;
    L_0x0256:
        r0 = defpackage.rcy.c(r12, r8);
        defpackage.rhv.a(r14, r4, r0);
    L_0x025d:
        r0 = r8 + 8;
    L_0x025f:
        r6 = r6 | r11;
    L_0x0260:
        r11 = r31;
        r3 = r7;
    L_0x0263:
        r2 = r18;
        r1 = r21;
    L_0x0267:
        r7 = r29;
        goto L_0x0017;
    L_0x026b:
        r1 = r10.getObject(r14, r12);
        r2 = r9.c;
        r1 = defpackage.rfc.a(r1, r2);
        r10.putObject(r14, r12, r1);
    L_0x0278:
        r6 = r6 | r11;
        r12 = r28;
        r13 = r30;
        goto L_0x0260;
    L_0x027e:
        r24 = r29;
        r20 = r6;
        r17 = r7;
        r2 = r8;
        r8 = r10;
        r7 = r14;
        r9 = r15;
        r10 = r21;
        r6 = r31;
        goto L_0x03ac;
    L_0x028e:
        r12 = r4;
        r11 = r7;
        r8 = r21;
        r7 = r2;
        r21 = r20;
        r2 = 27;
        if (r1 == r2) goto L_0x033e;
    L_0x0299:
        r2 = 49;
        if (r1 > r2) goto L_0x02f5;
    L_0x029d:
        r5 = r22;
        r4 = (long) r5;
        r3 = r0;
        r0 = r26;
        r2 = r1;
        r1 = r27;
        r29 = r2;
        r2 = r28;
        r19 = r3;
        r3 = r8;
        r22 = r4;
        r4 = r30;
        r5 = r21;
        r20 = r6;
        r6 = r18;
        r24 = r11;
        r11 = r7;
        r7 = r19;
        r15 = r8;
        r8 = r11;
        r25 = r10;
        r9 = r22;
        r17 = r11;
        r11 = r29;
        r14 = r32;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x02db;
    L_0x02ce:
        r9 = r26;
        r7 = r27;
        r6 = r31;
        r2 = r0;
        r10 = r21;
        r8 = r25;
        goto L_0x03ac;
    L_0x02db:
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r9 = r32;
        r3 = r17;
        r2 = r18;
        r6 = r20;
        r1 = r21;
        r7 = r24;
        r10 = r25;
        goto L_0x0017;
    L_0x02f5:
        r19 = r0;
        r29 = r1;
        r20 = r6;
        r17 = r7;
        r15 = r8;
        r25 = r10;
        r24 = r11;
        r5 = r22;
        r0 = 50;
        r9 = r29;
        if (r9 == r0) goto L_0x0326;
    L_0x030a:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r8 = r5;
        r5 = r21;
        r6 = r18;
        r7 = r19;
        r10 = r12;
        r12 = r17;
        r13 = r32;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x02db;
    L_0x0325:
        goto L_0x02ce;
    L_0x0326:
        r0 = r19;
        r1 = 2;
        if (r0 != r1) goto L_0x038b;
    L_0x032b:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r5 = r12;
        r7 = r32;
        r0 = r0.a(r1, r2, r3, r4, r5, r7);
        if (r0 != r15) goto L_0x02db;
    L_0x033d:
        goto L_0x02ce;
    L_0x033e:
        r20 = r6;
        r17 = r7;
        r15 = r8;
        r25 = r10;
        r24 = r11;
        r1 = 2;
        if (r0 != r1) goto L_0x038b;
    L_0x034a:
        r7 = r27;
        r8 = r25;
        r0 = r8.getObject(r7, r12);
        r0 = (defpackage.rfi) r0;
        r1 = r0.a();
        if (r1 != 0) goto L_0x036b;
    L_0x035a:
        r1 = r0.size();
        if (r1 == 0) goto L_0x0362;
    L_0x0360:
        r1 = r1 + r1;
        goto L_0x0364;
    L_0x0362:
        r1 = 10;
    L_0x0364:
        r0 = r0.a(r1);
        r8.putObject(r7, r12, r0);
    L_0x036b:
        r9 = r26;
        r5 = r0;
        r3 = r15;
        r10 = r17;
        r0 = r9.a(r10);
        r1 = r21;
        r2 = r28;
        r4 = r30;
        r6 = r32;
        r0 = defpackage.rgl.a(r0, r1, r2, r3, r4, r5, r6);
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r14 = r7;
        r15 = r9;
        r3 = r10;
        goto L_0x03c9;
    L_0x038b:
        r9 = r26;
        r7 = r27;
        r3 = r15;
        r10 = r17;
        r8 = r25;
        r6 = r31;
        r2 = r3;
        r17 = r10;
        r10 = r21;
        goto L_0x03ac;
    L_0x039c:
        r18 = r1;
        r3 = r5;
        r20 = r6;
        r24 = r7;
        r8 = r10;
        r7 = r14;
        r9 = r15;
        r6 = r31;
        r2 = r3;
        r10 = r4;
        r17 = 0;
    L_0x03ac:
        if (r10 == r6) goto L_0x03af;
    L_0x03ae:
        goto L_0x03b2;
    L_0x03af:
        if (r6 == 0) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03de;
    L_0x03b2:
        r0 = r10;
        r1 = r28;
        r3 = r30;
        r4 = r27;
        r5 = r32;
        r0 = defpackage.rgl.a(r0, r1, r2, r3, r4, r5);
        r12 = r28;
        r13 = r30;
        r11 = r6;
        r14 = r7;
        r15 = r9;
        r1 = r10;
        r3 = r17;
    L_0x03c9:
        r2 = r18;
        r6 = r20;
        r7 = r24;
        r9 = r32;
        r10 = r8;
        goto L_0x0017;
    L_0x03d4:
        r20 = r6;
        r24 = r7;
        r8 = r10;
        r6 = r11;
        r7 = r14;
        r9 = r15;
        r2 = r0;
        r10 = r1;
    L_0x03de:
        r1 = r20;
        r0 = r24;
        r3 = -1;
        if (r0 != r3) goto L_0x03e6;
    L_0x03e5:
        goto L_0x03ea;
    L_0x03e6:
        r3 = (long) r0;
        r8.putInt(r7, r3, r1);
    L_0x03ea:
        r0 = r9.l;
        r1 = 0;
    L_0x03ed:
        r3 = r9.m;
        if (r0 >= r3) goto L_0x0400;
    L_0x03f1:
        r3 = r9.k;
        r3 = r3[r0];
        r4 = r9.p;
        r1 = r9.a(r7, r3, r1, r4);
        r1 = (defpackage.rhs) r1;
        r0 = r0 + 1;
        goto L_0x03ed;
    L_0x0400:
        if (r1 == 0) goto L_0x0407;
    L_0x0402:
        r0 = r9.p;
        r0.b(r7, r1);
    L_0x0407:
        if (r6 != 0) goto L_0x0413;
    L_0x0409:
        r0 = r30;
        if (r2 != r0) goto L_0x040e;
    L_0x040d:
        goto L_0x0419;
    L_0x040e:
        r0 = defpackage.rfk.h();
        throw r0;
    L_0x0413:
        r0 = r30;
        if (r2 > r0) goto L_0x041a;
    L_0x0417:
        if (r10 != r6) goto L_0x041a;
    L_0x0419:
        return r2;
    L_0x041a:
        r0 = defpackage.rfk.h();
        goto L_0x0420;
    L_0x041f:
        throw r0;
    L_0x0420:
        goto L_0x041f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, byte[], int, int, int, rcx):int");
    }

    /* JADX WARNING: Missing block: B:22:0x0060, code skipped:
            r10 = r4;
     */
    /* JADX WARNING: Missing block: B:23:0x0061, code skipped:
            r24 = r7;
            r3 = r8;
            r8 = r9;
            r7 = r14;
            r9 = r15;
     */
    /* JADX WARNING: Missing block: B:57:0x0111, code skipped:
            r2 = r4;
            r1 = r7;
     */
    /* JADX WARNING: Missing block: B:67:0x0143, code skipped:
            r0 = r6;
     */
    /* JADX WARNING: Missing block: B:74:0x015f, code skipped:
            r0 = r8 + 8;
     */
    /* JADX WARNING: Missing block: B:75:0x0161, code skipped:
            r1 = r7;
            r2 = r10;
     */
    /* JADX WARNING: Missing block: B:82:0x019b, code skipped:
            if (r0 == r15) goto L_0x019d;
     */
    /* JADX WARNING: Missing block: B:84:0x01a8, code skipped:
            r15 = r26;
            r14 = r27;
            r12 = r28;
            r2 = r29;
            r13 = r30;
            r11 = r31;
            r1 = r24;
            r9 = r25;
     */
    /* JADX WARNING: Missing block: B:88:0x01e8, code skipped:
            if (r0 == r15) goto L_0x019d;
     */
    /* JADX WARNING: Missing block: B:92:0x0200, code skipped:
            if (r0 == r15) goto L_0x019d;
     */
    public final void a(java.lang.Object r27, byte[] r28, int r29, int r30, defpackage.rcx r31) {
        /*
        r26 = this;
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r0 = r15.j;
        if (r0 == 0) goto L_0x027d;
    L_0x000e:
        r9 = b;
        r10 = -1;
        r16 = 0;
        r0 = r29;
        r1 = -1;
        r2 = 0;
    L_0x0017:
        if (r0 < r13) goto L_0x0021;
    L_0x0019:
        if (r0 != r13) goto L_0x001c;
    L_0x001b:
        return;
    L_0x001c:
        r0 = defpackage.rfk.h();
        throw r0;
    L_0x0021:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0031;
    L_0x0027:
        r0 = defpackage.rcy.a(r0, r12, r3, r11);
        r3 = r11.a;
        r8 = r0;
        r17 = r3;
        goto L_0x0034;
    L_0x0031:
        r17 = r0;
        r8 = r3;
    L_0x0034:
        r7 = r17 >>> 3;
        r6 = r17 & 7;
        if (r7 <= r1) goto L_0x0041;
    L_0x003a:
        r2 = r2 / 3;
        r0 = r15.a(r7, r2);
        goto L_0x0045;
    L_0x0041:
        r0 = r15.f(r7);
    L_0x0045:
        r4 = r0;
        if (r4 == r10) goto L_0x0256;
    L_0x0048:
        r0 = r15.c;
        r1 = r4 + 1;
        r5 = r0[r1];
        r0 = r5 >>> 20;
        r3 = r0 & 255;
        r0 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r0 = r0 & r5;
        r1 = (long) r0;
        r0 = 17;
        r10 = 2;
        if (r3 > r0) goto L_0x0166;
    L_0x005c:
        r0 = 1;
        switch(r3) {
            case 0: goto L_0x0154;
            case 1: goto L_0x0145;
            case 2: goto L_0x0133;
            case 3: goto L_0x0133;
            case 4: goto L_0x0125;
            case 5: goto L_0x0115;
            case 6: goto L_0x0104;
            case 7: goto L_0x00ee;
            case 8: goto L_0x00d7;
            case 9: goto L_0x00b6;
            case 10: goto L_0x00a9;
            case 11: goto L_0x0125;
            case 12: goto L_0x009a;
            case 13: goto L_0x0104;
            case 14: goto L_0x0115;
            case 15: goto L_0x0087;
            case 16: goto L_0x006b;
            default: goto L_0x0060;
        };
    L_0x0060:
        r10 = r4;
    L_0x0061:
        r24 = r7;
        r3 = r8;
        r8 = r9;
        r7 = r14;
        r9 = r15;
        r18 = -1;
        goto L_0x0254;
    L_0x006b:
        if (r6 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0060;
    L_0x006e:
        r6 = defpackage.rcy.b(r12, r8, r11);
        r19 = r1;
        r0 = r11.b;
        r21 = defpackage.rdp.a(r0);
        r0 = r9;
        r2 = r19;
        r1 = r27;
        r10 = r4;
        r4 = r21;
        r0.putLong(r1, r2, r4);
        goto L_0x0143;
    L_0x0087:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x0061;
    L_0x008b:
        r0 = defpackage.rcy.a(r12, r8, r11);
        r1 = r11.a;
        r1 = defpackage.rdp.f(r1);
        r9.putInt(r14, r2, r1);
        goto L_0x0161;
    L_0x009a:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x0061;
    L_0x009e:
        r0 = defpackage.rcy.a(r12, r8, r11);
        r1 = r11.a;
        r9.putInt(r14, r2, r1);
        goto L_0x0161;
    L_0x00a9:
        r2 = r1;
        if (r6 != r10) goto L_0x0060;
    L_0x00ac:
        r0 = defpackage.rcy.e(r12, r8, r11);
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x0111;
    L_0x00b6:
        r2 = r1;
        if (r6 != r10) goto L_0x0060;
    L_0x00b9:
        r0 = r15.a(r4);
        r0 = defpackage.rgl.a(r0, r12, r8, r13, r11);
        r1 = r9.getObject(r14, r2);
        if (r1 != 0) goto L_0x00cd;
    L_0x00c7:
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x0111;
    L_0x00cd:
        r5 = r11.c;
        r1 = defpackage.rfc.a(r1, r5);
        r9.putObject(r14, r2, r1);
        goto L_0x0111;
    L_0x00d7:
        r2 = r1;
        if (r6 != r10) goto L_0x0060;
    L_0x00da:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x00e4;
    L_0x00df:
        r0 = defpackage.rcy.d(r12, r8, r11);
        goto L_0x00e8;
    L_0x00e4:
        r0 = defpackage.rcy.c(r12, r8, r11);
    L_0x00e8:
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x0111;
    L_0x00ee:
        r2 = r1;
        if (r6 != 0) goto L_0x0060;
    L_0x00f1:
        r1 = defpackage.rcy.b(r12, r8, r11);
        r5 = r11.b;
        r19 = 0;
        r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1));
        if (r8 == 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x00ff;
    L_0x00fe:
        r0 = 0;
    L_0x00ff:
        defpackage.rhv.a(r14, r2, r0);
        r0 = r1;
        goto L_0x0111;
    L_0x0104:
        r2 = r1;
        r0 = 5;
        if (r6 != r0) goto L_0x0060;
    L_0x0108:
        r0 = defpackage.rcy.a(r12, r8);
        r9.putInt(r14, r2, r0);
        r0 = r8 + 4;
    L_0x0111:
        r2 = r4;
        r1 = r7;
        goto L_0x0163;
    L_0x0115:
        r2 = r1;
        if (r6 != r0) goto L_0x0060;
    L_0x0118:
        r5 = defpackage.rcy.b(r12, r8);
        r0 = r9;
        r1 = r27;
        r10 = r4;
        r4 = r5;
        r0.putLong(r1, r2, r4);
        goto L_0x015f;
    L_0x0125:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x0061;
    L_0x0129:
        r0 = defpackage.rcy.a(r12, r8, r11);
        r1 = r11.a;
        r9.putInt(r14, r2, r1);
        goto L_0x0161;
    L_0x0133:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x0061;
    L_0x0137:
        r6 = defpackage.rcy.b(r12, r8, r11);
        r4 = r11.b;
        r0 = r9;
        r1 = r27;
        r0.putLong(r1, r2, r4);
    L_0x0143:
        r0 = r6;
        goto L_0x0161;
    L_0x0145:
        r2 = r1;
        r10 = r4;
        r0 = 5;
        if (r6 != r0) goto L_0x0061;
    L_0x014a:
        r0 = defpackage.rcy.d(r12, r8);
        defpackage.rhv.a(r14, r2, r0);
        r0 = r8 + 4;
        goto L_0x0161;
    L_0x0154:
        r2 = r1;
        r10 = r4;
        if (r6 != r0) goto L_0x0061;
    L_0x0158:
        r0 = defpackage.rcy.c(r12, r8);
        defpackage.rhv.a(r14, r2, r0);
    L_0x015f:
        r0 = r8 + 8;
    L_0x0161:
        r1 = r7;
        r2 = r10;
    L_0x0163:
        r10 = -1;
        goto L_0x0017;
    L_0x0166:
        r0 = 27;
        if (r3 == r0) goto L_0x0203;
    L_0x016a:
        r0 = 49;
        if (r3 > r0) goto L_0x01b9;
    L_0x016e:
        r19 = r9;
        r9 = (long) r5;
        r0 = r26;
        r20 = r1;
        r1 = r27;
        r2 = r28;
        r5 = r3;
        r3 = r8;
        r29 = r4;
        r4 = r30;
        r22 = r5;
        r5 = r17;
        r23 = r6;
        r6 = r7;
        r24 = r7;
        r7 = r23;
        r15 = r8;
        r8 = r29;
        r25 = r19;
        r18 = -1;
        r11 = r22;
        r12 = r20;
        r14 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x01a8;
    L_0x019d:
        r9 = r26;
        r7 = r27;
        r10 = r29;
        r2 = r0;
        r8 = r25;
        goto L_0x0260;
    L_0x01a8:
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r2 = r29;
        r13 = r30;
        r11 = r31;
        r1 = r24;
        r9 = r25;
        goto L_0x0163;
    L_0x01b9:
        r20 = r1;
        r22 = r3;
        r29 = r4;
        r23 = r6;
        r24 = r7;
        r15 = r8;
        r25 = r9;
        r18 = -1;
        r0 = 50;
        r9 = r22;
        if (r9 == r0) goto L_0x01eb;
    L_0x01ce:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r8 = r5;
        r5 = r17;
        r6 = r24;
        r7 = r23;
        r10 = r20;
        r12 = r29;
        r13 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x01a8;
    L_0x01ea:
        goto L_0x019d;
    L_0x01eb:
        r0 = r23;
        if (r0 != r10) goto L_0x024b;
    L_0x01ef:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r5 = r20;
        r7 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r7);
        if (r0 != r15) goto L_0x01a8;
    L_0x0202:
        goto L_0x019d;
    L_0x0203:
        r20 = r1;
        r29 = r4;
        r0 = r6;
        r24 = r7;
        r15 = r8;
        r25 = r9;
        r18 = -1;
        if (r0 != r10) goto L_0x024b;
    L_0x0211:
        r7 = r27;
        r0 = r20;
        r8 = r25;
        r2 = r8.getObject(r7, r0);
        r2 = (defpackage.rfi) r2;
        r3 = r2.a();
        if (r3 != 0) goto L_0x0234;
    L_0x0223:
        r3 = r2.size();
        if (r3 == 0) goto L_0x022b;
    L_0x0229:
        r3 = r3 + r3;
        goto L_0x022d;
    L_0x022b:
        r3 = 10;
    L_0x022d:
        r2 = r2.a(r3);
        r8.putObject(r7, r0, r2);
    L_0x0234:
        r9 = r26;
        r10 = r29;
        r5 = r2;
        r3 = r15;
        r0 = r9.a(r10);
        r1 = r17;
        r2 = r28;
        r4 = r30;
        r6 = r31;
        r0 = defpackage.rgl.a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x026e;
    L_0x024b:
        r9 = r26;
        r7 = r27;
        r10 = r29;
        r3 = r15;
        r8 = r25;
    L_0x0254:
        r2 = r3;
        goto L_0x0260;
    L_0x0256:
        r24 = r7;
        r3 = r8;
        r8 = r9;
        r7 = r14;
        r9 = r15;
        r18 = -1;
        r2 = r3;
        r10 = 0;
    L_0x0260:
        r0 = r17;
        r1 = r28;
        r3 = r30;
        r4 = r27;
        r5 = r31;
        r0 = defpackage.rgl.a(r0, r1, r2, r3, r4, r5);
    L_0x026e:
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r14 = r7;
        r15 = r9;
        r2 = r10;
        r1 = r24;
        r10 = -1;
        r9 = r8;
        goto L_0x0017;
    L_0x027d:
        r7 = r14;
        r9 = r15;
        r5 = 0;
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r29;
        r4 = r30;
        r6 = r31;
        r0.a(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgl.a(java.lang.Object, byte[], int, int, rcx):void");
    }

    public final void c(Object obj) {
        int i;
        int i2 = this.l;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            long c = (long) (c(this.k[i2]) & 1048575);
            Object f = rhv.f(obj, c);
            if (f != null) {
                rhv.a(obj, c, this.r.d(f));
            }
            i2++;
        }
        i2 = this.k.length;
        while (i < i2) {
            this.o.b(obj, (long) this.k[i]);
            i++;
        }
        this.p.d(obj);
        if (this.h) {
            this.q.c(obj);
        }
    }

    private final Object a(Object obj, int i, Object obj2, rhp rhp) {
        int i2 = this.c[i];
        obj = rhv.f(obj, (long) (c(i) & 1048575));
        if (obj != null) {
            rfg b = b(i);
            if (b != null) {
                Map a = this.r.a(obj);
                rfz b2 = this.r.b();
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (b.a(((Integer) entry.getValue()).intValue()) == null) {
                        if (obj2 == null) {
                            obj2 = rhp.b();
                        }
                        rdl c = rdg.c(rga.a(b2, entry.getKey(), entry.getValue()));
                        try {
                            rga.a(c.a, b2, entry.getKey(), entry.getValue());
                            rhp.a(obj2, i2, c.a());
                            it.remove();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public final boolean d(Object obj) {
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < this.l; i3++) {
            int i4;
            int i5;
            int i6 = this.k[i3];
            int i7 = this.c[i6];
            int c = c(i6);
            if (this.j) {
                i4 = 0;
            } else {
                i5 = this.c[i6 + 2];
                int i8 = i5 & 1048575;
                i4 = 1 << (i5 >>> 20);
                if (i8 != i2) {
                    i = b.getInt(obj, (long) i8);
                    i2 = i8;
                }
            }
            if ((268435456 & c) != 0 && !a(obj, i6, i, i4)) {
                return false;
            }
            i5 = (c >>> 20) & 255;
            if (i5 != 9 && i5 != 17) {
                if (i5 != 27) {
                    if (i5 == 60 || i5 == 68) {
                        if (a(obj, i7, i6) && !rgl.a(obj, c, a(i6))) {
                            return false;
                        }
                    } else if (i5 != 49) {
                        if (i5 != 50) {
                            continue;
                        } else {
                            Map b = this.r.b(rhv.f(obj, (long) (c & 1048575)));
                            if (!b.isEmpty() && this.r.b().c.t == 9) {
                                rha rha = null;
                                for (Object next : b.values()) {
                                    if (rha == null) {
                                        rha = rgw.a.a(next.getClass());
                                    }
                                    if (!rha.d(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) rhv.f(obj, (long) (c & 1048575));
                if (list.isEmpty()) {
                    continue;
                } else {
                    rha a = a(i6);
                    for (i7 = 0; i7 < list.size(); i7++) {
                        if (!a.d(list.get(i7))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (a(obj, i6, i, i4) && !rgl.a(obj, c, a(i6))) {
                return false;
            }
        }
        return !this.h || this.q.a(obj).d();
    }

    private static boolean a(Object obj, int i, rha rha) {
        return rha.d(rhv.f(obj, (long) (i & 1048575)));
    }

    private static void a(int i, Object obj, rik rik) {
        if (obj instanceof String) {
            rik.a(i, (String) obj);
        } else {
            rik.a(i, (rdg) obj);
        }
    }

    private final void a(Object obj, int i, rgx rgx) {
        if (rgl.e(i)) {
            rhv.a(obj, (long) (i & 1048575), rgx.m());
        } else if (this.i) {
            rhv.a(obj, (long) (i & 1048575), rgx.l());
        } else {
            rhv.a(obj, (long) (i & 1048575), rgx.n());
        }
    }

    private final int c(int i) {
        return this.c[i + 1];
    }

    private final int d(int i) {
        return this.c[i + 2];
    }

    private static double b(Object obj, long j) {
        return ((Double) rhv.f(obj, j)).doubleValue();
    }

    private static float c(Object obj, long j) {
        return ((Float) rhv.f(obj, j)).floatValue();
    }

    private static int d(Object obj, long j) {
        return ((Integer) rhv.f(obj, j)).intValue();
    }

    private static long e(Object obj, long j) {
        return ((Long) rhv.f(obj, j)).longValue();
    }

    private static boolean f(Object obj, long j) {
        return ((Boolean) rhv.f(obj, j)).booleanValue();
    }

    private final boolean c(Object obj, Object obj2, int i) {
        return a(obj, i) == a(obj2, i);
    }

    private final boolean a(Object obj, int i, int i2, int i3) {
        if (this.j) {
            return a(obj, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean a(Object obj, int i) {
        if (this.j) {
            i = c(i);
            long j = (long) (i & 1048575);
            switch ((i >>> 20) & 255) {
                case 0:
                    return rhv.e(obj, j) != 0.0d;
                case 1:
                    return rhv.d(obj, j) != 0.0f;
                case 2:
                    return rhv.b(obj, j) != 0;
                case 3:
                    return rhv.b(obj, j) != 0;
                case 4:
                    return rhv.a(obj, j) != 0;
                case 5:
                    return rhv.b(obj, j) != 0;
                case 6:
                    return rhv.a(obj, j) != 0;
                case 7:
                    return rhv.c(obj, j);
                case 8:
                    obj = rhv.f(obj, j);
                    if (obj instanceof String) {
                        return !((String) obj).isEmpty();
                    } else {
                        if (obj instanceof rdg) {
                            return !rdg.a.equals(obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return rhv.f(obj, j) != null;
                case 10:
                    return !rdg.a.equals(rhv.f(obj, j));
                case 11:
                    return rhv.a(obj, j) != 0;
                case 12:
                    return rhv.a(obj, j) != 0;
                case 13:
                    return rhv.a(obj, j) != 0;
                case 14:
                    return rhv.b(obj, j) != 0;
                case 15:
                    return rhv.a(obj, j) != 0;
                case 16:
                    return rhv.b(obj, j) != 0;
                case 17:
                    return rhv.f(obj, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        i = d(i);
        return (rhv.a(obj, (long) (i & 1048575)) & (1 << (i >>> 20))) != 0;
    }

    private final void b(Object obj, int i) {
        if (!this.j) {
            i = d(i);
            long j = (long) (1048575 & i);
            rhv.a(obj, j, (1 << (i >>> 20)) | rhv.a(obj, j));
        }
    }

    private final boolean a(Object obj, int i, int i2) {
        return rhv.a(obj, (long) (d(i2) & 1048575)) == i;
    }

    private final void b(Object obj, int i, int i2) {
        rhv.a(obj, (long) (d(i2) & 1048575), i);
    }

    private final int f(int i) {
        return (i < this.e || i > this.f) ? -1 : b(i, 0);
    }

    private final int a(int i, int i2) {
        return (i < this.e || i > this.f) ? -1 : b(i, i2);
    }

    private final int b(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.c[i4];
            if (i == i5) {
                return i4;
            }
            if (i >= i5) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        return -1;
    }
}
