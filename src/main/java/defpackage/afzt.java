package defpackage;

/* renamed from: afzt */
final /* synthetic */ class afzt implements Runnable {
    private final afzs a;
    private final String b;

    afzt(afzs afzs, String str) {
        this.a = afzs;
        this.b = str;
    }

    public final void run() {
        afzs afzs = this.a;
        String str = this.b;
        if (afzs.i.v() && afzs.f(str) != null) {
            xak.b();
            agxq agxq = (agxq) afzs.f.b(afzs.b);
            if (agxq != null && afzs.d.equals(agxq.b())) {
                for (agqz agqz : agxq.a().values()) {
                    if (str.equals(agxj.c(agqz.f)) && agxj.p(agqz.f) && agqz.b()) {
                        String b = agxj.b(agqz.f);
                        ((agdo) afzs.n.get()).a(b);
                        ((agdo) afzs.n.get()).b(b);
                        afzs.u.put(b, agqf.STREAM_DOWNLOAD_PENDING);
                    }
                }
            }
        }
    }
}
