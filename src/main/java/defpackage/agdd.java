package defpackage;

/* renamed from: agdd */
final /* synthetic */ class agdd implements Runnable {
    private final agdb a;
    private final agqz b;

    agdd(agdb agdb, agqz agqz) {
        this.a = agdb;
        this.b = agqz;
    }

    public final void run() {
        agdb agdb = this.a;
        agqz agqz = this.b;
        String b = agxj.b(agqz.f);
        ((agfi) agdb.a.m.get()).a(b, agqz);
        agdt agdt = (agdt) agdb.a.q.get();
        agdb.a.l(b);
        if (agdt.a().contains(b)) {
            agdw b2 = agdt.b();
            if (b2.a(agqz)) {
                agdb.a.a(b2.b());
            }
        }
        agdz agdz = (agdz) agdb.a.r.get();
        if (agdz.a().contains(b)) {
            agec b3 = agdz.b();
            if (b3.a(agqz)) {
                agdb.a.a(b3.a());
            }
        }
    }
}
