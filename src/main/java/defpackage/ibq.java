package defpackage;

/* renamed from: ibq */
public final class ibq implements ajkk, ibc {
    public final ajjz a;
    public xqc b;
    public boolean c;
    public boolean d;
    private final adqf e;
    private final boolean f;
    private final ails g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    public ibq(adqf adqf, ails ails, ajjz ajjz, zyw zyw) {
        this.e = adqf;
        this.g = ails;
        this.a = ajjz;
        this.f = foh.b(zyw);
    }

    public final void a(aich aich) {
    }

    public final void j(boolean z) {
    }

    public final void k(boolean z) {
    }

    public final void a(aicd aicd) {
        a();
    }

    public final void a(int i, int i2) {
        a();
    }

    public final void a() {
        if (this.h) {
            d();
        } else {
            a(false);
        }
    }

    private final void d() {
        a(b(), false);
    }

    private final void a(boolean z) {
        a(c(), z);
    }

    public final void g_(boolean z) {
        if (this.d) {
            this.h = true;
            d();
        }
    }

    public final void g(boolean z) {
        if (this.d) {
            this.h = false;
            a(z);
        }
    }

    private final boolean e() {
        if (this.e.d() == 0 || this.e.d() == 1) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        boolean z = false;
        if (!((this.g.d.a() && !this.g.d.f()) || this.c || e() || this.i)) {
            if (!this.l) {
                z = true;
            } else if (this.f) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        boolean z = false;
        if (!(this.k || this.j || this.i || e() || !this.a.a())) {
            if (!this.l) {
                z = true;
            } else if (this.f) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    private final void a(boolean z, boolean z2) {
        if (this.d) {
            this.b.a(z, z2);
        }
    }

    public final void a(ejd ejd) {
        boolean z = true;
        if (!(ejd.f() || ejd.n())) {
            z = false;
        }
        this.j = z;
        this.k = ejd.a();
        a();
    }

    public final void h(boolean z) {
        if (this.l != z) {
            this.l = z;
            a();
        }
    }

    public final void i(boolean z) {
        this.i = z;
        a();
    }
}
