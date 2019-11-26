package defpackage;

/* renamed from: akid */
public final /* synthetic */ class akid implements akif {
    private final sxd a;
    private final akkq b;

    public akid(sxd sxd, akkq akkq) {
        this.a = sxd;
        this.b = akkq;
    }

    public final clz a(cmg cmg, swk swk, bapd bapd, bapc bapc) {
        sxd sxd = this.a;
        akkq akkq = this.b;
        akih akih = new akih();
        akih.a(akih, cmg, new akii());
        akih.a.d = bapd.a();
        boolean z = false;
        akih.d.set(0);
        akih.a.u = sxd;
        akih.d.set(4);
        akih.a.e = akkq;
        akih.d.set(1);
        akih.a.g = bapd.d();
        akih.d.set(3);
        if (bapc != null) {
            baoi baoi = new baoi();
            if (syt.a(bapc, baoi, 168774763, akig.a)) {
                if ("primary_image".equals(baoi.a())) {
                    z = true;
                }
            }
            akih.a.a = Boolean.valueOf(z);
        }
        if (bapd.b() != null) {
            akih.a.b = bapd.b();
        }
        if (bapd.c() != null) {
            akih.a.c = bapd.c();
        }
        akih.a.f = swk.e();
        akih.d.set(2);
        return akih;
    }
}
