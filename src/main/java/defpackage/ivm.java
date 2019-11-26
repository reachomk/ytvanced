package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ivm */
final /* synthetic */ class ivm implements OnClickListener {
    private final ivn a;
    private final aaas b;

    ivm(ivn ivn, aaas aaas) {
        this.a = ivn;
        this.b = aaas;
    }

    public final void onClick(View view) {
        ivn ivn = this.a;
        aaas aaas = this.b;
        apxu apxu = ivn.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
