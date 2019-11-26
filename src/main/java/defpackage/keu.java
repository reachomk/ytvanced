package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: keu */
final /* synthetic */ class keu implements OnClickListener {
    private final kev a;
    private final aaas b;

    keu(kev kev, aaas aaas) {
        this.a = kev;
        this.b = aaas;
    }

    public final void onClick(View view) {
        kev kev = this.a;
        aaas aaas = this.b;
        apxu apxu = kev.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
