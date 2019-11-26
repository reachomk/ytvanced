package defpackage;

/* renamed from: oic */
final class oic implements ofu, oig {
    public long[] a;
    public long[] b;
    public long c = -1;
    private long d = -1;
    private final /* synthetic */ oid e;

    public oic(oid oid) {
        this.e = oid;
    }

    public final ofu a() {
        return this;
    }

    public final boolean aS_() {
        return true;
    }

    public final long a(ofp ofp) {
        long j = this.d;
        if (j < 0) {
            return -1;
        }
        this.d = -1;
        return -(j + 2);
    }

    public final long b_(long j) {
        j = this.e.b(j);
        this.d = this.a[ozp.a(this.a, j, true)];
        return j;
    }

    public final ofx a(long j) {
        int a = ozp.a(this.a, this.e.b(j), true);
        long a2 = this.e.a(this.a[a]);
        ofz ofz = new ofz(a2, this.c + this.b[a]);
        if (a2 < j) {
            long[] jArr = this.a;
            if (a != jArr.length - 1) {
                a++;
                return new ofx(ofz, new ofz(this.e.a(jArr[a]), this.c + this.b[a]));
            }
        }
        return new ofx(ofz);
    }

    public final long b() {
        oyo oyo = this.e.a;
        return (oyo.d * 1000000) / ((long) oyo.a);
    }
}
