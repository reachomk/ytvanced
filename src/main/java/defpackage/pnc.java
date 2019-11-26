package defpackage;

import java.util.TimerTask;

/* renamed from: pnc */
final class pnc extends TimerTask {
    private final /* synthetic */ plm a;

    pnc(plm plm) {
        this.a = plm;
    }

    public final void run() {
        plm plm = this.a;
        if (!plm.i.isEmpty() && plm.j == null && plm.d && plm.b != 0) {
            ptg a;
            plw plw = plm.c;
            int[] a2 = ppj.a(plm.i);
            pzr.b("Must be called from the main thread.");
            if (plw.r()) {
                a = plw.a(new pmk(plw, plw.e, a2));
            } else {
                a = plw.s();
            }
            plm.j = a;
            plm.j.a(plm.l);
            plm.i.clear();
        }
    }
}
