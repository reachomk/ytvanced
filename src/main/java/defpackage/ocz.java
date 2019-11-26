package defpackage;

import java.util.Arrays;

/* renamed from: ocz */
final class ocz {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    private final int r;
    private final int s;
    private final int t;
    private final short[] u;
    private short[] v;

    public ocz(int i, int i2, float f, float f2, int i3) {
        this.r = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = ((float) i) / ((float) i3);
        this.s = i / 400;
        i /= 65;
        this.t = i;
        i += i;
        this.e = i;
        this.u = new short[i];
        i *= i2;
        this.f = new short[i];
        this.h = new short[i];
        this.v = new short[i];
    }

    public final short[] a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a;
        length /= i3;
        return i + i2 > length ? Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * i3) : sArr;
    }

    private final void b(short[] sArr, int i, int i2) {
        this.h = a(this.h, this.i, i2);
        int i3 = this.a;
        System.arraycopy(sArr, i * i3, this.h, this.i * i3, i3 * i2);
        this.i += i2;
    }

    private final void c(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.a;
        i2 *= i4;
        i *= i4;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                i6 += sArr[((i5 * i2) + i) + i7];
            }
            this.u[i5] = (short) (i6 / i2);
        }
    }

    private final int a(short[] sArr, int i, int i2, int i3) {
        i *= this.a;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 255;
        while (i2 <= i3) {
            int i8;
            int i9 = 0;
            for (i8 = 0; i8 < i2; i8++) {
                i9 += Math.abs(sArr[i + i8] - sArr[(i + i2) + i8]);
            }
            i8 = i9 * i5;
            int i10 = i4 * i2;
            if (i8 < i10) {
                i4 = i9;
            }
            if (i8 < i10) {
                i5 = i2;
            }
            i8 = i9 * i7;
            i10 = i6 * i2;
            if (i8 > i10) {
                i6 = i9;
            }
            if (i8 > i10) {
                i7 = i2;
            }
            i2++;
        }
        this.p = i4 / i5;
        this.q = i6 / i7;
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    public final void a() {
        /*
        r20 = this;
        r0 = r20;
        r1 = r0.i;
        r2 = r0.b;
        r3 = r0.c;
        r2 = r2 / r3;
        r4 = r0.d;
        r4 = r4 * r3;
        r5 = (double) r2;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = 0;
        r8 = 1;
        r9 = 4607182463836013682; // 0x3ff0000a7c5ac472 float:4.5436204E36 double:1.00001;
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x001c;
    L_0x001b:
        goto L_0x002f;
    L_0x001c:
        r9 = 4607182328728024861; // 0x3fefffeb074a771d float:1.5231795E-34 double:0.99999;
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 < 0) goto L_0x002f;
    L_0x0025:
        r2 = r0.f;
        r5 = r0.g;
        r0.b(r2, r7, r5);
        r0.g = r7;
        goto L_0x0035;
    L_0x002f:
        r9 = r0.g;
        r10 = r0.e;
        if (r9 >= r10) goto L_0x0039;
    L_0x0035:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0183;
    L_0x0039:
        r10 = 0;
    L_0x003a:
        r11 = r0.m;
        if (r11 > 0) goto L_0x0156;
    L_0x003e:
        r11 = r0.f;
        r12 = r0.r;
        r13 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        if (r12 <= r13) goto L_0x0049;
    L_0x0046:
        r12 = r12 / 4000;
        goto L_0x004a;
    L_0x0049:
        r12 = 1;
    L_0x004a:
        r13 = r0.a;
        if (r13 == r8) goto L_0x004f;
    L_0x004e:
        goto L_0x005a;
    L_0x004f:
        if (r12 != r8) goto L_0x005a;
    L_0x0051:
        r12 = r0.s;
        r13 = r0.t;
        r11 = r0.a(r11, r10, r12, r13);
        goto L_0x0091;
    L_0x005a:
        r0.c(r11, r10, r12);
        r13 = r0.u;
        r14 = r0.s;
        r14 = r14 / r12;
        r15 = r0.t;
        r15 = r15 / r12;
        r13 = r0.a(r13, r7, r14, r15);
        if (r12 == r8) goto L_0x0090;
    L_0x006b:
        r13 = r13 * r12;
        r12 = r12 << 2;
        r14 = r13 - r12;
        r13 = r13 + r12;
        r12 = r0.s;
        if (r14 >= r12) goto L_0x0077;
    L_0x0076:
        goto L_0x0078;
    L_0x0077:
        r12 = r14;
    L_0x0078:
        r14 = r0.t;
        if (r13 <= r14) goto L_0x007d;
    L_0x007c:
        r13 = r14;
    L_0x007d:
        r14 = r0.a;
        if (r14 != r8) goto L_0x0086;
    L_0x0081:
        r11 = r0.a(r11, r10, r12, r13);
        goto L_0x0091;
    L_0x0086:
        r0.c(r11, r10, r8);
        r11 = r0.u;
        r11 = r0.a(r11, r7, r12, r13);
        goto L_0x0091;
    L_0x0090:
        r11 = r13;
    L_0x0091:
        r12 = r0.p;
        r13 = r0.q;
        if (r12 != 0) goto L_0x0098;
    L_0x0097:
        goto L_0x00aa;
    L_0x0098:
        r14 = r0.n;
        if (r14 == 0) goto L_0x00aa;
    L_0x009c:
        r15 = r12 * 3;
        if (r13 > r15) goto L_0x00aa;
    L_0x00a0:
        r13 = r12 + r12;
        r15 = r0.o;
        r15 = r15 * 3;
        if (r13 <= r15) goto L_0x00aa;
    L_0x00a8:
        r15 = r14;
        goto L_0x00ab;
    L_0x00aa:
        r15 = r11;
    L_0x00ab:
        r0.o = r12;
        r0.n = r11;
        r11 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r13 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r14 <= 0) goto L_0x00fd;
    L_0x00b7:
        r14 = r0.f;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r12 >= 0) goto L_0x00ca;
    L_0x00bf:
        r12 = (float) r15;
        r11 = r11 - r2;
        r12 = r12 * r11;
        r13 = r13 + r2;
        r12 = r12 / r13;
        r11 = (int) r12;
        r0.m = r11;
        r13 = r15;
        goto L_0x00cf;
    L_0x00ca:
        r11 = (float) r15;
        r13 = r13 + r2;
        r11 = r11 / r13;
        r11 = (int) r11;
        r13 = r11;
    L_0x00cf:
        r11 = r0.h;
        r12 = r0.i;
        r11 = r0.a(r11, r12, r13);
        r0.h = r11;
        r12 = r0.a;
        r11 = r0.h;
        r8 = r0.i;
        r18 = r10 + r15;
        r16 = r11;
        r11 = r13;
        r19 = r13;
        r13 = r16;
        r17 = r14;
        r14 = r8;
        r8 = r15;
        r15 = r17;
        r16 = r10;
        defpackage.ocz.a(r11, r12, r13, r14, r15, r16, r17, r18);
        r11 = r0.i;
        r11 = r11 + r19;
        r0.i = r11;
        r15 = r8 + r19;
        r10 = r10 + r15;
        goto L_0x0167;
    L_0x00fd:
        r8 = r15;
        r15 = r0.f;
        r11 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r11 < 0) goto L_0x0115;
    L_0x0106:
        r11 = (float) r8;
        r12 = r2 + r2;
        r12 = r12 + r13;
        r11 = r11 * r12;
        r12 = r3 - r2;
        r11 = r11 / r12;
        r11 = (int) r11;
        r0.m = r11;
        r19 = r8;
        goto L_0x011e;
    L_0x0115:
        r11 = (float) r8;
        r11 = r11 * r2;
        r12 = r3 - r2;
        r11 = r11 / r12;
        r11 = (int) r11;
        r19 = r11;
    L_0x011e:
        r14 = r8 + r19;
        r11 = r0.h;
        r12 = r0.i;
        r11 = r0.a(r11, r12, r14);
        r0.h = r11;
        r11 = r0.a;
        r12 = r10 * r11;
        r13 = r0.h;
        r3 = r0.i;
        r3 = r3 * r11;
        r11 = r11 * r8;
        java.lang.System.arraycopy(r15, r12, r13, r3, r11);
        r12 = r0.a;
        r13 = r0.h;
        r3 = r0.i;
        r3 = r3 + r8;
        r16 = r10 + r8;
        r11 = r19;
        r8 = r14;
        r14 = r3;
        r3 = r15;
        r17 = r3;
        r18 = r10;
        defpackage.ocz.a(r11, r12, r13, r14, r15, r16, r17, r18);
        r3 = r0.i;
        r3 = r3 + r8;
        r0.i = r3;
        r10 = r10 + r19;
        goto L_0x0167;
    L_0x0156:
        r3 = r0.e;
        r3 = java.lang.Math.min(r3, r11);
        r8 = r0.f;
        r0.b(r8, r10, r3);
        r8 = r0.m;
        r8 = r8 - r3;
        r0.m = r8;
        r10 = r10 + r3;
    L_0x0167:
        r3 = r0.e;
        r3 = r3 + r10;
        if (r3 > r9) goto L_0x0171;
    L_0x016c:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 1;
        goto L_0x003a;
    L_0x0171:
        r2 = r0.g;
        r2 = r2 - r10;
        r3 = r0.f;
        r5 = r0.a;
        r10 = r10 * r5;
        r5 = r5 * r2;
        java.lang.System.arraycopy(r3, r10, r3, r7, r5);
        r0.g = r2;
        goto L_0x0035;
    L_0x0183:
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x024a;
    L_0x0187:
        r2 = r0.i;
        if (r2 == r1) goto L_0x024a;
    L_0x018b:
        r2 = r0.r;
        r3 = (float) r2;
        r3 = r3 / r4;
        r3 = (int) r3;
    L_0x0190:
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r3 <= r4) goto L_0x0197;
    L_0x0194:
        r8 = 1;
        goto L_0x0244;
    L_0x0197:
        if (r2 > r4) goto L_0x0194;
    L_0x0199:
        r4 = r0.i;
        r4 = r4 - r1;
        r5 = r0.v;
        r6 = r0.j;
        r5 = r0.a(r5, r6, r4);
        r0.v = r5;
        r5 = r0.h;
        r6 = r0.a;
        r8 = r1 * r6;
        r9 = r0.v;
        r10 = r0.j;
        r10 = r10 * r6;
        r6 = r6 * r4;
        java.lang.System.arraycopy(r5, r8, r9, r10, r6);
        r0.i = r1;
        r1 = r0.j;
        r1 = r1 + r4;
        r0.j = r1;
        r1 = 0;
    L_0x01bf:
        r4 = r0.j;
        r5 = r4 + -1;
        if (r1 >= r5) goto L_0x022f;
    L_0x01c5:
        r4 = r0.k;
        r5 = 1;
        r4 = r4 + r5;
        r6 = r0.l;
        r8 = r4 * r3;
        r9 = r6 * r2;
        if (r8 <= r9) goto L_0x021a;
    L_0x01d1:
        r4 = r0.h;
        r6 = r0.i;
        r4 = r0.a(r4, r6, r5);
        r0.h = r4;
        r4 = 0;
    L_0x01dc:
        r5 = r0.a;
        if (r4 >= r5) goto L_0x020e;
    L_0x01e0:
        r6 = r0.h;
        r8 = r0.i;
        r9 = r0.v;
        r10 = r1 * r5;
        r10 = r10 + r4;
        r11 = r9[r10];
        r10 = r10 + r5;
        r9 = r9[r10];
        r10 = r0.l;
        r12 = r0.k;
        r13 = r12 + 1;
        r13 = r13 * r3;
        r10 = r10 * r2;
        r10 = r13 - r10;
        r12 = r12 * r3;
        r13 = r13 - r12;
        r8 = r8 * r5;
        r8 = r8 + r4;
        r11 = r11 * r10;
        r5 = r13 - r10;
        r5 = r5 * r9;
        r11 = r11 + r5;
        r11 = r11 / r13;
        r5 = (short) r11;
        r6[r8] = r5;
        r4 = r4 + 1;
        goto L_0x01dc;
    L_0x020e:
        r4 = r0.l;
        r8 = 1;
        r4 = r4 + r8;
        r0.l = r4;
        r4 = r0.i;
        r4 = r4 + r8;
        r0.i = r4;
        goto L_0x01c5;
    L_0x021a:
        r8 = 1;
        r0.k = r4;
        if (r4 == r2) goto L_0x0220;
    L_0x021f:
        goto L_0x022c;
    L_0x0220:
        r0.k = r7;
        if (r6 != r3) goto L_0x0226;
    L_0x0224:
        r4 = 1;
        goto L_0x0227;
    L_0x0226:
        r4 = 0;
    L_0x0227:
        defpackage.oxz.b(r4);
        r0.l = r7;
    L_0x022c:
        r1 = r1 + 1;
        goto L_0x01bf;
    L_0x022f:
        if (r5 != 0) goto L_0x0232;
    L_0x0231:
        goto L_0x024a;
    L_0x0232:
        r1 = r0.v;
        r2 = r0.a;
        r3 = r5 * r2;
        r4 = r4 - r5;
        r4 = r4 * r2;
        java.lang.System.arraycopy(r1, r3, r1, r7, r4);
        r1 = r0.j;
        r1 = r1 - r5;
        r0.j = r1;
        goto L_0x024a;
    L_0x0244:
        r3 = r3 / 2;
        r2 = r2 / 2;
        goto L_0x0190;
    L_0x024a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocz.a():void");
    }

    private static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
