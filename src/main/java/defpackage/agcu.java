package defpackage;

/* renamed from: agcu */
final /* synthetic */ class agcu implements Runnable {
    private final agci a;
    private final String b;
    private final long c;

    agcu(agci agci, String str, long j) {
        this.a = agci;
        this.b = str;
        this.c = j;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        long j = this.c;
        if (agci.j.v()) {
            ((agfi) agci.m.get()).a(str, j);
        }
    }
}
