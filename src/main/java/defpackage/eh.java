package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.appbar.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: eh */
public class eh extends FrameLayout {
    public final gt a;
    public Drawable b;
    public Drawable c;
    public int d;
    public abx e;
    private boolean f;
    private int g;
    private Toolbar h;
    private View i;
    private View j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final Rect o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private ef w;

    public eh(Context context) {
        this(context, null);
    }

    public eh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public eh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.f = true;
        this.o = new Rect();
        this.v = -1;
        this.a = new gt(this);
        this.a.a(dq.e);
        TypedArray a = hd.a(context, attributeSet, eo.m, i, R.style.f666Widget.Design.CollapsingToolbar, new int[0]);
        this.a.a(a.getInt(eo.t, 8388691));
        this.a.b(a.getInt(eo.q, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(eo.u, 0);
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        if (a.hasValue(eo.x)) {
            this.k = a.getDimensionPixelSize(eo.x, 0);
        }
        if (a.hasValue(eo.w)) {
            this.m = a.getDimensionPixelSize(eo.w, 0);
        }
        if (a.hasValue(eo.y)) {
            this.l = a.getDimensionPixelSize(eo.y, 0);
        }
        if (a.hasValue(eo.v)) {
            this.n = a.getDimensionPixelSize(eo.v, 0);
        }
        this.p = a.getBoolean(eo.E, true);
        a(a.getText(eo.D));
        this.a.d(R.style.f400TextAppearance.Design.CollapsingToolbar.Expanded);
        this.a.c((int) R.style.f379TextAppearance.AppCompat.Widget.ActionBar.Title);
        if (a.hasValue(eo.z)) {
            this.a.d(a.getResourceId(eo.z, 0));
        }
        if (a.hasValue(eo.r)) {
            this.a.c(a.getResourceId(eo.r, 0));
        }
        this.v = a.getDimensionPixelSize(eo.B, -1);
        this.u = (long) a.getInt(eo.A, 600);
        a(a.getDrawable(eo.s));
        Drawable drawable = a.getDrawable(eo.C);
        Drawable drawable2 = this.c;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.c = drawable3;
            drawable = this.c;
            if (drawable != null) {
                if (drawable.isStateful()) {
                    this.c.setState(getDrawableState());
                }
                st.b(this.c, abe.g(this));
                drawable = this.c;
                if (getVisibility() != 0) {
                    z = false;
                }
                drawable.setVisible(z, false);
                this.c.setCallback(this);
                this.c.setAlpha(this.r);
            }
            abe.e(this);
        }
        this.g = a.getResourceId(eo.F, -1);
        a.recycle();
        setWillNotDraw(false);
        abe.a((View) this, new ej(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            abe.b((View) this, abe.v((View) parent));
            if (this.w == null) {
                this.w = new ek(this);
            }
            ((AppBarLayout) parent).a(this.w);
            abe.u(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        ef efVar = this.w;
        if (efVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(efVar);
        }
        super.onDetachedFromWindow();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (this.h == null) {
            Drawable drawable = this.b;
            if (drawable != null && this.r > 0) {
                drawable.mutate().setAlpha(this.r);
                this.b.draw(canvas);
            }
        }
        if (this.p && this.q) {
            this.a.a(canvas);
        }
        if (this.c != null && this.r > 0) {
            abx abx = this.e;
            int b = abx != null ? abx.b() : 0;
            if (b > 0) {
                this.c.setBounds(0, -this.d, getWidth(), b - this.d);
                this.c.mutate().setAlpha(this.r);
                this.c.draw(canvas);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj;
        Drawable drawable = this.b;
        if (drawable != null && this.r > 0) {
            View view2 = this.i;
            if (view2 == null || view2 == this ? view == this.h : view == view2) {
                drawable.mutate().setAlpha(this.r);
                this.b.draw(canvas);
                obj = 1;
                return super.drawChild(canvas, view, j) || obj != null;
            }
        }
        obj = null;
        if (!super.drawChild(canvas, view, j)) {
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    private final void b() {
        if (this.f) {
            Toolbar toolbar = null;
            this.h = null;
            this.i = null;
            int i = this.g;
            if (i != -1) {
                this.h = (Toolbar) findViewById(i);
                View view = this.h;
                if (view != null) {
                    eh parent = view.getParent();
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = parent;
                        }
                        parent = parent.getParent();
                    }
                    this.i = view;
                }
            }
            if (this.h == null) {
                i = getChildCount();
                for (int i2 = 0; i2 < i; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.h = toolbar;
            }
            c();
            this.f = false;
        }
    }

    private final void c() {
        if (!this.p) {
            View view = this.j;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.j);
                }
            }
        }
        if (this.p && this.h != null) {
            if (this.j == null) {
                this.j = new View(getContext());
            }
            if (this.j.getParent() == null) {
                this.h.addView(this.j, -1, -1);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
        i2 = MeasureSpec.getMode(i2);
        abx abx = this.e;
        int b = abx != null ? abx.b() : 0;
        if (i2 == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b, 1073741824));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b;
        int childCount;
        int i5;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        abx abx = this.e;
        if (abx != null) {
            b = abx.b();
            childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!abe.v(childAt) && childAt.getTop() < b) {
                    abe.d(childAt, b);
                }
            }
        }
        b = getChildCount();
        for (childCount = 0; childCount < b; childCount++) {
            eh.a(getChildAt(childCount)).a();
        }
        if (this.p) {
            view = this.j;
            if (view != null) {
                z = abe.H(view) && this.j.getVisibility() == 0;
                this.q = z;
                if (z) {
                    int i6;
                    int i7;
                    int i8;
                    b = abe.g(this);
                    View view2 = this.i;
                    if (view2 == null) {
                        view2 = this.h;
                    }
                    i5 = b(view2);
                    gu.a((ViewGroup) this, this.j, this.o);
                    gt gtVar = this.a;
                    int i9 = this.o.left;
                    if (b != 1) {
                        i6 = this.h.i;
                    } else {
                        i6 = this.h.j;
                    }
                    i9 += i6;
                    i6 = (this.o.top + i5) + this.h.k;
                    int i10 = this.o.right;
                    if (b != 1) {
                        i7 = this.h.j;
                    } else {
                        i7 = this.h.i;
                    }
                    gtVar.b(i9, i6, i10 + i7, (this.o.bottom + i5) - this.h.l);
                    gt gtVar2 = this.a;
                    if (b != 1) {
                        i8 = this.k;
                    } else {
                        i8 = this.m;
                    }
                    i9 = this.o.top + this.l;
                    i3 -= i;
                    if (b != 1) {
                        b = this.m;
                    } else {
                        b = this.k;
                    }
                    gtVar2.a(i8, i9, i3 - b, (i4 - i2) - this.n);
                    this.a.c();
                }
            }
        }
        if (this.h != null) {
            if (this.p && TextUtils.isEmpty(this.a.f)) {
                a(this.h.n);
            }
            view = this.i;
            if (view == null || view == this) {
                setMinimumHeight(eh.c(this.h));
            } else {
                setMinimumHeight(eh.c(view));
            }
        }
        a();
        b = getChildCount();
        for (int i11 = 0; i11 < b; i11++) {
            eh.a(getChildAt(i11)).b();
        }
    }

    private static int c(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (view.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    static eq a(View view) {
        eq eqVar = (eq) view.getTag(R.id.view_offset_helper);
        if (eqVar != null) {
            return eqVar;
        }
        eqVar = new eq(view);
        view.setTag(R.id.view_offset_helper, eqVar);
        return eqVar;
    }

    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
        e();
    }

    public final void a(boolean z) {
        if (z != this.p) {
            this.p = z;
            e();
            c();
            requestLayout();
        }
    }

    public void a(boolean z, boolean z2) {
        if (this.s != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                b();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    TimeInterpolator timeInterpolator;
                    this.t = new ValueAnimator();
                    this.t.setDuration(this.u);
                    valueAnimator = this.t;
                    if (i > this.r) {
                        timeInterpolator = dq.c;
                    } else {
                        timeInterpolator = dq.d;
                    }
                    valueAnimator.setInterpolator(timeInterpolator);
                    this.t.addUpdateListener(new ei(this));
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(new int[]{this.r, i});
                this.t.start();
            } else {
                if (!z) {
                    i = 0;
                }
                a(i);
            }
            this.s = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (i != this.r) {
            if (this.b != null) {
                Toolbar toolbar = this.h;
                if (toolbar != null) {
                    abe.e(toolbar);
                }
            }
            this.r = i;
            abe.e(this);
        }
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.b = drawable3;
            drawable = this.b;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            abe.e(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState);
        }
        drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        gt gtVar = this.a;
        if (gtVar != null) {
            i |= gtVar.a(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b || drawable == this.c;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.c;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.c.setVisible(z, false);
        }
        drawable = this.b;
        if (drawable != null && drawable.isVisible() != z) {
            this.b.setVisible(z, false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof el;
    }

    private static el d() {
        return new el();
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new el(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.b != null || this.c != null) {
            int height = getHeight() + this.d;
            int i = this.v;
            boolean z = false;
            if (i < 0) {
                abx abx = this.e;
                i = abx != null ? abx.b() : 0;
                int o = abe.o(this);
                if (o > 0) {
                    i = Math.min((o + o) + i, getHeight());
                } else {
                    i = getHeight() / 3;
                }
            }
            boolean z2 = height < i;
            if (abe.D(this) && !isInEditMode()) {
                z = true;
            }
            a(z2, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final int b(View view) {
        return ((getHeight() - eh.a(view).a) - view.getHeight()) - ((el) view.getLayoutParams()).bottomMargin;
    }

    private final void e() {
        setContentDescription(this.p ? this.a.f : null);
    }
}
