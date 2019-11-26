package defpackage;

/* renamed from: xtx */
public final class xtx {
    public static Object a(Class cls, Object... objArr) {
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Object obj2 = null;
            if (obj instanceof xfc) {
                obj = ((xfc) obj).n();
                if (cls.isInstance(obj)) {
                    obj2 = obj;
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        throw new IllegalArgumentException(String.format("No component was found for %s", new Object[]{cls.getCanonicalName()}));
    }
}
