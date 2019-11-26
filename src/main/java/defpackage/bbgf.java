package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbgf */
final class bbgf {
    private final AtomicLong a = new AtomicLong();

    bbgf() {
    }

    /* Access modifiers changed, original: final */
    public final long a(long j) {
        return this.a.addAndGet(j);
    }
}
