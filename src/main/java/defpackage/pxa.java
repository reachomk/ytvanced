package defpackage;

/* renamed from: pxa */
public final class pxa extends pwv {
    private final puh b;

    public pxa(puh puh, ryl ryl) {
        super(4, ryl);
        this.b = puh;
    }

    public final /* bridge */ /* synthetic */ void a(puq puq, boolean z) {
    }

    public final void d(ptx ptx) {
        pwk pwk = (pwk) ptx.d.remove(this.b);
        if (pwk != null) {
            pwk.b.a(ptx.b, this.a);
            pwk.a.a.a();
            return;
        }
        this.a.b(Boolean.valueOf(false));
    }

    public final psc[] b(ptx ptx) {
        pwk pwk = (pwk) ptx.d.get(this.b);
        return null;
    }

    public final boolean c(ptx ptx) {
        ptx.d.get(this.b);
        return false;
    }
}
