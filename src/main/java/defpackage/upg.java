package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: upg */
public final class upg extends Drawable {
    public final upi a = new upi(this);
    private final Drawable b;
    private final float c;
    private final upj d = new upj(this);
    private final upj e = new upj(this);

    public upg(Context context, int i, float f) {
        this.b = ra.a(context, i);
        this.c = f / 2.0f;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void a(float f, boolean z) {
        if (z) {
            this.d.a(f);
        } else {
            this.e.a(f);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float centerX = ((float) bounds.centerX()) - this.c;
        canvas.save();
        canvas.clipRect((float) bounds.left, (float) bounds.top, centerX, (float) bounds.bottom);
        canvas.scale(this.d.a(), 1.0f, centerX, 0.0f);
        this.b.draw(canvas);
        canvas.restore();
        float centerX2 = ((float) bounds.centerX()) + this.c;
        canvas.save();
        canvas.clipRect(centerX2, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        canvas.scale(this.e.a(), 1.0f, centerX2, 0.0f);
        this.b.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(centerX, (float) bounds.top, centerX2, (float) bounds.bottom);
        this.b.draw(canvas);
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }
}
