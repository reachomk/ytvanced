package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: ttb */
public final class ttb extends Drawable implements Animatable, tsp {
    public int a;
    public final AnimatorSet b;
    public boolean c;
    public Runnable d;
    private final int e;
    private final boolean f;
    private int g;
    private int h;
    private int i;
    private final Paint j;
    private final ObjectAnimator k;
    private final ObjectAnimator l;
    private final float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Rect u;

    public ttb(int i, int i2, float f) {
        this(i, i2, -1, f, false, 2);
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public ttb(int i, int i2, int i3, float f, boolean z, int i4) {
        this.a = i;
        this.h = i2;
        this.e = Math.round(f * 255.0f);
        this.f = z;
        this.i = i4;
        this.g = i3;
        float f2 = 1.0f;
        this.o = 1.0f;
        this.c = isVisible();
        this.j = new Paint();
        this.j.setStyle(Style.FILL);
        this.j.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "rect1ScaleX";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{0.1f, 0.1f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, str, new float[]{0.1f, 0.8268492f});
        ofFloat2.setInterpolator(acr.a(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, str, new float[]{0.8268492f, 0.1f});
        ofFloat3.setInterpolator(acr.a(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        ofFloat = ObjectAnimator.ofFloat(this, "rect1TranslationX", new float[]{-522.6f, 199.6f});
        ofFloat.setInterpolator(acr.a(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat.setStartDelay(400);
        ofFloat.setDuration(1600);
        animatorSet.play(ofFloat);
        str = "rect2ScaleX";
        ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{0.1f, 0.55f});
        ofFloat.setInterpolator(acr.a(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat.setDuration(352);
        ofFloat2 = ObjectAnimator.ofFloat(this, str, new float[]{0.55f, 0.90995026f});
        ofFloat2.setInterpolator(acr.a(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat2.setDuration(532);
        ofFloat3 = ObjectAnimator.ofFloat(this, str, new float[]{0.90995026f, 0.1f});
        ofFloat3.setInterpolator(acr.a(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat3.setDuration(1116);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        str = "rect2TranslationX";
        ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{-208.0f, 132.0f});
        ofFloat.setInterpolator(acr.a(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat.setDuration(964);
        ofFloat3 = ObjectAnimator.ofFloat(this, str, new float[]{132.0f, 422.6f});
        ofFloat3.setInterpolator(acr.a(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat3.setDuration(1036);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat3});
        animatorSet.addListener(new tte());
        if (!ttg.a()) {
            tsb.a(animatorSet, null);
        }
        this.b = animatorSet;
        this.m = 1.0f;
        if (i4 != 2) {
            f2 = 0.0f;
        }
        this.n = f2;
        String str2 = "growScale";
        this.k = ttc.a(this, str2);
        ObjectAnimator b = ttc.b(this, str2);
        b.addListener(new ttd(this));
        this.l = b;
        this.u = new Rect();
        b();
    }

    public final void b() {
        this.k.cancel();
        this.l.cancel();
        this.b.cancel();
        this.p = 0.1f;
        this.q = -522.6f;
        this.r = 0.1f;
        this.s = -197.6f;
        this.t = this.n;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.c;
        if (!z3 && !z2) {
            return false;
        }
        this.c = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
            }
            this.l.cancel();
            this.k.setFloatValues(new float[]{this.m});
            this.k.start();
            if (!this.b.isStarted()) {
                this.b.start();
            }
            this.d = null;
        } else if (z3) {
            this.k.cancel();
            this.l.setFloatValues(new float[]{this.n});
            this.l.start();
        }
        return z3;
    }

    public final void a(Runnable runnable) {
        this.d = runnable;
        stop();
    }

    public final void a() {
        this.c = false;
        if (super.setVisible(false, false)) {
            this.k.cancel();
            this.l.cancel();
            this.b.cancel();
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.d = null;
    }

    public final int getIntrinsicHeight() {
        return this.a;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.u)) {
            canvas.save();
            float height = (float) this.u.height();
            float f = (float) this.a;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) this.u.width()) / 360.0f, ((float) this.a) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.t < 1.0f) {
                if (this.i == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, ((this.t - 4.0f) * 4.0f) * 0.5f);
                canvas.scale(1.0f, this.t);
            }
            int i = this.g;
            if (i != -1) {
                this.j.setColor(i);
                this.j.setAlpha((int) (this.o * ((float) this.e)));
            } else {
                this.j.setColor(this.h);
                this.j.setAlpha((int) (this.o * ((float) this.e)));
            }
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.j);
            this.j.setColor(this.h);
            if (this.f) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.j.setAlpha((int) (this.o * 255.0f));
            canvas.save();
            canvas.translate(this.q, 0.0f);
            canvas.scale(this.p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.j);
            canvas.restore();
            canvas.save();
            canvas.translate(this.s, 0.0f);
            canvas.scale(this.r, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.j);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void setRect1ScaleX(float f) {
        this.p = f;
        invalidateSelf();
    }

    public final float getRect1ScaleX() {
        return this.p;
    }

    public final void setRect1TranslationX(float f) {
        this.q = f;
        invalidateSelf();
    }

    public final float getRect1TranslationX() {
        return this.q;
    }

    public final void setRect2ScaleX(float f) {
        this.r = f;
        invalidateSelf();
    }

    public final float getRect2ScaleX() {
        return this.r;
    }

    public final void setRect2TranslationX(float f) {
        this.s = f;
        invalidateSelf();
    }

    public final float getRect2TranslationX() {
        return this.s;
    }

    public final void setGrowScale(float f) {
        this.t = f;
        invalidateSelf();
    }

    public final float getGrowScale() {
        return this.t;
    }

    public final void start() {
        setVisible(true, true);
    }

    public final void stop() {
        setVisible(false, false);
    }

    public final boolean isRunning() {
        return isVisible();
    }

    public final void setAlpha(int i) {
        this.o = (float) i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
