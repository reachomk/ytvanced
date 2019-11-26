package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import com.google.android.youtube.R;

/* renamed from: asj */
public final class asj implements amh {
    public final Toolbar a;
    public CharSequence b;
    public Callback c;
    public boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private akf n;
    private int o = 0;
    private Drawable p;

    public asj(Toolbar toolbar, boolean z) {
        this.a = toolbar;
        this.b = toolbar.n;
        this.l = toolbar.o;
        this.k = this.b != null;
        this.j = toolbar.e();
        arz a = arz.a(toolbar.getContext(), null, afy.a, R.attr.actionBarStyle, 0);
        this.p = a.a(afy.n);
        int f;
        if (z) {
            Toolbar toolbar2;
            CharSequence c = a.c(afy.t);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            c = a.c(afy.r);
            if (!TextUtils.isEmpty(c)) {
                this.l = c;
                if ((this.e & 8) != 0) {
                    this.a.b(c);
                }
            }
            Drawable a2 = a.a(afy.p);
            if (a2 != null) {
                a(a2);
            }
            a2 = a.a(afy.o);
            if (a2 != null) {
                this.h = a2;
                t();
            }
            if (this.j == null) {
                a2 = this.p;
                if (a2 != null) {
                    b(a2);
                }
            }
            a(a.a(afy.j, 0));
            f = a.f(afy.i, 0);
            if (f != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(f, this.a, false));
                a(this.e | 16);
            }
            f = a.e(afy.l, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f;
                this.a.setLayoutParams(layoutParams);
            }
            f = a.c(afy.h, -1);
            int c2 = a.c(afy.g, -1);
            if (f >= 0 || c2 >= 0) {
                this.a.a(Math.max(f, 0), Math.max(c2, 0));
            }
            f = a.f(afy.u, 0);
            if (f != 0) {
                toolbar2 = this.a;
                toolbar2.a(toolbar2.getContext(), f);
            }
            f = a.f(afy.s, 0);
            if (f != 0) {
                toolbar2 = this.a;
                toolbar2.b(toolbar2.getContext(), f);
            }
            f = a.f(afy.q, 0);
            if (f != 0) {
                this.a.a(f);
            }
        } else {
            if (this.a.e() != null) {
                this.p = this.a.e();
                f = 15;
            } else {
                f = 11;
            }
            this.e = f;
        }
        a.a();
        if (this.o != R.string.abc_action_bar_up_description) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.d())) {
                b(this.o);
            }
        }
        this.m = this.a.d();
        this.a.a(new asi(this));
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void p() {
    }

    public final int q() {
        return 0;
    }

    public final ViewGroup a() {
        return this.a;
    }

    public final Context b() {
        return this.a.getContext();
    }

    public final boolean c() {
        asc asc = this.a.s;
        return (asc == null || asc.a == null) ? false : true;
    }

    public final void d() {
        this.a.c();
    }

    public final void a(Callback callback) {
        this.c = callback;
    }

    public final void a(CharSequence charSequence) {
        if (!this.k) {
            c(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.k = true;
        c(charSequence);
    }

    private final void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    public final void a(Drawable drawable) {
        this.i = drawable;
        t();
    }

    private final void t() {
        Drawable drawable;
        int i = this.e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.i;
            if (drawable == null) {
                drawable = this.h;
            }
        } else {
            drawable = this.h;
        }
        this.a.a(drawable);
    }

    public final boolean g() {
        Toolbar toolbar = this.a;
        if (toolbar.getVisibility() != 0) {
            return false;
        }
        ActionMenuView actionMenuView = toolbar.a;
        if (actionMenuView == null || !actionMenuView.b) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        return this.a.a();
    }

    public final boolean i() {
        ActionMenuView actionMenuView = this.a.a;
        boolean z = false;
        if (actionMenuView != null) {
            akf akf = actionMenuView.c;
            if (akf != null) {
                if (akf.o != null) {
                    z = true;
                } else if (akf.i()) {
                    return true;
                } else {
                    return z;
                }
            }
        }
        return z;
    }

    public final boolean j() {
        return this.a.b();
    }

    public final boolean k() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null) {
            return false;
        }
        akf akf = actionMenuView.c;
        if (akf == null || !akf.f()) {
            return false;
        }
        return true;
    }

    public final void l() {
        this.d = true;
    }

    public final void a(Menu menu, ajm ajm) {
        if (this.n == null) {
            this.n = new akf(this.a.getContext());
        }
        akf akf = this.n;
        akf.e = ajm;
        Toolbar toolbar = this.a;
        if (menu != null || toolbar.a != null) {
            toolbar.h();
            Menu menu2 = toolbar.a.a;
            if (menu2 != menu) {
                if (menu2 != null) {
                    menu2.b(toolbar.r);
                    menu2.b(toolbar.s);
                }
                if (toolbar.s == null) {
                    toolbar.s = new asc(toolbar);
                }
                akf.d();
                if (menu != null) {
                    aiw aiw = (aiw) menu;
                    aiw.a((ajj) akf, toolbar.f);
                    aiw.a(toolbar.s, toolbar.f);
                } else {
                    akf.a(toolbar.f, null);
                    toolbar.s.a(toolbar.f, null);
                    akf.a();
                    toolbar.s.a();
                }
                toolbar.a.a(toolbar.g);
                toolbar.a.a(akf);
                toolbar.r = akf;
            }
        }
    }

    public final void m() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.c();
        }
    }

    public final int n() {
        return this.e;
    }

    public final void a(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    v();
                }
                u();
            }
            if ((i2 & 3) != 0) {
                t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) == 0) {
                    this.a.a(null);
                    this.a.b(null);
                } else {
                    this.a.a(this.b);
                    this.a.b(this.l);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.g;
                if (view == null) {
                    return;
                }
                if ((i & 16) == 0) {
                    this.a.removeView(view);
                } else {
                    this.a.addView(view);
                }
            }
        }
    }

    public final void o() {
        this.f = null;
    }

    public final void a(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.v = false;
        toolbar.requestLayout();
    }

    public final void a(View view) {
        View view2 = this.g;
        if (!(view2 == null || (this.e & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.g = view;
        if (view != null && (this.e & 16) != 0) {
            this.a.addView(this.g);
        }
    }

    public final View r() {
        return this.g;
    }

    public final abr a(int i, long j) {
        abr p = abe.p(this.a);
        p.a(i == 0 ? 1.0f : 0.0f);
        p.a(j);
        p.a(new asl(this, i));
        return p;
    }

    public final void b(Drawable drawable) {
        this.j = drawable;
        u();
    }

    private final void u() {
        if ((this.e & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j;
            if (drawable == null) {
                drawable = this.p;
            }
            toolbar.b(drawable);
            return;
        }
        this.a.b(null);
    }

    public final void b(int i) {
        this.m = i != 0 ? b().getString(i) : null;
        v();
    }

    private final void v() {
        if ((this.e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            this.a.c(this.o);
        } else {
            this.a.c(this.m);
        }
    }

    public final void c(int i) {
        this.a.setVisibility(i);
    }

    public final void a(ajm ajm, aiv aiv) {
        Toolbar toolbar = this.a;
        toolbar.t = ajm;
        toolbar.u = aiv;
        ActionMenuView actionMenuView = toolbar.a;
        if (actionMenuView != null) {
            actionMenuView.a(ajm, aiv);
        }
    }

    public final Menu s() {
        return this.a.f();
    }
}
