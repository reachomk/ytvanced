package defpackage;

/* renamed from: agaf */
final /* synthetic */ class agaf implements Runnable {
    private final agag a;

    agaf(agag agag) {
        this.a = agag;
    }

    public final void run() {
        agag agag = this.a;
        agxq agxq = (agxq) agag.a.f.a();
        if (agxq != null && agag.a.d.equals(agxq.b())) {
            agec b = ((agdz) agag.a.r.get()).b();
            Object obj = null;
            for (agqz agqz : agxq.a().values()) {
                if (agqz.b()) {
                    String b2 = agxj.b(agqz.f);
                    for (String str : ((agfi) agag.a.k.get()).n(b2)) {
                        agdu a = agag.a.s.a(str);
                        if (a == null) {
                            agqk l = ((agfi) agag.a.k.get()).l(str);
                            if (l != null) {
                                a = agag.a.s.a(l.a, null);
                            } else {
                                xtl.c("pudl transfer playlist not in database");
                            }
                        }
                        a.a(b2);
                        b.a(b2);
                        obj = 1;
                    }
                }
            }
            for (agdu c : agag.a.s.a.values()) {
                agag.a.a(c.c());
            }
            if (obj != null) {
                ((agci) agag.a.p.get()).a(b.a());
            }
        }
    }
}
