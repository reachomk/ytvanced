package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbp */
final class zbp extends AnimatorListenerAdapter {
    private final /* synthetic */ HeartView a;

    zbp(HeartView heartView) {
        this.a = heartView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
