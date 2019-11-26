package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

public class ThreadUtils {
    private static final Object a = new Object();
    private static Handler b;

    public static Handler a() {
        Handler handler;
        synchronized (a) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public static boolean b() {
        return a().getLooper() == Looper.myLooper();
    }

    public static Looper c() {
        return a().getLooper();
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }
}
