package defpackage;

/* renamed from: ogc */
public final class ogc implements ofm {
    private static final int a = ozp.f("FLV");
    private final oza b = new oza(4);
    private final oza c = new oza(9);
    private final oza d = new oza(11);
    private final oza e = new oza();
    private final ogf f = new ogf();
    private ofo g;
    private int h = 1;
    private long i = -9223372036854775807L;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private ogd o;
    private ogg p;

    public final void c() {
    }

    public final boolean a(ofp ofp) {
        ofp.c(this.b.a, 0, 3);
        this.b.c(0);
        if (this.b.h() == a) {
            ofp.c(this.b.a, 0, 2);
            this.b.c(0);
            if ((this.b.e() & 250) == 0) {
                ofp.c(this.b.a, 0, 4);
                this.b.c(0);
                int k = this.b.k();
                ofp.a();
                ofp.b(k);
                ofp.c(this.b.a, 0, 4);
                this.b.c(0);
                if (this.b.k() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(ofo ofo) {
        this.g = ofo;
    }

    public final void a(long j, long j2) {
        this.h = 1;
        this.i = -9223372036854775807L;
        this.j = 0;
    }

    public final int a(ofp ofp, ofv ofv) {
        while (true) {
            int i = this.h;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    ofp.a(this.j);
                    this.j = 0;
                    this.h = 3;
                } else if (i != 3) {
                    if (i == 4) {
                        i = this.k;
                        if (i == 8 && this.o != null) {
                            a();
                            this.o.b(b(ofp), this.i + this.m);
                        } else if (i == 9 && this.p != null) {
                            a();
                            this.p.b(b(ofp), this.i + this.m);
                        } else if (i != 18 || this.n) {
                            ofp.a(this.l);
                            z = false;
                        } else {
                            this.f.b(b(ofp), this.m);
                            long j = this.f.b;
                            if (j != -9223372036854775807L) {
                                this.g.a(new ofw(j));
                                this.n = true;
                            }
                        }
                        this.j = 4;
                        this.h = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!ofp.a(this.d.a, 0, 11, true)) {
                    return -1;
                } else {
                    this.d.c(0);
                    this.k = this.d.d();
                    this.l = this.d.h();
                    this.m = (long) this.d.h();
                    this.m = (((long) (this.d.d() << 24)) | this.m) * 1000;
                    this.d.d(3);
                    this.h = 4;
                }
            } else if (!ofp.a(this.c.a, 0, 9, true)) {
                return -1;
            } else {
                this.c.c(0);
                this.c.d(4);
                i = this.c.d();
                int i2 = i & 1;
                if ((i & 4) != 0 && this.o == null) {
                    this.o = new ogd(this.g.a(8, 1));
                }
                if (i2 != 0 && this.p == null) {
                    this.p = new ogg(this.g.a(9, 2));
                }
                this.g.a();
                this.j = this.c.k() - 5;
                this.h = 2;
            }
        }
    }

    private final oza b(ofp ofp) {
        if (this.l > this.e.c()) {
            oza oza = this.e;
            int c = oza.c();
            oza.a(new byte[Math.max(c + c, this.l)], 0);
        } else {
            this.e.c(0);
        }
        this.e.b(this.l);
        ofp.b(this.e.a, 0, this.l);
        return this.e;
    }

    private final void a() {
        if (!this.n) {
            this.g.a(new ofw(-9223372036854775807L));
            this.n = true;
        }
        if (this.i == -9223372036854775807L) {
            this.i = this.f.b == -9223372036854775807L ? -this.m : 0;
        }
    }
}
