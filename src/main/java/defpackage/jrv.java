package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jrv */
final class jrv implements OnClickListener {
    private final /* synthetic */ jrr a;

    public final void onClick(View view) {
        jrr jrr = this.a;
        axkp axkp = jrr.e;
        if (axkp != null && (axkp.a & 512) != 0) {
            aaas aaas = jrr.a;
            apxu apxu = axkp.j;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }

    /* synthetic */ jrv(jrr jrr) {
        this.a = jrr;
    }
}
