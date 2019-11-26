package defpackage;

/* renamed from: bvg */
final class bvg implements Runnable {
    private final cgf a;
    private final /* synthetic */ bve b;

    bvg(bve bve, cgf cgf) {
        this.b = bve;
        this.a = cgf;
    }

    public final void run() {
        synchronized (this.b) {
            if (this.b.a.a(this.a)) {
                this.b.c.e();
                this.b.a(this.a);
                this.b.c(this.a);
            }
            this.b.a();
        }
    }
}
