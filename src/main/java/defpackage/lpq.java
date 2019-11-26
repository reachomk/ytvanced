package defpackage;

/* renamed from: lpq */
final class lpq extends lpp {
    public lpq(lla lla) {
        super(null, lla);
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.d.set(this.b.h());
        this.c.set(this.b.i());
        this.e.set(this.b.j());
        this.f.set(this.b.l());
        int height = this.e.height() + this.c.height();
        this.c.offset(0, height);
        this.d.offset(0, height);
        this.e.offset(0, height);
        this.f.offset(0, height);
    }
}
