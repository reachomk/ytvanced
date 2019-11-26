package defpackage;

/* renamed from: agxw */
final /* synthetic */ class agxw implements Runnable {
    private final agxp a;
    private final agqz b;

    agxw(agxp agxp, agqz agqz) {
        this.a = agxp;
        this.b = agqz;
    }

    public final void run() {
        agxp agxp = this.a;
        agqz agqz = this.b;
        agxl agxl = agxp.a;
        agxl.b.put(agqz.a, agqz);
        for (agxk b : agxl.d) {
            b.b(agqz);
        }
    }
}
