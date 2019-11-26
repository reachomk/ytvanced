package defpackage;

/* renamed from: bbmq */
final class bbmq implements bbnc, Runnable {
    private final Runnable a;
    private final bbmp b;
    private Thread c;

    bbmq(Runnable runnable, bbmp bbmp) {
        this.a = runnable;
        this.b = bbmp;
    }

    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            bK_();
            this.c = null;
        }
    }

    public final void bK_() {
        if (this.c == Thread.currentThread()) {
            bbmp bbmp = this.b;
            if (bbmp instanceof bbxt) {
                bbxt bbxt = (bbxt) bbmp;
                if (!bbxt.c) {
                    bbxt.c = true;
                    bbxt.b.shutdown();
                }
                return;
            }
        }
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }
}
