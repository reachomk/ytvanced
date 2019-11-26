package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: uiw */
public final class uiw extends Drawable {
    public final Paint a;
    public String b = "";
    public int c;
    public boolean d;
    private final int e;
    private final Paint f;
    private final FontMetricsInt g;
    private final RectF h = new RectF();

    public uiw(Context context, float f, int i, int i2) {
        Resources resources = context.getResources();
        this.f = new Paint(1);
        this.f.setColor(i);
        this.a = new Paint();
        this.a.setColor(i2);
        this.a.setTextAlign(Align.LEFT);
        this.a.setTextSize(resources.getDimension(R.dimen.callout_drawable_font_size) * f);
        this.g = this.a.getFontMetricsInt();
        this.e = (int) (resources.getDimension(R.dimen.callout_drawable_padding) * f);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicWidth() {
        int i = this.e;
        return (i + i) + this.c;
    }

    public final int getIntrinsicHeight() {
        int i = this.e;
        return (((i + i) + this.g.leading) - this.g.ascent) + this.g.descent;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.translate((float) bounds.left, (float) bounds.top);
        this.h.set(0.0f, 0.0f, (float) width, (float) height);
        float f = (float) (height / 2);
        canvas.drawRoundRect(this.h, f, f, this.f);
        RectF rectF = this.h;
        rectF.top = f;
        if (this.d) {
            rectF.right = rectF.left + f;
        } else {
            rectF.left = rectF.right - f;
        }
        canvas.drawRect(this.h, this.f);
        String str = this.b;
        width = this.e;
        canvas.drawText(str, (float) width, (float) ((width + this.g.leading) - this.g.ascent), this.a);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.f.setAlpha(i);
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }
}
