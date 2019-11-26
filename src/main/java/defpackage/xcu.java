package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: xcu */
final class xcu implements xcn {
    public final Method a;
    private final WeakReference b;
    private final int c;

    xcu(Object obj, Method method) {
        this.b = new WeakReference(amqw.a(obj));
        this.a = (Method) amqw.a((Object) method);
        this.a.setAccessible(true);
        this.c = Arrays.hashCode(new Object[]{obj, this.a});
    }

    public final void a(Object obj) {
        Object obj2 = this.b.get();
        if (obj2 != null) {
            try {
                this.a.invoke(obj2, new Object[]{obj});
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xcu) {
            xcu xcu = (xcu) obj;
            return xcu.b.get() == this.b.get() && this.a.equals(xcu.a);
        }
    }
}
