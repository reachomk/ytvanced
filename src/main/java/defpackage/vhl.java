package defpackage;

/* renamed from: vhl */
final /* synthetic */ class vhl implements bcvk {
    private final vhg a;

    vhl(vhg vhg) {
        this.a = vhg;
    }

    public final void a(Object obj) {
        vhg vhg = this.a;
        String Q = ((ahkq) obj).b.Q();
        xak.a();
        vsl vsl = (vsl) vhg.e.get(Q);
        if (vhg.i != null) {
            vhg.a.a(vhg.g, vsm.MID_ROLL, vhg.i, vra.VIDEO_ENDED, -1, -1);
            vhg.i = null;
            if (vsl == null) {
                vhg.a.b(vhg.f, vhg.g);
            } else {
                vhg.a.a(vhg.f, vhg.g, vsm.MID_ROLL, vsl);
                vhg.i = vsl;
            }
        } else if (vsl != null) {
            vhg.a.a(vhg.f, vhg.g);
            vhg.a.a(vhg.f, vhg.g, vsm.MID_ROLL, vsl);
            vhg.i = vsl;
        }
    }
}
