package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rge */
final class rge implements rgb {
    rge() {
    }

    public final Map a(Object obj) {
        return (rgc) obj;
    }

    public final rfz b() {
        throw new NoSuchMethodError();
    }

    public final Map b(Object obj) {
        return (rgc) obj;
    }

    public final boolean c(Object obj) {
        return !((rgc) obj).a;
    }

    public final Object d(Object obj) {
        ((rgc) obj).a = false;
        return obj;
    }

    public final Object a() {
        return rgc.b.a();
    }

    public final Object a(Object obj, Object obj2) {
        obj = (rgc) obj;
        rgc rgc = (rgc) obj2;
        if (!rgc.isEmpty()) {
            if (!obj.a) {
                obj = obj.a();
            }
            obj.b();
            if (!rgc.isEmpty()) {
                obj.putAll(rgc);
                return obj;
            }
        }
        return obj;
    }

    public final int e(Object obj) {
        rgc rgc = (rgc) obj;
        if (rgc.isEmpty()) {
            return 0;
        }
        Iterator it = rgc.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
