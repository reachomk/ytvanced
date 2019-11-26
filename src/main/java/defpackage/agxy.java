package defpackage;

/* renamed from: agxy */
final /* synthetic */ class agxy implements Runnable {
    private final agxp a;
    private final agqz b;
    private final agqf c;
    private final int d;

    agxy(agxp agxp, agqz agqz, int i, agqf agqf) {
        this.a = agxp;
        this.b = agqz;
        this.d = i;
        this.c = agqf;
    }

    public final void run() {
        agxp agxp = this.a;
        agxp.a.a(this.b, this.d, this.c);
    }
}
