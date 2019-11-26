package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ydp */
final /* synthetic */ class ydp implements OnClickListener {
    private final ydq a;
    private final aaas b;

    ydp(ydq ydq, aaas aaas) {
        this.a = ydq;
        this.b = aaas;
    }

    public final void onClick(View view) {
        ydq ydq = this.a;
        aaas aaas = this.b;
        apxu apxu = ydq.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
