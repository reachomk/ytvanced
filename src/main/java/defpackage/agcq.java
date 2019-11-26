package defpackage;

/* renamed from: agcq */
final /* synthetic */ class agcq implements Runnable {
    private final agci a;
    private final String b;

    agcq(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        if (agci.j.v()) {
            agqy j = ((agfi) agci.m.get()).j(str);
            if (j != null && j.l()) {
                xak.b();
                agfi agfi = (agfi) agci.m.get();
                agqy j2 = agfi.j(str);
                agfi.a(str, agqf.ACTIVE);
                agci.b(str, null, j2.m);
                agci.l(str);
            }
        }
    }
}
