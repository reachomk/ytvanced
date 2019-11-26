package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwr */
final class bbwr extends AtomicReference implements bblv, bbmr, bbnc {
    public static final long serialVersionUID = -2177128922851101253L;
    private final bblv a;
    private final bbnv b;

    bbwr(bblv bblv, bbnv bbnv) {
        this.a = bblv;
        this.b = bbnv;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void a(bbnc bbnc) {
        bbnz.c(this, bbnc);
    }

    public final void d_(Object obj) {
        try {
            bblx bblx = (bblx) bbow.a(this.b.a(obj), "The mapper returned a null CompletableSource");
            if (!c()) {
                bblx.a(this);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            a_(th);
        }
    }

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        this.a.bL_();
    }
}
