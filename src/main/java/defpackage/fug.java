package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fug */
public final class fug implements aaas {
    private final aaas a;
    private final Map b;

    public fug(aaas aaas, Map map) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = Collections.unmodifiableMap((Map) amqw.a((Object) map));
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

    public final void a(apxu apxu, Map map) {
        if (map != null) {
            Map hashMap = new HashMap(this.b);
            hashMap.putAll(map);
            this.a.a(apxu, hashMap);
            return;
        }
        this.a.a(apxu, this.b);
    }
}
