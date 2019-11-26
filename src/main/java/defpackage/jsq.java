package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsq */
public final class jsq extends jrr implements vdc {
    public jsq(akkq akkq, akvo akvo, aaas aaas, acvx acvx, Context context, zwj zwj, jse jse) {
        super(akkq, akvo, aaas, acvx, context, zwj, jse);
    }

    public final boolean a(aaga aaga, akcb akcb) {
        if (!(aaga == null || akcb == null)) {
            ajtb ajtb = akcb.f;
            this.e = ajtb != null ? ajtb.c : null;
            axkp axkp = this.e;
            if (axkp != null && axkp.f.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public final int a(vow vow, boolean z) {
        this.f = false;
        if (this.e != null && vow.b == vra.USER_SKIPPED) {
            zwj zwj = this.d;
            if (zwj != null) {
                zwj.f();
            }
        }
        axkp axkp = this.e;
        if (!(axkp == null || (axkp.a & 4096) == 0)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
            aaas aaas = this.a;
            apxu apxu = this.e.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
        vra vra = vow.b;
        axkp = this.e;
        int i = 1;
        if (axkp != null) {
            int a = aqhe.a(axkp.o);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }
}
