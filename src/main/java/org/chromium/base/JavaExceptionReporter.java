package org.chromium.base;

import java.lang.Thread.UncaughtExceptionHandler;

public class JavaExceptionReporter implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    private JavaExceptionReporter(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            this.c = true;
            nativeReportJavaException(this.b, th);
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
