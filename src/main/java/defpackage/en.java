package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: en */
public class en extends er {
    private Runnable a;
    private boolean b;
    public OverScroller c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public int a() {
        throw null;
    }

    public int a(View view) {
        throw null;
    }

    public int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void a(CoordinatorLayout coordinatorLayout, View view) {
    }

    public int b(View view) {
        throw null;
    }

    public boolean b() {
        throw null;
    }

    public en(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Missing block: B:14:0x002d, code skipped:
            if (r0 != 3) goto L_0x0082;
     */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
        r4 = this;
        r0 = r4.f;
        if (r0 >= 0) goto L_0x0012;
    L_0x0004:
        r0 = r5.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r4.f = r0;
    L_0x0012:
        r0 = r7.getAction();
        r1 = 2;
        r2 = 1;
        if (r0 != r1) goto L_0x0020;
    L_0x001a:
        r0 = r4.b;
        if (r0 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0020;
    L_0x001f:
        return r2;
    L_0x0020:
        r0 = r7.getActionMasked();
        r3 = 0;
        if (r0 == 0) goto L_0x005f;
    L_0x0027:
        r5 = -1;
        if (r0 == r2) goto L_0x0050;
    L_0x002a:
        if (r0 == r1) goto L_0x0030;
    L_0x002c:
        r6 = 3;
        if (r0 == r6) goto L_0x0050;
    L_0x002f:
        goto L_0x0082;
    L_0x0030:
        r6 = r4.d;
        if (r6 == r5) goto L_0x0082;
    L_0x0034:
        r6 = r7.findPointerIndex(r6);
        if (r6 == r5) goto L_0x0082;
    L_0x003a:
        r5 = r7.getY(r6);
        r5 = (int) r5;
        r6 = r4.e;
        r6 = r5 - r6;
        r6 = java.lang.Math.abs(r6);
        r0 = r4.f;
        if (r6 <= r0) goto L_0x0082;
    L_0x004b:
        r4.b = r2;
        r4.e = r5;
        goto L_0x0082;
    L_0x0050:
        r4.b = r3;
        r4.d = r5;
        r5 = r4.g;
        if (r5 == 0) goto L_0x0082;
    L_0x0058:
        r5.recycle();
        r5 = 0;
        r4.g = r5;
        goto L_0x0082;
    L_0x005f:
        r4.b = r3;
        r0 = r7.getX();
        r0 = (int) r0;
        r1 = r7.getY();
        r1 = (int) r1;
        r2 = r4.b();
        if (r2 == 0) goto L_0x0082;
    L_0x0071:
        r5 = r5.a(r6, r0, r1);
        if (r5 == 0) goto L_0x0082;
    L_0x0077:
        r4.e = r1;
        r5 = r7.getPointerId(r3);
        r4.d = r5;
        r4.d();
    L_0x0082:
        r5 = r4.g;
        if (r5 == 0) goto L_0x0089;
    L_0x0086:
        r5.addMovement(r7);
    L_0x0089:
        r5 = r4.b;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:10:0x002a, code skipped:
            if (r0 != 3) goto L_0x00f8;
     */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
        r19 = this;
        r6 = r19;
        r1 = r20;
        r2 = r21;
        r7 = r22;
        r0 = r6.f;
        if (r0 >= 0) goto L_0x001a;
    L_0x000c:
        r0 = r20.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r6.f = r0;
    L_0x001a:
        r0 = r22.getActionMasked();
        r8 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x00d7;
    L_0x0022:
        r4 = 0;
        r5 = -1;
        if (r0 == r8) goto L_0x0068;
    L_0x0026:
        r9 = 2;
        if (r0 == r9) goto L_0x002e;
    L_0x0029:
        r1 = 3;
        if (r0 == r1) goto L_0x00c9;
    L_0x002c:
        goto L_0x00f8;
    L_0x002e:
        r0 = r6.d;
        r0 = r7.findPointerIndex(r0);
        if (r0 == r5) goto L_0x0067;
    L_0x0036:
        r0 = r7.getY(r0);
        r0 = (int) r0;
        r3 = r6.e;
        r3 = r3 - r0;
        r4 = r6.b;
        if (r4 != 0) goto L_0x0051;
    L_0x0042:
        r4 = java.lang.Math.abs(r3);
        r5 = r6.f;
        if (r4 <= r5) goto L_0x0051;
    L_0x004a:
        r6.b = r8;
        if (r3 <= 0) goto L_0x0050;
    L_0x004e:
        r3 = r3 - r5;
        goto L_0x0051;
    L_0x0050:
        r3 = r3 + r5;
    L_0x0051:
        r4 = r6.b;
        if (r4 == 0) goto L_0x00f8;
    L_0x0055:
        r6.e = r0;
        r4 = r6.b(r2);
        r5 = 0;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r0.c(r1, r2, r3, r4, r5);
        goto L_0x00f8;
    L_0x0067:
        return r3;
    L_0x0068:
        r0 = r6.g;
        if (r0 == 0) goto L_0x00c9;
    L_0x006c:
        r0.addMovement(r7);
        r0 = r6.g;
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r9);
        r0 = r6.g;
        r9 = r6.d;
        r0 = r0.getYVelocity(r9);
        r9 = r6.a(r2);
        r9 = -r9;
        r10 = r6.a;
        if (r10 == 0) goto L_0x008c;
    L_0x0087:
        r2.removeCallbacks(r10);
        r6.a = r4;
    L_0x008c:
        r10 = r6.c;
        if (r10 != 0) goto L_0x009b;
    L_0x0090:
        r10 = new android.widget.OverScroller;
        r11 = r21.getContext();
        r10.<init>(r11);
        r6.c = r10;
    L_0x009b:
        r10 = r6.c;
        r11 = 0;
        r12 = r19.c();
        r13 = 0;
        r14 = java.lang.Math.round(r0);
        r15 = 0;
        r16 = 0;
        r18 = 0;
        r17 = r9;
        r10.fling(r11, r12, r13, r14, r15, r16, r17, r18);
        r0 = r6.c;
        r0 = r0.computeScrollOffset();
        if (r0 == 0) goto L_0x00c6;
    L_0x00b9:
        r0 = new em;
        r0.<init>(r6, r1, r2);
        r6.a = r0;
        r0 = r6.a;
        defpackage.abe.a(r2, r0);
        goto L_0x00c9;
    L_0x00c6:
        r19.a(r20, r21);
    L_0x00c9:
        r6.b = r3;
        r6.d = r5;
        r0 = r6.g;
        if (r0 == 0) goto L_0x00f8;
    L_0x00d1:
        r0.recycle();
        r6.g = r4;
        goto L_0x00f8;
    L_0x00d7:
        r0 = r22.getX();
        r4 = r22.getY();
        r4 = (int) r4;
        r0 = (int) r0;
        r0 = r1.a(r2, r0, r4);
        if (r0 == 0) goto L_0x0100;
    L_0x00e7:
        r0 = r19.b();
        if (r0 == 0) goto L_0x0100;
    L_0x00ed:
        r6.e = r4;
        r0 = r7.getPointerId(r3);
        r6.d = r0;
        r19.d();
    L_0x00f8:
        r0 = r6.g;
        if (r0 == 0) goto L_0x00ff;
    L_0x00fc:
        r0.addMovement(r7);
    L_0x00ff:
        return r8;
    L_0x0100:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final int a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        return a(coordinatorLayout, view, i, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
    }

    public final int c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return a(coordinatorLayout, view, a() - i, i2, i3);
    }

    private final void d() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
