package defpackage;

/* renamed from: bbto */
final class bbto implements bbmo {
    public final bboe a;
    public final bbmo b;
    private boolean c;
    private final /* synthetic */ bbtl d;

    bbto(bbtl bbtl, bboe bboe, bbmo bbmo) {
        this.d = bbtl;
        this.a = bboe;
        this.b = bbmo;
    }

    public final void a(bbnc bbnc) {
        bbnz.a(this.a, bbnc);
    }

    public final void b_(Object obj) {
        a();
    }

    public final void a(Throwable th) {
        if (this.c) {
            bbzf.a(th);
            return;
        }
        this.c = true;
        this.b.a(th);
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            this.d.a.b(new bbtn(this));
        }
    }
}
