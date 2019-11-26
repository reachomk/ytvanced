package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: qed */
public final class qed {
    private long a = -1;
    private long b = -1;

    public final qed a() {
        this.b = c();
        return this;
    }

    public final long b() {
        pzr.b(this.b != -1);
        return TimeUnit.NANOSECONDS.toMillis(c() - this.b);
    }

    private final long c() {
        long j = this.a;
        if (j == -1) {
            return System.nanoTime();
        }
        this.a = -1;
        return j;
    }
}
