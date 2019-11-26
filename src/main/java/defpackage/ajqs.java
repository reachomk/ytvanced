package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.text.style.ReplacementSpan;

/* renamed from: ajqs */
public final class ajqs extends ReplacementSpan {
    public final Paint a = new Paint();
    public boolean b;
    private float c;

    public ajqs() {
        this.a.setStyle(Style.STROKE);
        this.b = false;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        float measureText = paint.measureText(charSequence, i, i2);
        this.c = measureText;
        return Math.round(measureText);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = (float) (fontMetricsInt.bottom - fontMetricsInt.descent);
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f3 = ((float) i5) - f2;
        canvas.drawLine(f, f3, f + this.c, f3, this.a);
    }
}
