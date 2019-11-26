package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: aljj */
final class aljj implements OnClickListener {
    private final /* synthetic */ aljg a;

    aljj(aljg aljg) {
        this.a = aljg;
    }

    public final void onClick(View view) {
        alff alff = (alff) this.a.ae;
        aqia aqia = (aqia) alff.d;
        if (aqia != null && (aqia.a & 4) != 0) {
            aaas aaas = alff.a;
            apxu apxu = aqia.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
