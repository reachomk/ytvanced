package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: knd */
final class knd extends jxw {
    public final xsc a;
    private final akoj b;

    public knd(Context context, akkq akkq, View view, aaas aaas, gal gal, hmc hmc, fas fas, xsc xsc) {
        super(context, akkq, view, aaas, gal, hmc, fas);
        this.b = new akoj((aaas) akop.a((Object) aaas, 1), (View) akop.a((Object) view, 2));
        this.a = xsc;
    }

    public final View K_() {
        return this.h;
    }

    /* renamed from: a */
    public final void a_(akor akor, azdt azdt) {
        ayym ayym = azdt.I;
        if (ayym == null) {
            ayym = ayym.c;
        }
        apxu apxu = null;
        if ((ayym.a & 1) != 0) {
            ayym = azdt.I;
            if (ayym == null) {
                ayym = ayym.c;
            }
            jxw.a(akor, ayym);
            a(akor, null);
        }
        akoj akoj = this.b;
        acvx acvx = akor.a;
        if ((azdt.a & 16384) != 0) {
            apxu = azdt.q;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        akoj.a(acvx, apxu, akor.b(), this);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.b.a();
    }
}
