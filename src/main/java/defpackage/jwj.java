package defpackage;

/* renamed from: jwj */
public final class jwj extends ns implements exv {
    private final nt a;
    private ufe b;

    public jwj(nt ntVar) {
        this.a = ntVar;
    }

    public final void a() {
        this.a.a((ns) this);
    }

    public final void b() {
        c();
        this.b = null;
        this.a.b((ns) this);
    }

    public final void c(nf nfVar) {
        if (nfVar instanceof ufe) {
            c();
            this.b = (ufe) nfVar;
        }
    }

    private final void c() {
        ufe ufe = this.b;
        if (ufe != null && ufe.v()) {
            this.b.f();
        }
    }
}
