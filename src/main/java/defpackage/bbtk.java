package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbtk */
final class bbtk extends AtomicReference implements bbnc, Runnable {
    public static final long serialVersionUID = 6812032969491025141L;
    private final Object a;
    private final long b;
    private final bbtj c;
    private final AtomicBoolean d = new AtomicBoolean();

    bbtk(Object obj, long j, bbtj bbtj) {
        this.a = obj;
        this.b = j;
        this.c = bbtj;
    }

    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            bbtj bbtj = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == bbtj.b) {
                bbtj.a.b_(obj);
                bbnz.a((AtomicReference) this);
            }
        }
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }
}
