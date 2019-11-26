package defpackage;

/* renamed from: saz */
final class saz implements pkf {
    private final /* synthetic */ sap a;

    saz(sap sap) {
        this.a = sap;
    }

    public final void a() {
        pjy pjy;
        sap sap = this.a;
        sap.y = sap.C.c();
        pjz pjz = sap.y;
        if (pjz == null) {
            pjy = null;
        } else {
            pjy = pjz.a(pjz.l);
        }
        synchronized (sap.B) {
            for (sdg sdg : sap.B) {
                sdg.a(pjy);
                sdg.a(pjy != null);
            }
        }
        String.valueOf(pjy).length();
        for (sbo r : sap.H) {
            r.r();
        }
    }
}
