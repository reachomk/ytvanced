package android.support.design.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.behavior.SwipeDismissBehavior;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.dq;
import defpackage.fp;
import defpackage.hd;
import defpackage.hi;
import defpackage.io;
import defpackage.ip;
import defpackage.iq;
import defpackage.ir;
import defpackage.is;
import defpackage.iv;
import defpackage.iw;
import defpackage.iy;
import defpackage.jb;
import defpackage.jf;
import defpackage.jg;
import defpackage.ji;
import defpackage.jm;
import defpackage.jn;
import defpackage.jq;
import java.util.List;

public class BaseTransientBottomBar {
    public static final Handler a = new Handler(Looper.getMainLooper(), new io());
    public static final boolean b = (VERSION.SDK_INT <= 19);
    private static final int[] j = new int[]{R.attr.snackbarStyle};
    public final ViewGroup c;
    public final Context d;
    public final jg e;
    public final ji f;
    public int g;
    public int h;
    public final jn i = new iy(this);
    private final int k;
    private final AccessibilityManager l;

    public class Behavior extends SwipeDismissBehavior {
        public final jf g = new jf(this);

        public final boolean b(View view) {
            return view instanceof jg;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            jf jfVar = this.g;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    jm.a().b(jfVar.a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                jm.a().a(jfVar.a);
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, ji jiVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (jiVar != null) {
            this.c = viewGroup;
            this.f = jiVar;
            this.d = viewGroup.getContext();
            hd.a(this.d);
            LayoutInflater from = LayoutInflater.from(this.d);
            TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(j);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            this.e = (jg) from.inflate(resourceId == -1 ? R.layout.design_layout_snackbar : R.layout.mtrl_layout_snackbar, this.c, false);
            if (this.e.getBackground() == null) {
                View view2 = this.e;
                int a = fp.a(hi.a(view2, (int) R.attr.colorSurface), hi.a(view2, (int) R.attr.colorOnSurface), view2.d);
                float dimension = this.e.getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                Drawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(a);
                gradientDrawable.setCornerRadius(dimension);
                abe.a(view2, gradientDrawable);
            }
            float f = this.e.e;
            if (f != 1.0f) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.b.setTextColor(fp.a(hi.a(view, (int) R.attr.colorSurface), snackbarContentLayout.b.getCurrentTextColor(), f));
            }
            this.e.addView(view);
            this.k = ((MarginLayoutParams) this.e.getLayoutParams()).bottomMargin;
            abe.c(this.e, 1);
            abe.b(this.e, 1);
            abe.b(this.e, true);
            abe.a(this.e, new iw(this));
            abe.a(this.e, new iv(this));
            this.l = (AccessibilityManager) this.d.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final void a() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.e.getLayoutParams();
        marginLayoutParams.bottomMargin = this.k;
        marginLayoutParams.bottomMargin += this.h;
        this.e.setLayoutParams(marginLayoutParams);
    }

    public int b() {
        return this.g;
    }

    public final void c() {
        jm a = jm.a();
        int b = b();
        jn jnVar = this.i;
        synchronized (a.a) {
            if (a.c(jnVar)) {
                jq jqVar = a.c;
                jqVar.b = b;
                a.b.removeCallbacksAndMessages(jqVar);
                a.a(a.c);
                return;
            }
            if (a.d(jnVar)) {
                a.d.b = b;
            } else {
                a.d = new jq(b, jnVar);
            }
            jq jqVar2 = a.c;
            if (jqVar2 == null || !a.a(jqVar2, 4)) {
                a.c = null;
                a.b();
                return;
            }
        }
    }

    public final void d() {
        a(3);
    }

    public final void a(int i) {
        jm a = jm.a();
        jn jnVar = this.i;
        synchronized (a.a) {
            if (a.c(jnVar)) {
                a.a(a.c, i);
            } else if (a.d(jnVar)) {
                a.a(a.d, i);
            }
        }
    }

    public final void e() {
        ValueAnimator valueAnimator;
        if (this.e.c != 1) {
            int f = f();
            if (b) {
                abe.d(this.e, f);
            } else {
                this.e.setTranslationY((float) f);
            }
            valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{f, 0});
            valueAnimator.setInterpolator(dq.b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new is(this));
            valueAnimator.addUpdateListener(new ir(this, f));
            valueAnimator.start();
            return;
        }
        ValueAnimator a = a(0.0f, 1.0f);
        valueAnimator = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        valueAnimator.setInterpolator(dq.d);
        valueAnimator.addUpdateListener(new ip(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, valueAnimator});
        animatorSet.setDuration(150);
        animatorSet.addListener(new jb(this));
        animatorSet.start();
    }

    public final ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(dq.a);
        ofFloat.addUpdateListener(new iq(this));
        return ofFloat;
    }

    public final int f() {
        int height = this.e.getHeight();
        LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final void g() {
        jm a = jm.a();
        jn jnVar = this.i;
        synchronized (a.a) {
            if (a.c(jnVar)) {
                a.a(a.c);
            }
        }
    }

    public final void h() {
        jm a = jm.a();
        jn jnVar = this.i;
        synchronized (a.a) {
            if (a.c(jnVar)) {
                a.c = null;
                if (a.d != null) {
                    a.b();
                }
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }

    public final boolean i() {
        List enabledAccessibilityServiceList = this.l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }
}
