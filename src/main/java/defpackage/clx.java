package defpackage;

/* renamed from: clx */
public final class clx {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return (obj == null || obj2 == null) ? false : obj.equals(obj2);
    }
}
