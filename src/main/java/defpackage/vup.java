package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vup */
public final class vup implements vug {
    private final Executor a;
    private final afti b;
    private final afqv c;
    private final afqv d;
    private final vrk e;
    private final xsc f;

    public vup(Executor executor, afti afti, afqv afqv, afqv afqv2, vrk vrk, xsc xsc) {
        this.a = executor;
        this.b = afti;
        this.c = afqv;
        this.d = afqv2;
        this.e = vrk;
        this.f = xsc;
    }

    public final vuh a(vtl vtl) {
        return new vul(this.a, this.b, b(vtl), null, this.e);
    }

    public final vuh a(aage aage) {
        return new vul(this.a, this.b, b(null), aage, this.e);
    }

    public final vuh a(vtl vtl, aage aage) {
        return new vul(this.a, this.b, b(vtl), aage, this.e);
    }

    private final vui b(vtl vtl) {
        if (vtl != null) {
            vtl.bc_();
        }
        return new vui(this.c, this.d, this.f);
    }
}
