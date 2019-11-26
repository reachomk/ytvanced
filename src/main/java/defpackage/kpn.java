package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kpn */
final class kpn implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ kpk b;

    kpn(kpk kpk, aaas aaas) {
        this.b = kpk;
        this.a = aaas;
    }

    public final void onClick(View view) {
        ajvv ajvv = this.b.a;
        if (ajvv != null) {
            arse arse = ajvv.k;
            if (arse != null && (arse.a & 1) != 0) {
                awtc awtc = arse.b;
                if (awtc == null) {
                    awtc = awtc.d;
                }
                if ((awtc.a & 4) != 0) {
                    aaas aaas = this.a;
                    awtc awtc2 = this.b.a.k.b;
                    if (awtc2 == null) {
                        awtc2 = awtc.d;
                    }
                    apxu apxu = awtc2.c;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                }
            }
        }
    }
}
