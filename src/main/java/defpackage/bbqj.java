package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbqj */
final class bbqj extends AtomicReference implements bblv, bbnc, Runnable {
    public static final long serialVersionUID = 8571289934935992137L;
    private final bblv a;
    private final bbmn b;
    private Throwable c;

    bbqj(bblv bblv, bbmn bbmn) {
        this.a = bblv;
        this.b = bbmn;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            this.a.a(this);
        }
    }

    public final void a_(Throwable th) {
        this.c = th;
        bbnz.c(this, this.b.a(this));
    }

    public final void bL_() {
        bbnz.c(this, this.b.a(this));
    }

    public final void run() {
        Throwable th = this.c;
        if (th != null) {
            this.c = null;
            this.a.a_(th);
            return;
        }
        this.a.bL_();
    }
}
