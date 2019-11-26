package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;

/* renamed from: vzg */
public final class vzg implements OnLayoutChangeListener {
    private final /* synthetic */ SkipAdButton a;

    public vzg(SkipAdButton skipAdButton) {
        this.a = skipAdButton;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.g.removeOnLayoutChangeListener(this);
        SkipAdButton skipAdButton = this.a;
        if (abe.g(skipAdButton) == 0) {
            skipAdButton.g.setGravity(5);
        } else {
            skipAdButton.g.setGravity(3);
        }
        i = skipAdButton.g.getWidth();
        i2 = skipAdButton.e.getWidth();
        i3 = skipAdButton.g.getPaddingRight();
        skipAdButton.p = ValueAnimator.ofInt(new int[]{i, i2 + (i3 + i3)});
        skipAdButton.p.setDuration(500);
        skipAdButton.p.setStartDelay((long) skipAdButton.s);
        skipAdButton.p.addUpdateListener(new vzi(skipAdButton));
        skipAdButton.p.addListener(new vzh(skipAdButton));
        skipAdButton.p.start();
    }
}
