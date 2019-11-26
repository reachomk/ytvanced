package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: sqe */
final class sqe extends TypefaceSpan {
    private final Typeface a;

    public sqe(String str, Typeface typeface) {
        super(str);
        this.a = typeface;
    }

    public final void updateDrawState(TextPaint textPaint) {
        sqe.a(textPaint, this.a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        sqe.a(textPaint, this.a);
    }

    private static void a(Paint paint, Typeface typeface) {
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }
}
