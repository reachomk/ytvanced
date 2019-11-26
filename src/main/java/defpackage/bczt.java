package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bczt */
final class bczt extends bcup {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ bded b;
    private final /* synthetic */ bczq c;

    bczt(bczq bczq, bcup bcup, AtomicReference atomicReference, bded bded) {
        this.c = bczq;
        this.a = atomicReference;
        this.b = bded;
        super(bcup, true);
    }

    public final void e_(Object obj) {
        Object obj2 = this.a.get();
        if (obj2 != bczq.b) {
            try {
                this.b.e_(this.c.a.a(obj, obj2));
            } catch (Throwable th) {
                bcva.a(th, this);
            }
        }
    }

    public final void a(Throwable th) {
        this.b.a(th);
        this.b.b();
    }

    public final void bM_() {
        this.b.bM_();
        this.b.b();
    }
}
