package defpackage;

/* renamed from: oiu */
public final class oiu implements ofm {
    private static final int a = ozp.f("ID3");
    private final oix b = new oix();
    private final oza c = new oza(2786);
    private boolean d;

    public final void c() {
    }

    /* JADX WARNING: Missing block: B:8:0x0041, code skipped:
            r8.a();
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:9:0x004a, code skipped:
            if ((r4 - r3) >= 8192) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:11:0x0050, code skipped:
            return false;
     */
    public final boolean a(defpackage.ofp r8) {
        /*
        r7 = this;
        r0 = new oza;
        r1 = 10;
        r0.<init>(r1);
        r2 = 0;
        r3 = 0;
    L_0x0009:
        r4 = r0.a;
        r8.c(r4, r2, r1);
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
        r8.b(r4);
        goto L_0x0009;
    L_0x0028:
        r8.a();
        r8.b(r3);
        r4 = r3;
    L_0x002f:
        r1 = 0;
    L_0x0030:
        r5 = r0.a;
        r6 = 6;
        r8.c(r5, r2, r6);
        r0.c(r2);
        r5 = r0.e();
        r6 = 2935; // 0xb77 float:4.113E-42 double:1.45E-320;
        if (r5 == r6) goto L_0x0051;
    L_0x0041:
        r8.a();
        r4 = r4 + 1;
        r1 = r4 - r3;
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r1 >= r5) goto L_0x0050;
    L_0x004c:
        r8.b(r4);
        goto L_0x002f;
    L_0x0050:
        return r2;
    L_0x0051:
        r5 = 1;
        r1 = r1 + r5;
        r6 = 4;
        if (r1 >= r6) goto L_0x0066;
    L_0x0056:
        r5 = r0.a;
        r5 = defpackage.obe.a(r5);
        r6 = -1;
        if (r5 == r6) goto L_0x0065;
    L_0x005f:
        r5 = r5 + -6;
        r8.b(r5);
        goto L_0x0030;
    L_0x0065:
        return r2;
    L_0x0066:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiu.a(ofp):boolean");
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
        int a = ofp.a(this.c.a, 0, 2786);
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
