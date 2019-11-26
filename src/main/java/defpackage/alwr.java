package defpackage;

/* renamed from: alwr */
final class alwr implements Runnable {
    private final /* synthetic */ alwl a;

    alwr(alwl alwl) {
        this.a = alwl;
    }

    public final void run() {
        alwl alwl = this.a;
        if (alwl.a) {
            alwl.i = alwl.m.b();
            ((alws) this.a.p.get()).a("Heartbeat", 0);
        }
    }
}
