package defpackage;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: alxu */
public final class alxu implements UncaughtExceptionHandler {
    public String a = null;
    public UncaughtExceptionHandler b;

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "\n";
        this.a = Log.getStackTraceString(th).replace(String.valueOf(th.getMessage()).concat(str), str);
        UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
