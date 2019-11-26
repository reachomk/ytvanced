package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwq */
public abstract class lwq extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    private final /* synthetic */ WatchWhileLayout a;
    public final ValueAnimator f = new ValueAnimator();
    public boolean g;

    public lwq(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
        this.f.setInterpolator(new eyv());
        this.f.addListener(this);
        this.f.addUpdateListener(this);
        this.g = true;
    }

    public final void b() {
        this.g = false;
        WatchWhileLayout watchWhileLayout = this.a;
        if (watchWhileLayout.i != this) {
            watchWhileLayout.j();
            watchWhileLayout.i = this;
        }
        this.f.start();
        this.a.k.a();
        this.a.g();
    }

    public static int a(int i, int i2, int i3, boolean z) {
        i = Math.abs(i);
        if (i == i2) {
            return i3;
        }
        i = WatchWhileLayout.a(((float) i) / ((float) i2), 0, i3);
        if (z) {
            i = (int) (((float) i) * 0.75f);
        }
        return Math.max(i, 50);
    }

    public final void onAnimationCancel(Animator animator) {
        this.g = true;
    }

    public void onAnimationEnd(Animator animator) {
        this.g = true;
    }
}
