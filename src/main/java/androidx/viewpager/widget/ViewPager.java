package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import defpackage.abe;
import defpackage.bik;
import defpackage.bim;
import defpackage.bin;
import defpackage.bio;
import defpackage.bip;
import defpackage.biq;
import defpackage.bir;
import defpackage.bis;
import defpackage.bit;
import defpackage.biu;
import defpackage.biv;
import defpackage.biw;
import defpackage.bix;
import defpackage.biy;
import defpackage.bjc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] a = new int[]{16842931};
    private static final bjc aa = new bjc();
    private static final Comparator k = new bim();
    private static final Interpolator l = new bio();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private boolean F = true;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K = -1;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private boolean S = true;
    private boolean T;
    private int U;
    private List V;
    private ArrayList W;
    private final Runnable ab = new bin(this);
    private int ac = 0;
    public bik b;
    public int c;
    public int d = 1;
    public biw e;
    public List f;
    public biv g;
    public int h;
    public int i;
    private int j;
    private final ArrayList m = new ArrayList();
    private final bis n = new bis();
    private final Rect o = new Rect();
    private int p = -1;
    private Parcelable q = null;
    private ClassLoader r = null;
    private Scroller s;
    private boolean t;
    private biy u;
    private float v = -3.4028235E38f;
    private float w = Float.MAX_VALUE;
    private boolean x;
    private boolean y;
    private boolean z;

    public ViewPager(Context context) {
        super(context);
        d();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private final void d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.s = new Scroller(context, l);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (f + f);
        this.C = (int) (f * 16.0f);
        abe.a((View) this, new biu(this));
        if (abe.f(this) == 0) {
            abe.b((View) this, 1);
        }
        abe.a((View) this, new biq(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.ab);
        Scroller scroller = this.s;
        if (!(scroller == null || scroller.isFinished())) {
            this.s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void a(int i) {
        if (this.ac != i) {
            int childCount;
            this.ac = i;
            if (this.g != null) {
                childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(i != 0 ? this.h : 0, null);
                }
            }
            biw biw = this.e;
            if (biw != null) {
                biw.a(i);
            }
            List list = this.V;
            if (list != null) {
                childCount = list.size();
                for (int i3 = 0; i3 < childCount; i3++) {
                    biw biw2 = (biw) this.V.get(i3);
                    if (biw2 != null) {
                        biw2.a(i);
                    }
                }
            }
        }
    }

    public final void a(bik bik) {
        int i;
        bik bik2 = this.b;
        int i2 = false;
        if (bik2 != null) {
            bik2.a(null);
            this.b.a((ViewGroup) this);
            for (i = 0; i < this.m.size(); i++) {
                bis bis = (bis) this.m.get(i);
                this.b.a(this, bis.b, bis.a);
            }
            this.b.a();
            this.m.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((bir) getChildAt(i).getLayoutParams()).a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = bik;
        this.j = 0;
        if (this.b != null) {
            if (this.u == null) {
                this.u = new biy(this);
            }
            this.b.a(this.u);
            this.z = false;
            boolean z = this.S;
            this.S = true;
            this.j = this.b.c();
            if (this.p >= 0) {
                this.b.a(this.q, this.r);
                a(this.p, false, true);
                this.p = -1;
                this.q = null;
                this.r = null;
            } else if (z) {
                requestLayout();
            } else {
                c();
            }
        }
        List list = this.f;
        if (list != null && !list.isEmpty()) {
            i = this.f.size();
            while (i2 < i) {
                ((bit) this.f.get(i2)).a(this, bik);
                i2++;
            }
        }
    }

    private final int e() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void b(int i) {
        this.z = false;
        a(i, this.S ^ 1, false);
    }

    public void a(int i, boolean z) {
        this.z = false;
        a(i, z, false);
    }

    public int a() {
        return this.c;
    }

    private final void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    private final void a(int i, boolean z, boolean z2, int i2) {
        bik bik = this.b;
        boolean z3 = false;
        if (bik == null || bik.c() <= 0) {
            b(false);
        } else if (z2 || this.c != i || this.m.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.c()) {
                i = this.b.c() - 1;
            }
            int i3 = this.d;
            int i4 = this.c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (i3 = 0; i3 < this.m.size(); i3++) {
                    ((bis) this.m.get(i3)).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.S) {
                this.c = i;
                if (z3) {
                    f(i);
                }
                requestLayout();
                return;
            }
            c(i);
            a(i, z, i2, z3);
        } else {
            b(false);
        }
    }

    private final void a(int i, boolean z, int i2, boolean z2) {
        bis d = d(i);
        int e = d != null ? (int) (((float) e()) * Math.max(this.v, Math.min(d.e, this.w))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                b(false);
            } else {
                int scrollX;
                Scroller scroller = this.s;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    if (this.t) {
                        scrollX = this.s.getCurrX();
                    } else {
                        scrollX = this.s.getStartX();
                    }
                    this.s.abortAnimation();
                    b(false);
                }
                int i3 = scrollX;
                int scrollY = getScrollY();
                int i4 = e - i3;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    a(false);
                    c();
                    a(0);
                } else {
                    b(true);
                    a(2);
                    e = e();
                    float f = (float) e;
                    float f2 = (float) (e / 2);
                    f2 += ((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i4)) / f) - 8.0f) * 0.47123894f))) * f2;
                    i2 = Math.abs(i2);
                    if (i2 > 0) {
                        scrollX = Math.round(Math.abs(f2 / ((float) i2)) * 1000.0f) << 2;
                    } else {
                        scrollX = (int) (((((float) Math.abs(i4)) / (f + 0.0f)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(scrollX, 600);
                    this.t = false;
                    this.s.startScroll(i3, scrollY, i4, i5, min);
                    abe.e(this);
                }
            }
            if (z2) {
                f(i);
            }
            return;
        }
        if (z2) {
            f(i);
        }
        a(false);
        scrollTo(e, 0);
        e(e);
    }

    @Deprecated
    public void a(biw biw) {
        this.e = biw;
    }

    public void b(biw biw) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(biw);
    }

    public void c(biw biw) {
        List list = this.V;
        if (list != null) {
            list.remove(biw);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.i == 2) {
            i2 = (i - 1) - i2;
        }
        return ((bir) ((View) this.W.get(i2)).getLayoutParams()).f;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    private final bis a(int i, int i2) {
        bis bis = new bis();
        bis.b = i;
        bis.a = this.b.a((ViewGroup) this, i);
        bis.d = 1.0f;
        if (i2 < 0 || i2 >= this.m.size()) {
            this.m.add(bis);
        } else {
            this.m.add(i2, bis);
        }
        return bis;
    }

    public final void b() {
        int c = this.b.c();
        this.j = c;
        int size = this.m.size();
        int i = this.d;
        Object obj = (size >= (i + i) + 1 || this.m.size() >= c) ? null : 1;
        Object obj2 = obj;
        int i2 = this.c;
        size = 0;
        Object obj3 = null;
        while (size < this.m.size()) {
            bis bis = (bis) this.m.get(size);
            int b = this.b.b(bis.a);
            if (b != -1) {
                if (b == -2) {
                    this.m.remove(size);
                    size--;
                    if (obj3 == null) {
                        this.b.a((ViewGroup) this);
                    }
                    this.b.a(this, bis.b, bis.a);
                    i = this.c;
                    if (i == bis.b) {
                        i2 = Math.max(0, Math.min(i, -1 + c));
                    }
                    obj3 = 1;
                } else {
                    int i3 = bis.b;
                    if (i3 != b) {
                        if (i3 == this.c) {
                            i2 = b;
                        }
                        bis.b = b;
                    }
                }
                obj2 = 1;
            }
            size++;
        }
        if (obj3 != null) {
            this.b.a();
        }
        Collections.sort(this.m, k);
        if (obj2 != null) {
            c = getChildCount();
            for (size = 0; size < c; size++) {
                bir bir = (bir) getChildAt(size).getLayoutParams();
                if (!bir.a) {
                    bir.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public final void c() {
        c(this.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{LOOP_END, LOOP:5: B:104:0x01c8->B:107:0x01d5} */
    /* JADX WARNING: Missing block: B:22:0x0062, code skipped:
            if (r9 == r10) goto L_0x0066;
     */
    private final void c(int r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r0.c;
        if (r2 == r1) goto L_0x000f;
    L_0x0008:
        r2 = r0.d(r2);
        r0.c = r1;
        goto L_0x0010;
    L_0x000f:
        r2 = 0;
    L_0x0010:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r18.f();
        return;
    L_0x0018:
        r1 = r0.z;
        if (r1 == 0) goto L_0x0020;
    L_0x001c:
        r18.f();
        return;
    L_0x0020:
        r1 = r18.getWindowToken();
        if (r1 == 0) goto L_0x03aa;
    L_0x0026:
        r1 = r0.b;
        r1.a(r0);
        r1 = r0.d;
        r4 = r0.c;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.b;
        r6 = r6.c();
        r7 = r6 + -1;
        r8 = r0.c;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.j;
        if (r6 != r7) goto L_0x0352;
    L_0x0048:
        r7 = 0;
    L_0x0049:
        r8 = r0.m;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x0065;
    L_0x0051:
        r8 = r0.m;
        r8 = r8.get(r7);
        r8 = (defpackage.bis) r8;
        r9 = r8.b;
        r10 = r0.c;
        if (r9 >= r10) goto L_0x0062;
    L_0x005f:
        r7 = r7 + 1;
        goto L_0x0049;
    L_0x0062:
        if (r9 != r10) goto L_0x0065;
    L_0x0064:
        goto L_0x0066;
    L_0x0065:
        r8 = 0;
    L_0x0066:
        if (r8 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0071;
    L_0x0069:
        if (r6 <= 0) goto L_0x0071;
    L_0x006b:
        r8 = r0.c;
        r8 = r0.a(r8, r7);
    L_0x0071:
        r9 = 0;
        if (r8 != 0) goto L_0x0076;
    L_0x0074:
        goto L_0x029b;
    L_0x0076:
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x0083;
    L_0x007a:
        r11 = r0.m;
        r11 = r11.get(r10);
        r11 = (defpackage.bis) r11;
        goto L_0x0084;
    L_0x0083:
        r11 = 0;
    L_0x0084:
        r12 = r18.e();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 <= 0) goto L_0x009a;
    L_0x008c:
        r14 = r8.d;
        r14 = r13 - r14;
        r15 = r18.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
        goto L_0x009b;
    L_0x009a:
        r3 = 0;
    L_0x009b:
        r14 = r0.c;
        r14 = r14 + -1;
        r15 = r10;
        r10 = r7;
        r7 = 0;
    L_0x00a2:
        if (r14 >= 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00d8;
    L_0x00a5:
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x031e;
    L_0x00a9:
        if (r14 >= r4) goto L_0x031e;
    L_0x00ab:
        if (r11 == 0) goto L_0x00d8;
    L_0x00ad:
        r5 = r11.b;
        if (r14 == r5) goto L_0x00b3;
    L_0x00b1:
        goto L_0x034d;
    L_0x00b3:
        r5 = r11.c;
        if (r5 == 0) goto L_0x00b9;
    L_0x00b7:
        goto L_0x034d;
    L_0x00b9:
        r5 = r0.m;
        r5.remove(r15);
        r5 = r0.b;
        r11 = r11.a;
        r5.a(r0, r14, r11);
        r15 = r15 + -1;
        r10 = r10 + -1;
        if (r15 < 0) goto L_0x00d5;
    L_0x00cb:
        r5 = r0.m;
        r5 = r5.get(r15);
        r5 = (defpackage.bis) r5;
        goto L_0x034c;
    L_0x00d5:
        r5 = 0;
        goto L_0x034c;
    L_0x00d8:
        r3 = r8.d;
        r4 = r10 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x0177;
    L_0x00e0:
        r5 = r0.m;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x00f1;
    L_0x00e8:
        r5 = r0.m;
        r5 = r5.get(r4);
        r5 = (defpackage.bis) r5;
        goto L_0x00f2;
    L_0x00f1:
        r5 = 0;
    L_0x00f2:
        if (r12 <= 0) goto L_0x00fd;
    L_0x00f4:
        r7 = r18.getPaddingRight();
        r7 = (float) r7;
        r11 = (float) r12;
        r7 = r7 / r11;
        r7 = r7 + r13;
        goto L_0x00fe;
    L_0x00fd:
        r7 = 0;
    L_0x00fe:
        r11 = r0.c;
        r11 = r11 + 1;
        r12 = r4;
    L_0x0103:
        if (r11 < r6) goto L_0x0107;
    L_0x0105:
        goto L_0x0177;
    L_0x0107:
        r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r13 < 0) goto L_0x0136;
    L_0x010b:
        if (r11 <= r1) goto L_0x0136;
    L_0x010d:
        if (r5 == 0) goto L_0x0177;
    L_0x010f:
        r13 = r5.b;
        if (r11 == r13) goto L_0x0114;
    L_0x0113:
        goto L_0x0174;
    L_0x0114:
        r13 = r5.c;
        if (r13 == 0) goto L_0x0119;
    L_0x0118:
        goto L_0x0174;
    L_0x0119:
        r13 = r0.m;
        r13.remove(r12);
        r13 = r0.b;
        r5 = r5.a;
        r13.a(r0, r11, r5);
        r5 = r0.m;
        r5 = r5.size();
        if (r12 >= r5) goto L_0x0173;
    L_0x012d:
        r5 = r0.m;
        r5 = r5.get(r12);
        r5 = (defpackage.bis) r5;
        goto L_0x0174;
    L_0x0136:
        if (r5 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x0153;
    L_0x0139:
        r13 = r5.b;
        if (r11 != r13) goto L_0x0153;
    L_0x013d:
        r5 = r5.d;
        r3 = r3 + r5;
        r12 = r12 + 1;
        r5 = r0.m;
        r5 = r5.size();
        if (r12 >= r5) goto L_0x0173;
    L_0x014a:
        r5 = r0.m;
        r5 = r5.get(r12);
        r5 = (defpackage.bis) r5;
        goto L_0x0174;
    L_0x0153:
        r5 = r12 + 1;
        r12 = r0.a(r11, r12);
        r12 = r12.d;
        r3 = r3 + r12;
        r12 = r0.m;
        r12 = r12.size();
        if (r5 >= r12) goto L_0x0172;
    L_0x0164:
        r12 = r0.m;
        r12 = r12.get(r5);
        r12 = (defpackage.bis) r12;
        r17 = r12;
        r12 = r5;
        r5 = r17;
        goto L_0x0174;
    L_0x0172:
        r12 = r5;
    L_0x0173:
        r5 = 0;
    L_0x0174:
        r11 = r11 + 1;
        goto L_0x0103;
    L_0x0177:
        r1 = r0.b;
        r1 = r1.c();
        r3 = r18.e();
        if (r3 <= 0) goto L_0x0187;
    L_0x0183:
        r3 = (float) r3;
        r3 = r9 / r3;
        goto L_0x0188;
    L_0x0187:
        r3 = 0;
    L_0x0188:
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 == 0) goto L_0x021a;
    L_0x018c:
        r6 = r2.b;
        r7 = r8.b;
        if (r6 >= r7) goto L_0x01db;
    L_0x0192:
        r7 = r2.e;
        r2 = r2.d;
        r7 = r7 + r2;
        r7 = r7 + r3;
        r6 = r6 + 1;
        r2 = 0;
    L_0x019b:
        r11 = r8.b;
        if (r6 > r11) goto L_0x021a;
    L_0x019f:
        r11 = r0.m;
        r11 = r11.size();
        if (r2 >= r11) goto L_0x021a;
    L_0x01a7:
        r11 = r0.m;
        r11 = r11.get(r2);
        r11 = (defpackage.bis) r11;
    L_0x01af:
        r12 = r11.b;
        if (r6 <= r12) goto L_0x01c8;
    L_0x01b3:
        r12 = r0.m;
        r12 = r12.size();
        r12 = r12 + -1;
        if (r2 >= r12) goto L_0x01c8;
    L_0x01bd:
        r2 = r2 + 1;
        r11 = r0.m;
        r11 = r11.get(r2);
        r11 = (defpackage.bis) r11;
        goto L_0x01af;
    L_0x01c8:
        r12 = r11.b;
        if (r6 < r12) goto L_0x01d5;
    L_0x01cc:
        r11.e = r7;
        r11 = r11.d;
        r11 = r11 + r3;
        r7 = r7 + r11;
        r6 = r6 + 1;
        goto L_0x019b;
    L_0x01d5:
        r12 = r3 + r5;
        r7 = r7 + r12;
        r6 = r6 + 1;
        goto L_0x01c8;
    L_0x01db:
        if (r6 <= r7) goto L_0x021a;
    L_0x01dd:
        r7 = r0.m;
        r7 = r7.size();
        r7 = r7 + -1;
        r2 = r2.e;
    L_0x01e7:
        r6 = r6 + -1;
        r11 = r8.b;
        if (r6 < r11) goto L_0x021a;
    L_0x01ed:
        if (r7 < 0) goto L_0x021a;
    L_0x01ef:
        r11 = r0.m;
        r11 = r11.get(r7);
        r11 = (defpackage.bis) r11;
    L_0x01f7:
        r12 = r11.b;
        if (r6 < r12) goto L_0x01fc;
    L_0x01fb:
        goto L_0x0209;
    L_0x01fc:
        if (r7 <= 0) goto L_0x0209;
    L_0x01fe:
        r7 = r7 + -1;
        r11 = r0.m;
        r11 = r11.get(r7);
        r11 = (defpackage.bis) r11;
        goto L_0x01f7;
    L_0x0209:
        r12 = r11.b;
        if (r6 > r12) goto L_0x0214;
    L_0x020d:
        r12 = r11.d;
        r12 = r12 + r3;
        r2 = r2 - r12;
        r11.e = r2;
        goto L_0x01e7;
    L_0x0214:
        r12 = r3 + r5;
        r2 = r2 - r12;
        r6 = r6 + -1;
        goto L_0x0209;
    L_0x021a:
        r2 = r0.m;
        r2 = r2.size();
        r6 = r8.e;
        r7 = r8.b;
        r11 = r7 + -1;
        if (r7 != 0) goto L_0x022a;
    L_0x0228:
        r12 = r6;
        goto L_0x022d;
    L_0x022a:
        r12 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
    L_0x022d:
        r0.v = r12;
        r1 = r1 + -1;
        r12 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r7 != r1) goto L_0x023a;
    L_0x0235:
        r7 = r8.d;
        r7 = r7 + r6;
        r7 = r7 + r12;
        goto L_0x023d;
    L_0x023a:
        r7 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
    L_0x023d:
        r0.w = r7;
        r10 = r10 + -1;
    L_0x0241:
        if (r10 < 0) goto L_0x0265;
    L_0x0243:
        r7 = r0.m;
        r7 = r7.get(r10);
        r7 = (defpackage.bis) r7;
    L_0x024b:
        r13 = r7.b;
        if (r11 <= r13) goto L_0x0255;
    L_0x024f:
        r11 = r11 + -1;
        r13 = r3 + r5;
        r6 = r6 - r13;
        goto L_0x024b;
    L_0x0255:
        r14 = r7.d;
        r14 = r14 + r3;
        r6 = r6 - r14;
        r7.e = r6;
        if (r13 == 0) goto L_0x025e;
    L_0x025d:
        goto L_0x0260;
    L_0x025e:
        r0.v = r6;
    L_0x0260:
        r10 = r10 + -1;
        r11 = r11 + -1;
        goto L_0x0241;
    L_0x0265:
        r6 = r8.e;
        r7 = r8.d;
        r6 = r6 + r7;
        r6 = r6 + r3;
        r7 = r8.b;
    L_0x026d:
        r7 = r7 + 1;
        if (r4 >= r2) goto L_0x0294;
    L_0x0271:
        r10 = r0.m;
        r10 = r10.get(r4);
        r10 = (defpackage.bis) r10;
    L_0x0279:
        r11 = r10.b;
        if (r7 >= r11) goto L_0x0283;
    L_0x027d:
        r7 = r7 + 1;
        r11 = r3 + r5;
        r6 = r6 + r11;
        goto L_0x0279;
    L_0x0283:
        if (r11 != r1) goto L_0x028b;
    L_0x0285:
        r11 = r10.d;
        r11 = r11 + r6;
        r11 = r11 + r12;
        r0.w = r11;
    L_0x028b:
        r10.e = r6;
        r10 = r10.d;
        r10 = r10 + r3;
        r6 = r6 + r10;
        r4 = r4 + 1;
        goto L_0x026d;
    L_0x0294:
        r1 = r0.b;
        r2 = r8.a;
        r1.a(r2);
    L_0x029b:
        r1 = r0.b;
        r1.a();
        r1 = r18.getChildCount();
        r2 = 0;
    L_0x02a5:
        if (r2 >= r1) goto L_0x02cf;
    L_0x02a7:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (defpackage.bir) r4;
        r4.f = r2;
        r5 = r4.a;
        if (r5 != 0) goto L_0x02cc;
    L_0x02b7:
        r5 = r4.c;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 == 0) goto L_0x02be;
    L_0x02bd:
        goto L_0x02cc;
    L_0x02be:
        r3 = r0.a(r3);
        if (r3 == 0) goto L_0x02cc;
    L_0x02c4:
        r5 = r3.d;
        r4.c = r5;
        r3 = r3.b;
        r4.e = r3;
    L_0x02cc:
        r2 = r2 + 1;
        goto L_0x02a5;
    L_0x02cf:
        r18.f();
        r1 = r18.hasFocus();
        if (r1 == 0) goto L_0x031d;
    L_0x02d8:
        r1 = r18.findFocus();
        if (r1 != 0) goto L_0x02e0;
    L_0x02de:
        r3 = 0;
        goto L_0x02f2;
    L_0x02e0:
        r2 = r1.getParent();
        if (r2 == r0) goto L_0x02ee;
    L_0x02e6:
        r1 = r2 instanceof android.view.View;
        if (r1 == 0) goto L_0x02de;
    L_0x02ea:
        r1 = r2;
        r1 = (android.view.View) r1;
        goto L_0x02e0;
    L_0x02ee:
        r3 = r0.a(r1);
    L_0x02f2:
        if (r3 == 0) goto L_0x02fa;
    L_0x02f4:
        r1 = r3.b;
        r2 = r0.c;
        if (r1 == r2) goto L_0x031d;
    L_0x02fa:
        r1 = 0;
    L_0x02fb:
        r2 = r18.getChildCount();
        if (r1 >= r2) goto L_0x031d;
    L_0x0301:
        r2 = r0.getChildAt(r1);
        r3 = r0.a(r2);
        if (r3 != 0) goto L_0x030c;
    L_0x030b:
        goto L_0x031a;
    L_0x030c:
        r3 = r3.b;
        r4 = r0.c;
        if (r3 != r4) goto L_0x031a;
    L_0x0312:
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 == 0) goto L_0x031a;
    L_0x0319:
        goto L_0x031d;
    L_0x031a:
        r1 = r1 + 1;
        goto L_0x02fb;
    L_0x031d:
        return;
    L_0x031e:
        if (r11 != 0) goto L_0x0321;
    L_0x0320:
        goto L_0x0337;
    L_0x0321:
        r5 = r11.b;
        if (r14 != r5) goto L_0x0337;
    L_0x0325:
        r5 = r11.d;
        r7 = r7 + r5;
        r15 = r15 + -1;
        if (r15 < 0) goto L_0x0335;
    L_0x032c:
        r5 = r0.m;
        r5 = r5.get(r15);
        r5 = (defpackage.bis) r5;
        goto L_0x034c;
    L_0x0335:
        r11 = 0;
        goto L_0x034d;
    L_0x0337:
        r5 = r15 + 1;
        r5 = r0.a(r14, r5);
        r5 = r5.d;
        r7 = r7 + r5;
        r10 = r10 + 1;
        if (r15 < 0) goto L_0x00d5;
    L_0x0344:
        r5 = r0.m;
        r5 = r5.get(r15);
        r5 = (defpackage.bis) r5;
    L_0x034c:
        r11 = r5;
    L_0x034d:
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00a2;
    L_0x0352:
        r1 = r18.getResources();	 Catch:{ NotFoundException -> 0x035f }
        r2 = r18.getId();	 Catch:{ NotFoundException -> 0x035f }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x035f }
        goto L_0x0367;
    L_0x035f:
        r1 = r18.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x0367:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.append(r4);
        r4 = r0.j;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r18.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.b;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x03aa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):void");
    }

    private final void f() {
        if (this.i != 0) {
            ArrayList arrayList = this.W;
            if (arrayList == null) {
                this.W = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.W.add(getChildAt(i));
            }
            Collections.sort(this.W, aa);
        }
    }

    public final Parcelable onSaveInstanceState() {
        bix bix = new bix(super.onSaveInstanceState());
        bix.a = this.c;
        bik bik = this.b;
        if (bik != null) {
            bix.b = bik.b();
        }
        return bix;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof bix) {
            bix bix = (bix) parcelable;
            super.onRestoreInstanceState(bix.g);
            bik bik = this.b;
            if (bik != null) {
                bik.a(bix.b, bix.c);
                a(bix.a, false, true);
                return;
            }
            this.p = bix.a;
            this.q = bix.b;
            this.r = bix.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        bir bir = (bir) layoutParams;
        int i2 = bir.a | (view.getClass().getAnnotation(bip.class) != null ? 1 : 0);
        bir.a = i2;
        if (!this.x) {
            super.addView(view, i, layoutParams);
        } else if (i2 == 0) {
            bir.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private final bis a(View view) {
        for (int i = 0; i < this.m.size(); i++) {
            bis bis = (bis) this.m.get(i);
            if (this.b.a(view, bis.a)) {
                return bis;
            }
        }
        return null;
    }

    private final bis d(int i) {
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            bis bis = (bis) this.m.get(i2);
            if (bis.b == i) {
                return bis;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    public final void onMeasure(int r17, int r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = 0;
        r2 = r17;
        r2 = getDefaultSize(r1, r2);
        r3 = r18;
        r3 = getDefaultSize(r1, r3);
        r0.setMeasuredDimension(r2, r3);
        r2 = r16.getMeasuredWidth();
        r3 = r2 / 10;
        r4 = r0.C;
        r3 = java.lang.Math.min(r3, r4);
        r0.D = r3;
        r3 = r16.getPaddingLeft();
        r2 = r2 - r3;
        r3 = r16.getPaddingRight();
        r2 = r2 - r3;
        r3 = r16.getMeasuredHeight();
        r4 = r16.getPaddingTop();
        r3 = r3 - r4;
        r4 = r16.getPaddingBottom();
        r3 = r3 - r4;
        r4 = r16.getChildCount();
        r5 = r3;
        r3 = r2;
        r2 = 0;
    L_0x003f:
        r6 = 8;
        r7 = 1;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 >= r4) goto L_0x00c7;
    L_0x0046:
        r9 = r0.getChildAt(r2);
        r10 = r9.getVisibility();
        if (r10 == r6) goto L_0x00c2;
    L_0x0050:
        r6 = r9.getLayoutParams();
        r6 = (defpackage.bir) r6;
        if (r6 != 0) goto L_0x005a;
    L_0x0058:
        goto L_0x00c2;
    L_0x005a:
        r10 = r6.a;
        if (r10 == 0) goto L_0x00c2;
    L_0x005e:
        r10 = r6.b;
        r11 = r10 & 7;
        r10 = r10 & 112;
        r12 = 48;
        if (r10 == r12) goto L_0x006f;
    L_0x0068:
        r12 = 80;
        if (r10 != r12) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r10 = 0;
        goto L_0x0070;
    L_0x006f:
        r10 = 1;
    L_0x0070:
        r12 = 3;
        if (r11 == r12) goto L_0x0078;
    L_0x0073:
        r12 = 5;
        if (r11 != r12) goto L_0x0077;
    L_0x0076:
        goto L_0x0078;
    L_0x0077:
        r7 = 0;
    L_0x0078:
        r11 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r10 == 0) goto L_0x0081;
    L_0x007c:
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x007e:
        r12 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x0086;
    L_0x0081:
        if (r7 != 0) goto L_0x0084;
    L_0x0083:
        goto L_0x007e;
    L_0x0084:
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0086:
        r13 = r6.width;
        r14 = -1;
        r15 = -2;
        if (r13 != r15) goto L_0x008f;
    L_0x008c:
        r13 = r11;
        r11 = r3;
        goto L_0x0099;
    L_0x008f:
        r11 = r6.width;
        if (r11 == r14) goto L_0x0096;
    L_0x0093:
        r11 = r6.width;
        goto L_0x0097;
    L_0x0096:
        r11 = r3;
    L_0x0097:
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0099:
        r1 = r6.height;
        if (r1 != r15) goto L_0x00a0;
    L_0x009d:
        r1 = r5;
        r8 = r12;
        goto L_0x00a8;
    L_0x00a0:
        r1 = r6.height;
        if (r1 == r14) goto L_0x00a7;
    L_0x00a4:
        r1 = r6.height;
        goto L_0x00a8;
    L_0x00a7:
        r1 = r5;
    L_0x00a8:
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r13);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
        r9.measure(r6, r1);
        if (r10 == 0) goto L_0x00bb;
    L_0x00b5:
        r1 = r9.getMeasuredHeight();
        r5 = r5 - r1;
        goto L_0x00c2;
    L_0x00bb:
        if (r7 == 0) goto L_0x00c2;
    L_0x00bd:
        r1 = r9.getMeasuredWidth();
        r3 = r3 - r1;
    L_0x00c2:
        r2 = r2 + 1;
        r1 = 0;
        goto L_0x003f;
    L_0x00c7:
        android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8);
        r0.x = r7;
        r16.c();
        r2 = 0;
        r0.x = r2;
        r4 = r16.getChildCount();
    L_0x00da:
        if (r2 >= r4) goto L_0x0103;
    L_0x00dc:
        r5 = r0.getChildAt(r2);
        r7 = r5.getVisibility();
        if (r7 == r6) goto L_0x0100;
    L_0x00e6:
        r7 = r5.getLayoutParams();
        r7 = (defpackage.bir) r7;
        if (r7 != 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00f3;
    L_0x00ef:
        r9 = r7.a;
        if (r9 != 0) goto L_0x0100;
    L_0x00f3:
        r9 = (float) r3;
        r7 = r7.c;
        r9 = r9 * r7;
        r7 = (int) r9;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8);
        r5.measure(r7, r1);
    L_0x0100:
        r2 = r2 + 1;
        goto L_0x00da;
    L_0x0103:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 <= 0 || this.m.isEmpty()) {
                bis d = d(this.c);
                i = (int) ((d != null ? Math.min(d.e, this.w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
                if (i != getScrollX()) {
                    a(false);
                    scrollTo(i, getScrollY());
                }
            } else if (this.s.isFinished()) {
                i2 = getPaddingLeft();
                i4 = getPaddingRight();
                scrollTo((int) ((((float) getScrollX()) / ((float) ((i3 - getPaddingLeft()) - getPaddingRight()))) * ((float) ((i - i2) - i4))), getScrollY());
            } else {
                this.s.setFinalX(a() * e());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        boolean z2 = false;
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        paddingLeft = 0;
        while (paddingLeft < childCount) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                bir bir = (bir) childAt.getLayoutParams();
                if (bir.a) {
                    int i9 = bir.b;
                    int i10 = i9 & 112;
                    i9 &= 7;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
            paddingLeft++;
            z2 = false;
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                bir bir2 = (bir) childAt2.getLayoutParams();
                if (!bir2.a) {
                    bis a = a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        int i11 = ((int) (a.e * f)) + paddingTop;
                        if (bir2.d) {
                            bir2.d = z2;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * bir2.c), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        this.U = i8;
        if (this.S) {
            a(this.c, z2, (int) z2, z2);
        }
        this.S = z2;
    }

    public final void computeScroll() {
        this.t = true;
        if (this.s.isFinished() || !this.s.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.s.getCurrX();
        int currY = this.s.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!e(currX)) {
                this.s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        abe.e(this);
    }

    private final boolean e(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.m.size() != 0) {
            bis i2 = i();
            float e = (float) e();
            int i3 = i2.b;
            float f = ((((float) i) / e) - i2.e) / (i2.d + (0.0f / e));
            this.T = false;
            a(i3, f, (int) (e * f));
            if (this.T) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.S) {
            return false;
        } else {
            this.T = false;
            a(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    private final void a(int r13, float r14, int r15) {
        /*
        r12 = this;
        r0 = r12.U;
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x006b;
    L_0x0006:
        r0 = r12.getScrollX();
        r3 = r12.getPaddingLeft();
        r4 = r12.getPaddingRight();
        r5 = r12.getWidth();
        r6 = r12.getChildCount();
        r7 = r3;
        r3 = 0;
    L_0x001c:
        if (r3 >= r6) goto L_0x006b;
    L_0x001e:
        r8 = r12.getChildAt(r3);
        r9 = r8.getLayoutParams();
        r9 = (defpackage.bir) r9;
        r10 = r9.a;
        if (r10 == 0) goto L_0x0068;
    L_0x002c:
        r9 = r9.b;
        r9 = r9 & 7;
        if (r9 == r2) goto L_0x004d;
    L_0x0032:
        r10 = 3;
        if (r9 == r10) goto L_0x0047;
    L_0x0035:
        r10 = 5;
        if (r9 == r10) goto L_0x003a;
    L_0x0038:
        r9 = r7;
        goto L_0x005c;
    L_0x003a:
        r9 = r5 - r4;
        r10 = r8.getMeasuredWidth();
        r9 = r9 - r10;
        r10 = r8.getMeasuredWidth();
        r4 = r4 + r10;
        goto L_0x0059;
    L_0x0047:
        r9 = r8.getWidth();
        r9 = r9 + r7;
        goto L_0x005c;
    L_0x004d:
        r9 = r8.getMeasuredWidth();
        r9 = r5 - r9;
        r9 = r9 / 2;
        r9 = java.lang.Math.max(r9, r7);
    L_0x0059:
        r11 = r9;
        r9 = r7;
        r7 = r11;
    L_0x005c:
        r7 = r7 + r0;
        r10 = r8.getLeft();
        r7 = r7 - r10;
        if (r7 == 0) goto L_0x0067;
    L_0x0064:
        r8.offsetLeftAndRight(r7);
    L_0x0067:
        r7 = r9;
    L_0x0068:
        r3 = r3 + 1;
        goto L_0x001c;
    L_0x006b:
        r0 = r12.e;
        if (r0 == 0) goto L_0x0072;
    L_0x006f:
        r0.a(r13, r14, r15);
    L_0x0072:
        r0 = r12.V;
        if (r0 == 0) goto L_0x008e;
    L_0x0076:
        r0 = r0.size();
        r3 = 0;
    L_0x007b:
        if (r3 >= r0) goto L_0x008e;
    L_0x007d:
        r4 = r12.V;
        r4 = r4.get(r3);
        r4 = (defpackage.biw) r4;
        if (r4 != 0) goto L_0x0088;
    L_0x0087:
        goto L_0x008b;
    L_0x0088:
        r4.a(r13, r14, r15);
    L_0x008b:
        r3 = r3 + 1;
        goto L_0x007b;
    L_0x008e:
        r13 = r12.g;
        if (r13 == 0) goto L_0x00be;
    L_0x0092:
        r13 = r12.getScrollX();
        r14 = r12.getChildCount();
    L_0x009a:
        if (r1 >= r14) goto L_0x00be;
    L_0x009c:
        r15 = r12.getChildAt(r1);
        r0 = r15.getLayoutParams();
        r0 = (defpackage.bir) r0;
        r0 = r0.a;
        if (r0 != 0) goto L_0x00bb;
    L_0x00aa:
        r0 = r15.getLeft();
        r3 = r12.e();
        r4 = r12.g;
        r0 = r0 - r13;
        r0 = (float) r0;
        r3 = (float) r3;
        r0 = r0 / r3;
        r4.a(r15, r0);
    L_0x00bb:
        r1 = r1 + 1;
        goto L_0x009a;
    L_0x00be:
        r12.T = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int, float, int):void");
    }

    private final void f(int i) {
        biw biw = this.e;
        if (biw != null) {
            biw.b(i);
        }
        List list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                biw biw2 = (biw) this.V.get(i2);
                if (biw2 != null) {
                    biw2.b(i);
                }
            }
        }
    }

    private final void a(boolean z) {
        Object obj = this.ac == 2 ? 1 : null;
        if (obj != null) {
            b(false);
            if ((this.s.isFinished() ^ 1) != 0) {
                this.s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.s.getCurrX();
                int currY = this.s.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (scrollX != currX) {
                        e(currX);
                    }
                }
            }
        }
        this.z = false;
        Object obj2 = obj;
        for (int i = 0; i < this.m.size(); i++) {
            bis bis = (bis) this.m.get(i);
            if (bis.c) {
                bis.c = false;
                obj2 = 1;
            }
        }
        if (obj2 == null) {
            return;
        }
        if (z) {
            abe.a((View) this, this.ab);
        } else {
            this.ab.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        float x;
        if (action == 0) {
            x = motionEvent.getX();
            this.I = x;
            this.G = x;
            x = motionEvent.getY();
            this.J = x;
            this.H = x;
            this.K = motionEvent2.getPointerId(0);
            this.B = false;
            this.t = true;
            this.s.computeScrollOffset();
            if (this.ac != 2 || Math.abs(this.s.getFinalX() - this.s.getCurrX()) <= this.P) {
                a(false);
                this.A = false;
            } else {
                this.s.abortAnimation();
                this.z = false;
                c();
                this.A = true;
                h();
                a(1);
            }
        } else if (action == 2) {
            action = this.K;
            if (action != -1) {
                action = motionEvent2.findPointerIndex(action);
                float x2 = motionEvent2.getX(action);
                float f = x2 - this.G;
                float abs = Math.abs(f);
                float y = motionEvent2.getY(action);
                float abs2 = Math.abs(y - this.J);
                if (f != 0.0f) {
                    x = this.G;
                    if (this.F || ((x >= ((float) this.D) || f <= 0.0f) && (x <= ((float) (getWidth() - this.D)) || f >= 0.0f))) {
                        if (a(this, false, (int) f, (int) x2, (int) y)) {
                            this.G = x2;
                            this.H = y;
                            this.B = true;
                            return false;
                        }
                    }
                }
                x = (float) this.E;
                if (abs > x && abs * 0.5f > abs2) {
                    this.A = true;
                    h();
                    a(1);
                    this.G = f <= 0.0f ? this.I - ((float) this.E) : this.I + ((float) this.E);
                    this.H = y;
                    b(true);
                } else if (abs2 > x) {
                    this.B = true;
                }
                if (this.A && a(x2)) {
                    abe.e(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent2);
        return this.A;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        bik bik = this.b;
        if (bik == null || bik.c() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        float y;
        if (action != 0) {
            boolean g;
            float abs;
            if (action != 1) {
                if (action == 2) {
                    if (!this.A) {
                        action = motionEvent.findPointerIndex(this.K);
                        if (action == -1) {
                            g = g();
                        } else {
                            float x = motionEvent.getX(action);
                            float abs2 = Math.abs(x - this.G);
                            y = motionEvent.getY(action);
                            abs = Math.abs(y - this.H);
                            if (abs2 > ((float) this.E) && abs2 > abs) {
                                this.A = true;
                                h();
                                abs2 = this.I;
                                this.G = x - abs2 <= 0.0f ? abs2 - ((float) this.E) : abs2 + ((float) this.E);
                                this.H = y;
                                a(1);
                                b(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.A) {
                        g = a(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        action = motionEvent.getActionIndex();
                        this.G = motionEvent.getX(action);
                        this.K = motionEvent.getPointerId(action);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                    }
                } else if (this.A) {
                    a(this.c, true, 0, false);
                    g = g();
                }
            } else if (this.A) {
                VelocityTracker velocityTracker = this.L;
                velocityTracker.computeCurrentVelocity(1000, (float) this.N);
                action = (int) velocityTracker.getXVelocity(this.K);
                this.z = true;
                int e = e();
                int scrollX = getScrollX();
                bis i = i();
                abs = (float) e;
                int i2 = i.b;
                float f = ((((float) scrollX) / abs) - i.e) / (i.d + (0.0f / abs));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)) <= this.O || Math.abs(action) <= this.M) {
                    i2 += (int) (f + (i2 >= this.c ? 0.4f : 0.6f));
                } else if (action <= 0) {
                    i2++;
                }
                if (this.m.size() > 0) {
                    bis bis = (bis) this.m.get(0);
                    ArrayList arrayList = this.m;
                    i2 = Math.max(bis.b, Math.min(i2, ((bis) arrayList.get(arrayList.size() - 1)).b));
                }
                a(i2, true, true, action);
                g = g();
            }
            if (g) {
                abe.e(this);
            }
        } else {
            this.s.abortAnimation();
            this.z = false;
            c();
            y = motionEvent.getX();
            this.I = y;
            this.G = y;
            y = motionEvent.getY();
            this.J = y;
            this.H = y;
            this.K = motionEvent.getPointerId(0);
        }
        return true;
    }

    private final boolean g() {
        this.K = -1;
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        this.Q.onRelease();
        this.R.onRelease();
        if (this.Q.isFinished() || this.R.isFinished()) {
            return true;
        }
        return false;
    }

    private final void h() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final boolean a(float f) {
        Object obj;
        Object obj2;
        float f2 = this.G;
        this.G = f;
        float scrollX = ((float) getScrollX()) + (f2 - f);
        f = (float) e();
        f2 = this.v * f;
        float f3 = this.w * f;
        boolean z = false;
        bis bis = (bis) this.m.get(0);
        ArrayList arrayList = this.m;
        bis bis2 = (bis) arrayList.get(arrayList.size() - 1);
        if (bis.b != 0) {
            f2 = bis.e * f;
            obj = null;
        } else {
            obj = 1;
        }
        if (bis2.b != this.b.c() - 1) {
            f3 = bis2.e * f;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (scrollX >= f2) {
            if (scrollX <= f3) {
                f2 = scrollX;
            } else {
                if (obj2 != null) {
                    this.R.onPull(Math.abs(scrollX - f3) / f);
                    z = true;
                }
                f2 = f3;
            }
        } else if (obj != null) {
            this.Q.onPull(Math.abs(f2 - scrollX) / f);
            z = true;
        }
        int i = (int) f2;
        this.G += f2 - ((float) i);
        scrollTo(i, getScrollY());
        e(i);
        return z;
    }

    private final bis i() {
        int e = e();
        float scrollX = e > 0 ? ((float) getScrollX()) / ((float) e) : 0.0f;
        float f = e > 0 ? 0.0f / ((float) e) : 0.0f;
        bis bis = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.m.size()) {
            bis bis2 = (bis) this.m.get(i);
            if (obj == null) {
                i2++;
                if (bis2.b != i2) {
                    bis2 = this.n;
                    bis2.e = (f2 + f3) + f;
                    bis2.b = i2;
                    bis2.d = 1.0f;
                    i--;
                }
            }
            f2 = bis2.e;
            float f4 = (bis2.d + f2) + f;
            if (obj == null && scrollX < f2) {
                return bis;
            }
            if (scrollX < f4 || i == this.m.size() - 1) {
                return bis2;
            }
            i2 = bis2.b;
            f3 = bis2.d;
            i++;
            bis = bis2;
            obj = null;
        }
        return bis;
    }

    /* JADX WARNING: Missing block: B:7:0x0017, code skipped:
            if (r0.c() > 1) goto L_0x0019;
     */
    public final void draw(android.graphics.Canvas r10) {
        /*
        r9 = this;
        super.draw(r10);
        r0 = r9.getOverScrollMode();
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0019;
    L_0x000a:
        r1 = 1;
        if (r0 == r1) goto L_0x000f;
    L_0x000d:
        goto L_0x00a5;
    L_0x000f:
        r0 = r9.b;
        if (r0 == 0) goto L_0x00a5;
    L_0x0013:
        r0 = r0.c();
        if (r0 <= r1) goto L_0x00a5;
    L_0x0019:
        r0 = r9.Q;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x005a;
    L_0x0021:
        r0 = r10.save();
        r1 = r9.getHeight();
        r2 = r9.getPaddingTop();
        r1 = r1 - r2;
        r2 = r9.getPaddingBottom();
        r1 = r1 - r2;
        r2 = r9.getWidth();
        r3 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r10.rotate(r3);
        r3 = -r1;
        r4 = r9.getPaddingTop();
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = r9.v;
        r5 = (float) r2;
        r4 = r4 * r5;
        r10.translate(r3, r4);
        r3 = r9.Q;
        r3.setSize(r1, r2);
        r1 = r9.Q;
        r1 = r1.draw(r10);
        r10.restoreToCount(r0);
        goto L_0x005b;
    L_0x005a:
        r1 = 0;
    L_0x005b:
        r0 = r9.R;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x009f;
    L_0x0063:
        r0 = r10.save();
        r2 = r9.getWidth();
        r3 = r9.getHeight();
        r4 = r9.getPaddingTop();
        r5 = r9.getPaddingBottom();
        r6 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r10.rotate(r6);
        r6 = r9.getPaddingTop();
        r6 = -r6;
        r6 = (float) r6;
        r7 = r9.w;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = r7 + r8;
        r7 = -r7;
        r8 = (float) r2;
        r7 = r7 * r8;
        r10.translate(r6, r7);
        r6 = r9.R;
        r3 = r3 - r4;
        r3 = r3 - r5;
        r6.setSize(r3, r2);
        r2 = r9.R;
        r2 = r2.draw(r10);
        r1 = r1 | r2;
        r10.restoreToCount(r0);
    L_0x009f:
        if (r1 == 0) goto L_0x00a4;
    L_0x00a1:
        defpackage.abe.e(r9);
    L_0x00a4:
        return;
    L_0x00a5:
        r10 = r9.Q;
        r10.finish();
        r10 = r9.R;
        r10.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    private final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(actionIndex);
            this.K = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void b(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.b != null) {
            int e = e();
            int scrollX = getScrollX();
            if (i < 0) {
                if (scrollX > ((int) (((float) e) * this.v))) {
                    return true;
                }
                return false;
            } else if (i <= 0 || scrollX >= ((int) (((float) e) * this.w))) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private final boolean a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft()) {
                    if (i4 < childAt.getRight()) {
                        int i5 = i3 + scrollY;
                        if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                            if (a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:24:0x0058, code skipped:
            if (r5 != false) goto L_0x005d;
     */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r0 = super.dispatchKeyEvent(r5);
        r1 = 1;
        if (r0 != 0) goto L_0x005d;
    L_0x0007:
        r0 = r5.getAction();
        if (r0 != 0) goto L_0x005b;
    L_0x000d:
        r0 = r5.getKeyCode();
        r2 = 21;
        r3 = 2;
        if (r0 == r2) goto L_0x0047;
    L_0x0016:
        r2 = 22;
        if (r0 == r2) goto L_0x0035;
    L_0x001a:
        r2 = 61;
        if (r0 == r2) goto L_0x001f;
    L_0x001e:
        goto L_0x005b;
    L_0x001f:
        r0 = r5.hasNoModifiers();
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r5 = r4.g(r3);
        goto L_0x0058;
    L_0x002a:
        r5 = r5.hasModifiers(r1);
        if (r5 == 0) goto L_0x005b;
    L_0x0030:
        r5 = r4.g(r1);
        goto L_0x0058;
    L_0x0035:
        r5 = r5.hasModifiers(r3);
        if (r5 == 0) goto L_0x0040;
    L_0x003b:
        r5 = r4.k();
        goto L_0x0058;
    L_0x0040:
        r5 = 66;
        r5 = r4.g(r5);
        goto L_0x0058;
    L_0x0047:
        r5 = r5.hasModifiers(r3);
        if (r5 == 0) goto L_0x0052;
    L_0x004d:
        r5 = r4.j();
        goto L_0x0058;
    L_0x0052:
        r5 = 17;
        r5 = r4.g(r5);
    L_0x0058:
        if (r5 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005d;
    L_0x005b:
        r5 = 0;
        return r5;
    L_0x005d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    private final boolean g(int i) {
        View findFocus = findFocus();
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewPager parent = findFocus.getParent();
                while (parent instanceof ViewGroup) {
                    if (parent != this) {
                        parent = parent.getParent();
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(findFocus.getClass().getSimpleName());
                for (Object parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    stringBuilder.append(" => ");
                    stringBuilder.append(parent2.getClass().getSimpleName());
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                stringBuilder2.append(stringBuilder.toString());
                Log.e("ViewPager", stringBuilder2.toString());
            }
            view = findFocus;
            break;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        boolean z = false;
        if (findFocus == null || findFocus == view) {
            if (i == 17 || i == 1) {
                z = j();
            } else if (i == 66 || i == 2) {
                z = k();
            }
        } else if (i == 17) {
            z = (view != null && a(this.o, findFocus).left >= a(this.o, view).left) ? j() : findFocus.requestFocus();
        } else if (i == 66) {
            z = (view != null && a(this.o, findFocus).left <= a(this.o, view).left) ? k() : findFocus.requestFocus();
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    private final Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewPager parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
            return rect;
        }
        rect.set(0, 0, 0, 0);
        return rect;
    }

    private final boolean j() {
        int i = this.c;
        if (i <= 0) {
            return false;
        }
        a(i - 1, true);
        return true;
    }

    private final boolean k() {
        bik bik = this.b;
        if (bik == null || this.c >= bik.c() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    /* JADX WARNING: Missing block: B:16:0x0039, code skipped:
            if (r0 != r7.size()) goto L_0x0056;
     */
    public final void addFocusables(java.util.ArrayList r7, int r8, int r9) {
        /*
        r6 = this;
        r0 = r7.size();
        r1 = r6.getDescendantFocusability();
        r2 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r1 != r2) goto L_0x000d;
    L_0x000c:
        goto L_0x003b;
    L_0x000d:
        r2 = 0;
    L_0x000e:
        r3 = r6.getChildCount();
        if (r2 >= r3) goto L_0x0031;
    L_0x0014:
        r3 = r6.getChildAt(r2);
        r4 = r3.getVisibility();
        if (r4 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x002e;
    L_0x001f:
        r4 = r6.a(r3);
        if (r4 == 0) goto L_0x002e;
    L_0x0025:
        r4 = r4.b;
        r5 = r6.c;
        if (r4 != r5) goto L_0x002e;
    L_0x002b:
        r3.addFocusables(r7, r8, r9);
    L_0x002e:
        r2 = r2 + 1;
        goto L_0x000e;
    L_0x0031:
        r8 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        if (r1 != r8) goto L_0x003b;
    L_0x0035:
        r8 = r7.size();
        if (r0 != r8) goto L_0x0056;
    L_0x003b:
        r8 = r6.isFocusable();
        if (r8 == 0) goto L_0x0056;
    L_0x0041:
        r8 = 1;
        r9 = r9 & r8;
        if (r9 != r8) goto L_0x0053;
    L_0x0045:
        r8 = r6.isInTouchMode();
        if (r8 == 0) goto L_0x0053;
    L_0x004b:
        r8 = r6.isFocusableInTouchMode();
        if (r8 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0053;
    L_0x0052:
        return;
    L_0x0053:
        r7.add(r6);
    L_0x0056:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.addFocusables(java.util.ArrayList, int, int):void");
    }

    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bis a = a(childAt);
                if (a != null && a.b == this.c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) == 0) {
            childCount--;
            i2 = -1;
        } else {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                bis a = a(childAt);
                if (a != null && a.b == this.c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bis a = a(childAt);
                if (a != null && a.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new bir();
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof bir) && super.checkLayoutParams(layoutParams);
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bir(getContext(), attributeSet);
    }
}
