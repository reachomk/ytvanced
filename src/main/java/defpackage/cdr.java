package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* renamed from: cdr */
public final class cdr extends Drawable implements Animatable, cea {
    public final cdu a;
    public boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;

    public cdr(Context context, brz brz, bsr bsr, int i, int i2, Bitmap bitmap) {
        this(new cdu(new cdy(bqy.a(context), brz, i, i2, bsr, bitmap)));
    }

    public final int getOpacity() {
        return -2;
    }

    cdr(cdu cdu) {
        this.e = true;
        this.g = -1;
        this.a = (cdu) chw.a((Object) cdu);
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return this.a.a.a.a().asReadOnlyBuffer();
    }

    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            d();
        }
    }

    public final void stop() {
        this.d = false;
        e();
    }

    private final void d() {
        chw.a(this.b ^ 1, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            invalidateSelf();
        } else if (!this.c) {
            this.c = true;
            cdy cdy = this.a.a;
            if (cdy.f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (cdy.b.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            } else {
                boolean isEmpty = cdy.b.isEmpty();
                cdy.b.add(this);
                if (isEmpty && !cdy.d) {
                    cdy.d = true;
                    cdy.f = false;
                    cdy.d();
                }
                invalidateSelf();
            }
        }
    }

    private final void e() {
        this.c = false;
        cdy cdy = this.a.a;
        cdy.b.remove(this);
        if (cdy.b.isEmpty()) {
            cdy.b();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        chw.a(this.b ^ 1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            e();
        } else if (this.d) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public final int getIntrinsicWidth() {
        return this.a.a.c().getWidth();
    }

    public final int getIntrinsicHeight() {
        return this.a.a.c().getHeight();
    }

    public final boolean isRunning() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public final void draw(Canvas canvas) {
        if (!this.b) {
            if (this.h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
                this.h = false;
            }
            canvas.drawBitmap(this.a.a.c(), null, f(), g());
        }
    }

    public final void setAlpha(int i) {
        g().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    private final Rect f() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private final Paint g() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public final void c() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback != null) {
            invalidateSelf();
            cdy cdy = this.a.a;
            cdx cdx = cdy.e;
            if ((cdx != null ? cdx.a : -1) == cdy.a() - 1) {
                this.f++;
            }
            int i = this.g;
            if (i != -1 && this.f >= i) {
                stop();
            }
            return;
        }
        stop();
        invalidateSelf();
    }

    public final ConstantState getConstantState() {
        return this.a;
    }
}
