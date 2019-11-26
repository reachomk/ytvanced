package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* renamed from: apn */
public abstract class apn {
    private final ass a = new apm(this);
    private final ass b = new app(this);
    public amc i;
    public RecyclerView j;
    public final asq k = new asq(this.a);
    public final asq l = new asq(this.b);
    public aqc m;
    public boolean n = false;
    public boolean o = true;
    public boolean p = true;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;

    public int a(int i, apw apw, aqh aqh) {
        throw null;
    }

    public View a(View view, int i, apw apw, aqh aqh) {
        throw null;
    }

    public void a(int i, int i2, aqh aqh, apo apo) {
    }

    public void a(int i, apo apo) {
    }

    public void a(Parcelable parcelable) {
    }

    public void a(RecyclerView recyclerView) {
    }

    public void a(RecyclerView recyclerView, int i) {
        throw null;
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        throw null;
    }

    public void a(aqh aqh) {
    }

    public void a(String str) {
        throw null;
    }

    public boolean a(apr apr) {
        return apr != null;
    }

    public int b(int i, apw apw, aqh aqh) {
        throw null;
    }

    public int b(aqh aqh) {
        throw null;
    }

    public void b() {
    }

    public int c(aqh aqh) {
        throw null;
    }

    public void c() {
    }

    public void c(apw apw, aqh aqh) {
        throw null;
    }

    public int d(aqh aqh) {
        throw null;
    }

    public void d() {
    }

    public void d(RecyclerView recyclerView) {
    }

    public int e(aqh aqh) {
        throw null;
    }

    public void e() {
    }

    public void e(int i) {
    }

    public void f() {
    }

    public int g(aqh aqh) {
        throw null;
    }

    public abstract apr g();

    public int h(aqh aqh) {
        throw null;
    }

    public boolean h() {
        throw null;
    }

    public boolean i() {
        throw null;
    }

    public Parcelable j() {
        throw null;
    }

    public boolean k() {
        throw null;
    }

    public void l(int i) {
    }

    public boolean l() {
        throw null;
    }

    public boolean o() {
        return false;
    }

