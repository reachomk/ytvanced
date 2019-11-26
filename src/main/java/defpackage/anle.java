package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: anle */
final class anle extends anla {
    anle() {
    }

    public final void a(Throwable th, Throwable th2) {
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
