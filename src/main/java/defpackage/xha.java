package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: xha */
final class xha extends HashMap {
    public xha(int i) {
        super(i, 1.0f);
    }

    public final Object get(Object obj) {
        return super.get(xha.a(obj));
    }

    public final boolean containsKey(Object obj) {
        return super.containsKey(xha.a(obj));
    }

    private static Object a(Object obj) {
        return obj instanceof String ? xha.a((String) obj) : obj;
    }

    private static String a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : null;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(xha.a((String) obj), obj2);
    }
}
