package defpackage;

/* renamed from: agcn */
final /* synthetic */ class agcn implements Runnable {
    private final agci a;
    private final String b;

    agcn(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        if (agci.j.v()) {
            agqy j = ((agfi) agci.m.get()).j(str);
            if (j != null && j.j()) {
                xak.b();
                ((agfi) agci.m.get()).a(str, agqf.PAUSED);
                agdo agdo = (agdo) agci.n.get();
                xak.b();
                ((agxq) agdo.d.b(agdo.a)).a(agdo.e(str), 128);
                ((agxq) agdo.d.b(agdo.a)).a(agdo.c(str), 128);
                agci.l(str);
            }
        }
    }
}
