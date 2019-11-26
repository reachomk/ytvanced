package defpackage;

import android.view.View;

/* renamed from: dkr */
final class dkr implements advq {
    private final advs a;
    private final /* synthetic */ diu b;

    public final void a() {
    }

    public final void a(uqq uqq) {
        uqq.Z = this.b.aP();
        uqq.aa = this.b.oC();
    }

    public final void a(advo advo) {
        String str = "Cannot return null from a non-@Nullable @Provides method";
        advo.a = new advb(this.b.cf(), this.b.dK(), this.b.dQ(), this.b.en(), this.b.em(), this.b.oy(), (advm) baqd.a(this.a.b, str), (View) baqd.a(this.a.a, str), this.b.s(), this.b.ox().getBoolean("MdxEnableSmartRemoteHack", false), this.b.eC());
    }

    public final void a(adwc adwc) {
        String str = "Cannot return null from a non-@Nullable @Provides method";
        advv advv = new advv((View) baqd.a(this.a.c, str), this.b.s(), this.b.eC());
        advv.b = this.b.em();
        advv.c = this.b.dQ();
        advv.d = (adwd) baqd.a(this.a.d, str);
        adwc.a = advv;
    }

    /* synthetic */ dkr(diu diu, advs advs) {
        this.b = diu;
        this.a = advs;
    }
}
