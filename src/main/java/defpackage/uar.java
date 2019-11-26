package defpackage;

import android.content.Context;

/* renamed from: uar */
final class uar implements tzu {
    private static final uee a;
    private final Context b;

    uar(Context context) {
        this.b = context;
    }

    public final /* synthetic */ Object a() {
        uee.b(this.b);
        return (Boolean) a.c();
    }

    static {
        ueg a = new ueg("primes-ph").b("ShutdownFeature__").a("primes::").a();
        a = uee.a(new ueg(a.a, a.b, a.c, a.d, a.e, true, a.g, a.h, a.i), "shutdown_primes", false);
    }
}
