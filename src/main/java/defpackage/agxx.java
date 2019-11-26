package defpackage;

/* renamed from: agxx */
final /* synthetic */ class agxx implements Runnable {
    private final agxp a;
    private final int b;
    private final boolean c;

    agxx(agxp agxp, int i, boolean z) {
        this.a = agxp;
        this.b = i;
        this.c = z;
    }

    public final void run() {
        agxp agxp = this.a;
        agxp.a.a(this.b, this.c);
    }
}
