package defpackage;

import android.app.Activity;

/* renamed from: fyc */
final /* synthetic */ class fyc implements bbnp {
    private final fxx a;
    private final aopd b;

    fyc(fxx fxx, aopd aopd) {
        this.a = fxx;
        this.b = aopd;
    }

    public final void a() {
        fxx fxx = this.a;
        aopd aopd = this.b;
        try {
            fxx.b.a((Activity) fxx.a, fxx.b.a((Activity) fxx.a, aopd.b, aopd.c, true), aopd.c, true, aopd.f);
        } catch (Exception e) {
            xtl.a("Failed to preload checkout page.", e);
        }
    }
}
