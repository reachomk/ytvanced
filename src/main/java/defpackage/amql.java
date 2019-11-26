package defpackage;

/* renamed from: amql */
public final class amql {
    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static amqo a(Object obj) {
        return new amqo(obj.getClass().getSimpleName());
    }
}
