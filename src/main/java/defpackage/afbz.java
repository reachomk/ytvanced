package defpackage;

/* renamed from: afbz */
final /* synthetic */ class afbz implements Runnable {
    private final afbo a;
    private final int b;
    private final Runnable c;

    afbz(afbo afbo, int i, Runnable runnable) {
        this.a = afbo;
        this.b = i;
        this.c = runnable;
    }

    public final void run() {
        afbo afbo = this.a;
        int i = this.b;
        Runnable runnable = this.c;
        if (afbo.F() == i) {
            runnable.run();
        }
    }
}
