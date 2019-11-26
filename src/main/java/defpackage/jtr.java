package defpackage;

/* renamed from: jtr */
public final class jtr implements ejc, exv {
    private final ezq a;
    private final eif b;

    public jtr(eif eif, exu exu, ezq ezq) {
        this.a = ezq;
        this.b = eif;
        exu.a((exv) this);
        if (exu.a) {
            a();
        }
    }

    private final void c() {
        if (this.b.c().a()) {
            this.a.d();
        } else {
            this.a.c();
        }
    }

    public final void a() {
        c();
        this.b.a(this);
    }

    public final void b() {
        this.b.b(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        c();
    }
}
