package defpackage;

import android.os.Looper;

/* renamed from: xak */
public final class xak {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in application's main thread");
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("In application's main thread");
        }
    }
}
