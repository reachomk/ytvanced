package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbuf */
final class bbuf extends AtomicReference implements bblv, bbnc {
    public static final long serialVersionUID = 8606673141535671828L;
    private final /* synthetic */ bbug a;

    bbuf(bbug bbug) {
        this.a = bbug;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void bL_() {
        bbug bbug = this.a;
        bbug.a.c(this);
        bbug.a();
    }

    public final void a_(Throwable th) {
        bbug bbug = this.a;
        bbug.a.c(this);
        bbug.a(th);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
