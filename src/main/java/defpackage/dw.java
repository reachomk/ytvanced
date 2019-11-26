package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: dw */
public final class dw {
    public int a = 0;
    public int b = 1;
    private long c = 0;
    private long d = 300;
    private TimeInterpolator e = null;

    public dw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    private final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator == null ? dq.b : timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dw dwVar = (dw) obj;
            if (this.c == dwVar.c && this.d == dwVar.d && this.a == dwVar.a && this.b == dwVar.b) {
                return a().getClass().equals(dwVar.a().getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.c);
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.d);
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(a().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.b);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
