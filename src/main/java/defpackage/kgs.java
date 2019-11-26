package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kgs */
final class kgs implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ kgt b;

    kgs(kgt kgt, aaas aaas) {
        this.b = kgt;
        this.a = aaas;
    }

    public final void onClick(View view) {
        awjb awjb = this.b.a;
        if (awjb != null && (awjb.a & 2) != 0) {
            aaas aaas = this.a;
            apxu apxu = awjb.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
