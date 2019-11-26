package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwv */
final class bbwv extends AtomicReference implements bbmr, bbnc, Runnable {
    public static final long serialVersionUID = 3528003840217436037L;
    private final bbmr a;
    private final bbmn b;
    private Object c;
    private Throwable d;

    bbwv(bbmr bbmr, bbmn bbmn) {
        this.a = bbmr;
        this.b = bbmn;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            this.a.a(this);
        }
    }

    public final void d_(Object obj) {
        this.c = obj;
        bbnz.c(this, this.b.a(this));
    }

    public final void a_(Throwable th) {
        this.d = th;
        bbnz.c(this, this.b.a(this));
    }

    public final void run() {
        Throwable th = this.d;
        if (th != null) {
            this.a.a_(th);
        } else {
            this.a.d_(this.c);
        }
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
