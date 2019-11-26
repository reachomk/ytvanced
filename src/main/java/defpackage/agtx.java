package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agtx */
final /* synthetic */ class agtx implements anim {
    private final agty a;
    private final String b;
    private final anjv c;
    private final anjv d;
    private final long e;
    private final amuw f;
    private final ScheduledExecutorService g;
    private final agps h;

    agtx(agty agty, String str, anjv anjv, anjv anjv2, long j, amuw amuw, ScheduledExecutorService scheduledExecutorService, agps agps) {
        this.a = agty;
        this.b = str;
        this.c = anjv;
        this.d = anjv2;
        this.e = j;
        this.f = amuw;
        this.g = scheduledExecutorService;
        this.h = agps;
    }

    public final anjv a(Object obj) {
        agty agty = this.a;
        String str = this.b;
        anjv anjv = this.c;
        anjv anjv2 = this.d;
        long j = this.e;
        amuw amuw = this.f;
        ScheduledExecutorService scheduledExecutorService = this.g;
        agps agps = this.h;
        amqp amqp = (amqp) obj;
        if (amqp.a()) {
            agqn agqn = (agqn) amqp.b();
            agql agql = agqn.b;
            if (agql != null ? !(agql.u() && agqn.a.u()) : !agqn.a.u()) {
                return anjv2;
            }
        }
        return agsi.a(str, anjv, anjv2, j, amuw, scheduledExecutorService, agps, agua.a, 2);
    }
}
