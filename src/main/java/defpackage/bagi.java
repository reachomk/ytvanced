package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bagi */
public final class bagi {
    private static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (a.getLooper() != Looper.myLooper()) {
            a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
