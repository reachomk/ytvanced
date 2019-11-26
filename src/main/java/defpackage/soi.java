package defpackage;

/* renamed from: soi */
final class soi implements bbnc {
    public volatile bbmi a;
    private final sxd b;
    private final sxa c;
    private final swk d;
    private final swp e;
    private final bbmz f;
    private final boolean g;
    private final boolean h;
    private final bbzx i = bbzp.b();
    private final bbnr j = new soh(this);
    private som k;
    private cma l;

    soi(sxd sxd, sxa sxa, swk swk, swp swp, bbmz bbmz, boolean z, boolean z2) {
        this.b = sxd;
        this.c = sxa;
        this.d = swk;
        this.e = swp;
        this.f = bbmz;
        this.g = z;
        this.h = z2;
    }

    public final cma a(Object obj, cmg cmg) {
        if (obj != null) {
            cma a = this.c.a(cmg, this.d, obj, this.e, this.f);
            if (!this.g) {
                return a;
            }
            String toHexString = Integer.toHexString(obj.hashCode());
            ctb a2 = ctc.a(cmg);
            a2.a(a);
            return (ctc) ((ctb) a2.a(toHexString)).c();
        }
        this.b.b(4, "Template produced null Element");
        return (cza) cza.a(cmg).c();
    }

    /* JADX WARNING: Missing block: B:10:0x001b, code skipped:
            return;
     */
    public final synchronized void a(defpackage.cmg r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c();	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x001a;
    L_0x0007:
        if (r3 != 0) goto L_0x0013;
    L_0x0009:
        r3 = r2.b;	 Catch:{ all -> 0x001c }
        r0 = 9;
        r1 = "Null componentContext from setContext()";
        r3.b(r0, r1);	 Catch:{ all -> 0x001c }
        goto L_0x001a;
    L_0x0013:
        r0 = r2.i;	 Catch:{ all -> 0x001c }
        r0.b_(r3);	 Catch:{ all -> 0x001c }
        monitor-exit(r2);
        return;
    L_0x001a:
        monitor-exit(r2);
        return;
    L_0x001c:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soi.a(cmg):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized cma a() {
        if (c()) {
            return null;
        }
        return this.k.b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b() {
        boolean equals;
        equals = (c() || this.l == null || this.k.b() == null) ? false : this.l.equals(this.k.b()) ^ 1;
        return equals;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(bbmi bbmi, bbmi bbmi2, cmg cmg, sol sol) {
        this.i.b_(cmg);
        this.a = bbmi;
        this.k = new som(sol, this.j, this.b);
        if (this.h) {
            bbmi2.a(this.i, sok.a).b(this.k);
        } else {
            bbmi2.a(this.i, new soj(this)).b(this.k);
        }
    }

    public final synchronized boolean c() {
        boolean z;
        som som = this.k;
        z = som == null || som.c();
        return z;
    }

    public final synchronized void bK_() {
        som som = this.k;
        this.l = som != null ? som.b() : null;
        som = this.k;
        if (som != null) {
            som.bK_();
        }
        this.a = null;
        this.k = null;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        if (!c()) {
            som som = this.k;
            synchronized (som.a) {
                som.b = true;
            }
        }
    }
}
