package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: anbg */
final class anbg implements anbf {
    public static final anbg a = new anbg();
    public static final Method b;

    anbg() {
    }

    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                b.invoke(th, new Object[]{th2});
            } catch (Throwable unused) {
                anbd.a.a(closeable, th, th2);
            }
        }
    }

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable unused) {
            method = null;
        }
        b = method;
    }
}
