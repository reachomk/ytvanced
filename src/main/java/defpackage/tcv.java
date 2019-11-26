package defpackage;

/* renamed from: tcv */
final class tcv implements tcb {
    private final pkr a;

    tcv(pkr pkr) {
        this.a = pkr;
    }

    public final tcb a(String str) {
        this.a.a = str;
        return this;
    }

    public final tcb a() {
        this.a.c = false;
        return this;
    }

    public final tcb a(tbs tbs) {
        this.a.d = ((tdr) tbs).a;
        return this;
    }

    public final tcb b() {
        this.a.e = false;
        return this;
    }

    public final tcb a(tbx tbx) {
        this.a.f = ((tcq) tbx).a;
        return this;
    }

    public final tcb c() {
        this.a.g = false;
        return this;
    }

    public final tcc d() {
        pkr pkr = this.a;
        return new tcu(new pko(pkr.a, pkr.b, false, pkr.d, pkr.e, pkr.f, pkr.g, pkr.h, false));
    }
}