    public final void b(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.j = recyclerView;
            this.i = recyclerView.g;
            this.u = recyclerView.getWidth();
            this.v = recyclerView.getHeight();
        } else {
            this.j = null;
            this.i = null;
            this.u = 0;
            this.v = 0;
        }
        this.s = 1073741824;
        this.t = 1073741824;
    }

    public final void b(int i, int i2) {
        this.u = MeasureSpec.getSize(i);
        i = MeasureSpec.getMode(i);
        this.s = i;
        if (i == 0 && !RecyclerView.b) {
            this.u = 0;
        }
        this.v = MeasureSpec.getSize(i2);
        i = MeasureSpec.getMode(i2);
        this.t = i;
        if (i == 0 && !RecyclerView.b) {
            this.v = 0;
        }
    }

    public final void c(int i, int i2) {
        int w = w();
        if (w != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = aocf.UNSET_ENUM_VALUE;
            int i6 = aocf.UNSET_ENUM_VALUE;
            for (int i7 = 0; i7 < w; i7++) {
                View i8 = i(i7);
                Rect rect = this.j.k;
                RecyclerView.a(i8, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.j.k.set(i3, i4, i5, i6);
            a(this.j.k, i, i2);
            return;
        }
        this.j.d(i, i2);
    }

    public void a(Rect rect, int i, int i2) {
        int width = rect.width();
        int x = x();
        int z = z();
        int height = rect.height();
        int y = y();
        d(apn.a(i, (width + x) + z, D()), apn.a(i2, (height + y) + A(), E()));
    }

    public final void t() {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public static int a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            return Math.min(i, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            i = Math.max(i2, i3);
        }
        return i;
    }

    public final void a(boolean z) {
        if (z != this.p) {
            this.p = z;
            this.q = 0;
            RecyclerView recyclerView = this.j;
            if (recyclerView != null) {
                recyclerView.e.b();
            }
        }
    }

    public final void c(RecyclerView recyclerView) {
        d(recyclerView);
    }

    public final void a(RecyclerView recyclerView, apw apw) {
        a(recyclerView);
    }

    public final boolean u() {
        RecyclerView recyclerView = this.j;
        return recyclerView != null && recyclerView.i;
    }

    public apr a(LayoutParams layoutParams) {
        if (layoutParams instanceof apr) {
            return new apr((apr) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new apr((MarginLayoutParams) layoutParams);
        }
        return new apr(layoutParams);
    }

    public apr a(Context context, AttributeSet attributeSet) {
        return new apr(context, attributeSet);
    }

    public final void a(aqc aqc) {
        aqc aqc2 = this.m;
        if (!(aqc2 == null || aqc == aqc2 || !aqc2.f)) {
            aqc2.e();
        }
        this.m = aqc;
        aqc = this.m;
        RecyclerView recyclerView = this.j;
        recyclerView.I.b();
        if (aqc.h) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("An instance of ");
            stringBuilder.append(aqc.getClass().getSimpleName());
            stringBuilder.append(" was started more than once. Each instance of");
            stringBuilder.append(aqc.getClass().getSimpleName());
            stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", stringBuilder.toString());
        }
        aqc.c = recyclerView;
        aqc.d = this;
        int i = aqc.b;
        if (i != -1) {
            aqc.c.L.a = i;
            aqc.f = true;
            aqc.e = true;
            aqc.g = aqc.d(aqc.b);
            aqc.a();
            aqc.c.I.a();
            aqc.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int v() {
        return abe.g(this.j);
    }

    public final void a(View view) {
        a(view, -1);
    }

    public final void a(View view, int i) {
        a(view, i, true);
    }

    public final void b(View view) {
        b(view, -1);
    }

    public final void b(View view, int i) {
        a(view, i, false);
    }

    private final void a(View view, int i, boolean z) {
        aqj d = RecyclerView.d(view);
        if (z || d.m()) {
            this.j.h.b(d);
        } else {
            this.j.h.c(d);
        }
        apr apr = (apr) view.getLayoutParams();
        if (d.g() || d.e()) {
            if (d.e()) {
                d.f();
            } else {
                d.h();
            }
            this.i.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.j) {
            int c = this.i.c(view);
            if (i == -1) {
                i = this.i.a();
            }
            StringBuilder stringBuilder;
            if (c == -1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                stringBuilder.append(this.j.indexOfChild(view));
                stringBuilder.append(this.j.a());
                throw new IllegalStateException(stringBuilder.toString());
            } else if (c != i) {
                apn apn = this.j.n;
                View i2 = apn.i(c);
                if (i2 != null) {
                    apn.h(c);
                    apr apr2 = (apr) i2.getLayoutParams();
                    aqj d2 = RecyclerView.d(i2);
                    if (d2.m()) {
                        apn.j.h.b(d2);
                    } else {
                        apn.j.h.c(d2);
                    }
                    apn.i.a(i2, i, apr2, d2.m());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot move a child from non-existing index:");
                    stringBuilder.append(c);
                    stringBuilder.append(apn.j.toString());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        } else {
            this.i.a(view, i, false);
            apr.e = true;
            aqc aqc = this.m;
            if (aqc != null && aqc.f) {
                aqc.b(view);
            }
        }
        if (apr.f) {
            d.a.invalidate();
            apr.f = false;
        }
    }

    public final void g(int i) {
        if (i(i) != null) {
            amc amc = this.i;
            i = amc.a(i);
            View b = amc.a.b(i);
            if (b != null) {
                if (amc.b.d(i)) {
                    amc.b(b);
                }
                amc.a.a(i);
            }
        }
    }

    public static int c(View view) {
        return ((apr) view.getLayoutParams()).c();
    }

    public final View d(View view) {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            view = recyclerView.b(view);
            if (view == null || this.i.d(view)) {
                return null;
            }
            return view;
        }
        return null;
    }

    public View c(int i) {
        int w = w();
        for (int i2 = 0; i2 < w; i2++) {
            View i3 = i(i2);
            aqj d = RecyclerView.d(i3);
            if (d != null && d.c() == i && !d.b() && (this.j.L.g || !d.m())) {
                return i3;
            }
        }
        return null;
    }

    public final void h(int i) {
        i(i);
        this.i.d(i);
    }

    public final void a(int i, apw apw) {
        View i2 = i(i);
        g(i);
        apw.a(i2);
    }

    public final int w() {
        amc amc = this.i;
        return amc != null ? amc.a() : 0;
    }

    public final View i(int i) {
        amc amc = this.i;
        return amc != null ? amc.b(i) : null;
    }

    public final int x() {
        RecyclerView recyclerView = this.j;
        return recyclerView != null ? recyclerView.getPaddingLeft() : 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.j;
        return recyclerView != null ? recyclerView.getPaddingTop() : 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.j;
        return recyclerView != null ? recyclerView.getPaddingRight() : 0;
    }

    public final int A() {
        RecyclerView recyclerView = this.j;
        return recyclerView != null ? recyclerView.getPaddingBottom() : 0;
    }

    public final View B() {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.i.d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }
        return null;
    }

    public final int C() {
        RecyclerView recyclerView = this.j;
        apa apa = recyclerView != null ? recyclerView.m : null;
        if (apa == null) {
            return 0;
        }
        return apa.a();
    }

    public void j(int i) {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.b(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void k(int i) {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void a(apw apw) {
        int size = apw.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((aqj) apw.a.get(i)).a;
            aqj d = RecyclerView.d(view);
            if (!d.b()) {
                d.a(false);
                if (d.n()) {
                    this.j.removeDetachedView(view, false);
                }
                aph aph = this.j.D;
                if (aph != null) {
                    aph.c(d);
                }
                d.a(true);
                apw.b(view);
            }
        }
        apw.a.clear();
        ArrayList arrayList = apw.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.j.invalidate();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(View view, int i, int i2, apr apr) {
        return (!view.isLayoutRequested() && this.o && apn.b(view.getWidth(), i, apr.width) && apn.b(view.getHeight(), i2, apr.height)) ? false : true;
    }

    public static boolean b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == aocf.UNSET_ENUM_VALUE) {
            return i2 >= i;
        } else {
            if (mode != 0) {
                return mode == 1073741824 && i2 == i;
            } else {
                return true;
            }
        }
    }

    public void e(View view) {
        apr apr = (apr) view.getLayoutParams();
        Rect g = this.j.g(view);
        int i = g.left;
        int i2 = g.right;
        int i3 = g.top;
        int i4 = g.bottom;
        i = apn.a(this.u, this.s, (((x() + z()) + apr.leftMargin) + apr.rightMargin) + (i + i2), apr.width, k());
        i4 = apn.a(this.v, this.t, (((y() + A()) + apr.topMargin) + apr.bottomMargin) + (i3 + i4), apr.height, l());
        if (a(view, i, i4, apr)) {
            view.measure(i, i4);
        }
    }

    /* JADX WARNING: Missing block: B:2:0x000a, code skipped:
            if (r3 >= 0) goto L_0x001b;
     */
    @java.lang.Deprecated
    public static int a(int r1, int r2, int r3, boolean r4) {
        /*
        r1 = r1 - r2;
        r2 = 0;
        r1 = java.lang.Math.max(r2, r1);
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r4 == 0) goto L_0x000f;
    L_0x000a:
        if (r3 < 0) goto L_0x000d;
    L_0x000c:
        goto L_0x001b;
    L_0x000d:
        r1 = 0;
        goto L_0x001e;
    L_0x000f:
        if (r3 >= 0) goto L_0x001b;
    L_0x0011:
        r4 = -1;
        if (r3 == r4) goto L_0x001c;
    L_0x0014:
        r4 = -2;
        if (r3 == r4) goto L_0x0018;
    L_0x0017:
        goto L_0x000d;
    L_0x0018:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x001e;
    L_0x001b:
        r1 = r3;
    L_0x001c:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x001e:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apn.a(int, int, int, boolean):int");
    }

    /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (r5 == 1073741824) goto L_0x002a;
     */
    public static int a(int r4, int r5, int r6, int r7, boolean r8) {
        /*
        r4 = r4 - r6;
        r6 = 0;
        r4 = java.lang.Math.max(r6, r4);
        r0 = -2;
        r1 = -1;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r8 == 0) goto L_0x001a;
    L_0x000e:
        if (r7 < 0) goto L_0x0011;
    L_0x0010:
        goto L_0x002d;
    L_0x0011:
        if (r7 != r1) goto L_0x0028;
    L_0x0013:
        if (r5 == r2) goto L_0x002a;
    L_0x0015:
        if (r5 == 0) goto L_0x0028;
    L_0x0017:
        if (r5 == r3) goto L_0x002a;
    L_0x0019:
        goto L_0x0028;
    L_0x001a:
        if (r7 >= 0) goto L_0x002d;
    L_0x001c:
        if (r7 == r1) goto L_0x002a;
    L_0x001e:
        if (r7 != r0) goto L_0x0028;
    L_0x0020:
        if (r5 == r2) goto L_0x0026;
    L_0x0022:
        if (r5 != r3) goto L_0x0025;
    L_0x0024:
        goto L_0x0026;
    L_0x0025:
        r2 = 0;
    L_0x0026:
        r6 = r4;
        goto L_0x0030;
    L_0x0028:
        r2 = 0;
        goto L_0x0030;
    L_0x002a:
        r6 = r4;
        r2 = r5;
        goto L_0x0030;
    L_0x002d:
        r6 = r7;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0030:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apn.a(int, int, int, int, boolean):int");
    }

    public static int f(View view) {
        Rect rect = ((apr) view.getLayoutParams()).d;
        return (view.getMeasuredWidth() + rect.left) + rect.right;
    }

    public static int g(View view) {
        Rect rect = ((apr) view.getLayoutParams()).d;
        return (view.getMeasuredHeight() + rect.top) + rect.bottom;
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        apr apr = (apr) view.getLayoutParams();
        Rect rect = apr.d;
        view.layout((i + rect.left) + apr.leftMargin, (i2 + rect.top) + apr.topMargin, (i3 - rect.right) - apr.rightMargin, (i4 - rect.bottom) - apr.bottomMargin);
    }

    public final void a(View view, Rect rect) {
        Rect rect2 = ((apr) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.j != null) {
            Matrix matrix = view.getMatrix();
            if (!(matrix == null || matrix.isIdentity())) {
                RectF rectF = this.j.l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static int h(View view) {
        return view.getLeft() - apn.l(view);
    }

    public static int i(View view) {
        return view.getTop() - ((apr) view.getLayoutParams()).d.top;
    }

    public static int j(View view) {
        return view.getRight() + apn.m(view);
    }

    public static int k(View view) {
        return view.getBottom() + ((apr) view.getLayoutParams()).d.bottom;
    }

    public final void b(View view, Rect rect) {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.g(view));
        }
    }

    public static int l(View view) {
        return ((apr) view.getLayoutParams()).d.left;
    }

    public static int m(View view) {
        return ((apr) view.getLayoutParams()).d.right;
    }

    /* JADX WARNING: Missing block: B:20:0x00b1, code skipped:
            if ((r10.bottom - r15) > r5) goto L_0x00b3;
     */
    public final boolean a(android.support.v7.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r19;
        r3 = 2;
        r3 = new int[r3];
        r4 = r16.x();
        r5 = r16.y();
        r6 = r0.u;
        r7 = r16.z();
        r8 = r0.v;
        r9 = r16.A();
        r10 = r18.getLeft();
        r11 = r2.left;
        r10 = r10 + r11;
        r11 = r18.getScrollX();
        r10 = r10 - r11;
        r11 = r18.getTop();
        r12 = r2.top;
        r11 = r11 + r12;
        r12 = r18.getScrollY();
        r11 = r11 - r12;
        r12 = r19.width();
        r2 = r19.height();
        r4 = r10 - r4;
        r13 = 0;
        r14 = java.lang.Math.min(r13, r4);
        r5 = r11 - r5;
        r15 = java.lang.Math.min(r13, r5);
        r10 = r10 + r12;
        r6 = r6 - r7;
        r10 = r10 - r6;
        r6 = java.lang.Math.max(r13, r10);
        r11 = r11 + r2;
        r8 = r8 - r9;
        r11 = r11 - r8;
        r2 = java.lang.Math.max(r13, r11);
        r7 = r16.v();
        r8 = 1;
        if (r7 != r8) goto L_0x0068;
    L_0x005f:
        if (r6 != 0) goto L_0x0066;
    L_0x0061:
        r14 = java.lang.Math.max(r14, r10);
        goto L_0x006e;
    L_0x0066:
        r14 = r6;
        goto L_0x006e;
    L_0x0068:
        if (r14 != 0) goto L_0x006e;
    L_0x006a:
        r14 = java.lang.Math.min(r4, r6);
    L_0x006e:
        if (r15 != 0) goto L_0x0074;
    L_0x0070:
        r15 = java.lang.Math.min(r5, r2);
    L_0x0074:
        r3[r13] = r14;
        r3[r8] = r15;
        r2 = r3[r13];
        if (r21 == 0) goto L_0x00b3;
    L_0x007c:
        r3 = r17.getFocusedChild();
        if (r3 == 0) goto L_0x00b8;
    L_0x0082:
        r4 = r16.x();
        r5 = r16.y();
        r6 = r0.u;
        r7 = r16.z();
        r9 = r0.v;
        r10 = r16.A();
        r9 = r9 - r10;
        r10 = r0.j;
        r10 = r10.k;
        android.support.v7.widget.RecyclerView.a(r3, r10);
        r3 = r10.left;
        r3 = r3 - r2;
        r6 = r6 - r7;
        if (r3 >= r6) goto L_0x00b8;
    L_0x00a4:
        r3 = r10.right;
        r3 = r3 - r2;
        if (r3 <= r4) goto L_0x00b8;
    L_0x00a9:
        r3 = r10.top;
        r3 = r3 - r15;
        if (r3 >= r9) goto L_0x00b8;
    L_0x00ae:
        r3 = r10.bottom;
        r3 = r3 - r15;
        if (r3 <= r5) goto L_0x00b8;
    L_0x00b3:
        if (r2 != 0) goto L_0x00b9;
    L_0x00b5:
        if (r15 == 0) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00b9;
    L_0x00b8:
        return r13;
    L_0x00b9:
        if (r20 != 0) goto L_0x00bf;
    L_0x00bb:
        r1.a(r2, r15);
        goto L_0x00c2;
    L_0x00bf:
        r1.scrollBy(r2, r15);
    L_0x00c2:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apn.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean a(View view, boolean z) {
        int i = 0;
        if (this.k.a(view) && this.l.a(view)) {
            i = 1;
        }
        return !z ? i ^ 1 : i;
    }

    public final void d(int i, int i2) {
        this.j.setMeasuredDimension(i, i2);
    }

    public final int D() {
        return abe.n(this.j);
    }

    public final int E() {
        return abe.o(this.j);
    }

    public final void b(apw apw) {
        int w = w();
        while (true) {
            w--;
            if (w < 0) {
                return;
            }
            if (!RecyclerView.d(i(w)).b()) {
                a(w, apw);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(View view, aca aca) {
        aqj d = RecyclerView.d(view);
        if (d != null && !d.m() && !this.i.d(d.a)) {
            RecyclerView recyclerView = this.j;
            a(recyclerView.e, recyclerView.L, view, aca);
        }
    }

    public void a(apw apw, aqh aqh, View view, aca aca) {
        aca.a(acf.a(l() ? apn.c(view) : 0, 1, k() ? apn.c(view) : 0, 1, false));
    }

    public int a(apw apw, aqh aqh) {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null || recyclerView.m == null || !l()) {
            return 1;
        }
        return this.j.m.a();
    }

    public int b(apw apw, aqh aqh) {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null || recyclerView.m == null || !k()) {
            return 1;
        }
        return this.j.m.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A:{SKIP} */
    public boolean a(defpackage.apw r2, defpackage.aqh r3, int r4, android.os.Bundle r5) {
        /*
        r1 = this;
        r2 = r1.j;
        r3 = 0;
        if (r2 == 0) goto L_0x0073;
    L_0x0005:
        r5 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = 1;
        if (r4 == r5) goto L_0x003e;
    L_0x000a:
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r4 == r5) goto L_0x0011;
    L_0x000e:
        r2 = 0;
    L_0x000f:
        r4 = 0;
        goto L_0x0067;
    L_0x0011:
        r4 = -1;
        r2 = r2.canScrollVertically(r4);
        if (r2 != 0) goto L_0x001a;
    L_0x0018:
        r2 = 0;
        goto L_0x0027;
    L_0x001a:
        r2 = r1.v;
        r5 = r1.y();
        r2 = r2 - r5;
        r5 = r1.A();
        r2 = r2 - r5;
        r2 = -r2;
    L_0x0027:
        r5 = r1.j;
        r4 = r5.canScrollHorizontally(r4);
        if (r4 != 0) goto L_0x0030;
    L_0x002f:
        goto L_0x005a;
    L_0x0030:
        r4 = r1.u;
        r5 = r1.x();
        r4 = r4 - r5;
        r5 = r1.z();
        r4 = r4 - r5;
        r4 = -r4;
        goto L_0x0067;
    L_0x003e:
        r2 = r2.canScrollVertically(r0);
        if (r2 != 0) goto L_0x0046;
    L_0x0044:
        r2 = 0;
        goto L_0x0052;
    L_0x0046:
        r2 = r1.v;
        r4 = r1.y();
        r2 = r2 - r4;
        r4 = r1.A();
        r2 = r2 - r4;
    L_0x0052:
        r4 = r1.j;
        r4 = r4.canScrollHorizontally(r0);
        if (r4 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x000f;
    L_0x005b:
        r4 = r1.u;
        r5 = r1.x();
        r4 = r4 - r5;
        r5 = r1.z();
        r4 = r4 - r5;
    L_0x0067:
        if (r2 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006d;
    L_0x006a:
        if (r4 != 0) goto L_0x006d;
    L_0x006c:
        return r3;
    L_0x006d:
        r3 = r1.j;
        r3.a(r4, r2);
        return r0;
    L_0x0073:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apn.a(apw, aqh, int, android.os.Bundle):boolean");
    }

    public final void e(RecyclerView recyclerView) {
        b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }
}
