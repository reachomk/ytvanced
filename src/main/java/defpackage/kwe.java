package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: kwe */
final /* synthetic */ class kwe implements OnClickListener {
    private final kwf a;
    private final vod b;
    private final aaas c;

    kwe(kwf kwf, vod vod, aaas aaas) {
        this.a = kwf;
        this.b = vod;
        this.c = aaas;
    }

    public final void onClick(View view) {
        kwf kwf = this.a;
        vod vod = this.b;
        aaas aaas = this.c;
        aoic aoic = kwf.a;
        if (aoic != null && (aoic.a & 32) != 0 && !vod.a(aoic)) {
            Map a = acwi.a(kwf.a);
            apxu apxu = kwf.a.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
    }
}
