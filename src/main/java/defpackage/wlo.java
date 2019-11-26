package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wlo */
final class wlo implements OnClickListener {
    private final /* synthetic */ wlp a;
    private final /* synthetic */ aphv b;
    private final /* synthetic */ Map c;
    private final /* synthetic */ wlm d;

    wlo(wlm wlm, wlp wlp, aphv aphv, Map map) {
        this.d = wlm;
        this.a = wlp;
        this.b = aphv;
        this.c = map;
    }

    public final void onClick(View view) {
        wlp wlp = this.a;
        if (wlp != null) {
            wlp.g();
        }
        aaas aaas = this.d.a;
        apxu apxu = this.b.i;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, this.c);
    }
}
