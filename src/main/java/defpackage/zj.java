package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: zj */
public class zj extends aac implements Map {
    private zt c;

    public zj(int i) {
        super(i);
    }

    public zj(aac aac) {
        super(aac);
    }

    private final zt a() {
        if (this.c == null) {
            this.c = new zi(this);
        }
        return this.c;
    }

    public final void putAll(Map map) {
        a(this.b + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Set entrySet() {
        zt a = a();
        if (a.a == null) {
            a.a = new zv(a);
        }
        return a.a;
    }

    public final Set keySet() {
        return a().d();
    }

    public final Collection values() {
        zt a = a();
        if (a.b == null) {
            a.b = new zw(a);
        }
        return a.b;
    }
}
