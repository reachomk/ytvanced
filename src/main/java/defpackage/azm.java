package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import java.util.Set;

/* renamed from: azm */
final class azm implements OnGlobalLayoutListener {
    private final /* synthetic */ azl a;

    azm(azl azl) {
        this.a = azl;
    }

    public final void onGlobalLayout() {
        this.a.m.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        azl azl = this.a;
        Set set = azl.p;
        if (set == null || set.size() == 0) {
            azl.e(true);
            return;
        }
        azp azp = new azp(azl);
        int firstVisiblePosition = azl.m.getFirstVisiblePosition();
        Object obj = null;
        for (int i = 0; i < azl.m.getChildCount(); i++) {
            View childAt = azl.m.getChildAt(i);
            if (azl.p.contains((bbs) azl.n.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) azl.Q);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (obj == null) {
                    alphaAnimation.setAnimationListener(azp);
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
                obj = 1;
            }
        }
    }
}
