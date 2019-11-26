package defpackage;

/* renamed from: ntu */
public final class ntu implements nrc {
    private static final int a = nxf.c("ID3");
    private final nwz b = new nwz(200);
    private ntt c;
    private boolean d;

    public final void c() {
    }

    /* JADX WARNING: Missing block: B:8:0x0068, code skipped:
            r13.a();
            r5 = r5 + 1;
     */
    /* JADX WARNING: Missing block: B:9:0x0071, code skipped:
            if ((r5 - r4) >= 8192) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:11:0x0077, code skipped:
            return false;
     */
    public final boolean a(defpackage.nrb r13) {
        /*
        r12 = this;
        r0 = new nwz;
        r1 = 10;
        r0.<init>(r1);
        r2 = new nxa;
        r3 = r0.a;
        r2.<init>(r3);
        r3 = 0;
        r4 = 0;
    L_0x0010:
        r5 = r0.a;
        r13.c(r5, r3, r1);
        r0.c(r3);
        r5 = r0.g();
        r6 = a;
        r7 = 14;
        r8 = 6;
        if (r5 != r6) goto L_0x0049;
    L_0x0023:
        r5 = r0.a;
        r6 = r5[r8];
        r6 = r6 & 127;
        r6 = r6 << 21;
        r8 = 7;
        r9 = r5[r8];
        r9 = r9 & 127;
        r7 = r9 << 14;
        r6 = r6 | r7;
        r7 = 8;
        r7 = r5[r7];
        r7 = r7 & 127;
        r7 = r7 << r8;
        r6 = r6 | r7;
        r7 = 9;
        r5 = r5[r7];
        r5 = r5 & 127;
        r5 = r5 | r6;
        r6 = r5 + 10;
        r4 = r4 + r6;
        r13.b(r5);
        goto L_0x0010;
    L_0x0049:
        r13.a();
        r13.b(r4);
        r5 = r4;
    L_0x0050:
        r1 = 0;
        r6 = 0;
    L_0x0052:
        r9 = r0.a;
        r10 = 2;
        r13.c(r9, r3, r10);
        r0.c(r3);
        r9 = r0.e();
        r10 = 65526; // 0xfff6 float:9.1821E-41 double:3.2374E-319;
        r9 = r9 & r10;
        r10 = 65520; // 0xfff0 float:9.1813E-41 double:3.2371E-319;
        if (r9 == r10) goto L_0x0078;
    L_0x0068:
        r13.a();
        r5 = r5 + 1;
        r1 = r5 - r4;
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r1 >= r6) goto L_0x0077;
    L_0x0073:
        r13.b(r5);
        goto L_0x0050;
    L_0x0077:
        return r3;
    L_0x0078:
        r9 = 1;
        r1 = r1 + r9;
        r10 = 4;
        if (r1 >= r10) goto L_0x007e;
    L_0x007d:
        goto L_0x0083;
    L_0x007e:
        r11 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        if (r6 <= r11) goto L_0x0083;
    L_0x0082:
        return r9;
    L_0x0083:
        r9 = r0.a;
        r13.c(r9, r3, r10);
        r2.a(r7);
        r9 = 13;
        r9 = r2.c(r9);
        if (r9 <= r8) goto L_0x009a;
    L_0x0093:
        r10 = r9 + -6;
        r13.b(r10);
        r6 = r6 + r9;
        goto L_0x0052;
    L_0x009a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntu.a(nrb):boolean");
    }

    public final void a(nre nre) {
        this.c = new ntt(nre.d_(0), nre.d_(1));
        nre.a();
        nre.a(nrq.f);
    }

    public final void b() {
        this.d = false;
        this.c.c();
    }

    public final int a(nrb nrb, nrm nrm) {
        int a = nrb.a(this.b.a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.b.c(0);
        this.b.b(a);
        if (!this.d) {
            this.c.a = 0;
            this.d = true;
        }
        this.c.a(this.b);
        return 0;
    }
}
