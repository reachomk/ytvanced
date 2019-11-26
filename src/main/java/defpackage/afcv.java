package defpackage;

import android.content.Context;

/* renamed from: afcv */
final class afcv implements afkj {
    public final /* synthetic */ afbo a;

    afcv(afbo afbo) {
        this.a = afbo;
    }

    public final void a() {
        this.a.g.f(afne.ANDROID_EXOPLAYER);
        xak.a();
        this.a.G();
        afbo afbo = this.a;
        if (afbo.t != null) {
            afbo.j.post(new afcu(this));
        }
        if (this.a.A()) {
            this.a.b(true);
        } else {
            this.a.z();
        }
        afbo = this.a;
        afbo.p.a(afbo.u, afbo.v);
    }

    public final void b() {
        this.a.D();
    }

    public final void c() {
        this.a.g.g(afne.ANDROID_EXOPLAYER);
        xtl.e("EXO surface destroyed");
        afbo afbo = this.a;
        if (afbo.t == null) {
            if (afbo.s != null) {
                aajj aajj = afbo.y;
                if (aajj != null) {
                    Context context = afbo.a;
                    if (aajj.g()) {
                        this.a.y();
                        afbo = this.a;
                        afbo.a((long) afbo.y.h(), "src.dest");
                        return;
                    }
                }
            }
            this.a.E();
        }
    }

    public final void d() {
        a();
    }

    public final void e() {
        this.a.g.h(afne.ANDROID_EXOPLAYER);
        afbo afbo = this.a;
        afbo.a(new afif("gl", afbo.o()));
    }
}
