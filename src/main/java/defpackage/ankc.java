package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ankc */
public final class ankc {
    public static Executor a(Executor executor) {
        return new ankj(executor);
    }

    public static anjz a(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof anjz) {
            return (anjz) scheduledExecutorService;
        }
        return new ankg(scheduledExecutorService);
    }

    static Executor a(Executor executor, anhl anhl) {
        amqw.a((Object) executor);
        amqw.a((Object) anhl);
        return executor != aniv.a ? new ankb(executor, anhl) : executor;
    }
}
