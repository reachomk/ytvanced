package defpackage;

import android.view.View;

/* renamed from: sla */
final /* synthetic */ class sla implements bbnp {
    private final skx a;
    private final awme b;
    private final swg c;

    sla(skx skx, awme awme, swg swg) {
        this.a = skx;
        this.b = awme;
        this.c = swg;
    }

    public final void a() {
        skx skx = this.a;
        awme awme = this.b;
        swg swg = this.c;
        sko sko = skx.a;
        azuj azuj = awme.b;
        if (azuj == null) {
            azuj = azuj.c;
        }
        sko.a(azuj, (View) swg.a().b());
    }
}
