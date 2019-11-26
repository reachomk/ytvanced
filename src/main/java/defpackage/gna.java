package defpackage;

/* renamed from: gna */
final /* synthetic */ class gna implements Runnable {
    private final gmp a;
    private final Runnable b;

    gna(gmp gmp, Runnable runnable) {
        this.a = gmp;
        this.b = runnable;
    }

    public final void run() {
        gmp gmp = this.a;
        Runnable runnable = this.b;
        gmp.ac().c.c();
        gmp.ac().c.a();
        runnable.run();
    }
}
