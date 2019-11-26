package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: ft */
public final class ft extends Drawable {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g = true;
    public ia h;
    private final ic i = new ic();
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final fv m = new fv(this);
    private int n;
    private ColorStateList o;

    ft(ia iaVar) {
        this.h = iaVar;
        this.a = new Paint(1);
        this.a.setStyle(Style.STROKE);
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.n = colorStateList.getColorForState(getState(), this.n);
        }
        this.o = colorStateList;
        this.g = true;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.g) {
            Paint paint = this.a;
            Rect rect = this.k;
            copyBounds(rect);
            float height = this.b / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{sc.a(this.c, this.n), sc.a(this.d, this.n), sc.a(sc.c(this.d, 0), this.n), sc.a(sc.c(this.f, 0), this.n), sc.a(this.f, this.n), sc.a(this.e, this.n)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP));
            this.g = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        copyBounds(this.k);
        this.l.set(this.k);
        float min = Math.min(this.h.a.a, this.l.width() / 2.0f);
        if (this.h.a()) {
            this.l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.l, min, min, this.a);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.h.a()) {
            outline.setRoundRect(getBounds(), this.h.a.a);
            return;
        }
        copyBounds(this.k);
        this.l.set(this.k);
        this.i.a(this.h, 1.0f, this.l, this.j);
        if (this.j.isConvex()) {
            outline.setConvexPath(this.j);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (this.h.a()) {
            int round = Math.round(this.b);
            rect.set(round, round, round, round);
        }
        return true;
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    public final int getOpacity() {
        return this.b > 0.0f ? -3 : -2;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.o;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.n);
            if (colorForState != this.n) {
                this.g = true;
                this.n = colorForState;
            }
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    public final ConstantState getConstantState() {
        return this.m;
    }
}
