package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: uia */
public final class uia {
    private static Thread a;
    private static volatile Handler b;

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void b() {
        if (uia.a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Handler c() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }
}
