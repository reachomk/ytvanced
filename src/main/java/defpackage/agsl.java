package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agsl */
final /* synthetic */ class agsl implements anim {
    private final amul a;
    private final ScheduledExecutorService b;
    private final amuw c;
    private final anjv d;

    agsl(amul amul, ScheduledExecutorService scheduledExecutorService, amuw amuw, anjv anjv) {
        this.a = amul;
        this.b = scheduledExecutorService;
        this.c = amuw;
        this.d = anjv;
    }

    public final anjv a(Object obj) {
        amul amul = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        return agsi.a(agsi.a((anjv) amul.get(1), 2, scheduledExecutorService), this.c, new agso(this.d, scheduledExecutorService), scheduledExecutorService);
    }
}
