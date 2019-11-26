package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aaat */
public final class aaat implements aaan {
    private final Map a;

    public aaat(Map map) {
        this.a = new HashMap(map);
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

    @Deprecated
    public aaat() {
        this(new HashMap());
    }

    @Deprecated
    public final void a(aaap aaap, Class... clsArr) {
        this.a.put(clsArr[0], aaap);
    }

    public final aaap a(apxu apxu) {
        Object a = aaar.a(apxu);
        if (a != null) {
            aaap aaap = (aaap) this.a.get(a.getClass());
            if (aaap != null) {
                return aaap;
            }
        }
        return aaap.t;
    }
}
