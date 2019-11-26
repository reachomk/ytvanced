package defpackage;

/* renamed from: anad */
public final class anad {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(str).concat(" must not be null"));
    }

    public static boolean a(char c) {
        boolean z = true;
        if (c < 'a' || c > 'z') {
            if (c >= 'A') {
                return c <= 'Z' ? z : false;
            } else {
                z = false;
            }
        }
    }
}
