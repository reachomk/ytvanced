package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcur */
public final class bcur {
    public static final bcur a = new bcur();
    private final AtomicReference b = new AtomicReference();

    bcur() {
    }

    public final bcuq a() {
        if (this.b.get() == null) {
            this.b.compareAndSet(null, bcuq.a);
        }
        return (bcuq) this.b.get();
    }
}
