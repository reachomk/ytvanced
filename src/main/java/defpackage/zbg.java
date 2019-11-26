package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbg */
public final /* synthetic */ class zbg implements amro {
    private final HeartView a;

    public zbg(HeartView heartView) {
        this.a = heartView;
    }

    public final Object get() {
        HeartView heartView = this.a;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        new AnimatorSet().playTogether(new Animator[]{HeartView.a(heartView.g, 0.88f, 1.0f, 267), HeartView.a(heartView.g, heartView.a, heartView.b, 400)});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{HeartView.a(heartView.g, 1.0f, 0.88f, 100), r5});
        animatorArr[0] = animatorSet2;
        Animator a = HeartView.a(heartView.h, 1.0f, 0.88f, 100);
        Animator b = HeartView.b(heartView.h, 0.0f, 0.5f, 100);
        new AnimatorSet().playTogether(new Animator[]{a, b});
        a = HeartView.a(heartView.h, 0.88f, 1.0f, 267);
        Animator b2 = HeartView.b(heartView.h, 0.5f, 0.0f, 400);
        new AnimatorSet().playTogether(new Animator[]{a, b2});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{r8, r10});
        animatorArr[1] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new zbn(heartView));
        return animatorSet;
    }
}
