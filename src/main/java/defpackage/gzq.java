package defpackage;

/* renamed from: gzq */
final class gzq implements Runnable {
    private final /* synthetic */ gzr a;

    gzq(gzr gzr) {
        this.a = gzr;
    }

    public final void run() {
        gzr gzr = this.a;
        if (gzr.c.compareAndSet(0, 1)) {
            gzr.a.addAll(gzr.b.a());
            gzr.c.compareAndSet(1, 2);
        }
    }
}
