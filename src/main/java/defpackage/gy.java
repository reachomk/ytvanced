package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: gy */
public final class gy {
    public final ArrayList a = new ArrayList();
    public ha b = null;
    public ValueAnimator c = null;
    private final AnimatorListener d = new hb(this);

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        ha haVar = new ha(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(haVar);
    }
}
