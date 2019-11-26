package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: and */
public abstract class and implements OnAttachStateChangeListener, OnTouchListener {
    public final View a;
    public boolean b;
    private final float c;
    private final int d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public and(View view) {
        this.a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract ajq a();

    /* Access modifiers changed, original: protected */
    public boolean b() {
        throw null;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            if (r4 != 3) goto L_0x009c;
     */
    /* JADX WARNING: Missing block: B:48:0x010d, code skipped:
            if (r13 == null) goto L_0x0110;
     */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        r11 = this;
        r12 = r11.b;
        r0 = 3;
        r1 = 1;
        r2 = 0;
        if (r12 != 0) goto L_0x00b7;
    L_0x0007:
        r3 = r11.a;
        r4 = r3.isEnabled();
        if (r4 == 0) goto L_0x009c;
    L_0x000f:
        r4 = r13.getActionMasked();
        if (r4 == 0) goto L_0x0070;
    L_0x0015:
        if (r4 == r1) goto L_0x006c;
    L_0x0017:
        r5 = 2;
        if (r4 == r5) goto L_0x001e;
    L_0x001a:
        if (r4 == r0) goto L_0x006c;
    L_0x001c:
        goto L_0x009c;
    L_0x001e:
        r0 = r11.h;
        r0 = r13.findPointerIndex(r0);
        if (r0 < 0) goto L_0x009c;
    L_0x0026:
        r4 = r13.getX(r0);
        r13 = r13.getY(r0);
        r0 = r11.c;
        r5 = -r0;
        r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r6 >= 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0059;
    L_0x0036:
        r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1));
        if (r5 < 0) goto L_0x0059;
    L_0x003a:
        r5 = r3.getRight();
        r6 = r3.getLeft();
        r5 = r5 - r6;
        r5 = (float) r5;
        r5 = r5 + r0;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 >= 0) goto L_0x0059;
    L_0x0049:
        r4 = r3.getBottom();
        r5 = r3.getTop();
        r4 = r4 - r5;
        r4 = (float) r4;
        r4 = r4 + r0;
        r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r13 >= 0) goto L_0x0059;
    L_0x0058:
        goto L_0x009c;
    L_0x0059:
        r11.d();
        r13 = r3.getParent();
        r13.requestDisallowInterceptTouchEvent(r1);
        r13 = r11.b();
        if (r13 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x009c;
    L_0x006a:
        r13 = 1;
        goto L_0x009d;
    L_0x006c:
        r11.d();
        goto L_0x009c;
    L_0x0070:
        r13 = r13.getPointerId(r2);
        r11.h = r13;
        r13 = r11.f;
        if (r13 != 0) goto L_0x0081;
    L_0x007a:
        r13 = new ang;
        r13.<init>(r11);
        r11.f = r13;
    L_0x0081:
        r13 = r11.f;
        r0 = r11.d;
        r4 = (long) r0;
        r3.postDelayed(r13, r4);
        r13 = r11.g;
        if (r13 != 0) goto L_0x0094;
    L_0x008d:
        r13 = new anf;
        r13.<init>(r11);
        r11.g = r13;
    L_0x0094:
        r13 = r11.g;
        r0 = r11.e;
        r4 = (long) r0;
        r3.postDelayed(r13, r4);
    L_0x009c:
        r13 = 0;
    L_0x009d:
        if (r13 != 0) goto L_0x00a1;
    L_0x009f:
        goto L_0x0119;
    L_0x00a1:
        r5 = android.os.SystemClock.uptimeMillis();
        r7 = 3;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r5;
        r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10);
        r3 = r11.a;
        r3.onTouchEvent(r0);
        r0.recycle();
        goto L_0x0119;
    L_0x00b7:
        r3 = r11.a;
        r4 = r11.a();
        if (r4 == 0) goto L_0x0110;
    L_0x00bf:
        r5 = r4.e();
        if (r5 == 0) goto L_0x0110;
    L_0x00c5:
        r4 = r4.g_();
        r4 = (defpackage.amt) r4;
        if (r4 == 0) goto L_0x0110;
    L_0x00cd:
        r5 = r4.isShown();
        if (r5 == 0) goto L_0x0110;
    L_0x00d3:
        r5 = android.view.MotionEvent.obtainNoHistory(r13);
        r6 = r11.i;
        r3.getLocationOnScreen(r6);
        r3 = r6[r2];
        r3 = (float) r3;
        r6 = r6[r1];
        r6 = (float) r6;
        r5.offsetLocation(r3, r6);
        r3 = r11.i;
        r4.getLocationOnScreen(r3);
        r6 = r3[r2];
        r6 = -r6;
        r6 = (float) r6;
        r3 = r3[r1];
        r3 = -r3;
        r3 = (float) r3;
        r5.offsetLocation(r6, r3);
        r3 = r11.h;
        r3 = r4.a(r5, r3);
        r5.recycle();
        r13 = r13.getActionMasked();
        if (r13 != r1) goto L_0x0106;
    L_0x0104:
        r13 = 0;
        goto L_0x010a;
    L_0x0106:
        if (r13 != r0) goto L_0x0109;
    L_0x0108:
        goto L_0x0104;
    L_0x0109:
        r13 = 1;
    L_0x010a:
        if (r3 != 0) goto L_0x010d;
    L_0x010c:
        goto L_0x0110;
    L_0x010d:
        if (r13 == 0) goto L_0x0110;
    L_0x010f:
        goto L_0x0116;
    L_0x0110:
        r13 = r11.c();
        if (r13 != 0) goto L_0x0118;
    L_0x0116:
        r13 = 1;
        goto L_0x0119;
    L_0x0118:
        r13 = 0;
    L_0x0119:
        r11.b = r13;
        if (r13 != 0) goto L_0x0120;
    L_0x011d:
        if (r12 != 0) goto L_0x0120;
    L_0x011f:
        return r2;
    L_0x0120:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.and.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        this.h = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        ajq a = a();
        if (a != null && a.e()) {
            a.d();
        }
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        runnable = this.f;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }
}
