package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import java.util.Set;

/* renamed from: mjy */
public final class mjy implements ahxm, dvc, ejc, hfk, xpe {
    public bapu A;
    public fga B;
    public ffw C;
    public ahyg D;
    public ahml E;
    public acvx F;
    public lfw G;
    public bapu H;
    public elh I;
    public bcaa J;
    public Set K;
    public mjo L;
    public ajam M;
    public xol N;
    public final bdfu O = new bdfu();
    public final bdfu P = new bdfu();
    public boolean Q;
    public boolean R;
    public View S;
    public InlinePlayerLayout T;
    public aiqd U;
    public eiy V;
    public jvf W;
    public lyl a;
    public bcaa b;
    public mjs c;
    public fhk d;
    public jtw e;
    public ehz f;
    public ewi g;
    public lwc h;
    public fkc i;
    public hsr j;
    public bcaa k;
    public zyw l;
    public fkj m;
    public bcaa n;
    public bcaa o;
    public alfi p;
    public aamv q;
    public ajjz r;
    public jjp s;
    public hva t;
    public YouTubePlayerOverlaysLayout u;
    public huf v;
    public eif w;
    public xci x;
    public adqf y;
    public elu z;

    public final void c(boolean z) {
        ahxc ahxc = (ahxc) this.o.get();
        ahxc.k = z;
        ahxn ahxn = ahxc.g;
        if (ahxn != null) {
            ahxn.a(ahxc.b());
        }
        l().i(z);
    }

    public final boolean a() {
        if (!xy.b()) {
            return false;
        }
        if (!(!this.Q || this.R || this.a.u() || this.a.bi)) {
            this.Q = false;
            this.R = true;
            l().i();
            this.R = false;
        }
        return this.Q;
    }

    public final boolean b() {
        return xy.b() ? this.R : false;
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        lwc lwc = this.h;
        if (lwc != null) {
            if (lwc.c().g()) {
                this.D.a(this.a.t());
            } else {
                this.D.b(this.F);
            }
        }
        eib eib = this.G;
        eib.a.a(eib);
        eib.b.a(eib);
    }

    public final void a(eiy eiy) {
        this.V = null;
        airl airl = eiy.a;
        aiqq aiqq = airl.a;
        if ((this.y.c() == null && !this.y.g()) || aebk.a(aiqq.c()) || ((nkv) airl.b.instance).f) {
            this.h.n().a(eiy);
        } else if (this.a.U) {
            this.V = eiy;
        } else {
            airl airl2 = eiy.a;
            amqw.b(true, (Object) "showRemoteWatchDialogFragment called while paused.");
            gxt.a(airl2, this.a.f());
            this.x.d(new ahjp());
        }
    }

    public final void a(boolean z) {
        this.h.f(z);
    }

    public final void c() {
        this.h.g(false);
    }

    public final boolean aH_() {
        return this.h.c().a();
    }

    public final boolean j() {
        ejd c = this.h.c();
        return c.c() || c.a();
    }

    public final boolean d() {
        return this.h.c().d();
    }

    public final boolean e() {
        return this.h.c().b();
    }

    public final boolean f() {
        return this.h.c().e();
    }

    public final void g() {
        this.h.g(true);
    }

    public final void h() {
        if (e()) {
            this.h.f(true);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.h.g();
        } else {
            this.h.j();
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.h.e();
        } else {
            this.h.f();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        i();
        if (ejd.a() != ejd2.a()) {
            this.a.r();
            this.a.closeOptionsMenu();
            xrn.a(this.S);
        }
        if (ejd2 == ejd.NONE) {
            this.W.e.sendEmptyMessage(1);
        }
        if (!j()) {
            this.c.j = false;
            mjw mjw = (mjw) this.b.get();
            fiw h = mjw.h();
            if (!(h == null || !fil.a(h) || this.f.c())) {
                mjw.a(mjw.i());
            }
        }
        this.g.b();
    }

    public final void k() {
        if (l().c().k()) {
            ((ahnq) this.k.get()).d();
        } else if (aH_()) {
            lyl lyl = this.a;
            Object obj = null;
            if (VERSION.SDK_INT >= 24 && lyl.isInMultiWindowMode()) {
                obj = 1;
            }
            int f = this.N.f() ^ 1;
            if (obj == null && f == 0) {
                ((elf) this.I.get()).l();
            }
        }
    }

    public final lwc l() {
        return (lwc) this.n.get();
    }
}
