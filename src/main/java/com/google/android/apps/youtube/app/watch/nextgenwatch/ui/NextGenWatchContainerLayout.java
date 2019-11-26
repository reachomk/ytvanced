package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import defpackage.amqw;
import defpackage.ffs;
import defpackage.llg;
import defpackage.lpr;
import defpackage.lpt;
import defpackage.lpu;
import defpackage.lpv;
import defpackage.lpw;
import defpackage.lqp;
import defpackage.xpr;
import defpackage.xse;
import java.util.ArrayList;
import java.util.List;

public class NextGenWatchContainerLayout extends ViewGroup implements lpw {
    public View a;
    public View b;
    public View c;
    public llg d;
    public lpu e;
    public lpv f;
    private int g;
    private int h;
    private int i;
    private List j;
    private boolean k;

    public NextGenWatchContainerLayout(Context context) {
        super(context);
        a(context, null);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        ((lpt) xse.b(context)).a(this);
        lpr lpr = new lpr();
        ffs ffs = new ffs();
        this.j = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqp.a);
        this.g = obtainStyledAttributes.getResourceId(lqp.c, 0);
        this.h = obtainStyledAttributes.getResourceId(lqp.b, 0);
        this.i = obtainStyledAttributes.getResourceId(lqp.d, 0);
        obtainStyledAttributes.recycle();
        boolean z = true;
        amqw.b(this.g != 0);
        if (this.i == 0) {
            z = false;
        }
        amqw.b(z);
        this.e = new lpu(this);
        this.f = new lpv(this.d, this.e);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            int id = view.getId();
            if (this.g == id) {
                this.a = view;
            } else if (this.h == id) {
                this.b = view;
            } else if (this.i == id) {
                this.c = view;
            } else if (!this.j.contains(view)) {
                this.j.add(view);
            }
            this.k = false;
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != null) {
            int id = view.getId();
            if (this.g == id) {
                throw new IllegalStateException("Scrim view must not be removed.");
            } else if (this.h == id) {
                throw new IllegalStateException("Player view must not be removed.");
            } else if (this.i != id) {
                if (this.j.contains(view)) {
                    this.j.remove(view);
                }
            } else {
                throw new IllegalStateException("Watch layout must not be removed.");
            }
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!this.k) {
            bringChildToFront(this.a);
            View view = this.b;
            if (view != null) {
                bringChildToFront(view);
            }
            bringChildToFront(this.c);
            this.k = true;
        }
        a();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lpu lpu = this.e;
        Animator animator = lpu.b;
        if (animator != null) {
            animator.cancel();
            lpu.b();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MeasureSpec.getSize(i);
        MeasureSpec.getSize(i2);
        a();
        int size = this.j.size();
        for (int i3 = 0; i3 < size; i3++) {
            measureChild((View) this.j.get(i3), i, i2);
        }
        if (!this.d.aF_()) {
            measureChild(this.a, i, i2);
            measureChild(this.c, i, i2);
            b();
        }
    }

    private final void b() {
        if (this.b != null) {
            Rect c = this.f.c();
            this.b.measure(MeasureSpec.makeMeasureSpec(c.width(), 1073741824), MeasureSpec.makeMeasureSpec(c.height(), 1073741824));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f.e()) {
            i3 = this.j.size();
            for (int i5 = 0; i5 < i3; i5++) {
                int i6;
                int i7;
                View view = (View) this.j.get(i5);
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.topMargin + i2;
                    i7 = marginLayoutParams.leftMargin + i;
                } else {
                    i7 = i;
                    i6 = i2;
                }
                a(view, z, i7, i6, i7 + view.getMeasuredWidth(), i6 + view.getMeasuredHeight());
            }
        }
        Object obj = 1;
        if (this.d.aF_() && !this.e.a()) {
            obj = null;
        }
        if (obj != null) {
            View view2 = this.a;
            a(view2, z, i, i2, i + view2.getMeasuredWidth(), i2 + this.a.getMeasuredHeight());
        }
        if (!this.e.a()) {
            this.a.setAlpha(obj != null ? this.f.d() : 1.0f);
        }
        if (!this.d.aF_()) {
            View view3 = this.c;
            a(view3, z, i, i2, i + view3.getMeasuredWidth(), i2 + this.c.getMeasuredHeight());
        }
        if (this.b != null && !this.d.aF_()) {
            Rect c = this.f.c();
            if (!(this.b.getMeasuredWidth() == c.width() && this.b.getMeasuredHeight() == c.height())) {
                b();
            }
            a(this.b, z, c.left, c.top, c.left + this.b.getMeasuredWidth(), c.top + this.b.getMeasuredHeight());
        }
    }

    private static void a(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            Object[] objArr = new Object[]{"view:", view};
            view.layout(i, i2, i3, i4);
        }
    }

    public final void a(float f) {
        View view = this.b;
        if (view != null) {
            view.setTranslationX(f);
        }
    }

    public final void a() {
        boolean e = this.f.e();
        boolean aF_ = this.d.aF_() ^ 1;
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            xpr.a((View) this.j.get(i), e);
        }
        xpr.a(this.a, aF_);
        View view = this.b;
        if (view != null) {
            xpr.a(view, aF_);
        }
        xpr.a(this.c, aF_);
    }
}
