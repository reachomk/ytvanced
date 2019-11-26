package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wiq */
final /* synthetic */ class wiq implements OnClickListener {
    private final wih a;
    private final aqrn b;
    private final Map c;

    wiq(wih wih, aqrn aqrn, Map map) {
        this.a = wih;
        this.b = aqrn;
        this.c = map;
    }

    public final void onClick(View view) {
        aqro aqro;
        apxu apxu;
        wih wih = this.a;
        aqrn aqrn = this.b;
        Map map = this.c;
        if (aqrn.d() && aqrn.c()) {
            aqro = (aqro) aqrn.instance;
            if ((aqro.a & 1024) != 0) {
                aaas aaas = wih.d;
                apxu = aqro.i;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, map);
                wih.q.setTag(null);
                wih.c(aqrn);
                aqrn.a(false);
                return;
            }
        }
        if (aqrn.d() && !aqrn.c()) {
            aqro = (aqro) aqrn.instance;
            if ((aqro.a & 512) != 0) {
                aaas aaas2 = wih.d;
                apxu = aqro.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas2.a(apxu, map);
                wih.a(aqrn);
                wih.b(aqrn);
                aqrn.a(true);
                return;
            }
        }
        if (!(aqrn.d() || !aqrn.c() || (((aqro) aqrn.instance).a & 16) == 0 || ((AccessibilityManager) wih.a.getSystemService("accessibility")).isEnabled())) {
            wih.b.a(((aqro) aqrn.instance).d, xwe.a(wih.a, R.attr.cmtCreatorHeartTooltipBg, 0), wih.p);
        }
    }
}
