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

/* renamed from: xpn */
public abstract class xpn extends ViewGroup {
    private static final Interpolator m = new xpm();
    public final float[] a = new float[]{0.0f, 0.0f};
    public final int[] b = new int[]{-2147483647, Integer.MAX_VALUE};
    public final int c;
    public final int d;
    public float e = 0.0f;
    public VelocityTracker f;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public final Scroller j;
    private final int k;
    private boolean l = false;

    public xpn(Context context) {
        super(context);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.k = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, m);
    }

    public xpn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.k = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, m);
    }

    public xpn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.k = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, m);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.g) {
            this.g = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            b(motionEvent);
            if (this.j.isFinished()) {
                this.h = true;
            } else {
                a();
                return true;
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.a[0];
            float y = motionEvent.getY() - this.a[1];
            int i = this.k;
            float f = (float) i;
            Object obj = (x > f || x < ((float) (-i))) ? 1 : null;
            if ((y > f || y < ((float) (-i))) && (obj == null || this.i)) {
                b(motionEvent);
                a();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            if (r0 != 3) goto L_0x00a4;
     */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getAction();
        r1 = r13.f;
        if (r1 != 0) goto L_0x000e;
    L_0x0008:
        r1 = android.view.VelocityTracker.obtain();
        r13.f = r1;
    L_0x000e:
        r1 = r13.f;
        r1.addMovement(r14);
        r1 = r13.g;
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x002d;
    L_0x0019:
        r14 = r13.a(r14);
        if (r14 != 0) goto L_0x002c;
    L_0x001f:
        if (r0 != r3) goto L_0x002c;
    L_0x0021:
        r14 = r13.h;
        if (r14 == 0) goto L_0x002c;
    L_0x0025:
        r13.h = r2;
        r14 = r13.performClick();
        return r14;
    L_0x002c:
        return r3;
    L_0x002d:
        r1 = 3;
        if (r0 == r3) goto L_0x0051;
    L_0x0030:
        r4 = 2;
        if (r0 == r4) goto L_0x0036;
    L_0x0033:
        if (r0 == r1) goto L_0x0051;
    L_0x0035:
        goto L_0x00a4;
    L_0x0036:
        r0 = r13.a;
        r0 = r0[r3];
        r13.b(r14);
        r14 = r13.a;
        r14 = r14[r3];
        r1 = r13.getScrollY();
        r0 = r0 - r14;
        r14 = java.lang.Math.round(r0);
        r1 = r1 + r14;
        r13.a(r1);
        r13.h = r2;
        goto L_0x00a4;
    L_0x0051:
        r13.g = r2;
        if (r0 == r1) goto L_0x0098;
    L_0x0055:
        r14 = r13.getChildCount();
        if (r14 > 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0098;
    L_0x005c:
        r14 = r13.f;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r13.c;
        r1 = (float) r1;
        r14.computeCurrentVelocity(r0, r1);
        r14 = r13.f;
        r14 = r14.getYVelocity();
        r0 = r13.d;
        r1 = (float) r0;
        r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0074;
    L_0x0073:
        goto L_0x007b;
    L_0x0074:
        r0 = -r0;
        r0 = (float) r0;
        r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0098;
    L_0x007b:
        r14 = -r14;
        r13.e = r14;
        r5 = r13.getScrollX();
        r6 = r13.getScrollY();
        r4 = r13.j;
        r0 = r13.b;
        r7 = 0;
        r8 = (int) r14;
        r9 = 0;
        r10 = 0;
        r11 = r0[r2];
        r12 = r0[r3];
        r4.fling(r5, r6, r7, r8, r9, r10, r11, r12);
        r13.invalidate();
    L_0x0098:
        r14 = r13.f;
        if (r14 == 0) goto L_0x00a2;
    L_0x009c:
        r14.recycle();
        r14 = 0;
        r13.f = r14;
    L_0x00a2:
        r13.h = r2;
    L_0x00a4:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpn.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    public final void b(MotionEvent motionEvent) {
        this.a[0] = motionEvent.getX();
        this.a[1] = motionEvent.getY();
    }

    private final void a() {
        if (!this.g && this.j.isFinished()) {
            this.l = true;
        }
        this.g = true;
        this.e = 0.0f;
        this.j.abortAnimation();
    }

    public final void a(int i) {
        this.j.forceFinished(true);
        scrollTo(0, c(i));
    }

    public final void a(int i, int i2) {
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void computeScroll() {
        if (this.j.computeScrollOffset()) {
            int currY = this.j.getCurrY();
            scrollTo(0, currY);
            invalidate();
            if (this.e != 0.0f) {
                this.e = 0.0f;
            }
            if (currY == this.j.getFinalY()) {
                this.j.abortAnimation();
                if (this.l) {
                    this.l = false;
                }
            }
        }
    }

    private final int c(int i) {
        int[] iArr = this.b;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i <= i3 ? i : i3;
    }

    public final void b(int i) {
        this.j.startScroll(0, getScrollY(), 0, c(i) - getScrollY(), 500);
        invalidate();
    }
}
