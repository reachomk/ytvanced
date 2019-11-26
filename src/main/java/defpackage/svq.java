package defpackage;

/* renamed from: svq */
public final /* synthetic */ class svq implements svs {
    private final sxd a;
    private final sxh b;

    public svq(sxd sxd, sxh sxh) {
        this.a = sxd;
        this.b = sxh;
    }

    public final clz a(cmg cmg, bapd bapd, bapc bapc) {
        sxd sxd = this.a;
        sxh sxh = this.b;
        svu svu = new svu();
        svu.a(svu, cmg, new svr());
        svu.a.d = bapd.a();
        boolean z = false;
        svu.d.set(0);
        svu.a.g = sxd;
        svu.d.set(2);
        if (bapd.a(new bapb()) != null) {
            svu.a.b = bapd.b();
        }
        if (bapd.c() != null) {
            svu.a.c = bapd.c();
        }
        if (sxh != null) {
            svu.a.e = sxh;
        }
        svu.a.f = bapd.d();
        svu.d.set(1);
        if (bapc != null) {
            baoi baoi = new baoi();
            if (syt.a(bapc, baoi, 168774763, svp.a)) {
                if ("primary_image".equals(baoi.a())) {
                    z = true;
                }
            }
            svu.a.a = Boolean.valueOf(z);
        }
        return svu;
    }
}
