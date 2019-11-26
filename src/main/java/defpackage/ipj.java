package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ipj */
final /* synthetic */ class ipj implements OnClickListener {
    private final ipg a;
    private final aaas b;

    ipj(ipg ipg, aaas aaas) {
        this.a = ipg;
        this.b = aaas;
    }

    public final void onClick(View view) {
        ipg ipg = this.a;
        aaas aaas = this.b;
        awvz awvz = ipg.c;
        if (!(awvz == null || (awvz.a & 32) == 0)) {
            ipg.a.a(3, new acvs(awvz.g.d()), null);
        }
        apxu apxu = ipg.b;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
