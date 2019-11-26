package defpackage;

/* renamed from: nty */
final class nty extends ntv {
    private static final double[] a = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private boolean c;
    private long d;
    private final boolean[] e = new boolean[4];
    private final ntx f = new ntx();
    private boolean g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;

    public nty(nrs nrs) {
        super(nrs);
    }

    public final void b() {
    }

    public final void a() {
        nwv.a(this.e);
        ntx ntx = this.f;
        ntx.a = false;
        ntx.b = 0;
        ntx.c = 0;
        this.j = false;
        this.g = false;
        this.h = 0;
    }

    public final void a(long j, boolean z) {
        z = j != -1;
        this.j = z;
        if (z) {
            this.i = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    public final void a(defpackage.nwz r27) {
        /*
        r26 = this;
        r0 = r26;
        r1 = r27;
        r2 = r27.b();
        if (r2 <= 0) goto L_0x0182;
    L_0x000a:
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.h;
        r7 = r27.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.h = r5;
        r5 = r0.b;
        r6 = r27.b();
        r5.a(r1, r6);
        r5 = r2;
    L_0x0024:
        r6 = r0.e;
        r2 = defpackage.nwv.a(r4, r2, r3, r6);
        if (r2 != r3) goto L_0x0036;
    L_0x002c:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0035;
    L_0x0030:
        r1 = r0.f;
        r1.a(r4, r5, r3);
    L_0x0035:
        return;
    L_0x0036:
        r6 = r2 + 3;
        r7 = r1.a;
        r7 = r7[r6];
        r7 = r7 & 255;
        r8 = r0.c;
        r10 = 0;
        if (r8 != 0) goto L_0x0120;
    L_0x0043:
        r8 = r2 - r5;
        if (r8 <= 0) goto L_0x004c;
    L_0x0047:
        r11 = r0.f;
        r11.a(r4, r5, r2);
    L_0x004c:
        if (r8 >= 0) goto L_0x0050;
    L_0x004e:
        r5 = -r8;
        goto L_0x0051;
    L_0x0050:
        r5 = 0;
    L_0x0051:
        r8 = r0.f;
        r11 = r8.a;
        if (r11 == 0) goto L_0x0119;
    L_0x0057:
        r11 = r8.c;
        if (r11 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0066;
    L_0x005c:
        r11 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        if (r7 != r11) goto L_0x0066;
    L_0x0060:
        r5 = r8.b;
        r8.c = r5;
        goto L_0x0120;
    L_0x0066:
        r11 = r8.b;
        r11 = r11 - r5;
        r8.b = r11;
        r8.a = r10;
        r5 = r8.d;
        r5 = java.util.Arrays.copyOf(r5, r11);
        r11 = 4;
        r12 = r5[r11];
        r13 = 5;
        r14 = r5[r13];
        r14 = r14 & 255;
        r12 = r12 & 255;
        r12 = r12 << r11;
        r15 = r14 >> 4;
        r19 = r12 | r15;
        r12 = r14 & 15;
        r12 = r12 << 8;
        r14 = 6;
        r14 = r5[r14];
        r14 = r14 & 255;
        r20 = r12 | r14;
        r12 = 7;
        r14 = r5[r12];
        r14 = r14 & 240;
        r14 = r14 >> r11;
        r15 = 2;
        if (r14 == r15) goto L_0x00ac;
    L_0x0096:
        r15 = 3;
        if (r14 == r15) goto L_0x00a6;
    L_0x0099:
        if (r14 == r11) goto L_0x00a0;
    L_0x009b:
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r22 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x00b5;
    L_0x00a0:
        r11 = r20 * 121;
        r11 = (float) r11;
        r14 = r19 * 100;
        goto L_0x00b1;
    L_0x00a6:
        r11 = r20 << 4;
        r11 = (float) r11;
        r14 = r19 * 9;
        goto L_0x00b1;
    L_0x00ac:
        r11 = r20 << 2;
        r11 = (float) r11;
        r14 = r19 * 3;
    L_0x00b1:
        r14 = (float) r14;
        r11 = r11 / r14;
        r22 = r11;
    L_0x00b5:
        r17 = -1;
        r21 = java.util.Collections.singletonList(r5);
        r16 = "video/mpeg2";
        r11 = defpackage.nmx.a(r16, r17, r19, r20, r21, r22);
        r12 = r5[r12];
        r12 = r12 & 15;
        r12 = r12 + -1;
        if (r12 < 0) goto L_0x00f8;
    L_0x00c9:
        r14 = a;
        r15 = r14.length;
        if (r12 >= r15) goto L_0x00f8;
    L_0x00ce:
        r15 = r14[r12];
        r8 = r8.c;
        r8 = r8 + 9;
        r5 = r5[r8];
        r8 = r5 & 96;
        r8 = r8 >> r13;
        r5 = r5 & 31;
        if (r8 == r5) goto L_0x00ee;
    L_0x00dd:
        r12 = (double) r8;
        r17 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        java.lang.Double.isNaN(r12);
        r12 = r12 + r17;
        r5 = r5 + 1;
        r9 = (double) r5;
        java.lang.Double.isNaN(r9);
        r12 = r12 / r9;
        r15 = r15 * r12;
    L_0x00ee:
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r8 = r8 / r15;
        r8 = (long) r8;
        r16 = r8;
        goto L_0x00fa;
    L_0x00f8:
        r16 = 0;
    L_0x00fa:
        r5 = java.lang.Long.valueOf(r16);
        r5 = android.util.Pair.create(r11, r5);
        r8 = r0.b;
        r9 = r5.first;
        r9 = (defpackage.nmx) r9;
        r8.a(r9);
        r5 = r5.second;
        r5 = (java.lang.Long) r5;
        r8 = r5.longValue();
        r0.d = r8;
        r5 = 1;
        r0.c = r5;
        goto L_0x0120;
    L_0x0119:
        r5 = 1;
        r9 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        if (r7 != r9) goto L_0x0120;
    L_0x011e:
        r8.a = r5;
    L_0x0120:
        r5 = r0.c;
        if (r5 == 0) goto L_0x017b;
    L_0x0124:
        r5 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        if (r7 != r5) goto L_0x0129;
    L_0x0128:
        goto L_0x012c;
    L_0x0129:
        if (r7 == 0) goto L_0x012c;
    L_0x012b:
        goto L_0x017b;
    L_0x012c:
        r8 = r3 - r2;
        r9 = r0.g;
        if (r9 == 0) goto L_0x0153;
    L_0x0132:
        r9 = r0.k;
        r10 = r0.h;
        r12 = r0.l;
        r15 = r0.b;
        r16 = r6;
        r5 = r0.m;
        r10 = r10 - r12;
        r11 = (int) r10;
        r23 = r11 - r8;
        r25 = 0;
        r19 = r15;
        r20 = r5;
        r22 = r9;
        r24 = r8;
        r19.a(r20, r22, r23, r24, r25);
        r5 = 0;
        r0.k = r5;
        goto L_0x0156;
    L_0x0153:
        r16 = r6;
        r5 = 0;
    L_0x0156:
        r6 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        if (r7 != r6) goto L_0x0160;
    L_0x015a:
        r0.g = r5;
        r5 = 1;
        r0.k = r5;
        goto L_0x017d;
    L_0x0160:
        r5 = r0.j;
        if (r5 != 0) goto L_0x016a;
    L_0x0164:
        r5 = r0.m;
        r9 = r0.d;
        r5 = r5 + r9;
        goto L_0x016c;
    L_0x016a:
        r5 = r0.i;
    L_0x016c:
        r0.m = r5;
        r5 = r0.h;
        r7 = (long) r8;
        r5 = r5 - r7;
        r0.l = r5;
        r5 = 0;
        r0.j = r5;
        r5 = 1;
        r0.g = r5;
        goto L_0x017d;
    L_0x017b:
        r16 = r6;
    L_0x017d:
        r5 = r2;
        r2 = r16;
        goto L_0x0024;
    L_0x0182:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nty.a(nwz):void");
    }
}
