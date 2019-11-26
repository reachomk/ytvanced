package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: kam */
final class kam extends Drawable {
    private final Paint a = new Paint(1);
    private Path b;
    private Path c;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void draw(Canvas canvas) {
        this.a.setAlpha(128);
        canvas.drawPath(this.b, this.a);
        this.a.setAlpha(204);
        canvas.drawPath(this.c, this.a);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.c = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        this.c.moveTo(f, f2);
        float f3 = (float) (i3 - i);
        float f4 = 0.1f * f3;
        this.c.lineTo((float) Math.round(f4), f2);
        float f5 = 0.35f * f3;
        float f6 = ((float) (i4 - i2)) * 0.5f;
        this.c.lineTo((float) Math.round(f5), (float) Math.round(f6));
        float f7 = (float) i4;
        this.c.lineTo((float) Math.round(f4), f7);
        this.c.lineTo(f, f7);
        this.c.close();
        this.b = new Path();
        this.b.moveTo(f, f2);
        this.b.lineTo((float) Math.round(f4), f2);
        this.b.lineTo((float) Math.round(f5), (float) Math.round(f6));
        this.b.lineTo((float) Math.round(f3 * 0.6f), f7);
        this.b.lineTo(f, f7);
        this.b.close();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }
}
