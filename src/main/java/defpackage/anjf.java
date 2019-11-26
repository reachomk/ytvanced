package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: anjf */
public final class anjf extends anjq {
    public static anjv a(Object obj) {
        if (obj != null) {
            return new anju(obj);
        }
        return anju.a;
    }

    public static anjv a(Throwable th) {
        amqw.a((Object) th);
        return new anjr(th);
    }

    public static anjv a() {
        return new anjs();
    }

    public static anjv a(anij anij, Executor executor) {
        anku a = anku.a(anij);
        executor.execute(a);
        return a;
    }

    public static anjv a(anjv anjv, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (anjv.isDone()) {
            return anjv;
        }
        ankp ankp = new ankp(anjv);
        anks anks = new anks(ankp);
        ankp.f = scheduledExecutorService.schedule(anks, j, timeUnit);
        anjv.a(anks, aniv.a);
        return ankp;
    }

    public static anjv a(anjv anjv) {
        if (anjv.isDone()) {
            return anjv;
        }
        anjo anjo = new anjo(anjv);
        anjv.a(anjo, aniv.a);
        return anjo;
    }

    public static void a(anjv anjv, anjg anjg, Executor executor) {
        amqw.a((Object) anjg);
        anjv.a(new anjk(anjv, anjg), executor);
    }

    public static Object a(Future future) {
        amqw.b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return ankv.a(future);
    }
}
