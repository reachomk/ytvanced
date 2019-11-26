package defpackage;

/* renamed from: vjp */
final class vjp implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ vka b;
    private final /* synthetic */ vjq c;
    private final /* synthetic */ viz d;

    vjp(viz viz, String str, vka vka, vjq vjq) {
        this.d = viz;
        this.a = str;
        this.b = vka;
        this.c = vjq;
    }

    public final void run() {
        if (!wcf.c(this.d.g)) {
            this.d.b.a(this.b);
        }
        if (this.d.b.f(this.b.a)) {
            ((waw) this.d.d.get()).a(this.b.c());
            viz viz = this.d;
            viz.e.d(new vpc());
            ((waw) this.d.d.get()).f();
            this.c.a(false);
        } else if (this.d.a.a(this.b) == null) {
            this.d.e.d(new vpc());
            this.c.a(false);
        } else {
            this.c.a(true);
        }
    }
}
