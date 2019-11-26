package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: tss */
public final class tss extends Drawable implements tsp {
    private static final LinearInterpolator d = new LinearInterpolator();
    public boolean a;
    public float b;
    public Runnable c;
    private final ValueAnimator e;
    private final ValueAnimator f;
    private float g;
    private final RectF h = new RectF();
    private final Rect i = new Rect();
    private final int j;
    private final Paint k;
    private final int l;
    private final int m;
    private final float n;
    private final tsj o;
    private final tsl p;
    private int q = 255;

    public tss(int i, int i2, int i3) {
        this.l = i;
        this.n = -1.0f;
        this.m = i2;
        this.j = i3;
        String str = "alphaFraction";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(d);
        this.e = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, str, new float[]{1.0f, 0.0f});
        ofFloat2.addListener(new tsu(this));
        ofFloat2.setDuration(750);
        ofFloat2.setInterpolator(d);
        this.f = ofFloat2;
        this.k = new Paint();
        this.k.setStyle(Style.STROKE);
        this.k.setStrokeCap(Cap.SQUARE);
        this.k.setAntiAlias(true);
        this.a = false;
        this.b = (float) (getLevel() / 10000);
        this.o = new tsj();
        tsj tsj = this.o;
        double level = (double) getLevel();
        Double.isNaN(level);
        tsj.a(level / 10000.0d);
        tsj.b((double) this.b);
        tsj.a();
        tsj.a(new tsr(this));
        this.p = new tsl(this.o);
        setVisible(false, false);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void b() {
        c();
        if (this.e.isStarted()) {
            this.e.cancel();
        }
        if (this.f.isStarted()) {
            this.f.cancel();
        }
    }

    public final int getIntrinsicWidth() {
        float f = this.n;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        float f = this.n;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicHeight();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f.isRunning()) {
                this.e.setCurrentPlayTime(750 - this.f.getCurrentPlayTime());
                this.f.cancel();
            }
            if (z2) {
                b();
                this.e.start();
            } else {
                this.e.start();
            }
            this.c = null;
        } else if (z3) {
            if (this.e.isRunning()) {
                this.f.setCurrentPlayTime(750 - this.e.getCurrentPlayTime());
                this.e.cancel();
            }
            this.f.start();
        } else {
            b();
        }
        return z3;
    }

    public final void a(Runnable runnable) {
        this.c = runnable;
        setVisible(false, false);
    }

    public final void a() {
        this.a = false;
        if (super.setVisible(false, false)) {
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
            c();
        }
        this.c = null;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            Rect bounds;
            int centerX;
            if (this.n == -1.0f) {
                bounds = getBounds();
            } else {
                bounds = getBounds();
                centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.i.left = centerX - (getIntrinsicWidth() / 2);
                this.i.right = centerX + (getIntrinsicWidth() / 2);
                this.i.top = centerY - (getIntrinsicHeight() / 2);
                this.i.bottom = centerY + (getIntrinsicHeight() / 2);
                bounds = this.i;
            }
            centerX = this.l;
            float f = this.g;
            float f2 = ((float) centerX) * f;
            int i = (int) (((float) this.q) * f);
            float f3 = ((float) (this.m + centerX)) - (f2 / 2.0f);
            this.k.setStrokeWidth(f2);
            this.h.set(bounds);
            this.h.inset(f3, f3);
            float width = this.h.width();
            f3 = this.b;
            this.k.setColor(this.j);
            this.k.setAlpha((int) (((float) i) * 0.2f));
            canvas.drawOval(this.h, this.k);
            this.k.setAlpha(i);
            f3 *= 360.0f;
            double d = (double) ((width / 2.0f) - f2);
            Double.isNaN(d);
            d *= 3.141592653589793d;
            double d2 = (double) (f2 * 180.0f);
            Double.isNaN(d2);
            float max = Math.max(f3, (float) (d / d2));
            if (max >= 5.0f) {
                canvas.drawArc(this.h, -90.0f, max, false, this.k);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        tsj tsj = this.o;
        double d = (double) i;
        Double.isNaN(d);
        tsj.b(d / 10000.0d);
        this.p.a();
        return true;
    }

    public final void setAlpha(int i) {
        if (i != this.q) {
            this.q = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private final void c() {
        tsj tsj = this.o;
        double level = (double) getLevel();
        Double.isNaN(level);
        tsj.a(level / 10000.0d);
        this.p.b();
    }

    public final void setAlphaFraction(float f) {
        this.g = f;
        invalidateSelf();
    }

    public final float getAlphaFraction() {
        return this.g;
    }
}
