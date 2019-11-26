package defpackage;

/* renamed from: agxu */
final /* synthetic */ class agxu implements Runnable {
    private final agxp a;
    private final agqz b;

    agxu(agxp agxp, agqz agqz) {
        this.a = agxp;
        this.b = agqz;
    }

    public final void run() {
        agxp agxp = this.a;
        agqz agqz = this.b;
        agxl agxl = agxp.a;
        agxl.b.put(agqz.a, agqz);
        for (agxk c : agxl.d) {
            c.c(agqz);
        }
    }
}
