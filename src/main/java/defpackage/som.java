package defpackage;

/* renamed from: som */
final class som extends bbzd {
    public final Object a = new Object();
    public volatile boolean b;
    private final sol c;
    private final bbnr d;
    private final sxd e;
    private volatile cma f;

    som(sol sol, bbnr bbnr, sxd sxd) {
        this.c = sol;
        this.d = bbnr;
        this.e = sxd;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
        throw bbyw.a(th);
    }

    public final cma b() {
        cma cma;
        synchronized (this.a) {
            cma = this.f;
        }
        return cma;
    }

    public final /* synthetic */ void b_(Object obj) {
        soo soo = (soo) obj;
        if (!c()) {
            cma cma = soo.a;
            if (cma == null) {
                try {
                    cma = (cma) this.d.a(soo.b, soo.c);
                } catch (Exception e) {
                    this.e.b(4, "Error materializing Component", e);
                }
            }
            if (cma != null) {
                synchronized (this.a) {
                    this.f = cma;
                    if (this.b && !c()) {
                        this.c.a(soo.c);
                    }
                }
            }
        }
    }
}
