package com.google.android.libraries.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.aocf;
import defpackage.tso;
import defpackage.tsq;

public class ButtonPaneLayout extends ViewGroup {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private SparseIntArray s;
    private tso t;

    public ButtonPaneLayout(Context context) {
        this(context, null);
    }

    public ButtonPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = true;
        this.s = new SparseIntArray();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tsq.a, i, R.style.f251Material.ButtonPaneLayout);
        this.n = obtainStyledAttributes.getBoolean(tsq.d, true);
        this.o = obtainStyledAttributes.getBoolean(tsq.c, false);
        this.p = obtainStyledAttributes.getBoolean(tsq.e, false);
        this.m = obtainStyledAttributes.getDimensionPixelSize(tsq.l, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(tsq.b, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(tsq.k, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(tsq.f, aocf.UNSET_ENUM_VALUE);
        if (dimensionPixelSize == aocf.UNSET_ENUM_VALUE) {
            this.a = obtainStyledAttributes.getDimensionPixelSize(tsq.i, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(tsq.j, 0);
            this.c = obtainStyledAttributes.getDimensionPixelSize(tsq.h, 0);
            this.d = obtainStyledAttributes.getDimensionPixelSize(tsq.g, 0);
        } else {
            this.a = dimensionPixelSize;
            this.b = dimensionPixelSize;
            this.c = dimensionPixelSize;
            this.d = dimensionPixelSize;
        }
        this.j = obtainStyledAttributes.getDimensionPixelSize(tsq.r, 0);
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(tsq.m, aocf.UNSET_ENUM_VALUE);
        if (dimensionPixelSize == aocf.UNSET_ENUM_VALUE) {
            this.e = obtainStyledAttributes.getDimensionPixelSize(tsq.p, 0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(tsq.q, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(tsq.o, 0);
            this.h = obtainStyledAttributes.getDimensionPixelSize(tsq.n, 0);
        } else {
            this.e = dimensionPixelSize;
            this.f = dimensionPixelSize;
            this.g = dimensionPixelSize;
            this.h = dimensionPixelSize;
        }
        obtainStyledAttributes.recycle();
        this.l = getResources().getDimensionPixelSize(R.dimen.mtrl_button_pane_layout_touch_dimen);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        a();
    }

    private final void a() {
        this.r = false;
        if (d()) {
            abe.a(this, this.e, this.f, this.g, this.h);
        } else {
            abe.a(this, this.a, this.b, this.c, this.d);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i, i2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.k, 1073741824);
        int i6 = 0;
        for (i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).getVisibility() != 8) {
                i6++;
            }
        }
        this.s.clear();
        i3 = (getMeasuredWidth() - this.a) - this.c;
        i6 = i6 > 0 ? (i3 - ((i6 - 1) * this.i)) / i6 : 0;
        boolean d = d();
        boolean z = true;
        this.q = i6 < this.m;
        int i7 = 0;
        int i8 = 0;
        for (i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                if (i8 < childAt.getMeasuredWidth()) {
                    i8 = childAt.getMeasuredWidth();
                }
                this.s.append(i6, childAt.getMeasuredWidth());
                i7 += childAt.getMeasuredWidth() + this.i;
            }
        }
        if (i3 >= i7) {
            z = false;
        }
        this.q = z;
        if (d != d() || this.r) {
            a();
        }
        int makeMeasureSpec3;
        View childAt2;
        int makeMeasureSpec4;
        int makeMeasureSpec5;
        if (!d()) {
            makeMeasureSpec = (getPaddingLeft() + getPaddingRight()) - this.i;
            makeMeasureSpec2 = getPaddingTop();
            i3 = getPaddingBottom();
            i6 = this.k;
            makeMeasureSpec2 = (makeMeasureSpec2 + i3) + i6;
            makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(i6, 1073741824);
            i3 = makeMeasureSpec;
            for (makeMeasureSpec = 0; makeMeasureSpec < getChildCount(); makeMeasureSpec++) {
                childAt2 = getChildAt(makeMeasureSpec);
                if (childAt2.getVisibility() != 8) {
                    makeMeasureSpec4 = MeasureSpec.makeMeasureSpec(this.s.get(makeMeasureSpec), aocf.UNSET_ENUM_VALUE);
                    a(childAt2, 17);
                    childAt2.measure(makeMeasureSpec4, makeMeasureSpec3);
                    i3 += childAt2.getMeasuredWidth() + this.i;
                }
            }
            setMeasuredDimension(a(i3, getMeasuredWidth(), i4), a(makeMeasureSpec2, getMeasuredHeight(), i5));
        } else if (this.n) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(a(i8, getMeasuredWidth(), i4), 1073741824);
            makeMeasureSpec5 = MeasureSpec.makeMeasureSpec(this.k, 1073741824);
            i3 = (getPaddingTop() + getPaddingBottom()) - this.j;
            for (makeMeasureSpec3 = 0; makeMeasureSpec3 < getChildCount(); makeMeasureSpec3++) {
                childAt2 = getChildAt(makeMeasureSpec3);
                if (childAt2.getVisibility() != 8) {
                    a(childAt2, 8388629);
                    childAt2.measure(makeMeasureSpec, makeMeasureSpec5);
                    i3 += childAt2.getMeasuredHeight() + this.j;
                }
            }
            setMeasuredDimension(a((i8 + getPaddingLeft()) + getPaddingRight(), getMeasuredWidth(), i4), a(i3, getMeasuredHeight(), i5));
        } else {
            makeMeasureSpec = getPaddingLeft() + getPaddingRight();
            makeMeasureSpec5 = MeasureSpec.makeMeasureSpec(getMeasuredWidth() - makeMeasureSpec, aocf.UNSET_ENUM_VALUE);
            makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(this.k, 1073741824);
            makeMeasureSpec4 = (getPaddingTop() + getPaddingBottom()) - this.j;
            i6 = 0;
            for (i3 = 0; i3 < getChildCount(); i3++) {
                View childAt3 = getChildAt(i3);
                if (childAt3.getVisibility() != 8) {
                    a(childAt3, 8388629);
                    childAt3.measure(makeMeasureSpec5, makeMeasureSpec3);
                    makeMeasureSpec4 += childAt3.getMeasuredHeight() + this.j;
                    if (childAt3.getMeasuredWidth() > i6) {
                        i6 = childAt3.getMeasuredWidth();
                    }
                }
            }
            setMeasuredDimension(a(i6 + makeMeasureSpec, getMeasuredWidth(), i4), a(makeMeasureSpec4, getMeasuredHeight(), i5));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        if (d()) {
            i3 -= i;
            i4 -= i2;
            Object obj = 1;
            if (!(b() || this.n)) {
                obj = null;
            }
            int paddingLeft2 = getPaddingLeft();
            i4 -= getPaddingBottom();
            c();
            for (i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    if (obj == null) {
                        paddingLeft2 = (i3 - getPaddingRight()) - childAt.getMeasuredWidth();
                    }
                    measuredHeight = i4 - childAt.getMeasuredHeight();
                    paddingLeft = (this.n ? (i3 - getPaddingLeft()) - getPaddingRight() : childAt.getMeasuredWidth()) + paddingLeft2;
                    childAt.layout(paddingLeft2, measuredHeight, paddingLeft, i4);
                    Rect a = a(paddingLeft2, measuredHeight, paddingLeft, i4);
                    if (a != null) {
                        i5 = a.bottom;
                        i6 = a.top;
                        i7 = this.j;
                        if (i5 - i6 > (i4 - measuredHeight) + i7) {
                            i7 /= 2;
                            a.top = measuredHeight - i7;
                            a.bottom = i4 + i7;
                        }
                        a(childAt, a);
                    }
                    i4 = measuredHeight - this.j;
                }
            }
            return;
        }
        i3 -= i;
        z = b();
        i3 = !z ? i3 - getPaddingRight() : getPaddingLeft();
        i = getPaddingTop();
        c();
        i2 = getChildCount();
        while (true) {
            i2--;
            if (i2 >= 0) {
                View childAt2 = getChildAt(i2);
                if (childAt2.getVisibility() != 8) {
                    int max = Math.max(this.m, childAt2.getMeasuredWidth());
                    if (z) {
                        paddingLeft = i3 + max;
                        max = (max + this.i) + i3;
                    } else {
                        paddingLeft = i3 - max;
                        max = i3 - (max + this.i);
                        int i8 = paddingLeft;
                        paddingLeft = i3;
                        i3 = i8;
                    }
                    measuredHeight = childAt2.getMeasuredHeight() + i;
                    childAt2.layout(i3, i, paddingLeft, measuredHeight);
                    Rect a2 = a(i3, i, paddingLeft, measuredHeight);
                    if (a2 != null) {
                        i5 = a2.right;
                        i6 = a2.left;
                        i7 = this.i;
                        if (i5 - i6 > (paddingLeft - i3) + i7) {
                            i7 /= 2;
                            a2.left = i3 - i7;
                            a2.right = paddingLeft + i7;
                        }
                        a(childAt2, a2);
                    }
                    i3 = max;
                }
            } else {
                return;
            }
        }
    }

    private static int a(int i, int i2, int i3) {
        i3 = MeasureSpec.getMode(i3);
        if (i3 != aocf.UNSET_ENUM_VALUE) {
            return i3 != 1073741824 ? i : i2;
        } else {
            return Math.min(i2, i);
        }
    }

    private final void a(View view, int i) {
        if (!this.o && (view instanceof TextView)) {
            ((TextView) view).setGravity(i);
        }
    }

    private final boolean b() {
        return abe.g(this) == 1;
    }

    private final Rect a(int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int i7 = this.l;
        if (i5 > i7 && i6 > i7) {
            return null;
        }
        if (i6 < i7) {
            i -= (i7 - i6) / 2;
            i3 = i + i7;
        }
        if (i5 < i7) {
            i2 -= (i7 - i5) / 2;
            i4 = i2 + i7;
        }
        return new Rect(i, i2, i3, i4);
    }

    private final void a(View view, Rect rect) {
        if (this.t == null) {
            this.t = new tso(this);
        }
        tso tso = this.t;
        tso.a.add(new TouchDelegate(rect, view));
        if (getParent() instanceof View) {
            view = (View) getParent();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            TouchDelegate touchDelegate2 = this.t;
            if (touchDelegate != touchDelegate2) {
                touchDelegate2.b = touchDelegate;
                view.setTouchDelegate(touchDelegate2);
            }
        }
    }

    private final void c() {
        tso tso = this.t;
        if (tso != null) {
            tso.a.clear();
        }
    }

    private final boolean d() {
        return this.q || this.p;
    }
}
