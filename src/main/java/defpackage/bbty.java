package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bbty */
final class bbty implements bbmo, bbnc {
    private final bbmr a;
    private final long b = 0;
    private final Object c;
    private bbnc d;
    private long e;
    private boolean f;

    bbty(bbmr bbmr, Object obj) {
        this.a = bbmr;
        this.c = obj;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.d, bbnc)) {
            this.d = bbnc;
            this.a.a(this);
        }
    }

    public final void bK_() {
        this.d.bK_();
    }

    public final boolean c() {
        return this.d.c();
    }

    public final void b_(Object obj) {
        if (!this.f) {
            long j = this.e;
            if (j == 0) {
                this.f = true;
                this.d.bK_();
                this.a.d_(obj);
                return;
            }
            this.e = j + 1;
        }
    }

    public final void a(Throwable th) {
        if (this.f) {
            bbzf.a(th);
            return;
        }
        this.f = true;
        this.a.a_(th);
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            Object obj = this.c;
            if (obj != null) {
                this.a.d_(obj);
            } else {
                this.a.a_(new NoSuchElementException());
            }
        }
    }
}
