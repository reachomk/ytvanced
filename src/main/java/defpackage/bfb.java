package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: bfb */
public final class bfb extends Animation {
    private final /* synthetic */ SwipeRefreshLayout a;

    public bfb(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.k;
        int i = swipeRefreshLayout.h;
        int abs = Math.abs(swipeRefreshLayout.g);
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        int i2 = swipeRefreshLayout2.f;
        this.a.b((i2 + ((int) (((float) ((i - abs) - i2)) * f))) - swipeRefreshLayout2.e.getTop());
        this.a.i.a(1.0f - f);
    }
}
