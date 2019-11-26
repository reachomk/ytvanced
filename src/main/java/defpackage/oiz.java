package defpackage;

/* renamed from: oiz */
public final class oiz implements ojf {
    public long a;
    private final oyx b;
    private final oza c;
    private final String d;
    private String e;
    private ofy f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private long k;
    private nzw l;
    private int m;

    public oiz() {
        this(null);
    }

    public final void b() {
    }

    public oiz(String str) {
        this.b = new oyx(new byte[16]);
        this.c = new oza(this.b.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.d = str;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.e = okl.c();
        this.f = ofo.a(okl.b(), 1);
    }

    public final void a(long j, int i) {
        this.a = j;
    }

    /* JADX WARNING: Missing block: B:20:0x0084, code skipped:
            if ("audio/ac4".equals(r4.i) == false) goto L_0x0086;
     */
    public final void a(defpackage.oza r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
    L_0x0004:
        r2 = r18.b();
        if (r2 <= 0) goto L_0x010c;
    L_0x000a:
        r2 = r0.g;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        if (r2 == 0) goto L_0x00c6;
    L_0x0011:
        if (r2 == r4) goto L_0x0045;
    L_0x0013:
        if (r2 == r3) goto L_0x0016;
    L_0x0015:
        goto L_0x0004;
    L_0x0016:
        r2 = r18.b();
        r3 = r0.m;
        r4 = r0.h;
        r3 = r3 - r4;
        r2 = java.lang.Math.min(r2, r3);
        r3 = r0.f;
        r3.a(r1, r2);
        r3 = r0.h;
        r3 = r3 + r2;
        r0.h = r3;
        r10 = r0.m;
        if (r3 != r10) goto L_0x0004;
    L_0x0031:
        r6 = r0.f;
        r7 = r0.a;
        r9 = 1;
        r11 = 0;
        r12 = 0;
        r6.a(r7, r9, r10, r11, r12);
        r2 = r0.a;
        r6 = r0.k;
        r2 = r2 + r6;
        r0.a = r2;
        r0.g = r5;
        goto L_0x0004;
    L_0x0045:
        r2 = r0.c;
        r2 = r2.a;
        r4 = r18.b();
        r6 = r0.h;
        r7 = 16;
        r6 = 16 - r6;
        r4 = java.lang.Math.min(r4, r6);
        r6 = r0.h;
        r1.a(r2, r6, r4);
        r2 = r0.h;
        r2 = r2 + r4;
        r0.h = r2;
        if (r2 != r7) goto L_0x0004;
    L_0x0063:
        r2 = r0.b;
        r2.a(r5);
        r2 = r0.b;
        r2 = defpackage.obg.a(r2);
        r4 = r0.l;
        if (r4 == 0) goto L_0x0086;
    L_0x0072:
        r6 = r4.v;
        if (r6 != r3) goto L_0x0086;
    L_0x0076:
        r6 = r2.a;
        r8 = r4.w;
        if (r6 != r8) goto L_0x0086;
    L_0x007c:
        r4 = r4.i;
        r6 = "audio/ac4";
        r4 = r6.equals(r4);
        if (r4 != 0) goto L_0x00a2;
    L_0x0086:
        r8 = r0.e;
        r10 = -1;
        r11 = -1;
        r12 = 2;
        r13 = r2.a;
        r14 = 0;
        r15 = 0;
        r4 = r0.d;
        r9 = "audio/ac4";
        r16 = r4;
        r4 = defpackage.nzw.a(r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r0.l = r4;
        r4 = r0.f;
        r6 = r0.l;
        r4.a(r6);
    L_0x00a2:
        r4 = r2.b;
        r0.m = r4;
        r2 = r2.c;
        r8 = (long) r2;
        r10 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = r8 * r10;
        r2 = r0.l;
        r2 = r2.w;
        r10 = (long) r2;
        r8 = r8 / r10;
        r0.k = r8;
        r2 = r0.c;
        r2.c(r5);
        r2 = r0.f;
        r4 = r0.c;
        r2.a(r4, r7);
        r0.g = r3;
        goto L_0x0004;
    L_0x00c6:
        r2 = r18.b();
        if (r2 <= 0) goto L_0x0004;
    L_0x00cc:
        r2 = r0.i;
        r6 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        if (r2 != 0) goto L_0x00de;
    L_0x00d2:
        r2 = r18.d();
        if (r2 != r6) goto L_0x00da;
    L_0x00d8:
        r2 = 1;
        goto L_0x00db;
    L_0x00da:
        r2 = 0;
    L_0x00db:
        r0.i = r2;
        goto L_0x00c6;
    L_0x00de:
        r2 = r18.d();
        if (r2 != r6) goto L_0x00e6;
    L_0x00e4:
        r6 = 1;
        goto L_0x00e7;
    L_0x00e6:
        r6 = 0;
    L_0x00e7:
        r0.i = r6;
        r6 = 64;
        r7 = 65;
        if (r2 == r6) goto L_0x00f1;
    L_0x00ef:
        if (r2 != r7) goto L_0x00c6;
    L_0x00f1:
        if (r2 != r7) goto L_0x00f5;
    L_0x00f3:
        r8 = 1;
        goto L_0x00f6;
    L_0x00f5:
        r8 = 0;
    L_0x00f6:
        r0.j = r8;
        r0.g = r4;
        r8 = r0.c;
        r8 = r8.a;
        r9 = -84;
        r8[r5] = r9;
        if (r2 != r7) goto L_0x0106;
    L_0x0104:
        r6 = 65;
    L_0x0106:
        r8[r4] = r6;
        r0.h = r3;
        goto L_0x0004;
    L_0x010c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiz.a(oza):void");
    }
}
