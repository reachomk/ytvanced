package defpackage;

import android.view.View;

/* renamed from: dcs */
final class dcs implements Runnable {
    public final czw a;
    private final View b;
    private final /* synthetic */ dcp c;

    dcs(dcp dcp, czw czw, View view) {
        this.c = dcp;
        this.a = czw;
        this.b = view;
    }

    public final void run() {
        dcp dcp = this.c;
        cyh cyh = dcp.p;
        dcp.n = this.a.a(this.b);
    }
}
