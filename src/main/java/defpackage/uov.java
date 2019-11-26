package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: uov */
public final class uov extends Drawable {
    private static final uox f = new uou();
    private static final uow g = new uow();
    public final ObjectAnimator a;
    public uor b;
    public long c;
    public float d = 1.0f;
    public float e = 1.0f;
    private final Paint h = new Paint();
    private final Matrix i = new Matrix();
    private final uox j = f;

    public uov() {
        this.h.setFilterBitmap(true);
        this.h.setAntiAlias(true);
        this.h.setDither(true);
        this.a = ObjectAnimator.ofFloat(this, g, new float[]{this.d});
    }

    public final void a(uor uor) {
        uor uor2 = this.b;
        if (uor != uor2) {
            if (uor2 != null) {
                uor2.d();
            }
            this.b = uor != null ? uor.c() : null;
            invalidateSelf();
        }
    }

    public final void a(boolean z) {
        float f = !z ? 0.0f : 1.0f;
        this.a.cancel();
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
        this.d = f;
    }

    public final void a(Canvas canvas, int i) {
        i = ((i % 360) + 360) % 360;
        uhy.a(i % 90 == 0);
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            int alpha = this.h.getAlpha();
            float a = uov.a(this.e, 0.7f, 0.0f);
            float a2 = uov.a(this.e, 1.0f, 0.5f);
            this.h.setAlpha((int) (((float) alpha) * a));
            canvas.save();
            canvas.scale(a2, a2, bounds.exactCenterX(), bounds.exactCenterY());
            Bitmap a3 = a();
            if (a3 != null) {
                this.j.a(this.i, i, bounds, a3);
                canvas.drawBitmap(a3, this.i, this.h);
            } else {
                canvas.drawRect(bounds, this.h);
            }
            canvas.restore();
            this.h.setAlpha(alpha);
        }
    }

    public final void draw(Canvas canvas) {
        a(canvas, 0);
    }

    public final void setAlpha(int i) {
        if (i != this.h.getAlpha()) {
            this.h.setAlpha(i);
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.h.getAlpha();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getOpacity() {
        Bitmap a = a();
        return (this.h.getAlpha() < 255 || this.e < 1.0f || (a != null && a.hasAlpha())) ? -3 : -1;
    }

    private final Bitmap a() {
        uor uor = this.b;
        return uor != null ? uor.b() : null;
    }

    private static float a(float f, float f2, float f3) {
        boolean z = true;
        uhy.a(f2 > 0.0f);
        if (f3 >= 1.0f) {
            z = false;
        }
        uhy.a(z);
        if (f <= 0.0f) {
            return f3;
        }
        if (f < f2) {
            return f3 + (((f + 0.0f) / (f2 + 0.0f)) * (1.0f - f3));
        }
        return 1.0f;
    }
}
