package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import defpackage.aau;
import defpackage.aax;
import defpackage.aay;
import defpackage.abb;
import defpackage.abe;
import defpackage.acx;
import defpackage.adf;
import defpackage.adg;
import defpackage.adh;
import defpackage.aocf;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements aau, aay {
    private static final adf x = new adf();
    private static final int[] y = new int[]{16843130};
    private final aax A;
    private float B;
    public adh a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private adg w;
    private final abb z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private static int b(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    public final boolean a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.z = new abb();
        this.A = new aax(this);
        setNestedScrollingEnabled(true);
        abe.a((View) this, x);
    }

    private final void a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.A.a(0, i, 0, i2, iArr, i3, iArr2);
    }

    private final boolean a(int i, int i2) {
        return this.A.a(i, i2);
    }

    private final void c(int i) {
        this.A.c(i);
    }

    private final boolean d(int i) {
        return this.A.a(i);
    }

    private final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.A.a(i, i2, iArr, iArr2, i3);
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.A.a(z);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    public final boolean startNestedScroll(int i) {
        return a(i, 0);
    }

    public void stopNestedScroll() {
        c(0);
    }

    public final boolean hasNestedScrollingParent() {
        return d(0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A.a(i, i2, i3, i4, iArr);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A.a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A.a(f, f2);
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(i4, i5, iArr);
    }

    private final void a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void b(View view, View view2, int i, int i2) {
        this.z.a(i, i2);
        a(2, i2);
    }

    public final void a(View view, int i) {
        this.z.b(i);
        c(i);
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        a(i4, i5, null);
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        a(i, i2, iArr, null, i3);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(i4, 0, null);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        b((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final int getNestedScrollAxes() {
        return this.z.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        adh adh = this.a;
        if (adh != null) {
            adh.a(this, i, i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        this.c.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    int i = 33;
                    if (keyCode == 19) {
                        z = !keyEvent.isAltPressed() ? f(33) : e(33);
                    } else if (keyCode == 20) {
                        z = !keyEvent.isAltPressed() ? f(130) : e(130);
                    } else if (keyCode == 62) {
                        if (!keyEvent.isShiftPressed()) {
                            i = 130;
                        }
                        int height = getHeight();
                        if (i == 130) {
                            this.c.top = getScrollY() + height;
                            keyCode = getChildCount();
                            if (keyCode > 0) {
                                childAt = getChildAt(keyCode - 1);
                                keyCode = (childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) + getPaddingBottom();
                                if (this.c.top + height > keyCode) {
                                    this.c.top = keyCode - height;
                                }
                            }
                        } else {
                            this.c.top = getScrollY() - height;
                            if (this.c.top < 0) {
                                this.c.top = 0;
                            }
                        }
                        Rect rect = this.c;
                        rect.bottom = rect.top + height;
                        a(i, this.c.top, this.c.bottom);
                        return false;
                    }
                }
                return z;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (!(findFocus == null || findFocus == this || !findFocus.requestFocus(130))) {
                return true;
            }
        }
        return false;
    }

    private final void b() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private final void c() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        action &= 255;
        int findPointerIndex;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    action = this.r;
                    if (action != -1) {
                        findPointerIndex = motionEvent.findPointerIndex(action);
                        if (findPointerIndex == -1) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid pointerId=");
                            stringBuilder.append(action);
                            stringBuilder.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", stringBuilder.toString());
                        } else {
                            action = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(action - this.g) > this.o && (2 & getNestedScrollAxes()) == 0) {
                                this.k = true;
                                this.g = action;
                                b();
                                this.l.addMovement(motionEvent);
                                this.u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (action != 3) {
                    if (action == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.k = false;
            this.r = -1;
            c();
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                abe.e(this);
            }
            c(0);
        } else {
            action = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                findPointerIndex = getScrollY();
                View childAt = getChildAt(0);
                if (action >= childAt.getTop() - findPointerIndex && action < childAt.getBottom() - findPointerIndex && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.g = action;
                    this.r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.l;
                    if (velocityTracker == null) {
                        this.l = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.l.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    this.k = this.d.isFinished() ^ 1;
                    a(2, 0);
                }
            }
            this.k = false;
            c();
        }
        return this.k;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        MotionEvent motionEvent2 = motionEvent;
        b();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.u);
        ViewParent parent;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                actionMasked = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(actionMasked) > this.p) {
                    actionMasked = -actionMasked;
                    float f = (float) actionMasked;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        b(actionMasked);
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    abe.e(this);
                }
                this.r = -1;
                e();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.r);
                if (findPointerIndex == -1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid pointerId=");
                    stringBuilder.append(this.r);
                    stringBuilder.append(" in onTouchEvent");
                    Log.e("NestedScrollView", stringBuilder.toString());
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = this.g - y;
                    if (a(0, i, this.t, this.s, 0)) {
                        i -= this.t[1];
                        obtain.offsetLocation(0.0f, (float) this.s[1]);
                        this.u += this.s[1];
                    }
                    if (!this.k && Math.abs(i) > this.o) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (i > 0) {
                            i -= this.o;
                        } else {
                            i += this.o;
                        }
                    }
                    if (this.k) {
                        this.g = y - this.s[1];
                        y = getScrollY();
                        int a = a();
                        actionMasked = getOverScrollMode();
                        Object obj = (actionMasked != 0 && (actionMasked != 1 || a <= 0)) ? null : 1;
                        if (a(i, 0, getScrollY(), a) && !d(0)) {
                            this.l.clear();
                        }
                        int scrollY = getScrollY() - y;
                        int[] iArr = this.t;
                        iArr[1] = 0;
                        a(scrollY, i - scrollY, this.s, 0, iArr);
                        actionMasked = this.g;
                        scrollY = this.s[1];
                        this.g = actionMasked - scrollY;
                        obtain.offsetLocation(0.0f, (float) scrollY);
                        this.u += this.s[1];
                        if (obj != null) {
                            i -= this.t[1];
                            f();
                            y += i;
                            if (y < 0) {
                                acx.a(this.e, ((float) i) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f.isFinished()) {
                                    this.f.onRelease();
                                }
                            } else if (y > a) {
                                acx.a(this.f, ((float) i) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.e.isFinished()) {
                                    this.e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.e;
                            if (!(edgeEffect == null || (edgeEffect.isFinished() && this.f.isFinished()))) {
                                abe.e(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    abe.e(this);
                }
                this.r = -1;
                e();
            } else if (actionMasked == 5) {
                actionMasked = motionEvent.getActionIndex();
                this.g = (int) motionEvent2.getY(actionMasked);
                this.r = motionEvent2.getPointerId(actionMasked);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            actionMasked = this.d.isFinished() ^ 1;
            this.k = actionMasked;
            if (actionMasked != 0) {
                parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.d.isFinished()) {
                d();
            }
            this.g = (int) motionEvent.getY();
            this.r = motionEvent2.getPointerId(0);
            a(2, 0);
        }
        velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(actionIndex);
            this.r = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.k)) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f = this.B;
                if (f == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.B = f;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int a = a();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * f));
                if (i < 0) {
                    i = 0;
                } else if (i > a) {
                    i = a;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private final boolean a(int i, int i2, int i3, int i4) {
        Object obj;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        i += i3;
        Object obj2 = (i2 <= 0 && i2 >= 0) ? null : 1;
        if (i > i4) {
            obj = 1;
        } else if (i >= 0) {
            i4 = i;
            obj = null;
        } else {
            obj = 1;
            i4 = 0;
        }
        if (!(obj == null || d(1))) {
            this.d.springBack(0, i4, 0, 0, 0, a());
        }
        super.scrollTo(0, i4);
        return (obj2 == null && obj == null) ? false : true;
    }

    public final int a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    private final boolean e(int i) {
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (i == 130) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                this.c.bottom = (childAt.getBottom() + layoutParams.bottomMargin) + getPaddingBottom();
                rect = this.c;
                rect.top = rect.bottom - height;
            }
        }
        return a(i, this.c.top, this.c.bottom);
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i7 = 0;
        Object obj = null;
        while (true) {
            z = true;
            if (i7 >= size) {
                break;
            }
            View view2 = (View) focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                Object obj2 = (i5 < top && bottom < i6) ? 1 : null;
                if (view == null) {
                    view = view2;
                    obj = obj2;
                } else {
                    Object obj3 = (i4 != 33 ? bottom <= view.getBottom() : top >= view.getTop()) ? null : 1;
                    if (obj == null) {
                        if (obj2 != null) {
                            view = view2;
                            obj = 1;
                        } else if (obj3 == null) {
                        }
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                        }
                    }
                    view = view2;
                }
            }
            i7++;
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > height) {
            g(i4 == 33 ? i5 - scrollY : i6 - height);
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    private final boolean f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !a(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                findNextFocus = getChildAt(0);
                height = Math.min((findNextFocus.getBottom() + ((LayoutParams) findNextFocus.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            g(height);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            g(a(this.c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            i = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    private final boolean a(View view) {
        return a(view, 0, getHeight()) ^ 1;
    }

    private final boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    private final void g(int i) {
        if (i == 0) {
            return;
        }
        if (this.n) {
            b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private final void b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom)))) - scrollY);
                a(false);
            } else {
                if (!this.d.isFinished()) {
                    d();
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(int i) {
        b(-getScrollX(), i - getScrollY());
    }

    public final int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    /* Access modifiers changed, original: protected|final */
    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void computeScroll() {
        if (!this.d.isFinished()) {
            this.d.computeScrollOffset();
            int currY = this.d.getCurrY();
            int i = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            iArr[1] = 0;
            a(0, i, iArr, null, 1);
            i -= this.t[1];
            int a = a();
            if (i != 0) {
                int scrollY = getScrollY();
                a(i, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                i -= scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                a(scrollY2, i, this.s, 1, iArr2);
                i -= this.t[1];
            }
            if (i != 0) {
                currY = getOverScrollMode();
                if (currY == 0 || (currY == 1 && a > 0)) {
                    f();
                    if (i < 0) {
                        if (this.e.isFinished()) {
                            this.e.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (this.f.isFinished()) {
                        this.f.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                d();
            }
            if (!this.d.isFinished()) {
                abe.e(this);
            }
        }
    }

    private final void a(boolean z) {
        if (z) {
            a(2, 1);
        } else {
            c(1);
        }
        this.v = getScrollY();
        abe.e(this);
    }

    private final void d() {
        this.d.abortAnimation();
        c(1);
    }

    private final void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a = a(this.c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private final int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        verticalFadingEdgeLength = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i2;
        if (rect.bottom > verticalFadingEdgeLength && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - verticalFadingEdgeLength;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || rect.bottom >= verticalFadingEdgeLength) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = -(verticalFadingEdgeLength - rect.bottom);
            } else {
                i2 = -(scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect != null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        }
        if (findNextFocusFromRect == null || a(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                b(0, a);
            }
        }
        return z2;
    }

    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && a(view, (View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = (childAt.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
            }
            i = getPaddingTop();
            i3 = getPaddingBottom();
            int scrollY = getScrollY();
            i5 = b(scrollY, ((i4 - i2) - i) - i3, i5);
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            g(a(this.c));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && a((View) parent, view2)) {
            return true;
        }
        return false;
    }

    public void b(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    private final void e() {
        this.k = false;
        c();
        c(0);
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            i = b(i, (width - paddingLeft) - paddingRight, (width2 + i3) + i4);
            i2 = b(i2, (height - paddingTop) - paddingBottom, (height2 + i5) + i6);
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    private final void f() {
        if (getOverScrollMode() != 2) {
            if (this.e == null) {
                Context context = getContext();
                this.e = new EdgeEffect(context);
                this.f = new EdgeEffect(context);
            }
            return;
        }
        this.e = null;
        this.f = null;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.e != null) {
            int save;
            int width;
            int height;
            int scrollY = getScrollY();
            int i = 0;
            if (!this.e.isFinished()) {
                int paddingLeft;
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft();
                } else {
                    paddingLeft = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) paddingLeft, (float) min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    abe.e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                scrollY = Math.max(a(), scrollY) + height;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    scrollY -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) scrollY);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f.setSize(width, height);
                if (this.f.draw(canvas)) {
                    abe.e(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof adg) {
            adg adg = (adg) parcelable;
            super.onRestoreInstanceState(adg.getSuperState());
            this.w = adg;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        adg adg = new adg(super.onSaveInstanceState());
        adg.a = getScrollY();
        return adg;
    }
}
