package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbsk */
final class bbsk extends AtomicReference implements bbmd, bbnc {
    public static final long serialVersionUID = 8571289934935992137L;
    public final bboe a = new bboe();
    private final bbmd b;

    bbsk(bbmd bbmd) {
        this.b = bbmd;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
        bbnz.a(this.a);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void d_(Object obj) {
        this.b.d_(obj);
    }

    public final void a_(Throwable th) {
        this.b.a_(th);
    }

    public final void bL_() {
        this.b.bL_();
    }
}
