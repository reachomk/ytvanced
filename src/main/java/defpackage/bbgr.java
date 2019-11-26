package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bbgr */
final class bbgr {
    public static final bbgr f = new bbgr(1, 0, 0, 1.0d, Collections.emptySet());
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final Set e;

    bbgr(int i, long j, long j2, double d, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = amuw.a((Collection) set);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbgr) {
            bbgr bbgr = (bbgr) obj;
            if (this.a == bbgr.a && this.b == bbgr.b && this.c == bbgr.c && Double.compare(this.d, bbgr.d) == 0 && amqq.a(this.e, bbgr.e)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("maxAttempts", this.a);
        a.a("initialBackoffNanos", this.b);
        a.a("maxBackoffNanos", this.c);
        a.a("backoffMultiplier", String.valueOf(this.d));
        a.a("retryableStatusCodes", this.e);
        return a.toString();
    }
}
