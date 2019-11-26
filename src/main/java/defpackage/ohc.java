package defpackage;

/* renamed from: ohc */
final class ohc {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final oza f;
    private final oza g;
    private int h;
    private int i;

    public ohc(oza oza, oza oza2, boolean z) {
        this.g = oza;
        this.f = oza2;
        this.e = z;
        oza2.c(12);
        this.a = oza2.o();
        oza.c(12);
        this.i = oza.o();
        boolean z2 = true;
        if (oza.k() != 1) {
            z2 = false;
        }
        oxz.b(z2, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        long q;
        if (this.e) {
            q = this.f.q();
        } else {
            q = this.f.i();
        }
        this.d = q;
        if (this.b == this.h) {
            this.c = this.g.o();
            this.g.d(4);
            int i2 = -1;
            i = this.i - 1;
            this.i = i;
            if (i > 0) {
                i2 = -1 + this.g.o();
            }
            this.h = i2;
        }
        return true;
    }
}
