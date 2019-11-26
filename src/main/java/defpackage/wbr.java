package defpackage;

/* renamed from: wbr */
final /* synthetic */ class wbr implements bcvk {
    private final wbs a;

    wbr(wbs wbs) {
        this.a = wbs;
    }

    public final void a(Object obj) {
        wbs wbs = this.a;
        ahjn ahjn = (ahjn) obj;
        airc airc = wbs.d.a;
        airc airc2 = airc.FULLSCREEN;
        airc airc3 = ahjn.a;
        airc airc4 = airc.FULLSCREEN;
        airc airc5 = wbs.d.a;
        airc airc6 = airc.MINIMIZED;
        airc airc7 = ahjn.a;
        airc airc8 = airc.MINIMIZED;
        airc airc9 = wbs.d.a;
        airc airc10 = airc.DEFAULT;
        airc airc11 = ahjn.a;
        airc airc12 = airc.DEFAULT;
        wbs.d = ahjn;
        wbs.c.c = wbs.d;
        if (!(airc9 == airc10 || airc11 != airc12 || wbs.b.I() == null)) {
            wbs.a(wbs.b.I().q, new aftl[0]);
        }
        if (!(airc5 == airc6 || airc7 != airc8 || wbs.b.I() == null)) {
            wbs.a(wbs.b.I().r, new aftl[0]);
        }
        tps tps = null;
        vcp vcp;
        if (airc != airc2 && airc3 == airc4) {
            vcp = wbs.e;
            if (vcp != null) {
                tps = vcp.e();
            }
            if (wbs.b.I() != null) {
                wbs.a(wbs.b.I().i, tps, wbs.c);
            }
            wbs.a(wbs.b.A(), tps);
        } else if (airc == airc2 && airc3 != airc4) {
            vcp = wbs.e;
            if (vcp != null) {
                tps = vcp.f();
            }
            if (wbs.b.I() != null) {
                wbs.a(wbs.b.I().m, tps, wbs.c);
            }
            wbs.a(wbs.b.B(), tps);
        }
    }
}
