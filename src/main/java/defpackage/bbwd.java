package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwd */
final class bbwd extends AtomicReference implements bbnc, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    private final bbmo a;

    bbwd(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }

    public final void run() {
        if (!c()) {
            this.a.b_(Long.valueOf(0));
            lazySet(bboc.INSTANCE);
            this.a.a();
        }
    }
}
