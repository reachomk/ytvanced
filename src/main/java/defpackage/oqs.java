package defpackage;

/* renamed from: oqs */
public final class oqs extends oqc {
    private final int n;
    private final nzw o;
    private long p;
    private boolean q;

    public oqs(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, long j, long j2, long j3, int i2, nzw nzw2) {
        super(ovi, ovm, nzw, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i2;
        this.o = nzw2;
    }

    public final void a() {
    }

    public final boolean e() {
        return this.q;
    }

    public final void b() {
        try {
            long a = this.l.a(this.e.a(this.p));
            if (a != -1) {
                a += this.p;
            }
            ofl ofl = new ofl(this.l, this.p, a);
            oqe oqe = this.c;
            oqe.a(0);
            int i = 0;
            ofy a2 = oqe.a(0, this.n);
            a2.a(this.o);
            while (i != -1) {
                this.p += (long) i;
                i = a2.a(ofl, Integer.MAX_VALUE, true);
            }
            a2.a(this.j, 1, (int) this.p, 0, null);
            this.q = true;
        } finally {
            ozp.a(this.l);
        }
    }
}
