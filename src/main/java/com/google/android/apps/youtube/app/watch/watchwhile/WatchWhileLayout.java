package com.google.android.apps.youtube.app.watch.watchwhile;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.acvx;
import defpackage.amqw;
import defpackage.aocf;
import defpackage.eix;
import defpackage.eyj;
import defpackage.ezm;
import defpackage.lwf;
import defpackage.lwh;
import defpackage.lwi;
import defpackage.lwj;
import defpackage.lwk;
import defpackage.lwl;
import defpackage.lwm;
import defpackage.lwn;
import defpackage.lwo;
import defpackage.lwp;
import defpackage.lwq;
import defpackage.lws;
import defpackage.lwt;
import defpackage.lwv;
import defpackage.ra;
import defpackage.xpr;
import defpackage.xpu;
import defpackage.xse;
import defpackage.xsr;
import defpackage.xss;
import java.util.Iterator;
import java.util.LinkedList;

public class WatchWhileLayout extends ViewGroup implements lws {
    private Rect A;
    private Rect B;
    private float C;
    private float D;
    private int E;
    private lwn F;
    private lwk G;
    private lwj H;
    private lwt I;
    private lwo J;
    private lwp K;
    private DecelerateInterpolator L;
    private Drawable M;
    private Drawable N;
    private int O;
    private boolean P;
    private eix Q;
    private eix R;
    private boolean S;
    private boolean T;
    private int U;
    private int V;
    private boolean W;
    public xsr a;
    public acvx b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Rect h;
    public lwq i;
    public lwv j;
    public lwl k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private float r;
    private View s;
    private View t;
    private View u;
    private View v;
    private LinkedList w;
    private LinkedList x;
    private int y;
    private int z;

    public WatchWhileLayout(Context context) {
        super(context);
        a(context, null);
    }

    private static int h(int i) {
        return (int) (((float) i) / 1.777f);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null;
    }

