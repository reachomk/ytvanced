package defpackage;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

/* renamed from: pgz */
final class pgz extends FutureTask {
    private final /* synthetic */ pgy a;

    pgz(pgy pgy, Runnable runnable, Object obj) {
        this.a = pgy;
        super(runnable, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void setException(Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.d;
        if (uncaughtExceptionHandler == null) {
            String str = "GAv4";
            if (Log.isLoggable(str, 6)) {
                String valueOf = String.valueOf(th);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 37);
                stringBuilder.append("MeasurementExecutor: job failed with ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
            }
        } else {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
