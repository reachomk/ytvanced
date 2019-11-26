package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: koj */
final class koj implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ kog b;

    koj(kog kog, aaas aaas) {
        this.b = kog;
        this.a = aaas;
    }

    public final void onClick(View view) {
        ajtc ajtc = this.b.a;
        if (ajtc != null) {
            aqge aqge = ajtc.k;
            if (aqge != null) {
                awtc awtc = aqge.b;
                if (awtc == null) {
                    awtc = awtc.d;
                }
                if ((awtc.a & 4) != 0) {
                    aaas aaas = this.a;
                    awtc awtc2 = this.b.a.k.b;
                    if (awtc2 == null) {
                        awtc2 = awtc.d;
                    }
                    apxu apxu = awtc2.c;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                }
            }
        }
    }
}
