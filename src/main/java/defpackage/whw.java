package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;

/* renamed from: whw */
public final class whw extends xog {
    private final int a;
    private final int b;
    private final Paint c;

    public whw(int i, int i2, int i3) {
        boolean z = false;
        super(new ColorDrawable(0));
        amqw.a(i > 0);
        if (i2 > 0) {
            z = true;
        }
        amqw.a(z);
        this.a = i;
        this.b = i2;
        this.c = new Paint(1);
        this.c.setColor(i3);
        this.c.setStyle(Style.FILL);
        this.c.setStrokeWidth((float) i2);
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.c.setAlpha(i);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float width;
            int max = Math.max(1, bounds.width() / this.a);
            if (max == 1) {
                width = (float) bounds.width();
            } else {
                width = (float) max;
                width = (((float) bounds.width()) - ((-1.0f + width) * ((float) this.b))) / width;
            }
            float f = ((float) bounds.left) + width;
            float f2 = ((float) this.b) / 2.0f;
            while (true) {
                f += f2;
                if (f >= ((float) bounds.width())) {
                    break;
                }
                canvas.drawLine(f, (float) bounds.top, f, (float) bounds.bottom, this.c);
                f2 = ((float) this.b) + width;
            }
            f = (float) bounds.top;
            f2 = ((float) this.b) / 2.0f;
            while (true) {
                f += f2;
                if (f < ((float) bounds.height())) {
                    canvas.drawLine((float) bounds.left, f, (float) bounds.right, f, this.c);
                    f2 = ((float) this.b) + width;
                } else {
                    return;
                }
            }
        }
    }
}
