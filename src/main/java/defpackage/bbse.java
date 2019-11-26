package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbse */
final class bbse extends AtomicReference implements bbmd, bbnc, Runnable {
    public static final long serialVersionUID = 8571289934935992137L;
    private final bbmd a;
    private final bbmn b;
    private Object c;
    private Throwable d;

    bbse(bbmd bbmd, bbmn bbmn) {
        this.a = bbmd;
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

    public final void d_(Object obj) {
        this.c = obj;
        bbnz.c(this, this.b.a(this));
    }

    public final void a_(Throwable th) {
        this.d = th;
        bbnz.c(this, this.b.a(this));
    }

    public final void bL_() {
        bbnz.c(this, this.b.a(this));
    }

    public final void run() {
        Throwable th = this.d;
        if (th != null) {
            this.d = null;
            this.a.a_(th);
            return;
        }
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            this.a.d_(obj);
            return;
        }
        this.a.bL_();
    }
}
