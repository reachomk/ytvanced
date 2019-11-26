package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upo */
public final class upo extends AnimatorListenerAdapter {
    private final /* synthetic */ uov a;
    private final /* synthetic */ VideoTrimView b;

    public upo(VideoTrimView videoTrimView, uov uov) {
        this.b = videoTrimView;
        this.a = uov;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.a(this.a);
    }
}
