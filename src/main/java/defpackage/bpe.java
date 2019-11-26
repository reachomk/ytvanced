package defpackage;

import android.animation.Animator.AnimatorListener;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: bpe */
public final class bpe extends bpa implements FrameCallback {
    public float b = 1.0f;
    public long c = 0;
    public float d = 0.0f;
    public int e = 0;
    public float f = -2.14748365E9f;
    public float g = 2.14748365E9f;
    public bjj h;
    public boolean i = false;
    private boolean j = false;

    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final float b() {
        bjj bjj = this.h;
        if (bjj == null) {
            return 0.0f;
        }
        float f = this.d;
        float f2 = bjj.i;
        return (f - f2) / (bjj.j - f2);
    }

    public final float getAnimatedFraction() {
        if (this.h == null) {
            return 0.0f;
        }
        float e;
        float e2;
        float d;
        if (c()) {
            e = e() - this.d;
            e2 = e();
            d = d();
        } else {
            e = this.d - d();
            e2 = e();
            d = d();
        }
        return e / (e2 - d);
    }

    public final long getDuration() {
        bjj bjj = this.h;
        return bjj != null ? (long) bjj.b() : 0;
    }

    public final boolean isRunning() {
        return this.i;
    }

    public final void doFrame(long j) {
        f();
        bjj bjj = this.h;
        if (bjj != null && this.i) {
            float abs = ((float) (j - this.c)) / ((1.0E9f / bjj.k) / Math.abs(this.b));
            float f = this.d;
            if (c()) {
                abs = -abs;
            }
            f += abs;
            this.d = f;
            boolean c = bpd.c(f, d(), e());
            this.d = bpd.b(this.d, d(), e());
            this.c = j;
            a();
            if ((c ^ 1) != 0) {
                if (getRepeatCount() == -1 || this.e < getRepeatCount()) {
                    for (AnimatorListener onAnimationRepeat : this.a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.e++;
                    if (getRepeatMode() == 2) {
                        this.j ^= 1;
                        h();
                    } else {
                        this.d = !c() ? d() : e();
                    }
                    this.c = j;
                } else {
                    this.d = e();
                    g();
                    a(c());
                }
            }
            if (this.h != null) {
                float f2 = this.d;
                if (f2 < this.f || f2 > this.g) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(r6), Float.valueOf(this.g), Float.valueOf(this.d)}));
                }
            }
        }
    }

    public final void a(int i) {
        float f = (float) i;
        if (this.d != f) {
            this.d = bpd.b(f, d(), e());
            this.c = System.nanoTime();
            a();
        }
    }

    public final void a(float f, float f2) {
        if (f <= f2) {
            float f3;
            bjj bjj = this.h;
            if (bjj == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = bjj.i;
            }
            float f4 = bjj != null ? bjj.j : Float.MAX_VALUE;
            this.f = bpd.b(f, f3, f4);
            this.g = bpd.b(f2, f3, f4);
            a((int) bpd.b(this.d, f, f2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    private final void h() {
        this.b = -this.b;
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.j) {
            this.j = false;
            h();
        }
    }

    public final void cancel() {
        for (AnimatorListener onAnimationCancel : this.a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        g();
    }

    public final boolean c() {
        return this.b < 0.0f;
    }

    public final float d() {
        bjj bjj = this.h;
        if (bjj == null) {
            return 0.0f;
        }
        float f = this.f;
        return f == -2.14748365E9f ? bjj.i : f;
    }

    public final float e() {
        bjj bjj = this.h;
        if (bjj == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == 2.14748365E9f ? bjj.j : f;
    }

    public final void f() {
        if (this.i) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void g() {
        b(true);
    }

    private final void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.i = false;
        }
    }
}
