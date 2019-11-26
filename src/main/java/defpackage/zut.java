package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: zut */
final class zut implements Runnable {
    private final /* synthetic */ zuu a;

    zut(zuu zuu) {
        this.a = zuu;
    }

    public final void run() {
        zuq zuq = this.a.b;
        if (zuq.a()) {
            zuq.c();
        } else {
            zun zun = zuq.b;
            if (zun.c) {
                for (zuq zuq2 : zun.b) {
                    if (zuq2.a()) {
                        zuq2.c();
                        break;
                    }
                }
                zuq.b();
            } else {
                zuq.b();
            }
        }
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a.b);
        hashMap.put(acwi.b, Boolean.TRUE);
        zuu zuu = this.a;
        aaas aaas = zuu.a.k;
        apxu apxu = zuu.b.a.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
        this.a.c.run();
    }
}
