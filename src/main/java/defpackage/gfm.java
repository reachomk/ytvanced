package defpackage;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

/* renamed from: gfm */
public final class gfm implements zip {
    public boolean a = false;
    private final TextView b;
    private final View c;
    private final gfn d;

    public gfm(TextView textView, View view, gfn gfn) {
        this.b = textView;
        this.c = view;
        this.d = gfn;
    }

    public final void a(float f, float f2) {
    }

    public final void am() {
    }

    public final void an() {
    }

    public final void c(float f) {
    }

    public final void d(int i) {
        if (this.a) {
            this.a = false;
        } else if (this.d.av()) {
            if (i == 3) {
                this.d.a(3, this.b, gfm.b((float) (-this.c.getWidth()), this.b.getTranslationX()));
            } else if (i == 1) {
                this.d.a(1, this.b, gfm.b((float) this.c.getWidth(), this.b.getTranslationX()));
            }
        }
    }

    private static AnimationSet b(float f, float f2) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setStartOffset(500);
        alphaAnimation.setDuration(5);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }
}
