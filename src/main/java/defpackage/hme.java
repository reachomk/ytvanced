package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hme */
final /* synthetic */ class hme implements OnClickListener {
    private final hmf a;
    private final aaas b;

    hme(hmf hmf, aaas aaas) {
        this.a = hmf;
        this.b = aaas;
    }

    public final void onClick(View view) {
        hmf hmf = this.a;
        aaas aaas = this.b;
        agqi agqi = hmf.b;
        if (agqi != null) {
            aaas.a(ekc.a(agqi.a), null);
        }
    }
}
