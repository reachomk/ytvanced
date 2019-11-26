package defpackage;

/* renamed from: oqp */
public class oqp extends oqc {
    private static final ofv n = new ofv();
    private final int o;
    private final long p;
    private final oqg q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public oqp(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, oqg oqg) {
        super(ovi, ovm, nzw, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = oqg;
    }

    /* Access modifiers changed, original: protected */
    public oqi a(oqe oqe) {
        return oqe;
    }

    public final long d() {
        return this.m + ((long) this.o);
    }

    public final boolean e() {
        return this.t;
    }

    public final void a() {
        this.s = true;
    }

    public final void b() {
        ovm a = this.e.a(this.r);
        ofp ofl;
        try {
            owr owr = this.l;
            ofl = new ofl(owr, a.d, owr.a(a));
            if (this.r == 0) {
                oqe oqe = this.c;
                oqe.a(this.p);
                oqg oqg = this.q;
                oqi a2 = a(oqe);
                long j = this.a;
                long j2 = j != -9223372036854775807L ? j - this.p : -9223372036854775807L;
                j = this.b;
                oqg.a(a2, j2, j != -9223372036854775807L ? j - this.p : -9223372036854775807L);
            }
            ofm ofm = this.q.a;
            boolean z = false;
            int i = 0;
            while (i == 0) {
                if (this.s) {
                    break;
                }
                i = ofm.a(ofl, n);
            }
            if (i != 1) {
                z = true;
            }
            oxz.b(z);
            this.r = ofl.c - this.e.d;
            ozp.a(this.l);
            this.t = true;
        } catch (Throwable th) {
            ozp.a(this.l);
        }
    }
}
