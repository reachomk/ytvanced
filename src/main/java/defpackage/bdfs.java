package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdfs */
public final class bdfs implements bcuo {
    private static final bcvl b = new bdfv();
    private final AtomicReference a;

    public bdfs() {
        this.a = new AtomicReference();
    }

    public bdfs(bcvl bcvl) {
        this.a = new AtomicReference(bcvl);
    }

    public final boolean c() {
        return this.a.get() == b;
    }

    public final void b() {
        bcvl bcvl = (bcvl) this.a.get();
        bcvl bcvl2 = b;
        if (bcvl != bcvl2) {
            bcvl = (bcvl) this.a.getAndSet(bcvl2);
            if (bcvl != null && bcvl != b) {
                bcvl.a();
            }
        }
    }
}
