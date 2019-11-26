package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zuk */
final class zuk implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ arxb b;

    zuk(zwj zwj, arxb arxb) {
        this.a = zwj;
        this.b = arxb;
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
