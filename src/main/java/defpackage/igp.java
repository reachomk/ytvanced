package defpackage;

/* renamed from: igp */
public final class igp implements aidk, eie, ejc, ela, ell, fgt {
    public final ign a;
    public final ekt b;
    public final elm c;
    public final zyw d;
    public igq e;
    public boolean f = false;
    public boolean g = false;
    public eif h;
    private final xci i;
    private final ajam j;
    private final bdfu k = new bdfu();
    private final igr l = new igr(this);
    private final igs m = new igs(this);
    private igq n;
    private boolean o = false;

    public igp(ign ign, ekt ekt, elm elm, xci xci, ajam ajam, zyw zyw) {
        this.a = ign;
        this.b = ekt;
        this.c = elm;
        this.i = xci;
        this.j = ajam;
        this.d = zyw;
    }

    public final void a(ffu ffu, int i, int i2) {
        if (i2 == 0 || i2 == 4) {
            this.n = null;
        } else if (i2 == 2) {
            this.n = new igq(ffu.b.b(), ffu.b.a());
            c();
            d();
        }
    }

    public final void a(eja eja, aygk aygk) {
        if (eja != null) {
            this.e = new igq(eja.b(), aygk);
            c();
        }
    }

    public final void a(aygk aygk) {
        igq igq = this.e;
        if (igq != null && aygk != null) {
            this.e = new igq(igq.a, aygk);
            c();
        }
    }

    public final void a(boolean z) {
        this.o = z;
        d();
    }

    public final void a(ejd ejd, ejd ejd2) {
        c();
        d();
    }

    public final void A_() {
        if (foh.x(this.d)) {
            this.k.a(this.l.a(this.j));
        } else {
            this.i.a(this.l);
        }
        this.i.a(this.m);
        d();
    }

    public final void ar_() {
        if (foh.x(this.d)) {
            this.k.a();
        } else {
            this.i.b(this.l);
        }
        this.i.b(this.m);
        d();
    }

    public final void a(int i) {
        if (i == 0) {
            this.e = null;
            c();
        } else if (i == 1) {
            this.o = false;
        }
        d();
    }

    public final void c() {
        if (e()) {
            igq igq = this.n;
            if (igq != null) {
                this.a.a(igq);
                return;
            }
        }
        this.a.a(this.e);
    }

    public final void d() {
        int i = this.b.b;
        ejd c = this.h.c();
        ejd ejd = ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
        if (this.f || this.g || !this.c.b || i == 1 || c == ejd || (!(!e() || i == 2 || i == 4) || this.o)) {
            this.a.af_();
        } else {
            this.a.ag_();
        }
    }

    private final boolean e() {
        return this.h.c().g();
    }
}
