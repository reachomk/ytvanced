package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbn */
final class zbn extends AnimatorListenerAdapter {
    private final /* synthetic */ HeartView a;

    zbn(HeartView heartView) {
        this.a = heartView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
