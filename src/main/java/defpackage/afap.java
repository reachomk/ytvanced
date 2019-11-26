package defpackage;

/* renamed from: afap */
final class afap extends oqc {
    private static final ofv n = new ofv();
    private final oqg o;
    private volatile boolean p;
    private long q;
    private boolean r;

    public afap(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, oqg oqg) {
        super(ovi, ovm, nzw, i, obj, 0, 0, -9223372036854775807L, -9223372036854775807L, -1);
        this.o = oqg;
    }

    public final void a() {
        this.p = true;
    }

    public final void b() {
        ovm a = this.e.a(this.q);
        ofp ofl;
        try {
            owr owr = this.l;
            ofl = new ofl(owr, a.d, owr.a(a));
            if (this.q == 0) {
                this.o.a(this.c, -9223372036854775807L, -9223372036854775807L);
            }
            ofm ofm = this.o.a;
            boolean z = false;
            int i = 0;
            while (i == 0) {
                if (this.p) {
                    break;
                }
                i = ofm.a(ofl, n);
            }
            if (i != 1) {
                z = true;
            }
            oxz.b(z);
            this.q = ofl.c - this.e.d;
            ozp.a(this.l);
            this.r = true;
        } catch (Throwable th) {
            ozp.a(this.l);
        }
    }

    public final boolean e() {
        return this.r;
    }
}
