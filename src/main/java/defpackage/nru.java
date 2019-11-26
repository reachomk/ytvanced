package defpackage;

/* renamed from: nru */
public final class nru implements nrc, nrq {
    private static final int a = nxf.c("FLV");
    private final nwz b = new nwz(4);
    private final nwz c = new nwz(9);
    private final nwz d = new nwz(11);
    private final nwz e = new nwz();
    private nre g;
    private int h = 1;
    private int i;
    private int j;
    private int k;
    private long l;
    private nrr m;
    private nry n;
    private nrt o;

    public final boolean a() {
        return false;
    }

    public final long b(long j) {
        return 0;
    }

    public final void c() {
    }

    public final boolean a(nrb nrb) {
        nrb.c(this.b.a, 0, 3);
        this.b.c(0);
        if (this.b.g() == a) {
            nrb.c(this.b.a, 0, 2);
            this.b.c(0);
            if ((this.b.e() & 250) == 0) {
                nrb.c(this.b.a, 0, 4);
                this.b.c(0);
                int j = this.b.j();
                nrb.a();
                nrb.b(j);
                nrb.c(this.b.a, 0, 4);
                this.b.c(0);
                if (this.b.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(nre nre) {
        this.g = nre;
    }

    public final void b() {
        this.h = 1;
        this.i = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0000 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0000 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0000 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0071 A:{SYNTHETIC} */
    public final int a(defpackage.nrb r10, defpackage.nrm r11) {
        /*
        r9 = this;
    L_0x0000:
        r11 = r9.h;
        r0 = -1;
        r1 = 8;
        r2 = 9;
        r3 = 2;
        r4 = 4;
        r5 = 0;
        r6 = 1;
        if (r11 == r6) goto L_0x00c3;
    L_0x000d:
        r7 = 3;
        if (r11 == r3) goto L_0x00b8;
    L_0x0010:
        if (r11 == r7) goto L_0x0072;
    L_0x0012:
        if (r11 == r4) goto L_0x0015;
    L_0x0014:
        goto L_0x0000;
    L_0x0015:
        r11 = r9.j;
        if (r11 != r1) goto L_0x0027;
    L_0x0019:
        r0 = r9.m;
        if (r0 == 0) goto L_0x0027;
    L_0x001d:
        r11 = r9.b(r10);
        r1 = r9.l;
        r0.b(r11, r1);
        goto L_0x006b;
    L_0x0027:
        if (r11 == r2) goto L_0x002a;
    L_0x0029:
        goto L_0x0038;
    L_0x002a:
        r0 = r9.n;
        if (r0 == 0) goto L_0x0038;
    L_0x002e:
        r11 = r9.b(r10);
        r1 = r9.l;
        r0.b(r11, r1);
        goto L_0x006b;
    L_0x0038:
        r0 = 18;
        if (r11 != r0) goto L_0x0065;
    L_0x003c:
        r11 = r9.o;
        if (r11 == 0) goto L_0x0065;
    L_0x0040:
        r0 = r9.b(r10);
        r1 = r9.l;
        r11.b(r0, r1);
        r11 = r9.o;
        r0 = r11.b;
        r7 = -1;
        r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r2 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x006b;
    L_0x0054:
        r2 = r9.m;
        if (r2 != 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r2.b = r0;
    L_0x005b:
        r0 = r9.n;
        if (r0 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x006b;
    L_0x0060:
        r1 = r11.b;
        r0.b = r1;
        goto L_0x006b;
    L_0x0065:
        r11 = r9.k;
        r10.a(r11);
        r6 = 0;
    L_0x006b:
        r9.i = r4;
        r9.h = r3;
        if (r6 == 0) goto L_0x0000;
    L_0x0071:
        return r5;
    L_0x0072:
        r11 = r9.d;
        r11 = r11.a;
        r1 = 11;
        r11 = r10.a(r11, r5, r1, r6);
        if (r11 == 0) goto L_0x00b7;
    L_0x007e:
        r11 = r9.d;
        r11.c(r5);
        r11 = r9.d;
        r11 = r11.d();
        r9.j = r11;
        r11 = r9.d;
        r11 = r11.g();
        r9.k = r11;
        r11 = r9.d;
        r11 = r11.g();
        r0 = (long) r11;
        r9.l = r0;
        r11 = r9.d;
        r11 = r11.d();
        r11 = r11 << 24;
        r0 = (long) r11;
        r2 = r9.l;
        r0 = r0 | r2;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r2;
        r9.l = r0;
        r11 = r9.d;
        r11.d(r7);
        r9.h = r4;
        goto L_0x0000;
    L_0x00b7:
        return r0;
    L_0x00b8:
        r11 = r9.i;
        r10.a(r11);
        r9.i = r5;
        r9.h = r7;
        goto L_0x0000;
    L_0x00c3:
        r11 = r9.c;
        r11 = r11.a;
        r11 = r10.a(r11, r5, r2, r6);
        if (r11 == 0) goto L_0x0129;
    L_0x00cd:
        r11 = r9.c;
        r11.c(r5);
        r11 = r9.c;
        r11.d(r4);
        r11 = r9.c;
        r11 = r11.d();
        r0 = r11 & 1;
        r11 = r11 & r4;
        if (r11 == 0) goto L_0x00f3;
    L_0x00e2:
        r11 = r9.m;
        if (r11 != 0) goto L_0x00f3;
    L_0x00e6:
        r11 = new nrr;
        r4 = r9.g;
        r1 = r4.d_(r1);
        r11.<init>(r1);
        r9.m = r11;
    L_0x00f3:
        if (r0 == 0) goto L_0x0106;
    L_0x00f5:
        r11 = r9.n;
        if (r11 != 0) goto L_0x0106;
    L_0x00f9:
        r11 = new nry;
        r0 = r9.g;
        r0 = r0.d_(r2);
        r11.<init>(r0);
        r9.n = r11;
    L_0x0106:
        r11 = r9.o;
        if (r11 != 0) goto L_0x0111;
    L_0x010a:
        r11 = new nrt;
        r11.<init>();
        r9.o = r11;
    L_0x0111:
        r11 = r9.g;
        r11.a();
        r11 = r9.g;
        r11.a(r9);
        r11 = r9.c;
        r11 = r11.j();
        r11 = r11 + -5;
        r9.i = r11;
        r9.h = r3;
        goto L_0x0000;
    L_0x0129:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nru.a(nrb, nrm):int");
    }

    private final nwz b(nrb nrb) {
        if (this.k > this.e.c()) {
            nwz nwz = this.e;
            int c = nwz.c();
            nwz.a(new byte[Math.max(c + c, this.k)], 0);
        } else {
            this.e.c(0);
        }
        this.e.b(this.k);
        nrb.b(this.e.a, 0, this.k);
        return this.e;
    }
}
