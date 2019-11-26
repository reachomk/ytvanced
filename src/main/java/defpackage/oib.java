package defpackage;

/* renamed from: oib */
final class oib implements oig {
    public final long a;
    public final long b;
    public final oii c;
    public long d;
    private final oih e = new oih();
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public oib(long j, long j2, oii oii, long j3, long j4, boolean z) {
        boolean z2 = j >= 0 && j2 > j;
        oxz.a(z2);
        this.c = oii;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 3;
            return;
        }
        this.f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf  */
    public final long a(defpackage.ofp r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r0.f;
        r3 = 1;
        r4 = 3;
        r5 = 0;
        if (r2 == 0) goto L_0x0102;
    L_0x000b:
        if (r2 == r3) goto L_0x0115;
    L_0x000d:
        r3 = 2;
        r6 = -1;
        if (r2 == r3) goto L_0x001b;
    L_0x0012:
        if (r2 != r4) goto L_0x0015;
    L_0x0014:
        return r6;
    L_0x0015:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x001b:
        r2 = r0.h;
        r8 = 2;
        r10 = 0;
        r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r12 == 0) goto L_0x00fa;
    L_0x0025:
        r12 = r0.i;
        r14 = r0.j;
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r16 != 0) goto L_0x0033;
    L_0x002d:
        r2 = r0.k;
    L_0x002f:
        r2 = r2 + r8;
        r2 = -r2;
        goto L_0x00cb;
    L_0x0033:
        r12 = r1;
        r12 = (defpackage.ofl) r12;
        r12 = r12.c;
        r14 = r0.a(r1, r14);
        if (r14 != 0) goto L_0x004e;
    L_0x003e:
        r2 = r0.i;
        r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0046;
    L_0x0044:
        goto L_0x00cb;
    L_0x0046:
        r1 = new java.io.IOException;
        r2 = "No ogg page can be found.";
        r1.<init>(r2);
        throw r1;
    L_0x004e:
        r14 = r0.e;
        r14.a(r1, r5);
        r20.a();
        r14 = r0.e;
        r4 = r14.b;
        r2 = r2 - r4;
        r15 = r14.d;
        r14 = r14.e;
        r15 = r15 + r14;
        r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r14 < 0) goto L_0x0073;
    L_0x0064:
        r17 = 72000; // 0x11940 float:1.00893E-40 double:3.55727E-319;
        r14 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1));
        if (r14 > 0) goto L_0x0073;
    L_0x006b:
        r1.a(r15);
        r2 = r0.e;
        r2 = r2.b;
        goto L_0x002f;
    L_0x0073:
        r17 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r14 < 0) goto L_0x0094;
    L_0x007a:
        r12 = (long) r15;
        r14 = r1;
        r14 = (defpackage.ofl) r14;
        r6 = r14.c;
        r6 = r6 + r12;
        r0.i = r6;
        r0.k = r4;
        r4 = r0.j;
        r6 = r4 - r6;
        r6 = r6 + r12;
        r12 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1));
        if (r12 >= 0) goto L_0x0099;
    L_0x008e:
        r1.a(r15);
        r2 = r0.k;
        goto L_0x002f;
    L_0x0094:
        r0.j = r12;
        r0.l = r4;
        r4 = r12;
    L_0x0099:
        r6 = r0.i;
        r4 = r4 - r6;
        r12 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1));
        if (r12 < 0) goto L_0x00c8;
    L_0x00a0:
        r12 = (long) r15;
        r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r14 > 0) goto L_0x00a7;
    L_0x00a5:
        r14 = r8;
        goto L_0x00a9;
    L_0x00a7:
        r14 = 1;
    L_0x00a9:
        r8 = r1;
        r8 = (defpackage.ofl) r8;
        r8 = r8.c;
        r12 = r12 * r14;
        r8 = r8 - r12;
        r2 = r2 * r4;
        r4 = r0.l;
        r12 = r0.k;
        r4 = r4 - r12;
        r2 = r2 / r4;
        r8 = r8 + r2;
        r2 = java.lang.Math.max(r8, r6);
        r4 = r0.j;
        r6 = -1;
        r4 = r4 + r6;
        r2 = java.lang.Math.min(r2, r4);
        goto L_0x00cb;
    L_0x00c8:
        r0.j = r6;
        r2 = r6;
    L_0x00cb:
        r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x00f9;
    L_0x00cf:
        r4 = r0.h;
        r6 = 2;
        r2 = r2 + r6;
        r2 = -r2;
        r6 = r0.e;
        r7 = 0;
        r6.a(r1, r7);
        r10 = r2;
    L_0x00dc:
        r2 = r0.e;
        r6 = r2.b;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x00f5;
    L_0x00e4:
        r3 = r2.d;
        r2 = r2.e;
        r3 = r3 + r2;
        r1.a(r3);
        r2 = r0.e;
        r10 = r2.b;
        r3 = 0;
        r2.a(r1, r3);
        goto L_0x00dc;
    L_0x00f5:
        r20.a();
        goto L_0x00fa;
    L_0x00f9:
        return r2;
    L_0x00fa:
        r1 = 3;
        r0.f = r1;
        r1 = 2;
        r10 = r10 + r1;
        r1 = -r10;
        return r1;
    L_0x0102:
        r2 = r1;
        r2 = (defpackage.ofl) r2;
        r4 = r2.c;
        r0.g = r4;
        r0.f = r3;
        r2 = r0.b;
        r6 = -65307; // 0xffffffffffff00e5 float:NaN double:NaN;
        r2 = r2 + r6;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0155;
    L_0x0115:
        r2 = r0.b;
        r2 = r0.a(r1, r2);
        if (r2 == 0) goto L_0x014f;
    L_0x011d:
        r2 = r0.e;
        r2.a();
    L_0x0122:
        r2 = r0.e;
        r3 = r2.a;
        r4 = 4;
        r3 = r3 & r4;
        if (r3 != r4) goto L_0x012b;
    L_0x012a:
        goto L_0x0145;
    L_0x012b:
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r3 = r3.c;
        r5 = r0.b;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x0145;
    L_0x0136:
        r3 = 0;
        r2.a(r1, r3);
        r2 = r0.e;
        r4 = r2.d;
        r2 = r2.e;
        r4 = r4 + r2;
        r1.a(r4);
        goto L_0x0122;
    L_0x0145:
        r1 = r2.b;
        r0.d = r1;
        r1 = 3;
        r0.f = r1;
        r1 = r0.g;
        return r1;
    L_0x014f:
        r1 = new java.io.EOFException;
        r1.<init>();
        throw r1;
    L_0x0155:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oib.a(ofp):long");
    }

    public final long b_(long j) {
        int i = this.f;
        boolean z = true;
        if (!(i == 3 || i == 2)) {
            z = false;
        }
        oxz.a(z);
        j = j != 0 ? this.c.b(j) : 0;
        this.h = j;
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0;
        this.l = this.d;
        return j;
    }

    private final boolean a(ofp ofp, long j) {
        j = Math.min(j + 3, this.b);
        int i = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i2;
            long j2 = ((ofl) ofp).c;
            int i3 = 0;
            if (((long) i) + j2 > j) {
                i = (int) (j - j2);
                if (i < 4) {
                    return false;
                }
            }
            ofp.b(bArr, 0, i, false);
            while (true) {
                i2 = i - 3;
                if (i3 >= i2) {
                    break;
                } else if (bArr[i3] == (byte) 79 && bArr[i3 + 1] == (byte) 103 && bArr[i3 + 2] == (byte) 103 && bArr[i3 + 3] == (byte) 83) {
                    ofp.a(i3);
                    return true;
                } else {
                    i3++;
                }
            }
            ofp.a(i2);
        }
    }

    public final /* synthetic */ ofu a() {
        return this.d != 0 ? new oia(this) : null;
    }
}
