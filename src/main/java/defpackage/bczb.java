package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bczb */
final class bczb extends bcup {
    private final /* synthetic */ AtomicBoolean a;
    private final /* synthetic */ bded b;

    bczb(bcup bcup, AtomicBoolean atomicBoolean, bded bded) {
        this.a = atomicBoolean;
        this.b = bded;
        super(bcup);
    }

    public final void e_(Object obj) {
        if (this.a.get()) {
            this.b.e_(obj);
        } else {
            a(1);
        }
    }

    public final void a(Throwable th) {
        this.b.a(th);
        b();
    }

    public final void bM_() {
        this.b.bM_();
        b();
    }
}
