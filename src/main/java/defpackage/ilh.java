package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ilh */
final /* synthetic */ class ilh implements OnClickListener {
    private final ilf a;
    private final aaas b;

    ilh(ilf ilf, aaas aaas) {
        this.a = ilf;
        this.b = aaas;
    }

    public final void onClick(View view) {
        ilf ilf = this.a;
        aaas aaas = this.b;
        apxu apxu = ilf.i;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
