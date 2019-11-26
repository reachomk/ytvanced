package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahat */
final /* synthetic */ class ahat implements OnClickListener {
    private final ahau a;
    private final ahcr b;

    ahat(ahau ahau, ahcr ahcr) {
        this.a = ahau;
        this.b = ahcr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aphg aphg;
        ahau ahau = this.a;
        ahcr ahcr = this.b;
        if (i == -1) {
            if (ahcr != null) {
                ahcr.a();
            }
            aphg = ahau.g;
        } else if (i != -2) {
            aphg = null;
        } else {
            if (ahcr != null) {
                ahcr.b();
            }
            aphg = ahau.h;
        }
        if (!(aphg == null || ahau.f == null)) {
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(avjd.b);
                apxu.a(access$000);
                if (!apxu.h.a(access$000.d)) {
                    apxu = ahau.f.a(apxu);
                }
                ahau.b.a(apxu, null);
            } else if ((aphg.a & 2048) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aphg);
                aaas aaas = ahau.b;
                apxu apxu2 = aphg.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, hashMap);
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                if ((apxu.a & 1) != 0) {
                    acvx acvx = ahau.f;
                    apxu apxu3 = aphg.l;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                    acvx.a(3, new acvs(apxu3.b), null);
                }
            }
        }
        dialogInterface.dismiss();
    }
}
