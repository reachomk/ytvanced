package defpackage;

/* renamed from: ahwk */
public final class ahwk {
    public ahsq a;
    public ahwh b;
    public ahwg c;
    public ahwx d;
    public ahww e;
    public ahww f;
    public ahwj g;
    public ahwj h;
    public ahwu i;
    public ahwu j;
    private final ahxb k;

    public ahwk(ahxb ahxb, ahsq ahsq) {
        this.k = ahxb;
        this.a = ahsq;
        a();
    }

    public final void a() {
        this.b = new ahwh(this.k);
        this.c = new ahwg(this.k);
        this.d = new ahwx(this.k);
        this.f = new ahww(this.k, true, this.a.a());
        this.e = new ahww(this.k, false, this.a.a());
        this.g = new ahwj(this.k, false, this.a.a());
        this.h = new ahwj(this.k, true, this.a.a());
        this.i = new ahwu(this.k, false, this.a.a());
        this.j = new ahwu(this.k, true, this.a.a());
    }

    public final void b() {
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
        this.f.e();
        this.g.e();
        this.h.e();
        this.i.e();
        this.j.e();
    }

    public final bcaa c() {
        return new ahwn(this);
    }

    public final bcaa d() {
        return new ahwm(this);
    }

    public final bcaa e() {
        return new ahwp(this);
    }

    public final bcaa a(boolean z) {
        return new ahwo(this, z);
    }

    public final bcaa b(boolean z) {
        return new ahwr(this, z);
    }
}
