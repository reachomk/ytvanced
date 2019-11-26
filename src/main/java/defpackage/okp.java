package defpackage;

/* renamed from: okp */
final class okp implements ofu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public long f;
    public long g;
    private final int h;

    public okp(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final boolean aS_() {
        return true;
    }

    public final boolean c() {
        return (this.f == 0 || this.g == 0) ? false : true;
    }

    public final long b() {
        return ((this.g / ((long) this.c)) * 1000000) / ((long) this.b);
    }

    public final ofx a(long j) {
        long j2 = (long) this.c;
        long a = ozp.a((((((long) this.h) * j) / 1000000) / j2) * j2, 0, this.g - j2);
        long j3 = this.f + a;
        long b = b(j3);
        ofz ofz = new ofz(b, j3);
        if (b < j) {
            b = (long) this.c;
            if (a != this.g - b) {
                j3 += b;
                return new ofx(ofz, new ofz(b(j3), j3));
            }
        }
        return new ofx(ofz);
    }

    public final long b(long j) {
        return (Math.max(0, j - this.f) * 1000000) / ((long) this.h);
    }
}
