package defpackage;

/* renamed from: ojn */
public final class ojn implements ojf {
    private final oza a = new oza(10);
    private ofy b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public final void a() {
        this.c = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.b = ofo.a(okl.b(), 4);
        this.b.a(nzw.a(okl.c(), "application/id3"));
    }

    public final void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(oza oza) {
        if (this.c) {
            int b = oza.b();
            int i = this.f;
            if (i < 10) {
                i = Math.min(b, 10 - i);
                System.arraycopy(oza.a, oza.b, this.a.a, this.f, i);
                if (this.f + i == 10) {
                    this.a.c(0);
                    if (this.a.d() == 73 && this.a.d() == 68 && this.a.d() == 51) {
                        this.a.d(3);
                        this.e = this.a.n() + 10;
                    } else {
                        oyp.a("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            b = Math.min(b, this.e - this.f);
            this.b.a(oza, b);
            this.f += b;
        }
    }

    public final void b() {
        if (this.c) {
            int i = this.e;
            if (i != 0 && this.f == i) {
                this.b.a(this.d, 1, i, 0, null);
                this.c = false;
            }
        }
    }
}
