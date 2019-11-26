package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jru */
final class jru implements OnClickListener {
    private final /* synthetic */ jrr a;

    public final void onClick(View view) {
        jrr jrr = this.a;
        axkp axkp = jrr.e;
        if (axkp != null) {
            if ((axkp.a & 64) != 0) {
                Map hashMap = new HashMap(2);
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", jrr.e);
                hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{jrr.c});
                aaas aaas = jrr.a;
                apxu apxu = jrr.e.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
            axkp = jrr.e;
            if ((axkp.a & 32) != 0) {
                jrr.b.a(3, new acvs(axkp.g.d()), null);
            }
            zwj zwj = jrr.d;
            if (zwj != null) {
                if (jrr.g) {
                    zwj.e();
                } else if (jrr.f) {
                    zwj.b(-1, true);
                } else {
                    zwj.b(-1);
                }
            }
        }
    }

    /* synthetic */ jru(jrr jrr) {
        this.a = jrr;
    }
}
