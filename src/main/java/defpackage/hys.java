package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hys */
final /* synthetic */ class hys implements OnClickListener {
    private final hyt a;
    private final aaas b;

    hys(hyt hyt, aaas aaas) {
        this.a = hyt;
        this.b = aaas;
    }

    public final void onClick(View view) {
        hyt hyt = this.a;
        aaas aaas = this.b;
        apxu apxu = hyt.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
