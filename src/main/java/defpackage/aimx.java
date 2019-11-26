package defpackage;

/* renamed from: aimx */
final /* synthetic */ class aimx implements Runnable {
    private final aimu a;
    private final ainj b;

    aimx(aimu aimu, ainj ainj) {
        this.a = aimu;
        this.b = ainj;
    }

    public final void run() {
        aimu aimu = this.a;
        ainj ainj = this.b;
        synchronized (aimu) {
            for (ainh a : aimu.b) {
                a.a(ainj);
            }
        }
    }
}
