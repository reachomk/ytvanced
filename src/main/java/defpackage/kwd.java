package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: kwd */
final /* synthetic */ class kwd implements OnClickListener {
    private final kwa a;
    private final vod b;
    private final aaas c;

    kwd(kwa kwa, vod vod, aaas aaas) {
        this.a = kwa;
        this.b = vod;
        this.c = aaas;
    }

    public final void onClick(View view) {
        kwa kwa = this.a;
        vod vod = this.b;
        aaas aaas = this.c;
        aogr aogr = kwa.a;
        if (aogr != null && (aogr.a & 4) != 0 && !vod.a(aogr)) {
            Map a = acwi.a(kwa.a);
            apxu apxu = kwa.a.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
    }
}
