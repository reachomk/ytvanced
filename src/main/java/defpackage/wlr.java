package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ReplacementSpan;

/* renamed from: wlr */
public final class wlr extends ReplacementSpan {
    public final String a;
    private final float b;
    private final float c;
    private final float d;
    private final RectF e = new RectF();
    private final Paint f = new Paint();

    public wlr(String str, float f, float f2, float f3, int i) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.f.setColor(i);
    }

    private final float a(Paint paint, CharSequence charSequence, int i, int i2) {
        return Math.min(paint.measureText(TextUtils.substring(charSequence, i, i2)), this.d);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (charSequence == null || charSequence.length() == 0) {
            return 0;
        }
        float a = a(paint, charSequence, i, i2);
        float f = this.c;
        return (int) Math.ceil((double) (a + (f + f)));
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = f;
        Paint paint2 = paint;
        if (charSequence != null && charSequence.length() != 0) {
            int i6 = i;
            int i7 = i2;
            float a = a(paint2, charSequence, i, i2);
            float f3 = this.c;
            this.e.set(f2, (float) i3, ((float) Math.ceil((double) ((f3 + f3) + a))) + f2, (float) i5);
            RectF rectF = this.e;
            float f4 = this.b;
            Canvas canvas2 = canvas;
            canvas.drawRoundRect(rectF, f4, f4, this.f);
            Paint textPaint = new TextPaint(paint2);
            CharSequence ellipsize = TextUtils.ellipsize(TextUtils.substring(charSequence, i, i2), textPaint, a, TruncateAt.END);
            canvas.drawText(ellipsize, 0, ellipsize.length(), f2 + this.c, (float) i4, textPaint);
        }
    }
}
