package defpackage;

import java.util.Arrays;

/* renamed from: yla */
public final class yla extends yki {
    public final boolean d;

    public yla(boolean z, boolean z2) {
        super("PAGINATION_INDICATOR", null, false, z2);
        this.d = z;
    }

    public final long g() {
        return Long.MIN_VALUE;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.d), Boolean.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yla) {
            yla yla = (yla) obj;
            if (amqq.a(Boolean.valueOf(this.d), Boolean.valueOf(yla.d)) && amqq.a(Boolean.valueOf(this.c), Boolean.valueOf(yla.c))) {
                return true;
            }
        }
        return false;
    }
}
