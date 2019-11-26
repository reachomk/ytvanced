package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zub */
final class zub implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ arwp b;

    zub(zwj zwj, arwp arwp) {
        this.a = zwj;
        this.b = arwp;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        if (zwj.g) {
            aaas aaas = zwj.k;
            apxu apxu = this.b.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
