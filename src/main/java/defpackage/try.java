package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: try */
public class try extends AnimatorListenerAdapter {
    private final aac a = new aac();

    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, Boolean.valueOf(false));
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, Boolean.valueOf(true));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }
}
