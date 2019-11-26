package defpackage;

/* renamed from: agdf */
final /* synthetic */ class agdf implements Runnable {
    private final agdb a;
    private final agqz b;
    private final agqf c;

    agdf(agdb agdb, agqz agqz, agqf agqf) {
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
        if (agqf == agqf.COMPLETE) {
            agdb.a.m(b);
        } else {
            agdb.a.l(b);
        }
    }
}
