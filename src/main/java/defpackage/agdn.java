package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: agdn */
final class agdn {
    public final Map a;
    public final long b;
    private final Map c;
    private final Map d;
    private final Map e;

    agdn(String str, Set set, LinkedHashSet linkedHashSet, List list, List list2, long j) {
        amur a;
        amur a2 = amur.a(str, set);
        amur a3 = amur.a(str, linkedHashSet);
        amur a4 = amur.a(str, list);
        if (list2 != null) {
            a = amur.a(str, list2);
        } else {
            a = Collections.emptyMap();
        }
        this(a2, a3, a4, a, j);
    }

    agdn(Map map, Map map2, Map map3, Map map4, long j) {
        this.a = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.b = j;
    }

    public final LinkedHashSet a(String str) {
        return (LinkedHashSet) this.c.get(str);
    }

    public final List b(String str) {
        return (List) this.d.get(str);
    }

    public final List c(String str) {
        return (List) this.e.get(str);
    }
}
