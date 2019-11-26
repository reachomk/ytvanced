package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bbei */
final class bbei {
    public final Map a;
    public final Map b;

    bbei(Map map, Map map2) {
        this.a = Collections.unmodifiableMap(new HashMap(map));
        this.b = Collections.unmodifiableMap(new HashMap(map2));
    }
}
