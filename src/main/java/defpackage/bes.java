package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: bes */
public final class bes extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new ayr();
    private static final int[] g = new int[]{-16777216};
    public final bet a = new bet();
    public final Resources b;
    public float c;
    public boolean d;
    private float h;
    private final Animator i;

    public bes(Context context) {
        this.b = ((Context) aad.a((Object) context)).getResources();
        this.a.a(g);
        this.a.a(2.5f);
        invalidateSelf();
        bet bet = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ber(this, bet));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new beu(this, bet));
        this.i = ofFloat;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void a(boolean z) {
        this.a.a(z);
        invalidateSelf();
    }

    public final void a(float f) {
        bet bet = this.a;
        if (f != bet.o) {
            bet.o = f;
        }
        invalidateSelf();
    }

    public final void b(float f) {
        bet bet = this.a;
        bet.e = 0.0f;
        bet.f = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        bet bet = this.a;
        RectF rectF = bet.a;
        float f = bet.p;
        float f2 = (bet.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) bet.q) * bet.o) / 2.0f, bet.h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = bet.e;
        f = bet.g;
        f3 = (f3 + f) * 360.0f;
        float f4 = ((bet.f + f) * 360.0f) - f3;
        bet.b.setColor(bet.t);
        bet.b.setAlpha(bet.s);
        f = bet.h / 2.0f;
        rectF.inset(f, f);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bet.d);
        f = -f;
        rectF.inset(f, f);
        canvas.drawArc(rectF, f3, f4, false, bet.b);
        if (bet.m) {
            Path path = bet.n;
            if (path == null) {
                bet.n = new Path();
                bet.n.setFillType(FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            f = Math.min(rectF.width(), rectF.height());
            int i = bet.q;
            float f5 = bet.o;
            bet.n.moveTo(0.0f, 0.0f);
            bet.n.lineTo(((float) bet.q) * bet.o, 0.0f);
            Path path2 = bet.n;
            int i2 = bet.q;
            float f6 = bet.o;
            path2.lineTo((((float) i2) * f6) / 2.0f, ((float) bet.r) * f6);
            bet.n.offset(((f / 2.0f) + rectF.centerX()) - ((((float) i) * f5) / 2.0f), rectF.centerY() + (bet.h / 2.0f));
            bet.n.close();
            bet.c.setColor(bet.t);
            bet.c.setAlpha(bet.s);
            canvas.save();
            canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bet.n, bet.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.a.s;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean isRunning() {
        return this.i.isRunning();
    }

    public final void start() {
        this.i.cancel();
        this.a.c();
        bet bet = this.a;
        if (bet.f == bet.e) {
            bet.a(0);
            this.a.d();
            this.i.setDuration(1332);
            this.i.start();
            return;
        }
        this.d = true;
        this.i.setDuration(666);
        this.i.start();
    }

    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.a(false);
        this.a.a(0);
        this.a.d();
        invalidateSelf();
    }

    static void a(float f, bet bet) {
        if (f > 0.75f) {
            f = (f - 6.0f) / 0.25f;
            int b = bet.b();
            int i = bet.i[bet.a()];
            int i2 = b >>> 24;
            int i3 = (b >> 16) & 255;
            int i4 = (b >> 8) & 255;
            b &= 255;
            bet.t = ((((i2 + ((int) (((float) ((i >>> 24) - i2)) * f))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & 255) - i3)) * f))) << 16)) | ((i4 + ((int) (((float) (((i >> 8) & 255) - i4)) * f))) << 8)) | (b + ((int) (f * ((float) ((i & 255) - b)))));
            return;
        }
        bet.t = bet.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, bet bet, boolean z) {
        float f2;
        if (this.d) {
            bes.a(f, bet);
            double floor = Math.floor((double) (bet.l / 0.8f));
            f2 = bet.j;
            float f3 = bet.k;
            bet.e = f2 + (((-0.01f + f3) - f2) * f);
            bet.f = f3;
            f2 = bet.l;
            bet.g = f2 + ((((float) (floor + 1.0d)) - f2) * f);
        } else if (f != 1.0f || z) {
            float f4;
            float interpolation;
            f2 = bet.l;
            if (f >= 0.5f) {
                f4 = bet.j + 0.79f;
                interpolation = f4 - (((1.0f - f.getInterpolation((-0.5f + f) / 0.5f)) * 0.79f) + 0.01f);
            } else {
                interpolation = bet.j;
                f4 = interpolation + ((f.getInterpolation(f / 0.5f) * 0.79f) + 0.01f);
            }
            float f5 = this.c;
            bet.e = interpolation;
            bet.f = f4;
            bet.g = f2 + (0.20999998f * f);
            this.h = (f + f5) * 216.0f;
        }
    }
}
