package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/* renamed from: jph */
final class jph extends AnimatorListenerAdapter {
    private final /* synthetic */ ImageView a;
    private final /* synthetic */ View b;
    private final /* synthetic */ apxu c;
    private final /* synthetic */ jpe d;

    jph(jpe jpe, ImageView imageView, View view, apxu apxu) {
        this.d = jpe;
        this.a = imageView;
        this.b = view;
        this.c = apxu;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.d.b(this.b, this.c);
        View view = this.b;
        jpe jpe = this.d;
        if (jpe.a == null) {
            jpe.a = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.0f, 1, 1.0f);
            jpe.a.setDuration(250);
            jpe.a.setInterpolator(jpe.b);
        }
        view.setAnimation(jpe.a);
    }
}
