package defpackage;

/* renamed from: nnk */
public final class nnk implements nni {
    private final long a;
    private final long b;

    public nnk(long j, long j2) {
        this.a = j;
        this.b = j2;
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
        jArr[0] = this.a;
        jArr[1] = this.b;
        return jArr;
    }

    public final int hashCode() {
        return ((((int) this.a) + 527) * 31) + ((int) this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nnk nnk = (nnk) obj;
            return nnk.a == this.a && nnk.b == this.b;
        }
    }
}
