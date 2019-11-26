package defpackage;

/* renamed from: agno */
public final class agno {
    public final azqf a;
    public final long b;
    public final amul c;
    public azqj d;
    public amqp e;
    private final boolean f;

    public agno(azqp azqp) {
        azqf azqf = azqp.b;
        if (azqf == null) {
            azqf = azqf.d;
        }
        this.a = azqf;
        azqj azqj = azqp.c;
        if (azqj == null) {
            azqj = azqj.b;
        }
        this.d = azqj;
        Object obj = azqp.d;
        if (obj == null) {
            obj = azqb.b;
        }
        this.e = amqp.c(obj);
        this.f = azqp.f;
        this.b = azqp.g;
        amuo j = amul.j();
        for (azqr agnl : azqp.e) {
            j.c(new agnl(agnl));
        }
        this.c = j.a();
    }

    public final void a(azqb azqb) {
        this.e = amqp.b(azqb);
    }

    public final azqp a() {
        azqo azqo = (azqo) azqp.h.createBuilder();
        azqo.a(this.a);
        azqo.a(this.d);
        azqo.a(this.f);
        azqo.a(this.b);
        azqo.build();
        if (this.e.a()) {
            azqo.a((azqb) this.e.b());
        }
        amxn amxn = (amxn) this.c.listIterator();
        while (amxn.hasNext()) {
            azqr a = ((agnl) amxn.next()).a();
            azqo.copyOnWrite();
            azqp azqp = (azqp) azqo.instance;
            if (a != null) {
                azqp.a();
                azqp.e.add(a);
            } else {
                throw new NullPointerException();
            }
        }
        return (azqp) ((anxl) azqo.build());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agno)) {
            return false;
        }
        return a().equals(((agno) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
