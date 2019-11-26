package defpackage;

import java.lang.reflect.Method;

/* renamed from: xvh */
final class xvh {
    public static Method a;

    static {
        try {
            a = ClassLoader.getSystemClassLoader().loadClass("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
        } catch (Exception unused) {
        }
    }
}
