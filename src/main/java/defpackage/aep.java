package defpackage;

import android.view.View;

/* renamed from: aep */
final class aep implements aba {
    private final /* synthetic */ aek a;

    aep(aek aek) {
        this.a = aek;
    }

    public final abx a(View view, abx abx) {
        int b = abx.b();
        int g = this.a.g(b);
        if (b != g) {
            abx = abx.a(abx.a(), g, abx.c(), abx.d());
        }
        return abe.a(view, abx);
    }
}
