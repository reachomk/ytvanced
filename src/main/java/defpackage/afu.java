package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* renamed from: afu */
final class afu extends abv {
    private final /* synthetic */ afv a;

    afu(afv afv) {
        this.a = afv;
    }

    public final void a(View view) {
        afv afv = this.a;
        if (afv.j) {
            view = afv.f;
            if (view != null) {
                view.setTranslationY(0.0f);
                this.a.c.setTranslationY(0.0f);
            }
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        afv = this.a;
        afv.m = null;
        ahu ahu = afv.i;
        if (ahu != null) {
            ahu.a(afv.h);
            afv.h = null;
            afv.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            abe.u(actionBarOverlayLayout);
        }
    }
}
