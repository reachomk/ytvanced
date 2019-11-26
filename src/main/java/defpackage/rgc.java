package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: rgc */
public final class rgc extends LinkedHashMap {
    public static final rgc b;
    public boolean a = true;

    private rgc() {
    }

    private rgc(Map map) {
        super(map);
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final Object put(Object obj, Object obj2) {
        b();
        rfc.a(obj);
        rfc.a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        b();
        for (Object next : map.keySet()) {
            rfc.a(next);
            rfc.a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        b();
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
            return rfc.c((byte[]) obj);
        }
        if (!(obj instanceof rfd)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += rgc.a(entry.getValue()) ^ rgc.a(entry.getKey());
        }
        return i;
    }

    public final rgc a() {
        return !isEmpty() ? new rgc(this) : new rgc();
    }

    public final void b() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        rgc rgc = new rgc();
        b = rgc;
        rgc.a = false;
    }
}
