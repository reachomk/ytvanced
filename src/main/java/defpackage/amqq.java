package defpackage;

/* renamed from: amqq */
public final class amqq extends amqe {
    public static boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj != null) {
                return obj.equals(obj2) ? z : false;
            } else {
                z = false;
            }
        }
    }
}
