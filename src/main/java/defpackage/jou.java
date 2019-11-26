package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.design.appbar.AppBarLayout;
import android.support.design.appbar.AppBarLayout.BaseBehavior;
import android.support.design.appbar.AppBarLayout.Behavior;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;

/* renamed from: jou */
final class jou implements AnimatorUpdateListener {
    public final jov a;
    public final View b;
    public final ConstraintLayout c;
    public final AppBarLayout d;
    public final ValueAnimator e;
    public final AnimatorListenerAdapter f;
    public final AnimatorListenerAdapter g;
    public int h = -1;
    public boolean i;
    private final Context j;
    private final AppTabsBar k;
    private final MainCollapsingToolbarLayout l;
    private final jpa m;

    public final boolean a() {
        return this.k.b() > 1;
    }

    public final void b() {
        xpr.a(this.c, a());
    }

    public final void c() {
        if (this.a.k()) {
            a(false);
            this.a.f();
            if ((this.c.getParent() == this.d && (a() || e())) || this.a.l()) {
                f();
                return;
            }
            ((eg) this.l.getLayoutParams()).a = 0;
            this.i = false;
        } else if (abe.C(this.l)) {
            ViewTreeObserver viewTreeObserver = this.l.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new joy(this, viewTreeObserver));
        } else {
            d();
        }
    }

    private final void f() {
        ((eg) this.l.getLayoutParams()).a = !this.a.m() ? 21 : 3;
        this.i = true;
    }

    public final void d() {
        this.d.a(false, false);
        f();
        a(true);
        this.l.requestLayout();
    }

    public final boolean e() {
        if (!xrn.c(this.j)) {
            jpa jpa = this.m;
            if (!(jpa == null || jpa.b() != 2 || xss.b(this.j))) {
                return true;
            }
        }
        return false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams != null) {
            float animatedFraction = this.e.getAnimatedFraction();
            layoutParams.height = (int) (((float) this.a.e()) * animatedFraction);
            this.c.setAlpha(animatedFraction);
            this.c.setLayoutParams(layoutParams);
            if (animatedFraction != 0.0f) {
                if (animatedFraction == 1.0f) {
                    xrn.a(this.c);
                }
                return;
            }
            xrn.a(this.d);
        }
    }

    private final void a(boolean z) {
        this.a.i.d = z;
    }

    /* synthetic */ jou(jov jov) {
        BaseBehavior baseBehavior;
        this.a = (jov) amqw.a((Object) jov);
        this.k = jov.c;
        this.c = jov.d;
        this.d = jov.g;
        this.l = jov.j;
        this.m = jov.h;
        this.j = jov.b;
        this.b = jov.e;
        this.e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.e.setDuration(250);
        this.e.setInterpolator(new LinearInterpolator());
        if (VERSION.SDK_INT >= 22) {
            this.e.setCurrentFraction(1.0f);
        } else {
            this.e.setCurrentPlayTime(250);
        }
        this.e.addUpdateListener(this);
        this.f = new jox(this);
        this.g = new jow(this);
        auy auy = (auy) this.d.getLayoutParams();
        aux aux = auy.a;
        if (aux instanceof Behavior) {
            baseBehavior = (Behavior) aux;
        } else {
            baseBehavior = new Behavior();
            auy.a((aux) baseBehavior);
        }
        baseBehavior.b = new joz(this, jov);
    }
}
