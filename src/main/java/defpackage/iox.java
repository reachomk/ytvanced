package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: iox */
final class iox extends Drawable {
    private final Paint a = new Paint(1);
    private final float b;
    private final float c;
    private final int d;
    private final int e;

    iox(float f, int i, int i2, float f2) {
        this.b = f;
        this.d = i;
        this.e = i2;
        this.c = f2;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = this.b;
        float width = (f <= 0.0f || f >= 100.0f) ? 0.0f : (((float) bounds.width()) * this.b) / 100.0f;
        ColorFilter colorFilter = this.a.getColorFilter();
        this.a.setColor(this.d);
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        float f2 = this.c;
        canvas.drawPath(iox.a((float) i, (float) i2, (float) i3, (float) i4, f2, f2), this.a);
        if (width > 0.0f) {
            this.a.setColor(this.e);
            canvas.drawPath(iox.a((float) bounds.left, (float) bounds.top, width, (float) bounds.bottom, this.c, 0.0f), this.a);
        }
        this.a.setColorFilter(colorFilter);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private static Path a(float f, float f2, float f3, float f4, float f5, float f6) {
        Path path = new Path();
        f4 -= f2;
        f3 = (f3 - f) - (f5 + f6);
        path.moveTo(f + f5, f2);
        path.rLineTo(f3, 0.0f);
        path.rQuadTo(f6, 0.0f, f6, f6);
        path.rLineTo(0.0f, f4 - (f6 + f6));
        path.rQuadTo(0.0f, f6, -f6, f6);
        path.rLineTo(-f3, 0.0f);
        f2 = -f5;
        path.rQuadTo(f2, 0.0f, f2, f2);
        path.rLineTo(0.0f, -(f4 - (f5 + f5)));
        path.rQuadTo(0.0f, f2, f5, f2);
        path.close();
        return path;
    }
}
