package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: kl */
public final class kl extends hu {
    public final RectF f;
    private final Paint g;
    private int h;

    kl() {
        this(null);
    }

    public kl(ia iaVar) {
        if (iaVar == null) {
            iaVar = new ia();
        }
        super(iaVar);
        this.g = new Paint(1);
        this.g.setStyle(Style.FILL_AND_STROKE);
        this.g.setColor(-1);
        this.g.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f = new RectF();
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f != this.f.left || f2 != this.f.top || f3 != this.f.right || f4 != this.f.bottom) {
            this.f.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else if (VERSION.SDK_INT >= 21) {
            this.h = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.h = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f, this.g);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.h);
        }
    }
}
