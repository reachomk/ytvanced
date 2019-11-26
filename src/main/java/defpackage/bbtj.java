package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbtj */
final class bbtj implements bbmo, bbnc {
    public final bbmo a;
    public volatile long b;
    private final long c;
    private final TimeUnit d;
    private final bbmp e;
    private bbnc f;
    private bbnc g;
    private boolean h;

    bbtj(bbmo bbmo, long j, TimeUnit timeUnit, bbmp bbmp) {
        this.a = bbmo;
        this.c = j;
        this.d = timeUnit;
        this.e = bbmp;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.f, bbnc)) {
            this.f = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (!this.h) {
            long j = this.b + 1;
            this.b = j;
            bbnc bbnc = this.g;
            if (bbnc != null) {
                bbnc.bK_();
            }
            bbtk bbtk = new bbtk(obj, j, this);
            this.g = bbtk;
            bbnz.c(bbtk, this.e.a(bbtk, this.c, this.d));
        }
    }

    public final void a(Throwable th) {
        if (this.h) {
            bbzf.a(th);
            return;
        }
        bbnc bbnc = this.g;
        if (bbnc != null) {
            bbnc.bK_();
        }
        this.h = true;
        this.a.a(th);
        this.e.bK_();
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            bbnc bbnc = this.g;
            if (bbnc != null) {
                bbnc.bK_();
            }
            bbtk bbtk = (bbtk) bbnc;
            if (bbtk != null) {
                bbtk.run();
            }
            this.a.a();
            this.e.bK_();
        }
    }

    public final void bK_() {
        this.f.bK_();
        this.e.bK_();
    }

    public final boolean c() {
        return this.e.c();
    }
}
