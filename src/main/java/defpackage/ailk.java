package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;

/* renamed from: ailk */
public final class ailk {
    public final TapBloomView a;
    private final int b = 650;
    private ValueAnimator c;

    public ailk(TapBloomView tapBloomView) {
        this.a = tapBloomView;
    }

    public final ValueAnimator a() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        this.c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.c.setDuration((long) this.b);
        this.c.addUpdateListener(new ailn(this));
        this.c.addListener(new ailm(this));
        return this.c;
    }
}
