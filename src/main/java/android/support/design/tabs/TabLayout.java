package android.support.design.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.youtube.R;
import defpackage.aaa;
import defpackage.aab;
import defpackage.abe;
import defpackage.afy;
import defpackage.aocf;
import defpackage.bik;
import defpackage.bip;
import defpackage.biw;
import defpackage.dq;
import defpackage.hc;
import defpackage.hd;
import defpackage.hl;
import defpackage.hu;
import defpackage.jr;
import defpackage.jt;
import defpackage.ju;
import defpackage.jv;
import defpackage.jw;
import defpackage.jx;
import defpackage.jz;
import defpackage.ka;
import defpackage.kc;
import defpackage.kd;
import defpackage.kf;
import defpackage.zy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@bip
public class TabLayout extends HorizontalScrollView {
    private static final zy w = new aaa(16);
    private final int A;
    private final int B;
    private final int C;
    private int D;
    private int E;
    private final ArrayList F;
    private jx G;
    private ValueAnimator H;
    private bik I;
    private DataSetObserver J;
    private kd K;
    private ju L;
    private boolean M;
    private final zy N;
    public final RectF a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ColorStateList g;
    public ColorStateList h;
    public ColorStateList i;
    public Drawable j;
    public Mode k;
    public float l;
    public float m;
    public final int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ViewPager v;
    private final ArrayList x;
    private ka y;
    private final jz z;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = new ArrayList();
        this.a = new RectF();
        this.o = Integer.MAX_VALUE;
        this.F = new ArrayList();
        HashMap hashMap = new HashMap();
        this.N = new aab(12);
        setHorizontalScrollBarEnabled(false);
        this.z = new jz(this, context);
        super.addView(this.z, 0, new LayoutParams(-2, -1));
        TypedArray a = hd.a(context, attributeSet, jr.a, i, R.style.f671Widget.Design.TabLayout, jr.x);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            Drawable huVar = new hu();
            huVar.a(ColorStateList.valueOf(colorDrawable.getColor()));
            huVar.a(context);
            huVar.b(abe.q(this));
            abe.a((View) this, huVar);
        }
        jz jzVar = this.z;
        int dimensionPixelSize = a.getDimensionPixelSize(jr.l, -1);
        if (jzVar.a != dimensionPixelSize) {
            jzVar.a = dimensionPixelSize;
            abe.e(jzVar);
        }
        jzVar = this.z;
        dimensionPixelSize = a.getColor(jr.i, 0);
        if (jzVar.b.getColor() != dimensionPixelSize) {
            jzVar.b.setColor(dimensionPixelSize);
            abe.e(jzVar);
        }
        Drawable b = hl.b(context, a, jr.g);
        if (this.j != b) {
            this.j = b;
            abe.e(this.z);
        }
        i = a.getInt(jr.k, 0);
        if (this.q != i) {
            this.q = i;
            abe.e(this.z);
        }
        this.t = a.getBoolean(jr.j, true);
        abe.e(this.z);
        i = a.getDimensionPixelSize(jr.q, 0);
        this.e = i;
        this.d = i;
        this.c = i;
        this.b = i;
        this.b = a.getDimensionPixelSize(jr.t, this.b);
        this.c = a.getDimensionPixelSize(jr.u, this.c);
        this.d = a.getDimensionPixelSize(jr.s, this.d);
        this.e = a.getDimensionPixelSize(jr.r, this.e);
        i = a.getResourceId(jr.x, R.style.f407TextAppearance.Design.Tab);
        this.f = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, afy.cy);
        try {
            this.l = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.g = hl.a(context, obtainStyledAttributes, 3);
            if (a.hasValue(jr.y)) {
                this.g = hl.a(context, a, jr.y);
            }
            if (a.hasValue(jr.w)) {
                i = a.getColor(15, 0);
                int defaultColor = this.g.getDefaultColor();
                r5 = new int[2][];
                int[] iArr = new int[]{SELECTED_STATE_SET, i};
                r5[1] = EMPTY_STATE_SET;
                iArr[1] = defaultColor;
                this.g = new ColorStateList(r5, iArr);
            }
            this.h = hl.a(context, a, jr.e);
            this.k = hc.a(a.getInt(jr.f, -1), null);
            this.i = hl.a(context, a, jr.v);
            this.E = a.getInt(jr.h, 300);
            this.A = a.getDimensionPixelSize(jr.o, -1);
            this.B = a.getDimensionPixelSize(jr.n, -1);
            this.n = a.getResourceId(jr.b, 0);
            this.D = a.getDimensionPixelSize(jr.c, 0);
            this.r = a.getInt(jr.p, 1);
            this.p = a.getInt(jr.d, 0);
            this.s = a.getBoolean(jr.m, false);
            this.u = a.getBoolean(jr.z, false);
            a.recycle();
            Resources resources = getResources();
            this.m = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.C = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            int i2 = this.r;
            i2 = (i2 == 0 || i2 == 2) ? Math.max(0, this.D - this.b) : 0;
            abe.a(this.z, i2, 0, 0, 0);
            i2 = this.r;
            if (i2 == 0) {
                this.z.setGravity(8388611);
            } else if (i2 == 1 || i2 == 2) {
                this.z.setGravity(1);
            }
            a(true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void b(int i) {
        a(i, 0.0f, true, true);
    }

    public final void a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.z.getChildCount()) {
            if (z2) {
                jz jzVar = this.z;
                ValueAnimator valueAnimator = jzVar.e;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    jzVar.e.cancel();
                }
                jzVar.c = i;
                jzVar.d = f;
                jzVar.a();
            }
            ValueAnimator valueAnimator2 = this.H;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.H.cancel();
            }
            scrollTo(a(i, f), 0);
            if (z) {
                d(round);
            }
        }
    }

    public final void a(ka kaVar) {
        b(kaVar, this.x.isEmpty());
    }

    private final void b(ka kaVar, boolean z) {
        int size = this.x.size();
        if (kaVar.h == this) {
            kaVar.e = size;
            this.x.add(size, kaVar);
            int size2 = this.x.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((ka) this.x.get(size)).e = size;
            }
            kc kcVar = kaVar.i;
            kcVar.setSelected(false);
            kcVar.setActivated(false);
            jz jzVar = this.z;
            int i = kaVar.e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            a(layoutParams);
            jzVar.addView(kcVar, i, layoutParams);
            if (z) {
                kaVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void a(jx jxVar) {
        if (!this.F.contains(jxVar)) {
            this.F.add(jxVar);
        }
    }

    public final ka a() {
        ka kaVar = (ka) w.a();
        if (kaVar == null) {
            kaVar = new ka();
        }
        kaVar.h = this;
        zy zyVar = this.N;
        kc kcVar = zyVar != null ? (kc) zyVar.a() : null;
        if (kcVar == null) {
            kcVar = new kc(this, getContext());
        }
        kcVar.a(kaVar);
        kcVar.setFocusable(true);
        kcVar.setMinimumWidth(f());
        if (TextUtils.isEmpty(kaVar.d)) {
            kcVar.setContentDescription(kaVar.c);
        } else {
            kcVar.setContentDescription(kaVar.d);
        }
        kaVar.i = kcVar;
        return kaVar;
    }

    public final int b() {
        return this.x.size();
    }

    public final ka a(int i) {
        return (i < 0 || i >= b()) ? null : (ka) this.x.get(i);
    }

    public final int c() {
        ka kaVar = this.y;
        if (kaVar == null) {
            return -1;
        }
        return kaVar.e;
    }

    public final void d() {
        for (int childCount = this.z.getChildCount() - 1; childCount >= 0; childCount--) {
            kc kcVar = (kc) this.z.getChildAt(childCount);
            this.z.removeViewAt(childCount);
            if (kcVar != null) {
                kcVar.a(null);
                kcVar.setSelected(false);
                this.N.a(kcVar);
            }
            requestLayout();
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ka kaVar = (ka) it.next();
            it.remove();
            kaVar.h = null;
            kaVar.i = null;
            kaVar.a = null;
            kaVar.b = null;
            kaVar.c = null;
            kaVar.d = null;
            kaVar.e = -1;
            kaVar.f = null;
            w.a(kaVar);
        }
        this.y = null;
    }

    private final void a(ViewPager viewPager, boolean z) {
        biw biw;
        ju juVar;
        ViewPager viewPager2 = this.v;
        if (viewPager2 != null) {
            biw = this.K;
            if (biw != null) {
                viewPager2.c(biw);
            }
            juVar = this.L;
            if (juVar != null) {
                List list = this.v.f;
                if (list != null) {
                    list.remove(juVar);
                }
            }
        }
        jx jxVar = this.G;
        if (jxVar != null) {
            this.F.remove(jxVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.v = viewPager;
            if (this.K == null) {
                this.K = new kd(this);
            }
            biw = this.K;
            biw.b = 0;
            biw.a = 0;
            viewPager.b(biw);
            this.G = new kf(viewPager);
            a(this.G);
            bik bik = viewPager.b;
            if (bik != null) {
                a(bik, true);
            }
            if (this.L == null) {
                this.L = new ju(this);
            }
            juVar = this.L;
            juVar.a = true;
            if (viewPager.f == null) {
                viewPager.f = new ArrayList();
            }
            viewPager.f.add(juVar);
            b(viewPager.a());
        } else {
            this.v = null;
            a(null, false);
        }
        this.M = z;
    }

    public final boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.z.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.M) {
            a(null, false);
            this.M = false;
        }
    }

    public final void a(bik bik, boolean z) {
        bik bik2 = this.I;
        if (bik2 != null) {
            DataSetObserver dataSetObserver = this.J;
            if (dataSetObserver != null) {
                bik2.a.unregisterObserver(dataSetObserver);
            }
        }
        this.I = bik;
        if (z && bik != null) {
            if (this.J == null) {
                this.J = new jw(this);
            }
            bik.a.registerObserver(this.J);
        }
        e();
    }

    public final void e() {
        d();
        bik bik = this.I;
        if (bik != null) {
            int c = bik.c();
            for (int i = 0; i < c; i++) {
                ka a = a();
                CharSequence b = this.I.b(i);
                if (TextUtils.isEmpty(a.d) && !TextUtils.isEmpty(b)) {
                    a.i.setContentDescription(b);
                }
                a.c = b;
                a.b();
                b(a, false);
            }
            ViewPager viewPager = this.v;
            if (viewPager != null && c > 0) {
                c = viewPager.a();
                if (c != c() && c < b()) {
                    b(a(c));
                }
            }
        }
    }

    public final void addView(View view) {
        a(view);
    }

    public final void addView(View view, int i) {
        a(view);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private final void a(View view) {
        if (view instanceof jt) {
            jt jtVar = (jt) view;
            ka a = a();
            if (!TextUtils.isEmpty(jtVar.getContentDescription())) {
                a.a(jtVar.getContentDescription());
            }
            a(a);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void a(LinearLayout.LayoutParams layoutParams) {
        if (this.r == 1 && this.p == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        if (getBackground() instanceof hu) {
            ((hu) getBackground()).b(f);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.z.getChildCount(); i++) {
            View childAt = this.z.getChildAt(i);
            if (childAt instanceof kc) {
                kc kcVar = (kc) childAt;
                Drawable drawable = kcVar.d;
                if (drawable != null) {
                    drawable.setBounds(kcVar.getLeft(), kcVar.getTop(), kcVar.getRight(), kcVar.getBottom());
                    kcVar.d.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        Context context = getContext();
        int size = this.x.size();
        int i4 = 0;
        while (true) {
            i3 = 48;
            if (i4 >= size) {
                break;
            }
            ka kaVar = (ka) this.x.get(i4);
            if (kaVar == null || kaVar.b == null || TextUtils.isEmpty(kaVar.c)) {
                i4++;
            } else if (!this.s) {
                i3 = 72;
            }
        }
        int a = (int) ((hc.a(context, i3) + ((float) getPaddingTop())) + ((float) getPaddingBottom()));
        size = MeasureSpec.getMode(i2);
        if (size == aocf.UNSET_ENUM_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(a, MeasureSpec.getSize(i2)), 1073741824);
        } else if (size == 0) {
            i2 = MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        a = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            size = this.B;
            if (size <= 0) {
                size = (int) (((float) a) - hc.a(getContext(), 56));
            }
            this.o = size;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            size = this.r;
            if (size != 0) {
                if (size == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (size != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    private final void c(int i) {
        if (i != -1) {
            if (getWindowToken() != null && abe.D(this)) {
                jz jzVar = this.z;
                int childCount = jzVar.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (jzVar.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                if (getScrollX() != a(i, 0.0f)) {
                    if (this.H == null) {
                        this.H = new ValueAnimator();
                        this.H.setInterpolator(dq.b);
                        this.H.setDuration((long) this.E);
                        this.H.addUpdateListener(new jv(this));
                    }
                    this.H.setIntValues(new int[]{r0, childCount});
                    this.H.start();
                }
                this.z.b(i, this.E);
                return;
            }
            b(i);
        }
    }

    private final void d(int i) {
        int childCount = this.z.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.z.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void b(ka kaVar) {
        a(kaVar, true);
    }

    public final void a(ka kaVar, boolean z) {
        ka kaVar2 = this.y;
        int size;
        if (kaVar2 != kaVar) {
            int i;
            if (kaVar != null) {
                i = kaVar.e;
            } else {
                i = -1;
            }
            if (z) {
                if (!(kaVar2 == null || kaVar2.e == -1) || i == -1) {
                    c(i);
                } else {
                    b(i);
                }
                if (i != -1) {
                    d(i);
                }
            }
            this.y = kaVar;
            if (kaVar2 != null) {
                for (size = this.F.size() - 1; size >= 0; size--) {
                    ((jx) this.F.get(size)).b(kaVar2);
                }
            }
            if (kaVar != null) {
                for (size = this.F.size() - 1; size >= 0; size--) {
                    ((jx) this.F.get(size)).a(kaVar);
                }
            }
        } else if (kaVar2 != null) {
            for (size = this.F.size() - 1; size >= 0; size--) {
                ((jx) this.F.get(size)).a();
            }
            c(kaVar.e);
        }
    }

    private final int a(int i, float f) {
        int i2 = this.r;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.z.getChildAt(i);
        i++;
        View childAt2 = i < this.z.getChildCount() ? this.z.getChildAt(i) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        i = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((((float) (width + i3)) * 0.5f) * f);
        return abe.g(this) != 0 ? i - i4 : i + i4;
    }

    public final void a(boolean z) {
        for (int i = 0; i < this.z.getChildCount(); i++) {
            View childAt = this.z.getChildAt(i);
            childAt.setMinimumWidth(f());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private final int f() {
        int i = this.A;
        if (i == -1) {
            i = this.r;
            if (i != 0 && i != 2) {
                return 0;
            }
            i = this.C;
        }
        return i;
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }
}
