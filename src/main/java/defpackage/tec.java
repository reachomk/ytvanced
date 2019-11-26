package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: tec */
public final class tec extends tdw {
    tec(prd prd, pre pre) {
        super(prd, pre);
    }

    public final tds a(tdx tdx) {
        this.a.g = new tef(tdx);
        return this;
    }

    public final /* synthetic */ tev a() {
        prc prc = this.a;
        if (prc.j) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        ptg a;
        prc.j = true;
        prd prd = prc.k;
        pri pri = new pri(new prn(prd.c, prd.d, prc.a, prc.b, prc.c, prc.d, prd.i, prc.e), prc.i, prc.f, prc.g, null, null, prc.h);
        if (prc.k.n.a(pri)) {
            a = prc.k.k.a(pri);
        } else {
            ptn ptn = Status.a;
            pzr.a((Object) ptn, (Object) "Result must not be null");
            ptg pum = new pum();
            pum.a(ptn);
            a = pum;
        }
        return new tfv(a, tdy.a);
    }
}
