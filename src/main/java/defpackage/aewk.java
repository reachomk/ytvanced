package defpackage;

import java.util.Locale;

/* renamed from: aewk */
public final class aewk implements nni {
    private final nwi a;
    private final long b;
    private final long c;
    private final long d;
    private final boolean e;

    public aewk(long j, long j2, nwi nwi, boolean z) {
        this.d = nwi.a() * 1000;
        this.b = j;
        this.c = j2;
        this.a = nwi;
        this.e = z;
    }

    public aewk(long j, long j2, nwi nwi) {
        this(j, j2, nwi, true);
    }

    public final long[] a() {
        long[] a = a(null);
        a[0] = a[0] / 1000;
        a[1] = a[1] / 1000;
        return a;
    }

    public final long[] a(long[] jArr) {
        long j;
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long a = (this.a.a() * 1000) - this.d;
        if (this.e) {
            j = this.b + a;
        } else {
            j = this.b;
        }
        jArr[0] = j;
        jArr[1] = this.c + a;
        return jArr;
    }

    public final int hashCode() {
        return ((((((((int) this.d) + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aewk) {
            aewk aewk = (aewk) obj;
            return aewk.a == this.a && aewk.d == this.d && aewk.b == this.b && aewk.c == this.c && aewk.e == this.e;
        }
    }

    public final String toString() {
        long[] a = a(null);
        return String.format(Locale.getDefault(), "SlidingTimeRange [%d, %d]", new Object[]{Long.valueOf(a[0]), Long.valueOf(a[1])});
    }
}
