package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aexp */
final class aexp extends aexq {
    private final afaj d;
    private boolean e;
    private float f;
    private boolean g;
    private long h;
    private int i = 0;
    private ool j;
    private afaj k;
    private affw l;
    private long m = -1;
    private float n;
    private final int o;
    private final /* synthetic */ aexj p;

    aexp(aexj aexj, String str, afkh afkh, float f, aajj aajj, aeuy aeuy, boolean z, long j, aajs aajs, float f2, int i) {
        aexj aexj2 = aexj;
        aajj aajj2 = aajj;
        aajs aajs2 = aajs;
        this.p = aexj2;
        super(aexj);
        aexc aexc = aexj2.f;
        affh a = affd.a(aajs2, aajj2, aexc.c, aexc.a(aajj2), aexj2.f.g);
        aexc = aexj2.f;
        String str2 = str;
        aeuy aeuy2 = aeuy;
        this.d = new afaj(aexj2, str2, aajj2, aeuy2, aajs2, aexs.a(aexj, aajj2, aajs2), a, affd.a(aajs2, aajj2, aexc.c, aexc.b(aajj2)), aexj.a(aajs2, str, aajj2, a), aexj2.m);
        this.a = afkh;
        this.f = f;
        this.g = z;
        this.h = j;
        this.n = f2;
        this.o = i;
    }

