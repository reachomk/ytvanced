package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: ugw */
public abstract class ugw extends ViewGroup {
    private static final Interpolator d = new ugz();
    private final int a;
    private boolean b = false;
    private final boolean c = true;
    public final float[] j = new float[]{0.0f, 0.0f};
    public final int[] k = new int[]{-2147483647, Integer.MAX_VALUE};
    public final int l;
    public final int m;
    public float n = 0.0f;
    public VelocityTracker o;
    public boolean p = false;
    public boolean q = false;
    public final Scroller r;

    public ugw(Context context) {
        super(context);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, d);
    }

    public void a() {
    }

    public void a(float f) {
    }

    public void b() {
    }

    public ugw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, d);
    }

    public ugw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, d);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.c) {
            if (this.p) {
                this.p = false;
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                b(motionEvent);
                if (this.r.isFinished()) {
                    this.q = true;
                } else {
                    c();
                    return true;
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - this.j[0];
                float y = motionEvent.getY() - this.j[1];
                int i = this.a;
                float f = (float) i;
                Object obj = (x > f || x < ((float) (-i))) ? 1 : null;
                if ((y > f || y < ((float) (-i))) && obj == null) {
                    b(motionEvent);
                    c();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            if (r0 != 3) goto L_0x00ad;
     */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getAction();
        r1 = r13.o;
        if (r1 != 0) goto L_0x000e;
    L_0x0008:
        r1 = android.view.VelocityTracker.obtain();
        r13.o = r1;
    L_0x000e:
        r1 = r13.o;
        r1.addMovement(r14);
        r1 = r13.p;
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x002d;
    L_0x0019:
        r14 = r13.a(r14);
        if (r14 != 0) goto L_0x002c;
    L_0x001f:
        if (r0 != r3) goto L_0x002c;
    L_0x0021:
        r14 = r13.q;
        if (r14 == 0) goto L_0x002c;
    L_0x0025:
        r13.q = r2;
        r14 = r13.performClick();
        return r14;
    L_0x002c:
        return r3;
    L_0x002d:
        r1 = 3;
        if (r0 == r3) goto L_0x0052;
    L_0x0030:
        r4 = 2;
        if (r0 == r4) goto L_0x0037;
    L_0x0033:
        if (r0 == r1) goto L_0x0052;
    L_0x0035:
        goto L_0x00ad;
    L_0x0037:
        r0 = r13.j;
        r0 = r0[r3];
        r13.b(r14);
        r14 = r13.j;
        r14 = r14[r3];
        r1 = r13.getScrollY();
        r0 = r0 - r14;
        r14 = java.lang.Math.round(r0);
        r1 = r1 + r14;
        r13.a(r1);
        r13.q = r2;
        goto L_0x00ad;
    L_0x0052:
        r13.p = r2;
        r14 = 0;
        if (r0 == r1) goto L_0x009e;
    L_0x0057:
        r0 = r13.getChildCount();
        if (r0 > 0) goto L_0x005e;
    L_0x005d:
        goto L_0x009e;
    L_0x005e:
        r0 = r13.o;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r13.l;
        r4 = (float) r4;
        r0.computeCurrentVelocity(r1, r4);
        r0 = r13.o;
        r0 = r0.getYVelocity();
        r1 = r13.m;
        r4 = (float) r1;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0080;
    L_0x0076:
        r1 = -r1;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 < 0) goto L_0x0080;
    L_0x007c:
        r13.a(r14);
        goto L_0x00a1;
    L_0x0080:
        r14 = -r0;
        r13.n = r14;
        r5 = r13.getScrollX();
        r6 = r13.getScrollY();
        r4 = r13.r;
        r0 = r13.k;
        r7 = 0;
        r8 = (int) r14;
        r9 = 0;
        r10 = 0;
        r11 = r0[r2];
        r12 = r0[r3];
        r4.fling(r5, r6, r7, r8, r9, r10, r11, r12);
        r13.invalidate();
        goto L_0x00a1;
    L_0x009e:
        r13.a(r14);
    L_0x00a1:
        r14 = r13.o;
        if (r14 == 0) goto L_0x00ab;
    L_0x00a5:
        r14.recycle();
        r14 = 0;
        r13.o = r14;
    L_0x00ab:
        r13.q = r2;
    L_0x00ad:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(MotionEvent motionEvent) {
        this.j[0] = motionEvent.getX();
        this.j[1] = motionEvent.getY();
    }

    private final void c() {
        if (!this.p && this.r.isFinished()) {
            a();
            this.b = true;
        }
        this.p = true;
        this.n = 0.0f;
        this.r.abortAnimation();
    }

    public final void a(int i) {
        this.r.forceFinished(true);
        scrollTo(0, b(i));
    }

    public final void a(int i, int i2) {
        int[] iArr = this.k;
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void computeScroll() {
        if (this.r.computeScrollOffset()) {
            int currY = this.r.getCurrY();
            scrollTo(0, currY);
            invalidate();
            float f = this.n;
            if (f != 0.0f) {
                a(f);
                this.n = 0.0f;
            }
            if (currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                if (this.b) {
                    this.b = false;
                    b();
                }
            }
        }
    }

    private final int b(int i) {
        int[] iArr = this.k;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i <= i3 ? i : i3;
    }

    public final void a(int i, boolean z) {
        if (z) {
            i = b(i);
        }
        this.r.startScroll(0, getScrollY(), 0, i - getScrollY(), 500);
        invalidate();
    }
}
