package defpackage;

/* renamed from: agcg */
final /* synthetic */ class agcg implements Runnable {
    private final agce a;
    private final String b;

    agcg(agce agce, String str) {
        this.a = agce;
        this.b = str;
    }

    public final void run() {
        agce agce = this.a;
        String str = this.b;
        if (agce.i.v()) {
            agce.a(str, true);
        }
    }
}
