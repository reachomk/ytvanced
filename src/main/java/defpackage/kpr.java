package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kpr */
final class kpr implements OnClickListener {
    private final /* synthetic */ kpp a;

    kpr(kpp kpp) {
        this.a = kpp;
    }

    public final void onClick(View view) {
        kpp kpp = this.a;
        apxu apxu = kpp.e;
        if (apxu != null) {
            kpp.a.a(apxu);
        }
    }
}
