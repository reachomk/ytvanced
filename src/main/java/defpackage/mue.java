package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: mue */
public final class mue extends mvk {
    private static final int h = Color.rgb(27, 27, 27);
    private final Paint i = new Paint();
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final float m;

    public mue(Resources resources) {
        this.i.setDither(true);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = resources.getDisplayMetrics().density;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        a(rect, getState());
        a();
    }

    public final int getIntrinsicHeight() {
        return (int) ((this.m * 4.0f) + 0.5f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        Rect bounds = getBounds();
        this.j.set(bounds.left, bounds.top, bounds.left + ((this.f * bounds.width()) / 100), bounds.bottom);
        int i = this.g;
        int i2 = this.f;
        this.k.set(this.j.right, bounds.top, this.j.right + (i > i2 ? ((i - i2) * bounds.width()) / 100 : 0), bounds.bottom);
        this.l.set(this.k.right, bounds.top, bounds.right, bounds.bottom);
    }

    public final void draw(Canvas canvas) {
        this.i.setShader(this.e);
        canvas.drawRect(this.j, this.i);
        this.i.setShader(null);
        this.i.setColor(d);
        canvas.drawRect(this.k, this.i);
        this.i.setColor(h);
        canvas.drawRect(this.l, this.i);
    }
}
