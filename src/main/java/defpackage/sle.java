package defpackage;

import android.view.View;

/* renamed from: sle */
final /* synthetic */ class sle implements bbnp {
    private final slb a;
    private final axlj b;
    private final swg c;

    sle(slb slb, axlj axlj, swg swg) {
        this.a = slb;
        this.b = axlj;
        this.c = swg;
    }

    public final void a() {
        slb slb = this.a;
        axlj axlj = this.b;
        swg swg = this.c;
        sko sko = slb.a;
        azuj azuj = axlj.b;
        if (azuj == null) {
            azuj = azuj.c;
        }
        sko.a(azuj, (View) swg.a().b());
    }
}
