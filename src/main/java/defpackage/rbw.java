package defpackage;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: rbw */
final class rbw extends rbr {
    private final rbu a = new rbu();

    rbw() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.a.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }

    public final void a(Throwable th) {
        ankx.a(th);
        List<Throwable> a = this.a.a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    ankx.a(th2);
                }
            }
        }
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        ankx.a(th, printWriter);
        List<Throwable> a = this.a.a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    ankx.a(th2, printWriter);
                }
            }
        }
    }
}
