package defpackage;

import java.util.Arrays;

/* renamed from: aeev */
public final class aeev implements Comparable {
    public final long a;
    public long b;

    public aeev(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(aeev aeev) {
        return aeev != null && this.b >= aeev.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeev) {
            aeev aeev = (aeev) obj;
            if (this.a == aeev.a && this.b == aeev.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final /* synthetic */ int compareTo(Object obj) {
        aeev aeev = (aeev) obj;
        int compareTo = Long.valueOf(this.a).compareTo(Long.valueOf(aeev.a));
        return compareTo == 0 ? Long.valueOf(this.b).compareTo(Long.valueOf(aeev.b)) : compareTo;
    }
}
