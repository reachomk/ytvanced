package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anbd */
final class anbd implements anbf {
    public static final anbd a = new anbd();

    anbd() {
    }

    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = anbb.a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 42);
        stringBuilder.append("Suppressing exception thrown when closing ");
        stringBuilder.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", stringBuilder.toString(), th2);
    }
}
