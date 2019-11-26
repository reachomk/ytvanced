package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bczs */
final class bczs extends bcup {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ bded b;

    bczs(AtomicReference atomicReference, bded bded) {
        this.a = atomicReference;
        this.b = bded;
    }

    public final void e_(Object obj) {
        this.a.set(obj);
    }

    public final void a(Throwable th) {
        this.b.a(th);
        this.b.b();
    }

    public final void bM_() {
        if (this.a.get() == bczq.b) {
            this.b.bM_();
            this.b.b();
        }
    }
}
