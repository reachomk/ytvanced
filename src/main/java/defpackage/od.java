package defpackage;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: od */
final class od {
    public final Animation a;
    public final Animator b;

    od(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    od(Animator animator) {
        this.a = null;
        this.b = animator;
    }
}
