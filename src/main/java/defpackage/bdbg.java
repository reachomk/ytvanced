package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdbg */
final class bdbg extends AtomicBoolean implements bcuo {
    public static final long serialVersionUID = 247232374289553518L;
    private final bdbe a;
    private final bdfu b;

    public bdbg(bdbe bdbe, bdfu bdfu) {
        this.a = bdbe;
        this.b = bdfu;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.b(this.a);
        }
    }
}
