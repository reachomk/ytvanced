package com.google.android.apps.youtube.app.common.ui.inline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.amqw;
import defpackage.eix;
import defpackage.ejc;
import defpackage.ejd;
import defpackage.elr;
import defpackage.fgw;
import defpackage.xpu;
import defpackage.xpw;

public class InlinePlayerLayout extends ViewGroup implements ejc, elr {
    public final xpw a;
    public final eix b;
    public boolean c;
    private final float d;
    private View e;
    private boolean f;
    private int g;
    private int h;

    public InlinePlayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getFraction(R.fraction.aspect_ratio_16_9_exact, 1, 1);
        this.a = new xpw(this);
        this.b = new eix();
        d();
    }

    public final void setAlpha(float f) {
    }

    InlinePlayerLayout(Context context, float f, xpw xpw) {
        super(context);
        this.d = f;
        this.a = xpw;
        this.b = new eix();
        d();
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        b();
    }

    public final void onViewRemoved(View view) {
        a(view, 0, 0, 1.0f, 1.0f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.getSize(i);
        if (this.f) {
            i2 = MeasureSpec.getSize(i2);
        } else {
            i2 = Math.round(((float) i) / this.d);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = this.g;
            if (i4 <= 0 || this.h <= 0 || this.f) {
                childAt.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            } else {
                childAt.measure(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(this.h, 1073741824));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b();
        i = getChildCount();
        for (i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (z || childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.clipRect(this.a.d.b);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean z = this.f;
        boolean a = ejd2.a();
        this.f = a;
        if (z != a && a) {
            requestLayout();
        }
    }

    public final void a(View view, View view2) {
        amqw.b(a() ^ 1);
        this.e = (View) amqw.a((Object) view);
        addView(this.e, 0);
        addView(view2, 1);
        e();
    }

    public final void b(View view, View view2) {
        if (view == this.e) {
            amqw.b(a());
            removeView(view2);
            removeView(this.e);
            this.e = null;
            c();
        }
    }

    public final void a(View view) {
        addView(view);
    }

    public final void b(View view) {
        removeView(view);
    }

    public final boolean a() {
        return this.e != null;
    }

    private final void c() {
        setVisibility(8);
    }

    private final void d() {
        this.a.c = new fgw(this);
    }

    private final void e() {
        if (this.c) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.bringChildToFront(this);
            }
        }
    }

    public final void b() {
        if (a()) {
            xpu xpu = this.a.d;
            if (xpu.b()) {
                float f;
                Rect rect = xpu.a;
                int i = rect.left;
                int i2 = rect.top;
                float f2 = 1.0f;
                if (this.f || (rect.width() == this.g && rect.height() == this.h)) {
                    f = 1.0f;
                } else {
                    float width = this.g != 0 ? ((float) rect.width()) / ((float) this.g) : 1.0f;
                    if (this.h != 0) {
                        f2 = ((float) rect.height()) / ((float) this.h);
                    }
                    this.g = rect.width();
                    this.h = rect.height();
                    if (!abe.C(this)) {
                        requestLayout();
                    }
                    f = f2;
                    f2 = width;
                }
                int i3 = 0;
                if (getVisibility() == 8) {
                    setVisibility(0);
                    e();
                }
                this.b.a(this.g, this.h);
                int childCount = getChildCount();
                while (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    View view = this.e;
                    if (childAt != view) {
                        a(childAt, i, i2, f2, f);
                    } else {
                        view.setPivotX(0.0f);
                        this.e.setPivotY(0.0f);
                        this.e.setTranslationX((float) i);
                        this.e.setTranslationY((float) i2);
                    }
                    i3++;
                }
                return;
            }
            c();
        }
    }

    private static void a(View view, int i, int i2, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX((float) i);
        view.setTranslationY((float) i2);
        view.setScaleX(f);
        view.setScaleY(f2);
    }
}
