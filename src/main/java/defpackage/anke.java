package defpackage;

/* renamed from: anke */
final class anke implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ ankb b;

    anke(ankb ankb, Runnable runnable) {
        this.b = ankb;
        this.a = runnable;
    }

    public final void run() {
        this.b.a = false;
        this.a.run();
    }
}
