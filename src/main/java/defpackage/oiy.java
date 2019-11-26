package defpackage;

/* renamed from: oiy */
public final class oiy implements ofm {
    private static final int a = ozp.f("ID3");
    private final int b;
    private final ojb c;
    private final oza d;
    private final oza e;
    private final oyx f;
    private ofo g;
    private long h;
    private long i;
    private int j;
    private boolean k;
    private boolean l;

    public oiy() {
        this((byte) 0);
    }

    public final void c() {
    }

    public oiy(byte b) {
        this.h = 0;
        this.b = 0;
        this.c = new ojb();
        this.d = new oza(2048);
        this.j = -1;
        this.i = -1;
        this.e = new oza(10);
        this.f = new oyx(this.e.a);
    }

    /* JADX WARNING: Missing block: B:4:0x0021, code skipped:
            r9.a();
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:5:0x002a, code skipped:
            if ((r3 - r0) >= 8192) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:7:0x0030, code skipped:
            return false;
     */
    public final boolean a(defpackage.ofp r9) {
        /*
        r8 = this;
        r0 = r8.b(r9);
        r1 = 0;
        r3 = r0;
    L_0x0006:
        r2 = 0;
        r4 = 0;
    L_0x0008:
        r5 = r8.e;
        r5 = r5.a;
        r6 = 2;
        r9.c(r5, r1, r6);
        r5 = r8.e;
        r5.c(r1);
        r5 = r8.e;
        r5 = r5.e();
        r5 = defpackage.ojb.a(r5);
        if (r5 != 0) goto L_0x0031;
    L_0x0021:
        r9.a();
        r3 = r3 + 1;
        r2 = r3 - r0;
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r2 >= r4) goto L_0x0030;
    L_0x002c:
        r9.b(r3);
        goto L_0x0006;
    L_0x0030:
        return r1;
    L_0x0031:
        r5 = 1;
        r2 = r2 + r5;
        r6 = 4;
        if (r2 >= r6) goto L_0x0037;
    L_0x0036:
        goto L_0x003c;
    L_0x0037:
        r7 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        if (r4 <= r7) goto L_0x003c;
    L_0x003b:
        return r5;
    L_0x003c:
        r5 = r8.e;
        r5 = r5.a;
        r9.c(r5, r1, r6);
        r5 = r8.f;
        r6 = 14;
        r5.a(r6);
        r5 = r8.f;
        r6 = 13;
        r5 = r5.c(r6);
        r6 = 6;
        if (r5 <= r6) goto L_0x005c;
    L_0x0055:
        r6 = r5 + -6;
        r9.b(r6);
        r4 = r4 + r5;
        goto L_0x0008;
    L_0x005c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiy.a(ofp):boolean");
    }

    public final void a(ofo ofo) {
        this.g = ofo;
        this.c.a(ofo, new okl(0, 1));
        ofo.a();
    }

    public final void a(long j, long j2) {
        this.k = false;
        this.c.c();
        this.h = j2;
    }

    public final int a(ofp ofp, ofv ofv) {
        int a = ofp.a(this.d.a, 0, 2048);
        if (!this.l) {
            ((ofo) oxz.a(this.g)).a(new ofw(-9223372036854775807L));
            this.l = true;
        }
        if (a == -1) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a);
        if (!this.k) {
            this.c.b = this.h;
            this.k = true;
        }
        this.c.a(this.d);
        return 0;
    }

    private final int b(ofp ofp) {
        int i = 0;
        while (true) {
            ofp.c(this.e.a, 0, 10);
            this.e.c(0);
            if (this.e.h() != a) {
                break;
            }
            this.e.d(3);
            int n = this.e.n();
            i += n + 10;
            ofp.b(n);
        }
        ofp.a();
        ofp.b(i);
        if (this.i == -1) {
            this.i = (long) i;
        }
        return i;
    }
}
