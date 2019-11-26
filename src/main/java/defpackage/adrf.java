package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: adrf */
public final class adrf extends adsu implements aduf {
    public static final String e = xtl.b("MDX.CastV3");
    public final adtm f;
    public final adil g;
    public final acxt h;
    public final adbj i;
    public final String j;
    public tde k;
    public boolean l;
    private final xci p;
    private final Handler q;
    private adrl r;

    adrf(adil adil, adtm adtm, Context context, adtw adtw, xoi xoi, xci xci, acxt acxt, int i, adbj adbj, adby adby, Handler handler) {
        super(context, adtw, xoi, i);
        this.g = (adil) amqw.a((Object) adil);
        this.f = adtm;
        this.p = (xci) amqw.a((Object) xci);
        this.h = (acxt) amqw.a((Object) acxt);
        this.i = adbj;
        this.q = handler;
        this.j = adby.j();
    }

    /* Access modifiers changed, original: final */
    public final boolean M() {
        return false;
    }

    public final int P() {
        return 2;
    }

    public final void a(boolean z, boolean z2) {
    }

    public final void L() {
        this.h.a("cc_c");
    }

    public final void c(boolean z) {
        this.q.post(new adri(this, z));
    }

    public final adis h() {
        return this.g;
    }

    public final boolean f() {
        return this.g.bt_();
    }

    public final void j() {
        this.k.a().a(new adrm(new adrh(this)));
        this.p.d(new adcd());
    }

    public final void k() {
        this.k.b().a(new adrm(new adrk(this)));
        this.p.d(new adce());
    }

    public final void a(int i, int i2) {
        a(i);
    }

    public final void a(int i) {
        this.k.a((double) (((float) i) / 100.0f)).a(new adrm(new adrj(this, i)));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized adbl N() {
        if (this.r == null) {
            this.r = new adrl(this);
        }
        return this.r;
    }
}
