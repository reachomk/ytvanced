package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: aaak */
public final class aaak implements aaan {
    private final Map a;

    public aaak(Map map) {
        this.a = map;
    }

    public final void a(apxu apxu, Map map) {
        aaam.a(this, apxu, map);
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final aaap a(apxu apxu) {
        Object a = aaar.a(apxu);
        if (a == null) {
            return aaap.t;
        }
        bcaa bcaa = (bcaa) this.a.get(a.getClass());
        if (bcaa == null) {
            return aaap.t;
        }
        aaap aaap = (aaap) bcaa.get();
        if (aaap == null) {
            aaap = aaap.t;
        }
        return aaap;
    }
}
