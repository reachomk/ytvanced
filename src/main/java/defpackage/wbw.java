package defpackage;

/* renamed from: wbw */
final /* synthetic */ class wbw implements bcvk {
    private final wbt a;

    wbw(wbt wbt) {
        this.a = wbt;
    }

    public final void a(Object obj) {
        wbt wbt = this.a;
        ahjn ahjn = (ahjn) obj;
        airc airc = wbt.e.a;
        airc airc2 = airc.FULLSCREEN;
        airc airc3 = ahjn.a;
        airc airc4 = airc.FULLSCREEN;
        wbt.e = ahjn;
        wbt.c.c = wbt.e;
        if (wbt.f) {
            tps tps = null;
            vcp vcp;
            if (airc != airc2 && airc3 == airc4) {
                vcp = wbt.d;
                if (vcp != null) {
                    tps = vcp.e();
                }
                if (wbt.b.I() != null) {
                    wbt.a(wbt.b.I().i, tps, wbt.c);
                }
                wbt.a(wbt.b.A(), tps);
            } else if (airc == airc2 && airc3 != airc4) {
                vcp = wbt.d;
                if (vcp != null) {
                    tps = vcp.f();
                }
                if (wbt.b.I() != null) {
                    wbt.a(wbt.b.I().m, tps, wbt.c);
                }
                wbt.a(wbt.b.B(), tps);
            }
        }
    }
}
