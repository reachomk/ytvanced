package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpn */
public final class bbpn extends AtomicReference implements bblv, bbnc {
    public static final long serialVersionUID = -7545121636549663526L;

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }

    public final void bL_() {
        lazySet(bbnz.a);
    }

    public final void a_(Throwable th) {
        lazySet(bbnz.a);
        bbzf.a(new bbno(th));
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }
}
