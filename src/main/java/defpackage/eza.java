package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: eza */
public final class eza extends xog {
    public int a;
    private final Paint b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public eza(int i, int i2) {
        this(null, i, i2);
    }

    public eza(Drawable drawable, int i, int i2) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        super(drawable);
        this.b = new Paint();
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth((float) i2);
        this.b.setColor(i);
        this.c = true;
        this.d = 80;
        this.a = 0;
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            invalidateSelf();
        }
    }

    public final void a(int i) {
        if (i == 16 || i == 48 || i == 80 || i == 8388611 || i == 8388613) {
            this.d = i;
            a(getBounds());
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Unsupported gravity value");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* JADX WARNING: Missing block: B:17:0x005c, code skipped:
            if (r1 != 3) goto L_0x006d;
     */
    private final void a(android.graphics.Rect r7) {
        /*
        r6 = this;
        r0 = r6.b;
        r0 = r0.getStrokeWidth();
        r1 = r6.d;
        r1 = android.view.Gravity.isVertical(r1);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == 0) goto L_0x004e;
    L_0x0010:
        r1 = r6.d;
        r3 = 80;
        if (r1 != r3) goto L_0x0022;
    L_0x0016:
        r1 = r7.bottom;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 - r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
    L_0x0020:
        r0 = (int) r0;
        goto L_0x0041;
    L_0x0022:
        r3 = 16;
        if (r1 == r3) goto L_0x0031;
    L_0x0026:
        r1 = r7.top;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
        goto L_0x0020;
    L_0x0031:
        r1 = r7.bottom;
        r3 = r7.top;
        r1 = r1 - r3;
        r1 = r1 / 2;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
        goto L_0x0020;
    L_0x0041:
        r1 = r7.left;
        r6.e = r1;
        r6.f = r0;
        r7 = r7.right;
        r6.g = r7;
        r6.h = r0;
        return;
    L_0x004e:
        r1 = r6.d;
        r3 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        if (r1 != r3) goto L_0x0056;
    L_0x0055:
        goto L_0x005f;
    L_0x0056:
        r4 = 8388613; // 0x800005 float:1.175495E-38 double:4.1445255E-317;
        if (r1 == r4) goto L_0x005f;
    L_0x005b:
        r3 = 3;
        if (r1 == r3) goto L_0x0078;
    L_0x005e:
        goto L_0x006d;
    L_0x005f:
        r1 = defpackage.st.f(r6);
        r4 = r6.d;
        r5 = 1;
        if (r4 != r3) goto L_0x006b;
    L_0x0068:
        if (r1 == r5) goto L_0x006d;
    L_0x006a:
        goto L_0x0078;
    L_0x006b:
        if (r1 == r5) goto L_0x0078;
    L_0x006d:
        r1 = r7.right;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 - r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
        goto L_0x0082;
    L_0x0078:
        r1 = r7.left;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
    L_0x0082:
        r0 = (int) r0;
        r6.e = r0;
        r1 = r7.top;
        r6.f = r1;
        r6.g = r0;
        r7 = r7.bottom;
        r6.h = r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eza.a(android.graphics.Rect):void");
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }

    public final void b(int i) {
        if (i != this.b.getColor()) {
            this.b.setColor(i);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int i = this.a;
        if (i != 0) {
            canvas.drawColor(i);
        }
        if (this.c) {
            canvas.drawLine((float) this.e, (float) this.f, (float) this.g, (float) this.h, this.b);
        }
    }

    public final void c(int i) {
        this.b.setStrokeWidth((float) i);
    }
}
