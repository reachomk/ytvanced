package defpackage;

import android.content.Context;

/* renamed from: akmf */
public final class akmf extends brl {
    public akmf(bqy bqy, cew cew, cfe cfe, Context context) {
        super(bqy, cew, cfe, context);
    }

    private final synchronized akmf c(cgg cgg) {
        super.b(cgg);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cgg cgg) {
        if (cgg instanceof akma) {
            super.a(cgg);
        } else {
            super.a((akma) new akma().b((cfy) cgg));
        }
    }

    public final /* bridge */ /* synthetic */ brj e() {
        return (akmc) super.e();
    }

    public final /* bridge */ /* synthetic */ brj d() {
        return (akmc) super.d();
    }

    public final /* synthetic */ brl b(cgg cgg) {
        return c(cgg);
    }
}
