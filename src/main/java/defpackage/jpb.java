package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.support.design.appbar.AppBarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;

/* renamed from: jpb */
final class jpb implements ef {
    public final jov a;
    public int b = 0;
    public int c = 0;

    jpb(jov jov) {
        this.a = jov;
        jov.g.a((ec) this);
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        if (this.c != this.b && (this.a.f.getBackground() instanceof ColorDrawable)) {
            int i2;
            if (i >= 0) {
                i2 = this.b;
            } else {
                i2 = this.c;
            }
            this.a.f.setBackgroundColor(i2);
            boolean e = this.a.k.e();
            MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.a.j;
            boolean z = false;
            if (e && i >= 0) {
                z = true;
            }
            mainCollapsingToolbarLayout.a(z);
        }
    }
}
