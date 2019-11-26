package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: mun */
public final class mun extends mvk {
    private final Paint h = new Paint();
    private final Rect i;
    private final Drawable j;
    private final Drawable k;
    private final Drawable l;
    private final RectF m;
    private final RectF n;
    private final Rect o;
    private final Rect p;

    public mun(Context context) {
        this.h.setDither(true);
        this.i = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.m = new RectF();
        this.n = new RectF();
        this.l = ra.a(context, (int) R.drawable.api_player_bar);
        this.k = ra.a(context, (int) R.drawable.api_player_buffered);
        this.j = ra.a(context, (int) R.drawable.api_player_track);
        this.j.getPadding(this.o);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.j.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        this.p.set(rect.left + this.o.left, rect.top + this.o.top, rect.right - this.o.right, rect.bottom - this.o.bottom);
        a(this.p, getState());
        this.m.set((float) rect.left, (float) this.p.top, (float) (rect.left + this.p.height()), (float) this.p.bottom);
        this.n.set((float) (rect.right - this.p.height()), (float) this.p.top, (float) rect.right, (float) this.p.bottom);
        a();
    }

    public final int getIntrinsicHeight() {
        return this.j.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.j.getIntrinsicWidth();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        int i = this.f;
        int i2 = 0;
        i = i <= 1 ? 0 : i < 99 ? i - 1 : 98;
        this.i.set(this.p.left, this.p.top, this.p.left + ((this.p.width() * i) / 98), this.p.bottom);
        int i3 = this.g;
        int i4 = i3 <= 1 ? 0 : i3 < 99 ? i3 - 1 : 98;
        if (i4 > i) {
            i2 = ((i4 - i) * this.p.width()) / 98;
        }
        this.k.setBounds(this.i.right, this.p.top, this.i.right + i2, this.p.bottom);
    }

    public final void draw(Canvas canvas) {
        this.l.draw(canvas);
        this.j.draw(canvas);
        if (this.f > 0) {
            this.h.setShader(this.e);
            canvas.drawArc(this.m, 90.0f, 180.0f, true, this.h);
        } else if (this.g > 0) {
            this.h.setShader(null);
            this.h.setColor(d);
            canvas.drawArc(this.m, 90.0f, 180.0f, true, this.h);
        }
        this.h.setShader(this.e);
        canvas.drawRect(this.i, this.h);
        this.k.draw(canvas);
        if (this.f >= 100) {
            this.h.setShader(this.e);
            canvas.drawArc(this.n, -90.0f, 180.0f, true, this.h);
        } else if (this.g >= 100) {
            this.h.setShader(null);
            this.h.setColor(d);
            canvas.drawArc(this.n, -90.0f, 180.0f, true, this.h);
        }
    }
}
