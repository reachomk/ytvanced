package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bbcf */
final class bbcf {
    public static final bbcf d = new bbcf(1, 0, Collections.emptySet());
    public final int a;
    public final long b;
    public final Set c;

    bbcf(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = amuw.a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bbcf bbcf = (bbcf) obj;
            return this.a == bbcf.a && this.b == bbcf.b && amqq.a(this.c, bbcf.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("maxAttempts", this.a);
        a.a("hedgingDelayNanos", this.b);
        a.a("nonFatalStatusCodes", this.c);
        return a.toString();
    }
}
