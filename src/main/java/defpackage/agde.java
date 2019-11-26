package defpackage;

/* renamed from: agde */
final /* synthetic */ class agde implements Runnable {
    private final agdb a;

    agde(agdb agdb) {
        this.a = agdb;
    }

    public final void run() {
        agdb agdb = this.a;
        agxq agxq = (agxq) agdb.a.h.a();
        if (agxq != null && agdb.a.b.equals(agxq.b())) {
            agfi agfi = (agfi) agdb.a.m.get();
            agdt agdt = (agdt) agdb.a.q.get();
            agdz agdz = (agdz) agdb.a.r.get();
            Object obj = null;
            Object obj2 = null;
            for (agqz agqz : agxq.a().values()) {
                if (agxj.a(agqz)) {
                    String b = agxj.b(agqz.f);
                    agfi.a(b, agqz);
                    agdb.a.l(b);
                    if (agdt.a().contains(b)) {
                        obj = 1;
                    }
                    if (agdz.a().contains(b)) {
                        obj2 = 1;
                    }
                }
            }
            if (obj != null) {
                agdb.a.a(agdt.b().b());
            }
            if (obj2 != null) {
                agdb.a.a(agdz.b().a());
            }
            for (agqy agqy : agfi.c()) {
                if (agqy.u() == agqs.PLAYABLE) {
                    agdb.a.a(agqy);
                }
            }
        }
    }
}
