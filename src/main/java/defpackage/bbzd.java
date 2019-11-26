package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzd */
public abstract class bbzd implements bbmo, bbnc {
    private final AtomicReference a = new AtomicReference();

    public final void a(bbnc bbnc) {
        AtomicReference atomicReference = this.a;
        Class cls = getClass();
        bbow.a((Object) bbnc, "next is null");
        if (!atomicReference.compareAndSet(null, bbnc)) {
            bbnc.bK_();
            if (atomicReference.get() != bbnz.a) {
                bbyt.a(cls);
            }
        }
    }

    public final boolean c() {
        return this.a.get() == bbnz.a;
    }

    public final void bK_() {
        bbnz.a(this.a);
    }
}
