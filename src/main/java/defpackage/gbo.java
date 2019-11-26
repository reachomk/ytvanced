package defpackage;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: gbo */
final class gbo implements ggb {
    private final View a;
    private final /* synthetic */ gbi b;

    gbo(gbi gbi, View view) {
        this.b = gbi;
        this.a = view;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final View a() {
        return this.a;
    }

    public final float b() {
        return this.a.getTranslationY();
    }

    public final float c() {
        if (!this.b.a()) {
            return 0.0f;
        }
        int b;
        gbi gbi = this.b;
        int i = 0;
        if (gbi.t) {
            b = gbi.d.b();
        } else if (gbi.u) {
            b = gbi.e.b();
        } else {
            xtl.c("getChooseFilterOpenHeight: No open ChooseFilterViews");
            b = 0;
        }
        gbi gbi2 = this.b;
        if (gbi2.a) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) gbi2.h.getLayoutParams();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
            i = gbi2.n - (i + ((gbi2.h.getHeight() - gbi2.m) / 2));
        }
        return (float) (-(b + i));
    }
}
