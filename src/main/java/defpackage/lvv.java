package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: lvv */
public final class lvv implements ajkk, lwc, lwv, xcp {
    private lwa A;
    private final bcaa B;
    private luh C;
    private elr D;
    private volatile ejd E;
    private boolean F = false;
    private boolean G;
    private boolean H;
    private boolean I = false;
    private float J;
    private boolean K;
    public final acvx b;
    public volatile ejd c;
    private final List d;
    private final Activity e;
    private final bcaa f;
    private final fos g;
    private final adqf h;
    private final aizy i;
    private final elm j;
    private final elu k;
    private final elh l;
    private final lwe m;
    private final lvq n;
    private final lud o;
    private final bcaa p;
    private final eyb q;
    private final bcaa r;
    private final zyw s;
    private final xol t;
    private final lvj u;
    private final alck v;
    private fkc w;
    private ezy x;
    private lvz y;
    private lws z;

    public lvv(Activity activity, bcaa bcaa, fos fos, adqf adqf, ajjz ajjz, aizy aizy, elm elm, elu elu, bcaa bcaa2, elh elh, lwe lwe, lvq lvq, lud lud, bcaa bcaa3, eyb eyb, bcaa bcaa4, zyw zyw, xol xol, lvj lvj, acvx acvx, alck alck) {
        this.e = activity;
        this.f = bcaa;
        this.g = fos;
        this.h = adqf;
        this.j = elm;
        this.i = aizy;
        this.k = elu;
        this.B = bcaa2;
        this.l = elh;
        this.m = lwe;
        this.n = lvq;
        this.o = lud;
        this.p = bcaa3;
        this.q = eyb;
        this.r = bcaa4;
        this.s = zyw;
        this.t = xol;
        this.u = lvj;
        this.b = acvx;
        this.v = alck;
        this.c = ejd.NONE;
        this.E = null;
        ajjz ajjz2 = ajjz;
        ajjz.a((ajkk) this);
        this.d = new CopyOnWriteArrayList();
    }

    public final void a() {
    }

    public final int d() {
        return R.layout.watch_while_layout;
    }

