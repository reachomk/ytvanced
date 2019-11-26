package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import defpackage.cs;
import defpackage.cu;
import defpackage.cv;
import defpackage.dg;
import defpackage.dh;
import defpackage.dj;
import java.util.ArrayList;

public class ConstraintLayout extends ViewGroup {
    private SparseArray a = new SparseArray();
    private final ArrayList b = new ArrayList(100);
    private dg c = new dg();
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    private boolean h = true;
    private int i = 2;
    private cu j = null;

    public ConstraintLayout(Context context) {
        super(context);
        a(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    private final void a(AttributeSet attributeSet) {
        this.c.J = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cv.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == cv.e) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == cv.d) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == cv.c) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == cv.b) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == cv.V) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == cv.g) {
                    index = obtainStyledAttributes.getResourceId(index, 0);
                    this.j = new cu();
                    this.j.a(getContext(), index);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.a = this.i;
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        dh a = a(view);
        if ((view instanceof Guideline) && !(a instanceof dj)) {
            cs csVar = (cs) view.getLayoutParams();
            csVar.V = new dj();
            csVar.N = true;
            ((dj) csVar.V).h(csVar.J);
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.a(a(view));
        this.h = true;
    }

    private final dh a(int i) {
        if (i == 0) {
            return this.c;
        }
        View view = (View) this.a.get(i);
        if (view != this) {
            return view != null ? ((cs) view.getLayoutParams()).V : null;
        } else {
            return this.c;
        }
    }

    private final dh a(View view) {
        if (view != this) {
            return view != null ? ((cs) view.getLayoutParams()).V : null;
        } else {
            return this.c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x047c A:{Catch:{ NumberFormatException -> 0x0491 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0476 A:{Catch:{ NumberFormatException -> 0x0491 }} */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x048c A:{SYNTHETIC, Splitter:B:210:0x048c} */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x057c A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:242:0x052c, code skipped:
            if (r10.height != -1) goto L_0x0520;
     */
    public void onMeasure(int r32, int r33) {
        /*
        r31 = this;
        r0 = r31;
        r1 = r32;
        r2 = r33;
        r3 = r31.getPaddingLeft();
        r4 = r31.getPaddingTop();
        r5 = r0.c;
        r5.w = r3;
        r5.x = r4;
        r5 = android.view.View.MeasureSpec.getMode(r32);
        r6 = android.view.View.MeasureSpec.getSize(r32);
        r7 = android.view.View.MeasureSpec.getMode(r33);
        r8 = android.view.View.MeasureSpec.getSize(r33);
        r9 = r31.getPaddingTop();
        r10 = r31.getPaddingBottom();
        r9 = r9 + r10;
        r10 = r31.getPaddingLeft();
        r11 = r31.getPaddingRight();
        r10 = r10 + r11;
        r31.getLayoutParams();
        r11 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = 0;
        if (r5 == r11) goto L_0x0053;
    L_0x0040:
        if (r5 == 0) goto L_0x0051;
    L_0x0042:
        if (r5 == r12) goto L_0x0047;
    L_0x0044:
        r5 = 1;
    L_0x0045:
        r6 = 0;
        goto L_0x0054;
    L_0x0047:
        r5 = r0.f;
        r5 = java.lang.Math.min(r5, r6);
        r6 = r5 - r10;
        r5 = 1;
        goto L_0x0054;
    L_0x0051:
        r5 = 2;
        goto L_0x0045;
    L_0x0053:
        r5 = 2;
    L_0x0054:
        if (r7 == r11) goto L_0x0069;
    L_0x0056:
        if (r7 == 0) goto L_0x0067;
    L_0x0058:
        if (r7 == r12) goto L_0x005d;
    L_0x005a:
        r7 = 1;
    L_0x005b:
        r8 = 0;
        goto L_0x006a;
    L_0x005d:
        r7 = r0.g;
        r7 = java.lang.Math.min(r7, r8);
        r8 = r7 - r9;
        r7 = 1;
        goto L_0x006a;
    L_0x0067:
        r7 = 2;
        goto L_0x005b;
    L_0x0069:
        r7 = 2;
    L_0x006a:
        r9 = r0.c;
        r9.c(r14);
        r9 = r0.c;
        r9.d(r14);
        r9 = r0.c;
        r9.f(r5);
        r5 = r0.c;
        r5.a(r6);
        r5 = r0.c;
        r5.g(r7);
        r5 = r0.c;
        r5.b(r8);
        r5 = r0.c;
        r6 = r0.d;
        r7 = r31.getPaddingLeft();
        r6 = r6 - r7;
        r7 = r31.getPaddingRight();
        r6 = r6 - r7;
        r5.c(r6);
        r5 = r0.c;
        r6 = r0.e;
        r7 = r31.getPaddingTop();
        r6 = r6 - r7;
        r7 = r31.getPaddingBottom();
        r6 = r6 - r7;
        r5.d(r6);
        r5 = r0.h;
        r8 = -1;
        if (r5 == 0) goto L_0x04d4;
    L_0x00af:
        r0.h = r14;
        r5 = r31.getChildCount();
        r9 = 0;
    L_0x00b6:
        if (r9 >= r5) goto L_0x04d4;
    L_0x00b8:
        r10 = r0.getChildAt(r9);
        r10 = r10.isLayoutRequested();
        if (r10 == 0) goto L_0x04cc;
    L_0x00c2:
        r5 = r0.b;
        r5.clear();
        r5 = r0.j;
        if (r5 != 0) goto L_0x00cd;
    L_0x00cb:
        goto L_0x018e;
    L_0x00cd:
        r9 = r31.getChildCount();
        r10 = new java.util.HashSet;
        r11 = r5.a;
        r11 = r11.keySet();
        r10.<init>(r11);
        r11 = 0;
    L_0x00dd:
        if (r11 >= r9) goto L_0x0157;
    L_0x00df:
        r12 = r0.getChildAt(r11);
        r16 = r12.getId();
        r14 = r5.a;
        r13 = java.lang.Integer.valueOf(r16);
        r14 = r14.containsKey(r13);
        if (r14 == 0) goto L_0x0151;
    L_0x00f3:
        r10.remove(r13);
        r14 = r5.a;
        r13 = r14.get(r13);
        r13 = (defpackage.ct) r13;
        r14 = r12.getLayoutParams();
        r14 = (defpackage.cs) r14;
        r13.a(r14);
        r12.setLayoutParams(r14);
        r14 = r13.G;
        r12.setVisibility(r14);
        r14 = r13.R;
        r12.setAlpha(r14);
        r14 = r13.U;
        r12.setRotationX(r14);
        r14 = r13.V;
        r12.setRotationY(r14);
        r14 = r13.W;
        r12.setScaleX(r14);
        r14 = r13.X;
        r12.setScaleY(r14);
        r14 = r13.Y;
        r12.setPivotX(r14);
        r14 = r13.Z;
        r12.setPivotY(r14);
        r14 = r13.aa;
        r12.setTranslationX(r14);
        r14 = r13.ab;
        r12.setTranslationY(r14);
        r14 = android.os.Build.VERSION.SDK_INT;
        r7 = 21;
        if (r14 < r7) goto L_0x0151;
    L_0x0142:
        r7 = r13.ac;
        r12.setTranslationZ(r7);
        r7 = r13.S;
        if (r7 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x0151;
    L_0x014c:
        r7 = r13.T;
        r12.setElevation(r7);
    L_0x0151:
        r11 = r11 + 1;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = 0;
        goto L_0x00dd;
    L_0x0157:
        r7 = r10.iterator();
    L_0x015b:
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x018e;
    L_0x0161:
        r9 = r7.next();
        r9 = (java.lang.Integer) r9;
        r10 = r5.a;
        r10 = r10.get(r9);
        r10 = (defpackage.ct) r10;
        r11 = r10.a;
        if (r11 == 0) goto L_0x015b;
    L_0x0173:
        r11 = new android.support.constraint.Guideline;
        r12 = r31.getContext();
        r11.<init>(r12);
        r9 = r9.intValue();
        r11.setId(r9);
        r9 = b();
        r10.a(r9);
        r0.addView(r11, r9);
        goto L_0x015b;
    L_0x018e:
        r5 = r31.getChildCount();
        r7 = r0.c;
        r7 = r7.af;
        r7.clear();
        r7 = 0;
    L_0x019a:
        if (r7 >= r5) goto L_0x04d4;
    L_0x019c:
        r9 = r0.getChildAt(r7);
        r10 = r0.a(r9);
        if (r10 == 0) goto L_0x04c3;
    L_0x01a6:
        r11 = r9.getLayoutParams();
        r11 = (defpackage.cs) r11;
        r10.a();
        r12 = r9.getVisibility();
        r10.K = r12;
        r10.J = r9;
        r9 = r0.c;
        r12 = r9.af;
        r12.add(r10);
        r12 = r10.r;
        if (r12 != 0) goto L_0x01c3;
    L_0x01c2:
        goto L_0x01c8;
    L_0x01c3:
        r12 = (defpackage.dn) r12;
        r12.a(r10);
    L_0x01c8:
        r10.r = r9;
        r9 = r11.L;
        if (r9 == 0) goto L_0x01d2;
    L_0x01ce:
        r9 = r11.K;
        if (r9 != 0) goto L_0x01d7;
    L_0x01d2:
        r9 = r0.b;
        r9.add(r10);
    L_0x01d7:
        r9 = r11.N;
        if (r9 == 0) goto L_0x020d;
    L_0x01db:
        r10 = (defpackage.dj) r10;
        r9 = r11.a;
        r12 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r9 != r8) goto L_0x01e4;
    L_0x01e3:
        goto L_0x01ec;
    L_0x01e4:
        if (r9 < 0) goto L_0x01ec;
    L_0x01e6:
        r10.a = r12;
        r10.b = r9;
        r10.c = r8;
    L_0x01ec:
        r9 = r11.b;
        if (r9 != r8) goto L_0x01f1;
    L_0x01f0:
        goto L_0x01f9;
    L_0x01f1:
        if (r9 < 0) goto L_0x01f9;
    L_0x01f3:
        r10.a = r12;
        r10.b = r8;
        r10.c = r9;
    L_0x01f9:
        r9 = r11.c;
        r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r11 != 0) goto L_0x0201;
    L_0x01ff:
        goto L_0x04c3;
    L_0x0201:
        r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r11 <= 0) goto L_0x04c3;
    L_0x0205:
        r10.a = r9;
        r10.b = r8;
        r10.c = r8;
        goto L_0x04c3;
    L_0x020d:
        r9 = r11.O;
        if (r9 != r8) goto L_0x0241;
    L_0x0211:
        r9 = r11.P;
        if (r9 != r8) goto L_0x0241;
    L_0x0215:
        r9 = r11.Q;
        if (r9 != r8) goto L_0x0241;
    L_0x0219:
        r9 = r11.R;
        if (r9 != r8) goto L_0x0241;
    L_0x021d:
        r9 = r11.h;
        if (r9 != r8) goto L_0x0241;
    L_0x0221:
        r9 = r11.i;
        if (r9 != r8) goto L_0x0241;
    L_0x0225:
        r9 = r11.j;
        if (r9 != r8) goto L_0x0241;
    L_0x0229:
        r9 = r11.k;
        if (r9 != r8) goto L_0x0241;
    L_0x022d:
        r9 = r11.l;
        if (r9 != r8) goto L_0x0241;
    L_0x0231:
        r9 = r11.H;
        if (r9 != r8) goto L_0x0241;
    L_0x0235:
        r9 = r11.I;
        if (r9 != r8) goto L_0x0241;
    L_0x0239:
        r9 = r11.width;
        if (r9 == r8) goto L_0x0241;
    L_0x023d:
        r9 = r11.height;
        if (r9 != r8) goto L_0x04c3;
    L_0x0241:
        r9 = r11.O;
        r12 = r11.P;
        r13 = r11.Q;
        r14 = r11.R;
        r6 = r11.S;
        r15 = r11.T;
        r23 = r5;
        r5 = r11.U;
        if (r9 == r8) goto L_0x0269;
    L_0x0253:
        r19 = r0.a(r9);
        if (r19 == 0) goto L_0x0280;
    L_0x0259:
        r18 = 2;
        r20 = 2;
        r9 = r11.leftMargin;
        r17 = r10;
        r21 = r9;
        r22 = r6;
        r17.a(r18, r19, r20, r21, r22);
        goto L_0x0280;
    L_0x0269:
        if (r12 == r8) goto L_0x0280;
    L_0x026b:
        r19 = r0.a(r12);
        if (r19 == 0) goto L_0x0280;
    L_0x0271:
        r18 = 2;
        r20 = 4;
        r9 = r11.leftMargin;
        r17 = r10;
        r21 = r9;
        r22 = r6;
        r17.a(r18, r19, r20, r21, r22);
    L_0x0280:
        if (r13 == r8) goto L_0x0298;
    L_0x0282:
        r19 = r0.a(r13);
        if (r19 == 0) goto L_0x02af;
    L_0x0288:
        r18 = 4;
        r20 = 2;
        r6 = r11.rightMargin;
        r17 = r10;
        r21 = r6;
        r22 = r15;
        r17.a(r18, r19, r20, r21, r22);
        goto L_0x02af;
    L_0x0298:
        if (r14 == r8) goto L_0x02af;
    L_0x029a:
        r19 = r0.a(r14);
        if (r19 == 0) goto L_0x02af;
    L_0x02a0:
        r18 = 4;
        r20 = 4;
        r6 = r11.rightMargin;
        r17 = r10;
        r21 = r6;
        r22 = r15;
        r17.a(r18, r19, r20, r21, r22);
    L_0x02af:
        r6 = r11.h;
        if (r6 == r8) goto L_0x02cb;
    L_0x02b3:
        r19 = r0.a(r6);
        if (r19 == 0) goto L_0x02e6;
    L_0x02b9:
        r18 = 3;
        r20 = 3;
        r6 = r11.topMargin;
        r9 = r11.q;
        r17 = r10;
        r21 = r6;
        r22 = r9;
        r17.a(r18, r19, r20, r21, r22);
        goto L_0x02e6;
    L_0x02cb:
        r6 = r11.i;
        if (r6 == r8) goto L_0x02e6;
    L_0x02cf:
        r19 = r0.a(r6);
        if (r19 == 0) goto L_0x02e6;
    L_0x02d5:
        r18 = 3;
        r20 = 5;
        r6 = r11.topMargin;
        r9 = r11.q;
        r17 = r10;
        r21 = r6;
        r22 = r9;
        r17.a(r18, r19, r20, r21, r22);
    L_0x02e6:
        r6 = r11.j;
        if (r6 == r8) goto L_0x0302;
    L_0x02ea:
        r19 = r0.a(r6);
        if (r19 == 0) goto L_0x031d;
    L_0x02f0:
        r18 = 5;
        r20 = 3;
        r6 = r11.bottomMargin;
        r9 = r11.r;
        r17 = r10;
        r21 = r6;
        r22 = r9;
        r17.a(r18, r19, r20, r21, r22);
        goto L_0x031d;
    L_0x0302:
        r6 = r11.k;
        if (r6 == r8) goto L_0x031d;
    L_0x0306:
        r19 = r0.a(r6);
        if (r19 == 0) goto L_0x031d;
    L_0x030c:
        r18 = 5;
        r20 = 5;
        r6 = r11.bottomMargin;
        r9 = r11.r;
        r17 = r10;
        r21 = r6;
        r22 = r9;
        r17.a(r18, r19, r20, r21, r22);
    L_0x031d:
        r6 = r11.l;
        r9 = 3;
        if (r6 == r8) goto L_0x036d;
    L_0x0322:
        r12 = r0.a;
        r6 = r12.get(r6);
        r6 = (android.view.View) r6;
        r12 = r11.l;
        r12 = r0.a(r12);
        if (r12 != 0) goto L_0x0333;
    L_0x0332:
        goto L_0x036d;
    L_0x0333:
        if (r6 == 0) goto L_0x036d;
    L_0x0335:
        r13 = r6.getLayoutParams();
        r13 = r13 instanceof defpackage.cs;
        if (r13 == 0) goto L_0x036d;
    L_0x033d:
        r6 = r6.getLayoutParams();
        r6 = (defpackage.cs) r6;
        r13 = 1;
        r11.M = r13;
        r6.M = r13;
        r6 = 6;
        r24 = r10.e(r6);
        r25 = r12.e(r6);
        r26 = 0;
        r27 = -1;
        r28 = 2;
        r29 = 0;
        r30 = 1;
        r24.a(r25, r26, r27, r28, r29, r30);
        r6 = r10.e(r9);
        r6.c();
        r6 = 5;
        r12 = r10.e(r6);
        r12.c();
    L_0x036d:
        r6 = 0;
        r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r12 >= 0) goto L_0x0373;
    L_0x0372:
        goto L_0x037b;
    L_0x0373:
        r12 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r12 == 0) goto L_0x037b;
    L_0x0379:
        r10.H = r5;
    L_0x037b:
        r5 = r11.v;
        r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r12 < 0) goto L_0x038a;
    L_0x0381:
        r12 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r12 != 0) goto L_0x0388;
    L_0x0387:
        goto L_0x038a;
    L_0x0388:
        r10.I = r5;
    L_0x038a:
        r5 = r31.isInEditMode();
        if (r5 == 0) goto L_0x039e;
    L_0x0390:
        r5 = r11.H;
        if (r5 != r8) goto L_0x0398;
    L_0x0394:
        r12 = r11.I;
        if (r12 == r8) goto L_0x039e;
    L_0x0398:
        r12 = r11.I;
        r10.w = r5;
        r10.x = r12;
    L_0x039e:
        r5 = r11.K;
        if (r5 != 0) goto L_0x03c4;
    L_0x03a2:
        r5 = r11.width;
        if (r5 != r8) goto L_0x03bc;
    L_0x03a6:
        r5 = 4;
        r10.f(r5);
        r12 = 2;
        r13 = r10.e(r12);
        r12 = r11.leftMargin;
        r13.c = r12;
        r12 = r10.e(r5);
        r5 = r11.rightMargin;
        r12.c = r5;
        goto L_0x03cd;
    L_0x03bc:
        r10.f(r9);
        r5 = 0;
        r10.a(r5);
        goto L_0x03cd;
    L_0x03c4:
        r5 = 1;
        r10.f(r5);
        r5 = r11.width;
        r10.a(r5);
    L_0x03cd:
        r5 = r11.L;
        if (r5 != 0) goto L_0x03f3;
    L_0x03d1:
        r5 = r11.height;
        if (r5 != r8) goto L_0x03eb;
    L_0x03d5:
        r5 = 4;
        r10.g(r5);
        r5 = r10.e(r9);
        r9 = r11.topMargin;
        r5.c = r9;
        r5 = 5;
        r9 = r10.e(r5);
        r5 = r11.bottomMargin;
        r9.c = r5;
        goto L_0x03fc;
    L_0x03eb:
        r10.g(r9);
        r5 = 0;
        r10.b(r5);
        goto L_0x03fc;
    L_0x03f3:
        r5 = 1;
        r10.g(r5);
        r5 = r11.height;
        r10.b(r5);
    L_0x03fc:
        r5 = r11.w;
        if (r5 != 0) goto L_0x0403;
    L_0x0400:
        r13 = 0;
        goto L_0x049a;
    L_0x0403:
        r9 = r5.length();
        if (r9 != 0) goto L_0x040c;
    L_0x0409:
        r10.u = r6;
        goto L_0x0400;
    L_0x040c:
        r9 = r5.length();
        r12 = 44;
        r12 = r5.indexOf(r12);
        if (r12 > 0) goto L_0x041c;
    L_0x0418:
        r12 = 0;
        r13 = 0;
    L_0x041a:
        r14 = -1;
        goto L_0x0440;
    L_0x041c:
        r13 = r9 + -1;
        if (r12 >= r13) goto L_0x043d;
    L_0x0420:
        r13 = 0;
        r14 = r5.substring(r13, r12);
        r15 = "W";
        r15 = r14.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x0439;
    L_0x042d:
        r15 = "H";
        r14 = r14.equalsIgnoreCase(r15);
        if (r14 != 0) goto L_0x0437;
    L_0x0435:
        r14 = -1;
        goto L_0x043a;
    L_0x0437:
        r14 = 1;
        goto L_0x043a;
    L_0x0439:
        r14 = 0;
    L_0x043a:
        r12 = r12 + 1;
        goto L_0x0440;
    L_0x043d:
        r13 = 0;
        r12 = 0;
        goto L_0x041a;
    L_0x0440:
        r15 = 58;
        r15 = r5.indexOf(r15);
        if (r15 >= 0) goto L_0x0449;
    L_0x0448:
        goto L_0x0482;
    L_0x0449:
        r9 = r9 + -1;
        if (r15 >= r9) goto L_0x0482;
    L_0x044d:
        r9 = r5.substring(r12, r15);
        r15 = r15 + 1;
        r5 = r5.substring(r15);
        r12 = r9.length();
        if (r12 <= 0) goto L_0x0491;
    L_0x045d:
        r12 = r5.length();
        if (r12 <= 0) goto L_0x0491;
    L_0x0463:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0491 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x0491 }
        r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1));
        if (r12 <= 0) goto L_0x0491;
    L_0x046f:
        r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r12 <= 0) goto L_0x0491;
    L_0x0473:
        r12 = 1;
        if (r14 != r12) goto L_0x047c;
    L_0x0476:
        r5 = r5 / r9;
        r5 = java.lang.Math.abs(r5);	 Catch:{ NumberFormatException -> 0x0491 }
        goto L_0x0492;
    L_0x047c:
        r9 = r9 / r5;
        r5 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0491 }
        goto L_0x0492;
    L_0x0482:
        r5 = r5.substring(r12);
        r9 = r5.length();
        if (r9 <= 0) goto L_0x0491;
    L_0x048c:
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x0491 }
        goto L_0x0492;
    L_0x0491:
        r5 = 0;
    L_0x0492:
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x049a;
    L_0x0496:
        r10.u = r5;
        r10.v = r14;
    L_0x049a:
        r5 = r11.x;
        r10.Z = r5;
        r5 = r11.y;
        r10.aa = r5;
        r5 = r11.z;
        r10.V = r5;
        r5 = r11.A;
        r10.W = r5;
        r5 = r11.B;
        r6 = r11.D;
        r9 = r11.F;
        r10.f = r5;
        r10.h = r6;
        r10.i = r9;
        r5 = r11.C;
        r6 = r11.E;
        r9 = r11.G;
        r10.g = r5;
        r10.j = r6;
        r10.k = r9;
        goto L_0x04c6;
    L_0x04c3:
        r23 = r5;
        r13 = 0;
    L_0x04c6:
        r7 = r7 + 1;
        r5 = r23;
        goto L_0x019a;
    L_0x04cc:
        r13 = 0;
        r9 = r9 + 1;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = 0;
        goto L_0x00b6;
    L_0x04d4:
        r13 = 0;
        r5 = r31.getPaddingTop();
        r6 = r31.getPaddingBottom();
        r5 = r5 + r6;
        r6 = r31.getPaddingLeft();
        r7 = r31.getPaddingRight();
        r6 = r6 + r7;
        r7 = r31.getChildCount();
        r9 = 0;
    L_0x04ec:
        r10 = 8;
        if (r9 >= r7) goto L_0x0582;
    L_0x04f0:
        r12 = r0.getChildAt(r9);
        r14 = r12.getVisibility();
        if (r14 == r10) goto L_0x057c;
    L_0x04fa:
        r10 = r12.getLayoutParams();
        r10 = (defpackage.cs) r10;
        r14 = r10.V;
        r15 = r10.N;
        if (r15 != 0) goto L_0x057c;
    L_0x0506:
        r15 = r10.width;
        r13 = r10.height;
        r11 = r10.K;
        if (r11 != 0) goto L_0x0530;
    L_0x050e:
        r11 = r10.L;
        if (r11 != 0) goto L_0x0530;
    L_0x0512:
        r11 = r10.B;
        r8 = 1;
        if (r11 == r8) goto L_0x052f;
    L_0x0517:
        r11 = r10.width;
        r8 = -1;
        if (r11 == r8) goto L_0x0530;
    L_0x051c:
        r11 = r10.L;
        if (r11 == 0) goto L_0x0524;
    L_0x0520:
        r11 = 0;
        r17 = 0;
        goto L_0x0560;
    L_0x0524:
        r11 = r10.C;
        r8 = 1;
        if (r11 == r8) goto L_0x052f;
    L_0x0529:
        r11 = r10.height;
        r8 = -1;
        if (r11 == r8) goto L_0x0530;
    L_0x052e:
        goto L_0x0520;
    L_0x052f:
        r8 = -1;
    L_0x0530:
        if (r15 != 0) goto L_0x0534;
    L_0x0532:
        r11 = -2;
        goto L_0x053f;
    L_0x0534:
        if (r15 == r8) goto L_0x0532;
    L_0x0536:
        r11 = getChildMeasureSpec(r1, r6, r15);
        r15 = r11;
        r11 = -2;
        r17 = 0;
        goto L_0x0545;
    L_0x053f:
        r15 = getChildMeasureSpec(r1, r6, r11);
        r17 = 1;
    L_0x0545:
        if (r13 != 0) goto L_0x0548;
    L_0x0547:
        goto L_0x0550;
    L_0x0548:
        if (r13 == r8) goto L_0x0550;
    L_0x054a:
        r8 = getChildMeasureSpec(r2, r5, r13);
        r11 = 0;
        goto L_0x0555;
    L_0x0550:
        r8 = getChildMeasureSpec(r2, r5, r11);
        r11 = 1;
    L_0x0555:
        r12.measure(r15, r8);
        r15 = r12.getMeasuredWidth();
        r13 = r12.getMeasuredHeight();
    L_0x0560:
        r14.a(r15);
        r14.b(r13);
        if (r17 == 0) goto L_0x056a;
    L_0x0568:
        r14.F = r15;
    L_0x056a:
        if (r11 == 0) goto L_0x056e;
    L_0x056c:
        r14.G = r13;
    L_0x056e:
        r8 = r10.M;
        if (r8 != 0) goto L_0x0573;
    L_0x0572:
        goto L_0x057c;
    L_0x0573:
        r8 = r12.getBaseline();
        r10 = -1;
        if (r8 == r10) goto L_0x057c;
    L_0x057a:
        r14.C = r8;
    L_0x057c:
        r9 = r9 + 1;
        r8 = -1;
        r13 = 0;
        goto L_0x04ec;
    L_0x0582:
        r5 = r31.getChildCount();
        if (r5 <= 0) goto L_0x058b;
    L_0x0588:
        r31.a();
    L_0x058b:
        r5 = r0.b;
        r5 = r5.size();
        r6 = r31.getPaddingBottom();
        r4 = r4 + r6;
        r6 = r31.getPaddingRight();
        r3 = r3 + r6;
        if (r5 <= 0) goto L_0x06b0;
    L_0x059d:
        r7 = r0.c;
        r8 = r7.ad;
        r7 = r7.ae;
        r9 = 0;
        r14 = 0;
        r15 = 0;
    L_0x05a6:
        if (r9 < r5) goto L_0x05af;
    L_0x05a8:
        if (r15 == 0) goto L_0x06b1;
    L_0x05aa:
        r31.a();
        goto L_0x06b1;
    L_0x05af:
        r11 = r0.b;
        r11 = r11.get(r9);
        r11 = (defpackage.dh) r11;
        r12 = r11 instanceof defpackage.dj;
        if (r12 == 0) goto L_0x05bc;
    L_0x05bb:
        goto L_0x05c9;
    L_0x05bc:
        r12 = r11.J;
        r12 = (android.view.View) r12;
        if (r12 != 0) goto L_0x05c3;
    L_0x05c2:
        goto L_0x05c9;
    L_0x05c3:
        r13 = r12.getVisibility();
        if (r13 != r10) goto L_0x05d1;
    L_0x05c9:
        r21 = r5;
        r22 = r8;
        r6 = -1;
        r8 = 5;
        goto L_0x06a6;
    L_0x05d1:
        r13 = r12.getLayoutParams();
        r13 = (defpackage.cs) r13;
        r10 = r13.width;
        r6 = -2;
        if (r10 != r6) goto L_0x05e3;
    L_0x05dc:
        r10 = r13.width;
        r10 = getChildMeasureSpec(r1, r3, r10);
        goto L_0x05ed;
    L_0x05e3:
        r10 = r11.d();
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6);
    L_0x05ed:
        r6 = r13.height;
        r21 = r5;
        r5 = -2;
        if (r6 != r5) goto L_0x05fd;
    L_0x05f4:
        r6 = r13.height;
        r6 = getChildMeasureSpec(r2, r4, r6);
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0607;
    L_0x05fd:
        r6 = r11.g();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5);
    L_0x0607:
        r12.measure(r10, r6);
        r6 = r12.getMeasuredWidth();
        r10 = r12.getMeasuredHeight();
        r5 = r11.d();
        if (r6 == r5) goto L_0x064a;
    L_0x0618:
        r11.a(r6);
        r5 = 2;
        if (r8 != r5) goto L_0x0646;
    L_0x061e:
        r5 = r11.j();
        r6 = r0.c;
        r6 = r6.d();
        if (r5 <= r6) goto L_0x0646;
    L_0x062a:
        r5 = r11.j();
        r6 = 4;
        r15 = r11.e(r6);
        r15 = r15.b();
        r6 = r0.c;
        r22 = r8;
        r8 = r0.d;
        r5 = r5 + r15;
        r5 = java.lang.Math.max(r8, r5);
        r6.a(r5);
        goto L_0x0648;
    L_0x0646:
        r22 = r8;
    L_0x0648:
        r15 = 1;
        goto L_0x064c;
    L_0x064a:
        r22 = r8;
    L_0x064c:
        r5 = r11.g();
        if (r10 == r5) goto L_0x0681;
    L_0x0652:
        r11.b(r10);
        r5 = 2;
        if (r7 != r5) goto L_0x067e;
    L_0x0658:
        r6 = r11.k();
        r8 = r0.c;
        r8 = r8.g();
        if (r6 <= r8) goto L_0x067e;
    L_0x0664:
        r6 = r11.k();
        r8 = 5;
        r10 = r11.e(r8);
        r10 = r10.b();
        r15 = r0.c;
        r5 = r0.e;
        r6 = r6 + r10;
        r5 = java.lang.Math.max(r5, r6);
        r15.b(r5);
        goto L_0x067f;
    L_0x067e:
        r8 = 5;
    L_0x067f:
        r15 = 1;
        goto L_0x0682;
    L_0x0681:
        r8 = 5;
    L_0x0682:
        r5 = r13.M;
        if (r5 == 0) goto L_0x0697;
    L_0x0686:
        r5 = r12.getBaseline();
        r6 = -1;
        if (r5 != r6) goto L_0x068e;
    L_0x068d:
        goto L_0x0698;
    L_0x068e:
        r10 = r11.C;
        if (r5 != r10) goto L_0x0693;
    L_0x0692:
        goto L_0x0698;
    L_0x0693:
        r11.C = r5;
        r15 = 1;
        goto L_0x0698;
    L_0x0697:
        r6 = -1;
    L_0x0698:
        r5 = android.os.Build.VERSION.SDK_INT;
        r10 = 11;
        if (r5 < r10) goto L_0x06a6;
    L_0x069e:
        r5 = r12.getMeasuredState();
        r14 = combineMeasuredStates(r14, r5);
    L_0x06a6:
        r9 = r9 + 1;
        r5 = r21;
        r8 = r22;
        r10 = 8;
        goto L_0x05a6;
    L_0x06b0:
        r14 = 0;
    L_0x06b1:
        r5 = r0.c;
        r5 = r5.d();
        r5 = r5 + r3;
        r3 = r0.c;
        r3 = r3.g();
        r3 = r3 + r4;
        r4 = android.os.Build.VERSION.SDK_INT;
        r6 = 11;
        if (r4 < r6) goto L_0x06f4;
    L_0x06c5:
        r1 = resolveSizeAndState(r5, r1, r14);
        r4 = r14 << 16;
        r2 = resolveSizeAndState(r3, r2, r4);
        r3 = r0.f;
        r1 = java.lang.Math.min(r3, r1);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r1 = r1 & r3;
        r4 = r0.g;
        r2 = java.lang.Math.min(r4, r2);
        r2 = r2 & r3;
        r3 = r0.c;
        r4 = r3.b;
        if (r4 == 0) goto L_0x06e9;
    L_0x06e6:
        r4 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r1 = r1 | r4;
    L_0x06e9:
        r3 = r3.c;
        if (r3 == 0) goto L_0x06f0;
    L_0x06ed:
        r3 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r2 = r2 | r3;
    L_0x06f0:
        r0.setMeasuredDimension(r1, r2);
        return;
    L_0x06f4:
        r0.setMeasuredDimension(r5, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    private final void a() {
        this.c.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            cs csVar = (cs) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || csVar.N || isInEditMode) {
                dh dhVar = csVar.V;
                int h = dhVar.h();
                int i5 = dhVar.i();
                childAt.layout(h, i5, dhVar.d() + h, dhVar.g() + i5);
            }
        }
    }

    private static cs b() {
        return new cs();
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new cs(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof cs;
    }

    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return b();
    }
}
