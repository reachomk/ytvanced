package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: kgb */
final /* synthetic */ class kgb implements OnClickListener {
    private final kfy a;
    private final avls b;
    private final Map c;

    kgb(kfy kfy, avls avls, Map map) {
        this.a = kfy;
        this.b = avls;
        this.c = map;
    }

    public final void onClick(View view) {
        kfy kfy = this.a;
        avls avls = this.b;
        Map map = this.c;
        if ((avls.a & 4) != 0) {
            aaas aaas = kfy.b;
            apxu apxu = avls.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
    }
}
