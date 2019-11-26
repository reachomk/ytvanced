package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agsi */
public final class agsi {
    agsi() {
    }

    public static anjv a(anjv anjv, int i, ScheduledExecutorService scheduledExecutorService) {
        return anic.a(anjv, new agsk(i), (Executor) scheduledExecutorService);
    }

    public static anjv a(anjv anjv, Set set, anim anim, Executor executor) {
        return anhk.a(anjv, Exception.class, new agsj(set, anim), executor);
    }

    public static anjv a(String str, anjv anjv, anjv anjv2, long j, amuw amuw, ScheduledExecutorService scheduledExecutorService, agps agps, amqv amqv, int i) {
        int i2;
        anjv anjv3 = anjv;
        amuw amuw2 = amuw;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        Collection a = amul.a((Object) anjv, (Object) anjv2);
        if (!(a instanceof Collection)) {
            a = amul.a((Iterable) a);
        }
        anjv[] anjvArr = (anjv[]) a.toArray(new anjv[a.size()]);
        anjl anjl = new anjl(anjvArr);
        amuo j2 = amul.j();
        for (i2 = 0; i2 < anjvArr.length; i2++) {
            j2.c(new anjm(anjl));
        }
        amul a2 = j2.a();
        for (i2 = 0; i2 < anjvArr.length; i2++) {
            anjvArr[i2].a(new anjh(anjl, a2, i2), aniv.a);
        }
        long j3 = j;
        anjv a3 = anjf.a(anjf.a(agsi.a(anjv, 0, scheduledExecutorService2)), j, TimeUnit.MILLISECONDS, scheduledExecutorService2);
        amuv amuv = new amuv();
        amuv.b(amuw2);
        amuv.c(TimeoutException.class);
        anjv3 = agsi.a(a3, amuv.a(), new agsh(a2, scheduledExecutorService2, amuw2, anjv), scheduledExecutorService2);
        anjf.a(anjv3, new agsn(amqv, agps, str, i, anjv2, aniv.a), aniv.a);
        return anic.a(anjv3, agsm.a, aniv.a);
    }
}
