package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wnu */
final /* synthetic */ class wnu implements OnClickListener {
    private final wnp a;
    private final aphg b;

    wnu(wnp wnp, aphg aphg) {
        this.a = wnp;
        this.b = aphg;
    }

    public final void onClick(View view) {
        wnp wnp = this.a;
        Object obj = this.b;
        wnp.b();
        Map a = acwi.a(obj);
        int i = obj.a;
        aaas aaas;
        apxu apxu;
        if ((i & 2048) != 0) {
            aaas = wnp.a;
            apxu = obj.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        } else if ((i & 4096) != 0) {
            aaas = wnp.a;
            apxu = obj.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        } else if ((i & 8192) != 0) {
            aaas = wnp.a;
            apxu = obj.n;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
    }
}
