package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kpo */
final class kpo implements OnClickListener {
    private final /* synthetic */ kpp a;

    kpo(kpp kpp) {
        this.a = kpp;
    }

    public final void onClick(View view) {
        kpp kpp = this.a;
        apxu apxu = kpp.d;
        if (apxu != null) {
            kpp.a.a(apxu);
        }
        this.a.b.a();
    }
}
