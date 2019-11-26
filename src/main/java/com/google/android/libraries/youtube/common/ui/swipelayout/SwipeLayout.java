package com.google.android.libraries.youtube.common.ui.swipelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import defpackage.abe;
import defpackage.ado;
import defpackage.adt;
import defpackage.avn;
import defpackage.awm;
import defpackage.awo;
import defpackage.awp;
import defpackage.xqw;
import defpackage.xqy;
import defpackage.xqz;
import defpackage.xra;
import defpackage.xrb;
import defpackage.xrc;
import defpackage.xrd;
import defpackage.xre;
import defpackage.xss;

public class SwipeLayout extends FrameLayout {
    private static final int[] j = new int[]{16842910, 16842919};
    private static final int[] k = new int[0];
    public int a;
    public int b;
    public View c;
    public VelocityTracker d;
    public int e;
    public boolean f = true;
    public View g;
    public boolean h = true;
    private int i;
    private ado l;
    private View m;
    private Drawable n;
    private Drawable o;
    private awp p;
    private GestureDetector q;
    private final PointF r = new PointF();
    private final adt s = new xrb(this);
    private final SimpleOnGestureListener t = new xre(this);

    public SwipeLayout(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.q = new GestureDetector(getContext(), this.t);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a = xss.a(getResources().getDisplayMetrics(), 40);
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i = xss.a(getResources().getDisplayMetrics(), 5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xqw.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(xqw.e, 0);
        if (resourceId != 0) {
            this.m = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
        }
        this.n = obtainStyledAttributes.getDrawable(xqw.d);
        resourceId = obtainStyledAttributes.getResourceId(xqw.c, 0);
        if (resourceId != 0) {
            this.g = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
            a(this.g);
        }
        this.o = obtainStyledAttributes.getDrawable(xqw.b);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = getChildAt(getChildCount() - 1);
        this.l = ado.a((ViewGroup) this, 1.0f, this.s);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (d() || e()) {
            return this.l.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.q.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        boolean z = actionMasked == 0 || actionMasked == 5;
        Object obj = (actionMasked == 1 || actionMasked == 6 || actionMasked == 3) ? 1 : null;
        Object obj2 = (pointerId == 0 && this.l.a(0)) ? 1 : null;
        obj2 = ((d() || e()) && !(!z && obj == null && obj2 == null)) ? 1 : null;
        if (obj != null) {
            l();
        }
        if (obj2 == null) {
            return z;
        }
        this.l.b(motionEvent);
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        this.d.computeCurrentVelocity(1000);
        actionMasked = motionEvent.getAction();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float abs = Math.abs(motionEvent.getX() - this.r.x);
                    float abs2 = Math.abs(motionEvent.getY() - this.r.y);
                    if (((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) >= ((float) this.i)) {
                        double atan2 = (double) ((float) Math.atan2((double) abs2, (double) abs));
                        Double.isNaN(atan2);
                        if (((float) (atan2 * 57.29577951308232d)) < 30.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                    return false;
                } else if (actionMasked != 3) {
                    return true;
                }
            }
            VelocityTracker velocityTracker = this.d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d = null;
            }
            l();
            return false;
        }
        this.r.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.m;
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).gravity = 8388611;
            this.m.setVisibility(4);
        }
        view = this.g;
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).gravity = 8388613;
            this.g.setVisibility(4);
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.e;
        if (j()) {
            i5 = -i5;
        }
        b(i5);
    }

    public final void a(int i) {
        int i2 = 0;
        if ((i <= 0 || d()) && (i >= 0 || e())) {
            i2 = i;
        }
        this.e = i2;
        b(j() ? -this.e : this.e);
    }

    public final boolean a() {
        return this.e != 0;
    }

    public final void b() {
        a(0.0f);
    }

    public final void a(float f) {
        a(0, f);
    }

    public final void c() {
        k().a();
        a(0);
    }

    public final void a(View view) {
        View view2 = this.g;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.g = view;
            view = this.g;
            if (view != null) {
                addView(view, 0);
            } else if (this.e < 0) {
                a(0);
            }
        }
    }

    public final boolean d() {
        return this.f && this.m != null;
    }

    public final boolean e() {
        return this.h && this.g != null;
    }

    public final void a(int i, float f) {
        int left = this.c.getLeft();
        if (left != i || k().e) {
            if (!k().e) {
                awp k = k();
                k.a((float) left);
                k.a = f;
            }
            awp k2 = k();
            float f2 = (float) i;
            if (k2.e) {
                k2.k = f2;
                return;
            }
            if (k2.j == null) {
                k2.j = new awo(f2);
            }
            k2.j.a(f2);
            awo awo = k2.j;
            if (awo != null) {
                double a = (double) awo.a();
                if (a > ((double) k2.f)) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                } else if (a >= ((double) k2.g)) {
                    awo = k2.j;
                    a = Math.abs((double) (k2.h * 0.75f));
                    awo.d = a;
                    awo.e = a * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        if (!k2.e) {
                            k2.e = true;
                            if (!k2.c) {
                                k2.b = k2.d.a();
                            }
                            f2 = k2.b;
                            if (f2 > k2.f || f2 < k2.g) {
                                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                            }
                            avn a2 = avn.a();
                            if (a2.b.size() == 0) {
                                a2.b().a();
                            }
                            if (!a2.b.contains(k2)) {
                                a2.b.add(k2);
                            }
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    private final void b(int i) {
        View view = this.c;
        if (view != null) {
            abe.e(view, i - view.getLeft());
            if (!k().e) {
                k().a((float) i);
            }
            i = this.e;
            Drawable drawable = i > 0 ? this.n : null;
            if (i < 0) {
                drawable = this.o;
            }
            setBackground(drawable);
            view = this.m;
            int i2 = 8;
            if (view != null) {
                view.setVisibility(i <= 0 ? 8 : 0);
            }
            view = this.g;
            if (view != null) {
                if (i < 0) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
        }
    }

    public final View f() {
        return !j() ? this.m : this.g;
    }

    public final View g() {
        return !j() ? this.g : this.m;
    }

    public final int h() {
        View f = f();
        if (f == null) {
            return 0;
        }
        return f.getWidth();
    }

    public final int i() {
        View g = g();
        if (g == null) {
            return 0;
        }
        return g.getWidth();
    }

    public final boolean j() {
        return abe.g(this) == 1;
    }

    public final void b(float f) {
        a(f(), new xqy(this), f);
    }

    public final void c(float f) {
        a(g(), new xra(this), f);
    }

    private final void a(View view, xrd xrd, float f) {
        if (view != null) {
            if (view.getWidth() == 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new xrc(this, view, xrd, f));
                return;
            }
            a(((Integer) xrd.a()).intValue(), f);
        }
    }

    public final awp k() {
        if (this.p == null) {
            awp awp = new awp(new awm());
            awo awo = new awo(0.0f);
            awo.b = 1.0d;
            awo.c = false;
            awo.a = Math.sqrt(1500.0d);
            awo.c = false;
            awp.j = awo;
            xqz xqz = new xqz(this);
            if (awp.e) {
                throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            if (!awp.i.contains(xqz)) {
                awp.i.add(xqz);
            }
            awp.a(0.0f);
            this.p = awp;
        }
        return this.p;
    }

    public final void a(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            Drawable background = this.c.getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                this.c.drawableHotspotChanged(f, f2);
                rippleDrawable.setState(j);
            }
        }
    }

    public final void l() {
        if (VERSION.SDK_INT >= 21) {
            Drawable background = this.c.getBackground();
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setState(k);
            }
        }
    }
}
