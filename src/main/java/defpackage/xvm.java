package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* renamed from: xvm */
final class xvm implements xvl {
    private static Method a;
    private static Method b;

    private xvm() {
    }

    public final void a() {
    }

    public final void a(String str) {
        if (str.length() >= 127) {
            str.substring(127);
        }
    }

    /* synthetic */ xvm(byte b) {
    }

    static {
        try {
            Class[] clsArr = new Class[]{Long.TYPE, String.class, Integer.TYPE};
            Class cls = Trace.class;
            a = cls.getDeclaredMethod("asyncTraceBegin", clsArr);
            b = cls.getDeclaredMethod("asyncTraceEnd", clsArr);
            a.setAccessible(true);
            b.setAccessible(true);
            cls.getDeclaredMethod("traceCounter", clsArr).setAccessible(true);
        } catch (Exception unused) {
        }
    }
}
