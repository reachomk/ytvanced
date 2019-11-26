package defpackage;

/* renamed from: oiw */
public final class oiw implements ofm {
    private static final int a = ozp.f("ID3");
    private final oiz b = new oiz();
    private final oza c = new oza(16384);
    private boolean d;

    public final void c() {
    }

    /* JADX WARNING: Missing block: B:10:0x0048, code skipped:
            r9.a();
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:11:0x0051, code skipped:
            if ((r4 - r3) >= 8192) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:13:0x0057, code skipped:
            return false;
     */
    public final boolean a(defpackage.ofp r9) {
        /*
        r8 = this;
        r0 = new oza;
        r1 = 10;
        r0.<init>(r1);
        r2 = 0;
        r3 = 0;
    L_0x0009:
        r4 = r0.a;
        r9.c(r4, r2, r1);
        r0.c(r2);
        r4 = r0.h();
        r5 = a;
        if (r4 != r5) goto L_0x0028;
    L_0x0019:
        r4 = 3;
        r0.d(r4);
        r4 = r0.n();
        r5 = r4 + 10;
        r3 = r3 + r5;
        r9.b(r4);
        goto L_0x0009;
    L_0x0028:
        r9.a();
        r9.b(r3);
        r4 = r3;
    L_0x002f:
        r1 = 0;
    L_0x0030:
        r5 = r0.a;
        r6 = 7;
        r9.c(r5, r2, r6);
        r0.c(r2);
        r5 = r0.e();
        r6 = 44096; // 0xac40 float:6.1792E-41 double:2.17863E-319;
        if (r5 != r6) goto L_0x0043;
    L_0x0042:
        goto L_0x0058;
    L_0x0043:
        r6 = 44097; // 0xac41 float:6.1793E-41 double:2.1787E-319;
        if (r5 == r6) goto L_0x0058;
    L_0x0048:
        r9.a();
        r4 = r4 + 1;
        r1 = r4 - r3;
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r1 >= r5) goto L_0x0057;
    L_0x0053:
        r9.b(r4);
        goto L_0x002f;
    L_0x0057:
        return r2;
    L_0x0058:
        r6 = 1;
        r1 = r1 + r6;
        r7 = 4;
        if (r1 >= r7) goto L_0x006d;
    L_0x005d:
        r6 = r0.a;
        r5 = defpackage.obg.a(r6, r5);
        r6 = -1;
        if (r5 == r6) goto L_0x006c;
    L_0x0066:
        r5 = r5 + -7;
        r9.b(r5);
        goto L_0x0030;
    L_0x006c:
        return r2;
    L_0x006d:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiw.a(ofp):boolean");
    }

    public final void a(ofo ofo) {
        this.b.a(ofo, new okl(0, 1));
        ofo.a();
        ofo.a(new ofw(-9223372036854775807L));
    }

    public final void a(long j, long j2) {
        this.d = false;
        this.b.a();
    }

    public final int a(ofp ofp, ofv ofv) {
        int a = ofp.a(this.c.a, 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.c.c(0);
        this.c.b(a);
        if (!this.d) {
            this.b.a = 0;
            this.d = true;
        }
        this.b.a(this.c);
        return 0;
    }
}
