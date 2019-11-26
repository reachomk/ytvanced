package defpackage;

import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: jhr */
public final class jhr implements OnTouchListener {
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final jhf c;
    public final akot d;
    private final View e;
    private final int f;
    private final Handler g;
    private final int h;
    private final Runnable i = new jhu(this);

    public jhr(View view, jhf jhf, akot akot, Handler handler, int i) {
        this.e = (View) amqw.a((Object) view);
        this.c = (jhf) amqw.a((Object) jhf);
        this.d = (akot) amqw.a((Object) akot);
        this.g = handler;
        this.h = i;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f = scaledTouchSlop * scaledTouchSlop;
    }

    /* JADX WARNING: Missing block: B:7:0x000d, code skipped:
            if (r4 != 3) goto L_0x0062;
     */
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
        r3 = this;
        r4 = r5.getAction();
        if (r4 == 0) goto L_0x0037;
    L_0x0006:
        r0 = 1;
        if (r4 == r0) goto L_0x002f;
    L_0x0009:
        r1 = 2;
        if (r4 == r1) goto L_0x0010;
    L_0x000c:
        r0 = 3;
        if (r4 == r0) goto L_0x002f;
    L_0x000f:
        goto L_0x0062;
    L_0x0010:
        r4 = r3.b;
        r1 = r5.getX();
        r5 = r5.getY();
        r4.set(r1, r5);
        r4 = r3.b;
        r5 = r3.a;
        r4 = r3.a(r4, r5);
        if (r4 != 0) goto L_0x002e;
    L_0x0027:
        r4 = r3.g;
        r5 = r3.i;
        r4.removeCallbacks(r5);
    L_0x002e:
        return r0;
    L_0x002f:
        r4 = r3.g;
        r0 = r3.i;
        r4.removeCallbacks(r0);
        goto L_0x0062;
    L_0x0037:
        r4 = r3.a;
        r0 = r5.getX();
        r1 = r5.getY();
        r4.set(r0, r1);
        r4 = r3.b;
        r0 = r5.getX();
        r1 = r5.getY();
        r4.set(r0, r1);
        r4 = r3.g;
        r0 = r3.i;
        r4.removeCallbacks(r0);
        r4 = r3.g;
        r0 = r3.i;
        r1 = r3.h;
        r1 = (long) r1;
        r4.postDelayed(r0, r1);
    L_0x0062:
        r4 = r3.e;
        r4 = r4.onTouchEvent(r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (f * f) + (f2 * f2) <= ((float) this.f);
    }
}
