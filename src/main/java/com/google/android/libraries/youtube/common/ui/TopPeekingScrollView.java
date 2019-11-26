package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.xpf;
import defpackage.xpn;

public class TopPeekingScrollView extends xpn {
    private static final Rect n = new Rect();
    public int k;
    public View l;
    public View m;
    private float o;
    private int p;
    private int q;

    public TopPeekingScrollView(Context context) {
        this(context, null);
    }

    public TopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = context.obtainStyledAttributes(attributeSet, xpf.d).getBoolean(xpf.e, false);
    }

    public final void c(int i) {
        a(i, i, false);
    }

    public final void d(int i) {
        a(i, i, true);
    }

    public final void a(int i, int i2, boolean z) {
        this.k = i;
        this.p = i2;
        if (z) {
            i = 0;
            a(0, i2);
            if (getScrollY() != 0) {
                i = this.p;
            }
            a(i);
        }
        requestLayout();
    }

    public void onMeasure(int i, int i2) {
        i2 = MeasureSpec.getSize(i2);
        int i3 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, MeasureSpec.makeMeasureSpec(i2, 1073741824));
            i3 = Math.max(0, childAt.getMeasuredWidth());
        }
        setMeasuredDimension(i3, i2 + this.k);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n.set(i, i2, i3, this.k);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i3 -= i;
            childAt.layout((i3 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i3 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
        }
        a(0, this.p);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("TopPeekingScrollView can host only one direct child");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            if (getScrollY() < this.p) {
                return true;
            }
            View view = this.m;
            if (!(view == null || view.canScrollVertically(-1) || motionEvent.getY() < this.o)) {
                return true;
            }
        }
        this.o = motionEvent.getY();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Missing block: B:23:0x0065, code skipped:
            if (r2 != 3) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:52:0x00fa, code skipped:
            if (getScrollY() > 0) goto L_0x00fe;
     */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.g;
        if (r2 != 0) goto L_0x0030;
    L_0x0008:
        r2 = n;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0030;
    L_0x0010:
        r2 = r0.l;
        if (r2 == 0) goto L_0x0030;
    L_0x0014:
        r2 = r18.getX();
        r3 = r18.getY();
        r4 = r17.getScrollY();
        r5 = n;
        r2 = (int) r2;
        r3 = (int) r3;
        r3 = r3 + r4;
        r2 = r5.contains(r2, r3);
        if (r2 == 0) goto L_0x0030;
    L_0x002b:
        r2 = r0.l;
        r2.dispatchTouchEvent(r1);
    L_0x0030:
        r2 = r18.getAction();
        r3 = r0.f;
        if (r3 != 0) goto L_0x003e;
    L_0x0038:
        r3 = android.view.VelocityTracker.obtain();
        r0.f = r3;
    L_0x003e:
        r3 = r0.f;
        r3.addMovement(r1);
        r3 = r0.g;
        r4 = 2;
        r5 = 0;
        r6 = 0;
        r7 = 1;
        if (r3 != 0) goto L_0x0060;
    L_0x004b:
        r3 = r17.a(r18);
        if (r3 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0067;
    L_0x0052:
        if (r2 != r7) goto L_0x0067;
    L_0x0054:
        r2 = r0.h;
        if (r2 == 0) goto L_0x0067;
    L_0x0058:
        r0.h = r6;
        r2 = r17.performClick();
        goto L_0x00d6;
    L_0x0060:
        r3 = 3;
        if (r2 == r7) goto L_0x0084;
    L_0x0063:
        if (r2 == r4) goto L_0x0069;
    L_0x0065:
        if (r2 == r3) goto L_0x0084;
    L_0x0067:
        r2 = 1;
        goto L_0x00d6;
    L_0x0069:
        r2 = r0.a;
        r2 = r2[r7];
        r17.b(r18);
        r3 = r0.a;
        r3 = r3[r7];
        r8 = r17.getScrollY();
        r2 = r2 - r3;
        r2 = java.lang.Math.round(r2);
        r8 = r8 + r2;
        r0.a(r8);
        r0.h = r6;
        goto L_0x0067;
    L_0x0084:
        r0.g = r6;
        if (r2 == r3) goto L_0x00ca;
    L_0x0088:
        r2 = r17.getChildCount();
        if (r2 > 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00ca;
    L_0x008f:
        r2 = r0.f;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r0.c;
        r8 = (float) r8;
        r2.computeCurrentVelocity(r3, r8);
        r2 = r0.f;
        r2 = r2.getYVelocity();
        r3 = r0.d;
        r8 = (float) r3;
        r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00ad;
    L_0x00a7:
        r3 = -r3;
        r3 = (float) r3;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x00ca;
    L_0x00ad:
        r2 = -r2;
        r0.e = r2;
        r9 = r17.getScrollX();
        r10 = r17.getScrollY();
        r8 = r0.j;
        r3 = r0.b;
        r11 = 0;
        r12 = (int) r2;
        r13 = 0;
        r14 = 0;
        r15 = r3[r6];
        r16 = r3[r7];
        r8.fling(r9, r10, r11, r12, r13, r14, r15, r16);
        r17.invalidate();
    L_0x00ca:
        r2 = r0.f;
        if (r2 == 0) goto L_0x00d3;
    L_0x00ce:
        r2.recycle();
        r0.f = r5;
    L_0x00d3:
        r0.h = r6;
        goto L_0x0067;
    L_0x00d6:
        if (r2 == 0) goto L_0x011b;
    L_0x00d8:
        r1 = r18.getActionMasked();
        if (r1 == r7) goto L_0x00df;
    L_0x00de:
        goto L_0x011b;
    L_0x00df:
        r1 = r0.q;
        if (r1 == 0) goto L_0x011b;
    L_0x00e3:
        if (r1 == 0) goto L_0x011a;
    L_0x00e5:
        if (r1 == r7) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00f0;
    L_0x00e8:
        r1 = r17.getScrollY();
        r3 = r0.p;
        if (r1 < r3) goto L_0x00fe;
    L_0x00f0:
        r1 = r0.q;
        if (r1 == 0) goto L_0x00fd;
    L_0x00f4:
        if (r1 != r4) goto L_0x011b;
    L_0x00f6:
        r1 = r17.getScrollY();
        if (r1 <= 0) goto L_0x011b;
    L_0x00fc:
        goto L_0x00fe;
    L_0x00fd:
        throw r5;
    L_0x00fe:
        r1 = r0.j;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x010b;
    L_0x0106:
        r1 = r0.j;
        r1.abortAnimation();
    L_0x010b:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0119;
    L_0x010f:
        if (r1 != r7) goto L_0x0115;
    L_0x0111:
        r17.a();
        goto L_0x011b;
    L_0x0115:
        r0.b(r6);
        goto L_0x011b;
    L_0x0119:
        throw r5;
    L_0x011a:
        throw r5;
    L_0x011b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.common.ui.TopPeekingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a() {
        b(this.p);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.q = i2 - i4 > 0 ? 1 : 2;
    }
}
