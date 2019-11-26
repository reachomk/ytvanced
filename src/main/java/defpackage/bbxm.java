package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbxm */
final class bbxm extends AtomicReference implements bbnc, Runnable {
    public static final long serialVersionUID = -4101336210206799084L;
    public final bboe a = new bboe();
    public final bboe b = new bboe();

    bbxm(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                Object obj = null;
                lazySet(null);
                this.a.lazySet(bbnz.a);
                this.b.lazySet(bbnz.a);
            }
        }
    }

    public final boolean c() {
        return get() == null;
    }

    public final void bK_() {
        if (getAndSet(null) != null) {
            bbnz.a(this.a);
            bbnz.a(this.b);
        }
    }
}
