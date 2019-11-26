package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: tsx */
public final class tsx extends Drawable implements tsp {
    public boolean a;
    public double b;
    public Runnable c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Paint i;
    private final tsj j;
    private final tsl k;
    private final ObjectAnimator l;
    private final ObjectAnimator m;
    private final float n;
    private final float o;
    private float p;
    private float q;
    private final tsi r = new tsz(this);

    public tsx(int i, int i2, int i3, float f, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.d = Math.round(f * 255.0f);
        this.h = i4;
        this.i = new Paint();
        this.i.setStyle(Style.FILL);
        this.i.setAntiAlias(true);
        float f2 = 1.0f;
        this.p = 1.0f;
        this.a = isVisible();
        this.q = 0.0f;
        double level = (double) getLevel();
        Double.isNaN(level);
        this.b = level / 10000.0d;
        this.n = 1.0f;
        if (i4 != 2) {
            f2 = 0.0f;
        }
        this.o = f2;
        this.j = new tsj();
        tsj tsj = this.j;
        double level2 = (double) getLevel();
        Double.isNaN(level2);
        tsj.a(level2 / 10000.0d);
        tsj.b(this.b);
        tsj.a();
        tsj.a(this.r);
        this.k = new tsl(this.j);
        String str = "growScale";
        this.l = ttc.a(this, str);
        ObjectAnimator b = ttc.b(this, str);
        b.addListener(new tta(this));
        this.m = b;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.e;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
                this.l.cancel();
                this.m.cancel();
                this.q = this.o;
            }
            this.m.cancel();
            this.l.setFloatValues(new float[]{this.n});
            this.l.start();
            this.c = null;
        } else if (z3) {
            this.l.cancel();
            this.m.setFloatValues(new float[]{this.o});
            this.m.start();
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
            this.l.cancel();
            this.m.cancel();
            b();
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.c = null;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            float f = (float) this.e;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.e) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.q < 1.0f) {
                if (this.h == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, ((this.q - 4.0f) * 4.0f) * 0.5f);
                canvas.scale(1.0f, this.q);
            }
            int i = this.g;
            if (i != -1) {
                this.i.setColor(i);
            } else {
                this.i.setColor(this.f);
            }
            this.i.setAlpha((int) (((float) this.d) * this.p));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.i);
            this.i.setColor(this.f);
            this.i.setAlpha((int) (this.p * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.b * 10000.0d)) - 8.687973E-4f, 2.0f, this.i);
            canvas.restore();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        tsj tsj = this.j;
        double d = (double) i;
        Double.isNaN(d);
        tsj.b(d / 10000.0d);
        this.k.a();
        return true;
    }

    public final void setAlpha(int i) {
        this.p = ((float) i) / 255.0f;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void b() {
        tsj tsj = this.j;
        double level = (double) getLevel();
        Double.isNaN(level);
        tsj.a(level / 10000.0d);
        this.k.b();
    }

    public final void setGrowScale(float f) {
        this.q = f;
        invalidateSelf();
    }

    public final float getGrowScale() {
        return this.q;
    }
}
