package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: amvr */
public final class amvr {
    public static HashMap a() {
        return new HashMap();
    }

    public static HashMap a(int i) {
        return new HashMap(amvr.b(i));
    }

    static int b(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        } else {
            amss.a(i, "expectedSize");
            return i + 1;
        }
    }

    public static Entry a(Object obj, Object obj2) {
        return new amum(obj, obj2);
    }

    static Entry a(Entry entry) {
        amqw.a((Object) entry);
        return new amvw(entry);
    }

    static Object a(Map map, Object obj) {
        amqw.a((Object) map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }
}
