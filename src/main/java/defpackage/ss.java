package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: ss */
public class ss extends Drawable {
    public final Paint a = new Paint(3);
    public float b;
    public final Rect c = new Rect();
    private final Bitmap d;
    private int e = 160;
    private final int f = 119;
    private final BitmapShader g;
    private final Matrix h = new Matrix();
    private final RectF i = new RectF();
    private boolean j = true;
    private boolean k;
    private final int l;
    private final int m;

    private static boolean b(float f) {
        return f > 0.05f;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
        invalidateSelf();
    }

    public final void setDither(boolean z) {
        this.a.setDither(z);
        invalidateSelf();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.j) {
            if (this.k) {
                int min = Math.min(this.l, this.m);
                a(this.f, min, min, getBounds(), this.c);
                int min2 = Math.min(this.c.width(), this.c.height());
                this.c.inset(Math.max(0, (this.c.width() - min2) / 2), Math.max(0, (this.c.height() - min2) / 2));
                this.b = ((float) min2) * 0.5f;
            } else {
                a(this.f, this.l, this.m, getBounds(), this.c);
            }
            this.i.set(this.c);
            if (this.g != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / ((float) this.d.getWidth()), this.i.height() / ((float) this.d.getHeight()));
                this.g.setLocalMatrix(this.h);
                this.a.setShader(this.g);
            }
            this.j = false;
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            a();
            if (this.a.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.c, this.a);
                return;
            }
            RectF rectF = this.i;
            float f = this.b;
            canvas.drawRoundRect(rectF, f, f, this.a);
        }
    }

    public final void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public final void a(boolean z) {
        this.k = z;
        this.j = true;
        if (z) {
            b();
            this.a.setShader(this.g);
            invalidateSelf();
            return;
        }
        a(0.0f);
    }

    private final void b() {
        this.b = (float) (Math.min(this.m, this.l) / 2);
    }

    public final void a(float f) {
        if (this.b != f) {
            this.k = false;
            if (ss.b(f)) {
                this.a.setShader(this.g);
            } else {
                this.a.setShader(null);
            }
            this.b = f;
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            b();
        }
        this.j = true;
    }

    public final int getIntrinsicWidth() {
        return this.l;
    }

    public final int getIntrinsicHeight() {
        return this.m;
    }

    public final int getOpacity() {
        if (this.f == 119 && !this.k) {
            Bitmap bitmap = this.d;
            if (!(bitmap == null || bitmap.hasAlpha() || this.a.getAlpha() < 255 || ss.b(this.b))) {
                return -1;
            }
        }
        return -3;
    }

    ss(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.e = resources.getDisplayMetrics().densityDpi;
        }
        this.d = bitmap;
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            this.m = -1;
            this.l = -1;
            this.g = null;
            return;
        }
        this.l = bitmap2.getScaledWidth(this.e);
        this.m = this.d.getScaledHeight(this.e);
        this.g = new BitmapShader(this.d, TileMode.CLAMP, TileMode.CLAMP);
    }
}
