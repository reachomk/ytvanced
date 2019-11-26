package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: uro */
final /* synthetic */ class uro implements OnClickListener {
    private final urj a;
    private final aqhy b;

    uro(urj urj, aqhy aqhy) {
        this.a = urj;
        this.b = aqhy;
    }

    public final void onClick(View view) {
        urj urj = this.a;
        aqhy aqhy = this.b;
        if ((aqhy.a & 262144) != 0) {
            aaas aaas = urj.ac;
            apxu apxu = aqhy.o;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        urj.ab.v_();
        urj.dismiss();
    }
}
