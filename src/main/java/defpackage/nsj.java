package defpackage;

/* renamed from: nsj */
final class nsj {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final nwz f;
    private final nwz g;
    private int h;
    private int i;

    public nsj(nwz nwz, nwz nwz2, boolean z) {
        this.g = nwz;
        this.f = nwz2;
        this.e = z;
        nwz2.c(12);
        this.a = nwz2.n();
        nwz.c(12);
        this.i = nwz.n();
        boolean z2 = true;
        if (nwz.j() != 1) {
            z2 = false;
        }
        nwf.b(z2, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        long p;
        if (this.e) {
            p = this.f.p();
        } else {
            p = this.f.h();
        }
        this.d = p;
        if (this.b == this.h) {
            this.c = this.g.n();
            this.g.d(4);
            int i2 = -1;
            i = this.i - 1;
            this.i = i;
            if (i > 0) {
                i2 = -1 + this.g.n();
            }
            this.h = i2;
        }
        return true;
    }
}
