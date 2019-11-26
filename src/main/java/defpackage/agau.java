package defpackage;

import java.util.List;

/* renamed from: agau */
final /* synthetic */ class agau implements Runnable {
    private final agak a;

    agau(agak agak) {
        this.a = agak;
    }

    public final void run() {
        agak agak = this.a;
        if (agak.v()) {
            for (agqi agqi : agak.u.b()) {
                ((afzs) agak.E.get()).q(agqi.a);
            }
            agbu agbu = (agbu) agak.F.get();
            xak.b();
            List a;
            if (agbu.b.v()) {
                a = ((aghw) agbu.e.get()).a();
            } else {
                a = amul.g();
            }
            for (agqr agqr : a) {
                agbu.j(agqr.a);
            }
            for (agqy a2 : agak.u.c()) {
                ((agci) agak.B.get()).b(a2.a(), 1);
            }
        }
    }
}
