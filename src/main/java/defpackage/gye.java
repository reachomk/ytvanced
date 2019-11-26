package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gye */
final class gye implements OnGlobalLayoutListener {
    private final /* synthetic */ gyb a;

    gye(gyb gyb) {
        this.a = gyb;
    }

    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.a.ag.getWindowVisibleDisplayFrame(rect);
        int height = this.a.ag.getRootView().getHeight();
        double d = (double) (height - rect.bottom);
        double d2 = (double) height;
        Double.isNaN(d2);
        d2 *= 0.15d;
        boolean z = false;
        boolean z2 = d < d2;
        if (d >= d2) {
            z = true;
        }
        xpr.a(this.a.ab, z2);
        this.a.ad.c(z);
    }
}
