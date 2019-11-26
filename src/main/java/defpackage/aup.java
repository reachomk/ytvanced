package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: aup */
final class aup extends Drawable {
    public float a;
    public float b;
    public boolean c = false;
    public boolean d = true;
    private final Paint e;
    private final RectF f;
    private final Rect g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k = Mode.SRC_IN;

    aup(ColorStateList colorStateList, float f) {
        this.a = f;
        this.e = new Paint(5);
        a(colorStateList);
        this.f = new RectF();
        this.g = new Rect();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.e.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        Object obj = null;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            obj = 1;
        }
        RectF rectF = this.f;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    public final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.g.set(rect);
        if (this.c) {
            float a = aus.a(this.b, this.a, this.d);
            this.g.inset((int) Math.ceil((double) aus.b(this.b, this.a, this.d)), (int) Math.ceil((double) a));
            this.f.set(this.g);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.e.getColor();
        if (z) {
            this.e.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null) {
            Mode mode = this.k;
            if (mode != null) {
                this.i = a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.h;
            if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
