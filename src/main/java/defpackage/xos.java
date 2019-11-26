package defpackage;

import android.app.ActionBar;
import android.graphics.Rect;

/* renamed from: xos */
final /* synthetic */ class xos implements xnw {
    private final xot a;

    xos(xot xot) {
        this.a = xot;
    }

    public final Rect a(Rect rect) {
        xot xot = this.a;
        if (xot.d.f) {
            boolean hasFeature = xot.c.hasFeature(9);
            ActionBar actionBar = xot.i;
            Object obj = null;
            if (!(actionBar == null || actionBar.isShowing())) {
                obj = 1;
            }
            if (hasFeature && obj != null) {
                rect.top -= xot.j;
            }
        }
        Rect rect2 = new Rect();
        if (xot.f()) {
            rect2.set(rect);
        }
        return rect2;
    }
}
