package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbrm */
final class bbrm implements bbmd {
    private final AtomicReference a;
    private final bbmd b;

    bbrm(AtomicReference atomicReference, bbmd bbmd) {
        this.a = atomicReference;
        this.b = bbmd;
    }

    public final void a(bbnc bbnc) {
        bbnz.c(this.a, bbnc);
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
