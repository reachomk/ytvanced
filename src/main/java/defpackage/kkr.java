package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kkr */
final /* synthetic */ class kkr implements OnClickListener {
    private final kkp a;

    kkr(kkp kkp) {
        this.a = kkp;
    }

    public final void onClick(View view) {
        kkp kkp = this.a;
        aphg a = kkp.a(kkp.i);
        aaas aaas;
        apxu apxu;
        if (a == null || (a.a & 4096) == 0) {
            a = kkp.q;
            if ((a.a & 4096) == 0) {
                kkp.h.a(kkp.p);
                return;
            }
            aaas = kkp.d;
            apxu = a.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
            return;
        }
        aaas = kkp.d;
        apxu = a.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
