package defpackage;

/* renamed from: agcs */
final /* synthetic */ class agcs implements Runnable {
    private final agci a;
    private final String b;

    agcs(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        if (agci.j.v()) {
            agci.b(str, 2);
        }
    }
}
