package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: itp */
final class itp extends ImageSpan {
    private final int a;

    itp(Drawable drawable, int i) {
        super(drawable, 1);
        this.a = i;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        i5 -= drawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i5 -= paint.getFontMetricsInt().descent;
        }
        canvas.translate(f, (float) (i5 - this.a));
        drawable.draw(canvas);
        canvas.restore();
    }
}
