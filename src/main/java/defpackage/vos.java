package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: vos */
public final class vos implements tqm {
    private final swf a;
    private final aoge b;
    private final Map c;

    public vos(swf swf, aoge aoge) {
        Map a;
        this.a = swf;
        this.b = aoge;
        aojq aojq = aoge.d;
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
        this.c = map;
    }

    public final void a(tps tps, View view) {
        azsr azsr = this.b.b;
        if (azsr == null) {
            azsr = azsr.a;
        }
        a(azsr, tps, view);
    }

    public final void b(tps tps, View view) {
        azsr azsr = this.b.c;
        if (azsr == null) {
            azsr = azsr.a;
        }
        a(azsr, tps, view);
    }

    private final void a(azsr azsr, tps tps, View view) {
        vqo a = vqo.a(tps, this.c);
        aked c = akee.c();
        c.a(null);
        c.a(Arrays.asList(new aftl[]{a}));
        skk g = skh.g();
        if (view != null) {
            g.a(view);
        }
        g.a(c.a());
        this.a.a(azsr.toByteArray(), g.a()).c();
    }
}
