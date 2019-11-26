package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: anag */
final class anag {
    public final Object a;
    public final Method b;
    private final Method c;

    public static anag a() {
        String str = "sun.misc.JavaLangAccess";
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName(str).getMethod("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
            Method method2 = Class.forName(str).getMethod("getStackTraceDepth", new Class[]{Throwable.class});
            method.invoke(invoke, new Object[]{new Throwable(), Integer.valueOf(0)});
            ((Integer) method2.invoke(invoke, new Object[]{new Throwable()})).intValue();
            return new anag(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private anag(Object obj, Method method, Method method2) {
        this.a = obj;
        this.c = method;
        this.b = method2;
    }

    public final StackTraceElement a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.c.invoke(this.a, new Object[]{th, Integer.valueOf(i)});
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
