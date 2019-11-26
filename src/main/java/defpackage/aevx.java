package defpackage;

/* renamed from: aevx */
public final class aevx extends nnv implements noa {
    public nvq m;
    public long n;
    public volatile int o;
    public volatile long p;
    public volatile long q;
    public final int r;
    private final nnx s;
    private final int t = -1;
    private final int u = -1;
    private nmx v;
    private npv w;
    private volatile boolean x;

    public final void a(nrq nrq) {
    }

    public final long c() {
        return (long) this.o;
    }

    public final nmx a() {
        return this.v;
    }

    public final npv b() {
        return this.w;
    }

    public final void a(npv npv) {
        this.w = npv;
    }

    public final void a(nmx nmx) {
        this.v = aevx.a(nmx, this.t, this.u);
    }

    public final int a(nrb nrb, int i, boolean z) {
        return this.b.a(nrb, i, z);
    }

    public final void a(nwz nwz, int i) {
        this.b.a(nwz, i);
    }

    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        this.b.a(j, i, i2, i3, bArr);
    }

    public final void d() {
        this.x = true;
    }

    public final boolean e() {
        return this.x;
    }

    public final long h() {
        return this.p < 0 ? this.j : this.p;
    }

    public final long i() {
        return this.q < 0 ? this.k : this.q;
    }

    private final nvq j() {
        nvq nvq = this.m;
        return nvq == null ? this.g : nvq;
    }

    public final void f() {
        int i = this.r;
        int i2 = i - 1;
        if (i != 0) {
            nvq j;
            if (i2 == 2) {
                j = j();
                if (this.n != -1) {
                    xvo a = xvo.a(j.a);
                    a.a("min_lmt", String.valueOf(this.n));
                    j = new nvq(a.a(), j.b, j.c, j.d, j.e, j.f, j.g);
                }
                j = nxf.a(j, this.o);
            } else if (i2 != 3) {
                j = nxf.a(j(), this.o);
            } else {
                this.o = 0;
                j = j();
            }
            nrb nqx;
            try {
                nvo nvo = this.i;
                nqx = new nqx(nvo, j.c, nvo.a(j));
                if (this.o == 0) {
                    this.s.a(this);
                }
                do {
                    if (this.x) {
                    }
                    break;
                } while (this.s.a(nqx) == 0);
                this.o = (int) (nqx.c - this.g.c);
                i2 = this.r;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 == 2 || i3 == 3) {
                        if (this.o <= 0) {
                            throw new aevw();
                        }
                    }
                    this.i.b();
                    return;
                }
                throw null;
            } catch (Throwable th) {
                this.i.b();
            }
        } else {
            throw null;
        }
    }

    private static nmx a(nmx nmx, int i, int i2) {
        if (nmx != null) {
            return (i == -1 && i2 == -1) ? nmx : nmx.a(i, i2);
        } else {
            return null;
        }
    }

    public aevx(nvo nvo, nvq nvq, int i, nom nom, long j, long j2, int i2, nnx nnx, nmx nmx, int i3) {
        super(nvo, nvq, i, nom, j, j2, i2, false, 0);
        this.s = nnx;
        this.v = aevx.a(nmx, -1, -1);
        this.w = null;
        this.r = i3;
        this.p = -1;
        this.q = -1;
        this.n = -1;
    }
}
