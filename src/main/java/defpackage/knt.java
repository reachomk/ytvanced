package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: knt */
final /* synthetic */ class knt implements OnClickListener {
    private final knq a;
    private final azem b;

    knt(knq knq, azem azem) {
        this.a = knq;
        this.b = azem;
    }

    public final void onClick(View view) {
        apxu apxu;
        knq knq = this.a;
        azem azem = this.b;
        aaas aaas = knq.b;
        appu appu = azem.f;
        if (appu == null) {
            appu = appu.c;
        }
        appw appw = appu.b;
        if (appw == null) {
            appw = appw.f;
        }
        if ((appw.a & 2) != 0) {
            appu appu2 = azem.f;
            if (appu2 == null) {
                appu2 = appu.c;
            }
            appw appw2 = appu2.b;
            if (appw2 == null) {
                appw2 = appw.f;
            }
            apxu = appw2.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        aaas.a(apxu, null);
    }
}
