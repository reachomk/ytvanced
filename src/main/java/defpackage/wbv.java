package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wbv */
public final class wbv implements tqm {
    private final Object a;
    private final aojc b;
    private final aaas c;
    private final Map d;

    public wbv(Object obj, aojc aojc, aaas aaas) {
        Map a;
        this.a = obj;
        this.b = aojc;
        this.c = aaas;
        aojq aojq = aojc.d;
        if (aojq == null) {
            aojq = aojq.b;
        }
        Map map = null;
        if (aojq != null) {
            a = amvr.a(aojq.a.size());
            for (Entry entry : Collections.unmodifiableMap(aojq.a).entrySet()) {
                a.put((String) entry.getKey(), ((aojv) entry.getValue()).a);
            }
        } else {
            a = null;
        }
        if (a != null) {
            map = afti.b(a);
        }
        this.d = map;
    }

    public final void a(tps tps, View view) {
        a(this.b.b, tps);
    }

    public final void b(tps tps, View view) {
        a(this.b.c, tps);
    }

    private final void a(List list, tps tps) {
        vqo a = vqo.a(tps, this.d);
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
        hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{a});
        aabd.a(this.c, list, hashMap);
    }
}
