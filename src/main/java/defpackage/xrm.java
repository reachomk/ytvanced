package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: xrm */
public final class xrm extends TouchDelegate {
    private final int[] a = new int[2];
    private final Rect b;
    private final View c;
    private final View d;
    private boolean e;

    public xrm(Rect rect, View view, View view2) {
        super(rect, view);
        this.b = (Rect) amqw.a((Object) rect);
        this.c = (View) amqw.a((Object) view);
        this.d = (View) amqw.a((Object) view2);
    }

    /* JADX WARNING: Missing block: B:6:0x0016, code skipped:
            if (r2 != 3) goto L_0x0033;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r9.getX();
        r1 = r9.getY();
        r2 = r9.getActionMasked();
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x0021;
    L_0x0010:
        if (r2 == r3) goto L_0x001c;
    L_0x0012:
        r5 = 2;
        if (r2 == r5) goto L_0x0019;
    L_0x0015:
        r5 = 3;
        if (r2 == r5) goto L_0x001c;
    L_0x0018:
        goto L_0x0033;
    L_0x0019:
        r2 = r8.e;
        goto L_0x0031;
    L_0x001c:
        r2 = r8.e;
        r8.e = r4;
        goto L_0x0031;
    L_0x0021:
        r2 = r8.b;
        r5 = java.lang.Math.round(r0);
        r6 = java.lang.Math.round(r1);
        r2 = r2.contains(r5, r6);
        r8.e = r2;
    L_0x0031:
        if (r2 != 0) goto L_0x0034;
    L_0x0033:
        return r4;
    L_0x0034:
        r2 = r8.c;
        r5 = r8.a;
        r2.getLocationOnScreen(r5);
        r2 = r8.a;
        r5 = r2[r4];
        r6 = r2[r3];
        r7 = r8.d;
        r7.getLocationOnScreen(r2);
        r2 = r8.a;
        r4 = r2[r4];
        r2 = r2[r3];
        r9 = android.view.MotionEvent.obtain(r9);
        r3 = (float) r5;
        r0 = r0 - r3;
        r3 = (float) r4;
        r0 = r0 + r3;
        r3 = (float) r6;
        r1 = r1 - r3;
        r2 = (float) r2;
        r1 = r1 + r2;
        r9.setLocation(r0, r1);
        r0 = r8.c;
        r0 = r0.dispatchTouchEvent(r9);
        r9.recycle();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xrm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
