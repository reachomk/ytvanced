package defpackage;

/* renamed from: agaw */
final /* synthetic */ class agaw implements Runnable {
    private final agak a;
    private final Runnable b;

    agaw(agak agak, Runnable runnable) {
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
