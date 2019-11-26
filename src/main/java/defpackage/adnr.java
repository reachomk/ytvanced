package defpackage;

import java.util.Collection;

/* renamed from: adnr */
public final class adnr extends aikx {
    private final xci a;

    public adnr(bcaa bcaa, xci xci) {
        super(bcaa);
        this.a = xci;
    }

    public final aiki a(aikc aikc) {
        adqi adqi = (adnh) ((aikc) get());
        this.a.a((Object) adqi);
        adqi.h = adqi.b.c();
        adqe adqe = adqi.h;
        if (adqe != null) {
            adqe.a(adqi.i);
        }
        adqi.b.a(adqi);
        if (aikc != null) {
            Collection a = aikb.a(aikc, 0);
            Collection a2 = aikb.a(aikc, 1);
            aikc aikc2 = adqi.m;
            aikc2.c();
            aikc2.a(0, 0, a);
            aikc2.a(1, 0, a2);
            int e = aikc.e();
            if (e != -1) {
                adqi.b(e);
            }
            return new adnu();
        }
        adqi.c();
        return null;
    }

    public final void a() {
        adqi adqi = (adnh) ((aikc) get());
        this.a.b(adqi);
        adqi.b.b(adqi);
    }
}
