package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: aus */
final class aus extends Drawable {
    public static aur b;
    private static final double h = Math.cos(Math.toRadians(45.0d));
    public final int a;
    public float c;
    public float d;
    public float e;
    public boolean f = true;
    public boolean g = true;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final RectF l;
    private Path m;
    private float n;
    private ColorStateList o;
    private final int p;
    private final int q;
    private boolean r = false;

    aus(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.p = resources.getColor(R.color.cardview_shadow_start_color);
        this.q = resources.getColor(R.color.cardview_shadow_end_color);
        this.a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.i = new Paint(5);
        a(colorStateList);
        this.j = new Paint(5);
        this.j.setStyle(Style.FILL);
        this.c = (float) ((int) (f + 0.5f));
        this.l = new RectF();
        this.k = new Paint(this.j);
        this.k.setAntiAlias(false);
        a(f2, f3);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.o = colorStateList;
        this.i.setColor(this.o.getColorForState(getState(), this.o.getDefaultColor()));
    }

    private static int a(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public final void setAlpha(int i) {
        this.i.setAlpha(i);
        this.j.setAlpha(i);
        this.k.setAlpha(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f = true;
    }

    public final void a(float f, float f2) {
        String str = ". Must be >= 0";
        StringBuilder stringBuilder;
        if (f < 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid shadow size ");
            stringBuilder.append(f);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 >= 0.0f) {
            f = (float) aus.a(f);
            f2 = (float) aus.a(f2);
            if (f > f2) {
                if (!this.r) {
                    this.r = true;
                }
                f = f2;
            }
            if (this.e != f || this.d != f2) {
                this.e = f;
                this.d = f2;
                this.n = (float) ((int) (((f * 1.5f) + ((float) this.a)) + 0.5f));
                this.f = true;
                invalidateSelf();
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid max shadow size ");
            stringBuilder.append(f2);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) aus.a(this.d, this.c, this.g));
        int ceil2 = (int) Math.ceil((double) aus.b(this.d, this.c, this.g));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - h;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    static float b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - h;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.o;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.i.getColor() == colorForState) {
            return false;
        }
        this.i.setColor(colorForState);
        this.f = true;
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.o;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        Canvas canvas2 = canvas;
        if (this.f) {
            Rect bounds = getBounds();
            float f2 = this.d * 1.5f;
            this.l.set(((float) bounds.left) + this.d, ((float) bounds.top) + f2, ((float) bounds.right) - this.d, ((float) bounds.bottom) - f2);
            f2 = this.c;
            float f3 = -f2;
            RectF rectF = new RectF(f3, f3, f2, f2);
            RectF rectF2 = new RectF(rectF);
            f3 = -this.n;
            rectF2.inset(f3, f3);
            Path path = this.m;
            if (path == null) {
                this.m = new Path();
            } else {
                path.reset();
            }
            this.m.setFillType(FillType.EVEN_ODD);
            this.m.moveTo(-this.c, 0.0f);
            this.m.rLineTo(-this.n, 0.0f);
            this.m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.m.arcTo(rectF, 270.0f, -90.0f, false);
            this.m.close();
            f = this.c + this.n;
            Paint paint = this.j;
            r14 = new int[3];
            int i2 = this.p;
            r14[0] = i2;
            r14[1] = i2;
            r14[2] = this.q;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f, r14, new float[]{0.0f, r1 / f, 1.0f}, TileMode.CLAMP));
            Paint paint2 = this.k;
            f3 = -this.c;
            float f4 = this.n;
            r13 = new int[3];
            int i3 = this.p;
            r13[0] = i3;
            r13[1] = i3;
            r13[2] = this.q;
            paint2.setShader(new LinearGradient(0.0f, f3 + f4, 0.0f, f3 - f4, r13, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.k.setAntiAlias(false);
            this.f = false;
        }
        canvas2.translate(0.0f, this.e / 2.0f);
        float f5 = this.c;
        float f6 = (-f5) - this.n;
        float f7 = (f5 + ((float) this.a)) + (this.e / 2.0f);
        f = f7 + f7;
        Object obj = this.l.width() - f <= 0.0f ? null : 1;
        Object obj2 = this.l.height() - f <= 0.0f ? null : 1;
        int save = canvas.save();
        canvas2.translate(this.l.left + f7, this.l.top + f7);
        canvas2.drawPath(this.m, this.j);
        if (obj != null) {
            i = save;
            canvas.drawRect(0.0f, f6, this.l.width() - f, -this.c, this.k);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        i = canvas.save();
        canvas2.translate(this.l.right - f7, this.l.bottom - f7);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj != null) {
            canvas.drawRect(0.0f, f6, this.l.width() - f, (-this.c) + this.n, this.k);
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.l.left + f7, this.l.bottom - f7);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f6, this.l.height() - f, -this.c, this.k);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.l.right - f7, this.l.top + f7);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f6, this.l.height() - f, -this.c, this.k);
        }
        canvas2.restoreToCount(save3);
        canvas2.translate(0.0f, (-this.e) / 2.0f);
        b.a(canvas2, this.l, this.c, this.i);
    }
}
