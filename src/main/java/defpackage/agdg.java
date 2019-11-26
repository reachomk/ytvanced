package defpackage;

/* renamed from: agdg */
final /* synthetic */ class agdg implements Runnable {
    private final agdb a;
    private final agqz b;
    private final agqf c;

    agdg(agdb agdb, agqz agqz, agqf agqf) {
        this.a = agdb;
        this.b = agqz;
        this.c = agqf;
    }

    public final void run() {
        agdb agdb = this.a;
        agqz agqz = this.b;
        agqf agqf = this.c;
        String b = agxj.b(agqz.f);
        agfi agfi = (agfi) agdb.a.m.get();
        agfi.a(b, agqz);
        agfi.a(b, agqf);
        if (agqz.b != agrc.COMPLETED) {
            if (agqz.b == agrc.RUNNING) {
                ((agrq) agdb.a.g.get()).d(b);
            }
            agdb.a.l(b);
        } else if (agqf == agqf.COMPLETE) {
            agfi.a(agfi.a(b));
            agdb.a.m(b);
        } else if (agqf == agqf.REQUIRES_CONTENT_VERIFICATION) {
            byte[] f;
            if (agxj.f(agqz.f) != null) {
                f = agxj.f(agqz.f);
            } else {
                f = zzp.b;
            }
            byte[] bArr = f;
            agdb.a.l(b);
            agci agci = agdb.a;
            agci.j.a(new agcy(agci, b, bArr, agxj.m(agqz.f), agxj.z(agqz.f), agxj.E(agqz.f)));
        }
        agdt agdt = (agdt) agdb.a.q.get();
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
