package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jrz */
final /* synthetic */ class jrz implements epk {
    private final jrx a;

    jrz(jrx jrx) {
        this.a = jrx;
    }

    public final void a(Object obj, List list) {
        jrx jrx = this.a;
        if (obj != null && !jrx.b.a(obj)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{jrx.d});
            aabd.a(jrx.a, list, hashMap);
        }
    }
}
