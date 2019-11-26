package defpackage;

/* renamed from: agxt */
final /* synthetic */ class agxt implements Runnable {
    private final agxp a;
    private final agqz b;

    agxt(agxp agxp, agqz agqz) {
        this.a = agxp;
        this.b = agqz;
    }

    public final void run() {
        agxp agxp = this.a;
        agxp.a.b(this.b);
    }
}
