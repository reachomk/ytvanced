package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hyx */
final /* synthetic */ class hyx implements OnClickListener {
    private final hyu a;
    private final aaas b;

    hyx(hyu hyu, aaas aaas) {
        this.a = hyu;
        this.b = aaas;
    }

    public final void onClick(View view) {
        hyu hyu = this.a;
        aaas aaas = this.b;
        apxu apxu = hyu.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