    public final void a(ezy ezy, lvz lvz, View view, fkc fkc) {
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) amqw.a((WatchWhileLayout) view.findViewById(R.id.watch_while_layout));
        if (!this.F) {
            this.z = watchWhileLayout;
            this.x = (ezy) amqw.a((Object) ezy);
            this.y = (lvz) amqw.a((Object) lvz);
            this.w = (fkc) amqw.a((Object) fkc);
            this.A = new lwa(this.z);
            this.D = new lwb(this.z);
            this.z.a((lwv) this);
            this.z.a().setOnClickListener(new lvy(this));
            ViewGroup b = this.z.b();
            lvq lvq = this.n;
            bcaa bcaa = this.p;
            lws lws = this.z;
            if (lws != null) {
                b.setTag(b.getId(), lvq.a(this, bcaa, (View) lws, b, lws.d(), null, null, null));
                ezy.a(0, this.e.getResources().getColor(R.color.yt_black_pure));
                this.w.a(this.c);
                this.k.a(0, this.A);
                a(this.m);
                if (xss.b(this.e) && foh.L(this.s)) {
                    lws lws2 = this.z;
                    if (lws2 != null) {
                        FrameLayout frameLayout = (FrameLayout) ((View) lws2).findViewById(R.id.pane_fragment_container);
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(xwe.a(this.e, R.attr.ytGeneralBackgroundA));
                        }
                    } else {
                        throw null;
                    }
                }
                this.F = true;
                return;
            }
            throw null;
        }
    }

    public final void c(ejc ejc) {
        if (!this.d.contains(ejc)) {
            this.d.add(0, ejc);
        }
    }

    public final void a(ejc ejc) {
        if (!this.d.contains(ejc)) {
            this.d.add(ejc);
        }
    }

    public final void b(ejc ejc) {
        this.d.remove(ejc);
    }

    public final ejd c() {
        return this.c;
    }

    public final void e() {
        b(ejd.VIRTUAL_REALITY_FULLSCREEN);
    }

    public final void f() {
        if (this.c.k()) {
            ejd ejd;
            if (this.w.a(true)) {
                ejd = ejd.WATCH_WHILE_MAXIMIZED;
            } else {
                ejd = ejd.WATCH_WHILE_FULLSCREEN;
            }
            b(ejd);
        }
    }

    public final void e(boolean z) {
        if (!this.c.b() || this.c.a() || !z || this.w.b(ejd.WATCH_WHILE_MINIMIZED)) {
            b(ejd.WATCH_WHILE_MINIMIZED);
        } else {
            this.z.a(true);
        }
    }

    public final void f(boolean z) {
        if (this.w.a(false)) {
            a(z, null);
        } else {
            b(ejd.WATCH_WHILE_FULLSCREEN);
        }
    }

    public final void a(boolean z, View view) {
        if (this.K || !z || this.w.b(ejd.WATCH_WHILE_MAXIMIZED)) {
            this.z.a(false, null);
        } else {
            this.z.a(true, view);
        }
    }

    public final void g(boolean z) {
        if (this.c.b() && z && !this.w.b(ejd.NONE)) {
            this.z.b(true);
        } else {
            b(ejd.NONE);
        }
    }

    public final void g() {
        if (!this.c.a()) {
            b(this.c.a(true));
        }
    }

    public final void j() {
        if (this.c.a()) {
            b(this.c.a(false));
        }
    }

    public final boolean h(boolean z) {
        ejd ejd = this.c;
        if (ejd.c()) {
            if (ejd == ejd.WATCH_WHILE_MAXIMIZED && lsj.a(this.o)) {
                return true;
            }
            if (z) {
                this.e.finish();
                return true;
            } else if (this.I && ejd.a()) {
                j();
                return true;
            } else {
                e(true);
                return true;
            }
        } else if (ejd.k()) {
            ((ahxc) this.r.get()).a();
            return true;
        } else if (!ejd.a()) {
            return false;
        } else {
            j();
            return true;
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(ejd ejd) {
        if (this.c != ejd) {
            this.E = ejd;
            switch (ejd.ordinal()) {
                case 0:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.z.b(false);
                    break;
                case 1:
                    this.z.a(false);
                    break;
                case 2:
                    this.z.a(false, null);
                    break;
                case 3:
                case 10:
                case 11:
                    this.z.i();
                    break;
            }
            c(ejd);
        }
    }

    public final void k() {
        b(this.w.d());
    }

    public final void l() {
        b(ejd.INLINE_MUTED);
    }

    public final void m() {
        b(ejd.INLINE_CAROUSEL);
    }

    public final void h() {
        b(ejd.WATCH_WHILE_PICTURE_IN_PICTURE);
    }

    public final void i() {
        if (this.c == ejd.WATCH_WHILE_PICTURE_IN_PICTURE) {
            ejd ejd;
            if (this.w.a(true)) {
                ejd = ejd.WATCH_WHILE_MAXIMIZED;
            } else {
                ejd = ejd.WATCH_WHILE_FULLSCREEN;
            }
            b(ejd);
        }
    }

    public final void i(boolean z) {
        if (this.G != z) {
            this.G = z;
            d(this.c);
        }
    }

    public final lcp n() {
        if (this.C == null) {
            this.C = new luh(new lvx(this), (elf) this.l.get(), (elk) this.B.get(), this.j, this.w, this.h);
        }
        return this.C;
    }

    public final elr o() {
        return this.D;
    }

    public final eix a(int i) {
        if (i == 0) {
            return this.z.k();
        }
        if (i == 1) {
            return this.z.l();
        }
        if (i != 2) {
            return null;
        }
        return this.m.a;
    }

    private final void c(ejd ejd) {
        if (!(this.E == null || ejd == this.E)) {
            String valueOf = String.valueOf(this.E);
            String valueOf2 = String.valueOf(ejd);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 47) + valueOf2.length());
            stringBuilder.append("Expected new player view mode <");
            stringBuilder.append(valueOf);
            stringBuilder.append(">, instead is <");
            stringBuilder.append(valueOf2);
            stringBuilder.append(">");
            xtl.d(stringBuilder.toString());
        }
        if (ejd == this.c) {
            this.E = null;
            return;
        }
        this.w.a(ejd);
        boolean z = true;
        if (ejd != ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            Object obj = (ejd.c() || ejd.a()) ? 1 : null;
            c(obj == null ? 0.0f : 1.0f);
        }
        if (ejd != ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED && ejd.l()) {
            ((elk) this.B.get()).a(1.0f);
        }
        if (ejd.a() || !ejd.g()) {
            this.z.c();
        } else {
            this.z.a((int) R.id.fab_container);
            this.z.a((int) R.id.toolbar_container);
        }
        ejd ejd2 = this.c;
        this.c = ejd;
        this.E = null;
        d(this.c);
        for (ejc a : this.d) {
            a.a(ejd2, ejd);
            if (ejd != this.c) {
                break;
            }
        }
        ejd ejd3 = this.c;
        if (!(!ejd3.l() || ejd3.g() || ejd3.d())) {
            this.v.b();
        }
        if (!(foh.B(this.s) && ejd2 == ejd.WATCH_WHILE_MAXIMIZED && this.c == ejd.WATCH_WHILE_FULLSCREEN)) {
            z = false;
        }
        this.I = z;
        if (this.K && ejd == ejd.WATCH_WHILE_MINIMIZED) {
            g(false);
        }
    }

    private final void d(ejd ejd) {
        if ((!this.G || this.u.f()) && ejd.a()) {
            u();
            if (ejd.k()) {
                this.t.b(4);
            } else {
                this.t.b(2);
            }
            a(true);
            return;
        }
        this.t.b();
    }

    private final boolean u() {
        this.h.c();
        return true;
    }

    private final void a(boolean z, ejd ejd) {
        if (!this.g.isInMultiWindowMode()) {
            this.H = z;
            z = ejd.a();
            if (!this.H) {
                a(z);
            } else if (z) {
                this.t.a(1);
            }
        }
    }

    public final void a(int i, int i2) {
        lws lws = this.z;
        if (lws != null) {
            float f = 0.0f;
            if (i2 > 0 && i > 0) {
                f = ((float) i) / ((float) i2);
            }
            lws.a(f);
        }
    }

    private final void a(boolean z) {
        if (z && !this.H && ((elk) this.B.get()).a()) {
            u();
            this.t.a(0);
        }
    }

    private final void c(float f) {
        if (this.J != f) {
            this.J = f;
            this.x.a(0, f);
            this.y.b(f);
        }
    }

    private static float d(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public final void a(float f) {
        c(lvv.d(1.0f - f));
        c(ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED);
    }

    public final void b(float f) {
        ((elk) this.B.get()).a(lvv.d(1.0f - f));
        c(ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED);
    }

    public final void p() {
        if (this.E == null || !this.E.g()) {
            c(ejd.NONE);
        }
    }

    public final void b() {
        this.I = false;
    }

    public final void q() {
        c(ejd.WATCH_WHILE_PICTURE_IN_PICTURE);
    }

    public final void a_(int i) {
        this.z.a_(i);
    }

    public final void r() {
        c(ejd.WATCH_WHILE_MINIMIZED);
    }

    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if (r1.b() != false) goto L_0x0027;
     */
    public final void s() {
        /*
        r4 = this;
        r0 = r4.w;
        r1 = defpackage.xy.b();
        r2 = 1;
        if (r1 == 0) goto L_0x001d;
    L_0x0009:
        r1 = r4.f;
        r1 = r1.get();
        r1 = (defpackage.dvc) r1;
        r3 = r1.a();
        if (r3 != 0) goto L_0x001d;
    L_0x0017:
        r1 = r1.b();
        if (r1 != 0) goto L_0x0027;
    L_0x001d:
        r1 = r4.c;
        r1 = r1.k();
        if (r1 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r2 = 0;
    L_0x0027:
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0033;
    L_0x002d:
        r0 = defpackage.ejd.WATCH_WHILE_FULLSCREEN;
        r4.b(r0);
        return;
    L_0x0033:
        r0 = defpackage.ejd.WATCH_WHILE_MAXIMIZED;
        r4.c(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvv.s():void");
    }

    public final void t() {
        if (this.E == ejd.VIRTUAL_REALITY_FULLSCREEN || this.E == ejd.WATCH_WHILE_PICTURE_IN_PICTURE) {
            c(this.E);
        } else {
            c(ejd.WATCH_WHILE_FULLSCREEN);
        }
    }

    public final void a(boolean z, int i) {
        this.z.c(!z ? 0 : i);
        this.K = z;
        if (z) {
            c_(2, i);
            if (this.c.d()) {
                g(false);
                return;
            }
            return;
        }
        c_(2, 0);
        if (this.i.p() != null && this.c == ejd.NONE) {
            e(false);
        }
    }

    public final void c_(int i, int i2) {
        this.q.a(i, i2);
        lws lws = this.z;
        if (lws != null) {
            lws.d(this.q.b);
        }
    }

    public final void a(ejd ejd) {
        b(ejd);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjc.class, ahkk.class, ahkp.class};
        } else if (i != 0) {
            if (i == 1) {
                a(((ahkk) obj).a, this.c);
            } else if (i == 2) {
                a(false, this.c);
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((ahjc) obj).h == 6 && !this.c.g()) {
            this.z.b(false);
            return null;
        }
        return clsArr;
    }
}
