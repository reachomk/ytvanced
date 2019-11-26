package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.mediarouter.app.OverlayListView;

/* renamed from: azx */
final class azx implements AnimationListener {
    private final /* synthetic */ azl a;

    azx(azl azl) {
        this.a = azl;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        OverlayListView overlayListView = this.a.m;
        for (bak bak : overlayListView.a) {
            if (!bak.k) {
                bak.j = overlayListView.getDrawingTime();
                bak.k = true;
            }
        }
        azl azl = this.a;
        azl.m.postDelayed(azl.U, (long) azl.P);
    }
}
