package defpackage;

/* renamed from: wbn */
final /* synthetic */ class wbn implements bcvk {
    private final wbo a;

    wbn(wbo wbo) {
        this.a = wbo;
    }

    public final void a(Object obj) {
        wbo wbo = this.a;
        ahjn ahjn = (ahjn) obj;
        airc airc = wbo.e.a;
        airc airc2 = airc.FULLSCREEN;
        airc airc3 = ahjn.a;
        airc airc4 = airc.FULLSCREEN;
        wbo.e = ahjn;
        wbo.d.c = wbo.e;
        if (airc == airc2 || airc3 != airc4) {
            if (airc == airc2 && airc3 != airc4) {
                if (wbo.a(wbo.b)) {
                    wbo.c.a(wbo.b.O(), wbo.b.ac(), new aftl[0]);
                    return;
                }
                wbo.c.a(wbo.b.P());
            }
        } else if (wbo.a(wbo.b)) {
            wbo.c.a(wbo.b.M(), wbo.b.ac(), new aftl[0]);
        } else {
            wbo.c.a(wbo.b.N());
        }
    }
}
