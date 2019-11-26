package defpackage;

import android.view.View;

/* renamed from: aes */
final class aes extends abv {
    private final /* synthetic */ aek a;

    aes(aek aek) {
        this.a = aek;
    }

    public final void a() {
        this.a.f.setVisibility(0);
        this.a.f.sendAccessibilityEvent(32);
        if (this.a.f.getParent() instanceof View) {
            abe.u((View) this.a.f.getParent());
        }
    }

    public final void a(View view) {
        this.a.f.setAlpha(1.0f);
        this.a.i.a(null);
        this.a.i = null;
    }
}
