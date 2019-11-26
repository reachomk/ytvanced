package defpackage;

import java.io.Serializable;

/* renamed from: amwe */
public final class amwe extends amwg implements Serializable {
    public static final amwe a = new amwe();
    public static final long serialVersionUID = 0;

    private final Object readResolve() {
        return a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private amwe() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        amqw.a(obj);
        amqw.a(obj2);
        return obj.compareTo(obj2);
    }
}
