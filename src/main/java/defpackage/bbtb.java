package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbtb */
final class bbtb extends AtomicInteger implements bbmo, bbnc {
    public static final long serialVersionUID = 8828587559905699186L;
    public volatile boolean a;
    private final bbmo b;
    private final bbnv c;
    private final bbte d;
    private final int e;
    private bbpg f;
    private bbnc g;
    private volatile boolean h;
    private volatile boolean i;
    private int j;

    bbtb(bbmo bbmo, bbnv bbnv, int i) {
        this.b = bbmo;
        this.c = bbnv;
        this.e = i;
        this.d = new bbte(bbmo, this);
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.g, bbnc)) {
            this.g = bbnc;
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                int a = bboz.a(3);
                if (a == 1) {
                    this.j = 1;
                    this.f = bboz;
                    this.i = true;
                    this.b.a((bbnc) this);
                    b();
                    return;
                } else if (a == 2) {
                    this.j = 2;
                    this.f = bboz;
                    this.b.a((bbnc) this);
                    return;
                }
            }
            this.f = new bbxb(this.e);
            this.b.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (!this.i) {
            if (this.j == 0) {
                this.f.a(obj);
            }
            b();
        }
    }

    public final void a(Throwable th) {
        if (this.i) {
            bbzf.a(th);
            return;
        }
        this.i = true;
        bK_();
        this.b.a(th);
    }

    public final void a() {
        if (!this.i) {
            this.i = true;
            b();
        }
    }

    public final boolean c() {
        return this.h;
    }

    public final void bK_() {
        this.h = true;
        bbnz.a(this.d);
        this.g.bK_();
        if (getAndIncrement() == 0) {
            this.f.e();
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:13:0x001f, code skipped:
            if (r1 != null) goto L_0x002c;
     */
    public final void b() {
        /*
        r3 = this;
        r0 = r3.getAndIncrement();
        if (r0 != 0) goto L_0x006c;
    L_0x0006:
        r0 = r3.h;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r0 = r3.f;
        r0.e();
        return;
    L_0x0010:
        r0 = r3.a;
        if (r0 != 0) goto L_0x0066;
    L_0x0014:
        r0 = r3.i;
        r1 = r3.f;	 Catch:{ all -> 0x0054 }
        r1 = r1.bI_();	 Catch:{ all -> 0x0054 }
        r2 = 1;
        if (r0 != 0) goto L_0x0022;
    L_0x001f:
        if (r1 == 0) goto L_0x0066;
    L_0x0021:
        goto L_0x002c;
    L_0x0022:
        if (r1 != 0) goto L_0x002c;
    L_0x0024:
        r3.h = r2;
        r0 = r3.b;
        r0.a();
        return;
    L_0x002c:
        r0 = r3.c;	 Catch:{ all -> 0x0042 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0042 }
        r1 = "The mapper returned a null ObservableSource";
        r0 = defpackage.bbow.a(r0, r1);	 Catch:{ all -> 0x0042 }
        r0 = (defpackage.bbmm) r0;	 Catch:{ all -> 0x0042 }
        r3.a = r2;
        r1 = r3.d;
        r0.b(r1);
        goto L_0x0066;
    L_0x0042:
        r0 = move-exception;
        defpackage.bbnm.a(r0);
        r3.bK_();
        r1 = r3.f;
        r1.e();
        r1 = r3.b;
        r1.a(r0);
        return;
    L_0x0054:
        r0 = move-exception;
        defpackage.bbnm.a(r0);
        r3.bK_();
        r1 = r3.f;
        r1.e();
        r1 = r3.b;
        r1.a(r0);
        return;
    L_0x0066:
        r0 = r3.decrementAndGet();
        if (r0 != 0) goto L_0x0006;
    L_0x006c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbtb.b():void");
    }
}
