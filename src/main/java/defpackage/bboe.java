package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bboe */
public final class bboe extends AtomicReference implements bbnc {
    public static final long serialVersionUID = -754898800686245608L;

    public bboe(bbnc bbnc) {
        lazySet(bbnc);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
