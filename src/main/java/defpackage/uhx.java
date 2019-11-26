package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: uhx */
public final class uhx {
    private static final Method a;

    public static String a(String str, String str2) {
        try {
            return (String) a.invoke(null, new Object[]{str, str2});
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return str2;
        }
    }

    static {
        Method method = null;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", new Class[]{String.class, String.class});
            cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
        } catch (Exception e) {
            ankx.a(e);
        } finally {
            a = method;
        }
    }
}
