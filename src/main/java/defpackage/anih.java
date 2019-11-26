package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: anih */
final class anih extends anii {
    private final AtomicReferenceFieldUpdater a;
    private final AtomicIntegerFieldUpdater b;

    anih(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    /* Access modifiers changed, original: final */
    public final int a(anif anif) {
        return this.b.decrementAndGet(anif);
    }
}
