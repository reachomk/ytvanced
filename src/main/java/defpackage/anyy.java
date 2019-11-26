package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: anyy */
public final class anyy extends LinkedHashMap {
    public static final anyy b;
    public boolean a = true;

    private anyy() {
    }

    private anyy(Map map) {
        super(map);
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final void clear() {
        c();
        super.clear();
    }

    public final Object put(Object obj, Object obj2) {
        c();
        anxw.a(obj);
        anxw.a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        c();
        for (Object next : map.keySet()) {
            anxw.a(next);
            anxw.a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            obj = (Map) obj;
            if (this != obj) {
                if (size() == obj.size()) {
                    for (Entry entry : entrySet()) {
                        if (obj.containsKey(entry.getKey())) {
                            boolean equals;
                            Object value = entry.getValue();
                            Object obj2 = obj.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return anxw.c((byte[]) obj);
        }
        if (!(obj instanceof anxv)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += anyy.a(entry.getValue()) ^ anyy.a(entry.getKey());
        }
        return i;
    }

    public final anyy a() {
        return !isEmpty() ? new anyy(this) : new anyy();
    }

    public final void b() {
        this.a = false;
    }

    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        anyy anyy = new anyy();
        b = anyy;
        anyy.b();
    }
}
