package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: allx */
final class allx implements OnClickListener {
    private final /* synthetic */ allu a;

    allx(allu allu) {
        this.a = allu;
    }

    public final void onClick(View view) {
        allu allu = this.a;
        aomo aomo = allu.b;
        if (aomo != null) {
            aphj aphj = aomo.b;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", allu);
                aaas aaas = allu.a;
                aphj aphj2 = allu.b.b;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu = aphg2.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
