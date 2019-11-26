package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: wsh */
public final class wsh extends xog {
    public boolean a;
    private final Paint b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public wsh(Drawable drawable, int i, int i2) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        super(drawable);
        this.b = new Paint();
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth((float) i2);
        this.b.setColor(i);
        this.a = true;
        this.c = 80;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:13:0x004a, code skipped:
            if (r1 != 3) goto L_0x005b;
     */
    public final void onBoundsChange(android.graphics.Rect r7) {
        /*
        r6 = this;
        super.onBoundsChange(r7);
        r0 = r6.b;
        r0 = r0.getStrokeWidth();
        r1 = r6.c;
        r1 = android.view.Gravity.isVertical(r1);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == 0) goto L_0x003c;
    L_0x0013:
        r1 = r6.c;
        r3 = 80;
        if (r1 != r3) goto L_0x0024;
    L_0x0019:
        r1 = r7.bottom;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 - r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
        goto L_0x002e;
    L_0x0024:
        r1 = r7.top;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
    L_0x002e:
        r0 = (int) r0;
        r1 = r7.left;
        r6.d = r1;
        r6.e = r0;
        r7 = r7.right;
        r6.f = r7;
        r6.g = r0;
        return;
    L_0x003c:
        r1 = r6.c;
        r3 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        if (r1 != r3) goto L_0x0044;
    L_0x0043:
        goto L_0x004d;
    L_0x0044:
        r4 = 8388613; // 0x800005 float:1.175495E-38 double:4.1445255E-317;
        if (r1 == r4) goto L_0x004d;
    L_0x0049:
        r3 = 3;
        if (r1 == r3) goto L_0x0066;
    L_0x004c:
        goto L_0x005b;
    L_0x004d:
        r1 = defpackage.st.f(r6);
        r4 = r6.c;
        r5 = 1;
        if (r4 != r3) goto L_0x0059;
    L_0x0056:
        if (r1 == r5) goto L_0x005b;
    L_0x0058:
        goto L_0x0066;
    L_0x0059:
        if (r1 == r5) goto L_0x0066;
    L_0x005b:
        r1 = r7.right;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 - r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
        goto L_0x0070;
    L_0x0066:
        r1 = r7.left;
        r1 = (float) r1;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r0 = (double) r1;
        r0 = java.lang.Math.floor(r0);
    L_0x0070:
        r0 = (int) r0;
        r6.d = r0;
        r1 = r7.top;
        r6.e = r1;
        r6.f = r0;
        r7 = r7.bottom;
        r6.g = r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsh.onBoundsChange(android.graphics.Rect):void");
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a) {
            canvas.drawLine((float) this.d, (float) this.e, (float) this.f, (float) this.g, this.b);
        }
    }
}
