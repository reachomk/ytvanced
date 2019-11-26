package defpackage;

/* renamed from: afdo */
public final class afdo extends afbp {
    private final int a;
    private final afdr b;
    private final afjc c;
    private final afdr[] d;
    private afkh e;

    public afdo(int i, afdr afdr, afjc afjc, afdr... afdrArr) {
        super(afdrArr[i]);
        this.a = i;
        this.c = afjc;
        this.b = afdr;
        this.d = afdrArr;
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        aajs aajs2 = aajs;
        aajj aajj2 = aajj;
        a(b(aajs, aajj2));
        afkh afkh2 = afkh;
        this.e = afkh2;
        return ((afdr) h()).a(aajs2, affa, str, aajj2, afkh2, aeuy, f, f2, z, i);
    }

    public final void a(aaje aaje, aeuy aeuy) {
        avte avte;
        arvt b = this.c.d.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
        } else {
            avte = avte.x;
        }
        if (avte.v) {
            synchronized (this) {
                if (!aaje.l) {
                    a(this.b);
                }
                this.b.a(aaje, aeuy);
            }
            return;
        }
        synchronized (this) {
            super.a(aaje, aeuy);
        }
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return b(aajs, aajj).a(aajs, aajj, z, afgt, i);
    }

    public final int a(aajs aajs, aajj aajj) {
        return b(aajs, aajj).a(aajs, aajj);
    }

    public final void a(afkh afkh) {
        this.e = afkh;
        super.a(afkh);
    }

    public final void r() {
        this.e = null;
        super.r();
    }

    private final synchronized void a(afdr afdr) {
        afdr h = h();
        if (afdr != h) {
            if (this.e != null) {
                h.r();
                afdr.a(this.e);
            }
            h.a(false);
            a((affx) afdr);
        }
    }

    private final afdr b(aajs aajs, aajj aajj) {
        for (afdr afdr : this.d) {
            if (afdr.b(aajs, aajj)) {
                return afdr;
            }
        }
        return this.d[this.a];
    }

    public final /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ float s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    public final /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ aerm k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ int w() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ long v() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ long u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ long t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ long o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ aahr e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ aahr d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void bx_() {
        super.bx_();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }
}
