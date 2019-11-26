package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcyd */
final class bcyd extends AtomicLong implements bcuc {
    public static final long serialVersionUID = -1214379189873595503L;
    private final bcyc a;

    public bcyd(bcyc bcyc) {
        this.a = bcyc;
    }

    public final void a(long j) {
        if (j > 0) {
            if (get() != Long.MAX_VALUE) {
                bcvu.a((AtomicLong) this, j);
                this.a.f();
            }
        } else if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
    }

    public final long a(int i) {
        return addAndGet((long) (-i));
    }
}
