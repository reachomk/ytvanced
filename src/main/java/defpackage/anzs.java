package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: anzs */
final class anzs {
    public static final anzs a = new anzs();
    private final aoac b = new anyr();
    private final ConcurrentMap c = new ConcurrentHashMap();

    public final anzz a(Class cls) {
        String str = "messageType";
        anxw.a((Object) cls, str);
        anzz anzz = (anzz) this.c.get(cls);
        if (anzz == null) {
            anzz = this.b.a(cls);
            anxw.a((Object) cls, str);
            anxw.a((Object) anzz, "schema");
            anzz anzz2 = (anzz) this.c.putIfAbsent(cls, anzz);
            return anzz2 == null ? anzz : anzz2;
        }
    }

    public final anzz a(Object obj) {
        return a(obj.getClass());
    }

    private anzs() {
    }
}