    aexp(aexj aexj, afkh afkh, afaj afaj, float f, boolean z, long j, float f2, int i) {
        this.p = aexj;
        super(aexj);
        this.a = afkh;
        this.d = afaj;
        this.f = f;
        this.g = z;
        this.h = j;
        this.n = f2;
        this.o = i;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        if (this.l == null) {
            return false;
        }
        this.j = null;
        this.k = null;
        this.l = null;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(float f) {
        if (this.f == f) {
            return false;
        }
        this.f = f;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(boolean z) {
        if (this.g == z) {
            return false;
        }
        this.g = z;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j) {
        this.i = 0;
        this.h = j;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(affw affw) {
        affw affw2 = affw;
        if (this.l == null && affw2.d.u() && (this.p.r instanceof aeyi) && (this.d.e().t == affw2.a.t || this.p.f.c.j())) {
            aajs aajs = affw2.a;
            aajj aajj = affw2.d;
            aexc aexc = this.p.f;
            affh a = affd.a(aajs, aajj, aexc.c, aexc.a(aajj), this.p.f.g);
            aajs = affw2.a;
            aajj = affw2.d;
            aexc = this.p.f;
            affe a2 = affd.a(aajs, aajj, aexc.c, aexc.b(aajj));
            try {
                afgv a3 = this.p.a(affw2.a, affw2.c, affw2.d, a);
                aexj aexj = this.p;
                String str = affw2.c;
                aajj aajj2 = affw2.d;
                aeuy aeuy = affw2.e;
                aajs aajs2 = affw2.a;
                this.k = new afaj(aexj, str, aajj2, aeuy, aajs2, aexs.a(aexj, aajj2, aajs2), a, a2, a3, this.p.m);
                this.j = a(this.k);
                this.l = affw2;
                return true;
            } catch (afgr e) {
                aexj aexj2 = this.p;
                aexj2.a(affw2.e, new afif("fmt.noneavailable", aexj2.o(), e.getMessage()));
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(float f) {
        if (this.n == f) {
            return false;
        }
        this.n = f;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        boolean z = false;
        if (!(this.k == null || this.l == null)) {
            z = true;
        }
        amqw.b(z);
        this.d.c.i();
        this.l.e.b();
        this.l.e.c();
        aexj aexj = this.p;
        afkh afkh = this.a;
        afaj afaj = this.k;
        float floatValue = ((Float) this.l.g.get()).floatValue();
        affw affw = this.l;
        aexq aexp = new aexp(aexj, afkh, afaj, floatValue, true, affw.b.a, ((Float) affw.f.get()).floatValue(), this.o);
        aexp.e = true;
        aexp.i = 2;
        this.p.f.j = this.k;
        this.p.a(aexp);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        aexj aexj;
        ool a;
        aexj aexj2;
        oak a2;
        boolean g = this.d.d().g();
        oav oav = null;
        if (this.a != null) {
            aexj = this.p;
            if (aexj.u == null && aexj.v == null && g) {
                int h = this.d.d().h();
                if (this.m == -1) {
                    this.m = this.p.c.a();
                    this.p.a(h);
                } else if (this.p.c.a() - this.m > ((long) h)) {
                    a("surfaceunavailable", null);
                }
                return;
            }
        }
        this.m = -1;
        f();
        afaj afaj = this.d;
        int i = 1;
        int i2 = afaj.j ^ 1;
        boolean z = false;
        if (i2 != 0) {
            if (!afaj.l) {
                this.p.b.c();
            }
            afaj = this.d;
            afaj.j = true;
            aajs e = afaj.e();
            if (e.t) {
                try {
                    boolean z2;
                    aeyt aeyt = this.p.f.b;
                    String uri = e.y().toString();
                    String str = e.h;
                    String z3 = e.z();
                    String str2 = e.c;
                    afaj = this.d;
                    String str3 = afaj.b;
                    aajj d = afaj.d();
                    afkh afkh = this.a;
                    if (afkh != null) {
                        if (afkh.o().k) {
                            z2 = true;
                            aeyt.a(uri, str, z3, str2, str3, d, z2);
                        }
                    }
                    z2 = false;
                    aeyt.a(uri, str, z3, str2, str3, d, z2);
                } catch (oem e2) {
                    a(aevl.a(e2.a, e2.getCause(), this.p.o(), 2));
                    return;
                }
            }
            this.p.f.b.j();
            if (!this.d.equals(this.p.f.j)) {
                aexc aexc = this.p.f;
                afaj afaj2 = this.d;
                aexc.j = afaj2;
                a = a(afaj2);
                if (this.d.d().u()) {
                    a = new aeyi(a);
                }
                this.p.a(a);
            }
        }
        a = this.p.r;
        if (a instanceof aeyi) {
            aeyi aeyi = (aeyi) a;
            if (this.e) {
                aeyi.c();
                this.e = false;
            } else if (this.j == null) {
                aeyi.d();
            } else {
                amqw.a(this.l);
                ool ool = this.j;
                affw affw = this.l;
                aeyi.a(ool, affw.h, affw.b.a);
            }
        }
        if (this.f != this.p.s()) {
            this.p.e.a(new oag(this.f));
        } else if (i2 != 0) {
            this.d.c.a(this.f);
        }
        if (this.g) {
            this.p.m.f();
        }
        this.p.e.a(this.g);
        if (this.a != null) {
            if (!this.g || (this.i == 2 && this.p.e.e() == 4)) {
                this.a.b(1);
            } else {
                this.a.a(1);
            }
        }
        if (this.i != 2) {
            if (i2 == 0 || this.h != 0) {
                aexj2 = this.p;
                oau r = aexj2.e.r();
                if (!r.c()) {
                    oav = r.a(aexj2.e.k(), aexj2.p);
                }
                if (oav != null) {
                    long c = oav.c();
                    long j = this.h;
                    if (j != 0) {
                        if (j < c) {
                            this.h = c;
                        } else {
                            long j2 = oav.i;
                            if (j2 != -9223372036854775807L && (j - c) * 1000 > j2) {
                                this.h = 0;
                            } else if (oav.a() == oav.b() && this.h - c == oav.a()) {
                                this.h = 0;
                            }
                        }
                    }
                    if (this.i == 0 && i2 == 0) {
                        j = this.h;
                        if (j == 0) {
                            j = c + oav.a();
                        }
                        if (this.g) {
                            this.d.c.a(j);
                        } else {
                            this.d.c.b(j);
                        }
                    }
                    this.p.a.c();
                    afgp b = this.d.b();
                    if (this.h == 0) {
                        z = true;
                    }
                    b.a(z);
                    long j3 = this.h;
                    if (j3 != 0) {
                        this.p.e.a(j3 - c);
                    } else {
                        this.p.e.a();
                    }
                    this.i = 2;
                } else if (i2 != 0) {
                    this.i = 1;
                }
            } else {
                this.i = 2;
            }
        }
        float f = this.n;
        aexj = this.p;
        if (f != aexj.w) {
            a2 = aexj.e.a(aexj.j);
            a2.a(2);
            a2.a(Float.valueOf(this.n));
            a2.a();
            this.p.w = this.n;
        }
        if ((this.o & 1) != 0) {
            i = 4;
        }
        aexj2 = this.p;
        if (i != aexj2.x) {
            a2 = aexj2.e.a(aexj2.j);
            a2.a(3);
            obh obh = new obh();
            obh.b = i;
            obh.a = 2;
            a2.a(obh.a());
            a2.a();
            this.p.x = i;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(String str, aajj aajj, aeuy aeuy, aajs aajs) {
        return this.d.b.equals(str) && this.d.d() == aajj && this.d.e() == aajs;
    }

    /* Access modifiers changed, original: protected|final */
    public final afaj b() {
        return this.d;
    }

    private final ool a(afaj afaj) {
        afaj afaj2 = afaj;
        aexs aexs = this.p.f.a;
        if (afaj.e().d()) {
            aajj d;
            aajs e;
            afgp b;
            aexj aexj = this.p;
            synchronized (afaj) {
                d = afaj.d();
                e = afaj.e();
                b = afaj.b();
            }
            afis afis = aexj.d;
            afaj.getClass();
            return new aezu(afiq.a(afis, new aexx(afaj2), 5), aexj.h, aexj.i, d, e, b, new aexz(aexj, afaj2.c), afaj2.b, afaj);
        }
        aexj aexj2 = this.p;
        aajj d2 = afaj.d();
        ScheduledExecutorService scheduledExecutorService = aexs.a;
        ovh a = aexs.a(aexj2, d2, null, afaj2);
        afjc afjc = aexj2.f.c;
        int I = d2.I();
        int H = d2.H();
        return new afaz(scheduledExecutorService, new afas(a, afjc, I, H, afaj2.r, d2.L()), aexj2.i, afaj, aexj2.m);
    }
}
