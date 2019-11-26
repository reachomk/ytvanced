package defpackage;

/* renamed from: nse */
final class nse implements nsb {
    private final long[] a;
    private final long[] b;
    private final long c;

    public nse(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    public final boolean a() {
        return true;
    }

    public final long b(long j) {
        return this.b[nxf.a(this.a, j, true)];
    }

    public final long a(long j) {
        return this.a[nxf.a(this.b, j, true)];
    }

    public final long b() {
        return this.c;
    }
}
