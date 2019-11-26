package defpackage;

/* renamed from: noj */
public class noj extends nnv implements noa {
    private final nnx m;
    private final long n;
    private final int o;
    private final int p;
    private nmx q;
    private npv r;
    private volatile int s;
    private volatile boolean t;

    public noj(nvo nvo, nvq nvq, int i, nom nom, long j, long j2, int i2, long j3, nnx nnx, nmx nmx, int i3, int i4, npv npv, boolean z, int i5) {
        long j4 = j3;
        int i6 = i3;
        int i7 = i4;
        super(nvo, nvq, i, nom, j, j2, i2, z, i5);
        this.m = nnx;
        this.n = j4;
        this.o = i6;
        int i8 = i4;
        this.p = i8;
        this.q = noj.a(nmx, j4, i6, i8);
        this.r = npv;
    }

    public final void a(nrq nrq) {
    }

    public final long c() {
        return (long) this.s;
    }

    public final nmx a() {
        return this.q;
    }

    public final npv b() {
        return this.r;
    }

    public final void a(npv npv) {
        this.r = npv;
    }

    public final void a(nmx nmx) {
        this.q = noj.a(nmx, this.n, this.o, this.p);
    }

    public final int a(nrb nrb, int i, boolean z) {
        return this.b.a(nrb, i, z);
    }

    public final void a(nwz nwz, int i) {
        this.b.a(nwz, i);
    }

    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        this.b.a(this.n + j, i, i2, i3, bArr);
    }

    public final void d() {
        this.t = true;
    }

    public final boolean e() {
        return this.t;
    }

    public final void f() {
        nvq a = nxf.a(this.g, this.s);
        nrb nqx;
        try {
            nvo nvo = this.i;
            nqx = new nqx(nvo, a.c, nvo.a(a));
            if (this.s == 0) {
                this.m.a((noa) this);
            }
            do {
                if (this.t) {
                }
                break;
            } while (this.m.a(nqx) == 0);
            this.s = (int) (nqx.c - this.g.c);
            nxf.a(this.i);
        } catch (Throwable th) {
            nxf.a(this.i);
        }
    }

    private static nmx a(nmx nmx, long j, int i, int i2) {
        nmx nmx2 = nmx;
        int i3 = i;
        int i4 = i2;
        if (nmx2 == null) {
            return null;
        }
        if (j != 0) {
            long j2 = nmx2.w;
            if (j2 != Long.MAX_VALUE) {
                nmx2 = new nmx(nmx2.a, nmx2.b, nmx2.c, nmx2.d, nmx2.e, nmx2.h, nmx2.i, nmx2.l, nmx2.m, nmx2.q, nmx2.r, nmx2.v, j2 + j, nmx2.f, nmx2.g, nmx2.j, nmx2.k, nmx2.s, nmx2.t, nmx2.u, nmx2.o, nmx2.n, nmx2.p);
            }
        }
        if (i3 == -1 && i4 == -1) {
            return nmx2;
        }
        return nmx2.a(i3, i4);
    }
}
