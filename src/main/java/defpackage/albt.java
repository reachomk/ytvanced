package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: albt */
public final class albt extends View {
    private static final Paint e;
    public final alci a;
    public final RectF b = new RectF();
    public final View c;
    public final boolean d;
    private final int[] f = new int[2];
    private final Paint g;
    private final float h;

    albt(Context context, alci alci, View view, boolean z) {
        super(context);
        this.a = alci;
        this.d = z;
        setClickable(false);
        setFocusable(false);
        setLayerType(2, null);
        this.c = view;
        a();
        this.g = new Paint(1);
        this.g.setColor(xwe.a(context, R.attr.ytOverlayBackgroundMedium, 0));
        this.h = (float) xss.a(getResources().getDisplayMetrics(), 2);
        setOnTouchListener(new albs(this));
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawPaint(this.g);
        RectF rectF = this.b;
        float f = this.h;
        canvas.drawRoundRect(rectF, f, f, e);
    }

    public final void invalidate() {
        a();
        super.invalidate();
    }

    private final void a() {
        this.c.getLocationInWindow(this.f);
        RectF rectF = this.b;
        int[] iArr = this.f;
        int i = iArr[0];
        rectF.set((float) i, (float) iArr[1], (float) (i + this.c.getMeasuredWidth()), (float) (this.f[1] + this.c.getMeasuredHeight()));
    }

    static {
        Paint paint = new Paint(1);
        e = paint;
        paint.setColor(0);
        e.setXfermode(new PorterDuffXfermode(Mode.SRC_OUT));
    }
}
