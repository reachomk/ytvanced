package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

/* renamed from: hjm */
final class hjm implements hjo {
    private final /* synthetic */ hja a;

    public final AnimatorSet a(View view, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        int i3 = i2;
        Animator a = this.a.h.a(view, i, i3, 400);
        this.a.h.a(view, i3, i, 400).setStartDelay(200);
        animatorSet.playSequentially(new Animator[]{a, r10});
        return animatorSet;
    }

    /* synthetic */ hjm(hja hja) {
        this.a = hja;
    }
}
