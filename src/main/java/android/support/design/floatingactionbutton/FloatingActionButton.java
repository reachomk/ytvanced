package android.support.design.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView.ScaleType;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.aac;
import defpackage.aad;
import defpackage.abe;
import defpackage.abf;
import defpackage.adp;
import defpackage.aky;
import defpackage.ald;
import defpackage.aocf;
import defpackage.auw;
import defpackage.aux;
import defpackage.auy;
import defpackage.du;
import defpackage.fr;
import defpackage.ft;
import defpackage.fu;
import defpackage.gc;
import defpackage.gd;
import defpackage.gg;
import defpackage.gp;
import defpackage.gq;
import defpackage.gu;
import defpackage.hc;
import defpackage.hd;
import defpackage.hf;
import defpackage.hl;
import defpackage.hu;
import defpackage.ia;
import defpackage.jp;
import defpackage.st;

@auw(a = Behavior.class)
public class FloatingActionButton extends hf implements abf, adp, fr {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private Mode f;
    private ColorStateList g;
    private Mode h;
    private ColorStateList i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private final ald o;
    private final fu p;
    private gc q;

    public class BaseBehavior extends aux {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gq.e);
            this.b = obtainStyledAttributes.getBoolean(gq.f, true);
            obtainStyledAttributes.recycle();
        }

        public final void a(auy auy) {
            if (auy.h == 0) {
                auy.h = 80;
            }
        }

        private static boolean b(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof auy ? ((auy) layoutParams).a instanceof BottomSheetBehavior : false;
        }

        private final boolean a(View view, FloatingActionButton floatingActionButton) {
            auy auy = (auy) floatingActionButton.getLayoutParams();
            if (this.b && auy.f == view.getId() && floatingActionButton.d == 0) {
                return true;
            }
            return false;
        }

        private final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            gu.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.d();
            } else {
                floatingActionButton.c();
            }
            return true;
        }

        private final boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((auy) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d();
            } else {
                floatingActionButton.c();
            }
            return true;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public final void setBackgroundColor(int i) {
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(hd.b(context, attributeSet2, i2, R.style.f667Widget.Design.FloatingActionButton), attributeSet2, i2);
        this.c = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray a = hd.a(context2, attributeSet, gq.d, i, R.style.f667Widget.Design.FloatingActionButton, new int[0]);
        this.e = hl.a(context2, a, gq.g);
        this.f = hc.a(a.getInt(gq.h, -1), null);
        this.i = hl.a(context2, a, gq.r);
        this.k = a.getInt(gq.m, -1);
        this.l = a.getDimensionPixelSize(gq.l, 0);
        this.j = a.getDimensionPixelSize(gq.i, 0);
        float dimension = a.getDimension(gq.j, 0.0f);
        float dimension2 = a.getDimension(gq.o, 0.0f);
        float dimension3 = a.getDimension(gq.q, 0.0f);
        this.b = a.getBoolean(gq.t, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.m = a.getDimensionPixelSize(gq.p, 0);
        du a2 = du.a(context2, a, gq.s);
        du a3 = du.a(context2, a, gq.n);
        ia iaVar = r1;
        du duVar = a3;
        du duVar2 = a2;
        ia iaVar2 = new ia(context2, attributeSet, i, R.style.f667Widget.Design.FloatingActionButton, -1);
        boolean z = iaVar.b.a == -1.0f;
        boolean z2 = a.getBoolean(gq.k, false);
        a.recycle();
        this.o = new ald(this);
        this.o.a(attributeSet2, i2);
        this.p = new fu(this);
        gc g = g();
        if (z) {
            float e = (float) (g.D.e() / 2);
            iaVar.a(e, e, e, e);
        }
        g.b = iaVar;
        g.g = z;
        hu huVar = g.c;
        if (huVar != null) {
            huVar.a(iaVar);
        }
        Drawable drawable = g.d;
        if (drawable instanceof hu) {
            ((hu) drawable).a(iaVar);
        }
        ft ftVar = g.e;
        if (ftVar != null) {
            ftVar.h = iaVar;
            ftVar.invalidateSelf();
        }
        g().a(this.e, this.f, this.i, this.j);
        g().l = dimensionPixelSize;
        gc g2 = g();
        if (g2.i != dimension) {
            g2.i = dimension;
            g2.a(dimension, g2.j, g2.k);
        }
        g2 = g();
        if (g2.j != dimension2) {
            g2.j = dimension2;
            g2.a(g2.i, dimension2, g2.k);
        }
        g2 = g();
        if (g2.k != dimension3) {
            g2.k = dimension3;
            g2.a(g2.i, g2.j, dimension3);
        }
        g2 = g();
        int i3 = this.m;
        if (g2.t != i3) {
            g2.t = i3;
            g2.b();
        }
        g().p = duVar2;
        g().q = duVar;
        g().h = z2;
        setScaleType(ScaleType.MATRIX);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int e = e();
        this.a = (e - this.m) / 2;
        g().e();
        i = Math.min(a(e, i), a(e, i2));
        setMeasuredDimension((this.c.left + i) + this.c.right, (i + this.c.top) + this.c.bottom);
    }

    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            gc g = g();
            hu huVar = g.c;
            if (huVar != null) {
                huVar.setTintList(colorStateList);
            }
            ft ftVar = g.e;
            if (ftVar != null) {
                ftVar.a(colorStateList);
            }
        }
    }

    public final Mode getBackgroundTintMode() {
        return this.f;
    }

    public final void setBackgroundTintMode(Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            hu huVar = g().c;
            if (huVar != null) {
                huVar.setTintMode(mode);
            }
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        return this.e;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public final Mode getSupportBackgroundTintMode() {
        return this.f;
    }

    public final void a(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            f();
        }
    }

    public final ColorStateList a() {
        return this.g;
    }

    public final void a(Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            f();
        }
    }

    public final Mode b() {
        return this.h;
    }

    private final void f() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.g;
            if (colorStateList == null) {
                st.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.h;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(aky.a(colorForState, mode));
        }
    }

    public final void setImageResource(int i) {
        this.o.a(i);
        f();
    }

    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            g().b();
            if (this.g != null) {
                f();
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (r0.u == 2) goto L_0x0073;
     */
    public final void c() {
        /*
        r4 = this;
        r0 = r4.g();
        r1 = r0.D;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x0012;
    L_0x000c:
        r1 = r0.u;
        r2 = 2;
        if (r1 != r2) goto L_0x0018;
    L_0x0011:
        goto L_0x0073;
    L_0x0012:
        r1 = r0.u;
        r2 = 1;
        if (r1 == r2) goto L_0x0018;
    L_0x0017:
        return;
    L_0x0018:
        r1 = r0.o;
        if (r1 == 0) goto L_0x001f;
    L_0x001c:
        r1.cancel();
    L_0x001f:
        r1 = r0.i();
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r1 == 0) goto L_0x0074;
    L_0x0027:
        r1 = r0.D;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x0042;
    L_0x002f:
        r1 = r0.D;
        r3 = 0;
        r1.setAlpha(r3);
        r1 = r0.D;
        r1.setScaleY(r3);
        r1 = r0.D;
        r1.setScaleX(r3);
        r0.a(r3);
    L_0x0042:
        r1 = r0.p;
        if (r1 != 0) goto L_0x0061;
    L_0x0046:
        r1 = r0.m;
        if (r1 != 0) goto L_0x0059;
    L_0x004a:
        r1 = r0.D;
        r1 = r1.getContext();
        r3 = 2131165190; // 0x7f070006 float:1.794459E38 double:1.052935506E-314;
        r1 = defpackage.du.a(r1, r3);
        r0.m = r1;
    L_0x0059:
        r1 = r0.m;
        r1 = defpackage.aad.a(r1);
        r1 = (defpackage.du) r1;
    L_0x0061:
        r1 = r0.a(r1, r2, r2, r2);
        r2 = new ge;
        r3 = 0;
        r2.<init>(r0, r3);
        r1.addListener(r2);
        r0 = r0.v;
        r1.start();
    L_0x0073:
        return;
    L_0x0074:
        r1 = r0.D;
        r3 = 0;
        r1.a(r3, r3);
        r1 = r0.D;
        r1.setAlpha(r2);
        r1 = r0.D;
        r1.setScaleY(r2);
        r1 = r0.D;
        r1.setScaleX(r2);
        r0.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.floatingactionbutton.FloatingActionButton.c():void");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (r0.u == 1) goto L_0x0057;
     */
    public final void d() {
        /*
        r4 = this;
        r0 = r4.g();
        r1 = r0.D;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0012;
    L_0x000c:
        r1 = r0.u;
        r2 = 1;
        if (r1 != r2) goto L_0x0018;
    L_0x0011:
        goto L_0x0057;
    L_0x0012:
        r1 = r0.u;
        r2 = 2;
        if (r1 == r2) goto L_0x0018;
    L_0x0017:
        return;
    L_0x0018:
        r1 = r0.o;
        if (r1 == 0) goto L_0x001f;
    L_0x001c:
        r1.cancel();
    L_0x001f:
        r1 = r0.i();
        if (r1 == 0) goto L_0x0058;
    L_0x0025:
        r1 = r0.q;
        if (r1 != 0) goto L_0x0044;
    L_0x0029:
        r1 = r0.n;
        if (r1 != 0) goto L_0x003c;
    L_0x002d:
        r1 = r0.D;
        r1 = r1.getContext();
        r2 = 2131165189; // 0x7f070005 float:1.7944588E38 double:1.0529355055E-314;
        r1 = defpackage.du.a(r1, r2);
        r0.n = r1;
    L_0x003c:
        r1 = r0.n;
        r1 = defpackage.aad.a(r1);
        r1 = (defpackage.du) r1;
    L_0x0044:
        r2 = 0;
        r1 = r0.a(r1, r2, r2, r2);
        r2 = new gf;
        r3 = 0;
        r2.<init>(r0, r3);
        r1.addListener(r2);
        r0 = r0.w;
        r1.start();
    L_0x0057:
        return;
    L_0x0058:
        r0 = r0.D;
        r1 = 4;
        r2 = 0;
        r0.a(r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.floatingactionbutton.FloatingActionButton.d():void");
    }

    public final int e() {
        return a(this.k);
    }

    private final int a(int i) {
        int i2 = this.l;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i = a(1);
            } else {
                i = a(0);
            }
            return i;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc g = g();
        if (g.g()) {
            ViewTreeObserver viewTreeObserver = g.D.getViewTreeObserver();
            if (g.F == null) {
                g.F = new gg(g);
            }
            viewTreeObserver.addOnPreDrawListener(g.F);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc g = g();
        ViewTreeObserver viewTreeObserver = g.D.getViewTreeObserver();
        OnPreDrawListener onPreDrawListener = g.F;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            g.F = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g().a(getDrawableState());
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        g().d();
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        jp jpVar = new jp(onSaveInstanceState);
        aac aac = jpVar.a;
        fu fuVar = this.p;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", fuVar.b);
        bundle.putInt("expandedComponentIdHint", fuVar.c);
        aac.put("expandableWidgetHelper", bundle);
        return jpVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof jp) {
            jp jpVar = (jp) parcelable;
            super.onRestoreInstanceState(jpVar.g);
            fu fuVar = this.p;
            Bundle bundle = (Bundle) aad.a((Bundle) jpVar.a.get("expandableWidgetHelper"));
            fuVar.b = bundle.getBoolean("expanded", false);
            fuVar.c = bundle.getInt("expandedComponentIdHint", 0);
            if (fuVar.b) {
                ViewParent parent = fuVar.a.getParent();
                if (parent instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) parent).a(fuVar.a);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private final void a(Rect rect) {
        rect.left += this.c.left;
        rect.top += this.c.top;
        rect.right -= this.c.right;
        rect.bottom -= this.c.bottom;
    }

    private static int a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            return Math.min(i, i2);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.n;
            if (abe.D(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                a(rect);
                if (!this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        g().b(f);
    }

    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        g();
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        g();
    }

    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        g();
    }

    public final void setScaleX(float f) {
        super.setScaleX(f);
        g();
    }

    public final void setScaleY(float f) {
        super.setScaleY(f);
        g();
    }

    private final gc g() {
        if (this.q == null) {
            gc gpVar;
            if (VERSION.SDK_INT >= 21) {
                gpVar = new gp(this, new gd(this));
            } else {
                gpVar = new gc(this, new gd(this));
            }
            this.q = gpVar;
        }
        return this.q;
    }
}
