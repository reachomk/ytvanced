package defpackage;

/* renamed from: vjm */
final class vjm implements Runnable {
    private final /* synthetic */ vka a;
    private final /* synthetic */ vjn b;

    vjm(vjn vjn, vka vka) {
        this.b = vjn;
        this.a = vka;
    }

    public final void run() {
        vjn vjn = this.b;
        if (vjn.d.a.d(vjn.a) == null) {
            this.b.d.e.d(new vpc());
            ((vgz) this.b.d.h.get()).a(this.b.a, null, amul.g(), this.b.c, 0, 0, null);
            return;
        }
        vjn = this.b;
        vjn.d.a.h(vjn.a);
        ((waw) this.b.d.d.get()).a(this.a.c());
        vjn = this.b;
        vjn.d.a(vjn.b, vjn.a, vjn.c, this.a, true);
    }
}
