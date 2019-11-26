package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcyy */
final class bcyy extends bcup {
    private final /* synthetic */ AtomicBoolean a;
    private final /* synthetic */ bded b;

    bcyy(AtomicBoolean atomicBoolean, bded bded) {
        this.a = atomicBoolean;
        this.b = bded;
    }

    public final void e_(Object obj) {
        this.a.set(true);
        b();
    }

    public final void a(Throwable th) {
        this.b.a(th);
        this.b.b();
    }

    public final void bM_() {
        b();
    }
}
