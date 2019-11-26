package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: anhr */
final class anhr extends anho {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    anhr(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, Thread thread) {
        this.a.lazySet(ania, thread);
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, ania ania2) {
        this.b.lazySet(ania, ania2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, ania ania, ania ania2) {
        return this.c.compareAndSet(anhl, ania, ania2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, anhs anhs, anhs anhs2) {
        return this.d.compareAndSet(anhl, anhs, anhs2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, Object obj, Object obj2) {
        return this.e.compareAndSet(anhl, obj, obj2);
    }
}
