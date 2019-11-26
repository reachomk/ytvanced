package defpackage;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.design.appbar.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.youtube.R;

/* renamed from: jov */
public final class jov implements eyf, ezq, ezy {
    private static final int[] m = new int[]{R.attr.actionBarSize};
    private static final int[] n = new int[]{R.attr.homeAsUpIndicator};
    private final SwipeToContainerFrameLayout A;
    private ezr B;
    private int C;
    private int D;
    private final eyg E;
    private View F;
    private el G;
    private final zyw H;
    private Drawable I;
    public final dvg b;
    public final AppTabsBar c;
    public final ConstraintLayout d;
    public final View e;
    public final Toolbar f;
    public final AppBarLayout g;
    public final jpa h;
    public final MainScrollingViewBehavior i;
    public final MainCollapsingToolbarLayout j;
    public ezz k;
    public int l;
    private final ads o;
    private final bcaa p;
    private final int q;
    private final Resources r;
    private final int s;
    private final jou t;
    private final jpz u;
    private final jpb v;
    private final ArgbEvaluator w = new ArgbEvaluator();
    private final int[] x = new int[2];
    private final float[] y = new float[2];
    private final ezv z;

    public jov(dvg dvg, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, jpz jpz, AppBarLayout appBarLayout, ezv ezv, jpa jpa, bcaa bcaa, zyw zyw) {
        this.p = (bcaa) amqw.a((Object) bcaa);
        this.b = (dvg) amqw.a((Object) dvg);
        this.g = (AppBarLayout) amqw.a((Object) appBarLayout);
        this.f = (Toolbar) amqw.a((Toolbar) this.g.findViewById(R.id.toolbar));
        this.e = this.g.findViewById(R.id.toolbar_compat_shadow);
        this.A = (SwipeToContainerFrameLayout) dvg.findViewById(R.id.slim_status_bar_player_container);
        this.c = (AppTabsBar) amqw.a((Object) appTabsBar);
        this.d = (ConstraintLayout) amqw.a((Object) constraintLayout);
        this.h = (jpa) amqw.a((Object) jpa);
        this.k = (ezz) amqw.a(jpa.a());
        this.z = (ezv) amqw.a((Object) ezv);
        this.j = (MainCollapsingToolbarLayout) this.g.findViewById(R.id.toolbar_container);
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.j;
        mainCollapsingToolbarLayout.f = this;
        mainCollapsingToolbarLayout.a(false);
        this.t = new jou(this);
        this.u = jpz;
        this.v = new jpb(this);
        auy auy = (auy) ((FrameLayout) amqw.a((FrameLayout) dvg.findViewById(R.id.pane_fragment_container))).getLayoutParams();
        amqw.b(auy.a instanceof MainScrollingViewBehavior);
        this.i = (MainScrollingViewBehavior) auy.a;
        this.b.a(this.f);
        this.o = (ads) amqw.a(dvg.g());
        appTabsBar = this.c;
        xoe s = this.b.s();
        if (appTabsBar.f != s) {
            appTabsBar.f = s;
            appTabsBar.invalidate();
        }
        appTabsBar.a(appTabsBar.a, appTabsBar.b);
        this.r = this.o.h().getResources();
        TypedArray obtainStyledAttributes = dvg.getTheme().obtainStyledAttributes(n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.q = resourceId;
        int i = -16777216;
        if (VERSION.SDK_INT >= 21) {
            obtainStyledAttributes = dvg.getTheme().obtainStyledAttributes(new int[]{16843857});
            i = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
        }
        this.s = i;
        this.C = a(this.k.h().g());
        dvg.s();
        Toolbar toolbar = this.f;
        toolbar.c(xoe.a(toolbar.g(), this.C));
        int integer = this.r.getInteger(R.integer.anim_time_actionbar_background);
        this.B = o();
        this.E = new eyg(this.B, integer);
        this.g.setBackground(this.E);
        this.H = zyw;
        this.o.a(false);
        p();
        s();
        r();
        t();
    }

    private final int a(ezo ezo) {
        return ezo.a(this.b);
    }

    private final ezr o() {
        int a = a(this.k.h().a());
        int a2 = a(this.k.h().b());
        if (xrn.c(this.b)) {
            a |= -16777216;
        }
        ezr ezr = this.B;
        if (ezr == null || !ezr.a(a, a2)) {
            return new ezr(a, a2);
        }
        return this.B;
    }

    public final void a(int i) {
        int i2 = this.C;
        if (this.l == i) {
            return;
        }
        if (i != 0) {
            Toolbar toolbar = this.f;
            this.b.s();
            toolbar.b(xoe.a(ra.a(this.o.h(), this.q), i2));
            this.f.c((int) R.string.abc_action_bar_up_description);
            if (foh.y(this.H)) {
                toolbar = this.f;
                if (toolbar.m != 0) {
                    toolbar.m = 0;
                    if (toolbar.e() != null) {
                        toolbar.requestLayout();
                    }
                }
            } else {
                this.f.a(this.r.getDimensionPixelSize(R.dimen.keyline_content_inset_start), 0);
            }
            this.l = 1;
            return;
        }
        p();
    }

    private final void p() {
        this.f.b(null);
        this.f.a(this.r.getDimensionPixelSize(R.dimen.keyline_margin_inset_start), 0);
        this.l = 0;
    }

    public final int e() {
        TypedArray obtainStyledAttributes = this.b.getTheme().obtainStyledAttributes(m);
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return (int) dimension;
    }

    public final void j() {
        this.c.a();
        xpr.a(this.e, false);
    }

    public final void a(float f, eyi eyi, eyi eyi2) {
        this.D = a(f, a(eyi), a(eyi2));
        q();
    }

    private final void q() {
        int i = this.D;
        for (int i2 = 0; i2 < 2; i2++) {
            i = a(this.y[i2], i, this.x[i2]);
        }
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.A;
        if (swipeToContainerFrameLayout.h) {
            fpf.a(this.b, 17170445);
            if (this.I == null) {
                this.I = this.b.getResources().getDrawable(R.drawable.status_bar_sized_background_drawable);
            }
            this.I.setBounds(new Rect(0, 0, this.A.getMeasuredWidth(), fpf.a(this.b)));
            this.I.setColorFilter(i, Mode.SRC_IN);
            this.A.setBackground(this.I);
            return;
        }
        swipeToContainerFrameLayout.setBackground(null);
        fpf.a(this.b, i);
    }

    private final int a(float f, int i, int i2) {
        return ((Integer) this.w.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final void a() {
        this.D = a(this.B);
        q();
    }

    public final void a(int i, int i2) {
        amqw.a(true);
        this.x[i] = i2;
    }

    public final void a(int i, float f) {
        this.y[i] = Math.max(0.0f, Math.min(1.0f, f));
        q();
    }

    public final int h() {
        return this.B.b;
    }

    public final int i() {
        return this.B.c;
    }

    private final int a(eyi eyi) {
        if (eyi instanceof ezr) {
            return ((ezr) eyi).c;
        }
        return this.s;
    }

    private final void r() {
        View b = this.k.b();
        int i = 16;
        if (b == null) {
            this.o.a(this.k.a());
            this.j.a(this.k.a());
            i = 8;
        } else if (this.o.c() != b) {
            this.o.a(b, new adv(-1, -1));
        }
        this.o.a(i, 24);
    }

    private final void s() {
        int a = a(this.k.h().g());
        this.z.a(a);
        this.b.s();
        Toolbar toolbar = this.f;
        toolbar.b(xoe.a(toolbar.e(), a));
        toolbar = this.f;
        toolbar.c(xoe.a(toolbar.g(), a));
        this.C = a;
    }

    private final void t() {
        faa h = this.k.h();
        this.f.a(this.b, h.c());
        if (a(h.d()) != 0) {
            this.f.b(a(h.d()));
        }
        this.f.b(this.b, h.e());
        if (a(h.f()) != 0) {
            this.f.a(ColorStateList.valueOf(a(h.f())));
        }
        AppTabsBar appTabsBar = this.c;
        appTabsBar.d.setColor(a(h.d()));
        appTabsBar.invalidate(appTabsBar.c);
        this.c.a(a(h.d()), a(h.f()));
        appTabsBar = this.c;
        appTabsBar.e = a(h.h());
        appTabsBar.invalidate();
    }

    private final void u() {
        this.z.a(this.k.c());
    }

    public final boolean k() {
        return this.g.getVisibility() == 0;
    }

    public final void c() {
        if (!k()) {
            this.g.setVisibility(0);
            this.t.c();
        }
    }

    public final void d() {
        if (k()) {
            this.g.setVisibility(8);
            this.t.c();
        }
    }

    private final void v() {
        jou jou = this.t;
        boolean a = jou.a();
        if (a || jou.e()) {
            ViewGroup viewGroup = (ViewGroup) jou.c.getParent();
            if (viewGroup != jou.d) {
                if (viewGroup != null) {
                    viewGroup.removeView(jou.c);
                }
                jou.d.addView(jou.c, -1, jou.a.e());
                ((eg) jou.c.getLayoutParams()).a = 0;
                jou.h = -1;
                jou.e.cancel();
            }
            if (jou.h != 1) {
                jou.c();
                jou.e.addListener(jou.f);
                jou.e.removeListener(jou.g);
                jou.e.start();
                jou.h = 1;
            }
        } else if (jou.h != 0) {
            jou.c();
            jou.e.addListener(jou.g);
            jou.e.removeListener(jou.f);
            jou.e.reverse();
            jou.h = 0;
        }
        xpr.a(jou.b, a ^ 1);
        jpz jpz = this.u;
        if (jpz != null && !jpz.a() && jpz.b != 1) {
            jpz.a(1);
        }
    }

    public final void f() {
        if (!n()) {
            boolean z = false;
            if (!(g() || l())) {
                z = true;
            }
            this.g.a(true, z);
        }
    }

    public final void b() {
        ezz ezz;
        ezz W;
        jpa jpa = this.h;
        if (jpa.b() == 2) {
            ezz = jpa.k;
        } else {
            fja c = jpa.c();
            W = c != null ? c.W() : null;
            if (W == null) {
                W = jpa.a();
            }
            ezz = (jpa.s == 2 && (W instanceof fag)) ? jpa.a(((fag) W).i()).a() : W;
        }
        amqw.a((Object) ezz);
        W = this.k;
        if (W == ezz) {
            r();
            t();
            u();
            v();
            w();
            return;
        }
        ezo g = W.h().g();
        ezo g2 = ezz.h().g();
        this.k = ezz;
        this.B = o();
        if (g != g2) {
            s();
        }
        MainScrollingViewBehavior mainScrollingViewBehavior = this.i;
        boolean z = this.k.d() && !xrn.c(this.b);
        mainScrollingViewBehavior.e = z;
        y();
        if (!g()) {
            ((ElevatedAppBarLayout) this.g).b(false);
        }
        r();
        eyg eyg = this.E;
        eyi eyi = this.B;
        xak.a();
        if (eyi.a(eyg.b)) {
            eyg.a(eyi, this);
        } else {
            if (eyg.a.isRunning()) {
                eyg.a.cancel();
            }
            if (eyi.a(eyg.b)) {
                eyg.a();
                eyg.a(eyi, this);
            } else {
                eyg.a(eyi);
                eyg.a((eyf) this);
                amqw.b(eyg.c == null, (Object) "previousDrawableHolder must be null in static state.");
                amqw.b(eyg.b != null, (Object) "currentDrawableHolder must not be null in static state.");
                amqw.b(eyg.d != null, (Object) "nextDrawableHolder must not be null in static state.");
                amqw.b(eyg.b());
                z = eyg.c();
                String valueOf = String.valueOf(eyg.c);
                String valueOf2 = String.valueOf(eyg.b);
                String valueOf3 = String.valueOf(eyg.d);
                StringBuilder stringBuilder = new StringBuilder(((valueOf.length() + 56) + valueOf2.length()) + valueOf3.length());
                stringBuilder.append("All drawables must be unique. Previous ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", current ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", next ");
                stringBuilder.append(valueOf3);
                amqw.b(z, stringBuilder.toString());
                if (!eyg.a.isStarted()) {
                    eyg.a.start();
                }
            }
        }
        t();
        u();
        v();
        w();
        faa h = this.k.h();
        cs csVar = (cs) this.c.getLayoutParams();
        Resources resources = this.b.getResources();
        if (h.i() != 1) {
            this.d.setPadding(0, 0, 0, 0);
            csVar.width = -1;
            csVar.F = 0;
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.details_content_side_padding);
        this.d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        csVar.width = 0;
        csVar.F = resources.getDimensionPixelSize(R.dimen.details_page_max_content_width);
    }

    public final boolean g() {
        return this.i.e;
    }

    public final boolean l() {
        return this.F != null;
    }

    public final boolean m() {
        return l() && this.F.getParent() == this.j;
    }

    public final boolean n() {
        if (m()) {
            MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.j;
            if (mainCollapsingToolbarLayout.b != null && mainCollapsingToolbarLayout.g) {
                return true;
            }
        }
        return false;
    }

    private final void w() {
        Object f = this.k.f();
        if (f == null) {
            z();
        } else if (l() && akoz.b(this.F) == ((akpb) this.p.get()).a(f)) {
            x();
            a(akoz.a(this.F), f);
        } else {
            View K_;
            z();
            akpb akpb = (akpb) this.p.get();
            akot a = akoz.a(akpb, f, this.j);
            if (a != null) {
                K_ = a.K_();
                akoz.a(K_, a, akpb.a(f));
                a(a, f);
            } else {
                K_ = null;
            }
            this.F = K_;
            if (this.F != null) {
                x();
            }
        }
    }

    private final void x() {
        if (this.k.g()) {
            a(this.j);
            if (this.F.getParent() == null) {
                LayoutParams layoutParams = this.G;
                if (layoutParams == null) {
                    this.G = new el((byte) 0);
                    layoutParams = this.G;
                    layoutParams.a = 0;
                }
                this.j.addView(this.F, 0, layoutParams);
            }
        } else {
            a(this.g);
            if (this.F.getParent() == null) {
                this.g.addView(this.F, -1, -2);
                ((eg) this.F.getLayoutParams()).a = 0;
            }
        }
        y();
        this.t.c();
    }

    private final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) this.F.getParent();
        if (viewGroup2 != null && viewGroup2 != viewGroup) {
            viewGroup2.removeView(this.F);
        }
    }

    private final void y() {
        faa h = this.k.h();
        int a = a(h.a()) | -16777216;
        if (m()) {
            jpb jpb = this.v;
            int a2 = a(h.a());
            jpb.a.f.setBackgroundColor(a2);
            jpb.b = a2;
            jpb.c = a2 | -16777216;
            this.d.setBackgroundColor(a);
        } else {
            jpb jpb2 = this.v;
            jpb2.a.f.setBackground(null);
            jpb2.b = 0;
            jpb2.c = 0;
            this.d.setBackground(null);
        }
        if (m() || g()) {
            this.j.a(new ColorDrawable(a));
            this.j.b(this.k.e());
            return;
        }
        this.j.a(null);
        this.j.b(false);
    }

    private final void z() {
        if (l()) {
            ViewGroup viewGroup = (ViewGroup) this.F.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.F);
                ((akpb) this.p.get()).a(this.F);
                this.F = null;
                y();
                this.t.c();
            }
        }
    }

    private final void a(akot akot, Object obj) {
        if (akot != null) {
            View K_ = akot.K_();
            akor c = akoz.c(K_);
            if (c == null) {
                c = new akor();
                akoz.a(K_, c);
            }
            c.a();
            c.a(this.b.t());
            akot.a_(c, obj);
        }
    }

    public final void a(RecyclerView recyclerView) {
        this.j.a(recyclerView);
    }

    public final void a(bctz bctz, boolean z, jqj jqj, enx enx, RecyclerView recyclerView) {
        amqw.a((Object) bctz, (Object) jqj);
        jpz jpz = this.u;
        if (jpz != null) {
            Boolean valueOf = Boolean.valueOf(xrn.c(this.b));
            amqw.a((Object) bctz);
            amqw.a((Object) jqj);
            amqw.a((Object) enx);
            amqw.a((Object) recyclerView);
            if (valueOf.booleanValue()) {
                jpz.c = jqa.b;
            }
            jpz.e = jqj;
            jpz.f = enx;
            jpz.g = recyclerView;
            if (jpz.d != bctz) {
                jpz.a = false;
                if (jpz.a()) {
                    jpz.j.b();
                    jpz.j = null;
                }
            }
            if (!jpz.a()) {
                jpz.j = bctz.a(new bdbt(new jqc(jpz), new jqb(jpz), new jqe(jpz)), bctz);
                jpz.d = bctz;
            }
            int i = 5;
            if (jpz.c.a()) {
                if (!z) {
                    i = 4;
                }
                jpz.a(i);
            } else {
                jpz.a(5);
            }
            if (jpz.c.b()) {
                jpz.d();
            }
        }
    }
}
