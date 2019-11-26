package defpackage;

/* renamed from: gzn */
final class gzn implements Runnable {
    private final /* synthetic */ gzk a;

    gzn(gzk gzk) {
        this.a = gzk;
    }

    public final void run() {
        gzk gzk = this.a;
        if (gzk.c.compareAndSet(0, 1)) {
            gzk.a.addAll(gzk.b.a());
            gzk.c.compareAndSet(1, 2);
        }
    }
}
