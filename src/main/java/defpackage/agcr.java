package defpackage;

/* renamed from: agcr */
final /* synthetic */ class agcr implements Runnable {
    private final agci a;
    private final String b;

    agcr(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        if (agci.j.v()) {
            agci.b(str, 1);
        }
    }
}
