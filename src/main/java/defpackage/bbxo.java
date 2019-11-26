package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbxo */
final class bbxo extends AtomicBoolean implements bbnc, Runnable {
    public static final long serialVersionUID = -2421395018820541164L;
    private final Runnable a;

    bbxo(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        if (!get()) {
            try {
                this.a.run();
            } finally {
                lazySet(true);
            }
        }
    }

    public final void bK_() {
        lazySet(true);
    }

    public final boolean c() {
        return get();
    }
}
