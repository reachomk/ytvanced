package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: bgp */
final class bgp implements OnPreDrawListener {
    private final /* synthetic */ bgm a;

    bgp(bgm bgm) {
        this.a = bgm;
    }

    public final boolean onPreDraw() {
        abe.e(this.a);
        bgm bgm = this.a;
        ViewGroup viewGroup = bgm.a;
        if (viewGroup != null) {
            View view = bgm.b;
            if (view != null) {
                viewGroup.endViewTransition(view);
                abe.e(this.a.a);
                bgm = this.a;
                bgm.a = null;
                bgm.b = null;
            }
        }
        return true;
    }
}
