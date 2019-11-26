package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: auo */
final class auo implements aur {
    private final /* synthetic */ aul a;

    auo(aul aul) {
        this.a = aul;
    }

    public final void a(Canvas canvas, RectF rectF, float f, Paint paint) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        float f2 = f + f;
        float width = (rectF.width() - f2) - 4.0f;
        float height = (rectF.height() - f2) - 4.0f;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            f2 = -f3;
            this.a.a.set(f2, f2, f3, f3);
            int save = canvas.save();
            canvas2.translate(rectF2.left + f3, rectF2.top + f3);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            Paint paint2 = paint;
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint2);
            canvas2.translate(height, 0.0f);
            canvas2.rotate(90.0f);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(save);
            float f4 = (rectF2.right - f3) + 1.0f;
            float f5 = rectF2.top + f3;
            paint2 = paint;
            canvas.drawRect((rectF2.left + f3) - 4.0f, rectF2.top, f4, f5, paint2);
            canvas.drawRect((rectF2.left + f3) - 4.0f, rectF2.bottom - f3, 1.0f + (rectF2.right - f3), rectF2.bottom, paint2);
        }
        canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
    }
}
