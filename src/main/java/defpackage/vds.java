package defpackage;

import java.util.Map.Entry;

/* renamed from: vds */
final /* synthetic */ class vds implements bcvk {
    private final vdt a;

    vds(vdt vdt) {
        this.a = vdt;
    }

    public final void a(Object obj) {
        vdt vdt = this.a;
        ahkq ahkq = (ahkq) obj;
        String Q = ahkq.b.Q();
        if (ahkq.b.R() != 1) {
            vdt.c = "";
            return;
        }
        vrt vrt;
        vdt.c = Q;
        for (Entry value : vdt.b.a.entrySet()) {
            vrt = (vrt) value.getValue();
            if (vdt.b(vrt)) {
                break;
            }
        }
        vrt = null;
        if (vrt != null) {
            vdt.a(vrt);
        }
    }
}
