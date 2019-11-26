package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ygo */
public final class ygo extends ValueAnimator {
    public boolean a;
    public final /* synthetic */ ygg b;

    public ygo(ygg ygg) {
        this.b = ygg;
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(300);
        addUpdateListener(new ygn(this));
        addListener(new ygq(this));
    }

    public final void start() {
        super.start();
        this.a = true;
    }
}
