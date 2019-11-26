package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kex */
final /* synthetic */ class kex implements OnClickListener {
    private final kev a;
    private final aaas b;

    kex(kev kev, aaas aaas) {
        this.a = kev;
        this.b = aaas;
    }

    public final void onClick(View view) {
        kev kev = this.a;
        aaas aaas = this.b;
        apxu apxu = kev.b;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
