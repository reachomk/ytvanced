package defpackage;

/* renamed from: pwy */
public final class pwy extends pwv {
    private final pul b;
    private final pur c;

    public pwy(pwk pwk, ryl ryl) {
        super(3, ryl);
        this.b = pwk.a;
        this.c = pwk.b;
    }

    public final /* bridge */ /* synthetic */ void a(puq puq, boolean z) {
    }

    public final psc[] b(ptx ptx) {
        return null;
    }

    public final boolean c(ptx ptx) {
        return false;
    }

    public final void d(ptx ptx) {
        this.b.a(ptx.b, this.a);
        if (this.b.a() != null) {
            ptx.d.put(this.b.a(), new pwk(this.b, this.c));
        }
    }
}
