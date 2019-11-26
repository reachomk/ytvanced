package defpackage;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* renamed from: amzm */
public final class amzm extends amyv {
    public static final boolean e = amzo.a();
    public static final boolean f;
    public static final amyx g = new amzl();

    /* Access modifiers changed, original: protected|final */
    public final String h() {
        return "platform: Android";
    }

    static boolean j() {
        boolean z = false;
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            z = amzo.class.getName().equals(amzm.k());
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    static String k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class l() {
        return VMStack.getStackClass2();
    }

    /* Access modifiers changed, original: protected|final */
    public final amyx b() {
        return g;
    }

    /* Access modifiers changed, original: protected|final */
    public final amyr b(String str) {
        if (amzn.b.get() != null) {
            return ((amzj) amzn.b.get()).a(str);
        }
        amyr amzn = new amzn(str.replace('$', '.'));
        amzq.a.offer(amzn);
        if (amzn.b.get() != null) {
            while (true) {
                amzn amzn2 = (amzn) amzq.a.poll();
                if (amzn2 == null) {
                    break;
                }
                amzn2.c = ((amzj) amzn.b.get()).a(amzn2.a());
            }
            amzn.b();
        }
        return amzn;
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null) {
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                z = false;
            }
        }
        f = z;
        Log.class.getName();
    }
}
