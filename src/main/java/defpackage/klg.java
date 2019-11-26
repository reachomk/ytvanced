package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: klg */
final /* synthetic */ class klg implements OnClickListener {
    private final klh a;
    private final aaas b;

    klg(klh klh, aaas aaas) {
        this.a = klh;
        this.b = aaas;
    }

    public final void onClick(View view) {
        klh klh = this.a;
        aaas aaas = this.b;
        apxu apxu = klh.l;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
