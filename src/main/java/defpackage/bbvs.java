package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbvs */
final class bbvs extends AtomicBoolean implements bbmo, bbnc {
    public static final long serialVersionUID = -7419642935409022375L;
    private final bbmo a;
    private final bbvq b;
    private final bbvp c;
    private bbnc d;

    bbvs(bbmo bbmo, bbvq bbvq, bbvp bbvp) {
        this.a = bbmo;
        this.b = bbvq;
        this.c = bbvp;
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.a(this.c);
            this.a.a(th);
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            this.b.a(this.c);
            this.a.a();
        }
    }

    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return;
     */
    public final void bK_() {
        /*
        r7 = this;
        r0 = r7.d;
        r0.bK_();
        r0 = 0;
        r1 = 1;
        r0 = r7.compareAndSet(r0, r1);
        if (r0 == 0) goto L_0x0034;
    L_0x000d:
        r0 = r7.b;
        r1 = r7.c;
        monitor-enter(r0);
        r2 = r0.a;	 Catch:{ all -> 0x0031 }
        if (r2 != 0) goto L_0x0018;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0018:
        r2 = r1.a;	 Catch:{ all -> 0x0031 }
        r4 = -1;
        r2 = r2 + r4;
        r1.a = r2;	 Catch:{ all -> 0x0031 }
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x002f;
    L_0x0025:
        r2 = r1.b;	 Catch:{ all -> 0x0031 }
        if (r2 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002f;
    L_0x002a:
        r0.b(r1);	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0031:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r1;
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbvs.bK_():void");
    }

    public final boolean c() {
        return this.d.c();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.d, bbnc)) {
            this.d = bbnc;
            this.a.a((bbnc) this);
        }
    }
}
