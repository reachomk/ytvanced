package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: yte */
final /* synthetic */ class yte implements xsd {
    private final ytb a;

    yte(ytb ytb) {
        this.a = ytb;
    }

    public final void a(Object obj) {
        ytb ytb = this.a;
        ymh ymh = (ymh) ((aadz) obj).e().a("technodrome_metadata", ymh.d.getParserForType());
        View view;
        if (ymh != null && ymh.c.size() > 0) {
            zal zal;
            if (ytb.k == null) {
                ytc ytc = ytb.f;
                ytb.k = new ysz((ytm) ytc.a((ytm) ytc.a.get(), 1), (zaq) ytc.a((zaq) ytc.b.get(), 2), (String) ytc.a(ytb.h, 3));
                zal = ytb.i;
                apa apa = ytb.k;
                zal.a();
                zal.b.a(apa);
            } else {
                zal = ytb.i;
                zal.a();
                zal.a.setVisibility(0);
            }
            ysz ysz = ytb.k;
            anyd anyd = ymh.c;
            ysz.c.clear();
            ysz.c.addAll(anyd);
            ysz.aa_();
            zal zal2 = ytb.i;
            ytd ytd = new ytd(ytb);
            zal2.a();
            view = zal2.a;
            if (view != null) {
                view.findViewById(R.id.close_rvr_button).setOnClickListener(new zao(ytd));
            }
            ytb.j.start();
            return;
        }
        view = ytb.i.a;
        if (view != null && view.getVisibility() == 0) {
            ytb.j.reverse();
        }
    }
}
