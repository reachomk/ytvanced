package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;

/* renamed from: lrs */
public final class lrs implements ltv {
    private final RecyclerView a;
    private final ans b;
    private final ltc c;

    public lrs(ltc ltc, RecyclerView recyclerView, bcaa bcaa, akpe akpe, acvx acvx, akwy akwy) {
        recyclerView.getContext();
        apn ans = new ans();
        this.a = recyclerView;
        this.b = ans;
        this.c = ltc;
        recyclerView.a(ans);
        recyclerView.a(null);
        apa a = akpe.a((akpb) bcaa.get());
        a.a(ltc.c);
        a.a(new akod(acvx));
        a.a(new akxx(akwy));
        recyclerView.a(a);
    }

    public final void a(Configuration configuration) {
        if (configuration.orientation == 2) {
            apa apa = this.a.m;
            if (apa != null) {
                apa.aa_();
            }
        }
    }

    public final void a(aafv aafv) {
        ltc ltc = this.c;
        ltc.a();
        if (aafv != null) {
            aafn aafn = aafv.e;
            if (aafn != null) {
                for (akad akad : aafn.a.b) {
                    ajwt ajwt = akad.c;
                    if (!(ajwt == null || ajwt.b == null)) {
                        aknh akpk = new akpk();
                        akpk.addAll(ltc.b.a(ajwt.b));
                        ltc.c.a(akpk);
                    }
                    axpw axpw = akad.A;
                    if (axpw != null) {
                        ltc.d = ltc.a.a(axpw);
                        ltc.d.b();
                        ltc.c.a(ltc.d.d);
                    }
                }
            }
        }
        if (this.c.c.isEmpty()) {
            this.c.a();
        } else {
            this.b.a_(0, 0);
        }
    }

    public final void a() {
        this.c.a();
    }
}
