package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbh */
public final /* synthetic */ class zbh implements amro {
    private final HeartView a;

    public zbh(HeartView heartView) {
        this.a = heartView;
    }

    public final Object get() {
        HeartView heartView = this.a;
        AnimatorSet animatorSet = new AnimatorSet();
        r11 = new Animator[3];
        new AnimatorSet().playSequentially(new Animator[]{heartView.a(1.0f, 1.64f, 200, 0.72f, 0.11f), heartView.a(1.64f, 1.64f, 267, 1.0f, 1.0f), heartView.a(1.64f, 1.0f, 333, 0.49f, 0.6f)});
        new AnimatorSet().playSequentially(new Animator[]{heartView.b(0.0f, -8.0f, 200, 0.72f, 0.08f), heartView.b(-8.0f, 4.0f, 267, 0.64f, 0.33f), heartView.b(4.0f, 0.0f, 300, 0.16f, 0.56f), heartView.b(0.0f, -3.0f, 167, 0.33f, 0.18f), heartView.b(-3.0f, 0.8f, 167, 0.34f, 0.43f), heartView.b(0.8f, 0.0f, 133, 0.52f, 0.35f)});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{r12, r13});
        animatorSet2.setStartDelay(100);
        r11[0] = animatorSet2;
        new AnimatorSet().playTogether(new Animator[]{HeartView.a(heartView.g, 0.88f, 1.0f, 267), HeartView.a(heartView.g, heartView.b, heartView.a, 400)});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{HeartView.a(heartView.g, 1.0f, 0.88f, 100), animatorSet2});
        r11[1] = animatorSet3;
        animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{HeartView.a(heartView.h, 1.0f, 0.88f, 100), HeartView.b(heartView.h, 0.0f, 0.5f, 100)});
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{HeartView.a(heartView.h, 0.88f, 1.0f, 267), HeartView.b(heartView.h, 0.5f, 0.0f, 400)});
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(new Animator[]{animatorSet2, animatorSet4});
        r11[2] = animatorSet5;
        animatorSet.playTogether(r11);
        animatorSet.addListener(new zbk(heartView));
        return animatorSet;
    }
}
