package com.google.android.libraries.social.ui.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.ugj;
import defpackage.ugk;
import defpackage.ugl;
import defpackage.ugm;
import defpackage.ugn;
import defpackage.ugo;
import defpackage.ugp;
import defpackage.ugq;
import defpackage.ugr;
import defpackage.ugt;
import defpackage.ugv;
import defpackage.ugw;
import defpackage.ugx;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ExpandingScrollView extends ugw {
    public static final ugr a = new ugt();
    private static final ugr s = new ugr();
    private static boolean t;
    private final float[] A;
    private final Set B;
    private final Set C;
    public ugr b;
    public ugr c;
    public ugo d;
    public ugo e;
    public ugo f;
    public ugo g;
    public final Set h;
    public View i;
    private final int u;
    private int v;
    private boolean w = true;
    private EnumSet x = EnumSet.of(ugo.EXPANDED);
    private ugx y;
    private ugr z;

    public ExpandingScrollView(Context context) {
        super(context);
        ugr ugr = s;
        this.z = ugr;
        this.b = ugr;
        this.c = a;
        this.d = ugo.HIDDEN;
        this.A = new float[ugo.values().length];
        this.h = new CopyOnWriteArraySet();
        this.B = new CopyOnWriteArraySet();
        this.C = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!t) {
            a(resources.getConfiguration());
            t = true;
        }
        this.y = new ugx(this, new ugj(this), new ugl(this));
        this.u = (int) (resources.getDisplayMetrics().density * 400.0f);
        c();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ugr ugr = s;
        this.z = ugr;
        this.b = ugr;
        this.c = a;
        this.d = ugo.HIDDEN;
        this.A = new float[ugo.values().length];
        this.h = new CopyOnWriteArraySet();
        this.B = new CopyOnWriteArraySet();
        this.C = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!t) {
            a(resources.getConfiguration());
            t = true;
        }
        this.y = new ugx(this, new ugj(this), new ugl(this));
        this.u = (int) (resources.getDisplayMetrics().density * 400.0f);
        c();
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ugr ugr = s;
        this.z = ugr;
        this.b = ugr;
        this.c = a;
        this.d = ugo.HIDDEN;
        this.A = new float[ugo.values().length];
        this.h = new CopyOnWriteArraySet();
        this.B = new CopyOnWriteArraySet();
        this.C = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!t) {
            a(resources.getConfiguration());
            t = true;
        }
        this.y = new ugx(this, new ugj(this), new ugl(this));
        this.u = (int) (resources.getDisplayMetrics().density * 400.0f);
        c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0 && this.i == null) {
            View childAt = getChildAt(0);
            removeAllViews();
            this.y.e.b();
            this.i = childAt;
            if (childAt != null) {
                addView(childAt);
            }
        }
    }

    private final void c() {
        for (ugo ugo : ugo.values()) {
            this.A[ugo.ordinal()] = ugo.g;
        }
    }

    public final void a(Configuration configuration) {
        ugr ugr;
        if (configuration.orientation != 2) {
            ugr = this.b;
        } else {
            ugr = this.c;
        }
        this.z = ugr;
        a(this.d, false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ugo ugo = this.d;
        a(configuration);
        ugo ugo2 = this.d;
        if (ugo2 != ugo) {
            this.e = ugo;
            this.f = ugo2;
        } else {
            ugo2 = this.e;
            if (ugo2 != null && this.z.a.contains(ugo2)) {
                if (this.d == this.f) {
                    a(this.e, false);
                }
                this.e = null;
                this.f = null;
            }
        }
        for (ugn a : this.C) {
            a.a();
        }
    }

    public final void onMeasure(int i, int i2) {
        i2 = MeasureSpec.getSize(i2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, makeMeasureSpec);
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, i2 + i2);
    }

    private final void d() {
        if (this.d == ugo.HIDDEN) {
            int b = b(ugo.HIDDEN);
            a(b, b);
            return;
        }
        ugo ugo = (ugo) Collections.max(this.z.a);
        ugo ugo2 = ugo.COLLAPSED;
        for (ugo ugo3 : this.z.a) {
            if (!ugo3.equals(ugo.HIDDEN)) {
                ugo2 = ugo3;
                break;
            }
        }
        a(b(ugo2), b(ugo));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        i4 = (i4 - i2) / 2;
        int i5 = this.v;
        if (i5 != i4) {
            this.v = i4;
            i5 = i4;
            obj = 1;
        } else {
            obj = null;
        }
        i3 -= i;
        i = i5;
        i5 = 0;
        while (i5 < getChildCount()) {
            View childAt = getChildAt(i5);
            int measuredHeight = childAt.getMeasuredHeight() + i;
            childAt.layout(getPaddingLeft(), i, i3 - getPaddingRight(), measuredHeight);
            i5++;
            i = measuredHeight;
        }
        View view = this.i;
        if (!(view instanceof ugm) || ((ugm) view).a()) {
            view = findViewById(0);
            i5 = view != null ? view.getHeight() : 0;
            if (i5 > 0) {
                a(ugo.COLLAPSED, i5);
            }
        }
        d();
        if (obj != null) {
            a(this.d, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARNING: Missing block: B:41:0x00ec, code skipped:
            if (r1 > r8) goto L_0x00f2;
     */
    /* JADX WARNING: Missing block: B:66:0x0146, code skipped:
            if (r0.k != false) goto L_0x0148;
     */
    /* JADX WARNING: Missing block: B:68:0x0149, code skipped:
            if (r2 != false) goto L_0x014c;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r13.y;
        r1 = r0.c;
        r1 = r1.d;
        r2 = defpackage.ugo.HIDDEN;
        r3 = 0;
        r4 = 1;
        if (r1 == r2) goto L_0x01a0;
    L_0x000c:
        r2 = r0.c;
        r5 = r2.v;
        r2 = r2.getScrollY();
        r5 = r5 - r2;
        r2 = r14.getX();
        r6 = r14.getY();
        r7 = r0.c;
        r8 = r7.w;
        if (r8 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x007c;
    L_0x0024:
        r7 = r7.x;
        r7 = r7.contains(r1);
        if (r7 == 0) goto L_0x007c;
    L_0x002c:
        r7 = (float) r5;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x007c;
    L_0x0031:
        r7 = r14.getAction();
        if (r7 != r4) goto L_0x007c;
    L_0x0037:
        r7 = r14.getX();
        r8 = r0.f;
        r7 = r7 - r8;
        r7 = java.lang.Math.abs(r7);
        r8 = r0.a;
        r8 = (float) r8;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x007c;
    L_0x0049:
        r7 = r14.getY();
        r8 = r0.g;
        r7 = r7 - r8;
        r7 = java.lang.Math.abs(r7);
        r8 = r0.a;
        r8 = (float) r8;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x007c;
    L_0x005b:
        r7 = r0.c;
        r1 = r7.e(r1);
        r7.a(r1);
        r1 = r0.c;
        r1 = r1.B;
        r1 = r1.iterator();
    L_0x006c:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x007c;
    L_0x0072:
        r7 = r1.next();
        r7 = (defpackage.ugs) r7;
        r7.a();
        goto L_0x006c;
    L_0x007c:
        r1 = r14.getAction();
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r1 != 0) goto L_0x0091;
    L_0x0084:
        r0.f = r2;
        r0.g = r6;
        r1 = (float) r5;
        r1 = r6 - r1;
        r0.h = r1;
        r0.j = r7;
        r0.k = r3;
    L_0x0091:
        r1 = r0.c;
        r2 = r1.v;
        r1 = r1.getScrollY();
        r2 = r2 - r1;
        r1 = r14.getAction();
        r8 = r14.getX();
        r9 = r14.getY();
        r10 = 3;
        r11 = 4;
        r12 = 2;
        if (r1 != 0) goto L_0x00c4;
    L_0x00ab:
        r1 = (float) r2;
        r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x00c2;
    L_0x00b0:
        r1 = r0.c;
        r2 = r1.w;
        if (r2 != 0) goto L_0x00b8;
    L_0x00b6:
        r10 = 1;
        goto L_0x00f2;
    L_0x00b8:
        r2 = r1.x;
        r1 = r1.d;
        r1 = r2.contains(r1);
        if (r1 == 0) goto L_0x00b6;
    L_0x00c2:
        r10 = 2;
        goto L_0x00f2;
    L_0x00c4:
        r1 = r0.l;
        if (r1 != r12) goto L_0x00ef;
    L_0x00c8:
        r1 = r0.f;
        r8 = r8 - r1;
        r1 = java.lang.Math.abs(r8);
        r2 = r0.g;
        r9 = r9 - r2;
        r2 = java.lang.Math.abs(r9);
        r8 = r0.b;
        r8 = (float) r8;
        r9 = r0.a;
        r9 = (float) r9;
        r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r9 <= 0) goto L_0x00ea;
    L_0x00e0:
        r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x00e8;
    L_0x00e4:
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x00f2;
    L_0x00e8:
        r10 = 4;
        goto L_0x00f2;
    L_0x00ea:
        r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00f2;
    L_0x00ef:
        r1 = r0.l;
        r10 = r1;
    L_0x00f2:
        r0.l = r10;
        if (r10 == r4) goto L_0x01a0;
    L_0x00f6:
        r1 = r0.e;
        r1 = r1.a;
        if (r1 == 0) goto L_0x00fe;
    L_0x00fc:
        r1 = 1;
        goto L_0x00ff;
    L_0x00fe:
        r1 = 0;
    L_0x00ff:
        r2 = r0.c;
        r2 = r2.i;
        if (r2 == 0) goto L_0x018f;
    L_0x0105:
        r2 = r14.getAction();
        r8 = r14.getY();
        if (r2 == 0) goto L_0x014c;
    L_0x010f:
        if (r2 == r4) goto L_0x013d;
    L_0x0111:
        if (r2 == r12) goto L_0x0114;
    L_0x0113:
        goto L_0x0148;
    L_0x0114:
        r2 = r0.l;
        if (r2 != r11) goto L_0x0148;
    L_0x0118:
        r2 = r0.c;
        r2 = r2.getScrollY();
        r9 = r0.c;
        r10 = defpackage.ugo.FULLY_EXPANDED;
        r9 = r9.b(r10);
        if (r2 < r9) goto L_0x018f;
    L_0x0128:
        r2 = r0.i;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x014c;
    L_0x012e:
        r2 = r0.c;
        r2 = r2.i;
        r8 = r0.f;
        r8 = (int) r8;
        r9 = r0.h;
        r9 = (int) r9;
        r2 = defpackage.ugx.a(r2, r8, r9, r3);
        goto L_0x0149;
    L_0x013d:
        r2 = r0.l;
        if (r2 == r12) goto L_0x014c;
    L_0x0141:
        if (r2 == r11) goto L_0x0144;
    L_0x0143:
        goto L_0x0148;
    L_0x0144:
        r2 = r0.k;
        if (r2 == 0) goto L_0x018f;
    L_0x0148:
        r2 = r1;
    L_0x0149:
        if (r2 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x018f;
    L_0x014c:
        r2 = r0.d;
        r2.a();
        r2 = r0.l;
        r3 = 0;
        if (r2 != r12) goto L_0x0161;
    L_0x0156:
        r2 = r0.j;
        r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r8 == 0) goto L_0x0161;
    L_0x015c:
        r2 = r2 - r6;
        r14.offsetLocation(r3, r2);
        goto L_0x0166;
    L_0x0161:
        r2 = -r5;
        r2 = (float) r2;
        r14.offsetLocation(r3, r2);
    L_0x0166:
        if (r1 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x017d;
    L_0x0169:
        r1 = r14.getY();
        r2 = r0.j;
        r1 = r1 - r2;
        r1 = java.lang.Math.abs(r1);
        r2 = r0.a;
        r2 = (float) r2;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x017d;
    L_0x017b:
        r0.k = r4;
    L_0x017d:
        r1 = r0.j;
        r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r1 != 0) goto L_0x0189;
    L_0x0183:
        r1 = r14.getY();
        r0.j = r1;
    L_0x0189:
        r1 = r0.e;
        r1.a(r14);
        goto L_0x019d;
    L_0x018f:
        r1 = r0.e;
        r1.a();
        r0.j = r7;
        r0.k = r3;
        r1 = r0.d;
        r1.a(r14);
    L_0x019d:
        r0.i = r6;
        r3 = 1;
    L_0x01a0:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(float f) {
        if (this.d != ugo.HIDDEN) {
            ugo ugo;
            ugo ugo2;
            if (Math.abs(f) <= ((float) this.u)) {
                ugo d;
                ugo = this.d;
                if (getScrollY() > b(this.d)) {
                    d = d(this.d);
                } else {
                    d = e(this.d);
                }
                ugo2 = this.d;
                if (d != ugo2) {
                    int b = b(ugo2);
                    if (((float) (getScrollY() - b)) / ((float) (b(d) - b)) > 0.2f) {
                        ugo = d;
                    }
                }
            } else {
                int scrollY = (int) ((f * 0.3f) + ((float) getScrollY()));
                ugo2 = null;
                int i = Integer.MAX_VALUE;
                for (ugo ugo3 : this.z.a) {
                    int abs = Math.abs(b(ugo3) - scrollY);
                    int i2 = abs < i ? abs : i;
                    if (abs < i) {
                        ugo2 = ugo3;
                    }
                    i = i2;
                }
                ugo = ugo2;
            }
            a(ugo);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        return new ugv(super.onSaveInstanceState(), this.d, this.A);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ugv ugv = (ugv) parcelable;
        super.onRestoreInstanceState(ugv.getSuperState());
        this.d = ugv.a;
    }

    public final void a(ugo ugo) {
        a(ugo, true);
    }

    public final void a(ugo ugo, boolean z) {
        Object obj = !z ? null : 500;
        ugo = this.z.c(ugo);
        c(ugo);
        int b = b(ugo);
        if (obj > null) {
            a(b, false);
        } else {
            a(b);
        }
    }

    private final void c(ugo ugo) {
        ugo ugo2 = this.d;
        this.d = ugo;
        d();
        if (this.d != ugo2) {
            for (ugp a : this.h) {
                a.a(ugo2, this.d);
            }
        }
    }

    public final int b(ugo ugo) {
        return Math.round((((float) this.v) * this.A[ugo.ordinal()]) / 100.0f);
    }

    public final void a(ugo ugo, int i) {
        a(ugo, (((float) Math.min(i, this.v)) * 100.0f) / ((float) this.v));
    }

    public final void a(ugo ugo, float f) {
        int ordinal = ugo.ordinal();
        if (this.A[ordinal] != f) {
            ugo e = e(ugo);
            if (ugo == e || f >= this.A[e.ordinal()]) {
                e = d(ugo);
                if (ugo == e || f <= this.A[e.ordinal()]) {
                    this.A[ordinal] = f;
                    d();
                    if (this.p) {
                        ugo ugo2;
                        int scrollY = getScrollY();
                        while (scrollY < b(e(this.d))) {
                            ugo2 = this.d;
                            if (ugo2 == e(ugo2)) {
                                break;
                            }
                            c(e(this.d));
                        }
                        while (scrollY > b(d(this.d))) {
                            ugo2 = this.d;
                            if (ugo2 != d(ugo2)) {
                                c(d(this.d));
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (this.d == ugo) {
                        a(b(ugo), true);
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("exposure percentage more than next state");
            }
            throw new IllegalArgumentException("exposure percentage less than previous state");
        }
    }

    private final ugo d(ugo ugo) {
        return this.z.b(ugo);
    }

    private final ugo e(ugo ugo) {
        return this.z.a(ugo);
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (!this.h.isEmpty()) {
            a(this.h);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.g = this.d;
        for (ugp b : this.h) {
            b.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.g = null;
        for (ugp c : this.h) {
            c.c();
        }
    }

    public final void a(Iterable iterable) {
        int scrollY = getScrollY();
        int i = 0;
        ugo ugo = ugo.values()[0];
        ugo[] values = ugo.values();
        int length = values.length;
        while (i < length) {
            ugo ugo2 = values[i];
            if (scrollY < b(ugo2)) {
                break;
            }
            i++;
            ugo = ugo2;
        }
        if (this.A[ugo.ordinal()] == 100.0f) {
            for (ugp a : iterable) {
                a.a();
            }
            return;
        }
        ugo ugo3;
        b(ugo);
        if (ugo == ugo.HIDDEN) {
            ugo3 = ugo.COLLAPSED;
        } else {
            ugo3 = d(ugo);
        }
        b(ugo3);
        for (ugp a2 : iterable) {
            a2.a();
        }
    }

    static {
        ugq ugq = new ugq();
        ugk ugk = new ugk();
    }
}
