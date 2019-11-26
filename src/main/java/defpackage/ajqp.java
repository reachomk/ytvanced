package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.text.style.ReplacementSpan;

/* renamed from: ajqp */
public final class ajqp extends ReplacementSpan {
    public final Paint a = new Paint();
    public boolean b;
    private float c;

    public ajqp() {
        this.a.setStyle(Style.FILL);
        this.b = false;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
            fontMetricsInt.top = fontMetricsInt2.top;
        }
        float measureText = paint.measureText(charSequence, i, i2);
        this.c = measureText;
        return Math.round(measureText);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = ((float) (fontMetricsInt.bottom - fontMetricsInt.ascent)) / 2.0f;
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f3 = ((float) i5) - f2;
        canvas.drawLine(f, f3, f + this.c, f3, this.a);
    }
}
