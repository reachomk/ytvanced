package defpackage;

/* renamed from: bvd */
final class bvd implements Runnable {
    private final cgf a;
    private final /* synthetic */ bve b;

    bvd(bve bve, cgf cgf) {
        this.b = bve;
        this.a = cgf;
    }

    public final void run() {
        synchronized (this.b) {
            if (this.b.a.a(this.a)) {
                this.b.b(this.a);
            }
            this.b.a();
        }
    }
}
