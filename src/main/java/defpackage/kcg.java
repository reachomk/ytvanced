package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kcg */
final /* synthetic */ class kcg implements OnClickListener {
    private final kch a;
    private final aaas b;

    kcg(kch kch, aaas aaas) {
        this.a = kch;
        this.b = aaas;
    }

    public final void onClick(View view) {
        kch kch = this.a;
        aaas aaas = this.b;
        apxu apxu = kch.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
