package defpackage;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;

/* renamed from: axe */
public abstract class axe extends ReplacementSpan {
    public final axa a;
    public short b = (short) -1;
    private final FontMetricsInt c = new FontMetricsInt();
    private float d = 1.0f;

    axe(axa axa) {
        aad.a((Object) axa, (Object) "metadata cannot be null");
        this.a = axa;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.c);
        this.d = ((float) Math.abs(this.c.descent - this.c.ascent)) / ((float) this.a.c());
        this.a.c();
        bfc a = this.a.a();
        int a2 = a.a(12);
        this.b = (short) ((int) (((float) (a2 != 0 ? a.b.getShort(a2 + a.a) : 0)) * this.d));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.c.ascent;
            fontMetricsInt.descent = this.c.descent;
            fontMetricsInt.top = this.c.top;
            fontMetricsInt.bottom = this.c.bottom;
        }
        return this.b;
    }
}
