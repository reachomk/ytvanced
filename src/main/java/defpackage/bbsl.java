package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbsl */
final class bbsl extends AtomicReference implements bbmd, bbnc {
    public static final long serialVersionUID = -2223459372976438024L;
    private final bbmd a;
    private final bbmg b;

    bbsl(bbmd bbmd, bbmg bbmg) {
        this.a = bbmd;
        this.b = bbmg;
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
        this.a.d_(obj);
    }

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        bbnc bbnc = (bbnc) get();
        if (bbnc != bbnz.a && compareAndSet(bbnc, null)) {
            this.b.b(new bbso(this.a, this));
        }
    }
}
