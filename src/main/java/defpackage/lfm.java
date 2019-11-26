package defpackage;

import android.view.View;

/* renamed from: lfm */
public final class lfm extends ldg {
    private final bcaa b;
    private final bcaa c;
    private View d;
    private lff e;
    private ajuo f;
    private axyq g;
    private abuy h;

    public lfm(acwa acwa, bcaa bcaa, bcaa bcaa2) {
        super(acwa.t());
        this.b = bcaa;
        this.c = bcaa2;
    }

    public final void a(akoq akoq) {
    }

    public final void a(lel lel) {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void a(ajuo ajuo) {
        this.f = ajuo;
        this.g = (axyq) amqw.a(hcm.b(ajuo));
        if (ajuo.b.a == 138681548) {
            arfg arfg;
            lff lff = (lff) this.b.get();
            arfd arfd = ajuo.b;
            if (arfd.a == 138681548) {
                arfg = (arfg) arfd.b;
            } else {
                arfg = arfg.i;
            }
            lff.a(arfg);
            lff.g = this.a;
            lff.b(false);
            this.e = lff;
        }
        abuy abuy = this.h;
        if (abuy != null) {
            abuy.a(this.g);
        }
    }

    public final View f() {
        return this.d;
    }

    public final leg n() {
        return this.e;
    }

    public final void a(apxu apxu) {
        if (this.h == null) {
            this.h = (abuy) this.c.get();
        }
        this.h.a(this.g);
        this.d = this.h.b;
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return this.f;
    }
}
