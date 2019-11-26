package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.youtube.app.search.voice.MicrophoneView;

/* renamed from: iyi */
public final class iyi implements AnimationListener {
    private final /* synthetic */ MicrophoneView a;

    public iyi(MicrophoneView microphoneView) {
        this.a = microphoneView;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.a.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.b.setAlpha(0.0f);
        this.a.a();
    }
}
