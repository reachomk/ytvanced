package org.chromium.base;

import defpackage.bcid;

public class TraceEvent implements AutoCloseable {
    public static volatile boolean a;

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel(String str);

    private static native void nativeFinishAsync(String str, long j);

    public static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.a) {
                if (EarlyTraceEvent.b()) {
                    EarlyTraceEvent.b = 2;
                    EarlyTraceEvent.c();
                }
            }
        }
        if (a != z) {
            a = z;
            ThreadUtils.c().setMessageLogging(z ? bcid.a : null);
        }
    }

    public final void close() {
        throw null;
    }

    public static void a(String str, String str2) {
        EarlyTraceEvent.a(str);
        if (a) {
            nativeBegin(str, str2);
        }
    }

    public static void a(String str) {
        EarlyTraceEvent.b(str);
        if (a) {
            nativeEnd(str, null);
        }
    }
}
