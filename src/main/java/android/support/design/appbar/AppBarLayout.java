package android.support.design.appbar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.aau;
import defpackage.abe;
import defpackage.abx;
import defpackage.aocf;
import defpackage.auw;
import defpackage.aux;
import defpackage.auy;
import defpackage.dq;
import defpackage.dx;
import defpackage.dy;
import defpackage.dz;
import defpackage.ea;
import defpackage.eb;
import defpackage.ec;
import defpackage.eg;
import defpackage.en;
import defpackage.eo;
import defpackage.ep;
import defpackage.es;
import defpackage.hd;
import defpackage.hu;
import defpackage.st;
import defpackage.th;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@auw(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    public boolean a;
    public int b;
    public abx c;
    public boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private List i;
    private boolean j;
    private boolean k;
    private int l;
    private WeakReference m;
    private ValueAnimator n;
    private int[] o;
    private Drawable p;

    public class BaseBehavior extends en {
        public int a;
        public eb b;
        private int d;
        private ValueAnimator e;
        private int f = -1;
        private boolean g;
        private float h;
        private WeakReference i;

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(a() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                abs = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                abs = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            if (a() == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.e.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                this.e = new ValueAnimator();
                this.e.setInterpolator(dq.e);
                this.e.addUpdateListener(new dz(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration((long) Math.min(abs, 600));
            this.e.setIntValues(new int[]{r1, i});
            this.e.start();
        }

        private final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int top;
            int bottom;
            eg egVar;
            int a = a();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                top = childAt.getTop();
                bottom = childAt.getBottom();
                egVar = (eg) childAt.getLayoutParams();
                if (a(egVar.a, 32)) {
                    top -= egVar.topMargin;
                    bottom += egVar.bottomMargin;
                }
                int i2 = -a;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                egVar = (eg) childAt2.getLayoutParams();
                top = egVar.a;
                if ((top & 17) == 17) {
                    bottom = -childAt2.getTop();
                    int i3 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i3 += appBarLayout.e();
                    }
                    if (a(top, 2)) {
                        i3 += abe.o(childAt2);
                    } else if (a(top, 5)) {
                        childCount = abe.o(childAt2) + i3;
                        if (a < childCount) {
                            bottom = childCount;
                        } else {
                            i3 = childCount;
                        }
                    }
                    if (a(top, 32)) {
                        bottom += egVar.topMargin;
                        i3 -= egVar.bottomMargin;
                    }
                    if (a < (i3 + bottom) / 2) {
                        bottom = i3;
                    }
                    a(coordinatorLayout, appBarLayout, th.a(bottom, -appBarLayout.a(), 0));
                }
            }
        }

        private static void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                childAt = appBarLayout.getChildAt(i4);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    break;
                }
            }
            childAt = null;
            if (childAt != null) {
                abs = ((eg) childAt.getLayoutParams()).a;
                boolean z2 = true;
                if ((abs & 1) != 0) {
                    childCount = abe.o(childAt);
                    if (i2 > 0) {
                    }
                }
                z2 = false;
                if (appBarLayout.d) {
                    z2 = appBarLayout.a(a(coordinatorLayout));
                }
                boolean a = appBarLayout.a(z2);
                if (VERSION.SDK_INT >= 11) {
                    if (!z) {
                        if (a) {
                            List b = coordinatorLayout.a.b(appBarLayout);
                            coordinatorLayout.b.clear();
                            if (b != null) {
                                coordinatorLayout.b.addAll(b);
                            }
                            List list = coordinatorLayout.b;
                            i = list.size();
                            while (i3 < i) {
                                aux aux = ((auy) ((View) list.get(i3)).getLayoutParams()).a;
                                if (!(aux instanceof ScrollingViewBehavior)) {
                                    i3++;
                                } else if (((ScrollingViewBehavior) aux).c == 0) {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private static View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof aau) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            return c() + this.a;
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).c();
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ boolean b() {
            eb ebVar = this.b;
            boolean z = true;
            if (ebVar != null) {
                z = ebVar.a();
            } else {
                WeakReference weakReference = this.i;
                if (weakReference != null) {
                    View view = (View) weakReference.get();
                    if (view == null || !view.isShown()) {
                        z = false;
                    } else if (view.canScrollVertically(-1)) {
                        return false;
                    } else {
                        return z;
                    }
                }
            }
            return z;
        }

        public final /* synthetic */ Parcelable c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable parcelable = BaseSavedState.EMPTY_STATE;
            int c = c();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c <= 0 && bottom >= 0) {
                    ea eaVar = new ea(parcelable);
                    eaVar.a = i;
                    if (bottom == abe.o(childAt) + appBarLayout.e()) {
                        z = true;
                    }
                    eaVar.c = z;
                    eaVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return eaVar;
                }
            }
            return parcelable;
        }

        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = c(coordinatorLayout, appBarLayout, i3, -appBarLayout.c(), 0);
            }
        }

        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i == 1) {
                a(coordinatorLayout, appBarLayout);
                if (appBarLayout.d) {
                    appBarLayout.a(appBarLayout.a(view2));
                }
            }
            this.i = new WeakReference(view2);
        }

        public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            view = (AppBarLayout) view;
            if (((auy) view.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }
    }

    public class ScrollingViewBehavior extends ep {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eo.G);
            this.c = obtainStyledAttributes.getDimensionPixelSize(eo.H, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            aux aux = ((auy) view2.getLayoutParams()).a;
            if (aux instanceof BaseBehavior) {
                abe.d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aux).a) + this.b) - e(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.d) {
                    appBarLayout.a(appBarLayout.a(view));
                }
            }
            return false;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = b(coordinatorLayout.b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.a(false, z ^ 1);
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final float b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int a = appBarLayout.a();
                int b = appBarLayout.b();
                aux aux = ((auy) appBarLayout.getLayoutParams()).a;
                int a2 = aux instanceof BaseBehavior ? ((BaseBehavior) aux).a() : 0;
                if (b != 0 && a + a2 <= b) {
                    return 0.0f;
                }
                a -= b;
                if (a != 0) {
                    return (((float) a2) / ((float) a)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: final */
        public final int d(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).a();
            }
            return view.getMeasuredHeight();
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4 = view.getLayoutParams().height;
            if (i4 != -1 && i4 != -2) {
                return false;
            }
            View a = a(coordinatorLayout.b(view));
            if (a == null) {
                return false;
            }
            i3 = MeasureSpec.getSize(i3);
            if (i3 <= 0) {
                i3 = coordinatorLayout.getHeight();
            } else if (abe.v(a)) {
                abx abx = coordinatorLayout.c;
                if (abx != null) {
                    i3 += abx.b() + abx.d();
                }
            }
            coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec((i3 + d(a)) - a.getMeasuredHeight(), i4 == -1 ? 1073741824 : aocf.UNSET_ENUM_VALUE));
            return true;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final /* bridge */ /* synthetic */ int c() {
            return super.c();
        }

        public final /* bridge */ /* synthetic */ boolean a(int i) {
            return super.a(i);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.b = 0;
        boolean z = true;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            es.a(this);
            es.a(this, attributeSet, i);
        }
        TypedArray a = hd.a(context, attributeSet, eo.a, i, R.style.f663Widget.Design.AppBarLayout, new int[0]);
        abe.a((View) this, a.getDrawable(eo.e));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            Drawable huVar = new hu();
            huVar.a(ColorStateList.valueOf(colorDrawable.getColor()));
            huVar.a(context);
            abe.a((View) this, huVar);
        }
        if (a.hasValue(eo.i)) {
            a(a.getBoolean(eo.i, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a.hasValue(eo.h)) {
            es.a(this, (float) a.getDimensionPixelSize(eo.h, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a.hasValue(eo.f)) {
                setKeyboardNavigationCluster(a.getBoolean(eo.f, false));
            }
            if (a.hasValue(eo.g)) {
                setTouchscreenBlocksFocus(a.getBoolean(eo.g, false));
            }
        }
        this.d = a.getBoolean(eo.j, false);
        this.l = a.getResourceId(eo.k, -1);
        Drawable drawable = a.getDrawable(eo.l);
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            drawable = this.p;
            if (drawable != null) {
                if (drawable.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                st.b(this.p, abe.g(this));
                drawable = this.p;
                if (getVisibility() != 0) {
                    z = false;
                }
                drawable.setVisible(z, false);
                this.p.setCallback(this);
            }
            abe.e(this);
        }
        a.recycle();
        abe.a((View) this, new dy(this));
    }

    public final void a(ec ecVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (ecVar != null && !this.i.contains(ecVar)) {
            this.i.add(ecVar);
        }
    }

    public final void b(ec ecVar) {
        List list = this.i;
        if (list != null && ecVar != null) {
            list.remove(ecVar);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p != null && e() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.e));
            this.p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.getMode(i2);
        if (i != 1073741824 && abe.v(this) && h()) {
            int measuredHeight = getMeasuredHeight();
            if (i == aocf.UNSET_ENUM_VALUE) {
                measuredHeight = th.a(getMeasuredHeight() + e(), 0, MeasureSpec.getSize(i2));
            } else if (i == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (abe.v(this) && h()) {
            int e = e();
            i = getChildCount();
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                abe.d(getChildAt(i), e);
            }
        }
        f();
        this.a = false;
        i = getChildCount();
        i2 = 0;
        while (true) {
            z2 = true;
            if (i2 < i) {
                if (((eg) getChildAt(i2).getLayoutParams()).b != null) {
                    this.a = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (!this.d) {
            i = getChildCount();
            for (i2 = 0; i2 < i; i2++) {
                i4 = ((eg) getChildAt(i2).getLayoutParams()).a;
                if ((i4 & 1) == 1 && (i4 & 10) != 0) {
                    break;
                }
            }
            z2 = false;
        }
        if (this.j != z2) {
            this.j = z2;
            refreshDrawableState();
        }
    }

    private final void f() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }

    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (getBackground() instanceof hu) {
            ((hu) getBackground()).b(f);
        }
    }

    public final void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    private final void a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (!z ? 2 : 1) | (!z2 ? 0 : 4);
        if (z3) {
            i = 8;
        }
        this.b = i2 | i;
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof eg;
    }

    private static eg g() {
        return new eg();
    }

    private final eg a(AttributeSet attributeSet) {
        return new eg(getContext(), attributeSet);
    }

    private static eg a(LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new eg((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new eg((MarginLayoutParams) layoutParams);
        }
        return new eg(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.m = null;
    }

    public final int a() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            eg egVar = (eg) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = egVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += (measuredHeight + egVar.topMargin) + egVar.bottomMargin;
            if (i3 == 0 && abe.v(childAt)) {
                i2 -= e();
            }
            if ((i4 & 2) != 0) {
                i2 -= abe.o(childAt);
                break;
            }
        }
        i = Math.max(0, i2);
        this.f = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = getChildCount() - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            eg egVar = (eg) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = egVar.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int o;
                int i4 = egVar.topMargin + egVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    o = abe.o(childAt);
                } else if ((i3 & 2) != 0) {
                    o = measuredHeight - abe.o(childAt);
                } else {
                    i4 += measuredHeight;
                    if (i == 0 && abe.v(childAt)) {
                        i4 = Math.min(i4, measuredHeight - e());
                    }
                    i2 += i4;
                }
                i4 += o;
                i4 = Math.min(i4, measuredHeight - e());
                i2 += i4;
            }
        }
        i = Math.max(0, i2);
        this.g = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            eg egVar = (eg) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (egVar.topMargin + egVar.bottomMargin);
            int i4 = egVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i4 & 2) != 0) {
                i2 -= abe.o(childAt);
                break;
            }
        }
        i = Math.max(0, i2);
        this.h = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.e = i;
        if (!willNotDraw()) {
            abe.e(this);
        }
        List list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ec ecVar = (ec) this.i.get(i2);
                if (ecVar != null) {
                    ecVar.a(this, i);
                }
            }
        }
    }

    public final int d() {
        int e = e();
        int o = abe.o(this);
        if (o == 0) {
            o = getChildCount();
            o = o > 0 ? abe.o(getChildAt(o - 1)) : 0;
            if (o == 0) {
                return getHeight() / 3;
            }
        }
        return (o + o) + e;
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        if (this.o == null) {
            this.o = new int[4];
        }
        int[] iArr = this.o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        iArr[0] = !z ? -2130772400 : R.attr.state_liftable;
        int i2 = -2130772399;
        if (z && this.k) {
            i2 = R.attr.state_lifted;
        }
        iArr[1] = i2;
        iArr[2] = !z ? -2130772398 : R.attr.state_collapsible;
        i2 = -2130772397;
        if (z && this.k) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (this.d && (getBackground() instanceof hu)) {
            hu huVar = (hu) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = !z ? dimension : 0.0f;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.n = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.n.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.n.setInterpolator(dq.a);
            this.n.addUpdateListener(new dx(huVar));
            this.n.start();
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(View view) {
        if (this.m == null && this.l != -1) {
            Activity activity;
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
            }
            activity = null;
            Object findViewById = activity != null ? activity.findViewById(this.l) : getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).findViewById(this.l) : null;
            if (findViewById != null) {
                this.m = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        boolean z = false;
        if (view != null) {
            if (view.canScrollVertically(-1)) {
                z = true;
            } else if (view.getScrollY() <= 0) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        abx abx = this.c;
        return abx != null ? abx.b() : 0;
    }

    private final boolean h() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (!(childAt.getVisibility() == 8 || abe.v(childAt))) {
                return true;
            }
        }
        return false;
    }
}
