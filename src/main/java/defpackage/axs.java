package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: axs */
public final class axs extends axe {
    public axs(axa axa) {
        super(axa);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        boolean z = awq.a().h;
        axa axa = this.a;
        Typeface typeface = axa.b.d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = axa.a;
        canvas.drawText(axa.b.b, i6 + i6, 2, f, (float) i4, paint);
        paint2.setTypeface(typeface2);
    }
}
