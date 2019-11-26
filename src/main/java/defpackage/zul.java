package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zul */
final class zul implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ arxf b;

    zul(zwj zwj, arxf arxf) {
        this.a = zwj;
        this.b = arxf;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        if (zwj.g) {
            aaas aaas = zwj.l;
            apxu apxu = this.b.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
