package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxu */
final /* synthetic */ class jxu implements OnClickListener {
    private final jxv a;
    private final aaas b;

    jxu(jxv jxv, aaas aaas) {
        this.a = jxv;
        this.b = aaas;
    }

    public final void onClick(View view) {
        jxv jxv = this.a;
        aaas aaas = this.b;
        aqas aqas = jxv.a;
        if (aqas != null && (aqas.a & 2) != 0) {
            apxu apxu = aqas.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
