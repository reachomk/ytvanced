package defpackage;

/* renamed from: aezr */
public final class aezr extends oqc {
    public final afah n;
    public long o;
    public ovm p = this.e;
    public long q;
    public long r;
    public boolean s;
    public long t;
    public long u;
    public aezf v;
    public long w;
    private final oqg x;
    private volatile boolean y;
    private volatile boolean z;

    aezr(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, long j, long j2, long j3, long j4, oqg oqg, afah afah) {
        super(ovi, ovm, nzw, i, obj, j, j2, j3, -9223372036854775807L, j4);
        this.x = oqg;
        this.n = afah;
        this.o = j4;
        this.q = j;
        this.r = j2;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.s = true;
    }

    public final long d() {
        long j = this.o;
        return j != -1 ? j + 1 : -1;
    }

    public final void a() {
        this.y = true;
    }

    public final boolean e() {
        return this.z;
    }

    public final void b() {
        ovm a = this.p.a(this.w);
        if (this.u != -9223372036854775807L) {
            xvo a2 = xvo.a(a.a);
            a2.a("min_lmt", String.valueOf(this.u));
            a = a.a(a2.a());
        }
        ofp ofl;
        try {
            owr owr = this.l;
            ofl = new ofl(owr, a.d, owr.a(a));
            if (this.w == 0) {
                this.x.a(new aezq(this), -9223372036854775807L, -9223372036854775807L);
            }
            do {
                if (this.y) {
                }
                break;
            } while (this.x.a.a(ofl, null) == 0);
            long j = ofl.c - this.p.d;
            this.w = j;
            if (j > 0) {
                this.l.a();
                this.z = true;
                return;
            }
            throw new aezt();
        } catch (aezl e) {
            oxz.a(true);
            ofl.c = 0;
            throw e;
        } catch (Throwable th) {
            this.l.a();
        }
    }
}
