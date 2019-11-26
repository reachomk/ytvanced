package defpackage;

import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: ufv */
final class ufv {
    public static final Method a;
    public static final Method b;
    public static final Object c;
    private static final Method d;
    private static final Field e;
    private static final Field f;
    private static final Field g;
    private static final Throwable h;

    static ufu a(String str) {
        return (ufu) ufv.a(new ufy(str));
    }

    static ufu a(FileDescriptor fileDescriptor) {
        return (ufu) ufv.a(new ufx(fileDescriptor));
    }

    public static ufu a(Object obj) {
        long longValue = ((Long) e.get(obj)).longValue();
        long longValue2 = ((Long) f.get(obj)).longValue();
        int intValue = ((Integer) g.get(obj)).intValue();
        return new ufu(longValue, longValue2, ((Boolean) d.invoke(null, new Object[]{Integer.valueOf(intValue)})).booleanValue(), (byte) 0);
    }

    private static Object a(Callable callable) {
        try {
            if (h == null) {
                return callable.call();
            }
            throw new IOException(h);
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    static {
        Method declaredMethod;
        Throwable th;
        Field field;
        Method method;
        Field field2;
        Throwable th2;
        Object obj;
        Field field3 = null;
        Method declaredMethod2;
        try {
            Field declaredField;
            Class cls = Class.forName("libcore.io.Libcore");
            Class cls2 = Class.forName("libcore.io.StructStat");
            Class cls3 = Class.forName("libcore.io.OsConstants");
            Class cls4 = Class.forName("libcore.io.ForwardingOs");
            declaredMethod2 = cls3.getDeclaredMethod("S_ISLNK", new Class[]{Integer.TYPE});
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod = cls4.getDeclaredMethod("lstat", new Class[]{String.class});
            } catch (Throwable th3) {
                th = th3;
                field = null;
                method = field;
                declaredMethod = method;
                field2 = declaredMethod;
                th2 = th;
                obj = field2;
                d = declaredMethod2;
                a = declaredMethod;
                b = method;
                e = field3;
                f = field2;
                g = field;
                c = obj;
                h = th2;
            }
            try {
                method = cls4.getDeclaredMethod("fstat", new Class[]{FileDescriptor.class});
            } catch (Throwable th4) {
                th = th4;
                field = null;
                method = field;
                field2 = method;
                th2 = th;
                obj = field2;
                d = declaredMethod2;
                a = declaredMethod;
                b = method;
                e = field3;
                f = field2;
                g = field;
                c = obj;
                h = th2;
            }
            try {
                declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                obj = declaredField.get(cls);
                try {
                    declaredField = cls2.getField("st_dev");
                } catch (Throwable th5) {
                    field2 = null;
                    th2 = th5;
                    field = field2;
                    d = declaredMethod2;
                    a = declaredMethod;
                    b = method;
                    e = field3;
                    f = field2;
                    g = field;
                    c = obj;
                    h = th2;
                }
                try {
                    field2 = cls2.getField("st_ino");
                    try {
                        field = cls2.getField("st_mode");
                    } catch (Throwable th52) {
                        th2 = th52;
                        field = null;
                        field3 = declaredField;
                        d = declaredMethod2;
                        a = declaredMethod;
                        b = method;
                        e = field3;
                        f = field2;
                        g = field;
                        c = obj;
                        h = th2;
                    }
                } catch (Throwable th522) {
                    field2 = null;
                    th2 = th522;
                    field = field2;
                    field3 = declaredField;
                    d = declaredMethod2;
                    a = declaredMethod;
                    b = method;
                    e = field3;
                    f = field2;
                    g = field;
                    c = obj;
                    h = th2;
                }
            } catch (Throwable th6) {
                th = th6;
                field = null;
                field2 = field;
                th2 = th;
                obj = field2;
                d = declaredMethod2;
                a = declaredMethod;
                b = method;
                e = field3;
                f = field2;
                g = field;
                c = obj;
                h = th2;
            }
            try {
                declaredField.setAccessible(true);
                field2.setAccessible(true);
                field.setAccessible(true);
                d = declaredMethod2;
                a = declaredMethod;
                b = method;
                e = declaredField;
                f = field2;
                g = field;
                c = obj;
                h = null;
            } catch (Throwable th7) {
                th2 = th7;
                field3 = declaredField;
                d = declaredMethod2;
                a = declaredMethod;
                b = method;
                e = field3;
                f = field2;
                g = field;
                c = obj;
                h = th2;
            }
        } catch (Throwable th8) {
            th = th8;
            field = null;
            declaredMethod2 = field;
            method = declaredMethod2;
            declaredMethod = method;
            field2 = declaredMethod;
            th2 = th;
            obj = field2;
            d = declaredMethod2;
            a = declaredMethod;
            b = method;
            e = field3;
            f = field2;
            g = field;
            c = obj;
            h = th2;
        }
    }
}
