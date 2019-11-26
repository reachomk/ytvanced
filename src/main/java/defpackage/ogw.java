package defpackage;

/* renamed from: ogw */
final class ogw implements ogx {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    public ogw(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public final boolean aS_() {
        return true;
    }

    public final ofx a(long j) {
        int a = ozp.a(this.a, j, true);
        ofz ofz = new ofz(this.a[a], this.b[a]);
        if (ofz.b < j) {
            long[] jArr = this.a;
            if (a != jArr.length - 1) {
                a++;
                return new ofx(ofz, new ofz(jArr[a], this.b[a]));
            }
        }
        return new ofx(ofz);
    }

    public final long b(long j) {
        return this.a[ozp.a(this.b, j, true)];
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }
}
