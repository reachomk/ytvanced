package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rym */
public final class rym {
    public static ryi a() {
        rze rze = new rze();
        rze.a(null);
        return rze;
    }

    public static ryi a(Exception exception) {
        rze rze = new rze();
        rze.a(exception);
        return rze;
    }

    public static Object a(ryi ryi) {
        pzr.c("Must not be called on the main application thread");
        pzr.a((Object) ryi, (Object) "Task must not be null");
        if (ryi.a()) {
            return rym.b(ryi);
        }
        ryp ryp = new ryp();
        rym.a(ryi, ryp);
        ryp.a.await();
        return rym.b(ryi);
    }

    public static Object a(ryi ryi, long j, TimeUnit timeUnit) {
        pzr.c("Must not be called on the main application thread");
        pzr.a((Object) ryi, (Object) "Task must not be null");
        pzr.a((Object) timeUnit, (Object) "TimeUnit must not be null");
        if (ryi.a()) {
            return rym.b(ryi);
        }
        ryp ryp = new ryp();
        rym.a(ryi, ryp);
        if (ryp.a.await(j, timeUnit)) {
            return rym.b(ryi);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object b(ryi ryi) {
        if (ryi.b()) {
            return ryi.d();
        }
        if (ryi.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(ryi.e());
    }

    private static void a(ryi ryi, ryo ryo) {
        ryi.a(ryk.b, (ryg) ryo);
        ryi.a(ryk.b, (ryh) ryo);
        ryi.a(ryk.b, (ryf) ryo);
    }
}
