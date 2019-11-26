package defpackage;

/* renamed from: aeq */
final class aeq implements Runnable {
    public final /* synthetic */ aek a;

    aeq(aek aek) {
        this.a = aek;
    }

    public final void run() {
        aek aek = this.a;
        aek.g.showAtLocation(aek.f, 55, 0, 0);
        this.a.o();
        if (this.a.n()) {
            this.a.f.setAlpha(0.0f);
            aek = this.a;
            abr p = abe.p(aek.f);
            p.a(1.0f);
            aek.i = p;
            this.a.i.a(new aet(this));
            return;
        }
        this.a.f.setAlpha(1.0f);
        this.a.f.setVisibility(0);
    }
}
