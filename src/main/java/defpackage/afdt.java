package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afdt */
public final class afdt extends afbp {
    private static final afdx h = new afdu(aeuy.e);
    public final Handler a = new Handler(Looper.getMainLooper());
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public afdx d = h;
    private afkh e;
    private int f = 0;
    private boolean g;

    public afdt(affx affx) {
        super(affx);
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        this.b.clear();
        this.c.clear();
        afkh afkh2 = afkh;
        this.e = afkh2;
        this.d = new afdw(this, aeuy);
        int i2 = i;
        this.f = i2;
        this.g = true;
        return super.a(aajs, affa, str, aajj, afkh2, this.d, f, f2, z, i2);
    }

    public final boolean a(affw affw) {
        if (this.d == h) {
            return false;
        }
        affw affw2 = new affw(affw.a, affw.b, affw.c, affw.d, new afdw(this, affw.e), affw.f, affw.g, affw.h);
        if (this.c.isEmpty() && super.a(affw2)) {
            this.b.add(affw2);
        } else {
            this.c.add(affw2);
            b(false);
        }
        return true;
    }

    public final void bx_() {
        if (!this.b.isEmpty()) {
            super.bx_();
        } else if (!this.c.isEmpty()) {
            z();
        }
    }

    public final void b() {
        super.b();
        this.b.clear();
        this.c.clear();
    }

    public final void a(afkh afkh) {
        this.e = afkh;
        super.a(afkh);
    }

    public final void r() {
        this.e = null;
        super.r();
    }

    public final void a(boolean z) {
        x();
        super.a(z);
    }

    public final void p() {
        x();
        super.p();
    }

    public final void x() {
        this.b.clear();
        this.c.clear();
        this.e = null;
        this.d = h;
    }

    public final void b(boolean z) {
        if (!(this.g || !this.b.isEmpty() || this.c.isEmpty())) {
            affw affw = (affw) this.c.get(0);
            if (z) {
                z();
            } else if (affw.h != -1) {
                long o = super.o();
                if (affw.h <= o) {
                    z();
                } else if (super.f() && !super.g()) {
                    this.a.postDelayed(new afds(this), affw.h - o);
                }
            }
        }
    }

    private final void z() {
        this.g = true;
        this.a.removeCallbacksAndMessages(null);
        affw affw = (affw) this.c.remove(0);
        new Object[1][0] = affw;
        this.d.l();
        this.d = (afdx) affw.e;
        this.d.b();
        super.a(affw.a, affw.b, affw.c, affw.d, this.e, affw.e, ((Float) affw.f.get()).floatValue(), ((Float) affw.g.get()).floatValue(), true, this.f);
        this.a.post(new afdv(this));
    }

    public final void y() {
        while (!this.c.isEmpty()) {
            affw affw = (affw) this.c.get(0);
            if (!super.a(affw)) {
                break;
            }
            this.b.add(affw);
            this.c.remove(affw);
        }
        b(false);
    }

    public final /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ float s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ aerm k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ int w() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ long v() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ long u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ long t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ long o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ aahr e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ aahr d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return super.a(aajs, aajj, z, afgt, i);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }
}
