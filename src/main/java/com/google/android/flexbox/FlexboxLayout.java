package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import defpackage.abe;
import defpackage.aocf;
import defpackage.pat;
import defpackage.pau;
import defpackage.pav;
import defpackage.paw;
import defpackage.pax;
import defpackage.pay;
import defpackage.paz;
import defpackage.pba;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements pau {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private pav o;
    private List p;
    private pay q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public final int g() {
        return 0;
    }

    public final void l() {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new pav(this);
        this.p = new ArrayList();
        this.q = new pay();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pba.a, i, 0);
        this.a = obtainStyledAttributes.getInt(pba.r, 0);
        this.b = obtainStyledAttributes.getInt(pba.s, 0);
        this.c = obtainStyledAttributes.getInt(pba.t, 0);
        this.d = obtainStyledAttributes.getInt(pba.n, 4);
        this.e = obtainStyledAttributes.getInt(pba.m, 5);
        this.f = obtainStyledAttributes.getInt(pba.u, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(pba.o);
        if (drawable != null) {
            a(drawable);
            b(drawable);
        }
        drawable = obtainStyledAttributes.getDrawable(pba.p);
        if (drawable != null) {
            a(drawable);
        }
        drawable = obtainStyledAttributes.getDrawable(pba.q);
        if (drawable != null) {
            b(drawable);
        }
        int i2 = obtainStyledAttributes.getInt(pba.v, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        i2 = obtainStyledAttributes.getInt(pba.x, 0);
        if (i2 != 0) {
            this.j = i2;
        }
        i2 = obtainStyledAttributes.getInt(pba.w, 0);
        if (i2 != 0) {
            this.i = i2;
        }
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    public final void onMeasure(int r13, int r14) {
        /*
        r12 = this;
        r0 = r12.n;
        if (r0 != 0) goto L_0x000f;
    L_0x0004:
        r0 = new android.util.SparseIntArray;
        r1 = r12.getChildCount();
        r0.<init>(r1);
        r12.n = r0;
    L_0x000f:
        r0 = r12.o;
        r1 = r12.n;
        r2 = r0.a;
        r2 = r2.a();
        r3 = r1.size();
        r4 = 0;
        if (r3 == r2) goto L_0x0021;
    L_0x0020:
        goto L_0x003c;
    L_0x0021:
        r3 = 0;
    L_0x0022:
        if (r3 >= r2) goto L_0x0054;
    L_0x0024:
        r5 = r0.a;
        r5 = r5.a(r3);
        if (r5 == 0) goto L_0x0051;
    L_0x002c:
        r5 = r5.getLayoutParams();
        r5 = (defpackage.pat) r5;
        r5 = r5.c();
        r6 = r1.get(r3);
        if (r5 == r6) goto L_0x0051;
    L_0x003c:
        r0 = r12.o;
        r1 = r12.n;
        r2 = r0.a;
        r2 = r2.a();
        r0 = r0.a(r2);
        r0 = defpackage.pav.a(r2, r0, r1);
        r12.m = r0;
        goto L_0x0054;
    L_0x0051:
        r3 = r3 + 1;
        goto L_0x0022;
    L_0x0054:
        r0 = r12.a;
        r1 = 3;
        r2 = 2;
        if (r0 == 0) goto L_0x00b4;
    L_0x005a:
        r3 = 1;
        if (r0 == r3) goto L_0x00b4;
    L_0x005d:
        if (r0 == r2) goto L_0x007b;
    L_0x005f:
        if (r0 != r1) goto L_0x0062;
    L_0x0061:
        goto L_0x007b;
    L_0x0062:
        r13 = new java.lang.IllegalStateException;
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r0 = "Invalid value for the flex direction is set: ";
        r14.append(r0);
        r0 = r12.a;
        r14.append(r0);
        r14 = r14.toString();
        r13.<init>(r14);
        throw r13;
    L_0x007b:
        r0 = r12.p;
        r0.clear();
        r0 = r12.q;
        r0.a();
        r0 = r12.o;
        r1 = r12.q;
        r0.a(r1, r14, r13);
        r0 = r12.q;
        r0 = r0.a;
        r12.p = r0;
        r0 = r12.o;
        r0.a(r13, r14);
        r0 = r12.o;
        r1 = r12.getPaddingLeft();
        r2 = r12.getPaddingRight();
        r1 = r1 + r2;
        r0.a(r13, r14, r1);
        r0 = r12.o;
        r0.a();
        r0 = r12.a;
        r1 = r12.q;
        r1 = r1.b;
        r12.a(r0, r13, r14, r1);
        return;
    L_0x00b4:
        r0 = r12.p;
        r0.clear();
        r0 = r12.q;
        r0.a();
        r0 = r12.o;
        r3 = r12.q;
        r0.a(r3, r13, r14);
        r0 = r12.q;
        r0 = r0.a;
        r12.p = r0;
        r0 = r12.o;
        r0.a(r13, r14);
        r0 = r12.d;
        if (r0 != r1) goto L_0x0148;
    L_0x00d4:
        r0 = r12.p;
        r0 = r0.iterator();
    L_0x00da:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0148;
    L_0x00e0:
        r1 = r0.next();
        r1 = (defpackage.paw) r1;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 0;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00eb:
        r6 = r1.h;
        if (r3 >= r6) goto L_0x0145;
    L_0x00ef:
        r6 = r1.o;
        r6 = r6 + r3;
        r6 = r12.c(r6);
        if (r6 == 0) goto L_0x0142;
    L_0x00f8:
        r7 = r6.getVisibility();
        r8 = 8;
        if (r7 == r8) goto L_0x0142;
    L_0x0100:
        r7 = r6.getLayoutParams();
        r7 = (defpackage.paz) r7;
        r8 = r12.b;
        if (r8 == r2) goto L_0x0124;
    L_0x010a:
        r8 = r1.l;
        r9 = r6.getBaseline();
        r10 = r7.topMargin;
        r8 = r8 - r9;
        r8 = java.lang.Math.max(r8, r10);
        r6 = r6.getMeasuredHeight();
        r6 = r6 + r8;
        r7 = r7.bottomMargin;
        r6 = r6 + r7;
        r5 = java.lang.Math.max(r5, r6);
        goto L_0x0142;
    L_0x0124:
        r8 = r1.l;
        r9 = r6.getMeasuredHeight();
        r10 = r6.getBaseline();
        r11 = r7.bottomMargin;
        r8 = r8 - r9;
        r8 = r8 + r10;
        r8 = java.lang.Math.max(r8, r11);
        r6 = r6.getMeasuredHeight();
        r7 = r7.topMargin;
        r6 = r6 + r7;
        r6 = r6 + r8;
        r5 = java.lang.Math.max(r5, r6);
    L_0x0142:
        r3 = r3 + 1;
        goto L_0x00eb;
    L_0x0145:
        r1.g = r5;
        goto L_0x00da;
    L_0x0148:
        r0 = r12.o;
        r1 = r12.getPaddingTop();
        r2 = r12.getPaddingBottom();
        r1 = r1 + r2;
        r0.a(r13, r14, r1);
        r0 = r12.o;
        r0.a();
        r0 = r12.a;
        r1 = r12.q;
        r1 = r1.b;
        r12.a(r0, r13, r14, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public final int a() {
        return getChildCount();
    }

    public final View a(int i) {
        return getChildAt(i);
    }

    private final View c(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
        }
        return null;
    }

    public final View b(int i) {
        return c(i);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        pav pav = this.o;
        SparseIntArray sparseIntArray = this.n;
        int a = pav.a.a();
        List a2 = pav.a(a);
        pax pax = new pax();
        if (view == null || !(layoutParams instanceof pat)) {
            pax.b = 1;
        } else {
            pax.b = ((pat) layoutParams).c();
        }
        if (i == -1 || i == a) {
            pax.a = a;
        } else if (i < pav.a.a()) {
            pax.a = i;
            for (int i2 = i; i2 < a; i2++) {
                pax pax2 = (pax) a2.get(i2);
                pax2.a++;
            }
        } else {
            pax.a = a;
        }
        a2.add(pax);
        this.m = pav.a(a + 1, a2, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    private final void a(int i, int i2, int i3, int i4) {
        int h;
        StringBuilder stringBuilder;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i = (i() + getPaddingTop()) + getPaddingBottom();
            h = h();
        } else if (i == 2 || i == 3) {
            i = h();
            h = (i() + getPaddingLeft()) + getPaddingRight();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Invalid flex direction: ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        if (mode == aocf.UNSET_ENUM_VALUE) {
            if (size < h) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = h;
            }
            i2 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i2 = View.resolveSizeAndState(h, i2, i4);
        } else if (mode == 1073741824) {
            if (size < h) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i2 = View.resolveSizeAndState(size, i2, i4);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown width mode is set: ");
            stringBuilder.append(mode);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (mode2 == aocf.UNSET_ENUM_VALUE) {
            if (size2 < i) {
                i4 = View.combineMeasuredStates(i4, 256);
                i = size2;
            }
            i = View.resolveSizeAndState(i, i3, i4);
        } else if (mode2 == 0) {
            i = View.resolveSizeAndState(i, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i = View.resolveSizeAndState(size2, i3, i4);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown height mode is set: ");
            stringBuilder.append(mode2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        setMeasuredDimension(i2, i);
    }

    public final int h() {
        int i = aocf.UNSET_ENUM_VALUE;
        for (paw paw : this.p) {
            i = Math.max(i, paw.e);
        }
        return i;
    }

    public final int i() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3;
            paw paw = (paw) this.p.get(i2);
            if (d(i2)) {
                if (f()) {
                    i3 = this.k;
                } else {
                    i3 = this.l;
                }
                i += i3;
            }
            if (e(i2)) {
                if (f()) {
                    i3 = this.k;
                } else {
                    i3 = this.l;
                }
                i += i3;
            }
            i += paw.g;
        }
        return i;
    }

    public final boolean f() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int g = abe.g(this);
        int i5 = this.a;
        boolean z2 = false;
        boolean z3;
        if (i5 == 0) {
            a(g == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            a(g != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z3 = g != 1;
            if (g == 1) {
                z2 = true;
            }
            if (this.b != 2) {
                z3 = z2;
            }
            a(z3, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z3 = g != 1;
            if (g == 1) {
                z2 = true;
            }
            if (this.b != 2) {
                z3 = z2;
            }
            a(z3, true, i, i2, i3, i4);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid flex direction is set: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    private final void a(boolean r29, int r30, int r31, int r32, int r33) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r28.getPaddingLeft();
        r2 = r28.getPaddingRight();
        r3 = r32 - r30;
        r4 = r33 - r31;
        r5 = r28.getPaddingBottom();
        r4 = r4 - r5;
        r5 = r28.getPaddingTop();
        r6 = r0.p;
        r6 = r6.size();
        r8 = r4;
        r4 = 0;
    L_0x001f:
        if (r4 >= r6) goto L_0x0213;
    L_0x0021:
        r9 = r0.p;
        r9 = r9.get(r4);
        r9 = (defpackage.paw) r9;
        r10 = r0.d(r4);
        if (r10 == 0) goto L_0x0033;
    L_0x002f:
        r10 = r0.k;
        r8 = r8 - r10;
        r5 = r5 + r10;
    L_0x0033:
        r10 = r0.c;
        r15 = 4;
        r14 = 2;
        r11 = 0;
        if (r10 == 0) goto L_0x00c8;
    L_0x003a:
        r12 = 1;
        if (r10 == r12) goto L_0x00be;
    L_0x003d:
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r10 == r14) goto L_0x00b1;
    L_0x0041:
        r7 = 3;
        if (r10 == r7) goto L_0x0099;
    L_0x0044:
        if (r10 == r15) goto L_0x007b;
    L_0x0046:
        r7 = 5;
        if (r10 != r7) goto L_0x0062;
    L_0x0049:
        r7 = r9.a();
        if (r7 == 0) goto L_0x0059;
    L_0x004f:
        r10 = r9.e;
        r10 = r3 - r10;
        r10 = (float) r10;
        r7 = r7 + 1;
        r7 = (float) r7;
        r10 = r10 / r7;
        goto L_0x005a;
    L_0x0059:
        r10 = 0;
    L_0x005a:
        r7 = (float) r1;
        r7 = r7 + r10;
        r12 = r3 - r2;
        r12 = (float) r12;
        r12 = r12 - r10;
        goto L_0x00cd;
    L_0x0062:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Invalid justifyContent is set: ";
        r2.append(r3);
        r3 = r0.c;
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x007b:
        r7 = r9.a();
        if (r7 == 0) goto L_0x0089;
    L_0x0081:
        r10 = r9.e;
        r10 = r3 - r10;
        r10 = (float) r10;
        r7 = (float) r7;
        r10 = r10 / r7;
        goto L_0x008a;
    L_0x0089:
        r10 = 0;
    L_0x008a:
        r7 = r10 / r13;
        r12 = (float) r1;
        r12 = r12 + r7;
        r13 = r3 - r2;
        r13 = (float) r13;
        r7 = r13 - r7;
        r27 = r12;
        r12 = r7;
        r7 = r27;
        goto L_0x00cd;
    L_0x0099:
        r7 = (float) r1;
        r10 = r9.a();
        if (r10 == r12) goto L_0x00a4;
    L_0x00a0:
        r10 = r10 + -1;
        r10 = (float) r10;
        goto L_0x00a6;
    L_0x00a4:
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x00a6:
        r12 = r9.e;
        r12 = r3 - r12;
        r12 = (float) r12;
        r10 = r12 / r10;
        r12 = r3 - r2;
        r12 = (float) r12;
        goto L_0x00cd;
    L_0x00b1:
        r7 = r9.e;
        r7 = r3 - r7;
        r7 = (float) r7;
        r7 = r7 / r13;
        r10 = (float) r1;
        r10 = r10 + r7;
        r12 = r3 - r2;
        r12 = (float) r12;
        r12 = r12 - r7;
        goto L_0x00c6;
    L_0x00be:
        r7 = r9.e;
        r10 = r3 - r7;
        r10 = r10 + r2;
        r10 = (float) r10;
        r7 = r7 - r1;
        r12 = (float) r7;
    L_0x00c6:
        r7 = r10;
        goto L_0x00cc;
    L_0x00c8:
        r7 = (float) r1;
        r10 = r3 - r2;
        r12 = (float) r10;
    L_0x00cc:
        r10 = 0;
    L_0x00cd:
        r17 = java.lang.Math.max(r10, r11);
        r10 = r7;
        r7 = 0;
    L_0x00d3:
        r11 = r9.h;
        if (r7 >= r11) goto L_0x0207;
    L_0x00d7:
        r11 = r9.o;
        r11 = r11 + r7;
        r18 = r0.c(r11);
        if (r18 == 0) goto L_0x01f9;
    L_0x00e0:
        r13 = r18.getVisibility();
        r14 = 8;
        if (r13 == r14) goto L_0x01f9;
    L_0x00e8:
        r13 = r18.getLayoutParams();
        r14 = r13;
        r14 = (defpackage.paz) r14;
        r13 = r14.leftMargin;
        r13 = (float) r13;
        r10 = r10 + r13;
        r13 = r14.rightMargin;
        r13 = (float) r13;
        r12 = r12 - r13;
        r11 = r0.b(r11, r7);
        if (r11 == 0) goto L_0x0109;
    L_0x00fd:
        r11 = r0.l;
        r13 = (float) r11;
        r10 = r10 + r13;
        r12 = r12 - r13;
        r19 = r10;
        r21 = r11;
        r20 = r12;
        goto L_0x010f;
    L_0x0109:
        r19 = r10;
        r20 = r12;
        r21 = 0;
    L_0x010f:
        r10 = r9.h;
        r10 = r10 + -1;
        if (r7 != r10) goto L_0x011f;
    L_0x0115:
        r10 = r0.j;
        r10 = r10 & r15;
        if (r10 <= 0) goto L_0x011f;
    L_0x011a:
        r10 = r0.l;
        r22 = r10;
        goto L_0x0121;
    L_0x011f:
        r22 = 0;
    L_0x0121:
        r10 = r0.b;
        r13 = 2;
        if (r10 != r13) goto L_0x017b;
    L_0x0126:
        if (r29 == 0) goto L_0x0155;
    L_0x0128:
        r10 = r0.o;
        r11 = java.lang.Math.round(r20);
        r12 = r18.getMeasuredWidth();
        r16 = r11 - r12;
        r11 = r18.getMeasuredHeight();
        r23 = r8 - r11;
        r24 = java.lang.Math.round(r20);
        r11 = r18;
        r12 = r9;
        r25 = 2;
        r13 = r16;
        r26 = r1;
        r1 = r14;
        r14 = r23;
        r23 = 4;
        r15 = r24;
        r16 = r8;
        r10.a(r11, r12, r13, r14, r15, r16);
        goto L_0x01bf;
    L_0x0155:
        r26 = r1;
        r1 = r14;
        r23 = 4;
        r25 = 2;
        r10 = r0.o;
        r13 = java.lang.Math.round(r19);
        r11 = r18.getMeasuredHeight();
        r14 = r8 - r11;
        r11 = java.lang.Math.round(r19);
        r12 = r18.getMeasuredWidth();
        r15 = r11 + r12;
        r11 = r18;
        r12 = r9;
        r16 = r8;
        r10.a(r11, r12, r13, r14, r15, r16);
        goto L_0x01bf;
    L_0x017b:
        r26 = r1;
        r1 = r14;
        r23 = 4;
        r25 = 2;
        if (r29 == 0) goto L_0x01a2;
    L_0x0184:
        r10 = r0.o;
        r11 = java.lang.Math.round(r20);
        r12 = r18.getMeasuredWidth();
        r13 = r11 - r12;
        r15 = java.lang.Math.round(r20);
        r11 = r18.getMeasuredHeight();
        r16 = r5 + r11;
        r11 = r18;
        r12 = r9;
        r14 = r5;
        r10.a(r11, r12, r13, r14, r15, r16);
        goto L_0x01bf;
    L_0x01a2:
        r10 = r0.o;
        r13 = java.lang.Math.round(r19);
        r11 = java.lang.Math.round(r19);
        r12 = r18.getMeasuredWidth();
        r15 = r11 + r12;
        r11 = r18.getMeasuredHeight();
        r16 = r5 + r11;
        r11 = r18;
        r12 = r9;
        r14 = r5;
        r10.a(r11, r12, r13, r14, r15, r16);
    L_0x01bf:
        r10 = r18.getMeasuredWidth();
        r10 = (float) r10;
        r10 = r10 + r17;
        r11 = r1.rightMargin;
        r11 = (float) r11;
        r10 = r10 + r11;
        r19 = r19 + r10;
        r10 = r18.getMeasuredWidth();
        r10 = (float) r10;
        r10 = r10 + r17;
        r1 = r1.leftMargin;
        r1 = (float) r1;
        r10 = r10 + r1;
        r20 = r20 - r10;
        if (r29 == 0) goto L_0x01e8;
    L_0x01db:
        r13 = 0;
        r15 = 0;
        r10 = r9;
        r11 = r18;
        r12 = r22;
        r14 = r21;
        r10.a(r11, r12, r13, r14, r15);
        goto L_0x01f4;
    L_0x01e8:
        r13 = 0;
        r15 = 0;
        r10 = r9;
        r11 = r18;
        r12 = r21;
        r14 = r22;
        r10.a(r11, r12, r13, r14, r15);
    L_0x01f4:
        r10 = r19;
        r12 = r20;
        goto L_0x01ff;
    L_0x01f9:
        r26 = r1;
        r23 = 4;
        r25 = 2;
    L_0x01ff:
        r7 = r7 + 1;
        r1 = r26;
        r14 = 2;
        r15 = 4;
        goto L_0x00d3;
    L_0x0207:
        r26 = r1;
        r1 = r9.g;
        r5 = r5 + r1;
        r8 = r8 - r1;
        r4 = r4 + 1;
        r1 = r26;
        goto L_0x001f;
    L_0x0213:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.a(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    private final void a(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r28.getPaddingTop();
        r2 = r28.getPaddingBottom();
        r3 = r28.getPaddingRight();
        r4 = r28.getPaddingLeft();
        r5 = r34 - r32;
        r6 = r33 - r31;
        r6 = r6 - r3;
        r3 = r0.p;
        r3 = r3.size();
        r8 = r4;
        r4 = 0;
    L_0x001f:
        if (r4 >= r3) goto L_0x01ff;
    L_0x0021:
        r9 = r0.p;
        r9 = r9.get(r4);
        r9 = (defpackage.paw) r9;
        r10 = r0.d(r4);
        if (r10 == 0) goto L_0x0033;
    L_0x002f:
        r10 = r0.l;
        r8 = r8 + r10;
        r6 = r6 - r10;
    L_0x0033:
        r10 = r0.c;
        r15 = 4;
        r11 = 0;
        if (r10 == 0) goto L_0x00c8;
    L_0x0039:
        r12 = 1;
        if (r10 == r12) goto L_0x00be;
    L_0x003c:
        r13 = 2;
        r14 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r10 == r13) goto L_0x00b1;
    L_0x0041:
        r13 = 3;
        if (r10 == r13) goto L_0x0099;
    L_0x0044:
        if (r10 == r15) goto L_0x007b;
    L_0x0046:
        r12 = 5;
        if (r10 != r12) goto L_0x0062;
    L_0x0049:
        r10 = r9.a();
        if (r10 == 0) goto L_0x0059;
    L_0x004f:
        r12 = r9.e;
        r12 = r5 - r12;
        r12 = (float) r12;
        r10 = r10 + 1;
        r10 = (float) r10;
        r12 = r12 / r10;
        goto L_0x005a;
    L_0x0059:
        r12 = 0;
    L_0x005a:
        r10 = (float) r1;
        r10 = r10 + r12;
        r13 = r5 - r2;
        r13 = (float) r13;
        r13 = r13 - r12;
        goto L_0x00cd;
    L_0x0062:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Invalid justifyContent is set: ";
        r2.append(r3);
        r3 = r0.c;
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x007b:
        r10 = r9.a();
        if (r10 == 0) goto L_0x0089;
    L_0x0081:
        r12 = r9.e;
        r12 = r5 - r12;
        r12 = (float) r12;
        r10 = (float) r10;
        r12 = r12 / r10;
        goto L_0x008a;
    L_0x0089:
        r12 = 0;
    L_0x008a:
        r10 = r12 / r14;
        r13 = (float) r1;
        r13 = r13 + r10;
        r14 = r5 - r2;
        r14 = (float) r14;
        r10 = r14 - r10;
        r27 = r13;
        r13 = r10;
        r10 = r27;
        goto L_0x00cd;
    L_0x0099:
        r10 = (float) r1;
        r13 = r9.a();
        if (r13 == r12) goto L_0x00a4;
    L_0x00a0:
        r13 = r13 + -1;
        r12 = (float) r13;
        goto L_0x00a6;
    L_0x00a4:
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x00a6:
        r13 = r9.e;
        r13 = r5 - r13;
        r13 = (float) r13;
        r12 = r13 / r12;
        r13 = r5 - r2;
        r13 = (float) r13;
        goto L_0x00cd;
    L_0x00b1:
        r10 = r9.e;
        r10 = r5 - r10;
        r10 = (float) r10;
        r10 = r10 / r14;
        r12 = (float) r1;
        r12 = r12 + r10;
        r13 = r5 - r2;
        r13 = (float) r13;
        r13 = r13 - r10;
        goto L_0x00c6;
    L_0x00be:
        r10 = r9.e;
        r12 = r5 - r10;
        r12 = r12 + r2;
        r12 = (float) r12;
        r10 = r10 - r1;
        r13 = (float) r10;
    L_0x00c6:
        r10 = r12;
        goto L_0x00cc;
    L_0x00c8:
        r10 = (float) r1;
        r12 = r5 - r2;
        r13 = (float) r12;
    L_0x00cc:
        r12 = 0;
    L_0x00cd:
        r18 = java.lang.Math.max(r12, r11);
        r14 = 0;
    L_0x00d2:
        r11 = r9.h;
        if (r14 >= r11) goto L_0x01f7;
    L_0x00d6:
        r11 = r9.o;
        r11 = r11 + r14;
        r19 = r0.c(r11);
        if (r19 == 0) goto L_0x01ee;
    L_0x00df:
        r12 = r19.getVisibility();
        r7 = 8;
        if (r12 == r7) goto L_0x01ee;
    L_0x00e7:
        r7 = r19.getLayoutParams();
        r7 = (defpackage.paz) r7;
        r12 = r7.topMargin;
        r12 = (float) r12;
        r10 = r10 + r12;
        r12 = r7.bottomMargin;
        r12 = (float) r12;
        r13 = r13 - r12;
        r11 = r0.b(r11, r14);
        if (r11 == 0) goto L_0x0107;
    L_0x00fb:
        r11 = r0.k;
        r12 = (float) r11;
        r10 = r10 + r12;
        r13 = r13 - r12;
        r20 = r10;
        r22 = r11;
        r21 = r13;
        goto L_0x010d;
    L_0x0107:
        r20 = r10;
        r21 = r13;
        r22 = 0;
    L_0x010d:
        r10 = r9.h;
        r10 = r10 + -1;
        if (r14 != r10) goto L_0x011d;
    L_0x0113:
        r10 = r0.i;
        r10 = r10 & r15;
        if (r10 <= 0) goto L_0x011d;
    L_0x0118:
        r10 = r0.k;
        r23 = r10;
        goto L_0x011f;
    L_0x011d:
        r23 = 0;
    L_0x011f:
        if (r29 == 0) goto L_0x0171;
    L_0x0121:
        if (r30 == 0) goto L_0x014d;
    L_0x0123:
        r10 = r0.o;
        r13 = 1;
        r11 = r19.getMeasuredWidth();
        r16 = r6 - r11;
        r11 = java.lang.Math.round(r21);
        r12 = r19.getMeasuredHeight();
        r17 = r11 - r12;
        r24 = java.lang.Math.round(r21);
        r11 = r19;
        r12 = r9;
        r25 = r14;
        r14 = r16;
        r26 = 4;
        r15 = r17;
        r16 = r6;
        r17 = r24;
        r10.a(r11, r12, r13, r14, r15, r16, r17);
        goto L_0x01b4;
    L_0x014d:
        r25 = r14;
        r26 = 4;
        r10 = r0.o;
        r13 = 1;
        r11 = r19.getMeasuredWidth();
        r14 = r6 - r11;
        r15 = java.lang.Math.round(r20);
        r11 = java.lang.Math.round(r20);
        r12 = r19.getMeasuredHeight();
        r17 = r11 + r12;
        r11 = r19;
        r12 = r9;
        r16 = r6;
        r10.a(r11, r12, r13, r14, r15, r16, r17);
        goto L_0x01b4;
    L_0x0171:
        r25 = r14;
        r26 = 4;
        if (r30 == 0) goto L_0x0196;
    L_0x0177:
        r10 = r0.o;
        r13 = 0;
        r11 = java.lang.Math.round(r21);
        r12 = r19.getMeasuredHeight();
        r15 = r11 - r12;
        r11 = r19.getMeasuredWidth();
        r16 = r8 + r11;
        r17 = java.lang.Math.round(r21);
        r11 = r19;
        r12 = r9;
        r14 = r8;
        r10.a(r11, r12, r13, r14, r15, r16, r17);
        goto L_0x01b4;
    L_0x0196:
        r10 = r0.o;
        r13 = 0;
        r15 = java.lang.Math.round(r20);
        r11 = r19.getMeasuredWidth();
        r16 = r8 + r11;
        r11 = java.lang.Math.round(r20);
        r12 = r19.getMeasuredHeight();
        r17 = r11 + r12;
        r11 = r19;
        r12 = r9;
        r14 = r8;
        r10.a(r11, r12, r13, r14, r15, r16, r17);
    L_0x01b4:
        r10 = r19.getMeasuredHeight();
        r10 = (float) r10;
        r10 = r10 + r18;
        r11 = r7.bottomMargin;
        r11 = (float) r11;
        r10 = r10 + r11;
        r20 = r20 + r10;
        r10 = r19.getMeasuredHeight();
        r10 = (float) r10;
        r10 = r10 + r18;
        r7 = r7.topMargin;
        r7 = (float) r7;
        r10 = r10 + r7;
        r21 = r21 - r10;
        if (r30 == 0) goto L_0x01dd;
    L_0x01d0:
        r12 = 0;
        r14 = 0;
        r10 = r9;
        r11 = r19;
        r13 = r23;
        r15 = r22;
        r10.a(r11, r12, r13, r14, r15);
        goto L_0x01e9;
    L_0x01dd:
        r12 = 0;
        r14 = 0;
        r10 = r9;
        r11 = r19;
        r13 = r22;
        r15 = r23;
        r10.a(r11, r12, r13, r14, r15);
    L_0x01e9:
        r10 = r20;
        r13 = r21;
        goto L_0x01f2;
    L_0x01ee:
        r25 = r14;
        r26 = 4;
    L_0x01f2:
        r14 = r25 + 1;
        r15 = 4;
        goto L_0x00d2;
    L_0x01f7:
        r7 = r9.g;
        r8 = r8 + r7;
        r6 = r6 - r7;
        r4 = r4 + 1;
        goto L_0x001f;
    L_0x01ff:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.a(boolean, boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (this.h != null || this.g != null) {
            if (this.i != 0 || this.j != 0) {
                int g = abe.g(this);
                int i = this.a;
                boolean z = false;
                boolean z2 = true;
                boolean z3;
                boolean z4;
                if (i == 0) {
                    z3 = g == 1;
                    if (this.b == 2) {
                        z = true;
                    }
                    a(canvas, z3, z);
                } else if (i == 1) {
                    z3 = g != 1;
                    if (this.b == 2) {
                        z = true;
                    }
                    a(canvas, z3, z);
                } else if (i == 2) {
                    z4 = g != 1;
                    if (g != 1) {
                        z2 = false;
                    }
                    if (this.b != 2) {
                        z4 = z2;
                    }
                    b(canvas, z4, false);
                } else if (i == 3) {
                    z4 = g != 1;
                    if (g == 1) {
                        z = true;
                    }
                    if (this.b != 2) {
                        z4 = z;
                    }
                    b(canvas, z4, true);
                }
            }
        }
    }

    private final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            int i2;
            paw paw = (paw) this.p.get(i);
            for (i2 = 0; i2 < paw.h; i2++) {
                int i3 = paw.o + i2;
                View c = c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    paz paz = (paz) c.getLayoutParams();
                    if (b(i3, i2)) {
                        if (z) {
                            i3 = c.getRight() + paz.rightMargin;
                        } else {
                            i3 = (c.getLeft() - paz.leftMargin) - this.l;
                        }
                        a(canvas, i3, paw.b, paw.g);
                    }
                    if (i2 == paw.h - 1 && (this.j & 4) > 0) {
                        if (z) {
                            i3 = (c.getLeft() - paz.leftMargin) - this.l;
                        } else {
                            i3 = c.getRight() + paz.rightMargin;
                        }
                        a(canvas, i3, paw.b, paw.g);
                    }
                }
            }
            if (d(i)) {
                if (z2) {
                    i2 = paw.d;
                } else {
                    i2 = paw.b - this.k;
                }
                b(canvas, paddingLeft, i2, max);
            }
            if (e(i) && (this.i & 4) > 0) {
                int i4;
                if (z2) {
                    i4 = paw.b - this.k;
                } else {
                    i4 = paw.d;
                }
                b(canvas, paddingLeft, i4, max);
            }
        }
    }

    private final void b(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            int i2;
            paw paw = (paw) this.p.get(i);
            for (i2 = 0; i2 < paw.h; i2++) {
                int i3 = paw.o + i2;
                View c = c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    paz paz = (paz) c.getLayoutParams();
                    if (b(i3, i2)) {
                        if (z2) {
                            i3 = c.getBottom() + paz.bottomMargin;
                        } else {
                            i3 = (c.getTop() - paz.topMargin) - this.k;
                        }
                        b(canvas, paw.a, i3, paw.g);
                    }
                    if (i2 == paw.h - 1 && (this.i & 4) > 0) {
                        if (z2) {
                            i3 = (c.getTop() - paz.topMargin) - this.k;
                        } else {
                            i3 = c.getBottom() + paz.bottomMargin;
                        }
                        b(canvas, paw.a, i3, paw.g);
                    }
                }
            }
            if (d(i)) {
                if (z) {
                    i2 = paw.c;
                } else {
                    i2 = paw.a - this.l;
                }
                a(canvas, i2, paddingTop, max);
            }
            if (e(i) && (this.j & 4) > 0) {
                int i4;
                if (z) {
                    i4 = paw.a - this.l;
                } else {
                    i4 = paw.c;
                }
                a(canvas, i4, paddingTop, max);
            }
        }
    }

    private final void a(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.l + i, i3 + i2);
            this.h.draw(canvas);
        }
    }

    private final void b(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.k + i2);
            this.g.draw(canvas);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof paz;
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof paz) {
            return new paz((paz) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new paz((MarginLayoutParams) layoutParams);
        }
        return new paz(layoutParams);
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int e() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final int j() {
        return this.f;
    }

    public final int a(int i, int i2) {
        int i3 = 0;
        if (f()) {
            if (b(i, i2)) {
                i3 = this.l;
            }
            if ((this.j & 4) > 0) {
                i = this.l;
            }
            return i3;
        }
        if (b(i, i2)) {
            i3 = this.k;
        }
        if ((this.i & 4) > 0) {
            i = this.k;
        }
        return i3;
        return i3 + i;
    }

    public final void a(paw paw) {
        int i;
        int i2;
        if (f()) {
            if ((this.j & 4) > 0) {
                i = paw.e;
                i2 = this.l;
                paw.e = i + i2;
                paw.f += i2;
            }
        } else if ((this.i & 4) > 0) {
            i = paw.e;
            i2 = this.k;
            paw.e = i + i2;
            paw.f += i2;
        }
    }

    public final int a(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final int b(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final void a(int i, int i2, paw paw) {
        if (!b(i, i2)) {
            return;
        }
        if (f()) {
            i = paw.e;
            i2 = this.l;
            paw.e = i + i2;
            paw.f += i2;
            return;
        }
        i = paw.e;
        i2 = this.k;
        paw.e = i + i2;
        paw.f += i2;
    }

    public final void a(List list) {
        this.p = list;
    }

    public final List k() {
        return this.p;
    }

    private final void a(Drawable drawable) {
        if (drawable != this.g) {
            this.g = drawable;
            this.k = drawable.getIntrinsicHeight();
            m();
            requestLayout();
        }
    }

    private final void b(Drawable drawable) {
        if (drawable != this.h) {
            this.h = drawable;
            this.l = drawable.getIntrinsicWidth();
            m();
            requestLayout();
        }
    }

    private final void m() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean b(int i, int i2) {
        int i3 = 1;
        while (i3 <= i2) {
            View c = c(i - i3);
            if (c != null && c.getVisibility() != 8) {
                return f() ? (this.j & 2) != 0 : (this.i & 2) != 0;
            } else {
                i3++;
            }
        }
        return f() ? (this.j & 1) != 0 : (this.i & 1) != 0;
    }

    private final boolean d(int i) {
        if (i >= 0 && i < this.p.size()) {
            int i2 = 0;
            while (i2 < i) {
                if (((paw) this.p.get(i2)).a() <= 0) {
                    i2++;
                } else if (f()) {
                    return (this.i & 2) != 0;
                } else {
                    if ((this.j & 2) != 0) {
                        return true;
                    }
                }
            }
            return f() ? (this.i & 1) != 0 : (this.j & 1) != 0;
        }
        return false;
    }

    private final boolean e(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (i++; i < this.p.size(); i++) {
                if (((paw) this.p.get(i)).a() > 0) {
                    return false;
                }
            }
            if (f()) {
                return (this.i & 4) != 0;
            } else {
                if ((this.j & 4) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
