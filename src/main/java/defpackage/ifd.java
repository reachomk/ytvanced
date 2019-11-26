package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: ifd */
public final class ifd implements ibc {
    private boolean A;
    private boolean B;
    public final hyc a;
    public final hyc b;
    public ifc c;
    public Animation d;
    public Animation e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final adqf n;
    private final acvx o;
    private final hvk p;
    private final hwf q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ifd(adqf adqf, acvx acvx, hyc hyc, hyc hyc2, hvk hvk, hwf hwf) {
        this.n = adqf;
        this.o = acvx;
        this.a = hyc;
        this.b = hyc2;
        this.p = hvk;
        this.q = hwf;
    }

    public final void i(boolean z) {
    }

    public final void g_(boolean z) {
        this.u = true;
        c();
        if (z) {
            a(this.c.h);
            a(this.c.a);
            a(this.c.f);
            a(this.c.g);
            a(this.c.e);
            a(this.c.d);
            xqc xqc = this.c.b;
            if (xqc.a()) {
                xqc.a(false, false);
                xqc.a(true, true);
            }
            a(this.c.i);
            ifd.a(this.p);
            ifd.a(this.q);
        }
    }

    public final void g(boolean z) {
        xqc xqc;
        if (z) {
            b(this.c.h);
            b(this.c.a);
            b(this.c.f);
            b(this.c.g);
            b(this.c.e);
            xqc = this.c.b;
            if (xqc.a()) {
                xqc.a(false, true);
            }
            b(this.c.d);
            b(this.c.i);
            ifd.b(this.p);
            ifd.b(this.q);
            return;
        }
        d();
        xqc = this.c.b;
        if (xqc.a()) {
            xqc.d().animate().cancel();
        }
        this.u = false;
        b();
    }

    public final void a(aich aich) {
        boolean z = true;
        if (this.r == aich.g() && this.s == aich.h()) {
            if (this.t == (aich.a == aicj.ENDED)) {
                return;
            }
        }
        this.r = aich.g();
        this.s = aich.h();
        if (aich.a != aicj.ENDED) {
            z = false;
        }
        this.t = z;
        a();
    }

    public final void a(aicd aicd) {
        this.x = aicd.c(aicd);
        a();
    }

    public final void a(ejd ejd) {
        this.w = ejd.a();
        boolean z = true;
        this.B = ejd == ejd.INLINE_FULLSCREEN;
        if (!(ejd.f() || ejd.n())) {
            z = false;
        }
        this.v = z;
        a();
    }

    public final void j(boolean z) {
        if (this.z != z) {
            this.z = z;
            a();
        }
    }

    public final void h(boolean z) {
        this.y = z;
        a();
    }

    public final void k(boolean z) {
        if (this.A != z) {
            this.A = z;
            a();
        }
    }

    public final void a() {
        if (this.c != null) {
            if (this.u) {
                c();
                return;
            }
            b();
        }
    }

    private final void b() {
        View view = this.c.f;
        boolean z = this.r && !this.v;
        xpr.a(view, z);
        this.c.b.b(false);
        xpr.a(this.c.g, false);
        xpr.a(this.c.h, false);
        xpr.a(this.c.e, false);
        xpr.a(this.c.a, false);
        xpr.a(this.c.d, false);
        xpr.a(this.c.i, false);
        this.p.a(false, false);
        this.q.a(false, false);
    }

    private final void c() {
        boolean z = false;
        if (this.y || this.z || this.A) {
            if (this.z && this.t) {
                this.t = false;
            }
            d();
            xpr.a(this.c.e, false);
            xpr.a(this.c.f, false);
            xpr.a(this.c.h, false);
            xpr.a(this.c.g, false);
            xpr.a(this.c.d, false);
            xpr.a(this.c.a, false);
            xpr.a(this.c.i, false);
            this.c.b.b(false);
            this.p.a(false, false);
            this.q.a(false, false);
            return;
        }
        boolean z2 = this.g && this.w && !this.x && this.t;
        this.p.a(z2, false);
        boolean z3 = this.h && !this.x && this.t;
        this.q.a(z3, false);
        Object obj = (z2 || z3) ? 1 : null;
        xqc xqc = this.c.b;
        boolean z4 = this.w && !this.x && (!z2 || this.f);
        xqc.a(z4, false);
        if (this.B || z2 || (z3 && this.w)) {
            z2 = false;
        } else {
            z2 = true;
        }
        xpr.a(this.c.e, z2);
        xpr.a(this.c.c, z2);
        View view = this.c.a;
        z3 = !this.r && obj == null;
        xpr.a(view, z3);
        view = this.c.f;
        z3 = !this.x && this.s;
        xpr.a(view, z3);
        view = this.c.g;
        z3 = !this.x && this.s && this.j && obj == null;
        xpr.a(view, z3);
        view = this.c.h;
        z3 = !this.x && this.s && this.i && obj == null;
        xpr.a(view, z3);
        view = this.c.d;
        z3 = !this.x && this.s && this.w && this.n.d() != 0 && this.n.d() != 1 && this.k && obj == null;
        xpr.a(view, z3);
        if (this.w && !this.x && this.s && this.m && obj == null) {
            z = true;
        }
        xpr.a(this.c.i, z);
        if (z) {
            this.o.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_ENTRYPOINT), null);
        }
    }

    private final void d() {
        this.c.d.clearAnimation();
        this.c.h.clearAnimation();
        this.c.a.clearAnimation();
        this.c.f.clearAnimation();
        this.c.g.clearAnimation();
        this.c.e.clearAnimation();
        this.c.i.clearAnimation();
    }

    private static void a(eym eym) {
        if (eym.c()) {
            eym.a(false, false);
            eym.a(true, true);
        }
    }

    private final void a(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.e);
        }
    }

    private static void b(eym eym) {
        if (eym.c()) {
            eym.a(false, true);
        }
    }

    private final void b(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.d);
        }
    }
}
