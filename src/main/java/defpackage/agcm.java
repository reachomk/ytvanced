package defpackage;

/* renamed from: agcm */
final /* synthetic */ class agcm implements Runnable {
    private final agci a;
    private final String b;

    agcm(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        xak.b();
        if (((agfi) agci.m.get()).s(str)) {
            agci.k(str);
            agci.h();
            return;
        }
        agci.a(str, 2);
    }
}
