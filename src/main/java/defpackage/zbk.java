package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbk */
final class zbk extends AnimatorListenerAdapter {
    private final /* synthetic */ HeartView a;

    zbk(HeartView heartView) {
        this.a = heartView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
