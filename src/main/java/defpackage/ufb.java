package defpackage;

import java.util.LinkedHashMap;

/* renamed from: ufb */
final class ufb {
    public final int a = 100;
    private final LinkedHashMap b = new ufa(this);

    public final synchronized Object a(Object obj) {
        return this.b.get(obj);
    }

    public final synchronized void a(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }
}
