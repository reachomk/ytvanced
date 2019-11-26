package defpackage;

/* renamed from: adec */
public final class adec implements adqi, sxi {
    private final adqf a;
    private final swm b;

    public adec(adqf adqf, swm swm) {
        this.a = adqf;
        this.b = swm;
    }

    public final void a(adqe adqe) {
    }

    public final void a() {
        this.a.a((adqi) this);
        a(this.a.c() != null);
    }

    public final void b() {
        this.a.b((adqi) this);
    }

    public final void b(adqe adqe) {
        a(true);
    }

    public final void c(adqe adqe) {
        a(false);
    }

    private final void a(boolean z) {
        aurd aurd = (aurd) aura.c.createBuilder();
        int i = !z ? 2 : 4;
        aurd.copyOnWrite();
        aura aura = (aura) aurd.instance;
        aura.a |= 1;
        aura.b = i - 1;
        this.b.a("/app/mdx", ((aura) ((anxl) aurd.build())).toByteArray());
    }
}
