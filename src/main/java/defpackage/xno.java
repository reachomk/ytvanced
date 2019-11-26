package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: xno */
public final class xno extends Drawable implements Callback {
    public Drawable a;
    private final Paint b = new Paint();
    private final Paint c;
    private final float d;
    private final Canvas e = new Canvas();
    private int f;
    private int g;
    private float h;
    private float i;
    private float j;
    private Bitmap k;
    private Bitmap l;
    private int m;
    private int n;
    private int o;
    private BitmapShader p;
    private final Matrix q = new Matrix();

    public xno(Drawable drawable, float f, int i) {
        this.b.setAntiAlias(true);
        this.d = f;
        if (f > 0.0f) {
            this.c = new Paint();
            this.c.setAntiAlias(true);
            this.c.setStyle(Style.STROKE);
            this.c.setColor(i);
            this.c.setStrokeWidth(f);
        } else {
            this.c = null;
        }
        a(drawable);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null && drawable2.getCallback() == this) {
            this.a.setCallback(null);
        }
        if (drawable != null) {
            drawable.setCallback(this);
        } else {
            this.e.setBitmap(null);
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                bitmap.recycle();
                this.l = null;
            }
        }
        this.a = drawable;
        invalidateSelf();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.f = rect.width();
        this.g = rect.height();
        this.h = rect.exactCenterX();
        this.i = rect.exactCenterY();
        this.j = Math.min(this.h - ((float) rect.left), this.i - ((float) rect.top));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (this.f <= 0 || this.g <= 0) {
            this.b.setShader(null);
        } else {
            if (drawable == null) {
                this.k = null;
            } else {
                this.o = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = this.o;
                if (i <= 0) {
                    i = this.f;
                }
                this.m = i;
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = this.g;
                }
                this.n = intrinsicHeight;
                if (intrinsicHeight == 0 || i == 0) {
                    this.k = null;
                } else {
                    Bitmap bitmap = this.l;
                    if (bitmap == null || bitmap.isRecycled() || this.l.getWidth() != i || this.l.getHeight() != intrinsicHeight) {
                        this.l = Bitmap.createBitmap(i, intrinsicHeight, Config.ARGB_8888);
                        this.e.setBitmap(this.l);
                    } else {
                        this.l.eraseColor(0);
                    }
                    this.k = this.l;
                    drawable.setBounds(0, 0, this.m, this.n);
                    drawable.draw(this.e);
                }
            }
            Bitmap bitmap2 = this.k;
            if (bitmap2 == null || bitmap2.getHeight() <= 0 || this.k.getWidth() <= 0) {
                this.b.setShader(null);
            } else {
                float f;
                this.q.reset();
                if (!(this.k.getWidth() == this.f && this.k.getHeight() == this.g)) {
                    int min = Math.min(this.k.getWidth(), this.k.getHeight());
                    f = this.j;
                    f = (f + f) / ((float) min);
                    this.q.postScale(f, f);
                }
                Matrix matrix = this.q;
                f = this.h;
                float f2 = this.j;
                matrix.postTranslate(f - f2, this.i - f2);
                this.p = new BitmapShader(this.k, TileMode.CLAMP, TileMode.CLAMP);
                this.p.setLocalMatrix(this.q);
                this.b.setShader(this.p);
            }
        }
        if (this.b.getShader() != null) {
            canvas.drawCircle(this.h, this.i, this.j, this.b);
            Paint paint = this.c;
            if (paint != null) {
                canvas.drawCircle(this.h, this.i, this.j - (this.d / 2.0f), paint);
            }
        }
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
