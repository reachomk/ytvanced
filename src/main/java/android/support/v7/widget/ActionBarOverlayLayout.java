package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.google.android.youtube.R;
import defpackage.aaw;
import defpackage.aay;
import defpackage.aaz;
import defpackage.abb;
import defpackage.abe;
import defpackage.ajm;
import defpackage.ajz;
import defpackage.aka;
import defpackage.akb;
import defpackage.akc;
import defpackage.akd;
import defpackage.ame;
import defpackage.amh;
import defpackage.aocf;

public class ActionBarOverlayLayout extends ViewGroup implements aaw, aay, aaz, ame {
    private static final int[] A = new int[]{R.attr.actionBarSize, 16842841};
    private final abb B;
    public int a;
    public ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public akd g;
    public ViewPropertyAnimator h;
    public final AnimatorListenerAdapter i;
    private int j;
    private ContentFrameLayout k;
    private amh l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private OverScroller x;
    private final Runnable y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.i = new ajz(this);
        this.y = new akb(this);
        this.z = new aka(this);
        a(context);
        this.B = new abb();
    }

    private final void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
        boolean z = false;
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.m == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.n = z;
        this.x = new OverScroller(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        abe.u(this);
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.f ^ i;
        this.f = i;
        int i3 = i & 4;
        i &= 256;
        akd akd = this.g;
        if (akd != null) {
            akd.f(i == 0);
            if (i3 == 0 || i == 0) {
                this.g.p();
            } else {
                this.g.q();
            }
        }
        if ((i2 & 256) != 0 && this.g != null) {
            abe.u(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.a = i;
        akd akd = this.g;
        if (akd != null) {
            akd.b(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        akc akc = (akc) view.getLayoutParams();
        if (akc.leftMargin != rect.left) {
            akc.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (akc.topMargin != rect.top) {
            akc.topMargin = rect.top;
            z2 = true;
        }
        if (akc.rightMargin != rect.right) {
            akc.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || akc.bottomMargin == rect.bottom) {
            return z2;
        }
        akc.bottomMargin = rect.bottom;
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:6:0x003e, code skipped:
            if (r0 != false) goto L_0x0040;
     */
    public final boolean fitSystemWindows(android.graphics.Rect r4) {
        /*
        r3 = this;
        r3.i();
        defpackage.abe.t(r3);
        r0 = r3.b;
        r1 = 0;
        r0 = a(r0, r4, r1);
        r1 = r3.t;
        r1.set(r4);
        r4 = r3.t;
        r1 = r3.q;
        defpackage.asy.a(r3, r4, r1);
        r4 = r3.u;
        r1 = r3.t;
        r4 = r4.equals(r1);
        r1 = 1;
        if (r4 != 0) goto L_0x002c;
    L_0x0024:
        r4 = r3.u;
        r0 = r3.t;
        r4.set(r0);
        r0 = 1;
    L_0x002c:
        r4 = r3.r;
        r2 = r3.q;
        r4 = r4.equals(r2);
        if (r4 != 0) goto L_0x003e;
    L_0x0036:
        r4 = r3.r;
        r0 = r3.q;
        r4.set(r0);
        goto L_0x0040;
    L_0x003e:
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        r3.requestLayout();
    L_0x0043:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new akc(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof akc;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i();
        measureChildWithMargins(this.b, i, 0, i2, 0);
        akc akc = (akc) this.b.getLayoutParams();
        int i3 = 0;
        int max = Math.max(0, (this.b.getMeasuredWidth() + akc.leftMargin) + akc.rightMargin);
        int max2 = Math.max(0, (this.b.getMeasuredHeight() + akc.topMargin) + akc.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.b.getMeasuredState());
        int t = abe.t(this) & 256;
        if (t != 0) {
            i3 = this.j;
            boolean z = this.d;
        } else if (this.b.getVisibility() != 8) {
            i3 = this.b.getMeasuredHeight();
        }
        this.s.set(this.q);
        this.v.set(this.t);
        Rect rect;
        Rect rect2;
        if (!this.c && t == 0) {
            rect = this.s;
            rect.top += i3;
            rect2 = this.s;
            rect2.bottom = rect2.bottom;
        } else {
            rect = this.v;
            rect.top += i3;
            rect2 = this.v;
            rect2.bottom = rect2.bottom;
        }
        a(this.k, this.s, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.k.fitSystemWindows(this.v);
        }
        measureChildWithMargins(this.k, i, 0, i2, 0);
        akc akc2 = (akc) this.k.getLayoutParams();
        max = Math.max(max, (this.k.getMeasuredWidth() + akc2.leftMargin) + akc2.rightMargin);
        max2 = Math.max(max2, (this.k.getMeasuredHeight() + akc2.topMargin) + akc2.bottomMargin);
        i3 = View.combineMeasuredStates(combineMeasuredStates, this.k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i3), View.resolveSizeAndState(Math.max(max2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i3 << 16));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i = getPaddingLeft();
        getPaddingRight();
        i2 = getPaddingTop();
        getPaddingBottom();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                akc akc = (akc) childAt.getLayoutParams();
                int i5 = akc.leftMargin + i;
                int i6 = akc.topMargin + i2;
                childAt.layout(i5, i6, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i6);
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.m != null && !this.n) {
            int bottom = this.b.getVisibility() == 0 ? (int) ((((float) this.b.getBottom()) + this.b.getTranslationY()) + 0.5f) : 0;
            this.m.setBounds(0, bottom, getWidth(), this.m.getIntrinsicHeight() + bottom);
            this.m.draw(canvas);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(view, i, i2, i3, i4, i5);
    }

    public final boolean a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return ((i & 2) == 0 || this.b.getVisibility() != 0) ? false : this.o;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(i);
        ActionBarContainer actionBarContainer = this.b;
        this.p = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        a();
        akd akd = this.g;
        if (akd != null) {
            akd.r();
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        b(i5);
    }

    public final void onStopNestedScroll(View view) {
        if (this.o && !this.e) {
            if (this.p <= this.b.getHeight()) {
                a();
                postDelayed(this.y, 600);
                return;
            }
            a();
            postDelayed(this.z, 600);
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.o || !z) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f2, 0, 0, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.b.getHeight()) {
            a();
            this.z.run();
        } else {
            a();
            this.y.run();
        }
        this.e = true;
        return true;
    }

    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    private final void i() {
        if (this.k == null) {
            amh amh;
            this.k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof amh) {
                amh = (amh) findViewById;
            } else if (findViewById instanceof Toolbar) {
                amh = ((Toolbar) findViewById).j();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't make a decor toolbar out of ");
                stringBuilder.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.l = amh;
        }
    }

    public final void a(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (!z) {
                a();
                b(0);
            }
        }
    }

    private final void b(int i) {
        a();
        this.b.setTranslationY((float) (-Math.max(0, Math.min(i, this.b.getHeight()))));
    }

    public final void a() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void a(Callback callback) {
        i();
        this.l.a(callback);
    }

    public final void a(CharSequence charSequence) {
        i();
        this.l.a(charSequence);
    }

    public final void a(int i) {
        i();
        if (i == 2) {
            this.l.e();
        } else if (i == 5) {
            this.l.f();
        } else if (i == 109) {
            boolean z = true;
            this.c = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.n = z;
        }
    }

    public final boolean b() {
        i();
        return this.l.g();
    }

    public final boolean c() {
        i();
        return this.l.h();
    }

    public final boolean d() {
        i();
        return this.l.i();
    }

    public final boolean e() {
        i();
        return this.l.j();
    }

    public final boolean f() {
        i();
        return this.l.k();
    }

    public final void g() {
        i();
        this.l.l();
    }

    public final void a(Menu menu, ajm ajm) {
        i();
        this.l.a(menu, ajm);
    }

    public final void h() {
        i();
        this.l.m();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new akc();
    }
}
