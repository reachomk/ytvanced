package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbzw */
public final class bbzw extends AtomicBoolean implements bbnc {
    public static final long serialVersionUID = 3562861878281475070L;
    public final bbmo a;
    private final bbzt b;

    bbzw(bbmo bbmo, bbzt bbzt) {
        this.a = bbmo;
        this.b = bbzt;
    }

    public final void bK_() {
        if (compareAndSet(false, true)) {
            this.b.a(this);
        }
    }

    public final boolean c() {
        return get();
    }
}
