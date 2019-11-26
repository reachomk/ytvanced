package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: ajqu */
public final class ajqu extends MetricAffectingSpan {
    private final Typeface a;

    public ajqu(Typeface typeface) {
        if (typeface != null) {
            this.a = typeface;
            return;
        }
        throw new NullPointerException();
    }

    public final void updateMeasureState(TextPaint textPaint) {
        ajqu.a(textPaint, this.a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        ajqu.a(textPaint, this.a);
    }

    private static void a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
