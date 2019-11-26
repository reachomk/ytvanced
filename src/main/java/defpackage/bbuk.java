package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbuk */
final class bbuk extends AtomicReference implements bblv, bbnc {
    public static final long serialVersionUID = 8606673141535671828L;
    private final /* synthetic */ bbuh a;

    bbuk(bbuh bbuh) {
        this.a = bbuh;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void bL_() {
        bbuh bbuh = this.a;
        bbuh.a.c(this);
        bbuh.a();
    }

    public final void a_(Throwable th) {
        bbuh bbuh = this.a;
        bbuh.a.c(this);
        bbuh.a(th);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
