package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yft */
final class yft implements OnClickListener {
    private final /* synthetic */ yfr a;

    yft(yfr yfr) {
        this.a = yfr;
    }

    public final void onClick(View view) {
        yfr yfr = this.a;
        if (!yfr.d) {
            aphj aphj = yfr.c.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yfr);
                yfr.d = true;
                aaas aaas = yfr.a;
                aphj aphj2 = yfr.c.f;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu = aphg2.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
