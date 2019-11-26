package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bawk */
final class bawk extends basv {
    private static final Logger a = Logger.getLogger(bawk.class.getName());
    private static final ThreadLocal b = new ThreadLocal();

    bawk() {
    }

    public final basr a(basr basr) {
        basr a = a();
        b.set(basr);
        return a;
    }

    public final void a(basr basr, basr basr2) {
        if (a() != basr) {
            a.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (basr2 != basr.b) {
            b.set(basr2);
        } else {
            b.set(null);
        }
    }

    public final basr a() {
        basr basr = (basr) b.get();
        return basr == null ? basr.b : basr;
    }
}
