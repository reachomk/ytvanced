package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ydv */
final /* synthetic */ class ydv implements OnClickListener {
    private final ydw a;
    private final aaas b;

    ydv(ydw ydw, aaas aaas) {
        this.a = ydw;
        this.b = aaas;
    }

    public final void onClick(View view) {
        ydw ydw = this.a;
        aaas aaas = this.b;
        aqir aqir = ydw.b;
        if ((aqir.a & 8) != 0) {
            apxu apxu = aqir.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        ydw.c();
    }
}
