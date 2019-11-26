package defpackage;

/* renamed from: oqw */
public final class oqw implements oqu {
    private final ofj a;
    private final long b;

    public oqw(ofj ofj, long j) {
        this.a = ofj;
        this.b = j;
    }

    public final long a() {
        return 0;
    }

    public final int b() {
        return this.a.a;
    }

    public final long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    public final long a(long j, long j2) {
        return this.a.d[(int) j];
    }

    public final oqz c(long j) {
        ofj ofj = this.a;
        int i = (int) j;
        return new oqz(null, ofj.c[i], (long) ofj.b[i]);
    }

    public final long a(long j) {
        return (long) this.a.b(j + this.b);
    }
}
