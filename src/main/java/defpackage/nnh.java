package defpackage;

/* renamed from: nnh */
public final class nnh implements nni {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final nwi e;

    public nnh(long j, long j2, long j3, long j4, nwi nwi) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = nwi;
    }

    public final long[] a() {
        long[] a = a(null);
        a[0] = a[0] / 1000;
        a[1] = a[1] / 1000;
        return a;
    }

    public final long[] a(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long min = Math.min(this.b, (this.e.a() * 1000) - this.c);
        long j = this.a;
        long j2 = this.d;
        if (j2 != -1) {
            j = Math.max(j, min - j2);
        }
        jArr[0] = j;
        jArr[1] = min;
        return jArr;
    }

    public final int hashCode() {
        return ((((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nnh nnh = (nnh) obj;
            return nnh.a == this.a && nnh.b == this.b && nnh.c == this.c && nnh.d == this.d;
        }
    }
}
