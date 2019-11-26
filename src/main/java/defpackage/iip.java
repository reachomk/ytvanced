package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iip */
final /* synthetic */ class iip implements OnClickListener {
    private final iiq a;
    private final aaas b;

    iip(iiq iiq, aaas aaas) {
        this.a = iiq;
        this.b = aaas;
    }

    public final void onClick(View view) {
        iiq iiq = this.a;
        aaas aaas = this.b;
        apxu apxu = iiq.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
