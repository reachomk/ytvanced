package defpackage;

import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

/* renamed from: ugj */
public final class ugj implements ugy {
    private final /* synthetic */ ExpandingScrollView a;

    public ugj(ExpandingScrollView expandingScrollView) {
        this.a = expandingScrollView;
    }

    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            if (r1 != 3) goto L_0x00ae;
     */
    public final boolean a(android.view.MotionEvent r15) {
        /*
        r14 = this;
        r0 = r14.a;
        r1 = r15.getAction();
        r2 = r0.o;
        if (r2 != 0) goto L_0x0010;
    L_0x000a:
        r2 = android.view.VelocityTracker.obtain();
        r0.o = r2;
    L_0x0010:
        r2 = r0.o;
        r2.addMovement(r15);
        r2 = r0.p;
        r3 = 0;
        r4 = 1;
        if (r2 != 0) goto L_0x002e;
    L_0x001b:
        r15 = r0.a(r15);
        if (r15 != 0) goto L_0x00ae;
    L_0x0021:
        if (r1 != r4) goto L_0x00ae;
    L_0x0023:
        r15 = r0.q;
        if (r15 == 0) goto L_0x00ae;
    L_0x0027:
        r0.q = r3;
        r15 = r0.performClick();
        return r15;
    L_0x002e:
        r2 = 3;
        if (r1 == r4) goto L_0x0053;
    L_0x0031:
        r5 = 2;
        if (r1 == r5) goto L_0x0038;
    L_0x0034:
        if (r1 == r2) goto L_0x0053;
    L_0x0036:
        goto L_0x00ae;
    L_0x0038:
        r1 = r0.j;
        r1 = r1[r4];
        r0.b(r15);
        r15 = r0.j;
        r15 = r15[r4];
        r2 = r0.getScrollY();
        r1 = r1 - r15;
        r15 = java.lang.Math.round(r1);
        r2 = r2 + r15;
        r0.a(r2);
        r0.q = r3;
        return r4;
    L_0x0053:
        r0.p = r3;
        r15 = 0;
        if (r1 == r2) goto L_0x009f;
    L_0x0058:
        r1 = r0.getChildCount();
        if (r1 > 0) goto L_0x005f;
    L_0x005e:
        goto L_0x009f;
    L_0x005f:
        r1 = r0.o;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r0.l;
        r5 = (float) r5;
        r1.computeCurrentVelocity(r2, r5);
        r1 = r0.o;
        r1 = r1.getYVelocity();
        r2 = r0.m;
        r5 = (float) r2;
        r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0081;
    L_0x0077:
        r2 = -r2;
        r2 = (float) r2;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0081;
    L_0x007d:
        r0.a(r15);
        goto L_0x00a2;
    L_0x0081:
        r15 = -r1;
        r0.n = r15;
        r6 = r0.getScrollX();
        r7 = r0.getScrollY();
        r5 = r0.r;
        r1 = r0.k;
        r8 = 0;
        r9 = (int) r15;
        r10 = 0;
        r11 = 0;
        r12 = r1[r3];
        r13 = r1[r4];
        r5.fling(r6, r7, r8, r9, r10, r11, r12, r13);
        r0.invalidate();
        goto L_0x00a2;
    L_0x009f:
        r0.a(r15);
    L_0x00a2:
        r15 = r0.o;
        if (r15 == 0) goto L_0x00ac;
    L_0x00a6:
        r15.recycle();
        r15 = 0;
        r0.o = r15;
    L_0x00ac:
        r0.q = r3;
    L_0x00ae:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugj.a(android.view.MotionEvent):boolean");
    }
}
