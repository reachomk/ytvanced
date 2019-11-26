package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: bbgy */
final class bbgy extends bbgv {
    private final AtomicIntegerFieldUpdater a;

    public final boolean a(bbgw bbgw) {
        return this.a.compareAndSet(bbgw, 0, -1);
    }

    public final void b(bbgw bbgw) {
        this.a.set(bbgw, 0);
    }

    /* synthetic */ bbgy(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }
}
