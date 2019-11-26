package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwr */
final /* synthetic */ class iwr implements OnClickListener {
    private final iwo a;
    private final aaas b;

    iwr(iwo iwo, aaas aaas) {
        this.a = iwo;
        this.b = aaas;
    }

    public final void onClick(View view) {
        iwo iwo = this.a;
        aaas aaas = this.b;
        apxu apxu = iwo.f;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
