package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bdfl */
final class bdfl extends AtomicLong implements bcuc, bcud, bcuo {
    public static final long serialVersionUID = 6451806817170721536L;
    private final bdfk a;
    private final bcup b;
    private long c;

    public bdfl(bdfk bdfk, bcup bcup) {
        this.a = bdfk;
        this.b = bcup;
    }

    public final void a(long j) {
        if (bcvu.a(j)) {
            long j2;
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
            } while (!compareAndSet(j2, bcvu.b(j2, j)));
        }
    }

    public final boolean c() {
        return get() == Long.MIN_VALUE;
    }

    public final void b() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.a.a(this);
        }
    }

    public final void e_(Object obj) {
        long j = get();
        if (j != Long.MIN_VALUE) {
            long j2 = this.c;
            if (j != j2) {
                this.c = j2 + 1;
                this.b.e_(obj);
                return;
            }
            b();
            this.b.a(new bcvd("PublishSubject: could not emit value due to lack of requests"));
        }
    }

    public final void a(Throwable th) {
        if (get() != Long.MIN_VALUE) {
            this.b.a(th);
        }
    }

    public final void bM_() {
        if (get() != Long.MIN_VALUE) {
            this.b.bM_();
        }
    }
}
