package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;

/* renamed from: hiz */
public final class hiz implements ejc, hsr, t, uyo, xcp {
    public final xhv a;
    public final hja b;
    public ViewGroup c;
    public ViewGroup d;
    public SlimStatusBar e;
    public SlimStatusBar f;
    private final eif g;
    private final aizy h;
    private final uyp i;
    private final afpu j;
    private final xci k;
    private final ajam l;
    private final zyw m;
    private final LayoutInflater n;
    private boolean o;
    private boolean p;
    private bcuo q;

    public hiz(Context context, xhv xhv, ebk ebk, eif eif, aizy aizy, hja hja, uyp uyp, afpu afpu, xci xci, ajam ajam, zyw zyw) {
        this.a = xhv;
        this.g = eif;
        this.h = aizy;
        this.b = hja;
        this.i = uyp;
        this.j = afpu;
        this.k = xci;
        this.l = ajam;
        this.m = zyw;
        this.n = LayoutInflater.from(context);
        this.p = ebk.a ^ 1;
        uyp.a((uyo) this);
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.m)) {
            this.q = this.l.Q().d.f().a(emg.a(this.m, 17179869184L, 1)).a(new hiy(this), hjb.a);
        } else {
            this.k.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.m)) {
            this.q.b();
            this.q = null;
            return;
        }
        this.k.b(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!amqq.a(c(this.o), c(ejd2.a()))) {
            hja hja = this.b;
            boolean z = this.o;
            hja.j = 0;
            if (z) {
                hja.a();
                hja.e.post(hja.r);
            } else {
                hja.b();
                hja.d.post(hja.n);
            }
        }
        this.o = ejd2.a();
        if (ejd.a() != ejd2.a() && !ejd2.e()) {
            if (!this.p) {
                hja hja2 = this.b;
                hja2.j = 2;
                hja2.a(this.o, false, this.j.g());
            } else if (this.j.g()) {
                this.b.a(this.o, this.a.c(), this.j.g());
            }
        }
    }

    public final void a(boolean z) {
        boolean c = this.a.c();
        boolean a = this.g.c().a();
        boolean z2 = false;
        hja hja;
        if (c == this.p) {
            if (z && !c) {
                hja = this.b;
                ViewGroup e = hja.e(a);
                SlimStatusBar f = hja.f(a);
                if (!hja.c(e, f)) {
                    hja.a(false, a);
                }
                hja.c();
                f.post(new hjd(hja, f));
            } else if (c && this.j.g()) {
                this.b.a(a, true, this.j.g());
            }
            return;
        }
        if (!(!c && this.g.c().a() && this.h.c())) {
            hja = this.b;
            if (!a && this.j.g()) {
                z2 = true;
            }
            hja.a(a, c, z2);
        }
        this.p = c;
    }

    public final void f() {
        this.i.b(this);
    }

    public final void g() {
        this.b.a(this.g.c().a(), this.a.c(), this.j.g());
    }

    public final void h() {
        this.b.a(this.g.c().a(), this.a.c(), this.j.g());
    }

    public final void i() {
        this.b.a(this.g.c().a(), this.a.c(), this.j.g());
    }

    public final void a(ahkr ahkr) {
        if (this.g.c().a() && !this.a.c() && ahkr.a == 8) {
            this.b.a(true);
            hja hja = this.b;
            if (hja.j != 0) {
                hja.a(true, false, false);
                return;
            }
            hja.a(true);
            hja.a(true, 500);
        }
    }

    private final ViewGroup c(boolean z) {
        return !z ? this.c : this.d;
    }

    public final SlimStatusBar b(boolean z) {
        if (z) {
            if (this.f == null) {
                this.f = (SlimStatusBar) this.n.inflate(R.layout.slim_status_bar, this.d, false);
            }
            return this.f;
        }
        if (this.e == null) {
            this.e = (SlimStatusBar) this.n.inflate(R.layout.slim_status_bar, this.c, false);
        }
        return this.e;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkr.class};
        } else if (i == 0) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
