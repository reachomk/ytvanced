package defpackage;

import java.util.List;

/* renamed from: aikt */
public class aikt extends aikx {
    private final bcaa a;

    public aikt(bcaa bcaa, bcaa bcaa2) {
        super(bcaa);
        this.a = bcaa2;
    }

    public final aiki a(aikc aikc) {
        if (aikc == null) {
            return new aiks();
        }
        aikc aikc2 = (aikc) get();
        aikc2.c();
        for (int i : aikc.n) {
            aikc2.a(i, 0, a(aikc, i));
        }
        int e = aikc.e();
        if (e == -1) {
            return new aiks();
        }
        aikc2.b(e);
        bcaa bcaa = this.a;
        Long l = null;
        aizy aizy = bcaa != null ? (aizy) bcaa.get() : null;
        if (aizy != null) {
            ajmq p = aizy.p();
            if (p != null) {
                l = Long.valueOf(p.d());
            }
        }
        return new aiks(l);
    }

    /* Access modifiers changed, original: protected */
    public List a(aikc aikc, int i) {
        return aikb.a(aikc, i);
    }
}
