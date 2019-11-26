package defpackage;

/* renamed from: bbvh */
final class bbvh extends bbpi implements bbmo, Runnable {
    public static final long serialVersionUID = 6576896619930983584L;
    private final bbmo a;
    private final bbmp b;
    private final boolean c = false;
    private final int d;
    private bbpg e;
    private bbnc f;
    private Throwable g;
    private volatile boolean h;
    private volatile boolean i;
    private int j;
    private boolean k;

    bbvh(bbmo bbmo, bbmp bbmp, int i) {
        this.a = bbmo;
        this.b = bbmp;
        this.d = i;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.f, bbnc)) {
            this.f = bbnc;
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                int a = bboz.a(7);
                if (a == 1) {
                    this.j = 1;
                    this.e = bboz;
                    this.h = true;
                    this.a.a((bbnc) this);
                    f();
                    return;
                } else if (a == 2) {
                    this.j = 2;
                    this.e = bboz;
                    this.a.a((bbnc) this);
                    return;
                }
            }
            this.e = new bbxb(this.d);
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (!this.h) {
            if (this.j != 2) {
                this.e.a(obj);
            }
            f();
        }
    }

    public final void a(Throwable th) {
        if (this.h) {
            bbzf.a(th);
            return;
        }
        this.g = th;
        this.h = true;
        f();
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            f();
        }
    }

    public final void bK_() {
        if (!this.i) {
            this.i = true;
            this.f.bK_();
            this.b.bK_();
            if (getAndIncrement() == 0) {
                this.e.e();
            }
        }
    }

    public final boolean c() {
        return this.i;
    }

    private final void f() {
        if (getAndIncrement() == 0) {
            this.b.a((Runnable) this);
        }
    }

    /* JADX WARNING: Missing block: B:32:0x0066, code skipped:
            r3 = addAndGet(-r3);
     */
    /* JADX WARNING: Missing block: B:33:0x006b, code skipped:
            if (r3 == 0) goto L_0x0086;
     */
    public final void run() {
        /*
        r7 = this;
        r0 = r7.k;
        r1 = 1;
        if (r0 == 0) goto L_0x0042;
    L_0x0005:
        r0 = r7.i;
        if (r0 != 0) goto L_0x0086;
    L_0x0009:
        r0 = r7.h;
        r2 = r7.g;
        if (r0 == 0) goto L_0x001d;
    L_0x000f:
        if (r2 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x001d;
    L_0x0012:
        r0 = r7.a;
        r0.a(r2);
        r0 = r7.b;
        r0.bK_();
        return;
    L_0x001d:
        r2 = r7.a;
        r3 = 0;
        r2.b_(r3);
        if (r0 == 0) goto L_0x003a;
    L_0x0025:
        r0 = r7.g;
        if (r0 == 0) goto L_0x002f;
    L_0x0029:
        r1 = r7.a;
        r1.a(r0);
        goto L_0x0034;
    L_0x002f:
        r0 = r7.a;
        r0.a();
    L_0x0034:
        r0 = r7.b;
        r0.bK_();
        return;
    L_0x003a:
        r0 = -r1;
        r1 = r7.addAndGet(r0);
        if (r1 == 0) goto L_0x0086;
    L_0x0041:
        goto L_0x0005;
    L_0x0042:
        r0 = r7.e;
        r2 = r7.a;
        r3 = 1;
    L_0x0047:
        r4 = r7.h;
        r5 = r0.b();
        r4 = r7.a(r4, r5, r2);
        if (r4 != 0) goto L_0x0086;
    L_0x0053:
        r4 = r7.h;
        r5 = r0.bI_();	 Catch:{ all -> 0x0072 }
        if (r5 != 0) goto L_0x005d;
    L_0x005b:
        r6 = 1;
        goto L_0x005e;
    L_0x005d:
        r6 = 0;
    L_0x005e:
        r4 = r7.a(r4, r6, r2);
        if (r4 != 0) goto L_0x0086;
    L_0x0064:
        if (r6 == 0) goto L_0x006e;
    L_0x0066:
        r3 = -r3;
        r3 = r7.addAndGet(r3);
        if (r3 == 0) goto L_0x0086;
    L_0x006d:
        goto L_0x0047;
    L_0x006e:
        r2.b_(r5);
        goto L_0x0053;
    L_0x0072:
        r1 = move-exception;
        defpackage.bbnm.a(r1);
        r3 = r7.f;
        r3.bK_();
        r0.e();
        r2.a(r1);
        r0 = r7.b;
        r0.bK_();
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbvh.run():void");
    }

    private final boolean a(boolean z, boolean z2, bbmo bbmo) {
        if (this.i) {
            this.e.e();
            return true;
        }
        if (z) {
            Throwable th = this.g;
            if (th != null) {
                this.e.e();
                bbmo.a(th);
                this.b.bK_();
                return true;
            } else if (z2) {
                bbmo.a();
                this.b.bK_();
                return true;
            }
        }
        return false;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.k = true;
        return 2;
    }

    public final Object bI_() {
        return this.e.bI_();
    }

    public final void e() {
        this.e.e();
    }

    public final boolean b() {
        return this.e.b();
    }
}
