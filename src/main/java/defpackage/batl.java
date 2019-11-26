package defpackage;

import java.util.Arrays;

/* renamed from: batl */
public final class batl {
    public final String a;
    public final batn b;
    private final long c;
    private final batt d = null;
    private final batt e;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof batl) {
            batl batl = (batl) obj;
            if (amqq.a(this.a, batl.a) && amqq.a(this.b, batl.b) && this.c == batl.c && amqq.a(null, null) && amqq.a(this.e, batl.e)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("description", this.a);
        a.a("severity", this.b);
        a.a("timestampNanos", this.c);
        a.a("channelRef", null);
        a.a("subchannelRef", this.e);
        return a.toString();
    }

    /* synthetic */ batl(String str, batn batn, long j, batt batt) {
        this.a = str;
        this.b = (batn) amqw.a((Object) batn, (Object) "severity");
        this.c = j;
        this.e = batt;
    }
}
