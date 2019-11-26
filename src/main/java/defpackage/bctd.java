package defpackage;

/* renamed from: bctd */
final class bctd {
    public final long a;
    public bctd b;
    private final bcpt c;
    private String d;
    private int e = aocf.UNSET_ENUM_VALUE;
    private int f = aocf.UNSET_ENUM_VALUE;

    bctd(bcpt bcpt, long j) {
        this.a = j;
        this.c = bcpt;
    }

    public final String a(long j) {
        bctd bctd = this.b;
        if (bctd != null && j >= bctd.a) {
            return bctd.a(j);
        }
        if (this.d == null) {
            this.d = this.c.a(this.a);
        }
        return this.d;
    }

    public final int b(long j) {
        bctd bctd = this.b;
        if (bctd != null && j >= bctd.a) {
            return bctd.b(j);
        }
        int i = this.e;
        if (i == aocf.UNSET_ENUM_VALUE) {
            i = this.c.b(this.a);
            this.e = i;
        }
        return i;
    }

    public final int c(long j) {
        bctd bctd = this.b;
        if (bctd != null && j >= bctd.a) {
            return bctd.c(j);
        }
        int i = this.f;
        if (i == aocf.UNSET_ENUM_VALUE) {
            i = this.c.c(this.a);
            this.f = i;
        }
        return i;
    }
}
