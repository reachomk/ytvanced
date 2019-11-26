package defpackage;

/* renamed from: agxv */
final /* synthetic */ class agxv implements Runnable {
    private final agxp a;
    private final agqz b;
    private final boolean c;

    agxv(agxp agxp, agqz agqz, boolean z) {
        this.a = agxp;
        this.b = agqz;
        this.c = z;
    }

    public final void run() {
        agxp agxp = this.a;
        agxp.a.a(this.b, this.c);
    }
}
