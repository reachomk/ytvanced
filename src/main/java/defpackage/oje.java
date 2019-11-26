package defpackage;

/* renamed from: oje */
public final class oje implements ojf {
    private static final double[] c = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private ofy b;
    private boolean d;
    private long e;
    private final okn f;
    private final oza g;
    private final boolean[] h;
    private final ojh i;
    private final ojo j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    public oje() {
        this(null);
    }

    public final void b() {
    }

    public oje(okn okn) {
        this.f = okn;
        this.h = new boolean[4];
        this.i = new ojh();
        if (okn != null) {
            this.j = new ojo(178);
            this.g = new oza();
            return;
        }
        this.j = null;
        this.g = null;
    }

    public final void a() {
        oyw.a(this.h);
        ojh ojh = this.i;
        ojh.b = false;
        ojh.c = 0;
        ojh.d = 0;
        if (this.f != null) {
            this.j.a();
        }
        this.k = 0;
        this.l = false;
    }

    public final void a(ofo ofo, okl okl) {
        ofo ofo2 = ofo;
        okl.a();
        this.a = okl.c();
        this.b = ofo2.a(okl.b(), 2);
        okn okn = this.f;
        if (okn != null) {
            for (int i = 0; i < okn.b.length; i++) {
                Object str;
                okl.a();
                ofy a = ofo2.a(okl.b(), 3);
                nzw nzw = (nzw) okn.a.get(i);
                String str2 = nzw.i;
                boolean z = true;
                if (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2))) {
                    z = false;
                }
                String valueOf = String.valueOf(str2);
                String str3 = "Invalid closed caption mime type provided: ";
                if (valueOf.length() == 0) {
                    str = new String(str3);
                } else {
                    str = str3.concat(valueOf);
                }
                oxz.a(z, str);
                a.a(nzw.a(okl.c(), str2, nzw.c, nzw.A, nzw.B, null, Long.MAX_VALUE, nzw.k));
                okn.b[i] = a;
            }
        }
    }

    public final void a(long j, int i) {
        this.m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    public final void a(defpackage.oza r26) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.k;
        r7 = r26.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.k = r5;
        r5 = r0.b;
        r6 = r26.b();
        r5.a(r1, r6);
    L_0x001d:
        r5 = r0.h;
        r5 = defpackage.oyw.a(r4, r2, r3, r5);
        if (r5 != r3) goto L_0x0038;
    L_0x0025:
        r1 = r0.d;
        if (r1 != 0) goto L_0x002e;
    L_0x0029:
        r1 = r0.i;
        r1.a(r4, r2, r3);
    L_0x002e:
        r1 = r0.f;
        if (r1 == 0) goto L_0x0037;
    L_0x0032:
        r1 = r0.j;
        r1.a(r4, r2, r3);
    L_0x0037:
        return;
    L_0x0038:
        r6 = r5 + 3;
        r7 = r1.a;
        r7 = r7[r6];
        r7 = r7 & 255;
        r8 = r5 - r2;
        r9 = r0.d;
        r14 = 3;
        r15 = 0;
        if (r9 == 0) goto L_0x004a;
    L_0x0048:
        goto L_0x0132;
    L_0x004a:
        if (r8 <= 0) goto L_0x0051;
    L_0x004c:
        r9 = r0.i;
        r9.a(r4, r2, r5);
    L_0x0051:
        if (r8 >= 0) goto L_0x0055;
    L_0x0053:
        r9 = -r8;
        goto L_0x0056;
    L_0x0055:
        r9 = 0;
    L_0x0056:
        r12 = r0.i;
        r10 = r12.b;
        if (r10 == 0) goto L_0x0122;
    L_0x005c:
        r10 = r12.c;
        r10 = r10 - r9;
        r12.c = r10;
        r9 = r12.d;
        if (r9 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x006e;
    L_0x0066:
        r9 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        if (r7 != r9) goto L_0x006e;
    L_0x006a:
        r12.d = r10;
        goto L_0x0129;
    L_0x006e:
        r12.b = r15;
        r9 = r0.a;
        r15 = r12.e;
        r10 = java.util.Arrays.copyOf(r15, r10);
        r15 = 4;
        r11 = r10[r15];
        r24 = 5;
        r13 = r10[r24];
        r13 = r13 & 255;
        r11 = r11 & 255;
        r11 = r11 << r15;
        r17 = r13 >> 4;
        r20 = r11 | r17;
        r11 = r13 & 15;
        r11 = r11 << 8;
        r13 = 6;
        r13 = r10[r13];
        r13 = r13 & 255;
        r21 = r11 | r13;
        r11 = 7;
        r13 = r10[r11];
        r13 = r13 & 240;
        r13 = r13 >> r15;
        r11 = 2;
        if (r13 == r11) goto L_0x00b1;
    L_0x009c:
        if (r13 == r14) goto L_0x00ab;
    L_0x009e:
        if (r13 == r15) goto L_0x00a5;
    L_0x00a0:
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r23 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x00ba;
    L_0x00a5:
        r11 = r21 * 121;
        r11 = (float) r11;
        r13 = r20 * 100;
        goto L_0x00b6;
    L_0x00ab:
        r11 = r21 << 4;
        r11 = (float) r11;
        r13 = r20 * 9;
        goto L_0x00b6;
    L_0x00b1:
        r11 = r21 << 2;
        r11 = (float) r11;
        r13 = r20 * 3;
    L_0x00b6:
        r13 = (float) r13;
        r11 = r11 / r13;
        r23 = r11;
    L_0x00ba:
        r19 = 0;
        r22 = java.util.Collections.singletonList(r10);
        r18 = "video/mpeg2";
        r17 = r9;
        r9 = defpackage.nzw.a(r17, r18, r19, r20, r21, r22, r23);
        r11 = 7;
        r11 = r10[r11];
        r11 = r11 & 15;
        r11 = r11 + -1;
        if (r11 < 0) goto L_0x0101;
    L_0x00d1:
        r13 = c;
        r15 = r13.length;
        if (r11 >= r15) goto L_0x0101;
    L_0x00d6:
        r17 = r13[r11];
        r11 = r12.d;
        r12 = 9;
        r11 = r11 + r12;
        r10 = r10[r11];
        r11 = r10 & 96;
        r11 = r11 >> 5;
        r10 = r10 & 31;
        if (r11 == r10) goto L_0x00f8;
    L_0x00e7:
        r11 = (double) r11;
        r19 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        java.lang.Double.isNaN(r11);
        r11 = r11 + r19;
        r10 = r10 + 1;
        r14 = (double) r10;
        java.lang.Double.isNaN(r14);
        r11 = r11 / r14;
        r17 = r17 * r11;
    L_0x00f8:
        r10 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r10 = r10 / r17;
        r11 = (long) r10;
        goto L_0x0103;
    L_0x0101:
        r11 = 0;
    L_0x0103:
        r10 = java.lang.Long.valueOf(r11);
        r9 = android.util.Pair.create(r9, r10);
        r10 = r0.b;
        r11 = r9.first;
        r11 = (defpackage.nzw) r11;
        r10.a(r11);
        r9 = r9.second;
        r9 = (java.lang.Long) r9;
        r9 = r9.longValue();
        r0.e = r9;
        r9 = 1;
        r0.d = r9;
        goto L_0x0132;
    L_0x0122:
        r9 = 1;
        r10 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        if (r7 != r10) goto L_0x0129;
    L_0x0127:
        r12.b = r9;
    L_0x0129:
        r9 = defpackage.ojh.a;
        r10 = defpackage.ojh.a;
        r10 = r10.length;
        r11 = 0;
        r12.a(r9, r11, r10);
    L_0x0132:
        r9 = r0.f;
        if (r9 == 0) goto L_0x0198;
    L_0x0136:
        if (r8 <= 0) goto L_0x013f;
    L_0x0138:
        r8 = r0.j;
        r8.a(r4, r2, r5);
        r15 = 0;
        goto L_0x0140;
    L_0x013f:
        r15 = -r8;
    L_0x0140:
        r2 = r0.j;
        r2 = r2.b(r15);
        if (r2 == 0) goto L_0x0186;
    L_0x0148:
        r2 = r0.j;
        r8 = r2.b;
        r2 = r2.c;
        r2 = defpackage.oyw.a(r8, r2);
        r8 = r0.g;
        r9 = r0.j;
        r9 = r9.b;
        r8.a(r9, r2);
        r2 = r0.f;
        r8 = r0.o;
        r10 = r0.g;
        r11 = r10.b();
        r12 = 9;
        if (r11 < r12) goto L_0x0186;
    L_0x0169:
        r11 = r10.k();
        r12 = r10.k();
        r14 = r10.d();
        r15 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        if (r11 != r15) goto L_0x0186;
    L_0x0179:
        r11 = defpackage.ose.a;
        if (r12 == r11) goto L_0x017e;
    L_0x017d:
        goto L_0x0186;
    L_0x017e:
        r11 = 3;
        if (r14 != r11) goto L_0x0186;
    L_0x0181:
        r2 = r2.b;
        defpackage.ose.b(r8, r10, r2);
    L_0x0186:
        r2 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        if (r7 != r2) goto L_0x0198;
    L_0x018a:
        r8 = r1.a;
        r9 = r5 + 2;
        r8 = r8[r9];
        r9 = 1;
        if (r8 != r9) goto L_0x0198;
    L_0x0193:
        r8 = r0.j;
        r8.a(r2);
    L_0x0198:
        if (r7 != 0) goto L_0x019b;
    L_0x019a:
        goto L_0x01a7;
    L_0x019b:
        r2 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        if (r7 == r2) goto L_0x01a7;
    L_0x019f:
        r2 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        if (r7 != r2) goto L_0x0205;
    L_0x01a3:
        r2 = 1;
        r0.p = r2;
        goto L_0x0205;
    L_0x01a7:
        r2 = r3 - r5;
        r5 = r0.l;
        if (r5 == 0) goto L_0x01cd;
    L_0x01ad:
        r5 = r0.q;
        if (r5 == 0) goto L_0x01cd;
    L_0x01b1:
        r5 = r0.d;
        if (r5 == 0) goto L_0x01cd;
    L_0x01b5:
        r11 = r0.p;
        r8 = r0.k;
        r12 = r0.n;
        r5 = r0.b;
        r14 = r0.o;
        r8 = r8 - r12;
        r9 = (int) r8;
        r12 = r9 - r2;
        r16 = 0;
        r8 = r5;
        r9 = r14;
        r13 = r2;
        r14 = r16;
        r8.a(r9, r11, r12, r13, r14);
    L_0x01cd:
        r5 = r0.l;
        if (r5 == 0) goto L_0x01d9;
    L_0x01d1:
        r8 = r0.q;
        if (r8 == 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x01d9;
    L_0x01d6:
        r2 = 0;
        r9 = 1;
        goto L_0x0200;
    L_0x01d9:
        r8 = r0.k;
        r10 = (long) r2;
        r8 = r8 - r10;
        r0.n = r8;
        r11 = r0.m;
        r8 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x01ec;
    L_0x01ea:
        r10 = r11;
        goto L_0x01f6;
    L_0x01ec:
        if (r5 == 0) goto L_0x01f4;
    L_0x01ee:
        r10 = r0.o;
        r12 = r0.e;
        r10 = r10 + r12;
        goto L_0x01f6;
    L_0x01f4:
        r10 = 0;
    L_0x01f6:
        r0.o = r10;
        r2 = 0;
        r0.p = r2;
        r0.m = r8;
        r9 = 1;
        r0.l = r9;
    L_0x0200:
        if (r7 != 0) goto L_0x0203;
    L_0x0202:
        r2 = 1;
    L_0x0203:
        r0.q = r2;
    L_0x0205:
        r2 = r6;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oje.a(oza):void");
    }
}
