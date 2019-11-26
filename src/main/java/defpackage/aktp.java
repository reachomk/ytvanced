package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: aktp */
final class aktp extends ImageSpan {
    public int a;
    private final FontMetricsInt b = new FontMetricsInt();

    aktp(Drawable drawable) {
        super(drawable, 0);
    }

    aktp(Context context, Bitmap bitmap) {
        super(context, bitmap, 0);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.b);
        Rect bounds = drawable.getBounds();
        canvas.translate(f, (float) (((i4 + this.b.bottom) - ((this.b.bottom - this.b.top) / 2)) - (bounds.height() / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        paint.getFontMetricsInt(this.b);
        int i3 = this.b.ascent - this.b.top;
        i = this.b.bottom - this.b.descent;
        i2 = this.b.bottom - ((this.b.bottom - this.b.top) / 2);
        int height = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i2 - height;
            fontMetricsInt.descent = i2 + height;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i;
        }
        return bounds.right + this.a;
    }
}
