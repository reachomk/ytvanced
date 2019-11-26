package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: wbm */
public final class wbm implements war {
    private final airt a;
    private final aiqh b;
    private final vcr c;
    private final afti d;
    private final vrk e;
    private final aaas f;
    private final vqr g;

    public wbm(airt airt, aiqh aiqh, vcr vcr, vqr vqr, afti afti, vrk vrk, aaas aaas) {
        this.a = airt;
        this.b = aiqh;
        this.g = vqr;
        this.c = vcr;
        this.d = afti;
        this.e = vrk;
        this.f = aaas;
    }

    public final was b(vuh vuh, String str, vqy vqy, vso vso) {
        aftl a = this.g.a();
        this.d.a(a);
        if (vso.m() != null) {
            a.e = TimeUnit.SECONDS.toMillis((long) vso.f());
        }
        vso vso2 = vso;
        return new wbs(this.e, vuh, vqy, vso2, str, this.a.g(), this.b, a(vso2), a, this.e.b, this.f);
    }

    public final was a(vuh vuh, aaga aaga, String str) {
        aftl a = this.g.a();
        this.d.a(a);
        return new wbo(vuh, aaga, str, this.a.g(), this.b, a);
    }

    public final was a(vuh vuh, String str, vqy vqy, vso vso) {
        return new wbt(vuh, vqy, vso, str, this.a.g(), this.b, a(vso), this.g.a(), this.f);
    }

    private final vcp a(vso vso) {
        atzk ar = vso.i.ar();
        if (!ar.b) {
            return null;
        }
        tpq tpq = new tpq();
        tpq.a = ar.c;
        tpq.b = ar.d;
        boolean z = ar.f;
        tpq.c = ar.e;
        vcr vcr = this.c;
        View view = vcr.b;
        if (view != null) {
            return new vcp(vcr.a, view, tpq);
        }
        return null;
    }
}
