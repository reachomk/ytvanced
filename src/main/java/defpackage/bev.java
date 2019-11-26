package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: bev */
public final class bev implements AnimationListener {
    private final /* synthetic */ SwipeRefreshLayout a;

    public bev(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout.b) {
            swipeRefreshLayout.i.setAlpha(255);
            this.a.i.start();
            swipeRefreshLayout = this.a;
            if (swipeRefreshLayout.j) {
                bfd bfd = swipeRefreshLayout.a;
                if (bfd != null) {
                    bfd.a();
                }
            }
            swipeRefreshLayout = this.a;
            swipeRefreshLayout.c = swipeRefreshLayout.e.getTop();
            return;
        }
        swipeRefreshLayout.a();
    }
}
