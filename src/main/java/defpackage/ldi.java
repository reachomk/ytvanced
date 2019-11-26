package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ldi */
final /* synthetic */ class ldi implements epk {
    private final ldj a;

    ldi(ldj ldj) {
        this.a = ldj;
    }

    public final void a(Object obj, List list) {
        ldj ldj = this.a;
        if (!ldj.b.a(obj)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            aabd.a(ldj.a, list, hashMap);
        }
    }
}
