package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: absb */
public final class absb extends ReplacementSpan {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private Paint g;
    private RectF h;
    private float i;
    private float j;

    public absb(Context context, int i) {
        this(context, 0, i, null);
    }

    public absb(Context context, int i, int i2, List list) {
        this.i = -1.0f;
        this.j = -1.0f;
        this.g = new Paint();
        this.g.setColor(i2);
        this.b = i;
        this.h = new RectF();
        this.a = list;
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_corner_radius);
        this.d = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.e = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_text_icon_gap);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        float f = this.i;
        if (f < 0.0f) {
            f = paint.measureText(charSequence.subSequence(i, i2).toString());
            this.i = f;
        }
        this.j = f + ((float) (this.d + this.e));
        List<Drawable> list = this.a;
        if (list != null) {
            for (Drawable intrinsicWidth : list) {
                this.j += (float) intrinsicWidth.getIntrinsicWidth();
            }
        }
        return (int) this.j;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        float f2 = f;
        int i6 = i3;
        int i7 = i5;
        Paint paint2 = paint;
        if (this.j < 0.0f) {
            this.j = paint2.measureText(charSequence.subSequence(i, i2).toString());
        }
        int i8 = this.b;
        if (i8 != 0) {
            paint2.setColor(i8);
        }
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = (float) i4;
        this.h.set(f2, Math.max((float) i6, fontMetrics.ascent + f3), this.j + f2, Math.min((float) i7, fontMetrics.descent + f3));
        float f4 = (float) this.c;
        canvas.drawRoundRect(this.h, f4, f4, this.g);
        canvas.drawText(charSequence, i, i2, f2 + ((float) this.d), f3, paint);
        List<Drawable> list = this.a;
        if (list != null) {
            int i9 = 0;
            for (Drawable d : list) {
                Drawable d2 = st.d(d2);
                st.a(d2, this.b);
                d2.setBounds(0, 0, d2.getIntrinsicWidth(), d2.getIntrinsicHeight());
                int intrinsicHeight = d2.getIntrinsicHeight();
                canvas.save();
                canvas.translate(((this.i + f2) + ((float) i9)) + ((float) this.f), (float) (Math.max(((i7 - i6) - intrinsicHeight) / 2, 0) + i6));
                d2.draw(canvas);
                canvas.restore();
                i9 += d2.getIntrinsicWidth();
            }
        }
    }
}
