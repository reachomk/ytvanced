package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.support.design.snackbar.BaseTransientBottomBar.Behavior;
import android.view.ViewGroup.LayoutParams;

/* renamed from: io */
public final class io implements Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar.e.getParent() == null) {
                LayoutParams layoutParams = baseTransientBottomBar.e.getLayoutParams();
                if (layoutParams instanceof auy) {
                    auy auy = (auy) layoutParams;
                    aux behavior = new Behavior();
                    behavior.g.a = baseTransientBottomBar.i;
                    behavior.b = new ix(baseTransientBottomBar);
                    auy.a(behavior);
                    auy.g = 80;
                }
                baseTransientBottomBar.a();
                baseTransientBottomBar.c.addView(baseTransientBottomBar.e);
            }
            baseTransientBottomBar.e.b = new ja(baseTransientBottomBar);
            if (!abe.D(baseTransientBottomBar.e)) {
                baseTransientBottomBar.e.a = new jc(baseTransientBottomBar);
            } else if (baseTransientBottomBar.i()) {
                baseTransientBottomBar.e();
            } else {
                baseTransientBottomBar.g();
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            ValueAnimator valueAnimator;
            if (!baseTransientBottomBar2.i() || baseTransientBottomBar2.e.getVisibility() != 0) {
                baseTransientBottomBar2.h();
            } else if (baseTransientBottomBar2.e.c != 1) {
                valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[]{0, baseTransientBottomBar2.f()});
                valueAnimator.setInterpolator(dq.b);
                valueAnimator.setDuration(250);
                valueAnimator.addListener(new iu(baseTransientBottomBar2));
                valueAnimator.addUpdateListener(new it(baseTransientBottomBar2));
                valueAnimator.start();
            } else {
                valueAnimator = baseTransientBottomBar2.a(1.0f, 0.0f);
                valueAnimator.setDuration(75);
                valueAnimator.addListener(new jd(baseTransientBottomBar2));
                valueAnimator.start();
            }
            return true;
        }
    }
}
