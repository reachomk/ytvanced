package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* renamed from: tst */
public final class tst extends Drawable implements Animatable, tsp {
    private static final LinearInterpolator m = new LinearInterpolator();
    private long A;
    private long B;
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public int f;
    public final int[] g;
    public int h;
    public boolean i;
    public Runnable j;
    private final RectF k = new RectF();
    private final Rect l = new Rect();
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final ArrayList s;
    private float t;
    private float u;
    private float v;
    private final Paint w;
    private int x;
    private final int y;
    private final float z;

    public tst(int i, int i2, int[] iArr) {
        this.h = i;
        this.z = -1.0f;
        this.y = i2;
        this.g = iArr;
        this.i = false;
        this.s = new ArrayList();
        ArrayList arrayList = this.s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1332);
        ofFloat.setInterpolator(m);
        this.n = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.s;
        r0 = new int[2];
        int[] iArr2 = this.g;
        r0[0] = iArr2[this.e];
        r0[1] = iArr2[b()];
        ofFloat = ObjectAnimator.ofInt(this, "currentColor", r0);
        ofFloat.setEvaluator(trz.a);
        ofFloat.setStartDelay(999);
        ofFloat.setDuration(333);
        ofFloat.setInterpolator(m);
        this.f = this.g[this.e];
        this.b = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.s;
        ofFloat = ObjectAnimator.ofFloat(this, "headFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(tsg.a);
        this.o = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.s;
        ofFloat = ObjectAnimator.ofFloat(this, "tailFraction", new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(666);
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(tsg.a);
        this.p = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.s;
        String str = "alphaFraction";
        ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{0.0f, 1.0f});
        ofFloat.addListener(new tsw(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(m);
        this.q = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.s;
        ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{1.0f, 0.0f});
        ofFloat.addListener(new tsv(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(m);
        this.r = ofFloat;
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{this.n, this.o, this.p, this.b});
        if (!ttg.a()) {
            tsb.a(animatorSet, new tsy(this));
        }
        this.a = animatorSet;
        this.w = new Paint();
        this.w.setStyle(Style.STROKE);
        this.w.setStrokeCap(Cap.SQUARE);
        this.w.setAntiAlias(true);
        this.x = 255;
        setVisible(false, false);
        c();
    }

    public final int getOpacity() {
        return -3;
    }

    private final void a(boolean z) {
        setVisible(z, true);
    }

    public final int getIntrinsicWidth() {
        float f = this.z;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        float f = this.z;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicHeight();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.i;
        if (!z3 && !z2) {
            return false;
        }
        this.i = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.r.isRunning()) {
                this.q.setCurrentPlayTime(750 - this.r.getCurrentPlayTime());
                this.r.cancel();
            }
            if (z2) {
                c();
                this.q.setStartDelay(0);
                this.q.start();
                this.A = 0;
            } else {
                long max = Math.max(0, this.A - (SystemClock.elapsedRealtime() - this.B));
                this.A = max;
                this.q.setStartDelay(max);
                this.q.start();
            }
            this.B = SystemClock.elapsedRealtime();
            this.j = null;
        } else if (z3) {
            if (this.q.isRunning()) {
                this.r.setCurrentPlayTime(750 - this.q.getCurrentPlayTime());
                this.q.cancel();
            }
            this.r.start();
        } else {
            c();
        }
        return z3;
    }

    public final void a(Runnable runnable) {
        this.j = runnable;
        stop();
    }

    public final void a() {
        stop();
        c();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            if (isVisible() || this.r.isRunning()) {
                Rect bounds;
                int centerX;
                if (this.z == -1.0f) {
                    bounds = getBounds();
                } else {
                    bounds = getBounds();
                    centerX = bounds.centerX();
                    int centerY = bounds.centerY();
                    this.l.left = centerX - (getIntrinsicWidth() / 2);
                    this.l.right = centerX + (getIntrinsicWidth() / 2);
                    this.l.top = centerY - (getIntrinsicHeight() / 2);
                    this.l.bottom = centerY + (getIntrinsicHeight() / 2);
                    bounds = this.l;
                }
                centerX = this.h;
                float f = this.v;
                float f2 = ((float) centerX) * f;
                int i = this.x;
                float f3 = ((float) (this.y + centerX)) - (f2 / 2.0f);
                this.w.setColor(this.f);
                this.w.setAlpha((int) (((float) i) * f));
                this.w.setStrokeWidth(f2);
                this.k.set(bounds);
                this.k.inset(f3, f3);
                float width = this.k.width();
                f3 = this.d * 290.0f;
                f = Math.abs((this.u * 290.0f) - f3);
                double d = (double) ((width / 2.0f) - f2);
                Double.isNaN(d);
                d *= 3.141592653589793d;
                double d2 = (double) (f2 * 180.0f);
                Double.isNaN(d2);
                float max = Math.max(f, (float) (d / d2));
                width = this.t;
                Canvas canvas2 = canvas;
                canvas2.drawArc(this.k, (f3 + (this.c + (width * 286.0f))) - 0.049804688f, max, false, this.w);
            }
        }
    }

    public final void setAlpha(int i) {
        if (i != this.x) {
            this.x = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int b() {
        return (this.e + 1) % this.g.length;
    }

    public final void c() {
        int i;
        super.setVisible(this.i, false);
        if (this.a.isStarted()) {
            this.a.cancel();
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        d();
        this.u = 0.0f;
        this.d = 0.0f;
        this.t = 0.0f;
        this.c = 0.0f;
        this.e = 0;
        this.f = this.g[0];
        this.b.setIntValues(new int[]{i, r2[b()]});
        this.v = 0.0f;
        invalidateSelf();
    }

    public final void d() {
        this.b.setStartDelay(999);
        this.p.setStartDelay(666);
    }

    public final void start() {
        a(true);
    }

    public final void stop() {
        a(false);
    }

    public final boolean isRunning() {
        return this.a.isRunning() || this.q.isRunning();
    }

    public final void setDetentFraction(float f) {
        this.t = f;
        invalidateSelf();
    }

    public final float getDetentFraction() {
        return this.t;
    }

    public final void setHeadFraction(float f) {
        this.u = f;
        invalidateSelf();
    }

    public final float getHeadFraction() {
        return this.u;
    }

    public final void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    public final float getTailFraction() {
        return this.d;
    }

    public final void setAlphaFraction(float f) {
        this.v = f;
        invalidateSelf();
    }

    public final float getAlphaFraction() {
        return this.v;
    }

    public final void setCurrentColor(int i) {
        this.f = i;
        invalidateSelf();
    }

    public final int getCurrentColor() {
        return this.f;
    }
}
