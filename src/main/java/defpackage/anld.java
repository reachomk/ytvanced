package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: anld */
final class anld extends anla {
    anld() {
    }

    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    public final void a(Throwable th) {
        th.printStackTrace();
    }

    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