    public WatchWhileLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public WatchWhileLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public WatchWhileLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        ((lwi) xse.b(context)).a(this);
        Resources resources = context.getResources();
        this.A = new Rect();
        this.h = new Rect();
        this.B = new Rect();
        this.g = 0;
        this.F = new lwn(this);
        this.G = new lwk(this);
        this.H = new lwj(this, context);
        this.I = new lwt(this);
        this.J = new lwo(this);
        this.K = new lwp(this, context);
        this.L = new DecelerateInterpolator();
        this.E = 0;
        this.e = (int) resources.getDimension(R.dimen.watch_while_mini_player_dismiss_drag_distance);
        this.w = new LinkedList();
        this.x = new LinkedList();
        if (this.a.a()) {
            this.M = ra.a(context, (int) R.drawable.miniplayer_innerglow);
        } else {
            this.M = null;
        }
        this.N = ra.a(context, (int) R.drawable.miniplayer_shadow);
        this.O = (int) resources.getDimension(R.dimen.watch_while_mini_player_shadow_size);
        this.k = new lwl();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lwf.a);
        this.l = obtainStyledAttributes.getResourceId(lwf.f, 0);
        this.m = obtainStyledAttributes.getResourceId(lwf.c, 0);
        this.n = obtainStyledAttributes.getResourceId(lwf.b, 0);
        boolean z = true;
        this.z = obtainStyledAttributes.getBoolean(lwf.g, false) ^ 1;
        this.o = (int) obtainStyledAttributes.getDimension(lwf.d, (float) xss.a(getResources().getDisplayMetrics(), 12));
        this.q = (int) obtainStyledAttributes.getDimension(lwf.e, (float) xss.a(getResources().getDisplayMetrics(), 240));
        obtainStyledAttributes.recycle();
        this.r = 1.777f;
        int i = this.q;
        this.p = (int) (((float) (i * i)) / 1.777f);
        amqw.a(this.l != 0, (Object) "playerViewId must be specified");
        amqw.a(this.m != 0, (Object) "metadataViewId must be specified");
        if (f()) {
            amqw.a(this.n != 0, (Object) "metadataLandscapeTitleViewId must be specified");
        }
        if (abe.g(this) != 1) {
            z = false;
        }
        this.S = z;
        this.Q = new eix();
        this.R = new eix();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        amqw.a(this.s, (Object) "Player view must be present.");
        amqw.a(this.t, (Object) "Metadata view must be present.");
        if (f()) {
            amqw.a(this.u, (Object) "Metadata panel view must not be present in tablet.");
        }
        this.v = new View(getContext());
        this.v.setBackgroundColor(getResources().getColor(17170444));
        addView(this.v);
        c();
        v();
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            int id = view.getId();
            if (this.l == id) {
                this.s = view;
            } else if (this.m == id) {
                this.t = view;
            } else if (this.n == id) {
                this.u = view;
            } else if (!(view == this.v || this.w.contains(view) || this.x.contains(view))) {
                this.x.add(view);
            }
            this.W = false;
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != null) {
            int id = view.getId();
            if (this.l == id) {
                throw new IllegalStateException("Player view must not be removed.");
            } else if (this.m != id) {
                if (this.n == id) {
                    if (f()) {
                        throw new IllegalStateException("Metadata panel view must not be removed in tablet.");
                    }
                    this.u = null;
                } else if (this.x.contains(view)) {
                    this.x.remove(view);
                } else if (this.w.contains(view)) {
                    this.w.remove(view);
                }
            } else {
                throw new IllegalStateException("Metadata view must not be removed.");
            }
        }
    }

    public final ViewGroup a() {
        return (ViewGroup) this.s;
    }

    public final ViewGroup b() {
        return (ViewGroup) this.t;
    }

    public final void bringChildToFront(View view) {
        getContext();
    }

    public final void a(int i) {
        View view;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            view = (View) it.next();
            if (view.getId() == i) {
                break;
            }
        }
        view = null;
        if (view != null) {
            super.bringChildToFront(view);
            this.W = false;
        }
    }

    public final void c() {
        if (!this.W) {
            super.bringChildToFront(this.v);
            View view = this.u;
            if (view != null) {
                super.bringChildToFront(view);
            }
            super.bringChildToFront(this.t);
            super.bringChildToFront(this.s);
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                super.bringChildToFront((View) it.next());
            }
            this.W = true;
        }
    }

    public final void a(lwv lwv) {
        this.j = lwv;
    }

    public final void c(int i) {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void d(int i) {
        if (this.y != i) {
            this.y = i;
            if (e() && this.c > 0) {
                g();
            }
        }
    }

    public final void a_(int i) {
        xpu.a(this, new lwh(this, i));
    }

    public final void a(float f) {
        if (f == 0.0f) {
            f = 1.777f;
        }
        if (this.r != f) {
            int i;
            f = Math.min(1.777f, Math.max(0.5627462f, f));
            int i2 = this.q;
            int i3 = this.p;
            int i4 = i3 / i2;
            int round = (int) Math.round(Math.sqrt((double) (((float) i3) / f)));
            this.q = this.p / round;
            int i5 = (this.h.top + i4) - round;
            if (abe.g(this) == 1) {
                i = this.h.left;
            } else {
                i = (this.h.left + i2) - this.q;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new lwm(this, i, i5, this.q, round));
            float f2 = this.r / f;
            if (f2 < 1.0f) {
                f2 = 1.0f / f2;
            }
            ofFloat.setDuration((long) (f2 * 200.0f));
            ofFloat.start();
            this.r = f;
        }
    }

    public final void a(View view) {
        if (!this.w.contains(view)) {
            this.w.add(view);
            addView(view);
            requestLayout();
        }
    }

    public final void b(View view) {
        if (this.w.contains(view)) {
            this.w.remove(view);
            removeView(view);
            requestLayout();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -1);
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        v();
        String str = "WatchWhileLayout can only be used in EXACTLY mode.";
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(str);
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            int size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            if (q()) {
                a(size, size2);
            } else {
                a(this.B.width(), this.B.height());
            }
            if (!q()) {
                if (this.k.a(0)) {
                    size = (size - getPaddingLeft()) - getPaddingRight();
                    size2 = (size2 - getPaddingTop()) - getPaddingBottom();
                    if (!m()) {
                        this.t.measure(MeasureSpec.makeMeasureSpec(Math.max(0, size), 1073741824), MeasureSpec.makeMeasureSpec(Math.max(0, size2 - this.A.height()), 1073741824));
                    } else if (f()) {
                        this.t.measure(MeasureSpec.makeMeasureSpec(Math.max(0, size - this.A.width()), 1073741824), MeasureSpec.makeMeasureSpec(Math.max(0, size2), 1073741824));
                        this.u.measure(MeasureSpec.makeMeasureSpec(this.A.width(), 1073741824), MeasureSpec.makeMeasureSpec(Math.max(0, size2 - this.A.height()), 1073741824));
                    }
                }
                if (this.k.a(1)) {
                    this.v.measure(i, i2);
                }
                if (this.k.a(2)) {
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        measureChildWithMargins((View) it.next(), i, 0, i2, 0);
                    }
                }
            }
        } else {
            throw new IllegalStateException(str);
        }
    }

    private final void a(int i, int i2) {
        this.s.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i2, aocf.UNSET_ENUM_VALUE));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        View view;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (q()) {
            i5 = i9;
            i6 = i10;
            i7 = 0;
            i8 = 0;
        } else {
            int i11 = this.B.left;
            i7 = i11;
            i8 = this.B.top;
            i5 = this.B.right;
            i6 = this.B.bottom;
        }
        a(this.s, z, i7, i8, i5, i6);
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            view = (View) it.next();
            a(view, z, i7, i8, i7 + view.getMeasuredWidth(), i8 + view.getMeasuredHeight());
        }
        if (!q()) {
            float y;
            int measuredWidth;
            int i12;
            if (r() && !this.P) {
                y = y();
                float f = this.D;
                if (f > 0.0f) {
                    y = Math.max(1.0f - (f / 0.75f), 0.0f);
                }
                Drawable drawable = this.M;
                if (drawable != null) {
                    drawable.setBounds(this.B);
                    this.M.setAlpha(xpr.a(y));
                }
                this.N.setBounds(this.B.left - this.O, this.B.top - this.O, this.B.right + this.O, this.B.bottom + this.O);
                this.N.setAlpha(xpr.a(y));
            }
            if (s()) {
                y = y();
                View view2;
                if (!m()) {
                    this.t.setTranslationX(0.0f);
                    view2 = this.t;
                    view2.setTranslationY((float) a(y, 0, view2.getMeasuredHeight()));
                } else if (f()) {
                    if (this.S) {
                        measuredWidth = this.t.getMeasuredWidth();
                        measuredWidth = -a(y, 0, measuredWidth + measuredWidth);
                    } else {
                        measuredWidth = this.t.getMeasuredWidth();
                        measuredWidth = a(y, 0, measuredWidth + measuredWidth);
                    }
                    this.t.setTranslationX((float) measuredWidth);
                    this.t.setTranslationY(0.0f);
                    view2 = this.u;
                    measuredWidth = view2.getMeasuredHeight();
                    view2.setTranslationY((float) a(y, 0, measuredWidth + measuredWidth));
                }
            }
            i7 = getPaddingLeft();
            i8 = getPaddingTop();
            i9 -= getPaddingRight();
            i10 -= getPaddingBottom();
            if (s() && (z || this.k.a(0))) {
                if (!m()) {
                    i12 = this.A.bottom;
                    view = this.t;
                    a(view, z, i7, i12, i7 + view.getMeasuredWidth(), i12 + this.t.getMeasuredHeight());
                } else if (f()) {
                    measuredWidth = !this.S ? i9 - this.t.getMeasuredWidth() : i7;
                    view = this.t;
                    a(view, z, measuredWidth, i8, measuredWidth + view.getMeasuredWidth(), i8 + this.t.getMeasuredHeight());
                    a(this.u, z, this.A.left, this.A.bottom, this.u.getMeasuredWidth() + this.A.left, this.u.getMeasuredHeight() + this.A.bottom);
                }
                this.k.b(0);
            }
            if (u() && (z || this.k.a(1))) {
                this.v.layout(i7, i8, i9, i10);
                this.k.b(1);
            }
            if (!t()) {
                return;
            }
            if (z || this.k.a(2)) {
                Iterator it2 = this.x.iterator();
                while (it2.hasNext()) {
                    view = (View) it2.next();
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        measuredWidth = marginLayoutParams.leftMargin + i7;
                        i12 = marginLayoutParams.topMargin + i8;
                    } else {
                        measuredWidth = i7;
                        i12 = i8;
                    }
                    a(view, z, measuredWidth, i12, measuredWidth + view.getMeasuredWidth(), i12 + view.getMeasuredHeight());
                }
                this.k.b(2);
            }
        }
    }

    public final ezm d() {
        return new eyj((ViewGroup) findViewById(R.id.watch_info_panel));
    }

    private static void a(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            view.layout(i, i2, i3, i4);
        }
    }

    public final boolean e() {
        return h() || p();
    }

    public final boolean e(int i) {
        if (!e() || this.c == i) {
            return false;
        }
        this.c = i;
        this.d = 0;
        g();
        lwv lwv = this.j;
        if (lwv != null) {
            lwv.a(this.C);
        }
        return true;
    }

    public final boolean f(int i) {
        if (!e() || this.d == i) {
            return false;
        }
        this.d = i;
        g();
        lwv lwv = this.j;
        if (lwv != null) {
            lwv.b(this.D);
        }
        return true;
    }

    public static void a(Rect rect, int i, int i2, int i3, int i4) {
        rect.set(i, i2, i3 + i, i4 + i2);
    }

    public static int a(float f, int i, int i2) {
        return i + Math.round(Math.min(Math.max(f, 0.0f), 1.0f) * ((float) (i2 - i)));
    }

    private final boolean m() {
        return getResources().getConfiguration().orientation == 2;
    }

    public final boolean f() {
        return this.z == 0;
    }

    private final void n() {
        int width = getWidth();
        int height = getHeight();
        boolean m = m();
        if (width != 0 && height != 0) {
            if (width != this.U || height != this.V || m != this.T) {
                int h;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int paddingRight = (width - paddingLeft) - getPaddingRight();
                int paddingBottom = (height - paddingTop) - getPaddingBottom();
                int i = (int) (((float) this.q) / this.r);
                if (!m) {
                    h = h(paddingRight);
                    a(this.A, paddingLeft, paddingTop, paddingRight, h);
                } else if (f()) {
                    if (xss.d(getContext())) {
                        h = Math.round(((float) paddingRight) * 0.7f);
                    } else {
                        h = Math.round(((float) paddingRight) * 0.65f);
                    }
                    int h2 = h(h);
                    if (this.S) {
                        paddingLeft = paddingRight - h;
                    }
                    a(this.A, paddingLeft, paddingTop, h, h2);
                    h = h2;
                } else {
                    a(this.A, paddingLeft, paddingTop, paddingRight, paddingBottom);
                    h = paddingBottom;
                }
                if (this.S) {
                    paddingLeft = this.o;
                } else {
                    paddingLeft = (paddingRight - this.o) - this.q;
                }
                a(this.h, paddingLeft, ((height - getPaddingBottom()) - this.o) - i, this.q, i);
                this.Q.a(this.h.width(), this.h.height());
                this.R.a(this.A.width(), this.A.height());
                int i2 = ((this.h.left + this.h.right) / 2) - ((this.A.left + this.A.right) / 2);
                paddingLeft = ((this.h.top + this.h.bottom) / 2) - ((this.A.top + this.A.bottom) / 2);
                if (Math.abs(paddingLeft) > Math.abs(i2 + i2)) {
                    this.K.a = 0.0f;
                    this.f = (paddingBottom - this.o) - ((h + i) / 2);
                } else {
                    this.K.a = (float) Math.atan2((double) paddingLeft, (double) i2);
                    this.f = (int) Math.sqrt((double) ((i2 * i2) + (paddingLeft * paddingLeft)));
                }
                if (z()) {
                    lwq lwq = this.i;
                    if (lwq == this.F) {
                        g(2);
                    } else if (lwq == this.G) {
                        g(1);
                    } else if (lwq == this.H) {
                        g(0);
                    } else if (lwq == this.I) {
                        g(2);
                    }
                    j();
                } else {
                    this.c = h() ? this.f : 0;
                }
                this.U = width;
                this.V = height;
                this.T = m;
                lwl lwl = this.k;
                for (paddingLeft = 0; paddingLeft < 3; paddingLeft++) {
                    lwl.b[paddingLeft] = false;
                }
                g();
                measure(MeasureSpec.makeMeasureSpec(width, 1073741824), MeasureSpec.makeMeasureSpec(height, 1073741824));
            }
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0087, code skipped:
            if (r1 < 0) goto L_0x0093;
     */
    /* JADX WARNING: Missing block: B:16:0x008f, code skipped:
            if (r1 > 0) goto L_0x0093;
     */
    public final void g() {
        /*
        r8 = this;
        r0 = 0;
        r8.C = r0;
        r8.D = r0;
        r1 = r8.o();
        if (r1 != 0) goto L_0x00f3;
    L_0x000b:
        r1 = r8.B();
        if (r1 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r8.B;
        r1 = r8.J;
        r1 = r1.b;
        r0.set(r1);
        goto L_0x00f0;
    L_0x001c:
        r1 = r8.c;
        if (r1 > 0) goto L_0x0029;
    L_0x0020:
        r0 = r8.B;
        r1 = r8.A;
        r0.set(r1);
        goto L_0x00f0;
    L_0x0029:
        r2 = r8.f;
        if (r1 >= r2) goto L_0x0075;
    L_0x002d:
        r0 = (float) r1;
        r1 = (float) r2;
        r0 = r0 / r1;
        r8.C = r0;
        r1 = r8.B;
        r2 = r8.A;
        r2 = r2.left;
        r3 = r8.h;
        r3 = r3.left;
        r0 = a(r0, r2, r3);
        r2 = r8.C;
        r3 = r8.A;
        r3 = r3.top;
        r4 = r8.h;
        r4 = r4.top;
        r5 = r8.y;
        r4 = r4 + r5;
        r2 = a(r2, r3, r4);
        r3 = r8.C;
        r4 = r8.A;
        r4 = r4.right;
        r5 = r8.h;
        r5 = r5.right;
        r3 = a(r3, r4, r5);
        r4 = r8.C;
        r5 = r8.A;
        r5 = r5.bottom;
        r6 = r8.h;
        r6 = r6.bottom;
        r7 = r8.y;
        r6 = r6 + r7;
        r4 = a(r4, r5, r6);
        r1.set(r0, r2, r3, r4);
        goto L_0x00f0;
    L_0x0075:
        r1 = r8.o;
        r2 = r8.S;
        r3 = 0;
        if (r2 == 0) goto L_0x008a;
    L_0x007c:
        r2 = r8.getWidth();
        r2 = r2 - r1;
        r1 = r8.h;
        r1 = r1.right;
        r1 = r2 - r1;
        if (r1 >= 0) goto L_0x0092;
    L_0x0089:
        goto L_0x0093;
    L_0x008a:
        r2 = r8.h;
        r2 = r2.left;
        r1 = r1 - r2;
        if (r1 <= 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0093;
    L_0x0092:
        r1 = 0;
    L_0x0093:
        r2 = r8.d;
        r1 = r1 + r2;
        r2 = r8.B;
        r3 = r8.h;
        r3 = r3.left;
        r3 = r3 + r1;
        r4 = r8.h;
        r4 = r4.top;
        r5 = r8.y;
        r4 = r4 + r5;
        r5 = r8.h;
        r5 = r5.right;
        r5 = r5 + r1;
        r1 = r8.h;
        r1 = r1.bottom;
        r6 = r8.y;
        r1 = r1 + r6;
        r2.set(r3, r4, r5, r1);
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8.C = r1;
        r2 = r8.d;
        if (r2 == 0) goto L_0x00f0;
    L_0x00bb:
        r2 = java.lang.Math.abs(r2);
        r3 = r8.A();
        r4 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        if (r3 != 0) goto L_0x00d5;
    L_0x00c7:
        r0 = (float) r2;
        r2 = r8.e;
        r2 = (float) r2;
        r0 = r0 / r2;
        r0 = java.lang.Math.min(r0, r1);
        r0 = r0 * r4;
        r8.D = r0;
        goto L_0x00f0;
    L_0x00d5:
        r2 = r8.H;
        r3 = r2.f;
        r3 = r3.isStarted();
        if (r3 == 0) goto L_0x00e5;
    L_0x00df:
        r0 = r2.f;
        r0 = r0.getAnimatedFraction();
    L_0x00e5:
        r2 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r0 = r0 * r2;
        r0 = r0 + r4;
        r0 = java.lang.Math.min(r0, r1);
        r8.D = r0;
    L_0x00f0:
        r8.requestLayout();
    L_0x00f3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout.g():void");
    }

    private final boolean o() {
        return this.g == 0;
    }

    public final boolean h() {
        return this.g == 2;
    }

    private final boolean p() {
        return this.g == 1;
    }

    private final boolean q() {
        return this.g == 3;
    }

    private final boolean r() {
        return o() ^ 1;
    }

    private final boolean s() {
        Object obj = (f() || !m()) ? null : 1;
        return e() && obj == null && y() < 1.0f;
    }

    private final boolean t() {
        boolean z = false;
        if (!q()) {
            if (e()) {
                return y() <= 0.0f ? z : true;
            } else {
                z = true;
            }
        }
    }

    private final boolean u() {
        float y = y();
        return e() && y > 0.0f && y < 1.0f;
    }

    public final void a(boolean z, View view) {
        if (z) {
            z = o();
            if (o()) {
                g(2);
            }
            if (z && view != null) {
                Rect rect;
                this.P = true;
                lwo lwo = this.J;
                xpu.a(lwo.d, view, lwo.e);
                if (lwo.d.b()) {
                    rect = lwo.d.a;
                } else {
                    rect = lwo.e.h;
                }
                lwo.a.set(rect);
                lwo.b.set(rect);
                lwo.c.set(lwo.e.A);
                ValueAnimator valueAnimator = lwo.f;
                int centerX = lwo.c.centerX() - lwo.a.centerX();
                int centerY = lwo.c.centerY() - lwo.a.centerY();
                if (lwo.e.m()) {
                    centerY = (int) Math.sqrt((double) ((centerX * centerX) + (centerY * centerY)));
                }
                WatchWhileLayout watchWhileLayout = lwo.e;
                valueAnimator.setDuration((long) (lwq.a(centerY, watchWhileLayout.f, (!watchWhileLayout.f() ? 400 : 500) - 300, false) + 300));
                lwo.b();
                return;
            }
            this.G.a(0);
            return;
        }
        g(1);
    }

    public final void a(boolean z) {
        if (z) {
            this.F.a(0);
        } else {
            g(2);
        }
    }

    public final void i() {
        g(3);
    }

    public final void b(boolean z) {
        if (z && h()) {
            this.H.a(false);
        } else {
            g(0);
        }
    }

    public final void g(int i) {
        this.g = i;
        this.d = 0;
        if (e()) {
            this.c = !p() ? this.f : 0;
        }
        this.s.setClickable(true);
        lwv lwv = this.j;
        if (lwv != null) {
            int i2 = this.g;
            if (i2 == 0) {
                lwv.p();
            } else if (i2 == 1) {
                lwv.s();
            } else if (i2 == 2) {
                lwv.r();
            } else if (i2 == 3) {
                lwv.t();
            } else if (i2 == 4) {
                lwv.q();
            }
        }
        j();
        this.k.a = false;
        this.P = false;
        g();
    }

    private final void v() {
        float y = y();
        boolean r = r();
        xpr.a(this.s, r);
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            xpr.a((View) it.next(), r);
        }
        r = s();
        xpr.a(this.t, r);
        View view = this.u;
        if (view != null) {
            boolean z = false;
            if (r && f() && m()) {
                z = true;
            }
            xpr.a(view, z);
        }
        if (r) {
            float f = y > 0.1f ? 1.1f - y : 1.0f;
            a(this.t, f);
            a(this.u, f);
        }
        r = u();
        xpr.a(this.v, r);
        if (r) {
            a(this.v, this.L.getInterpolation(1.0f - y) * 0.9f);
        }
        boolean t = t();
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            xpr.a((View) it2.next(), t);
        }
    }

    private final boolean w() {
        return this.E != 0;
    }

    private final void x() {
        if (w()) {
            this.E = 0;
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!z()) {
                C();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (q() || p()) {
            return this.s.requestFocus(i, rect);
        }
        if (this.x.isEmpty() || !((View) this.x.get(0)).requestFocus(i, rect)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Missing block: B:38:0x0088, code skipped:
            if (r8 <= (r10 + r10)) goto L_0x0095;
     */
    /* JADX WARNING: Missing block: B:40:0x0091, code skipped:
            if (java.lang.Math.abs(r8) > r0.c) goto L_0x0093;
     */
    /* JADX WARNING: Missing block: B:42:0x0095, code skipped:
            r0.e = r4;
            r0.f = r5;
     */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r0 = r9.z();
        r1 = 1;
        if (r0 != 0) goto L_0x00da;
    L_0x0007:
        r0 = r9.e();
        r2 = 0;
        if (r0 == 0) goto L_0x00d9;
    L_0x000e:
        r0 = r9.isEnabled();
        if (r0 == 0) goto L_0x00d9;
    L_0x0014:
        r0 = r10.getActionMasked();
        if (r0 == 0) goto L_0x00bd;
    L_0x001a:
        if (r0 == r1) goto L_0x00b4;
    L_0x001c:
        r3 = 2;
        if (r0 == r3) goto L_0x002e;
    L_0x001f:
        r1 = 3;
        if (r0 == r1) goto L_0x00b4;
    L_0x0022:
        r1 = 6;
        if (r0 == r1) goto L_0x0027;
    L_0x0025:
        goto L_0x00d4;
    L_0x0027:
        r0 = r9.K;
        r0.e(r10);
        goto L_0x00d4;
    L_0x002e:
        r0 = r9.w();
        if (r0 != 0) goto L_0x00b3;
    L_0x0034:
        r0 = r9.K;
        r4 = r0.g;
        r4 = r10.findPointerIndex(r4);
        if (r4 < 0) goto L_0x009a;
    L_0x003e:
        r5 = r10.getPointerCount();
        if (r5 <= r4) goto L_0x009a;
    L_0x0044:
        r4 = r0.e;
        r5 = r0.f;
        r6 = r0.c(r10);
        r10 = r0.d(r10);
        r7 = r0.b;
        r7 = r7.h();
        if (r7 == 0) goto L_0x0063;
    L_0x0058:
        r7 = r0.b;
        r8 = r7.c;
        r7 = r7.f;
        if (r8 == r7) goto L_0x0061;
    L_0x0060:
        goto L_0x0063;
    L_0x0061:
        r7 = 1;
        goto L_0x0064;
    L_0x0063:
        r7 = 0;
    L_0x0064:
        r8 = r0.a(r6, r10);
        if (r7 == 0) goto L_0x008b;
    L_0x006a:
        r6 = java.lang.Math.abs(r6);
        r7 = r0.c;
        r7 = r7 + r7;
        if (r6 <= r7) goto L_0x0085;
    L_0x0073:
        r6 = r0.a;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x0083;
    L_0x007a:
        r10 = java.lang.Math.abs(r10);
        r6 = r0.c;
        if (r10 < r6) goto L_0x0083;
    L_0x0082:
        goto L_0x0085;
    L_0x0083:
        r2 = 2;
        goto L_0x009d;
    L_0x0085:
        r10 = r0.c;
        r10 = r10 + r10;
        if (r8 > r10) goto L_0x0093;
    L_0x008a:
        goto L_0x0095;
    L_0x008b:
        r10 = java.lang.Math.abs(r8);
        r3 = r0.c;
        if (r10 <= r3) goto L_0x0095;
    L_0x0093:
        r2 = 1;
        goto L_0x009d;
    L_0x0095:
        r0.e = r4;
        r0.f = r5;
        goto L_0x009d;
    L_0x009a:
        r0.a();
    L_0x009d:
        if (r2 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00d4;
    L_0x00a0:
        r10 = r9.E;
        if (r10 == r2) goto L_0x00d4;
    L_0x00a4:
        r10 = r9.k;
        r10.a();
        r9.E = r2;
        r10 = r9.getParent();
        r10.requestDisallowInterceptTouchEvent(r1);
        goto L_0x00d4;
    L_0x00b3:
        return r1;
    L_0x00b4:
        r9.x();
        r10 = r9.K;
        r10.a();
        goto L_0x00d4;
    L_0x00bd:
        r0 = r9.B;
        r1 = r10.getX();
        r1 = (int) r1;
        r2 = r10.getY();
        r2 = (int) r2;
        r0 = r0.contains(r1, r2);
        if (r0 == 0) goto L_0x00d4;
    L_0x00cf:
        r0 = r9.K;
        r0.b(r10);
    L_0x00d4:
        r10 = r9.w();
        return r10;
    L_0x00d9:
        return r2;
    L_0x00da:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (z()) {
            this.K.a();
            return false;
        }
        this.K.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int c;
        if (actionMasked == 0) {
            this.K.b(motionEvent);
        } else if (actionMasked == 1) {
            actionMasked = this.E;
            if (actionMasked == 2) {
                c = this.K.c(motionEvent, 2);
                actionMasked = this.d;
                int i = this.e;
                lwj lwj;
                if (actionMasked < (-i)) {
                    if (c == 1) {
                        this.I.a(true);
                    } else {
                        lwj = this.H;
                        if (c != 0) {
                            z = true;
                        }
                        lwj.a(z);
                    }
                } else if (actionMasked <= i) {
                    if (actionMasked < -20 && c == 2) {
                        this.H.a(true);
                    } else if (actionMasked > 20 && c == 1) {
                        this.H.a(true);
                    } else {
                        lwt lwt = this.I;
                        if (c != 0) {
                            z = true;
                        }
                        lwt.a(z);
                    }
                } else if (c != 2) {
                    lwj = this.H;
                    if (c != 0) {
                        z = true;
                    }
                    lwj.a(z);
                } else {
                    this.I.a(true);
                }
            } else if (actionMasked == 1) {
                c = this.K.c(motionEvent, 1);
                if (c != 1) {
                    if (c == 2 && h() && this.c < this.f) {
                        this.G.a(2);
                    }
                } else if (p()) {
                    this.F.a(2);
                }
                C();
            }
            x();
            this.K.a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                x();
                this.K.a();
            } else if (actionMasked == 6) {
                this.K.e(motionEvent);
            }
        } else if (w()) {
            if (this.E == 2) {
                c = -this.K.c(motionEvent);
                if (h()) {
                    f(this.d + c);
                }
            } else {
                lwp lwp = this.K;
                e(Math.min(Math.max(this.c - lwp.a(lwp.c(motionEvent), lwp.d(motionEvent)), 0), this.f));
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.K.a();
    }

    private final float y() {
        if (B()) {
            return this.J.a();
        }
        return this.C;
    }

    private final boolean z() {
        lwq lwq = this.i;
        return (lwq == null || lwq.g) ? false : true;
    }

    private final boolean A() {
        return z() && this.i == this.H;
    }

    private final boolean B() {
        return z() && this.i == this.J;
    }

    public final void j() {
        if (z()) {
            this.i.f.cancel();
        }
        this.i = null;
    }

    /* JADX WARNING: Missing block: B:9:0x001e, code skipped:
            if (java.lang.Math.abs(r0) >= r5.e) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:11:0x0026, code skipped:
            if (r5.c >= (r5.f / 2)) goto L_0x0028;
     */
    private final void C() {
        /*
        r5 = this;
        r0 = r5.g;
        r1 = 4;
        r2 = 0;
        r3 = 2;
        r4 = 1;
        if (r0 == r1) goto L_0x002d;
    L_0x0008:
        r0 = r5.q();
        if (r0 != 0) goto L_0x002c;
    L_0x000e:
        r0 = r5.A();
        if (r0 != 0) goto L_0x002a;
    L_0x0014:
        r0 = r5.d;
        if (r0 == 0) goto L_0x0021;
    L_0x0018:
        r0 = java.lang.Math.abs(r0);
        r1 = r5.e;
        if (r0 < r1) goto L_0x0028;
    L_0x0020:
        goto L_0x002a;
    L_0x0021:
        r0 = r5.c;
        r1 = r5.f;
        r1 = r1 / r3;
        if (r0 < r1) goto L_0x002c;
    L_0x0028:
        r1 = 2;
        goto L_0x002d;
    L_0x002a:
        r1 = 0;
        goto L_0x002d;
    L_0x002c:
        r1 = 1;
    L_0x002d:
        if (r1 == 0) goto L_0x0040;
    L_0x002f:
        if (r1 == r4) goto L_0x003a;
    L_0x0031:
        if (r1 == r3) goto L_0x0034;
    L_0x0033:
        goto L_0x0043;
    L_0x0034:
        r0 = r5.F;
        r0.a(r4);
        return;
    L_0x003a:
        r0 = r5.G;
        r0.a(r4);
        return;
    L_0x0040:
        r5.g(r2);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout.C():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2 = this.s;
        boolean contains = this.w.contains(view);
        if (view != view2 && !contains) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == view2 && e() && y() > 0.0f) {
            this.N.draw(canvas);
            Drawable drawable = this.M;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        canvas.restore();
        return drawChild;
    }

    private static void a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.S = z;
    }

    public final eix k() {
        return this.Q;
    }

    public final eix l() {
        return this.R;
    }
}
