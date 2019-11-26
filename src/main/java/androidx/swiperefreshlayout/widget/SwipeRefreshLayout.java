package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import defpackage.aau;
import defpackage.aaw;
import defpackage.aax;
import defpackage.aay;
import defpackage.aaz;
import defpackage.abb;
import defpackage.abe;
import defpackage.beq;
import defpackage.bes;
import defpackage.bet;
import defpackage.bev;
import defpackage.bew;
import defpackage.bex;
import defpackage.bey;
import defpackage.bez;
import defpackage.bfa;
import defpackage.bfb;
import defpackage.bfd;

public class SwipeRefreshLayout extends ViewGroup implements aau, aaw, aay, aaz {
    private static final int[] C = new int[]{16842766};
    private static final String l = SwipeRefreshLayout.class.getSimpleName();
    private int A;
    private final DecelerateInterpolator B;
    private int D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    private int I;
    private AnimationListener J;
    private final Animation K;
    private final Animation L;
    public bfd a;
    public boolean b;
    public int c;
    public boolean d;
    public beq e;
    public int f;
    public int g;
    public int h;
    public bes i;
    public boolean j;
    public boolean k;
    private View m;
    private int n;
    private float o;
    private float p;
    private final abb q;
    private final aax r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public final void a() {
        this.e.clearAnimation();
        this.i.stop();
        this.e.setVisibility(8);
        this.e.getBackground().setAlpha(255);
        this.i.setAlpha(255);
        b(this.g - this.c);
        this.c = this.e.getTop();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.D = -1;
        this.J = new bev(this);
        this.K = new bfb(this);
        this.L = new bfa(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        this.e = new beq(getContext());
        this.i = new bes(getContext());
        bes bes = this.i;
        bet bet = bes.a;
        float f = bes.b.getDisplayMetrics().density;
        bet.a(2.5f * f);
        bet.p = 7.5f * f;
        bet.a(0);
        bet.q = (int) (10.0f * f);
        bet.r = (int) (f * 5.0f);
        bes.invalidateSelf();
        this.e.setImageDrawable(this.i);
        this.e.setVisibility(8);
        addView(this.e);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.h = i;
        this.o = (float) i;
        this.q = new abb();
        this.r = new aax(this);
        setNestedScrollingEnabled(true);
        i = -this.I;
        this.c = i;
        this.g = i;
        b(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.D;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public final void a(boolean z) {
        if (z) {
            if (!this.b) {
                this.b = true;
                b((this.h + this.g) - this.c);
                this.j = false;
                AnimationListener animationListener = this.J;
                this.e.setVisibility(0);
                this.i.setAlpha(255);
                this.E = new bex(this);
                this.E.setDuration((long) this.w);
                if (animationListener != null) {
                    this.e.a = animationListener;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.E);
                return;
            }
            z = true;
        }
        a(z, false);
    }

    public final void a(float f) {
        this.e.setScaleX(f);
        this.e.setScaleY(f);
    }

    private final void a(boolean z, boolean z2) {
        if (this.b != z) {
            this.j = z2;
            b();
            this.b = z;
            if (z) {
                int i = this.c;
                AnimationListener animationListener = this.J;
                this.f = i;
                this.K.reset();
                this.K.setDuration(200);
                this.K.setInterpolator(this.B);
                if (animationListener != null) {
                    this.e.a = animationListener;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.K);
                return;
            }
            a(this.J);
        }
    }

    public final void a(AnimationListener animationListener) {
        this.F = new bew(this);
        this.F.setDuration(150);
        beq beq = this.e;
        beq.a = animationListener;
        beq.clearAnimation();
        this.e.startAnimation(this.F);
    }

    private final Animation a(int i, int i2) {
        bez bez = new bez(this, i, i2);
        bez.setDuration(300);
        beq beq = this.e;
        beq.a = null;
        beq.clearAnimation();
        this.e.startAnimation(bez);
        return bez;
    }

    public final void a(int i) {
        this.e.setBackgroundColor(i);
    }

    public final void a(int... iArr) {
        b();
        bes bes = this.i;
        bes.a.a(iArr);
        bes.a.a(0);
        bes.invalidateSelf();
    }

    private final void b() {
        if (this.m == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.e)) {
                    i++;
                } else {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        i = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.m == null) {
                b();
            }
            View view = this.m;
            if (view != null) {
                i3 = getPaddingLeft();
                i4 = getPaddingTop();
                view.layout(i3, i4, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + i3, ((i - getPaddingTop()) - getPaddingBottom()) + i4);
                i = this.e.getMeasuredWidth();
                i2 = this.e.getMeasuredHeight();
                beq beq = this.e;
                measuredWidth /= 2;
                i /= 2;
                i4 = this.c;
                beq.layout(measuredWidth - i, i4, measuredWidth + i, i2 + i4);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            b();
        }
        View view = this.m;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.e.measure(MeasureSpec.makeMeasureSpec(this.I, 1073741824), MeasureSpec.makeMeasureSpec(this.I, 1073741824));
            this.D = -1;
            i = 0;
            while (i < getChildCount()) {
                if (getChildAt(i) != this.e) {
                    i++;
                } else {
                    this.D = i;
                    return;
                }
            }
        }
    }

    private final boolean c() {
        View view = this.m;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!(!isEnabled() || c() || this.b || this.v)) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        actionMasked = this.A;
                        if (actionMasked == -1) {
                            Log.e(l, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        actionMasked = motionEvent.findPointerIndex(actionMasked);
                        if (actionMasked < 0) {
                            return false;
                        }
                        e(motionEvent.getY(actionMasked));
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            a(motionEvent);
                        }
                    }
                }
                this.z = false;
                this.A = -1;
            } else {
                b(this.g - this.e.getTop());
                actionMasked = motionEvent.getPointerId(0);
                this.A = actionMasked;
                this.z = false;
                actionMasked = motionEvent.findPointerIndex(actionMasked);
                if (actionMasked >= 0) {
                    this.y = motionEvent.getY(actionMasked);
                }
            }
            return this.z;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.m instanceof AbsListView)) {
            View view = this.m;
            if (view == null || abe.A(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            i5 = iArr[1];
            this.r.a(i, i2, i3, i4, this.t, 0, iArr);
            i = i4 - (iArr[1] - i5);
            i2 = i == 0 ? this.t[1] + i4 : i;
            if (i2 < 0 && !c()) {
                float abs = this.p + ((float) Math.abs(i2));
                this.p = abs;
                c(abs);
                iArr[1] = iArr[1] + i;
            }
        }
    }

    public final boolean a(View view, View view2, int i, int i2) {
        return i2 == 0 ? onStartNestedScroll(view, view2, i) : false;
    }

    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, i5, this.u);
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.b || (i & 2) == 0) ? false : true;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.a(i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = (float) i2;
                if (f3 <= f) {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                } else {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                }
                c(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    public final void onStopNestedScroll(View view) {
        this.q.b(0);
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            d(f);
            this.p = 0.0f;
        }
        stopNestedScroll();
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(view, i, i2, i3, i4, 0, this.u);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public final boolean startNestedScroll(int i) {
        return this.r.b(i);
    }

    public final void stopNestedScroll() {
        this.r.b();
    }

    public final boolean hasNestedScrollingParent() {
        return this.r.a();
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.a(i, i2, i3, i4, iArr);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.a(i, i2, iArr, iArr2);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.a(f, f2);
    }

    private static boolean a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private final void c(float f) {
        this.i.a(true);
        float min = Math.min(1.0f, Math.abs(f / this.o));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 11.2d, 0.0d)) * 5.0f) / 3.0f;
        float f2 = (float) this.h;
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f) - this.o, f2 + f2) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = (float) (max2 - pow);
        f3 += f3;
        float f4 = f2 * f3;
        int i = this.g + ((int) ((f2 * min) + (f4 + f4)));
        if (this.e.getVisibility() != 0) {
            this.e.setVisibility(0);
        }
        this.e.setScaleX(1.0f);
        this.e.setScaleY(1.0f);
        if (f < this.o) {
            if (this.i.getAlpha() > 76 && !a(this.G)) {
                this.G = a(this.i.getAlpha(), 76);
            }
        } else if (this.i.getAlpha() < 255 && !a(this.H)) {
            this.H = a(this.i.getAlpha(), 255);
        }
        this.i.b(Math.min(0.8f, max * 0.8f));
        this.i.a(Math.min(1.0f, max));
        bes bes = this.i;
        bes.a.g = (((max * 0.4f) - 16.0f) + (f3 + f3)) * 0.5f;
        bes.invalidateSelf();
        b(i - this.c);
    }

    private final void d(float f) {
        if (f > this.o) {
            a(true, true);
            return;
        }
        this.b = false;
        this.i.b(0.0f);
        bey bey = new bey(this);
        this.f = this.c;
        this.L.reset();
        this.L.setDuration(200);
        this.L.setInterpolator(this.B);
        beq beq = this.e;
        beq.a = bey;
        beq.clearAnimation();
        this.e.startAnimation(this.L);
        this.i.a(false);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || c() || this.b || this.v) {
            return false;
        }
        float y;
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        } else if (actionMasked == 1) {
            actionMasked = motionEvent.findPointerIndex(this.A);
            if (actionMasked < 0) {
                Log.e(l, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.z) {
                y = motionEvent.getY(actionMasked);
                float f = this.x;
                this.z = false;
                d((y - f) * 0.5f);
            }
            this.A = -1;
            return false;
        } else if (actionMasked == 2) {
            actionMasked = motionEvent.findPointerIndex(this.A);
            if (actionMasked < 0) {
                Log.e(l, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            y = motionEvent.getY(actionMasked);
            e(y);
            if (this.z) {
                y = (y - this.x) * 0.5f;
                if (y <= 0.0f) {
                    return false;
                }
                c(y);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                actionMasked = motionEvent.getActionIndex();
                if (actionMasked < 0) {
                    Log.e(l, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.A = motionEvent.getPointerId(actionMasked);
            } else if (actionMasked == 6) {
                a(motionEvent);
            }
        }
        return true;
    }

    private final void e(float f) {
        float f2 = this.y;
        float f3 = (float) this.n;
        if (f - f2 > f3 && !this.z) {
            this.x = f2 + f3;
            this.z = true;
            this.i.setAlpha(76);
        }
    }

    public final void b(float f) {
        int i = this.f;
        b((i + ((int) (((float) (this.g - i)) * f))) - this.e.getTop());
    }

    public final void b(int i) {
        this.e.bringToFront();
        abe.d(this.e, i);
        this.c = this.e.getTop();
    }

    private final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
