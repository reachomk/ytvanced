package defpackage;

import android.os.Looper;

/* renamed from: cro */
public final class cro {
    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
