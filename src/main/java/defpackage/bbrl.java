package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbrl */
final class bbrl extends AtomicReference implements bblv, bbnc {
    public static final long serialVersionUID = 703409937383992161L;
    private final bbmd a;
    private final bbmg b;

    bbrl(bbmd bbmd, bbmg bbmg) {
        this.a = bbmd;
        this.b = bbmg;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            this.a.a(this);
        }
    }

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        this.b.b(new bbrm(this, this.a));
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
