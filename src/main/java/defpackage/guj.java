package defpackage;

import android.view.View;

/* renamed from: guj */
final class guj extends aktz {
    public final /* synthetic */ gub a;
    private final /* synthetic */ jts b;

    guj(gub gub, jts jts) {
        this.a = gub;
        this.b = jts;
    }

    public final void a(aafn aafn, boolean z) {
        if (z && this.b == this.a.au()) {
            if (!gub.g(fiw.a(this.a))) {
                this.a.ao();
            }
            if (gub.e(fiw.a(this.a))) {
                this.a.aF();
            }
        }
        jts jts = this.b;
        epo.a(jts.i, jts.d, jts.j, this.a.bk);
        if (this.b.h()) {
            gub gub = this.a;
            if (!gub.aw) {
                gub.aw = true;
                gub.ar();
            }
        }
    }

    public final void a() {
        jts jts = this.b;
        epo.a(jts.i, jts.d, jts.j, this.a.bk);
        boolean h = this.b.h();
        gub gub = this.a;
        if (h != gub.aw) {
            gub.aw = h;
            gub.ar();
        }
    }

    public final void b() {
        View z = this.a.z();
        if (z != null) {
            z.post(new gui(this));
        }
    }
}
