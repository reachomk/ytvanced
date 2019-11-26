package defpackage;

import java.util.Arrays;

/* renamed from: aeew */
public final class aeew {
    public final long a;
    private final long b;
    private final long c;
    private final long d;

    public aeew(long j, long j2, long j3, long j4) {
        this.b = j;
        this.c = j2;
        this.a = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeew) {
            aeew aeew = (aeew) obj;
            if (this.b == aeew.b && this.c == aeew.c && this.a == aeew.a && this.d == aeew.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.a), Long.valueOf(this.d)});
    }
}
