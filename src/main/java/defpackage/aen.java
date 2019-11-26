package defpackage;

import android.content.res.Resources.NotFoundException;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: aen */
final class aen implements UncaughtExceptionHandler {
    private final /* synthetic */ UncaughtExceptionHandler a;

    aen(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof NotFoundException) {
            String message = th.getMessage();
            if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(th.getMessage());
                stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(stringBuilder.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
        }
        this.a.uncaughtException(thread, th);
    }
}
