package defpackage;

/* renamed from: agiu */
public final class agiu implements agid {
    public long a;
    private agqp b;
    private avsi c = avsi.UNKNOWN_FORMAT_TYPE;
    private final int d;
    private final byte[] e;
    private aakj f;
    private long g;
    private long h;
    private agqz i;
    private agqf j;
    private agqq k;
    private long l;
    private long m;
    private agqw n;
    private agqy o;
    private final /* synthetic */ agip p;

    public final agqp a() {
        agqp agqp;
        synchronized (this.p.l) {
            agqp = this.b;
        }
        return agqp;
    }

    public final aakj b() {
        aakj aakj;
        synchronized (this.p.l) {
            aakj = this.f;
        }
        return aakj;
    }

    public final long c() {
        long j;
        synchronized (this.p.l) {
            j = this.g;
        }
        return j;
    }

    public final long d() {
        long j;
        synchronized (this.p.l) {
            j = this.h;
        }
        return j;
    }

    public final agqf e() {
        agqf agqf;
        synchronized (this.p.l) {
            agqf = this.j;
        }
        return agqf;
    }

    public final agqq f() {
        agqq agqq;
        synchronized (this.p.l) {
            agqq = this.k;
        }
        return agqq;
    }

    public final void a(aakj aakj, long j, long j2) {
        synchronized (this.p.l) {
            j();
            this.f = aakj;
            this.g = j;
            this.h = j2;
            this.o = null;
        }
    }

    public final void a(long j) {
        synchronized (this.p.l) {
            this.l = j;
            this.o = null;
        }
    }

    public final void b(long j) {
        synchronized (this.p.l) {
            this.m = j;
            this.o = null;
        }
    }

    public final void c(long j) {
        synchronized (this.p.l) {
            this.a = j;
            this.o = null;
        }
    }

    public final void a(agqf agqf) {
        synchronized (this.p.l) {
            this.j = agqf;
            this.o = null;
        }
    }

    public final void a(agqq agqq) {
        synchronized (this.p.l) {
            this.k = agqq;
            this.o = null;
        }
    }

    public final void a(agqz agqz) {
        synchronized (this.p.l) {
            this.i = agqz;
            this.o = null;
        }
    }

    public final void a(agqp agqp) {
        synchronized (this.p.l) {
            this.b = agqp;
            this.o = null;
        }
    }

    public final void i() {
        synchronized (this.p.l) {
            this.o = null;
        }
    }

    public final void j() {
        synchronized (this.p.l) {
            this.f = null;
            this.n = null;
        }
    }

    public final agqw g() {
        agqw agqw;
        synchronized (this.p.l) {
            if (this.n == null) {
                aakj aakj = this.f;
                if (aakj != null) {
                    avqc u = aakj.u();
                    if (u != null) {
                        this.n = new agqw(this.b.a(), u, this.g, this.h, this.p.k);
                    }
                }
            }
            agqw = this.n;
        }
        return agqw;
    }

    public final agqy h() {
        Throwable th;
        synchronized (this.p.l) {
            try {
                agiu agiu;
                if (this.o == null) {
                    agqw g = g();
                    aakj aakj = this.f;
                    atdv l = aakj != null ? aakj.l() : null;
                    agie a = this.p.a(this.b.a());
                    boolean b = ahda.b(this.p.m);
                    agqp agqp = this.b;
                    avsi avsi = this.c;
                    int i = this.d;
                    byte[] bArr = this.e;
                    boolean e = this.p.e(agqp.a());
                    long j = this.g;
                    long j2 = this.l;
                    long j3 = this.m;
                    long j4 = this.a;
                    agqf agqf = this.j;
                    agqq agqq = this.k;
                    agqn e2 = a != null ? a.e() : null;
                    agqz agqz = this.i;
                    agqy agqy = agqy;
                    agqy agqy2 = agqy;
                    try {
                        agqy = new agqy(agqp, avsi, i, bArr, e, j, j2, j3, j4, g, l, agqf, agqq, e2, agqz, b);
                        agiu = this;
                        agiu.o = agqy2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                agiu = this;
                agqy agqy3 = agiu.o;
                return agqy3;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    /* synthetic */ agiu(agip agip, agqp agqp, avsi avsi, int i, byte[] bArr, agqf agqf, agqq agqq, long j) {
        this.p = agip;
        this.b = agqp;
        this.c = avsi;
        this.d = i;
        this.e = bArr;
        this.j = agqf;
        this.k = agqq;
        this.a = j;
    }
}
