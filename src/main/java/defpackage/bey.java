package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: bey */
public final class bey implements AnimationListener {
    private final /* synthetic */ SwipeRefreshLayout a;

    public bey(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.d;
        swipeRefreshLayout.a(null);
    }
}
