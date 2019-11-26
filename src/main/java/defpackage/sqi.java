package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: sqi */
final class sqi extends TypefaceSpan {
    private final Typeface a;

    public sqi(String str, Typeface typeface) {
        super(str);
        this.a = typeface;
    }

    public final void updateDrawState(TextPaint textPaint) {
        sqi.a(textPaint, this.a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        sqi.a(textPaint, this.a);
    }

    private static void a(Paint paint, Typeface typeface) {
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }
}
