package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbso */
final class bbso implements bbmd {
    private final bbmd a;
    private final AtomicReference b;

    bbso(bbmd bbmd, AtomicReference atomicReference) {
        this.a = bbmd;
        this.b = atomicReference;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.b, bbnc);
    }

    public final void d_(Object obj) {
        this.a.d_(obj);
    }

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        this.a.bL_();
    }
}
