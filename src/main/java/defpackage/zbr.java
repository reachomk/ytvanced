package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbr */
public final class zbr {
    public int a;
    public final /* synthetic */ HeartView b;
    private final Drawable c;
    private final int d;
    private float e = 1.0f;

    public zbr(HeartView heartView, Drawable drawable, int i) {
        this.b = heartView;
        this.c = (Drawable) amqw.a((Object) drawable);
        this.d = i;
        this.a = i;
    }

    public final int a() {
        return this.c.getIntrinsicWidth();
    }

    public final int b() {
        return this.c.getIntrinsicHeight();
    }

    /* Access modifiers changed, original: final */
    public final void setScale(float f) {
        this.e = f;
        this.b.invalidate();
    }

    /* Access modifiers changed, original: final */
    public final void setAlpha(float f) {
        this.a = sc.c(this.a, (int) (f * 255.0f));
        this.b.invalidate();
    }

    public final void a(Canvas canvas) {
        canvas.save();
        float f = this.e;
        if (f != 1.0f) {
            canvas.scale(f, f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
        }
        this.c.setColorFilter(this.a, Mode.SRC_IN);
        this.c.draw(canvas);
        canvas.restore();
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.c.setBounds(i, i2, i3, i4);
    }

    public final void c() {
        this.e = 1.0f;
        this.a = this.d;
    }
}
