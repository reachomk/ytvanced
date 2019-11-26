package defpackage;

/* renamed from: agat */
final /* synthetic */ class agat implements Runnable {
    private final agak a;
    private final Runnable b;

    agat(agak agak, Runnable runnable) {
        this.a = agak;
        this.b = runnable;
    }

    public final void run() {
        agak agak = this.a;
        Runnable runnable = this.b;
        if (agak.e()) {
            runnable.run();
        }
    }
}
