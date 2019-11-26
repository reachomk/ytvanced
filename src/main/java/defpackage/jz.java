package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.design.tabs.TabLayout;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: jz */
public final class jz extends LinearLayout {
    public int a;
    public final Paint b;
    public int c = -1;
    public float d;
    public ValueAnimator e;
    private final GradientDrawable f;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private final /* synthetic */ TabLayout j;

    public jz(TabLayout tabLayout, Context context) {
        this.j = tabLayout;
        super(context);
        setWillNotDraw(false);
        this.b = new Paint();
        this.f = new GradientDrawable();
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (VERSION.SDK_INT < 23 && this.g != i) {
            requestLayout();
            this.g = i;
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            if (r3 != null) goto L_0x0059;
     */
    public final void onMeasure(int r9, int r10) {
        /*
        r8 = this;
        super.onMeasure(r9, r10);
        r0 = android.view.View.MeasureSpec.getMode(r9);
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r1) goto L_0x007a;
    L_0x000b:
        r0 = r8.j;
        r1 = r0.p;
        r2 = 1;
        if (r1 == r2) goto L_0x0017;
    L_0x0012:
        r0 = r0.r;
        r1 = 2;
        if (r0 != r1) goto L_0x005c;
    L_0x0017:
        r0 = r8.getChildCount();
        r1 = 0;
        r3 = 0;
        r4 = 0;
    L_0x001e:
        if (r3 >= r0) goto L_0x0035;
    L_0x0020:
        r5 = r8.getChildAt(r3);
        r6 = r5.getVisibility();
        if (r6 != 0) goto L_0x0032;
    L_0x002a:
        r5 = r5.getMeasuredWidth();
        r4 = java.lang.Math.max(r4, r5);
    L_0x0032:
        r3 = r3 + 1;
        goto L_0x001e;
    L_0x0035:
        if (r4 <= 0) goto L_0x007a;
    L_0x0037:
        r3 = r8.getContext();
        r5 = 16;
        r3 = defpackage.hc.a(r3, r5);
        r3 = (int) r3;
        r5 = r4 * r0;
        r6 = r8.getMeasuredWidth();
        r3 = r3 + r3;
        r6 = r6 - r3;
        if (r5 <= r6) goto L_0x0054;
    L_0x004c:
        r0 = r8.j;
        r0.p = r1;
        r0.a(r1);
        goto L_0x0059;
    L_0x0054:
        r3 = 0;
    L_0x0055:
        if (r1 < r0) goto L_0x005d;
    L_0x0057:
        if (r3 == 0) goto L_0x005c;
    L_0x0059:
        super.onMeasure(r9, r10);
    L_0x005c:
        return;
    L_0x005d:
        r5 = r8.getChildAt(r1);
        r5 = r5.getLayoutParams();
        r5 = (android.widget.LinearLayout.LayoutParams) r5;
        r6 = r5.width;
        r7 = 0;
        if (r6 != r4) goto L_0x0072;
    L_0x006c:
        r6 = r5.weight;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x0077;
    L_0x0072:
        r5.width = r4;
        r5.weight = r7;
        r3 = 1;
    L_0x0077:
        r1 = r1 + 1;
        goto L_0x0055;
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
            return;
        }
        this.e.cancel();
        b(this.c, Math.round((1.0f - this.e.getAnimatedFraction()) * ((float) this.e.getDuration())));
    }

    public final void a() {
        int i;
        View childAt = getChildAt(this.c);
        int i2 = -1;
        if (childAt != null && childAt.getWidth() > 0) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = this.j;
            if (!tabLayout.t && (childAt instanceof kc)) {
                a((kc) childAt, tabLayout.a);
                i = (int) this.j.a.left;
                left = (int) this.j.a.right;
            } else {
                i = left;
                left = right;
            }
            if (this.d <= 0.0f || this.c >= getChildCount() - 1) {
                i2 = left;
            } else {
                View childAt2 = getChildAt(this.c + 1);
                right = childAt2.getLeft();
                int right2 = childAt2.getRight();
                TabLayout tabLayout2 = this.j;
                if (!tabLayout2.t && (childAt2 instanceof kc)) {
                    a((kc) childAt2, tabLayout2.a);
                    right = (int) this.j.a.left;
                    right2 = (int) this.j.a.right;
                }
                float f = this.d;
                float f2 = 1.0f - f;
                i = (int) ((((float) right) * f) + (((float) i) * f2));
                i2 = (int) ((f * ((float) right2)) + (f2 * ((float) left)));
            }
        } else {
            i = -1;
        }
        a(i, i2);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        if (i != this.h || i2 != this.i) {
            this.h = i;
            this.i = i2;
            abe.e(this);
        }
    }

    public final void b(int i, int i2) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.e.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            a();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        TabLayout tabLayout = this.j;
        if (!tabLayout.t && (childAt instanceof kc)) {
            a((kc) childAt, tabLayout.a);
            left = (int) this.j.a.left;
            right = (int) this.j.a.right;
        }
        int i3 = left;
        int i4 = right;
        int i5 = this.h;
        int i6 = this.i;
        if (!(i5 == i3 && i6 == i4)) {
            valueAnimator = new ValueAnimator();
            this.e = valueAnimator;
            valueAnimator.setInterpolator(dq.b);
            valueAnimator.setDuration((long) i2);
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.addUpdateListener(new jy(this, i5, i3, i6, i4));
            valueAnimator.addListener(new kb(this, i));
            valueAnimator.start();
        }
    }

    private final void a(kc kcVar, RectF rectF) {
        r1 = new View[3];
        int i = 0;
        r1[0] = kcVar.a;
        r1[1] = kcVar.b;
        r1[2] = kcVar.c;
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        while (i < 3) {
            View view = r1[i];
            if (view != null && view.getVisibility() == 0) {
                if (obj != null) {
                    i3 = Math.min(i3, view.getLeft());
                } else {
                    i3 = view.getLeft();
                }
                if (obj != null) {
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i2 = view.getRight();
                }
                obj = 1;
            }
            i++;
        }
        i2 -= i3;
        int a = (int) hc.a(getContext(), 24);
        if (i2 >= a) {
            a = i2;
        }
        int left = (kcVar.getLeft() + kcVar.getRight()) / 2;
        a /= 2;
        rectF.set((float) (left - a), 0.0f, (float) (left + a), 0.0f);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.j.j;
        int i = 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int i2 = this.a;
        if (i2 >= 0) {
            intrinsicHeight = i2;
        }
        i2 = this.j.q;
        if (i2 == 0) {
            i = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
        } else if (i2 == 1) {
            i = (getHeight() - intrinsicHeight) / 2;
            intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
        } else if (i2 != 2) {
            intrinsicHeight = i2 != 3 ? 0 : getHeight();
        }
        i2 = this.h;
        if (i2 >= 0 && this.i > i2) {
            Drawable drawable2 = this.j.j;
            if (drawable2 == null) {
                drawable2 = this.f;
            }
            drawable2 = st.d(drawable2);
            drawable2.setBounds(this.h, i, this.i, intrinsicHeight);
            if (this.b != null) {
                if (VERSION.SDK_INT == 21) {
                    drawable2.setColorFilter(this.b.getColor(), Mode.SRC_IN);
                } else {
                    st.a(drawable2, this.b.getColor());
                }
            }
            drawable2.draw(canvas);
        }
        super.draw(canvas);
    }
}
