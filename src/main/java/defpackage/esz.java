package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: esz */
final /* synthetic */ class esz implements OnClickListener {
    private final esy a;
    private final etc b;

    esz(esy esy, etc etc) {
        this.a = esy;
        this.b = etc;
    }

    public final void onClick(View view) {
        esy esy = this.a;
        etc etc = this.b;
        aaas aaas = esy.a;
        apxu apxu = etc.a.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
