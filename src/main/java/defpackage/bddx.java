package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: bddx */
public final class bddx {
    public static final Unsafe a;
    private static final boolean b = (System.getProperty("rx.unsafe-disable") != null);

    public static boolean a() {
        return (a == null || b) ? false : true;
    }

    public static long a(Class cls, String str) {
        try {
            return a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        a = unsafe;
    }
}
