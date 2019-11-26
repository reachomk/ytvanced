package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: amrs */
public final class amrs {
    private static final Object a;

    public static void a(Throwable th) {
        amqw.a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static void a(Throwable th, Class cls) {
        if (th != null) {
            amqw.a((Object) th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            amrs.a(th);
        }
    }

    @Deprecated
    public static RuntimeException b(Throwable th) {
        amrs.a(th);
        throw new RuntimeException(th);
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ankx.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object a() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            return obj;
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return obj;
        }
    }

    private static Method b() {
        try {
            Method a = amrs.a("getStackTraceDepth", Throwable.class);
            if (a != null) {
                a.invoke(amrs.a(), new Object[]{new Throwable()});
                return a;
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        return null;
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Object a = amrs.a();
        a = a;
        if (a != null) {
            amrs.a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            amrs.b();
        }
    }
}
