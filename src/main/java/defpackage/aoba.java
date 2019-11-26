package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: aoba */
final class aoba implements PrivilegedExceptionAction {
    aoba() {
    }

    private static Unsafe a() {
        Class cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        return null;
    }

    public final /* synthetic */ Object run() {
        return aoba.a();
    }
}
