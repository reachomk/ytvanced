package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.youtube.R;
import defpackage.aau;
import defpackage.aax;
import defpackage.abe;
import defpackage.abp;
import defpackage.agr;
import defpackage.akr;
import defpackage.aks;
import defpackage.amc;
import defpackage.amg;
import defpackage.amy;
import defpackage.ani;
import defpackage.ank;
import defpackage.aocf;
import defpackage.aov;
import defpackage.aow;
import defpackage.aox;
import defpackage.aoy;
import defpackage.aoz;
import defpackage.apa;
import defpackage.apb;
import defpackage.ape;
import defpackage.apf;
import defpackage.aph;
import defpackage.api;
import defpackage.apj;
import defpackage.apk;
import defpackage.apl;
import defpackage.apn;
import defpackage.apq;
import defpackage.apr;
import defpackage.aps;
import defpackage.apt;
import defpackage.apu;
import defpackage.apv;
import defpackage.apw;
import defpackage.apy;
import defpackage.apz;
import defpackage.aqb;
import defpackage.aqc;
import defpackage.aqg;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqj;
import defpackage.asu;
import defpackage.asv;
import defpackage.asw;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements aau {
    public static final Interpolator S = new aow();
    private static final int[] T = new int[]{16843830};
    private static final int[] U = new int[]{16842987};
    private static final Class[] V = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final boolean a;
    public static final boolean b = (VERSION.SDK_INT >= 23);
    public static final boolean c = true;
    public static final boolean d = (VERSION.SDK_INT >= 21);
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public aph D;
    public int E;
    public apt F;
    public final int G;
    public boolean H;
    public final aqg I;
    public ani J;
    public ank K;
    public final aqh L;
    public List M;
    public boolean N;
    public boolean O;
    public boolean P;
    public aqi Q;
    public final int[] R;
    private final apy W;
    private final int[] aA;
    private final List aB;
    private Runnable aC;
    private final asw aD;
    private aqb aa;
    private final Rect ab;
    private final ArrayList ac;
    private aps ad;
    private int ae;
    private boolean af;
    private int ag;
    private final AccessibilityManager ah;
    private boolean ai;
    private int aj;
    private int ak;
    private int al;
    private VelocityTracker am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private final int as;
    private float at;
    private float au;
    private apj av;
    private apf aw;
    private final int[] ax;
    private aax ay;
    private final int[] az;
    public final apw e;
    public akr f;
    public amc g;
    public final asv h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public apa m;
    public apn n;
    public apz o;
    public final ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public List w;
    public boolean x;
    public ape y;
    public EdgeEffect z;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(context, attributeSet, i);
        this.W = new apy(this);
        this.e = new apw(this);
        this.h = new asv();
        this.j = new aov(this);
        this.k = new Rect();
        this.ab = new Rect();
        this.l = new RectF();
        this.p = new ArrayList();
        this.ac = new ArrayList();
        this.ae = 0;
        this.x = false;
        this.ai = false;
        this.aj = 0;
        this.ak = 0;
        this.y = new ape();
        this.D = new amg();
        this.E = 0;
        this.al = -1;
        this.at = Float.MIN_VALUE;
        this.au = Float.MIN_VALUE;
        this.H = true;
        this.I = new aqg(this);
        this.K = d ? new ank() : null;
        this.L = new aqh();
        this.N = false;
        this.O = false;
        this.av = new apl(this);
        this.P = false;
        this.ax = new int[2];
        this.az = new int[2];
        this.aA = new int[2];
        this.R = new int[2];
        this.aB = new ArrayList();
        this.aC = new aox(this);
        this.aD = new aoz(this);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, U, i2, 0);
            this.i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ar = viewConfiguration.getScaledTouchSlop();
        this.at = abp.a(viewConfiguration, context2);
        this.au = abp.b(viewConfiguration, context2);
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.as = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.D.h = this.av;
        this.f = new akr(new apb(this));
        this.g = new amc(new aoy(this));
        if (abe.a(this) == 0) {
            abe.b(this);
        }
        if (abe.f(this) == 0) {
            abe.b(this, 1);
        }
        this.ah = (AccessibilityManager) getContext().getSystemService("accessibility");
        a(new aqi(this));
        if (attributeSet2 != null) {
            String str;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, agr.a, i2, 0);
            String string = obtainStyledAttributes2.getString(agr.h);
            if (obtainStyledAttributes2.getInt(agr.b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(agr.c, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(agr.f);
                Drawable drawable = obtainStyledAttributes2.getDrawable(agr.g);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(agr.d);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(agr.e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to set fast scroller without both required drawables.");
                    stringBuilder.append(a());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Resources resources = getContext().getResources();
                str = string;
                amy amy = new amy(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                str = string;
            }
            obtainStyledAttributes2.recycle();
            a(context2, str, attributeSet2, i2);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, T, i2, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            } else {
                z = true;
            }
        } else {
            z = true;
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.m);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.n);
        stringBuilder.append(", context:");
        stringBuilder.append(getContext());
        return stringBuilder.toString();
    }

    public final void a(aqi aqi) {
        this.Q = aqi;
        abe.a((View) this, this.Q);
    }

    private final void a(Context context, String str, AttributeSet attributeSet, int i) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            str = str.trim();
            if (!str.isEmpty()) {
                StringBuilder stringBuilder3;
                if (str.charAt(0) == '.') {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(context.getPackageName());
                    stringBuilder3.append(str);
                    str = stringBuilder3.toString();
                } else if (!str.contains(".")) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(RecyclerView.class.getPackage().getName());
                    stringBuilder3.append('.');
                    stringBuilder3.append(str);
                    str = stringBuilder3.toString();
                }
                try {
                    ClassLoader classLoader;
                    Constructor constructor;
                    Object[] objArr;
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(apn.class);
                    try {
                        constructor = asSubclass.getConstructor(V);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    a((apn) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(": Error creating LayoutManager ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(attributeSet.getPositionDescription());
                    stringBuilder2.append(": Unable to find LayoutManager ");
                    stringBuilder2.append(str);
                    throw new IllegalStateException(stringBuilder2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString(), e4);
                } catch (InstantiationException e5) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString(), e5);
                } catch (IllegalAccessException e6) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(attributeSet.getPositionDescription());
                    stringBuilder2.append(": Cannot access non-public constructor ");
                    stringBuilder2.append(str);
                    throw new IllegalStateException(stringBuilder2.toString(), e6);
                } catch (ClassCastException e7) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(attributeSet.getPositionDescription());
                    stringBuilder2.append(": Class is not a LayoutManager ");
                    stringBuilder2.append(str);
                    throw new IllegalStateException(stringBuilder2.toString(), e7);
                }
            }
        }
    }

    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            k();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    public final boolean getClipToPadding() {
        return this.i;
    }

    public final void a(apa apa) {
        suppressLayout(false);
        apa apa2 = this.m;
        if (apa2 != null) {
            apa2.b(this.W);
            this.m.Z_();
        }
        b();
        this.f.a();
        apa2 = this.m;
        this.m = apa;
        if (apa != null) {
            apa.a(this.W);
            apa.a(this);
        }
        apw apw = this.e;
        apa apa3 = this.m;
        apw.a();
        apu d = apw.d();
        if (apa2 != null) {
            d.c();
        }
        if (d.a == 0) {
            d.a();
        }
        if (apa3 != null) {
            d.b();
        }
        this.L.f = true;
        c(false);
        requestLayout();
    }

    public final void b() {
        aph aph = this.D;
        if (aph != null) {
            aph.d();
        }
        apn apn = this.n;
        if (apn != null) {
            apn.b(this.e);
            this.n.a(this.e);
        }
        this.e.a();
    }

    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final void a(apq apq) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(apq);
    }

    public final void b(apq apq) {
        List list = this.w;
        if (list != null) {
            list.remove(apq);
        }
    }

    public void a(apn apn) {
        if (apn != this.n) {
            s();
            if (this.n != null) {
                aph aph = this.D;
                if (aph != null) {
                    aph.d();
                }
                this.n.b(this.e);
                this.n.a(this.e);
                this.e.a();
                if (this.q) {
                    this.n.a(this, this.e);
                }
                this.n.b(null);
                this.n = null;
            } else {
                this.e.a();
            }
            amc amc = this.g;
            amc.b.a();
            int size = amc.c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                amc.a.d((View) amc.c.get(size));
                amc.c.remove(size);
            }
            amc.a.b();
            this.n = apn;
            if (apn != null) {
                if (apn.j == null) {
                    this.n.b(this);
                    if (this.q) {
                        this.n.c(this);
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LayoutManager ");
                    stringBuilder.append(apn);
                    stringBuilder.append(" is already attached to a RecyclerView:");
                    stringBuilder.append(apn.j.a());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.e.b();
            requestLayout();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        aqb aqb = new aqb(super.onSaveInstanceState());
        aqb aqb2 = this.aa;
        if (aqb2 == null) {
            apn apn = this.n;
            if (apn != null) {
                aqb.a = apn.j();
            } else {
                aqb.a = null;
            }
        } else {
            aqb.a = aqb2.a;
        }
        return aqb;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof aqb) {
            this.aa = (aqb) parcelable;
            super.onRestoreInstanceState(this.aa.g);
            apn apn = this.n;
            if (apn != null) {
                Parcelable parcelable2 = this.aa.a;
                if (parcelable2 != null) {
                    apn.a(parcelable2);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void a(aqj aqj) {
        View view = aqj.a;
        RecyclerView parent = view.getParent();
        this.e.b(a(view));
        if (aqj.n()) {
            this.g.a(view, -1, view.getLayoutParams(), true);
        } else if (parent == this) {
            amc amc = this.g;
            int a = amc.a.a(view);
            if (a >= 0) {
                amc.b.a(a);
                amc.a(view);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("view is not a child, cannot hide ");
            stringBuilder.append(view);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            this.g.a(view, -1, true);
        }
    }

    public final void a(apu apu) {
        apw apw = this.e;
        apu apu2 = apw.f;
        if (apu2 != null) {
            apu2.c();
        }
        apw.f = apu;
        apu = apw.f;
        if (apu != null && apw.g.m != null) {
            apu.b();
        }
    }

    public final void a(int i) {
        apw apw = this.e;
        apw.e = i;
        apw.b();
    }

    public final void b(int i) {
        if (i != this.E) {
            this.E = i;
            if (i != 2) {
                t();
            }
            apn apn = this.n;
            if (apn != null) {
                apn.l(i);
            }
            List list = this.M;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((apv) this.M.get(size)).a(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void a(apk apk, int i) {
        apn apn = this.n;
        if (apn != null) {
            apn.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.p.add(apk);
        } else {
            this.p.add(0, apk);
        }
        C();
        requestLayout();
    }

    public final void a(apk apk) {
        a(apk, -1);
    }

    public final int c() {
        return this.p.size();
    }

    public final void d() {
        int c = c();
        String str = "0 is an invalid index for size ";
        StringBuilder stringBuilder;
        if (c > 0) {
            c = c();
            if (c > 0) {
                b((apk) this.p.get(0));
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(c);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(c);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final void b(apk apk) {
        apn apn = this.n;
        if (apn != null) {
            apn.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.p.remove(apk);
        if (this.p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        C();
        requestLayout();
    }

    public final void a(apf apf) {
        if (apf != this.aw) {
            this.aw = apf;
            setChildrenDrawingOrderEnabled(this.aw != null);
        }
    }

    public final void a(apv apv) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(apv);
    }

    public final void b(apv apv) {
        List list = this.M;
        if (list != null) {
            list.remove(apv);
        }
    }

    public final void c(int i) {
        if (!this.u) {
            s();
            apn apn = this.n;
            if (apn == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                apn.e(i);
                awakenScrollBars();
            }
        }
    }

    public final void d(int i) {
        if (this.n != null) {
            b(2);
            this.n.e(i);
            awakenScrollBars();
        }
    }

    public final void e(int i) {
        if (!this.u) {
            apn apn = this.n;
            if (apn == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            apn.a(this, i);
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void scrollBy(int i, int i2) {
        apn apn = this.n;
        if (apn == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.u) {
            boolean k = apn.k();
            boolean l = this.n.l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                a(i, i2, null);
            }
        }
    }

    public final void a(int i, int i2, int[] iArr) {
        f();
        l();
        a(this.L);
        i = i != 0 ? this.n.a(i, this.e, this.L) : 0;
        i2 = i2 != 0 ? this.n.b(i2, this.e, this.L) : 0;
        int a = this.g.a();
        for (int i3 = 0; i3 < a; i3++) {
            View b = this.g.b(i3);
            aqj a2 = a(b);
            if (a2 != null) {
                a2 = a2.i;
                if (a2 != null) {
                    View view = a2.a;
                    int left = b.getLeft();
                    int top = b.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
        w();
        a(false);
        if (iArr != null) {
            iArr[0] = i;
            iArr[1] = i2;
        }
    }

    public final void e() {
        if (!this.s || this.x) {
            y();
            return;
        }
        if (this.f.d()) {
            if (this.f.a(4) && !this.f.a(11)) {
                f();
                l();
                this.f.b();
                if (!this.t) {
                    int a = this.g.a();
                    for (int i = 0; i < a; i++) {
                        aqj d = d(this.g.b(i));
                        if (d != null && !d.b() && d.t()) {
                            y();
                            break;
                        }
                    }
                    this.f.c();
                }
                a(true);
                w();
            } else if (this.f.d()) {
                y();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARNING: Missing block: B:33:0x011d, code skipped:
            if (r3 == 0.0f) goto L_0x0122;
     */
    /* JADX WARNING: Missing block: B:39:0x012c, code skipped:
            if (r0 != 0) goto L_0x012e;
     */
    private final boolean a(int r21, int r22, android.view.MotionEvent r23) {
        /*
        r20 = this;
        r8 = r20;
        r9 = r21;
        r10 = r22;
        r11 = r23;
        r20.e();
        r0 = r8.m;
        r12 = 1;
        r13 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0011:
        r0 = r8.R;
        r0[r13] = r13;
        r0[r12] = r13;
        r8.a(r9, r10, r0);
        r0 = r8.R;
        r1 = r0[r13];
        r0 = r0[r12];
        r2 = r9 - r1;
        r3 = r10 - r0;
        r7 = r0;
        r15 = r1;
        r16 = r2;
        r14 = r3;
        goto L_0x002f;
    L_0x002a:
        r7 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
    L_0x002f:
        r0 = r8.p;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x003a;
    L_0x0037:
        r20.invalidate();
    L_0x003a:
        r6 = r8.R;
        r6[r13] = r13;
        r6[r12] = r13;
        r5 = r8.az;
        r17 = 0;
        r0 = r20;
        r1 = r15;
        r2 = r7;
        r3 = r16;
        r4 = r14;
        r18 = r6;
        r6 = r17;
        r19 = r7;
        r7 = r18;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        r0 = r8.R;
        r1 = r0[r13];
        r1 = r16 - r1;
        r0 = r0[r12];
        r14 = r14 - r0;
        r0 = r8.ap;
        r2 = r8.az;
        r3 = r2[r13];
        r0 = r0 - r3;
        r8.ap = r0;
        r0 = r8.aq;
        r2 = r2[r12];
        r0 = r0 - r2;
        r8.aq = r0;
        if (r11 == 0) goto L_0x0076;
    L_0x0071:
        r0 = (float) r3;
        r2 = (float) r2;
        r11.offsetLocation(r0, r2);
    L_0x0076:
        r0 = r8.aA;
        r2 = r0[r13];
        r3 = r8.az;
        r4 = r3[r13];
        r2 = r2 + r4;
        r0[r13] = r2;
        r2 = r0[r12];
        r3 = r3[r12];
        r2 = r2 + r3;
        r0[r12] = r2;
        r0 = r20.getOverScrollMode();
        r2 = 2;
        if (r0 == r2) goto L_0x0125;
    L_0x008f:
        if (r11 != 0) goto L_0x0093;
    L_0x0091:
        goto L_0x0122;
    L_0x0093:
        r0 = r23.getSource();
        r2 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        r0 = r0 & r2;
        if (r0 == r2) goto L_0x0122;
    L_0x009c:
        r0 = r23.getX();
        r1 = (float) r1;
        r2 = r23.getY();
        r3 = (float) r14;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r6 >= 0) goto L_0x00c6;
    L_0x00ad:
        r20.g();
        r6 = r8.z;
        r7 = -r1;
        r11 = r20.getWidth();
        r11 = (float) r11;
        r7 = r7 / r11;
        r11 = r20.getHeight();
        r11 = (float) r11;
        r2 = r2 / r11;
        r2 = r4 - r2;
        defpackage.acx.a(r6, r7, r2);
    L_0x00c4:
        r2 = 1;
        goto L_0x00e1;
    L_0x00c6:
        r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r6 <= 0) goto L_0x00e0;
    L_0x00ca:
        r20.h();
        r6 = r8.B;
        r7 = r20.getWidth();
        r7 = (float) r7;
        r7 = r1 / r7;
        r11 = r20.getHeight();
        r11 = (float) r11;
        r2 = r2 / r11;
        defpackage.acx.a(r6, r7, r2);
        goto L_0x00c4;
    L_0x00e0:
        r2 = 0;
    L_0x00e1:
        r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r6 >= 0) goto L_0x00fb;
    L_0x00e5:
        r20.i();
        r1 = r8.A;
        r2 = -r3;
        r3 = r20.getHeight();
        r3 = (float) r3;
        r2 = r2 / r3;
        r3 = r20.getWidth();
        r3 = (float) r3;
        r0 = r0 / r3;
        defpackage.acx.a(r1, r2, r0);
        goto L_0x011f;
    L_0x00fb:
        r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r6 <= 0) goto L_0x0115;
    L_0x00ff:
        r20.j();
        r1 = r8.C;
        r2 = r20.getHeight();
        r2 = (float) r2;
        r3 = r3 / r2;
        r2 = r20.getWidth();
        r2 = (float) r2;
        r0 = r0 / r2;
        r4 = r4 - r0;
        defpackage.acx.a(r1, r3, r4);
        goto L_0x011f;
    L_0x0115:
        if (r2 != 0) goto L_0x011f;
    L_0x0117:
        r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x011f;
    L_0x011b:
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x0122;
    L_0x011f:
        defpackage.abe.e(r20);
    L_0x0122:
        r20.c(r21, r22);
    L_0x0125:
        if (r15 == 0) goto L_0x012a;
    L_0x0127:
        r0 = r19;
        goto L_0x012e;
    L_0x012a:
        r0 = r19;
        if (r0 == 0) goto L_0x0131;
    L_0x012e:
        r8.e(r15, r0);
    L_0x0131:
        r1 = r20.awakenScrollBars();
        if (r1 != 0) goto L_0x013a;
    L_0x0137:
        r20.invalidate();
    L_0x013a:
        if (r15 != 0) goto L_0x013f;
    L_0x013c:
        if (r0 != 0) goto L_0x013f;
    L_0x013e:
        return r13;
    L_0x013f:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean");
    }

    public final int computeHorizontalScrollOffset() {
        apn apn = this.n;
        if (apn == null || !apn.k()) {
            return 0;
        }
        return this.n.d(this.L);
    }

    public final int computeHorizontalScrollExtent() {
        apn apn = this.n;
        if (apn == null || !apn.k()) {
            return 0;
        }
        return this.n.g(this.L);
    }

    public final int computeHorizontalScrollRange() {
        apn apn = this.n;
        if (apn == null || !apn.k()) {
            return 0;
        }
        return this.n.b(this.L);
    }

    public final int computeVerticalScrollOffset() {
        apn apn = this.n;
        if (apn == null || !apn.l()) {
            return 0;
        }
        return this.n.e(this.L);
    }

    public final int computeVerticalScrollExtent() {
        apn apn = this.n;
        if (apn == null || !apn.l()) {
            return 0;
        }
        return this.n.h(this.L);
    }

    public final int computeVerticalScrollRange() {
        apn apn = this.n;
        if (apn == null || !apn.l()) {
            return 0;
        }
        return this.n.c(this.L);
    }

    public final void f() {
        int i = this.ae + 1;
        this.ae = i;
        if (i == 1 && !this.u) {
            this.t = false;
        }
    }

    public final void a(boolean z) {
        int i = this.ae;
        if (i <= 0) {
            this.ae = 1;
            i = 1;
        }
        if (!(z || this.u)) {
            this.t = false;
        }
        if (i == 1) {
            if (!(!z || !this.t || this.u || this.n == null || this.m == null)) {
                y();
            }
            if (!this.u) {
                this.t = false;
            }
        }
        this.ae--;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.u) {
            a("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.u = true;
                this.af = true;
                s();
                return;
            }
            this.u = false;
            if (!(!this.t || this.n == null || this.m == null)) {
                requestLayout();
            }
            this.t = false;
        }
    }

    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void a(int i, int i2) {
        apn apn = this.n;
        if (apn == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.u) {
            if (!apn.k()) {
                i = 0;
            }
            if (!this.n.l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.I.a(i, i2, aocf.UNSET_ENUM_VALUE, null);
            }
        }
    }

    public boolean b(int i, int i2) {
        apn apn = this.n;
        if (apn == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.u) {
            int k = apn.k();
            boolean l = this.n.l();
            int i3 = (k == 0 || Math.abs(i) < this.G) ? 0 : i;
            int i4 = (!l || Math.abs(i2) < this.G) ? 0 : i2;
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            float f = (float) i3;
            float f2 = (float) i4;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k != 0 || l;
                dispatchNestedFling(f, f2, z);
                apt apt = this.F;
                if (apt != null && apt.a(i3, i4)) {
                    return true;
                }
                if (z) {
                    if (l) {
                        k |= 2;
                    }
                    f(k, 1);
                    k = this.as;
                    int max = Math.max(-k, Math.min(i3, k));
                    k = this.as;
                    int max2 = Math.max(-k, Math.min(i4, k));
                    aqg aqg = this.I;
                    aqg.e.b(2);
                    aqg.b = 0;
                    aqg.a = 0;
                    Interpolator interpolator = aqg.d;
                    Interpolator interpolator2 = S;
                    if (interpolator != interpolator2) {
                        aqg.d = interpolator2;
                        aqg.c = new OverScroller(aqg.e.getContext(), S);
                    }
                    aqg.c.fling(0, 0, max, max2, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
                    aqg.a();
                    return true;
                }
            }
        }
        return false;
    }

    private final void s() {
        b(0);
        t();
    }

    private final void t() {
        this.I.b();
        apn apn = this.n;
        if (apn != null) {
            aqc aqc = apn.m;
            if (aqc != null) {
                aqc.e();
            }
        }
    }

    public final void c(int i, int i2) {
        EdgeEffect edgeEffect = this.z;
        int i3 = 0;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i <= 0)) {
            this.z.onRelease();
            i3 = this.z.isFinished();
        }
        edgeEffect = this.B;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i >= 0)) {
            this.B.onRelease();
            i3 |= this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A;
        if (!(edgeEffect2 == null || edgeEffect2.isFinished() || i2 <= 0)) {
            this.A.onRelease();
            i3 |= this.A.isFinished();
        }
        edgeEffect2 = this.C;
        if (!(edgeEffect2 == null || edgeEffect2.isFinished() || i2 >= 0)) {
            this.C.onRelease();
            i3 |= this.C.isFinished();
        }
        if (i3 != 0) {
            abe.e(this);
        }
    }

    public final void g() {
        if (this.z == null) {
            this.z = this.y.a(this);
            if (this.i) {
                this.z.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                return;
            }
            this.z.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void h() {
        if (this.B == null) {
            this.B = this.y.a(this);
            if (this.i) {
                this.B.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                return;
            }
            this.B.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void i() {
        if (this.A == null) {
            this.A = this.y.a(this);
            if (this.i) {
                this.A.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                return;
            }
            this.A.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void j() {
        if (this.C == null) {
            this.C = this.y.a(this);
            if (this.i) {
                this.C.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                return;
            }
            this.C.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void k() {
        this.C = null;
        this.A = null;
        this.B = null;
        this.z = null;
    }

    /* JADX WARNING: Missing block: B:26:0x0068, code skipped:
            if (r1.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:41:0x008e, code skipped:
            if (r1.findNextFocus(r13, r14, ((r13.n.v() == 1 ? 1 : 0) ^ (r15 == 2 ? 1 : 0)) == 0 ? 17 : 66) == null) goto L_0x0090;
     */
    /* JADX WARNING: Missing block: B:42:0x0090, code skipped:
            e();
     */
    /* JADX WARNING: Missing block: B:43:0x0097, code skipped:
            if (b(r14) == null) goto L_0x01d5;
     */
    /* JADX WARNING: Missing block: B:44:0x0099, code skipped:
            f();
            r13.n.a(r14, r15, r13.e, r13.L);
            a(false);
     */
    /* JADX WARNING: Missing block: B:101:0x0194, code skipped:
            if (r3 > false) goto L_0x01cf;
     */
    /* JADX WARNING: Missing block: B:104:0x01b5, code skipped:
            if (r10 > 0) goto L_0x01cf;
     */
    /* JADX WARNING: Missing block: B:105:0x01b8, code skipped:
            if (r3 < false) goto L_0x01cf;
     */
    /* JADX WARNING: Missing block: B:106:0x01bb, code skipped:
            if (r10 < 0) goto L_0x01cf;
     */
    /* JADX WARNING: Missing block: B:110:0x01c4, code skipped:
            if ((r10 * r0) < 0) goto L_0x01d0;
     */
    /* JADX WARNING: Missing block: B:114:0x01cd, code skipped:
            if ((r10 * r0) > 0) goto L_0x01d0;
     */
    /* JADX WARNING: Missing block: B:118:0x01d5, code skipped:
            return null;
     */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
        r13 = this;
        r0 = r13.n;
        r1 = r13.m;
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0008:
        r0 = 0;
        goto L_0x0019;
    L_0x000a:
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0008;
    L_0x000d:
        r0 = r13.n();
        if (r0 != 0) goto L_0x0008;
    L_0x0013:
        r0 = r13.u;
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0008;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r1 = android.view.FocusFinder.getInstance();
        r4 = 17;
        r5 = 66;
        r6 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r7 = 33;
        r8 = 0;
        r9 = 2;
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002f;
    L_0x002a:
        if (r15 == r9) goto L_0x0054;
    L_0x002c:
        if (r15 != r2) goto L_0x002f;
    L_0x002e:
        goto L_0x0054;
    L_0x002f:
        r1 = r1.findNextFocus(r13, r14, r15);
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        goto L_0x00ac;
    L_0x0037:
        if (r0 == 0) goto L_0x00ac;
    L_0x0039:
        r13.e();
        r0 = r13.b(r14);
        if (r0 == 0) goto L_0x0053;
    L_0x0042:
        r13.f();
        r0 = r13.n;
        r1 = r13.e;
        r10 = r13.L;
        r1 = r0.a(r14, r15, r1, r10);
        r13.a(r3);
        goto L_0x00ac;
    L_0x0053:
        return r8;
    L_0x0054:
        r0 = r13.n;
        r0 = r0.l();
        if (r0 != 0) goto L_0x005d;
    L_0x005c:
        goto L_0x006a;
    L_0x005d:
        if (r15 != r9) goto L_0x0062;
    L_0x005f:
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        goto L_0x0064;
    L_0x0062:
        r0 = 33;
    L_0x0064:
        r0 = r1.findNextFocus(r13, r14, r0);
        if (r0 == 0) goto L_0x0090;
    L_0x006a:
        r0 = r13.n;
        r0 = r0.k();
        if (r0 == 0) goto L_0x00a8;
    L_0x0072:
        r0 = r13.n;
        r0 = r0.v();
        if (r0 != r2) goto L_0x007c;
    L_0x007a:
        r0 = 1;
        goto L_0x007d;
    L_0x007c:
        r0 = 0;
    L_0x007d:
        if (r15 != r9) goto L_0x0081;
    L_0x007f:
        r10 = 1;
        goto L_0x0082;
    L_0x0081:
        r10 = 0;
    L_0x0082:
        r0 = r0 ^ r10;
        if (r0 != 0) goto L_0x0088;
    L_0x0085:
        r0 = 17;
        goto L_0x008a;
    L_0x0088:
        r0 = 66;
    L_0x008a:
        r0 = r1.findNextFocus(r13, r14, r0);
        if (r0 != 0) goto L_0x00a8;
    L_0x0090:
        r13.e();
        r0 = r13.b(r14);
        if (r0 == 0) goto L_0x01d5;
    L_0x0099:
        r13.f();
        r0 = r13.n;
        r10 = r13.e;
        r11 = r13.L;
        r0.a(r14, r15, r10, r11);
        r13.a(r3);
    L_0x00a8:
        r1 = r1.findNextFocus(r13, r14, r15);
    L_0x00ac:
        if (r1 == 0) goto L_0x00c3;
    L_0x00ae:
        r0 = r1.hasFocusable();
        if (r0 != 0) goto L_0x00c3;
    L_0x00b4:
        r0 = r13.getFocusedChild();
        if (r0 != 0) goto L_0x00bf;
    L_0x00ba:
        r14 = super.focusSearch(r14, r15);
        return r14;
    L_0x00bf:
        r13.a(r1, r8);
        return r14;
    L_0x00c3:
        if (r1 != 0) goto L_0x00c7;
    L_0x00c5:
        goto L_0x01d0;
    L_0x00c7:
        if (r1 == r13) goto L_0x01d0;
    L_0x00c9:
        r0 = r13.b(r1);
        if (r0 == 0) goto L_0x01d0;
    L_0x00cf:
        if (r14 == 0) goto L_0x01cf;
    L_0x00d1:
        r0 = r13.b(r14);
        if (r0 == 0) goto L_0x01cf;
    L_0x00d7:
        r0 = r13.k;
        r8 = r14.getWidth();
        r10 = r14.getHeight();
        r0.set(r3, r3, r8, r10);
        r0 = r13.ab;
        r8 = r1.getWidth();
        r10 = r1.getHeight();
        r0.set(r3, r3, r8, r10);
        r0 = r13.k;
        r13.offsetDescendantRectToMyCoords(r14, r0);
        r0 = r13.ab;
        r13.offsetDescendantRectToMyCoords(r1, r0);
        r0 = r13.n;
        r0 = r0.v();
        r8 = -1;
        if (r0 != r2) goto L_0x0106;
    L_0x0104:
        r0 = -1;
        goto L_0x0107;
    L_0x0106:
        r0 = 1;
    L_0x0107:
        r10 = r13.k;
        r10 = r10.left;
        r11 = r13.ab;
        r11 = r11.left;
        if (r10 < r11) goto L_0x011b;
    L_0x0111:
        r10 = r13.k;
        r10 = r10.right;
        r11 = r13.ab;
        r11 = r11.left;
        if (r10 > r11) goto L_0x0125;
    L_0x011b:
        r10 = r13.k;
        r10 = r10.right;
        r11 = r13.ab;
        r11 = r11.right;
        if (r10 < r11) goto L_0x0147;
    L_0x0125:
        r10 = r13.k;
        r10 = r10.right;
        r11 = r13.ab;
        r11 = r11.right;
        if (r10 > r11) goto L_0x0139;
    L_0x012f:
        r10 = r13.k;
        r10 = r10.left;
        r11 = r13.ab;
        r11 = r11.right;
        if (r10 < r11) goto L_0x0143;
    L_0x0139:
        r10 = r13.k;
        r10 = r10.left;
        r11 = r13.ab;
        r11 = r11.left;
        if (r10 > r11) goto L_0x0145;
    L_0x0143:
        r10 = 0;
        goto L_0x0148;
    L_0x0145:
        r10 = -1;
        goto L_0x0148;
    L_0x0147:
        r10 = 1;
    L_0x0148:
        r11 = r13.k;
        r11 = r11.top;
        r12 = r13.ab;
        r12 = r12.top;
        if (r11 < r12) goto L_0x015c;
    L_0x0152:
        r11 = r13.k;
        r11 = r11.bottom;
        r12 = r13.ab;
        r12 = r12.top;
        if (r11 > r12) goto L_0x0166;
    L_0x015c:
        r11 = r13.k;
        r11 = r11.bottom;
        r12 = r13.ab;
        r12 = r12.bottom;
        if (r11 < r12) goto L_0x0187;
    L_0x0166:
        r11 = r13.k;
        r11 = r11.bottom;
        r12 = r13.ab;
        r12 = r12.bottom;
        if (r11 > r12) goto L_0x017a;
    L_0x0170:
        r11 = r13.k;
        r11 = r11.top;
        r12 = r13.ab;
        r12 = r12.bottom;
        if (r11 < r12) goto L_0x0188;
    L_0x017a:
        r11 = r13.k;
        r11 = r11.top;
        r12 = r13.ab;
        r12 = r12.top;
        if (r11 > r12) goto L_0x0185;
    L_0x0184:
        goto L_0x0188;
    L_0x0185:
        r3 = -1;
        goto L_0x0188;
    L_0x0187:
        r3 = 1;
    L_0x0188:
        if (r15 == r2) goto L_0x01c7;
    L_0x018a:
        if (r15 == r9) goto L_0x01be;
    L_0x018c:
        if (r15 == r4) goto L_0x01bb;
    L_0x018e:
        if (r15 == r7) goto L_0x01b8;
    L_0x0190:
        if (r15 == r5) goto L_0x01b5;
    L_0x0192:
        if (r15 != r6) goto L_0x0197;
    L_0x0194:
        if (r3 <= 0) goto L_0x01d0;
    L_0x0196:
        goto L_0x01cf;
    L_0x0197:
        r14 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid direction: ";
        r0.append(r1);
        r0.append(r15);
        r15 = r13.a();
        r0.append(r15);
        r15 = r0.toString();
        r14.<init>(r15);
        throw r14;
    L_0x01b5:
        if (r10 <= 0) goto L_0x01d0;
    L_0x01b7:
        goto L_0x01cf;
    L_0x01b8:
        if (r3 >= 0) goto L_0x01d0;
    L_0x01ba:
        goto L_0x01cf;
    L_0x01bb:
        if (r10 >= 0) goto L_0x01d0;
    L_0x01bd:
        goto L_0x01cf;
    L_0x01be:
        if (r3 > 0) goto L_0x01cf;
    L_0x01c0:
        if (r3 != 0) goto L_0x01d0;
    L_0x01c2:
        r10 = r10 * r0;
        if (r10 < 0) goto L_0x01d0;
    L_0x01c6:
        goto L_0x01cf;
    L_0x01c7:
        if (r3 < 0) goto L_0x01cf;
    L_0x01c9:
        if (r3 != 0) goto L_0x01d0;
    L_0x01cb:
        r10 = r10 * r0;
        if (r10 > 0) goto L_0x01d0;
    L_0x01cf:
        return r1;
    L_0x01d0:
        r14 = super.focusSearch(r14, r15);
        return r14;
    L_0x01d5:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void requestChildFocus(View view, View view2) {
        aqc aqc = this.n.m;
        if (!((aqc != null && aqc.f) || n() || view2 == null)) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private final void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof apr) {
            apr apr = (apr) layoutParams;
            if (!apr.e) {
                Rect rect = apr.d;
                Rect rect2 = this.k;
                rect2.left -= rect.left;
                rect2 = this.k;
                rect2.right += rect.right;
                rect2 = this.k;
                rect2.top -= rect.top;
                rect2 = this.k;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        }
        this.n.a(this, view, this.k, this.s ^ 1, view2 == null);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.a(this, view, rect, z, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return !n() ? super.onRequestFocusInDescendants(i, rect) : false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aj = 0;
        boolean z = true;
        this.q = true;
        if (!this.s || isLayoutRequested()) {
            z = false;
        }
        this.s = z;
        apn apn = this.n;
        if (apn != null) {
            apn.c(this);
        }
        this.P = false;
        if (d) {
            this.J = (ani) ani.a.get();
            if (this.J == null) {
                this.J = new ani();
                Display J = abe.J(this);
                float f = 60.0f;
                if (!(isInEditMode() || J == null)) {
                    float refreshRate = J.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.J.c = (long) (1.0E9f / f);
                ani.a.set(this.J);
            }
            this.J.b.add(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aph aph = this.D;
        if (aph != null) {
            aph.d();
        }
        s();
        this.q = false;
        apn apn = this.n;
        if (apn != null) {
            apn.a(this, this.e);
        }
        this.aB.clear();
        removeCallbacks(this.aC);
        asu.b();
        if (d) {
            ani ani = this.J;
            if (ani != null) {
                ani.b.remove(this);
                this.J = null;
            }
        }
    }

    public final boolean isAttachedToWindow() {
        return this.q;
    }

    public final void a(String str) {
        StringBuilder stringBuilder;
        if (n()) {
            if (str == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                stringBuilder.append(a());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.ak > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(a());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
        }
    }

    public final void a(aps aps) {
        this.ac.add(aps);
    }

    public final void b(aps aps) {
        this.ac.remove(aps);
        if (this.ad == aps) {
            this.ad = null;
        }
    }

    private final boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            aps aps = (aps) this.ac.get(i);
            if (aps.a(this, motionEvent) && action != 3) {
                this.ad = aps;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:40:0x00cc, code skipped:
            if (r0 != null) goto L_0x00ce;
     */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r8.u;
        r1 = 0;
        if (r0 != 0) goto L_0x011e;
    L_0x0005:
        r0 = 0;
        r8.ad = r0;
        r0 = r8.a(r9);
        r2 = 1;
        if (r0 == 0) goto L_0x0013;
    L_0x000f:
        r8.v();
        return r2;
    L_0x0013:
        r0 = r8.n;
        if (r0 == 0) goto L_0x011e;
    L_0x0017:
        r0 = r0.k();
        r3 = r8.n;
        r3 = r3.l();
        r4 = r8.am;
        if (r4 != 0) goto L_0x002b;
    L_0x0025:
        r4 = android.view.VelocityTracker.obtain();
        r8.am = r4;
    L_0x002b:
        r4 = r8.am;
        r4.addMovement(r9);
        r4 = r9.getActionMasked();
        r5 = r9.getActionIndex();
        r6 = 2;
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r4 == 0) goto L_0x00db;
    L_0x003d:
        if (r4 == r2) goto L_0x00d2;
    L_0x003f:
        if (r4 == r6) goto L_0x0072;
    L_0x0041:
        r0 = 3;
        if (r4 == r0) goto L_0x006d;
    L_0x0044:
        r0 = 5;
        if (r4 == r0) goto L_0x0051;
    L_0x0047:
        r0 = 6;
        if (r4 == r0) goto L_0x004c;
    L_0x004a:
        goto L_0x0119;
    L_0x004c:
        r8.b(r9);
        goto L_0x0119;
    L_0x0051:
        r0 = r9.getPointerId(r5);
        r8.al = r0;
        r0 = r9.getX(r5);
        r0 = r0 + r7;
        r0 = (int) r0;
        r8.ap = r0;
        r8.an = r0;
        r9 = r9.getY(r5);
        r9 = r9 + r7;
        r9 = (int) r9;
        r8.aq = r9;
        r8.ao = r9;
        goto L_0x0119;
    L_0x006d:
        r8.v();
        goto L_0x0119;
    L_0x0072:
        r4 = r8.al;
        r4 = r9.findPointerIndex(r4);
        if (r4 >= 0) goto L_0x0098;
    L_0x007a:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Error processing scroll; pointer index for id ";
        r9.append(r0);
        r0 = r8.al;
        r9.append(r0);
        r0 = " not found. Did any MotionEvents get skipped?";
        r9.append(r0);
        r9 = r9.toString();
        r0 = "RecyclerView";
        android.util.Log.e(r0, r9);
        return r1;
    L_0x0098:
        r5 = r9.getX(r4);
        r5 = r5 + r7;
        r5 = (int) r5;
        r9 = r9.getY(r4);
        r9 = r9 + r7;
        r9 = (int) r9;
        r4 = r8.E;
        if (r4 == r2) goto L_0x0119;
    L_0x00a8:
        r4 = r8.an;
        r4 = r5 - r4;
        r6 = r8.ao;
        r6 = r9 - r6;
        if (r0 == 0) goto L_0x00be;
    L_0x00b2:
        r0 = java.lang.Math.abs(r4);
        r4 = r8.ar;
        if (r0 <= r4) goto L_0x00be;
    L_0x00ba:
        r8.ap = r5;
        r0 = 1;
        goto L_0x00bf;
    L_0x00be:
        r0 = 0;
    L_0x00bf:
        if (r3 == 0) goto L_0x00cc;
    L_0x00c1:
        r3 = java.lang.Math.abs(r6);
        r4 = r8.ar;
        if (r3 <= r4) goto L_0x00cc;
    L_0x00c9:
        r8.aq = r9;
        goto L_0x00ce;
    L_0x00cc:
        if (r0 == 0) goto L_0x0119;
    L_0x00ce:
        r8.b(r2);
        goto L_0x0119;
    L_0x00d2:
        r9 = r8.am;
        r9.clear();
        r8.g(r1);
        goto L_0x0119;
    L_0x00db:
        r4 = r8.af;
        if (r4 == 0) goto L_0x00e1;
    L_0x00df:
        r8.af = r1;
    L_0x00e1:
        r4 = r9.getPointerId(r1);
        r8.al = r4;
        r4 = r9.getX();
        r4 = r4 + r7;
        r4 = (int) r4;
        r8.ap = r4;
        r8.an = r4;
        r9 = r9.getY();
        r9 = r9 + r7;
        r9 = (int) r9;
        r8.aq = r9;
        r8.ao = r9;
        r9 = r8.E;
        if (r9 != r6) goto L_0x010c;
    L_0x00ff:
        r9 = r8.getParent();
        r9.requestDisallowInterceptTouchEvent(r2);
        r8.b(r2);
        r8.g(r2);
    L_0x010c:
        r9 = r8.aA;
        r9[r2] = r1;
        r9[r1] = r1;
        if (r3 == 0) goto L_0x0116;
    L_0x0114:
        r0 = r0 | 2;
    L_0x0116:
        r8.f(r0, r1);
    L_0x0119:
        r9 = r8.E;
        if (r9 != r2) goto L_0x011e;
    L_0x011d:
        return r2;
    L_0x011e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            ((aps) this.ac.get(i)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
        r14 = this;
        r0 = r14.u;
        r1 = 0;
        if (r0 != 0) goto L_0x01e3;
    L_0x0005:
        r0 = r14.af;
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        goto L_0x01e3;
    L_0x000b:
        r0 = r14.ad;
        r2 = 3;
        r3 = 1;
        if (r0 != 0) goto L_0x01d0;
    L_0x0011:
        r0 = r15.getAction();
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = r14.a(r15);
        if (r0 == 0) goto L_0x001f;
    L_0x001d:
        goto L_0x01df;
    L_0x001f:
        r0 = r14.n;
        if (r0 == 0) goto L_0x01cf;
    L_0x0023:
        r0 = r0.k();
        r4 = r14.n;
        r4 = r4.l();
        r5 = r14.am;
        if (r5 != 0) goto L_0x0037;
    L_0x0031:
        r5 = android.view.VelocityTracker.obtain();
        r14.am = r5;
    L_0x0037:
        r5 = android.view.MotionEvent.obtain(r15);
        r6 = r15.getActionMasked();
        r7 = r15.getActionIndex();
        if (r6 != 0) goto L_0x004b;
    L_0x0045:
        r8 = r14.aA;
        r8[r3] = r1;
        r8[r1] = r1;
    L_0x004b:
        r8 = r14.aA;
        r9 = r8[r1];
        r9 = (float) r9;
        r8 = r8[r3];
        r8 = (float) r8;
        r5.offsetLocation(r9, r8);
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r6 == 0) goto L_0x01a5;
    L_0x005a:
        if (r6 == r3) goto L_0x0163;
    L_0x005c:
        r9 = 2;
        if (r6 == r9) goto L_0x008f;
    L_0x005f:
        if (r6 == r2) goto L_0x008a;
    L_0x0061:
        r0 = 5;
        if (r6 == r0) goto L_0x006e;
    L_0x0064:
        r0 = 6;
        if (r6 == r0) goto L_0x0069;
    L_0x0067:
        goto L_0x01c6;
    L_0x0069:
        r14.b(r15);
        goto L_0x01c6;
    L_0x006e:
        r0 = r15.getPointerId(r7);
        r14.al = r0;
        r0 = r15.getX(r7);
        r0 = r0 + r8;
        r0 = (int) r0;
        r14.ap = r0;
        r14.an = r0;
        r15 = r15.getY(r7);
        r15 = r15 + r8;
        r15 = (int) r15;
        r14.aq = r15;
        r14.ao = r15;
        goto L_0x01c6;
    L_0x008a:
        r14.v();
        goto L_0x01c6;
    L_0x008f:
        r2 = r14.al;
        r2 = r15.findPointerIndex(r2);
        if (r2 >= 0) goto L_0x00b5;
    L_0x0097:
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r0 = "Error processing scroll; pointer index for id ";
        r15.append(r0);
        r0 = r14.al;
        r15.append(r0);
        r0 = " not found. Did any MotionEvents get skipped?";
        r15.append(r0);
        r15 = r15.toString();
        r0 = "RecyclerView";
        android.util.Log.e(r0, r15);
        return r1;
    L_0x00b5:
        r6 = r15.getX(r2);
        r6 = r6 + r8;
        r6 = (int) r6;
        r15 = r15.getY(r2);
        r15 = r15 + r8;
        r15 = (int) r15;
        r2 = r14.ap;
        r2 = r2 - r6;
        r7 = r14.aq;
        r13 = r7 - r15;
        r10 = r14.R;
        r10[r1] = r1;
        r10[r3] = r1;
        r11 = r14.az;
        r12 = 0;
        r7 = r14;
        r8 = r2;
        r9 = r13;
        r7 = r7.a(r8, r9, r10, r11, r12);
        if (r7 == 0) goto L_0x00ff;
    L_0x00da:
        r7 = r14.R;
        r8 = r7[r1];
        r2 = r2 - r8;
        r7 = r7[r3];
        r13 = r13 - r7;
        r7 = r14.az;
        r8 = r7[r1];
        r8 = (float) r8;
        r7 = r7[r3];
        r7 = (float) r7;
        r5.offsetLocation(r8, r7);
        r7 = r14.aA;
        r8 = r7[r1];
        r9 = r14.az;
        r10 = r9[r1];
        r8 = r8 + r10;
        r7[r1] = r8;
        r8 = r7[r3];
        r9 = r9[r3];
        r8 = r8 + r9;
        r7[r3] = r8;
    L_0x00ff:
        r7 = r14.E;
        if (r7 != r3) goto L_0x0104;
    L_0x0103:
        goto L_0x0130;
    L_0x0104:
        if (r0 == 0) goto L_0x0117;
    L_0x0106:
        r7 = java.lang.Math.abs(r2);
        r8 = r14.ar;
        if (r7 > r8) goto L_0x010f;
    L_0x010e:
        goto L_0x0117;
    L_0x010f:
        if (r2 > 0) goto L_0x0113;
    L_0x0111:
        r2 = r2 + r8;
        goto L_0x0114;
    L_0x0113:
        r2 = r2 - r8;
    L_0x0114:
        r7 = r2;
        r2 = 1;
        goto L_0x0119;
    L_0x0117:
        r7 = r2;
        r2 = 0;
    L_0x0119:
        if (r4 == 0) goto L_0x012a;
    L_0x011b:
        r8 = java.lang.Math.abs(r13);
        r9 = r14.ar;
        if (r8 > r9) goto L_0x0124;
    L_0x0123:
        goto L_0x012a;
    L_0x0124:
        if (r13 > 0) goto L_0x0128;
    L_0x0126:
        r13 = r13 + r9;
        goto L_0x0129;
    L_0x0128:
        r13 = r13 - r9;
    L_0x0129:
        r2 = 1;
    L_0x012a:
        if (r2 == 0) goto L_0x012f;
    L_0x012c:
        r14.b(r3);
    L_0x012f:
        r2 = r7;
    L_0x0130:
        r7 = r14.E;
        if (r7 != r3) goto L_0x01c6;
    L_0x0134:
        r7 = r14.az;
        r8 = r7[r1];
        r6 = r6 - r8;
        r14.ap = r6;
        r6 = r7[r3];
        r15 = r15 - r6;
        r14.aq = r15;
        if (r0 != 0) goto L_0x0144;
    L_0x0142:
        r15 = 0;
        goto L_0x0145;
    L_0x0144:
        r15 = r2;
    L_0x0145:
        if (r4 != 0) goto L_0x0148;
    L_0x0147:
        goto L_0x0149;
    L_0x0148:
        r1 = r13;
    L_0x0149:
        r15 = r14.a(r15, r1, r5);
        if (r15 == 0) goto L_0x0156;
    L_0x014f:
        r15 = r14.getParent();
        r15.requestDisallowInterceptTouchEvent(r3);
    L_0x0156:
        r15 = r14.J;
        if (r15 == 0) goto L_0x01c6;
    L_0x015a:
        if (r2 == 0) goto L_0x015d;
    L_0x015c:
        goto L_0x015f;
    L_0x015d:
        if (r13 == 0) goto L_0x01c6;
    L_0x015f:
        r15.a(r14, r2, r13);
        goto L_0x01c6;
    L_0x0163:
        r15 = r14.am;
        r15.addMovement(r5);
        r15 = r14.am;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r14.as;
        r6 = (float) r6;
        r15.computeCurrentVelocity(r2, r6);
        r15 = 0;
        if (r0 == 0) goto L_0x017f;
    L_0x0175:
        r0 = r14.am;
        r2 = r14.al;
        r0 = r0.getXVelocity(r2);
        r0 = -r0;
        goto L_0x0180;
    L_0x017f:
        r0 = 0;
    L_0x0180:
        if (r4 == 0) goto L_0x018c;
    L_0x0182:
        r2 = r14.am;
        r4 = r14.al;
        r2 = r2.getYVelocity(r4);
        r2 = -r2;
        goto L_0x018d;
    L_0x018c:
        r2 = 0;
    L_0x018d:
        r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1));
        if (r4 == 0) goto L_0x0192;
    L_0x0191:
        goto L_0x0196;
    L_0x0192:
        r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1));
        if (r15 == 0) goto L_0x019e;
    L_0x0196:
        r15 = (int) r0;
        r0 = (int) r2;
        r15 = r14.b(r15, r0);
        if (r15 != 0) goto L_0x01a1;
    L_0x019e:
        r14.b(r1);
    L_0x01a1:
        r14.u();
        goto L_0x01cb;
    L_0x01a5:
        r2 = r15.getPointerId(r1);
        r14.al = r2;
        r2 = r15.getX();
        r2 = r2 + r8;
        r2 = (int) r2;
        r14.ap = r2;
        r14.an = r2;
        r15 = r15.getY();
        r15 = r15 + r8;
        r15 = (int) r15;
        r14.aq = r15;
        r14.ao = r15;
        if (r4 == 0) goto L_0x01c3;
    L_0x01c1:
        r0 = r0 | 2;
    L_0x01c3:
        r14.f(r0, r1);
    L_0x01c6:
        r15 = r14.am;
        r15.addMovement(r5);
    L_0x01cb:
        r5.recycle();
        return r3;
    L_0x01cf:
        return r1;
    L_0x01d0:
        r0.a(r15);
        r15 = r15.getAction();
        if (r15 != r2) goto L_0x01da;
    L_0x01d9:
        goto L_0x01dc;
    L_0x01da:
        if (r15 != r3) goto L_0x01df;
    L_0x01dc:
        r15 = 0;
        r14.ad = r15;
    L_0x01df:
        r14.v();
        return r3;
    L_0x01e3:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void u() {
        VelocityTracker velocityTracker = this.am;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        int i = 0;
        g(0);
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i = this.z.isFinished();
        }
        edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.A.isFinished();
        }
        edgeEffect = this.B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.B.isFinished();
        }
        edgeEffect = this.C;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            i |= this.C.isFinished();
        }
        if (i != 0) {
            abe.e(this);
        }
    }

    private final void v() {
        u();
        b(0);
    }

    private final void b(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.al) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.al = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.ap = x;
            this.an = x;
            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.aq = y;
            this.ao = y;
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!(this.n == null || this.u || motionEvent.getAction() != 8)) {
            float f;
            float axisValue;
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.n.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.n.k()) {
                    axisValue = motionEvent.getAxisValue(10);
                    if (!(f == 0.0f && axisValue == 0.0f)) {
                        a((int) (axisValue * this.at), (int) (f * this.au), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.n.l()) {
                        f = -f;
                    } else if (this.n.k()) {
                        axisValue = f;
                        f = 0.0f;
                        a((int) (axisValue * this.at), (int) (f * this.au), motionEvent);
                    }
                }
                f = 0.0f;
            }
            axisValue = 0.0f;
            a((int) (axisValue * this.at), (int) (f * this.au), motionEvent);
        }
        return false;
    }

    public void onMeasure(int i, int i2) {
        apn apn = this.n;
        if (apn == null) {
            d(i, i2);
            return;
        }
        apn.i();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        this.n.j.d(i, i2);
        if (!((mode == 1073741824 && mode2 == 1073741824) || this.m == null)) {
            if (this.L.d == 1) {
                A();
            }
            this.n.b(i, i2);
            this.L.i = true;
            B();
            this.n.c(i, i2);
            if (this.n.o()) {
                this.n.b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.L.i = true;
                B();
                this.n.c(i, i2);
            }
        }
    }

    public final void d(int i, int i2) {
        setMeasuredDimension(apn.a(i, getPaddingLeft() + getPaddingRight(), abe.n(this)), apn.a(i2, getPaddingTop() + getPaddingBottom(), abe.o(this)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            k();
        }
    }

    public final void a(aph aph) {
        aph aph2 = this.D;
        if (aph2 != null) {
            aph2.d();
            this.D.h = null;
        }
        this.D = aph;
        aph = this.D;
        if (aph != null) {
            aph.h = this.av;
        }
    }

    public final void l() {
        this.aj++;
    }

    private final void w() {
        b(true);
    }

    public final void b(boolean z) {
        int i = this.aj - 1;
        this.aj = i;
        if (i <= 0) {
            this.aj = 0;
            if (z) {
                int i2 = this.ag;
                this.ag = 0;
                if (i2 != 0 && m()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i2);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (i2 = this.aB.size() - 1; i2 >= 0; i2--) {
                    aqj aqj = (aqj) this.aB.get(i2);
                    if (aqj.a.getParent() == this && !aqj.b()) {
                        int i3 = aqj.n;
                        if (i3 != -1) {
                            abe.b(aqj.a, i3);
                            aqj.n = -1;
                        }
                    }
                }
                this.aB.clear();
            }
        }
    }

    public final boolean m() {
        AccessibilityManager accessibilityManager = this.ah;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean n() {
        return this.aj > 0;
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (n()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes == 0) {
                contentChangeTypes = 0;
            }
            this.ag = contentChangeTypes | this.ag;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void o() {
        if (!this.P && this.q) {
            abe.a((View) this, this.aC);
            this.P = true;
        }
    }

    private final boolean x() {
        return this.D != null && this.n.h();
    }

    /* JADX WARNING: Missing block: B:115:0x02a5, code skipped:
            if (r0.g.d(getFocusedChild()) != false) goto L_0x02a7;
     */
    /* JADX WARNING: Missing block: B:167:0x0361, code skipped:
            if (r1.isFocusable() != false) goto L_0x0364;
     */
    private final void y() {
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.m;
        r2 = "RecyclerView";
        if (r1 != 0) goto L_0x000e;
    L_0x0008:
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r2, r1);
        return;
    L_0x000e:
        r1 = r0.n;
        if (r1 != 0) goto L_0x0018;
    L_0x0012:
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r2, r1);
        return;
    L_0x0018:
        r1 = r0.L;
        r3 = 0;
        r1.i = r3;
        r1 = r1.d;
        r4 = 1;
        if (r1 != r4) goto L_0x002e;
    L_0x0022:
        r17.A();
        r1 = r0.n;
        r1.e(r0);
        r17.B();
        goto L_0x0063;
    L_0x002e:
        r1 = r0.f;
        r5 = r1.b;
        r5 = r5.isEmpty();
        if (r5 != 0) goto L_0x0040;
    L_0x0038:
        r1 = r1.a;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x005b;
    L_0x0040:
        r1 = r0.n;
        r1 = r1.u;
        r5 = r17.getWidth();
        if (r1 != r5) goto L_0x005b;
    L_0x004a:
        r1 = r0.n;
        r1 = r1.v;
        r5 = r17.getHeight();
        if (r1 == r5) goto L_0x0055;
    L_0x0054:
        goto L_0x005b;
    L_0x0055:
        r1 = r0.n;
        r1.e(r0);
        goto L_0x0063;
    L_0x005b:
        r1 = r0.n;
        r1.e(r0);
        r17.B();
    L_0x0063:
        r1 = r0.L;
        r5 = 4;
        r1.a(r5);
        r17.f();
        r17.l();
        r1 = r0.L;
        r1.d = r4;
        r1 = r1.j;
        r6 = 0;
        r7 = -1;
        if (r1 == 0) goto L_0x0218;
    L_0x0079:
        r1 = r0.g;
        r1 = r1.a();
        r1 = r1 + r7;
    L_0x0080:
        if (r1 < 0) goto L_0x01a9;
    L_0x0082:
        r8 = r0.g;
        r8 = r8.b(r1);
        r8 = d(r8);
        r9 = r8.b();
        if (r9 != 0) goto L_0x01a4;
    L_0x0092:
        r9 = r0.d(r8);
        r11 = defpackage.aph.f();
        r11.a(r8);
        r12 = r0.h;
        r12 = r12.b;
        r12 = r12.a(r9);
        r12 = (defpackage.aqj) r12;
        if (r12 == 0) goto L_0x019f;
    L_0x00a9:
        r13 = r12.b();
        if (r13 != 0) goto L_0x019f;
    L_0x00af:
        r13 = r0.h;
        r13 = r13.a(r12);
        r14 = r0.h;
        r14 = r14.a(r8);
        if (r13 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00c7;
    L_0x00be:
        if (r12 != r8) goto L_0x00c7;
    L_0x00c0:
        r9 = r0.h;
        r9.b(r8, r11);
        goto L_0x01a4;
    L_0x00c7:
        r15 = r0.h;
        r15 = r15.a(r12, r5);
        r5 = r0.h;
        r5.b(r8, r11);
        r5 = r0.h;
        r11 = 8;
        r5 = r5.a(r8, r11);
        if (r15 != 0) goto L_0x0173;
    L_0x00dc:
        r5 = r0.g;
        r5 = r5.a();
        r11 = 0;
    L_0x00e3:
        if (r11 >= r5) goto L_0x014f;
    L_0x00e5:
        r13 = r0.g;
        r13 = r13.b(r11);
        r13 = d(r13);
        if (r13 != r8) goto L_0x00f2;
    L_0x00f1:
        goto L_0x014c;
    L_0x00f2:
        r14 = r0.d(r13);
        r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1));
        if (r16 != 0) goto L_0x014c;
    L_0x00fa:
        r1 = r0.m;
        r2 = " \n View Holder 2:";
        if (r1 == 0) goto L_0x0128;
    L_0x0100:
        r1 = r1.b;
        if (r1 == 0) goto L_0x0128;
    L_0x0104:
        r1 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r3.append(r4);
        r3.append(r13);
        r3.append(r2);
        r3.append(r8);
        r2 = r17.a();
        r3.append(r2);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0128:
        r1 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r3.append(r4);
        r3.append(r13);
        r3.append(r2);
        r3.append(r8);
        r2 = r17.a();
        r3.append(r2);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
    L_0x014c:
        r11 = r11 + 1;
        goto L_0x00e3;
    L_0x014f:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r9 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r5.append(r9);
        r5.append(r12);
        r9 = " cannot be found but it is necessary for ";
        r5.append(r9);
        r5.append(r8);
        r8 = r17.a();
        r5.append(r8);
        r5 = r5.toString();
        android.util.Log.e(r2, r5);
        goto L_0x01a4;
    L_0x0173:
        r12.a(r3);
        if (r13 == 0) goto L_0x017b;
    L_0x0178:
        r0.a(r12);
    L_0x017b:
        if (r12 != r8) goto L_0x017e;
    L_0x017d:
        goto L_0x0193;
    L_0x017e:
        if (r14 != 0) goto L_0x0181;
    L_0x0180:
        goto L_0x0184;
    L_0x0181:
        r0.a(r8);
    L_0x0184:
        r12.h = r8;
        r0.a(r12);
        r9 = r0.e;
        r9.b(r12);
        r8.a(r3);
        r8.i = r12;
    L_0x0193:
        r9 = r0.D;
        r5 = r9.a(r12, r8, r15, r5);
        if (r5 == 0) goto L_0x01a4;
    L_0x019b:
        r17.o();
        goto L_0x01a4;
    L_0x019f:
        r5 = r0.h;
        r5.b(r8, r11);
    L_0x01a4:
        r1 = r1 + -1;
        r5 = 4;
        goto L_0x0080;
    L_0x01a9:
        r1 = r0.h;
        r2 = r0.aD;
        r5 = r1.a;
        r5 = r5.b;
        r5 = r5 + r7;
    L_0x01b2:
        if (r5 < 0) goto L_0x0218;
    L_0x01b4:
        r8 = r1.a;
        r8 = r8.b(r5);
        r8 = (defpackage.aqj) r8;
        r9 = r1.a;
        r9 = r9.d(r5);
        r9 = (defpackage.asu) r9;
        r10 = r9.a;
        r11 = r10 & 3;
        r12 = 3;
        if (r11 == r12) goto L_0x020f;
    L_0x01cb:
        r11 = r10 & 1;
        if (r11 == 0) goto L_0x01dd;
    L_0x01cf:
        r10 = r9.b;
        if (r10 != 0) goto L_0x01d7;
    L_0x01d3:
        r2.a(r8);
        goto L_0x0212;
    L_0x01d7:
        r11 = r9.c;
        r2.a(r8, r10, r11);
        goto L_0x0212;
    L_0x01dd:
        r11 = r10 & 14;
        r12 = 14;
        if (r11 != r12) goto L_0x01eb;
    L_0x01e3:
        r10 = r9.b;
        r11 = r9.c;
        r2.b(r8, r10, r11);
        goto L_0x0212;
    L_0x01eb:
        r11 = r10 & 12;
        r12 = 12;
        if (r11 != r12) goto L_0x01f9;
    L_0x01f1:
        r10 = r9.b;
        r11 = r9.c;
        r2.c(r8, r10, r11);
        goto L_0x0212;
    L_0x01f9:
        r11 = r10 & 4;
        if (r11 == 0) goto L_0x0203;
    L_0x01fd:
        r10 = r9.b;
        r2.a(r8, r10, r6);
        goto L_0x0212;
    L_0x0203:
        r10 = r10 & 8;
        if (r10 == 0) goto L_0x0212;
    L_0x0207:
        r10 = r9.b;
        r11 = r9.c;
        r2.b(r8, r10, r11);
        goto L_0x0212;
    L_0x020f:
        r2.a(r8);
    L_0x0212:
        defpackage.asu.a(r9);
        r5 = r5 + -1;
        goto L_0x01b2;
    L_0x0218:
        r1 = r0.n;
        r2 = r0.e;
        r1.a(r2);
        r1 = r0.L;
        r2 = r1.e;
        r1.b = r2;
        r0.x = r3;
        r0.ai = r3;
        r1.j = r3;
        r1.k = r3;
        r1 = r0.n;
        r1.n = r3;
        r1 = r0.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x023a;
    L_0x0237:
        r1.clear();
    L_0x023a:
        r1 = r0.n;
        r2 = r1.r;
        if (r2 == 0) goto L_0x0249;
    L_0x0240:
        r1.q = r3;
        r1.r = r3;
        r1 = r0.e;
        r1.b();
    L_0x0249:
        r1 = r0.n;
        r2 = r0.L;
        r1.a(r2);
        r17.w();
        r0.a(r3);
        r1 = r0.h;
        r1.a();
        r1 = r0.ax;
        r2 = r1[r3];
        r5 = r1[r4];
        r0.a(r1);
        r1 = r0.ax;
        r8 = r1[r3];
        if (r8 != r2) goto L_0x026e;
    L_0x026a:
        r1 = r1[r4];
        if (r1 == r5) goto L_0x0271;
    L_0x026e:
        r0.e(r3, r3);
    L_0x0271:
        r1 = r0.H;
        if (r1 == 0) goto L_0x0367;
    L_0x0275:
        r1 = r0.m;
        if (r1 == 0) goto L_0x0367;
    L_0x0279:
        r1 = r17.hasFocus();
        if (r1 == 0) goto L_0x0367;
    L_0x027f:
        r1 = r17.getDescendantFocusability();
        r2 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r1 == r2) goto L_0x0367;
    L_0x0287:
        r1 = r17.getDescendantFocusability();
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r1 != r2) goto L_0x0295;
    L_0x028f:
        r1 = r17.isFocused();
        if (r1 != 0) goto L_0x0367;
    L_0x0295:
        r1 = r17.isFocused();
        if (r1 != 0) goto L_0x02a7;
    L_0x029b:
        r1 = r17.getFocusedChild();
        r2 = r0.g;
        r1 = r2.d(r1);
        if (r1 == 0) goto L_0x0367;
    L_0x02a7:
        r1 = r0.L;
        r1 = r1.m;
        r4 = -1;
        r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r8 == 0) goto L_0x02ec;
    L_0x02b1:
        r8 = r0.m;
        r8 = r8.b;
        if (r8 != 0) goto L_0x02b8;
    L_0x02b7:
        goto L_0x02ec;
    L_0x02b8:
        r8 = r0.g;
        r8 = r8.b();
        r10 = r6;
        r9 = 0;
    L_0x02c0:
        if (r9 >= r8) goto L_0x02ed;
    L_0x02c2:
        r11 = r0.g;
        r11 = r11.c(r9);
        r11 = d(r11);
        if (r11 == 0) goto L_0x02e9;
    L_0x02ce:
        r12 = r11.m();
        if (r12 == 0) goto L_0x02d5;
    L_0x02d4:
        goto L_0x02e9;
    L_0x02d5:
        r12 = r11.e;
        r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r14 != 0) goto L_0x02e9;
    L_0x02db:
        r10 = r0.g;
        r12 = r11.a;
        r10 = r10.d(r12);
        if (r10 == 0) goto L_0x02e7;
    L_0x02e5:
        r10 = r11;
        goto L_0x02e9;
    L_0x02e7:
        r10 = r11;
        goto L_0x02ed;
    L_0x02e9:
        r9 = r9 + 1;
        goto L_0x02c0;
    L_0x02ec:
        r10 = r6;
    L_0x02ed:
        if (r10 != 0) goto L_0x02f0;
    L_0x02ef:
        goto L_0x0305;
    L_0x02f0:
        r1 = r0.g;
        r2 = r10.a;
        r1 = r1.d(r2);
        if (r1 != 0) goto L_0x0305;
    L_0x02fa:
        r1 = r10.a;
        r1 = r1.hasFocusable();
        if (r1 == 0) goto L_0x0305;
    L_0x0302:
        r6 = r10.a;
        goto L_0x034c;
    L_0x0305:
        r1 = r0.g;
        r1 = r1.a();
        if (r1 > 0) goto L_0x030e;
    L_0x030d:
        goto L_0x034c;
    L_0x030e:
        r1 = r0.L;
        r2 = r1.l;
        if (r2 == r7) goto L_0x0315;
    L_0x0314:
        goto L_0x0316;
    L_0x0315:
        r2 = 0;
    L_0x0316:
        r1 = r1.b();
        r3 = r2;
    L_0x031b:
        if (r3 >= r1) goto L_0x0331;
    L_0x031d:
        r8 = r0.f(r3);
        if (r8 == 0) goto L_0x0331;
    L_0x0323:
        r9 = r8.a;
        r9 = r9.hasFocusable();
        if (r9 != 0) goto L_0x032e;
    L_0x032b:
        r3 = r3 + 1;
        goto L_0x031b;
    L_0x032e:
        r6 = r8.a;
        goto L_0x034c;
    L_0x0331:
        r1 = java.lang.Math.min(r1, r2);
        r1 = r1 + r7;
    L_0x0336:
        if (r1 < 0) goto L_0x034c;
    L_0x0338:
        r2 = r0.f(r1);
        if (r2 == 0) goto L_0x034c;
    L_0x033e:
        r3 = r2.a;
        r3 = r3.hasFocusable();
        if (r3 == 0) goto L_0x0349;
    L_0x0346:
        r6 = r2.a;
        goto L_0x034c;
    L_0x0349:
        r1 = r1 + -1;
        goto L_0x0336;
    L_0x034c:
        if (r6 == 0) goto L_0x0367;
    L_0x034e:
        r1 = r0.L;
        r1 = r1.n;
        r2 = (long) r1;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 == 0) goto L_0x0363;
    L_0x0357:
        r1 = r6.findViewById(r1);
        if (r1 == 0) goto L_0x0363;
    L_0x035d:
        r2 = r1.isFocusable();
        if (r2 != 0) goto L_0x0364;
    L_0x0363:
        r1 = r6;
    L_0x0364:
        r1.requestFocus();
    L_0x0367:
        r17.z();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.y():void");
    }

    private final void z() {
        aqh aqh = this.L;
        aqh.m = -1;
        aqh.l = -1;
        aqh.n = -1;
    }

    private final void a(aqh aqh) {
        if (this.E == 2) {
            OverScroller overScroller = this.I.c;
            aqh.o = overScroller.getFinalX() - overScroller.getCurrX();
            aqh.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        aqh.o = 0;
        aqh.p = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0188  */
    private final void A() {
        /*
        r8 = this;
        r0 = r8.L;
        r1 = 1;
        r0.a(r1);
        r0 = r8.L;
        r8.a(r0);
        r0 = r8.L;
        r2 = 0;
        r0.i = r2;
        r8.f();
        r0 = r8.h;
        r0.a();
        r8.l();
        r0 = r8.x;
        if (r0 == 0) goto L_0x002d;
    L_0x001f:
        r0 = r8.f;
        r0.a();
        r0 = r8.ai;
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r8.n;
        r0.c();
    L_0x002d:
        r0 = r8.x();
        if (r0 == 0) goto L_0x0039;
    L_0x0033:
        r0 = r8.f;
        r0.b();
        goto L_0x003e;
    L_0x0039:
        r0 = r8.f;
        r0.e();
    L_0x003e:
        r0 = r8.N;
        if (r0 != 0) goto L_0x0049;
    L_0x0042:
        r0 = r8.O;
        if (r0 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0049;
    L_0x0047:
        r0 = 0;
        goto L_0x004a;
    L_0x0049:
        r0 = 1;
    L_0x004a:
        r3 = r8.L;
        r4 = r8.s;
        if (r4 == 0) goto L_0x006c;
    L_0x0050:
        r4 = r8.D;
        if (r4 == 0) goto L_0x006c;
    L_0x0054:
        r4 = r8.x;
        if (r4 != 0) goto L_0x0061;
    L_0x0058:
        if (r0 != 0) goto L_0x0061;
    L_0x005a:
        r5 = r8.n;
        r5 = r5.n;
        if (r5 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x006c;
    L_0x0061:
        if (r4 == 0) goto L_0x006a;
    L_0x0063:
        r4 = r8.m;
        r4 = r4.b;
        if (r4 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006c;
    L_0x006a:
        r4 = 1;
        goto L_0x006d;
    L_0x006c:
        r4 = 0;
    L_0x006d:
        r3.j = r4;
        if (r4 != 0) goto L_0x0073;
    L_0x0071:
        r0 = 0;
        goto L_0x0082;
    L_0x0073:
        if (r0 == 0) goto L_0x0071;
    L_0x0075:
        r0 = r8.x;
        if (r0 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0071;
    L_0x007a:
        r0 = r8.x();
        if (r0 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0071;
    L_0x0081:
        r0 = 1;
    L_0x0082:
        r3.k = r0;
        r0 = r8.H;
        r3 = 0;
        if (r0 == 0) goto L_0x0098;
    L_0x0089:
        r0 = r8.hasFocus();
        if (r0 == 0) goto L_0x0098;
    L_0x008f:
        r0 = r8.m;
        if (r0 == 0) goto L_0x0098;
    L_0x0093:
        r0 = r8.getFocusedChild();
        goto L_0x0099;
    L_0x0098:
        r0 = r3;
    L_0x0099:
        if (r0 == 0) goto L_0x009f;
    L_0x009b:
        r3 = r8.c(r0);
    L_0x009f:
        r0 = -1;
        if (r3 != 0) goto L_0x00a6;
    L_0x00a2:
        r8.z();
        goto L_0x00f5;
    L_0x00a6:
        r4 = r8.L;
        r5 = r8.m;
        r5 = r5.b;
        if (r5 == 0) goto L_0x00b1;
    L_0x00ae:
        r5 = r3.e;
        goto L_0x00b3;
    L_0x00b1:
        r5 = -1;
    L_0x00b3:
        r4.m = r5;
        r5 = r8.x;
        if (r5 != 0) goto L_0x00c7;
    L_0x00b9:
        r5 = r3.m();
        if (r5 == 0) goto L_0x00c2;
    L_0x00bf:
        r5 = r3.d;
        goto L_0x00c8;
    L_0x00c2:
        r5 = r3.d();
        goto L_0x00c8;
    L_0x00c7:
        r5 = -1;
    L_0x00c8:
        r4.l = r5;
        r4 = r8.L;
        r3 = r3.a;
        r5 = r3.getId();
    L_0x00d2:
        r6 = r3.isFocused();
        if (r6 != 0) goto L_0x00f3;
    L_0x00d8:
        r6 = r3 instanceof android.view.ViewGroup;
        if (r6 == 0) goto L_0x00f3;
    L_0x00dc:
        r6 = r3.hasFocus();
        if (r6 == 0) goto L_0x00f3;
    L_0x00e2:
        r3 = (android.view.ViewGroup) r3;
        r3 = r3.getFocusedChild();
        r6 = r3.getId();
        if (r6 == r0) goto L_0x00d2;
    L_0x00ee:
        r5 = r3.getId();
        goto L_0x00d2;
    L_0x00f3:
        r4.n = r5;
    L_0x00f5:
        r3 = r8.L;
        r4 = r3.j;
        if (r4 == 0) goto L_0x00ff;
    L_0x00fb:
        r4 = r8.O;
        if (r4 != 0) goto L_0x0100;
    L_0x00ff:
        r1 = 0;
    L_0x0100:
        r3.h = r1;
        r8.O = r2;
        r8.N = r2;
        r1 = r3.k;
        r3.g = r1;
        r1 = r8.m;
        r1 = r1.a();
        r3.e = r1;
        r1 = r8.ax;
        r8.a(r1);
        r1 = r8.L;
        r1 = r1.j;
        if (r1 == 0) goto L_0x017c;
    L_0x011d:
        r1 = r8.g;
        r1 = r1.a();
        r3 = 0;
    L_0x0124:
        if (r3 >= r1) goto L_0x017c;
    L_0x0126:
        r4 = r8.g;
        r4 = r4.b(r3);
        r4 = d(r4);
        r5 = r4.b();
        if (r5 == 0) goto L_0x0137;
    L_0x0136:
        goto L_0x0179;
    L_0x0137:
        r5 = r4.j();
        if (r5 == 0) goto L_0x0143;
    L_0x013d:
        r5 = r8.m;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0179;
    L_0x0143:
        defpackage.aph.e(r4);
        r4.q();
        r5 = defpackage.aph.d(r4);
        r6 = r8.h;
        r6.a(r4, r5);
        r5 = r8.L;
        r5 = r5.h;
        if (r5 == 0) goto L_0x0179;
    L_0x0158:
        r5 = r4.t();
        if (r5 == 0) goto L_0x0179;
    L_0x015e:
        r5 = r4.m();
        if (r5 != 0) goto L_0x0179;
    L_0x0164:
        r5 = r4.b();
        if (r5 != 0) goto L_0x0179;
    L_0x016a:
        r5 = r4.j();
        if (r5 != 0) goto L_0x0179;
    L_0x0170:
        r5 = r8.d(r4);
        r7 = r8.h;
        r7.a(r5, r4);
    L_0x0179:
        r3 = r3 + 1;
        goto L_0x0124;
    L_0x017c:
        r1 = r8.L;
        r1 = r1.k;
        r3 = 2;
        if (r1 != 0) goto L_0x0188;
    L_0x0183:
        r8.D();
        goto L_0x0221;
    L_0x0188:
        r1 = r8.g;
        r1 = r1.b();
        r4 = 0;
    L_0x018f:
        if (r4 >= r1) goto L_0x01ad;
    L_0x0191:
        r5 = r8.g;
        r5 = r5.c(r4);
        r5 = d(r5);
        r6 = r5.b();
        if (r6 == 0) goto L_0x01a2;
    L_0x01a1:
        goto L_0x01aa;
    L_0x01a2:
        r6 = r5.d;
        if (r6 != r0) goto L_0x01aa;
    L_0x01a6:
        r6 = r5.c;
        r5.d = r6;
    L_0x01aa:
        r4 = r4 + 1;
        goto L_0x018f;
    L_0x01ad:
        r0 = r8.L;
        r1 = r0.f;
        r0.f = r2;
        r4 = r8.n;
        r5 = r8.e;
        r4.c(r5, r0);
        r0 = r8.L;
        r0.f = r1;
        r0 = 0;
    L_0x01bf:
        r1 = r8.g;
        r1 = r1.a();
        if (r0 >= r1) goto L_0x021e;
    L_0x01c7:
        r1 = r8.g;
        r1 = r1.b(r0);
        r1 = d(r1);
        r4 = r1.b();
        if (r4 != 0) goto L_0x021b;
    L_0x01d7:
        r4 = r8.h;
        r4 = r4.a;
        r4 = r4.get(r1);
        r4 = (defpackage.asu) r4;
        if (r4 == 0) goto L_0x01e9;
    L_0x01e3:
        r4 = r4.a;
        r4 = r4 & 4;
        if (r4 != 0) goto L_0x021b;
    L_0x01e9:
        defpackage.aph.e(r1);
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r4 = r1.a(r4);
        r1.q();
        r5 = defpackage.aph.d(r1);
        if (r4 == 0) goto L_0x01ff;
    L_0x01fb:
        r8.a(r1, r5);
        goto L_0x021b;
    L_0x01ff:
        r4 = r8.h;
        r6 = r4.a;
        r6 = r6.get(r1);
        r6 = (defpackage.asu) r6;
        if (r6 != 0) goto L_0x0214;
    L_0x020b:
        r6 = defpackage.asu.a();
        r4 = r4.a;
        r4.put(r1, r6);
    L_0x0214:
        r1 = r6.a;
        r1 = r1 | r3;
        r6.a = r1;
        r6.b = r5;
    L_0x021b:
        r0 = r0 + 1;
        goto L_0x01bf;
    L_0x021e:
        r8.D();
    L_0x0221:
        r8.w();
        r8.a(r2);
        r0 = r8.L;
        r0.d = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.A():void");
    }

    private final void B() {
        f();
        l();
        this.L.a(6);
        this.f.e();
        this.L.e = this.m.a();
        aqh aqh = this.L;
        aqh.c = 0;
        aqh.g = false;
        this.n.c(this.e, aqh);
        aqh = this.L;
        aqh.f = false;
        this.aa = null;
        boolean z = aqh.j && this.D != null;
        aqh.j = z;
        aqh.d = 4;
        w();
        a(false);
    }

    public final void a(aqj aqj, api api) {
        aqj.a(0, 8192);
        if (this.L.h && aqj.t() && !aqj.m() && !aqj.b()) {
            this.h.a(d(aqj), aqj);
        }
        this.h.a(aqj, api);
    }

    private final void a(int[] iArr) {
        int a = this.g.a();
        if (a != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = aocf.UNSET_ENUM_VALUE;
            for (int i3 = 0; i3 < a; i3++) {
                aqj d = d(this.g.b(i3));
                if (!d.b()) {
                    int c = d.c();
                    if (c < i) {
                        i = c;
                    }
                    if (c > i2) {
                        i2 = c;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    public final void removeDetachedView(View view, boolean z) {
        aqj d = d(view);
        if (d != null) {
            if (d.n()) {
                d.i();
            } else if (!d.b()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                stringBuilder.append(d);
                stringBuilder.append(a());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        view.clearAnimation();
        i(view);
        super.removeDetachedView(view, z);
    }

    private final long d(aqj aqj) {
        if (this.m.b) {
            return aqj.e;
        }
        return (long) aqj.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y();
        this.s = true;
    }

    public final void requestLayout() {
        if (this.ae != 0 || this.u) {
            this.t = true;
        } else {
            super.requestLayout();
        }
    }

    private final void C() {
        int i;
        int b = this.g.b();
        for (i = 0; i < b; i++) {
            ((apr) this.g.c(i).getLayoutParams()).e = true;
        }
        apw apw = this.e;
        i = apw.c.size();
        for (int i2 = 0; i2 < i; i2++) {
            apr apr = (apr) ((aqj) apw.c.get(i2)).a.getLayoutParams();
            if (apr != null) {
                apr.e = true;
            }
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        EdgeEffect edgeEffect;
        int i2;
        super.draw(canvas);
        int size = this.p.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ((apk) this.p.get(i4)).b(canvas, this);
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 == null || edgeEffect2.isFinished()) {
            i = 0;
        } else {
            size = canvas.save();
            i = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i), 0.0f);
            EdgeEffect edgeEffect3 = this.z;
            i = (edgeEffect3 == null || !edgeEffect3.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(size);
        }
        edgeEffect2 = this.A;
        if (!(edgeEffect2 == null || edgeEffect2.isFinished())) {
            size = canvas.save();
            if (this.i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            edgeEffect = this.A;
            i2 = (edgeEffect == null || !edgeEffect.draw(canvas)) ? 0 : 1;
            i |= i2;
            canvas.restoreToCount(size);
        }
        edgeEffect2 = this.B;
        if (!(edgeEffect2 == null || edgeEffect2.isFinished())) {
            size = canvas.save();
            i2 = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-i2));
            edgeEffect = this.B;
            i2 = (edgeEffect == null || !edgeEffect.draw(canvas)) ? 0 : 1;
            i |= i2;
            canvas.restoreToCount(size);
        }
        edgeEffect2 = this.C;
        if (!(edgeEffect2 == null || edgeEffect2.isFinished())) {
            size = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            edgeEffect = this.C;
            if (edgeEffect != null && edgeEffect.draw(canvas)) {
                i3 = 1;
            }
            i |= i3;
            canvas.restoreToCount(size);
        }
        if (i != 0 || (this.D != null && this.p.size() > 0 && this.D.b())) {
            abe.e(this);
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            ((apk) this.p.get(i)).a(canvas, this);
        }
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof apr) && this.n.a((apr) layoutParams);
    }

    public final LayoutParams generateDefaultLayoutParams() {
        apn apn = this.n;
        if (apn != null) {
            return apn.g();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        apn apn = this.n;
        if (apn != null) {
            return apn.a(getContext(), attributeSet);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        apn apn = this.n;
        if (apn != null) {
            return apn.a(layoutParams);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private final void D() {
        int i;
        int i2;
        int b = this.g.b();
        for (i = 0; i < b; i++) {
            aqj d = d(this.g.c(i));
            if (!d.b()) {
                d.a();
            }
        }
        apw apw = this.e;
        i = apw.c.size();
        for (i2 = 0; i2 < i; i2++) {
            ((aqj) apw.c.get(i2)).a();
        }
        i = apw.a.size();
        for (i2 = 0; i2 < i; i2++) {
            ((aqj) apw.a.get(i2)).a();
        }
        ArrayList arrayList = apw.b;
        if (arrayList != null) {
            i = arrayList.size();
            for (int i3 = 0; i3 < i; i3++) {
                ((aqj) apw.b.get(i3)).a();
            }
        }
    }

    public final void a(int i, int i2, boolean z) {
        int i3;
        aqj d;
        int i4;
        int i5 = i + i2;
        int b = this.g.b();
        for (i3 = 0; i3 < b; i3++) {
            d = d(this.g.c(i3));
            if (!(d == null || d.b())) {
                i4 = d.c;
                if (i4 >= i5) {
                    d.a(-i2, z);
                    this.L.f = true;
                } else if (i4 >= i) {
                    d.b(8);
                    d.a(-i2, z);
                    d.c = i - 1;
                    this.L.f = true;
                }
            }
        }
        apw apw = this.e;
        i3 = apw.c.size();
        while (true) {
            i3--;
            if (i3 >= 0) {
                d = (aqj) apw.c.get(i3);
                if (d != null) {
                    i4 = d.c;
                    if (i4 >= i5) {
                        d.a(-i2, z);
                    } else if (i4 >= i) {
                        d.b(8);
                        apw.b(i3);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void c(boolean z) {
        int i;
        aqj d;
        this.ai = z | this.ai;
        this.x = true;
        int b = this.g.b();
        for (i = 0; i < b; i++) {
            d = d(this.g.c(i));
            if (!(d == null || d.b())) {
                d.b(6);
            }
        }
        C();
        apw apw = this.e;
        i = apw.c.size();
        for (int i2 = 0; i2 < i; i2++) {
            d = (aqj) apw.c.get(i2);
            if (d != null) {
                d.b(6);
                d.a(null);
            }
        }
        apa apa = apw.g.m;
        if (apa == null || !apa.b) {
            apw.c();
        }
    }

    public final void p() {
        if (this.p.size() != 0) {
            apn apn = this.n;
            if (apn != null) {
                apn.a("Cannot invalidate item decorations during a scroll or layout");
            }
            C();
            requestLayout();
        }
    }

    public final aqj a(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return d(view);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a direct child of ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final View b(View view) {
        RecyclerView parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return parent == this ? view : null;
    }

    public final aqj c(View view) {
        view = b(view);
        return view != null ? a(view) : null;
    }

    public static aqj d(View view) {
        return view != null ? ((apr) view.getLayoutParams()).c : null;
    }

    public static int e(View view) {
        aqj d = d(view);
        if (d == null) {
            return -1;
        }
        return d.d();
    }

    public static int f(View view) {
        aqj d = d(view);
        if (d == null) {
            return -1;
        }
        return d.c();
    }

    public final aqj f(int i) {
        aqj aqj = null;
        if (!this.x) {
            int b = this.g.b();
            for (int i2 = 0; i2 < b; i2++) {
                aqj d = d(this.g.c(i2));
                if (!(d == null || d.m() || c(d) != i)) {
                    if (!this.g.d(d.a)) {
                        return d;
                    }
                    aqj = d;
                }
            }
        }
        return aqj;
    }

    public final aqj a(int i, boolean z) {
        int b = this.g.b();
        aqj aqj = null;
        for (int i2 = 0; i2 < b; i2++) {
            aqj d = d(this.g.c(i2));
            if (!(d == null || d.m())) {
                if (z) {
                    if (d.c != i) {
                        continue;
                    }
                } else if (d.c() != i) {
                    continue;
                }
                if (!this.g.d(d.a)) {
                    return d;
                }
                aqj = d;
            }
        }
        return aqj;
    }

    public final View a(float f, float f2) {
        int a = this.g.a();
        while (true) {
            a--;
            if (a < 0) {
                return null;
            }
            View b = this.g.b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY) {
                if (f2 <= ((float) b.getBottom()) + translationY) {
                    return b;
                }
            }
        }
    }

    public static void a(View view, Rect rect) {
        apr apr = (apr) view.getLayoutParams();
        Rect rect2 = apr.d;
        rect.set((view.getLeft() - rect2.left) - apr.leftMargin, (view.getTop() - rect2.top) - apr.topMargin, (view.getRight() + rect2.right) + apr.rightMargin, (view.getBottom() + rect2.bottom) + apr.bottomMargin);
    }

    public final Rect g(View view) {
        apr apr = (apr) view.getLayoutParams();
        if (!apr.e) {
            return apr.d;
        }
        if (this.L.g && (apr.m_() || apr.c.j())) {
            return apr.d;
        }
        Rect rect = apr.d;
        rect.set(0, 0, 0, 0);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            this.k.set(0, 0, 0, 0);
            ((apk) this.p.get(i)).a(this.k, view, this, this.L);
            rect.left += this.k.left;
            rect.top += this.k.top;
            rect.right += this.k.right;
            rect.bottom += this.k.bottom;
        }
        apr.e = false;
        return rect;
    }

    public final void e(int i, int i2) {
        this.ak++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        List list = this.M;
        if (list != null) {
            scrollX = list.size();
            while (true) {
                scrollX--;
                if (scrollX < 0) {
                    break;
                }
                ((apv) this.M.get(scrollX)).a(this, i, i2);
            }
        }
        this.ak--;
    }

    public final boolean q() {
        return !this.s || this.x || this.f.d();
    }

    public static RecyclerView h(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView h = h(viewGroup.getChildAt(i));
                if (h != null) {
                    return h;
                }
            }
        }
        return null;
    }

    public static void b(aqj aqj) {
        WeakReference weakReference = aqj.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != aqj.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            aqj.b = null;
        }
    }

    public static long r() {
        if (d) {
            return System.nanoTime();
        }
        return 0;
    }

    public final void i(View view) {
        d(view);
        List list = this.w;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((apq) this.w.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean a(aqj aqj, int i) {
        if (n()) {
            aqj.n = i;
            this.aB.add(aqj);
            return false;
        }
        abe.b(aqj.a, i);
        return true;
    }

    public final int c(aqj aqj) {
        if (aqj.a(524) || !aqj.l()) {
            return -1;
        }
        akr akr = this.f;
        int i = aqj.c;
        int size = akr.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            aks aks = (aks) akr.a.get(i2);
            int i3 = aks.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    i3 = aks.b;
                    if (i3 <= i) {
                        int i4 = aks.d;
                        if (i3 + i4 > i) {
                            i = -1;
                            break;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    i3 = aks.b;
                    if (i3 == i) {
                        i = aks.d;
                    } else {
                        if (i3 < i) {
                            i--;
                        }
                        if (aks.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (aks.b <= i) {
                i += aks.d;
            }
        }
        return i;
    }

    public final void setNestedScrollingEnabled(boolean z) {
        E().a(z);
    }

    public final boolean isNestedScrollingEnabled() {
        return E().a;
    }

    public final boolean startNestedScroll(int i) {
        return E().b(i);
    }

    private final boolean f(int i, int i2) {
        return E().a(i, i2);
    }

    public final void stopNestedScroll() {
        E().b();
    }

    public final void g(int i) {
        E().c(i);
    }

    public final boolean hasNestedScrollingParent() {
        return E().a();
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return E().a(i, i2, i3, i4, iArr);
    }

    public final void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        E().a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return E().a(i, i2, iArr, iArr2);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return E().a(i, i2, iArr, iArr2, i3);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return E().a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return E().a(f, f2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int getChildDrawingOrder(int i, int i2) {
        apf apf = this.aw;
        if (apf == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return apf.a(i, i2);
    }

    private final aax E() {
        if (this.ay == null) {
            this.ay = new aax(this);
        }
        return this.ay;
    }

    static {
        boolean z = VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        a = z;
    }
}
